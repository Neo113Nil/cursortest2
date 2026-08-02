package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public abstract class Utils {
    public static final double DEG2RAD = 0.017453292519943295d;
    public static final float FDEG2RAD = 0.017453292f;
    private static android.util.DisplayMetrics getInputSizeshNQ4ISI = null;
    private static int getOutputMinFrameDuration = 8000;
    private static int getOutputSizeshNQ4ISI = 50;
    public static final double DOUBLE_EPSILON = java.lang.Double.longBitsToDouble(1);
    public static final float FLOAT_EPSILON = java.lang.Float.intBitsToFloat(1);
    private static android.graphics.Rect getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
    private static android.graphics.Paint.FontMetrics getHighSpeedVideoSizesFor = new android.graphics.Paint.FontMetrics();
    private static android.graphics.Rect Camera2StreamConfigurationMap = new android.graphics.Rect();
    private static final int[] getHighSpeedVideoFpsRanges = {1, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};
    private static com.github.mikephil.charting.formatter.ValueFormatter getHighResolutionOutputSizeshNQ4ISI = new com.github.mikephil.charting.formatter.DefaultValueFormatter(1);
    private static android.graphics.Rect getInputFormats = new android.graphics.Rect();
    private static android.graphics.Rect getHighSpeedVideoSizes = new android.graphics.Rect();
    private static android.graphics.Paint.FontMetrics getOutputFormats = new android.graphics.Paint.FontMetrics();

    public static float getNormalizedAngle(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }

    public static void init(android.content.Context context) {
        if (context == null) {
            getOutputSizeshNQ4ISI = android.view.ViewConfiguration.getMinimumFlingVelocity();
            getOutputMinFrameDuration = android.view.ViewConfiguration.getMaximumFlingVelocity();
        } else {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            getOutputSizeshNQ4ISI = viewConfiguration.getScaledMinimumFlingVelocity();
            getOutputMinFrameDuration = viewConfiguration.getScaledMaximumFlingVelocity();
            getInputSizeshNQ4ISI = context.getResources().getDisplayMetrics();
        }
    }

    @java.lang.Deprecated
    public static void init(android.content.res.Resources resources) {
        getInputSizeshNQ4ISI = resources.getDisplayMetrics();
        getOutputSizeshNQ4ISI = android.view.ViewConfiguration.getMinimumFlingVelocity();
        getOutputMinFrameDuration = android.view.ViewConfiguration.getMaximumFlingVelocity();
    }

    public static float convertDpToPixel(float f) {
        android.util.DisplayMetrics displayMetrics = getInputSizeshNQ4ISI;
        return displayMetrics == null ? f : f * displayMetrics.density;
    }

    public static float convertPixelsToDp(float f) {
        android.util.DisplayMetrics displayMetrics = getInputSizeshNQ4ISI;
        return displayMetrics == null ? f : f / displayMetrics.density;
    }

    public static int calcTextWidth(android.graphics.Paint paint, java.lang.String str) {
        return (int) paint.measureText(str);
    }

    public static int calcTextHeight(android.graphics.Paint paint, java.lang.String str) {
        android.graphics.Rect rect = getHighSpeedVideoFpsRangesFor;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float getLineHeight(android.graphics.Paint paint) {
        return getLineHeight(paint, getHighSpeedVideoSizesFor);
    }

    public static float getLineHeight(android.graphics.Paint paint, android.graphics.Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float getLineSpacing(android.graphics.Paint paint) {
        return getLineSpacing(paint, getHighSpeedVideoSizesFor);
    }

    public static float getLineSpacing(android.graphics.Paint paint, android.graphics.Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static com.github.mikephil.charting.utils.FSize calcTextSize(android.graphics.Paint paint, java.lang.String str) {
        com.github.mikephil.charting.utils.FSize fSize = com.github.mikephil.charting.utils.FSize.getInstance(0.0f, 0.0f);
        calcTextSize(paint, str, fSize);
        return fSize;
    }

    public static void calcTextSize(android.graphics.Paint paint, java.lang.String str, com.github.mikephil.charting.utils.FSize fSize) {
        android.graphics.Rect rect = Camera2StreamConfigurationMap;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        fSize.width = rect.width();
        fSize.height = rect.height();
    }

    public static com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static java.lang.String formatNumber(float f, int i, boolean z) {
        return formatNumber(f, i, z, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    }

    public static java.lang.String formatNumber(float f, int i, boolean z, char c) {
        boolean z2;
        float f2 = f;
        char[] cArr = new char[35];
        if (f2 == 0.0f) {
            return "0";
        }
        int i2 = 0;
        boolean z3 = f2 < 1.0f && f2 > -1.0f;
        if (f2 < 0.0f) {
            f2 = -f2;
            z2 = true;
        } else {
            z2 = false;
        }
        int[] iArr = getHighSpeedVideoFpsRanges;
        int length = i > iArr.length ? iArr.length - 1 : i;
        long round = java.lang.Math.round(f2 * iArr[length]);
        int i3 = 34;
        boolean z4 = false;
        while (true) {
            if (round == 0 && i2 >= length + 1) {
                break;
            }
            boolean z5 = z4;
            int i4 = (int) (round % 10);
            round /= 10;
            int i5 = i3 - 1;
            cArr[i3] = (char) (i4 + 48);
            int i6 = i2 + 1;
            if (i6 == length) {
                i3 -= 2;
                cArr[i5] = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA;
                i2 += 2;
                z4 = true;
            } else {
                if (z && round != 0 && i6 > length) {
                    if (z5) {
                        if ((i6 - length) % 4 == 0) {
                            i3 -= 2;
                            cArr[i5] = c;
                            i2 += 2;
                            z4 = z5;
                        }
                    } else if ((i6 - length) % 4 == 3) {
                        i3 -= 2;
                        cArr[i5] = c;
                        i2 += 2;
                        z4 = z5;
                    }
                }
                i2 = i6;
                i3 = i5;
                z4 = z5;
            }
        }
        if (z3) {
            cArr[i3] = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            i2++;
            i3--;
        }
        if (z2) {
            cArr[i3] = '-';
            i2++;
        }
        int i7 = 35 - i2;
        return java.lang.String.valueOf(cArr, i7, 35 - i7);
    }

    public static float roundToNextSignificant(double d) {
        if (java.lang.Double.isInfinite(d) || java.lang.Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        return java.lang.Math.round(d * r0) / ((float) java.lang.Math.pow(10.0d, 1 - ((int) java.lang.Math.ceil((float) java.lang.Math.log10(d < 0.0d ? -d : d)))));
    }

    public static int getDecimals(float f) {
        float roundToNextSignificant = roundToNextSignificant(f);
        if (java.lang.Float.isInfinite(roundToNextSignificant)) {
            return 0;
        }
        return ((int) java.lang.Math.ceil(-java.lang.Math.log10(roundToNextSignificant))) + 2;
    }

    public static int[] convertIntegers(java.util.List<java.lang.Integer> list) {
        int[] iArr = new int[list.size()];
        copyIntegers(list, iArr);
        return iArr;
    }

    public static void copyIntegers(java.util.List<java.lang.Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i = 0; i < length; i++) {
            iArr[i] = list.get(i).intValue();
        }
    }

    public static java.lang.String[] convertStrings(java.util.List<java.lang.String> list) {
        int size = list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    public static void copyStrings(java.util.List<java.lang.String> list, java.lang.String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i = 0; i < length; i++) {
            strArr[i] = list.get(i);
        }
    }

    public static double nextUp(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return java.lang.Double.longBitsToDouble(java.lang.Double.doubleToRawLongBits(d2) + (d2 >= 0.0d ? 1L : -1L));
    }

    public static com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public static void getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, com.github.mikephil.charting.utils.MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (mPPointF.x + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (mPPointF.y + (d * java.lang.Math.sin(java.lang.Math.toRadians(d2))));
    }

    public static void velocityTrackerPointerUpCleanUpIfNecessary(android.view.MotionEvent motionEvent, android.view.VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, getOutputMinFrameDuration);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (i != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i);
                if ((velocityTracker.getXVelocity(pointerId2) * xVelocity) + (velocityTracker.getYVelocity(pointerId2) * yVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static void postInvalidateOnAnimation(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    public static int getMinimumFlingVelocity() {
        return getOutputSizeshNQ4ISI;
    }

    public static int getMaximumFlingVelocity() {
        return getOutputMinFrameDuration;
    }

    public static void drawImage(android.graphics.Canvas canvas, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance();
        mPPointF.x = i - (i3 / 2);
        mPPointF.y = i2 - (i4 / 2);
        drawable.copyBounds(getInputFormats);
        drawable.setBounds(getInputFormats.left, getInputFormats.top, getInputFormats.left + i3, getInputFormats.top + i3);
        int save = canvas.save();
        canvas.translate(mPPointF.x, mPPointF.y);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void drawXAxisValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, android.graphics.Paint paint, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        float fontMetrics = paint.getFontMetrics(getOutputFormats);
        paint.getTextBounds(str, 0, str.length(), getHighSpeedVideoSizes);
        float f4 = 0.0f - getHighSpeedVideoSizes.left;
        float f5 = (-getOutputFormats.ascent) + 0.0f;
        android.graphics.Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float width = getHighSpeedVideoSizes.width();
            if (mPPointF.x != 0.5f || mPPointF.y != 0.5f) {
                com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(getHighSpeedVideoSizes.width(), fontMetrics, f3);
                f -= sizeOfRotatedRectangleByDegrees.width * (mPPointF.x - 0.5f);
                f2 -= sizeOfRotatedRectangleByDegrees.height * (mPPointF.y - 0.5f);
                com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, f4 - (width * 0.5f), f5 - (fontMetrics * 0.5f), paint);
            canvas.restore();
        } else {
            if (mPPointF.x != 0.0f || mPPointF.y != 0.0f) {
                f4 -= getHighSpeedVideoSizes.width() * mPPointF.x;
                f5 -= fontMetrics * mPPointF.y;
            }
            canvas.drawText(str, f4 + f, f5 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static void drawMultilineText(android.graphics.Canvas canvas, android.text.StaticLayout staticLayout, float f, float f2, android.text.TextPaint textPaint, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        float fontMetrics = textPaint.getFontMetrics(getOutputFormats);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f4 = 0.0f - getHighSpeedVideoSizes.left;
        float f5 = lineCount + 0.0f;
        android.graphics.Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        if (f3 != 0.0f) {
            if (mPPointF.x != 0.5f || mPPointF.y != 0.5f) {
                com.github.mikephil.charting.utils.FSize sizeOfRotatedRectangleByDegrees = getSizeOfRotatedRectangleByDegrees(width, lineCount, f3);
                f -= sizeOfRotatedRectangleByDegrees.width * (mPPointF.x - 0.5f);
                f2 -= sizeOfRotatedRectangleByDegrees.height * (mPPointF.y - 0.5f);
                com.github.mikephil.charting.utils.FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.translate(f4 - (width * 0.5f), f5 - (lineCount * 0.5f));
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            if (mPPointF.x != 0.0f || mPPointF.y != 0.0f) {
                f4 -= width * mPPointF.x;
                f5 -= lineCount * mPPointF.y;
            }
            canvas.save();
            canvas.translate(f4 + f, f5 + f2);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void drawMultilineText(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, android.text.TextPaint textPaint, com.github.mikephil.charting.utils.FSize fSize, com.github.mikephil.charting.utils.MPPointF mPPointF, float f3) {
        drawMultilineText(canvas, new android.text.StaticLayout(str, 0, str.length(), textPaint, (int) java.lang.Math.max(java.lang.Math.ceil(fSize.width), 1.0d), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f, f2, textPaint, mPPointF, f3);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(com.github.mikephil.charting.utils.FSize fSize, float f) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f * 0.017453292f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(com.github.mikephil.charting.utils.FSize fSize, float f) {
        return getSizeOfRotatedRectangleByRadians(fSize.width, fSize.height, f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByDegrees(float f, float f2, float f3) {
        return getSizeOfRotatedRectangleByRadians(f, f2, f3 * 0.017453292f);
    }

    public static com.github.mikephil.charting.utils.FSize getSizeOfRotatedRectangleByRadians(float f, float f2, float f3) {
        double d = f3;
        return com.github.mikephil.charting.utils.FSize.getInstance(java.lang.Math.abs(((float) java.lang.Math.cos(d)) * f) + java.lang.Math.abs(((float) java.lang.Math.sin(d)) * f2), java.lang.Math.abs(f * ((float) java.lang.Math.sin(d))) + java.lang.Math.abs(f2 * ((float) java.lang.Math.cos(d))));
    }

    public static int getSDKInt() {
        return android.os.Build.VERSION.SDK_INT;
    }
}
