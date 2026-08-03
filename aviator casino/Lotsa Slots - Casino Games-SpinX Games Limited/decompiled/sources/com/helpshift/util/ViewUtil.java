package com.helpshift.util;

/* loaded from: classes5.dex */
public class ViewUtil {
    private static final java.lang.String TAG = "ViewUtil";

    public static boolean hasIntrinsicSize(int i) {
        return (i == -2 || i == -1) ? false : true;
    }

    private ViewUtil() {
    }

    public static void setVisibility(android.view.View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static void setStatusBarColor(android.app.Activity activity, java.lang.String str, android.view.View view) {
        int currentOSAPILevel = com.helpshift.AndroidOSUtil.currentOSAPILevel();
        if (activity == null || currentOSAPILevel < 21) {
            return;
        }
        try {
            int statusBarColor = getStatusBarColor(str);
            if (currentOSAPILevel < 35) {
                activity.getWindow().setStatusBarColor(statusBarColor);
            } else if (view != null) {
                view.setBackgroundColor(statusBarColor);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error setting status bar color", e);
        }
    }

    public static boolean isEdgeToEdgeOptedOut(android.content.Context context) {
        try {
            if (android.os.Build.VERSION.SDK_INT == 35) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                if (context.getTheme().resolveAttribute(android.R.attr.windowOptOutEdgeToEdgeEnforcement, typedValue, true)) {
                    return typedValue.data != 0;
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in checking edge to edge opt out", e);
        }
        return false;
    }

    private static int getStatusBarColor(java.lang.String str) {
        int parseColor = android.graphics.Color.parseColor(com.helpshift.util.ConfigValues.DEFAULT_STATUSBAR_COLOR);
        if (!com.helpshift.util.Utils.isNotEmpty(str) || !com.helpshift.util.JsonUtils.isValidJsonString(str)) {
            return parseColor;
        }
        try {
            return android.graphics.Color.parseColor(new org.json.JSONObject(str).optString("primaryColor", com.helpshift.util.ConfigValues.DEFAULT_STATUSBAR_COLOR));
        } catch (org.json.JSONException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting status bar color", e);
            return parseColor;
        }
    }

    public static void callJavascriptCode(android.webkit.WebView webView, java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() >= 19) {
            webView.evaluateJavascript(str, valueCallback);
            return;
        }
        webView.loadUrl("javascript:" + str);
    }

    public static android.net.Uri[] parseResultForFileFromWebView(android.content.Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            return android.webkit.WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
        return getUrisForMultipleFilesFromIntent(intent);
    }

    private static android.net.Uri[] getUrisForMultipleFilesFromIntent(android.content.Intent intent) {
        android.content.ClipData clipData = intent != null ? intent.getClipData() : null;
        if (clipData == null) {
            return new android.net.Uri[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < clipData.getItemCount(); i++) {
            android.net.Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return (android.net.Uri[]) arrayList.toArray(new android.net.Uri[0]);
    }

    public static void handleEdgeToEdgeLayout(android.view.View view, android.view.View view2) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 35) {
                view2.setVisibility(8);
                return;
            }
            view2.setVisibility(0);
            view2.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.helpshift.util.ViewUtil$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view3, android.view.WindowInsets windowInsets) {
                    return com.helpshift.util.ViewUtil.lambda$handleEdgeToEdgeLayout$0(view3, windowInsets);
                }
            });
            view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.helpshift.util.ViewUtil$$ExternalSyntheticLambda1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view3, android.view.WindowInsets windowInsets) {
                    return com.helpshift.util.ViewUtil.lambda$handleEdgeToEdgeLayout$1(view3, windowInsets);
                }
            });
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in handling edge to edge layout", e);
        }
    }

    static /* synthetic */ android.view.WindowInsets lambda$handleEdgeToEdgeLayout$0(android.view.View view, android.view.WindowInsets windowInsets) {
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.statusBars());
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = insets.top;
        view.setLayoutParams(layoutParams);
        return windowInsets.consumeSystemWindowInsets();
    }

    static /* synthetic */ android.view.WindowInsets lambda$handleEdgeToEdgeLayout$1(android.view.View view, android.view.WindowInsets windowInsets) {
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars() | android.view.WindowInsets.Type.displayCutout() | android.view.WindowInsets.Type.ime());
        view.setPadding(insets.left, 0, insets.right, insets.bottom);
        return windowInsets;
    }

    public static int dpToPx(android.content.Context context, int i) {
        return java.lang.Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    public static boolean isDeviceInLandscape(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static android.graphics.Bitmap clipBitmapWithCornersRadiiAndStroke(android.graphics.Bitmap bitmap, float f, float f2, float f3, float f4, int i, int i2) {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), fArr, android.graphics.Path.Direction.CW);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        canvas.drawPath(path, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (i2 > 0) {
            android.graphics.Paint paint2 = new android.graphics.Paint(1);
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            float f5 = i2;
            paint2.setStrokeWidth(f5);
            paint2.setColor(i);
            float f6 = f5 / 2.0f;
            android.graphics.RectF rectF = new android.graphics.RectF(f6, f6, bitmap.getWidth() - f6, bitmap.getHeight() - f6);
            android.graphics.Path path2 = new android.graphics.Path();
            path2.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
            canvas.drawPath(path2, paint2);
        }
        return createBitmap;
    }

    public static int parseColor(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return android.graphics.Color.parseColor(str2);
        }
        return android.graphics.Color.parseColor(str);
    }

    public static boolean isTablet(android.content.Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error checking device type", e);
            return false;
        }
    }

    public static boolean performAncestorClick(android.view.View view) {
        try {
            java.lang.Object parent = view.getParent();
            while (parent != null && (parent instanceof android.view.View)) {
                android.view.View view2 = (android.view.View) parent;
                if (view2.hasOnClickListeners()) {
                    view2.performClick();
                    return true;
                }
                parent = view2.getParent();
            }
            return false;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error delegating click to ancestor", e);
            return false;
        }
    }
}
