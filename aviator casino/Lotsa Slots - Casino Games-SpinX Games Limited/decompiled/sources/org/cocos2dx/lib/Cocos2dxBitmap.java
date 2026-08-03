package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxBitmap {
    private static final int HORIZONTALALIGN_CENTER = 3;
    private static final int HORIZONTALALIGN_LEFT = 1;
    private static final int HORIZONTALALIGN_RIGHT = 2;
    private static final int VERTICALALIGN_BOTTOM = 2;
    private static final int VERTICALALIGN_CENTER = 3;
    private static final int VERTICALALIGN_TOP = 1;
    private static android.content.Context sContext;

    private static native void nativeInitBitmapDC(int i, int i2, byte[] bArr);

    public static void setContext(android.content.Context context) {
        sContext = context;
    }

    public static void createTextBitmap(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4) {
        createTextBitmapShadowStroke(str, str2, i, 255, 255, 255, 255, i2, i3, i4, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 255, 255, 255, 255, 0.0f);
    }

    public static boolean createTextBitmapShadowStroke(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, float f, float f2, float f3, float f4, boolean z2, int i9, int i10, int i11, int i12, float f5) {
        int i13 = i6 & 15;
        int i14 = (i6 >> 4) & 15;
        java.lang.String refactorString = refactorString(str);
        android.graphics.Paint newPaint = newPaint(str2, i, i13);
        int i15 = 0;
        if (i7 != 0 && ((int) java.lang.Math.ceil(newPaint.measureText(refactorString, 0, 1))) > i7) {
            android.util.Log.w("createTextBitmapShadowStroke warning:", "the input width is less than the width of the pString's first word\n");
            return false;
        }
        newPaint.setARGB(i5, i2, i3, i4);
        org.cocos2dx.lib.Cocos2dxBitmap.TextProperty computeTextProperty = computeTextProperty(refactorString, i7, i8, newPaint);
        int i16 = i8 == 0 ? computeTextProperty.mTotalHeight : i8;
        if (computeTextProperty.mMaxWidth == 0 || i16 == 0) {
            android.util.Log.w("createTextBitmapShadowStroke warning:", "textProperty MaxWidth is 0 or bitMapTotalHeight is 0\n");
            return false;
        }
        int i17 = (int) 0.0f;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(computeTextProperty.mMaxWidth + i17, i16 + i17, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = newPaint.getFontMetricsInt();
        if (z2) {
            android.graphics.Paint newPaint2 = newPaint(str2, i, i13);
            newPaint2.setStyle(android.graphics.Paint.Style.STROKE);
            newPaint2.setStrokeWidth(f5);
            newPaint2.setARGB(i12, i9, i10, i11);
            int computeY = computeY(fontMetricsInt, i8, computeTextProperty.mTotalHeight, i14);
            java.lang.String[] strArr = computeTextProperty.mLines;
            int length = strArr.length;
            while (i15 < length) {
                java.lang.String str3 = strArr[i15];
                float computeX = computeX(str3, computeTextProperty.mMaxWidth, i13) + 0.0f;
                float f6 = computeY + 0.0f;
                canvas.drawText(str3, computeX, f6, newPaint2);
                canvas.drawText(str3, computeX, f6, newPaint);
                computeY += computeTextProperty.mHeightPerLine;
                i15++;
            }
        } else {
            int computeY2 = computeY(fontMetricsInt, i8, computeTextProperty.mTotalHeight, i14);
            java.lang.String[] strArr2 = computeTextProperty.mLines;
            int length2 = strArr2.length;
            while (i15 < length2) {
                canvas.drawText(strArr2[i15], computeX(r5, computeTextProperty.mMaxWidth, i13) + 0.0f, computeY2 + 0.0f, newPaint);
                computeY2 += computeTextProperty.mHeightPerLine;
                i15++;
            }
        }
        initNativeObject(createBitmap);
        return true;
    }

    private static android.graphics.Paint newPaint(java.lang.String str, int i, int i2) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        paint.setTextSize(i);
        paint.setAntiAlias(true);
        if (str.endsWith(".ttf")) {
            try {
                paint.setTypeface(org.cocos2dx.lib.Cocos2dxTypefaces.get(sContext, str));
            } catch (java.lang.Exception unused) {
                android.util.Log.e("Cocos2dxBitmap", "error to create ttf type face: " + str);
                paint.setTypeface(android.graphics.Typeface.create(str, 0));
            }
        } else {
            paint.setTypeface(android.graphics.Typeface.create(str, 0));
        }
        if (i2 == 2) {
            paint.setTextAlign(android.graphics.Paint.Align.RIGHT);
        } else if (i2 == 3) {
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        } else {
            paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        }
        return paint;
    }

    private static org.cocos2dx.lib.Cocos2dxBitmap.TextProperty computeTextProperty(java.lang.String str, int i, int i2, android.graphics.Paint paint) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int ceil = (int) java.lang.Math.ceil(fontMetricsInt.bottom - fontMetricsInt.top);
        java.lang.String[] splitString = splitString(str, i, i2, paint);
        if (i == 0) {
            int i3 = 0;
            for (java.lang.String str2 : splitString) {
                int ceil2 = (int) java.lang.Math.ceil(paint.measureText(str2, 0, str2.length()));
                if (ceil2 > i3) {
                    i3 = ceil2;
                }
            }
            i = i3;
        }
        return new org.cocos2dx.lib.Cocos2dxBitmap.TextProperty(i, ceil, splitString);
    }

    private static int computeX(java.lang.String str, int i, int i2) {
        if (i2 == 2) {
            return i;
        }
        if (i2 != 3) {
            return 0;
        }
        return i / 2;
    }

    private static int computeY(android.graphics.Paint.FontMetricsInt fontMetricsInt, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = -fontMetricsInt.top;
        if (i <= i2) {
            return i6;
        }
        if (i3 == 1) {
            return -fontMetricsInt.top;
        }
        if (i3 == 2) {
            i4 = -fontMetricsInt.top;
            i5 = i - i2;
        } else {
            if (i3 != 3) {
                return i6;
            }
            i4 = -fontMetricsInt.top;
            i5 = (i - i2) / 2;
        }
        return i4 + i5;
    }

    private static java.lang.String[] splitString(java.lang.String str, int i, int i2, android.graphics.Paint paint) {
        java.lang.String[] split = str.split("\\n");
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int ceil = i2 / ((int) java.lang.Math.ceil(fontMetricsInt.bottom - fontMetricsInt.top));
        int i3 = 0;
        if (i != 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int length = split.length;
            while (i3 < length) {
                java.lang.String str2 = split[i3];
                if (((int) java.lang.Math.ceil(paint.measureText(str2))) > i) {
                    linkedList.addAll(divideStringWithMaxWidth(str2, i, paint));
                } else {
                    linkedList.add(str2);
                }
                if (ceil > 0 && linkedList.size() >= ceil) {
                    break;
                }
                i3++;
            }
            if (ceil > 0 && linkedList.size() > ceil) {
                while (linkedList.size() > ceil) {
                    linkedList.removeLast();
                }
            }
            java.lang.String[] strArr = new java.lang.String[linkedList.size()];
            linkedList.toArray(strArr);
            return strArr;
        }
        if (i2 == 0 || split.length <= ceil) {
            return split;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        while (i3 < ceil) {
            linkedList2.add(split[i3]);
            i3++;
        }
        java.lang.String[] strArr2 = new java.lang.String[linkedList2.size()];
        linkedList2.toArray(strArr2);
        return strArr2;
    }

    private static java.util.LinkedList<java.lang.String> divideStringWithMaxWidth(java.lang.String str, int i, android.graphics.Paint paint) {
        int length = str.length();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList<>();
        int i2 = 1;
        int i3 = 0;
        while (i2 <= length) {
            int ceil = (int) java.lang.Math.ceil(paint.measureText(str, i3, i2));
            if (ceil >= i) {
                int lastIndexOf = str.substring(0, i2).lastIndexOf(io.ktor.sse.ServerSentEventKt.SPACE);
                if (lastIndexOf != -1 && lastIndexOf > i3) {
                    linkedList.add(str.substring(i3, lastIndexOf));
                    i2 = lastIndexOf + 1;
                } else if (ceil > i && i2 != i3 + 1) {
                    linkedList.add(str.substring(i3, i2 - 1));
                    i2--;
                } else {
                    linkedList.add(str.substring(i3, i2));
                }
                while (i2 < length && str.charAt(i2) == ' ') {
                    i2++;
                }
                i3 = i2;
            }
            i2++;
        }
        if (i3 < length) {
            linkedList.add(str.substring(i3));
        }
        return linkedList;
    }

    private static java.lang.String refactorString(java.lang.String str) {
        if (str.compareTo("") == 0) {
            return io.ktor.sse.ServerSentEventKt.SPACE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        int i = 0;
        for (int indexOf = sb.indexOf("\n"); indexOf != -1; indexOf = sb.indexOf("\n", i)) {
            if (indexOf == 0 || sb.charAt(indexOf - 1) == '\n') {
                sb.insert(i, io.ktor.sse.ServerSentEventKt.SPACE);
                i = indexOf + 2;
            } else {
                i = indexOf + 1;
            }
            if (i > sb.length() || indexOf == sb.length()) {
                break;
            }
        }
        return sb.toString();
    }

    private static void initNativeObject(android.graphics.Bitmap bitmap) {
        byte[] pixels = getPixels(bitmap);
        if (pixels == null) {
            return;
        }
        nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), pixels);
    }

    private static byte[] getPixels(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.nativeOrder());
        bitmap.copyPixelsToBuffer(wrap);
        return bArr;
    }

    private static int getFontSizeAccordingHeight(int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.setTypeface(android.graphics.Typeface.DEFAULT);
        boolean z = false;
        int i2 = 1;
        while (!z) {
            paint.setTextSize(i2);
            paint.getTextBounds("SghMNy", 0, 6, rect);
            i2++;
            if (i - rect.height() <= 2) {
                z = true;
            }
            android.util.Log.d("font size", "incr size:" + i2);
        }
        return i2;
    }

    private static java.lang.String getStringWithEllipsis(java.lang.String str, float f, float f2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTypeface(android.graphics.Typeface.DEFAULT);
        textPaint.setTextSize(f2);
        return android.text.TextUtils.ellipsize(str, textPaint, f, android.text.TextUtils.TruncateAt.END).toString();
    }

    private static class TextProperty {
        private final int mHeightPerLine;
        private final java.lang.String[] mLines;
        private final int mMaxWidth;
        private final int mTotalHeight;

        TextProperty(int i, int i2, java.lang.String[] strArr) {
            this.mMaxWidth = i;
            this.mHeightPerLine = i2;
            this.mTotalHeight = i2 * strArr.length;
            this.mLines = strArr;
        }
    }
}
