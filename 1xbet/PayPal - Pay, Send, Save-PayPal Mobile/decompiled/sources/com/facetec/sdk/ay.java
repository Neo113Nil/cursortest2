package com.facetec.sdk;

/* loaded from: classes8.dex */
class ay {

    /* renamed from: a, reason: collision with root package name */
    private static /* synthetic */ boolean f3408a = true;

    static void a() {
    }

    ay() {
    }

    static float b(int i) {
        return i / (com.facetec.sdk.dp.d().densityDpi / 160.0f);
    }

    static float d(int i) {
        return android.util.TypedValue.applyDimension(1, i, com.facetec.sdk.dp.d());
    }

    static float c(int i) {
        return android.util.TypedValue.applyDimension(2, i, com.facetec.sdk.dp.d());
    }

    static java.lang.String e(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(((android.content.pm.PackageItemInfo) context.getApplicationInfo()).packageName, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (java.lang.String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    static void c(android.app.Activity activity) {
        android.view.View findViewById = activity.findViewById(com.facetec.sdk.R.id.backgroundColor);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
    }

    static void c(android.view.View view) {
        androidx.core.view.ViewCompat.setAccessibilityDelegate(view, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.facetec.sdk.ay.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(android.view.View view2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setClickable(false);
            }
        });
    }

    static java.lang.String a(int i, int i2) {
        return com.facetec.sdk.bn.e(d(i, i2));
    }

    static byte[] d(int i, int i2) {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        if (i2 != 0) {
            i += secureRandom.nextInt(i2 + 1);
        }
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    static java.lang.String c(java.lang.String str) {
        return str == null ? "Unknown Error" : str;
    }

    static android.view.WindowManager a(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return ((android.app.Activity) context).getWindowManager();
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        if (f3408a || windowManager != null) {
            return windowManager;
        }
        throw new java.lang.AssertionError();
    }

    static int b(android.content.Context context) {
        int rotation = a(context).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            return rotation != 2 ? rotation != 3 ? 1 : 8 : (android.os.Build.MODEL.contains("Mi MIX 2") || android.os.Build.MODEL.contains("RCT6773W22BM")) ? 1 : 9;
        }
        return 0;
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static int f3409a;
        public static int d;
        private int c;
        private int e;

        d(int i, int i2) {
            this.e = i;
            this.c = i2;
        }

        final int e() {
            return this.e;
        }

        final int c() {
            return this.c;
        }

        public static int a() {
            int i = d;
            d = i + 1;
            if (i % 7996003 != 0) {
                return f3409a;
            }
            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
            f3409a = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    static com.facetec.sdk.ay.d b(java.lang.String str, int i, android.graphics.Typeface typeface) {
        return c(str, i, typeface, new android.graphics.Paint());
    }

    private static com.facetec.sdk.ay.d c(java.lang.String str, int i, android.graphics.Typeface typeface, android.graphics.Paint paint) {
        paint.setTextSize(i);
        paint.setTypeface(typeface);
        paint.setFlags(1);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int round = java.lang.Math.round(paint.measureText(str));
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new com.facetec.sdk.ay.d(round, java.lang.Math.round(fontMetrics.descent - fontMetrics.ascent));
    }

    static int c(android.widget.TextView textView, com.facetec.sdk.ay.d dVar, int i, int i2) {
        int ceil;
        android.graphics.Typeface typeface = textView.getTypeface();
        java.lang.String obj = textView.getText().toString();
        if (obj.contains(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE)) {
            obj = obj.substring(0, obj.indexOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE));
        }
        int i3 = i2 - i;
        android.graphics.Paint paint = new android.graphics.Paint();
        do {
            i3--;
            ceil = (int) java.lang.Math.ceil((i2 + i) / 2.0d);
            com.facetec.sdk.ay.d c = c(obj, ceil, typeface, paint);
            if (c.e() > dVar.e() || c.c() > dVar.c()) {
                i2 = ceil - 1;
            } else {
                i = ceil;
            }
            if (i == i2) {
                break;
            }
        } while (i3 > 0);
        return ceil - 1;
    }

    static android.app.Fragment a(android.app.Activity activity) {
        android.app.FragmentManager fragmentManager;
        java.util.List<android.app.Fragment> fragments;
        if (activity != null && (fragmentManager = activity.getFragmentManager()) != null && (fragments = fragmentManager.getFragments()) != null) {
            for (android.app.Fragment fragment : fragments) {
                if (fragment != null && fragment.isVisible()) {
                    return fragment;
                }
            }
        }
        return null;
    }

    static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat e(android.content.Context context, int i) {
        try {
            return (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(context, i).mutate();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static android.animation.ValueAnimator c(final android.view.View view, int i, int i2) {
        final android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.d(view, ofObject, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(android.view.View view, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        if (view != null) {
            view.setBackgroundColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            view.invalidate();
        }
    }

    static android.animation.ValueAnimator e(final java.util.List<android.graphics.drawable.Drawable> list, final java.util.List<android.view.View> list2, int i, int i2) {
        if (!f3408a && list.size() != list2.size()) {
            throw new java.lang.AssertionError();
        }
        final android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.e(list, list2, ofObject, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(java.util.List list, java.util.List list2, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        for (int i = 0; i < list.size(); i++) {
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) list.get(i);
            android.view.View view = (android.view.View) list2.get(i);
            if (view != null && view.getBackground() != null && drawable != null) {
                com.facetec.sdk.dp.b(view.getContext(), drawable, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                view.setBackground(drawable);
            }
        }
    }

    static android.animation.ValueAnimator d(final android.graphics.Paint paint, final android.view.View view, int i, int i2) {
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.e(paint, view, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(android.graphics.Paint paint, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        if (paint != null) {
            paint.setColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            if (view != null) {
                view.postInvalidateOnAnimation();
            }
        }
    }

    static android.animation.ValueAnimator d(final java.util.List<android.view.View> list, final android.graphics.drawable.GradientDrawable gradientDrawable, final int i, int i2, int i3) {
        final android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.e(gradientDrawable, i, ofObject, list, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(android.graphics.drawable.GradientDrawable gradientDrawable, int i, android.animation.ValueAnimator valueAnimator, java.util.List list, android.animation.ValueAnimator valueAnimator2) {
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(i, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            android.view.View view = (android.view.View) list.get(i2);
            if (view != null && gradientDrawable != null) {
                view.setBackground(gradientDrawable);
            }
        }
    }

    static android.animation.ValueAnimator d(final java.util.List<android.widget.TextView> list, int i, int i2) {
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.d(list, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(java.util.List list, android.animation.ValueAnimator valueAnimator) {
        for (int i = 0; i < list.size(); i++) {
            android.widget.TextView textView = (android.widget.TextView) list.get(i);
            if (textView != null) {
                textView.setTextColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }
    }

    static android.animation.ValueAnimator a(final android.graphics.drawable.Drawable drawable, final android.view.View view, int i, int i2) {
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.e(drawable, view, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(android.graphics.drawable.Drawable drawable, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        if (drawable == null) {
            return;
        }
        com.facetec.sdk.dp.e(drawable, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        if (view != null) {
            view.postInvalidateOnAnimation();
        }
    }

    static android.animation.ValueAnimator e(final android.widget.ImageView imageView, int i, int i2) {
        final android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        ofObject.setDuration(1000L);
        ofObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.ay$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facetec.sdk.ay.e(imageView, ofObject, valueAnimator);
            }
        });
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(android.widget.ImageView imageView, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        if (imageView != null) {
            imageView.setColorFilter(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }

    static boolean e(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        android.graphics.Bitmap e = e(drawable);
        android.graphics.Bitmap e2 = e(drawable2);
        if (e.getWidth() == e2.getWidth() && e.getHeight() == e2.getHeight()) {
            return java.util.Arrays.equals(b(e), b(e2));
        }
        return false;
    }

    private static android.graphics.Bitmap e(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static byte[] b(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    static boolean b(android.app.Activity activity) {
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    static boolean e(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (java.util.Locale.getDefault().getLanguage().contains(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean d(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (android.os.Build.MODEL.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
