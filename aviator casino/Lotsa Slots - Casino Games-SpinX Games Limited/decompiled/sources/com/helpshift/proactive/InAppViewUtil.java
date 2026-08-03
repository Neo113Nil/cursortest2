package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class InAppViewUtil {
    protected static final java.lang.String FALLBACK_BACKGROUND_COLOR = "#FFFFFF";
    protected static final java.lang.String FALLBACK_CROSS_COLOR = "#FF000000";
    protected static final java.lang.String FALLBACK_STROKE_COLOR = "#FF000000";
    protected static final java.lang.String FALLBACK_TEXT_COLOR = "#FF000000";
    protected static final java.lang.String OVERLAY_COLOR = "#99000012";
    private static java.lang.String TAG = "InAppViewUtil";
    private static final java.util.Set<java.lang.String> keyWithUrls = new java.util.HashSet(java.util.Arrays.asList(com.helpshift.proactive.InAppViewConstants.IMAGE_URL, com.helpshift.proactive.InAppViewConstants.REGULAR_URL, com.helpshift.proactive.InAppViewConstants.BOLD_URL, com.helpshift.proactive.InAppViewConstants.ITALICS_URL, com.helpshift.proactive.InAppViewConstants.BOLD_ITALICS_URL));

    protected static boolean parseRadii(android.content.Context context, org.json.JSONArray jSONArray, float[] fArr) throws org.json.JSONException {
        if (jSONArray == null) {
            return false;
        }
        int length = jSONArray.length();
        if (length == 1) {
            java.util.Arrays.fill(fArr, com.helpshift.util.ViewUtil.dpToPx(context, jSONArray.getInt(0)));
            return true;
        }
        if (length != 8) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            if (jSONArray.getInt(i) < 0) {
                fArr[i] = 0.0f;
            } else {
                fArr[i] = com.helpshift.util.ViewUtil.dpToPx(context, r1);
            }
        }
        return true;
    }

    protected static boolean parseMarginOrPadding(org.json.JSONArray jSONArray, int[] iArr) throws org.json.JSONException {
        if (jSONArray == null) {
            return false;
        }
        int length = jSONArray.length();
        if (length == 1) {
            int i = jSONArray.getInt(0);
            for (int i2 = 0; i2 < 4; i2++) {
                iArr[i2] = i;
            }
            return true;
        }
        if (length != 4) {
            return false;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = jSONArray.getInt(i3);
            if (i4 == -1) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4;
            }
        }
        return true;
    }

    protected static void addMarginToView(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, android.view.View view, org.json.JSONObject jSONObject) {
        try {
            int[] iArr = {-1, -1, -1, -1};
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.MARGIN);
            if (optJSONArray == null || !parseMarginOrPadding(optJSONArray, iArr)) {
                return;
            }
            marginLayoutParams.setMarginStart(com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[0]));
            marginLayoutParams.setMarginEnd(com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[2]));
            marginLayoutParams.topMargin = com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[1]);
            marginLayoutParams.bottomMargin = com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[3]);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in adding margin", e);
        }
    }

    protected static void addPaddingToView(android.view.View view, org.json.JSONObject jSONObject) {
        try {
            int[] iArr = {-1, -1, -1, -1};
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.helpshift.proactive.InAppViewConstants.PADDING);
            if (optJSONArray == null || !parseMarginOrPadding(optJSONArray, iArr)) {
                return;
            }
            view.setPaddingRelative(com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[0]), com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[1]), com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[2]), com.helpshift.util.ViewUtil.dpToPx(view.getContext(), iArr[3]));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in adding padding", e);
        }
    }

    public static int resolveDimension(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (com.helpshift.util.ViewUtil.isTablet(context) && com.helpshift.util.Utils.isNotEmpty(str2)) {
            return com.helpshift.util.ViewUtil.dpToPx(context, java.lang.Integer.parseInt(str2));
        }
        return resolveDimension(context, java.lang.String.valueOf(str));
    }

    public static int resolveDimension(android.content.Context context, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str) || "wrap_content".equalsIgnoreCase(str)) {
                return -2;
            }
            if ("match_parent".equalsIgnoreCase(str)) {
                return -1;
            }
            return com.helpshift.util.ViewUtil.dpToPx(context, java.lang.Integer.parseInt(str));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting dimension", e);
            return -2;
        }
    }

    protected static void setMaxWidthAndHeight(android.widget.TextView textView, org.json.JSONObject jSONObject) {
        try {
            if (com.helpshift.util.Utils.isNotEmpty(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH))) {
                textView.setMaxWidth(resolveDimension(textView.getContext(), jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, "")));
            }
            if (com.helpshift.util.Utils.isNotEmpty(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT))) {
                textView.setMaxHeight(resolveDimension(textView.getContext(), jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT, "")));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting max width and height", e);
        }
    }

    protected static void setMaxWidthAndHeight(android.widget.ImageView imageView, org.json.JSONObject jSONObject) {
        try {
            if (com.helpshift.util.Utils.isNotEmpty(jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH))) {
                imageView.setMaxWidth(resolveDimension(imageView.getContext(), jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_WIDTH, "")));
            }
            java.lang.String optString = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MAX_HEIGHT);
            if (com.helpshift.util.Utils.isNotEmpty(optString)) {
                imageView.setMaxHeight(resolveDimension(imageView.getContext(), optString));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting max width and height", e);
        }
    }

    protected static void setMinWidthAndHeight(android.view.View view, org.json.JSONObject jSONObject) {
        try {
            java.lang.String optString = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MIN_WIDTH);
            if (com.helpshift.util.Utils.isNotEmpty(optString)) {
                view.setMinimumWidth(resolveDimension(view.getContext(), optString));
            }
            java.lang.String optString2 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.MIN_HEIGHT);
            if (com.helpshift.util.Utils.isNotEmpty(optString2)) {
                view.setMinimumHeight(resolveDimension(view.getContext(), optString2));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting max width and height", e);
        }
    }

    protected static int getGravity(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 17;
        }
        if ("left".equalsIgnoreCase(str)) {
            return androidx.core.view.GravityCompat.START;
        }
        if ("right".equalsIgnoreCase(str)) {
            return androidx.core.view.GravityCompat.END;
        }
        if ("top".equalsIgnoreCase(str)) {
            return 49;
        }
        return com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM.equalsIgnoreCase(str) ? 81 : 17;
    }

    protected static android.widget.ImageView.ScaleType getScaleTypeForImage(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if ("fill".equalsIgnoreCase(str)) {
            return android.widget.ImageView.ScaleType.FIT_XY;
        }
        if ("crop".equalsIgnoreCase(str)) {
            return android.widget.ImageView.ScaleType.CENTER_CROP;
        }
        return android.widget.ImageView.ScaleType.FIT_CENTER;
    }

    protected static com.helpshift.proactive.GifView.ScaleType getScaleTypeForGif(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return com.helpshift.proactive.GifView.ScaleType.FIT_CENTER;
        }
        if ("fill".equalsIgnoreCase(str)) {
            return com.helpshift.proactive.GifView.ScaleType.FIT_XY;
        }
        if ("crop".equalsIgnoreCase(str)) {
            return com.helpshift.proactive.GifView.ScaleType.CENTER_CROP;
        }
        return com.helpshift.proactive.GifView.ScaleType.FIT_CENTER;
    }

    protected static void setTextAlignment(android.view.View view, java.lang.String str) {
        if ("right".equalsIgnoreCase(str)) {
            view.setTextAlignment(6);
        } else if ("left".equalsIgnoreCase(str)) {
            view.setTextAlignment(5);
        } else {
            view.setTextAlignment(4);
        }
    }

    protected static void animateSlideDown(android.view.ViewGroup viewGroup) {
        viewGroup.setAlpha(0.0f);
        viewGroup.setTranslationY(-800.0f);
        viewGroup.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setInterpolator(new android.view.animation.DecelerateInterpolator()).start();
    }

    protected static void animateSlideUp(android.view.ViewGroup viewGroup) {
        viewGroup.setAlpha(0.0f);
        viewGroup.setTranslationY(800.0f);
        viewGroup.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setInterpolator(new android.view.animation.DecelerateInterpolator()).start();
    }

    protected static void animateScaleIn(android.view.ViewGroup viewGroup) {
        viewGroup.setScaleX(0.8f);
        viewGroup.setScaleY(0.8f);
        viewGroup.setAlpha(0.0f);
        viewGroup.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(600L).setInterpolator(new android.view.animation.OvershootInterpolator()).start();
    }

    protected static void dismissWithSlideUpAnimation(android.view.View view, java.lang.Runnable runnable) {
        view.animate().translationY(-view.getHeight()).alpha(0.0f).setDuration(500L).withEndAction(runnable).start();
    }

    protected static void dismissWithSlideDownAnimation(android.view.View view, java.lang.Runnable runnable) {
        view.animate().translationY(800.0f).alpha(0.0f).setDuration(500L).withEndAction(runnable).start();
    }

    protected static void dismissWithScaleOutAnimation(android.view.View view, java.lang.Runnable runnable) {
        view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(500L).withEndAction(runnable).start();
    }

    public static void parseProactiveDataAndGetURLs(org.json.JSONObject jSONObject, java.util.Set<java.lang.String> set) {
        extractUrlsFromJsonObject(jSONObject, set);
    }

    private static void extractUrlsFromJsonObject(java.lang.Object obj, java.util.Set<java.lang.String> set) {
        try {
            if (obj instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object opt = jSONObject.opt(next);
                    if (keyWithUrls.contains(next) && (opt instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.String) opt)) {
                        set.add((java.lang.String) opt);
                    }
                    if ((opt instanceof org.json.JSONObject) || (opt instanceof org.json.JSONArray)) {
                        extractUrlsFromJsonObject(opt, set);
                    }
                }
                return;
            }
            if (obj instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    extractUrlsFromJsonObject(jSONArray.opt(i), set);
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error is extracting URLs", e);
        }
    }

    protected static android.graphics.Bitmap getBitmapForImage(android.content.Context context, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, java.lang.String str, java.util.Map<java.lang.String, java.io.File> map) {
        if (com.helpshift.util.Utils.isNotEmpty(str) && map.containsKey(str) && map.get(str) != null && map.get(str).exists()) {
            return android.graphics.BitmapFactory.decodeFile(map.get(str).getAbsolutePath());
        }
        int intValue = ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(com.helpshift.util.JsonUtils.jsonStringToMap(hSPersistentStorage.getProactivePushNotificationDefaults()), "largeNotificationIconId", 0)).intValue();
        if (intValue == 0) {
            return null;
        }
        return android.graphics.BitmapFactory.decodeResource(context.getResources(), intValue);
    }

    public static void setImageForLayout(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, final android.widget.LinearLayout linearLayout, final org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.io.File> map, int i, final int i2, final com.helpshift.proactive.OnGlobalLayoutCallback onGlobalLayoutCallback) {
        try {
            if (jSONObject.has(com.helpshift.proactive.InAppViewConstants.IMAGE_URL)) {
                java.lang.String optString = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.BACKGROUND);
                final android.graphics.Bitmap bitmapForImage = getBitmapForImage(linearLayout.getContext(), hSPersistentStorage, jSONObject.optString(com.helpshift.proactive.InAppViewConstants.IMAGE_URL), map);
                if (bitmapForImage == null) {
                    linearLayout.setBackgroundColor(com.helpshift.util.ViewUtil.parseColor(optString, FALLBACK_BACKGROUND_COLOR));
                    return;
                }
                final int dpToPx = com.helpshift.util.ViewUtil.dpToPx(linearLayout.getContext(), jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.RADIUS, 0));
                final int dpToPx2 = com.helpshift.util.ViewUtil.dpToPx(linearLayout.getContext(), jSONObject.optInt(com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, 0));
                final java.lang.String optString2 = jSONObject.optString(com.helpshift.proactive.InAppViewConstants.STROKE_COLOR, "#FF000000");
                if (hasIntrinsicSizeAvailable(i, i2, jSONObject)) {
                    linearLayout.setBackground(createRoundedBitmapDrawable(linearLayout.getContext(), bitmapForImage, i, jSONObject.has("aspectRatio") ? (int) (i / jSONObject.optDouble("aspectRatio", 1.0d)) : i2, dpToPx, optString2, dpToPx2));
                    return;
                }
                final float optDouble = (float) jSONObject.optDouble("aspectRatio");
                android.view.ViewTreeObserver.OnGlobalLayoutListener safeWrapOnGlobalLayout = new com.helpshift.util.SafeWrapOnGlobalLayout(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.helpshift.proactive.InAppViewUtil.1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int width = linearLayout.getWidth();
                        int i3 = i2;
                        if (jSONObject.has("aspectRatio")) {
                            i3 = (int) (width / optDouble);
                        } else if (!com.helpshift.util.ViewUtil.hasIntrinsicSize(i3)) {
                            i3 = linearLayout.getHeight();
                        }
                        int i4 = i3;
                        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        layoutParams.height = i4;
                        linearLayout.setBackground(com.helpshift.proactive.InAppViewUtil.createRoundedBitmapDrawable(linearLayout.getContext(), bitmapForImage, width, i4, dpToPx, optString2, dpToPx2));
                        linearLayout.setLayoutParams(layoutParams);
                        onGlobalLayoutCallback.onSuccess(width, i4);
                    }
                });
                linearLayout.setTag(safeWrapOnGlobalLayout);
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(safeWrapOnGlobalLayout);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting image", e);
        }
    }

    private static boolean hasIntrinsicSizeAvailable(int i, int i2, org.json.JSONObject jSONObject) {
        return com.helpshift.util.ViewUtil.hasIntrinsicSize(i) && (jSONObject.has("aspectRatio") || com.helpshift.util.ViewUtil.hasIntrinsicSize(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.graphics.drawable.BitmapDrawable createRoundedBitmapDrawable(android.content.Context context, android.graphics.Bitmap bitmap, int i, int i2, int i3, java.lang.String str, int i4) {
        float f = i3;
        return new android.graphics.drawable.BitmapDrawable(context.getResources(), com.helpshift.util.ViewUtil.clipBitmapWithCornersRadiiAndStroke(android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, true), f, f, f, f, android.graphics.Color.parseColor(str), i4));
    }

    protected static void addCircularRippleEffect(android.view.View view) {
        android.content.Context context = view.getContext();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorControlHighlight, typedValue, true);
        int i = typedValue.data;
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        view.setBackground(new android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(i), null, shapeDrawable));
    }

    protected static void setRippleEffect(android.view.View view, int i) {
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(1073741824);
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(com.helpshift.util.ViewUtil.dpToPx(view.getContext(), i));
        gradientDrawable.setColor(-1);
        view.setBackground(new android.graphics.drawable.RippleDrawable(valueOf, background, gradientDrawable));
    }

    protected static void addStrokeToCanvas(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i) {
        if (paint == null) {
            return;
        }
        android.graphics.RectF rectF = new android.graphics.RectF(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f, f - (paint.getStrokeWidth() / 2.0f), f2 - (paint.getStrokeWidth() / 2.0f));
        android.graphics.Path path = new android.graphics.Path();
        float f3 = i;
        path.addRoundRect(rectF, new float[]{f3, f3, f3, f3, f3, f3, f3, f3}, android.graphics.Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    protected static void clipCanvasToRoundedRect(android.graphics.Canvas canvas, float[] fArr, float f, float f2) {
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, f, f2), fArr, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
    }

    protected static void setVisibilityForView(android.view.View view, java.lang.String str) {
        if ("gone".equalsIgnoreCase(str)) {
            view.setVisibility(8);
        } else if ("invisible".equalsIgnoreCase(str)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    public static void applyFontsToText(android.widget.TextView textView, java.lang.String str, com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, java.util.Map<java.lang.String, java.io.File> map) {
        android.text.Spanned fromHtml;
        android.graphics.Typeface typeface;
        android.text.style.StyleSpan[] styleSpanArr;
        try {
            android.graphics.Typeface typeface2 = getTypeface(map, proactiveInappNotification.regularFontUrl);
            android.graphics.Typeface typeface3 = getTypeface(map, proactiveInappNotification.italicsFontUrl);
            android.graphics.Typeface typeface4 = getTypeface(map, proactiveInappNotification.boldFontUrl);
            android.graphics.Typeface typeface5 = getTypeface(map, proactiveInappNotification.boldItalicsFontUrl);
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                fromHtml = android.text.Html.fromHtml(str, 63);
            } else {
                fromHtml = android.text.Html.fromHtml(str);
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(fromHtml);
            android.text.style.StyleSpan[] styleSpanArr2 = (android.text.style.StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), android.text.style.StyleSpan.class);
            int length = spannableStringBuilder.length();
            int i = 0;
            while (i < length) {
                boolean z = false;
                boolean z2 = false;
                for (android.text.style.StyleSpan styleSpan : styleSpanArr2) {
                    int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
                    int style = styleSpan.getStyle();
                    if (i >= spanStart && i < spanEnd) {
                        if (style == 1) {
                            z = true;
                        }
                        if (style == 2) {
                            z2 = true;
                        }
                    }
                }
                int i2 = i + 1;
                while (true) {
                    if (i2 >= length) {
                        typeface = typeface5;
                        styleSpanArr = styleSpanArr2;
                        break;
                    }
                    int length2 = styleSpanArr2.length;
                    int i3 = 0;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (i3 < length2) {
                        android.text.style.StyleSpan styleSpan2 = styleSpanArr2[i3];
                        android.graphics.Typeface typeface6 = typeface5;
                        int spanStart2 = spannableStringBuilder.getSpanStart(styleSpan2);
                        android.text.style.StyleSpan[] styleSpanArr3 = styleSpanArr2;
                        int spanEnd2 = spannableStringBuilder.getSpanEnd(styleSpan2);
                        int style2 = styleSpan2.getStyle();
                        if (i2 >= spanStart2 && i2 < spanEnd2) {
                            if (style2 == 1) {
                                z3 = true;
                            }
                            if (style2 == 2) {
                                z4 = true;
                            }
                        }
                        i3++;
                        typeface5 = typeface6;
                        styleSpanArr2 = styleSpanArr3;
                    }
                    typeface = typeface5;
                    styleSpanArr = styleSpanArr2;
                    if (z3 != z || z4 != z2) {
                        break;
                    }
                    i2++;
                    typeface5 = typeface;
                    styleSpanArr2 = styleSpanArr;
                }
                android.graphics.Typeface typeface7 = (z && z2) ? typeface : z ? typeface3 : z2 ? typeface4 : typeface2;
                if (typeface7 != null) {
                    spannableStringBuilder.setSpan(new com.helpshift.proactive.CustomTypefaceSpan(typeface7), i, i2, 33);
                }
                i = i2;
                typeface5 = typeface;
                styleSpanArr2 = styleSpanArr;
            }
            textView.setText(spannableStringBuilder);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting fonts to text", e);
        }
    }

    private static android.graphics.Typeface getTypeface(java.util.Map<java.lang.String, java.io.File> map, java.lang.String str) {
        java.io.File file;
        if (!android.text.TextUtils.isEmpty(str) && (file = map.get(str)) != null && file.exists()) {
            try {
                return android.graphics.Typeface.createFromFile(file);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in getting typeface", e);
            }
        }
        return null;
    }
}
