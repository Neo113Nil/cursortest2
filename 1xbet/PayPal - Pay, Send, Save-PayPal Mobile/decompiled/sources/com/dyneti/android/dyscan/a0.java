package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class a0 {
    public static boolean f;
    public static boolean g;

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.k1 f3288a;
    public final com.dyneti.android.dyscan.x1 b;
    public java.lang.String c;
    public java.lang.String d;
    public boolean e;

    public a0(android.content.Context context, com.dyneti.android.dyscan.l2 l2Var, com.dyneti.android.dyscan.t1 t1Var, boolean z, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t1Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.c = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
        this.d = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
        com.dyneti.android.dyscan.k1 k1Var = new com.dyneti.android.dyscan.k1(context, com.dyneti.android.dyscan.DyScan.c, l2Var, t1Var, java.lang.Boolean.valueOf(z), str, str2);
        this.f3288a = k1Var;
        k1Var.c.setNumThreads(java.lang.Runtime.getRuntime().availableProcessors() - 1);
        org.tensorflow.lite.Interpreter interpreter = k1Var.e;
        if (interpreter != null) {
            interpreter.close();
            k1Var.e = new org.tensorflow.lite.Interpreter(k1Var.d, k1Var.c);
        }
        k1Var.c.setUseNNAPI(false);
        org.tensorflow.lite.Interpreter interpreter2 = k1Var.e;
        if (interpreter2 != null) {
            interpreter2.close();
            k1Var.e = new org.tensorflow.lite.Interpreter(k1Var.d, k1Var.c);
        }
        com.dyneti.android.dyscan.x1 x1Var = new com.dyneti.android.dyscan.x1(com.dyneti.android.dyscan.DyScan.d);
        this.b = x1Var;
        x1Var.c.setNumThreads(java.lang.Runtime.getRuntime().availableProcessors() - 1);
        org.tensorflow.lite.Interpreter interpreter3 = x1Var.e;
        if (interpreter3 != null) {
            interpreter3.close();
            x1Var.e = new org.tensorflow.lite.Interpreter(x1Var.d, x1Var.c);
        }
        x1Var.c.setUseNNAPI(false);
        org.tensorflow.lite.Interpreter interpreter4 = x1Var.e;
        if (interpreter4 != null) {
            interpreter4.close();
            x1Var.e = new org.tensorflow.lite.Interpreter(x1Var.d, x1Var.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.dyneti.android.dyscan.k a(java.nio.ByteBuffer byteBuffer, com.dyneti.android.dyscan.y yVar) {
        org.tensorflow.lite.Interpreter interpreter;
        android.graphics.Bitmap bitmap;
        float f2;
        int i;
        java.lang.String str;
        int intValue;
        float f3;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "");
        com.dyneti.android.dyscan.k1 k1Var = this.f3288a;
        if (k1Var == null || (interpreter = k1Var.e) == null || byteBuffer == null) {
            return null;
        }
        k1Var.g = byteBuffer;
        if (interpreter != null && k1Var.f3314a != null) {
            k1Var.i.l.f3338a = android.os.SystemClock.elapsedRealtime();
            k1Var.e.runForMultipleInputsOutputs(new java.lang.Object[]{k1Var.g}, k1Var.f3314a);
            k1Var.i.l.a();
        }
        com.dyneti.android.dyscan.o2 o2Var = new com.dyneti.android.dyscan.o2(java.lang.System.currentTimeMillis(), k1Var.a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(o2Var);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(java.util.Arrays.asList(((com.dyneti.android.dyscan.o2) it.next()).b));
        }
        com.dyneti.android.dyscan.f2[] f2VarArr = (com.dyneti.android.dyscan.f2[]) arrayList2.toArray(new com.dyneti.android.dyscan.f2[arrayList2.size()]);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (com.dyneti.android.dyscan.f2 f2Var : f2VarArr) {
            if (!k1Var.G.contains(f2Var.b) && !f2Var.b.equals("-") && !f2Var.b.equals(".") && f2Var.f3302a > k1Var.f3317o) {
                arrayList3.add(f2Var);
            }
        }
        java.util.ArrayList a2 = com.dyneti.android.dyscan.k1.a(com.dyneti.android.dyscan.k1.a(arrayList3));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < a2.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            int i3 = 0;
            float f5 = 0.0f;
            for (com.dyneti.android.dyscan.d0 d0Var : ((com.dyneti.android.dyscan.e0) a2.get(i2)).b) {
                sb.append(d0Var.b);
                float f6 = f5;
                for (java.util.Iterator it2 = d0Var.d.iterator(); it2.hasNext(); it2 = it2) {
                    com.dyneti.android.dyscan.f2 f2Var2 = (com.dyneti.android.dyscan.f2) it2.next();
                    arrayList6.add(f2Var2);
                    com.dyneti.android.dyscan.l lVar = f2Var2.c;
                    f6 = (float) (((lVar.c + lVar.d) / 2.0d) + f6);
                    i3 = (int) (i3 + 1.0d);
                    arrayList5 = arrayList5;
                }
                f5 = f6;
            }
            java.util.ArrayList arrayList7 = arrayList5;
            float f7 = f5 / i3;
            if (yVar.i != null) {
                com.dyneti.android.dyscan.l lVar2 = k1Var.u.i;
                f2 = f7 - ((lVar2.c + lVar2.d) / 2.0f);
            } else {
                f2 = 0.0f;
            }
            java.lang.String replace = yVar.b.replace(" ", str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, str2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(replace, sb)) {
                str = str2;
                intValue = 0;
            } else {
                if (replace.length() == 0) {
                    intValue = sb.length();
                } else if (sb.length() == 0) {
                    intValue = replace.length();
                } else {
                    int length = replace.length();
                    int i4 = length + 1;
                    int length2 = sb.length();
                    java.lang.Integer[] numArr = new java.lang.Integer[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        numArr[i5] = java.lang.Integer.valueOf(i5);
                    }
                    java.lang.Integer[] numArr2 = new java.lang.Integer[i4];
                    int i6 = 0;
                    while (true) {
                        i = 0;
                        if (i6 >= i4) {
                            break;
                        }
                        numArr2[i6] = 0;
                        i6++;
                    }
                    str = str2;
                    int i7 = 1;
                    while (i7 < length2 + 1) {
                        numArr2[0] = java.lang.Integer.valueOf(i7);
                        int i8 = 1;
                        while (i8 < i4) {
                            int i9 = i4;
                            int i10 = i8 - 1;
                            int i11 = length2;
                            java.lang.String str3 = replace;
                            numArr2[i8] = java.lang.Integer.valueOf(java.lang.Math.min(java.lang.Math.min(numArr[i8].intValue() + 1, numArr2[i10].intValue() + 1), numArr[i10].intValue() + (replace.charAt(i10) == sb.charAt(i7 + (-1)) ? 0 : 1)));
                            i8++;
                            i4 = i9;
                            length2 = i11;
                            replace = str3;
                            sb = sb;
                        }
                        i7++;
                        java.lang.Integer[] numArr3 = numArr2;
                        numArr2 = numArr;
                        numArr = numArr3;
                    }
                    intValue = numArr[length].intValue();
                    f3 = intValue;
                    if (f3 != 0.0f) {
                        java.util.Iterator it3 = arrayList6.iterator();
                        int i12 = i;
                        while (it3.hasNext()) {
                            com.dyneti.android.dyscan.f2 f2Var3 = (com.dyneti.android.dyscan.f2) it3.next();
                            if (i12 >= 6 && i12 < arrayList6.size() - 4) {
                                arrayList4.add(f2Var3);
                            }
                            i12++;
                        }
                    } else if (f3 < 5.0f) {
                        f4 = f2;
                    }
                    i2++;
                    arrayList5 = arrayList7;
                    str2 = str;
                }
                str = str2;
            }
            i = 0;
            f3 = intValue;
            if (f3 != 0.0f) {
            }
            i2++;
            arrayList5 = arrayList7;
            str2 = str;
        }
        java.util.ArrayList arrayList8 = arrayList5;
        boolean z = arrayList4.size() > 0;
        for (int i13 = 0; i13 < a2.size(); i13++) {
            for (com.dyneti.android.dyscan.d0 d0Var2 : ((com.dyneti.android.dyscan.e0) a2.get(i13)).b) {
                com.dyneti.android.dyscan.l lVar3 = yVar.i;
                if (lVar3 != null) {
                    com.dyneti.android.dyscan.l lVar4 = d0Var2.f3296a;
                    boolean z2 = lVar4.b < lVar3.f3318a || lVar4.f3318a > lVar3.b;
                    boolean z3 = lVar4.d < lVar3.c + f4 || lVar4.c > lVar3.d + f4;
                    if (z2 || z3) {
                        arrayList8.addAll(d0Var2.d);
                    }
                }
            }
        }
        java.nio.ByteBuffer byteBuffer2 = k1Var.g;
        if (byteBuffer2 != null) {
            byteBuffer2.rewind();
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE, android.graphics.Bitmap.Config.ARGB_8888);
            int[] iArr = new int[326880];
            for (int i14 = 0; i14 < 326880; i14++) {
                iArr[i14] = ((byteBuffer2.get() & 255) << 16) | (-16777216) | ((byteBuffer2.get() & 255) << 8) | (byteBuffer2.get() & 255);
            }
            createBitmap.setPixels(iArr, 0, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, 0, 0, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE);
            bitmap = createBitmap;
        } else {
            bitmap = null;
        }
        return new com.dyneti.android.dyscan.k(bitmap, yVar, arrayList4, arrayList8, f4, java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final com.dyneti.android.dyscan.c2 a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, com.dyneti.android.dyscan.h1 h1Var) {
        com.dyneti.android.dyscan.c2 c2Var;
        boolean z;
        com.dyneti.android.dyscan.c2 c2Var2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        float f2;
        java.lang.String str4;
        com.dyneti.android.dyscan.y1 y1Var;
        java.lang.String str5;
        java.lang.String str6;
        com.dyneti.android.dyscan.x1 x1Var;
        java.nio.ByteBuffer byteBuffer;
        java.util.HashMap hashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap2, "");
        ?? r11 = 1;
        boolean z2 = true;
        boolean z3 = true;
        android.graphics.Bitmap bitmap3 = null;
        if (g) {
            if (this.e) {
                str = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
                str2 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
                str3 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
            } else {
                com.dyneti.android.dyscan.x1 x1Var2 = this.b;
                if (x1Var2 == null || x1Var2.e == null) {
                    str4 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
                    str2 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
                    str3 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
                    y1Var = null;
                } else {
                    java.nio.ByteBuffer byteBuffer2 = x1Var2.f;
                    if (byteBuffer2 != null) {
                        byteBuffer2.rewind();
                        int width = bitmap.getWidth();
                        int[] iArr = x1Var2.b;
                        x1Var = x1Var2;
                        str4 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
                        str2 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
                        str3 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
                        bitmap.getPixels(iArr, 0, width, 0, 0, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE);
                        int i = 0;
                        for (int i2 = 0; i2 < 720; i2++) {
                            int i3 = 0;
                            while (i3 < 454) {
                                int i4 = x1Var.b[i];
                                x1Var.f.putFloat((((((i4 >> 16) & 255) + ((i4 >> 8) & 255)) + (i4 & 255)) / 3.0f) / 255.0f);
                                i3++;
                                i++;
                            }
                        }
                    } else {
                        x1Var = x1Var2;
                        str4 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
                        str2 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
                        str3 = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
                    }
                    org.tensorflow.lite.Interpreter interpreter = x1Var.e;
                    if (interpreter != null && (byteBuffer = x1Var.f) != null && (hashMap = x1Var.f3351a) != null) {
                        interpreter.runForMultipleInputsOutputs(new java.lang.Object[]{byteBuffer}, hashMap);
                    }
                    float[] fArr = x1Var.g[0];
                    z2 = true;
                    y1Var = new com.dyneti.android.dyscan.y1(fArr[2], fArr[0], fArr[1]);
                }
                if (y1Var != null) {
                    if (y1Var.f3354a < 0.5d) {
                        if (kotlin.random.Random.INSTANCE.nextBoolean()) {
                            str = str4;
                            str6 = str2;
                        } else {
                            str = str4;
                            str6 = str;
                        }
                        str5 = kotlin.jvm.internal.Intrinsics.areEqual(str6, str) ? str2 : str;
                    } else {
                        str = str4;
                        str5 = str3;
                        str6 = str5;
                    }
                    this.d = str6;
                    this.c = str5;
                    z3 = z2;
                } else {
                    str = str4;
                    z3 = z2;
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.d, str3)) {
                c2Var = null;
                bitmap3 = null;
                r11 = z3;
            } else {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                java.lang.String str7 = this.d;
                if (kotlin.jvm.internal.Intrinsics.areEqual(str7, str2)) {
                    f2 = 90.0f;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(str7, str)) {
                    f2 = -90.0f;
                } else {
                    java.lang.System.out.print((java.lang.Object) "Invalid direction provided. Expected 'left' or 'right'.");
                    f2 = 0.0f;
                }
                matrix.preRotate(f2, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                int width2 = (int) (bitmap.getWidth() * 0.1d);
                matrix.postScale(454.0f / (bitmap.getWidth() - r6), 454.0f / (bitmap.getWidth() - r6));
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, width2, 0, bitmap.getWidth() - (width2 * 2), bitmap.getHeight(), matrix, true);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
                android.graphics.Bitmap.Config config = createBitmap.getConfig();
                kotlin.jvm.internal.Intrinsics.checkNotNull(config);
                bitmap3 = android.graphics.Bitmap.createBitmap(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE, config);
                bitmap3.eraseColor(-1);
                c2Var = null;
                new android.graphics.Canvas(bitmap3).drawBitmap(createBitmap, 360.0f - (createBitmap.getWidth() / 2.0f), 0.0f, (android.graphics.Paint) null);
                r11 = z3;
            }
        } else {
            c2Var = null;
        }
        android.graphics.Bitmap bitmap4 = bitmap3 != null ? bitmap3 : bitmap;
        com.dyneti.android.dyscan.k1 k1Var = this.f3288a;
        if (k1Var == 0 || k1Var.e == null) {
            z = false;
            c2Var2 = c2Var;
        } else {
            java.nio.ByteBuffer byteBuffer3 = k1Var.g;
            if (byteBuffer3 != null) {
                byteBuffer3.rewind();
                bitmap4.getPixels(k1Var.b, 0, bitmap4.getWidth(), 0, 0, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE);
                int i5 = 0;
                for (int i6 = 0; i6 < 720; i6++) {
                    int i7 = 0;
                    while (i7 < 454) {
                        int i8 = k1Var.b[i5];
                        k1Var.g.put((byte) ((i8 >> 16) & 255));
                        k1Var.g.put((byte) ((i8 >> 8) & 255));
                        k1Var.g.put((byte) (i8 & 255));
                        i7++;
                        i5++;
                    }
                }
            }
            if (k1Var.e != null && k1Var.g != null && k1Var.f3314a != null) {
                k1Var.i.l.f3338a = android.os.SystemClock.elapsedRealtime();
                k1Var.e.runForMultipleInputsOutputs(new java.lang.Object[]{k1Var.g}, k1Var.f3314a);
                k1Var.i.l.a();
            }
            k1Var.i.m.f3338a = android.os.SystemClock.elapsedRealtime();
            com.dyneti.android.dyscan.f2[] a2 = k1Var.a();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int size = k1Var.q.size() - r11; size >= 0; size--) {
                if (currentTimeMillis - ((com.dyneti.android.dyscan.o2) k1Var.q.get(size)).f3328a > k1Var.r) {
                    k1Var.q.remove(size);
                } else {
                    for (com.dyneti.android.dyscan.f2 f2Var : ((com.dyneti.android.dyscan.o2) k1Var.q.get(size)).b) {
                        f2Var.f3302a *= 0.8f;
                    }
                }
            }
            com.dyneti.android.dyscan.o2 o2Var = new com.dyneti.android.dyscan.o2(currentTimeMillis, a2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(o2Var);
            com.dyneti.android.dyscan.c2 a3 = k1Var.a(arrayList, bitmap2, (boolean) r11, h1Var);
            if (!a3.k.booleanValue()) {
                k1Var.q.add(o2Var);
                com.dyneti.android.dyscan.q1 q1Var = k1Var.i.k;
                q1Var.f3332a += k1Var.q.size();
                q1Var.b++;
                if (k1Var.q.size() > r11) {
                    z = false;
                    c2Var2 = k1Var.a(k1Var.q, bitmap2, false, h1Var);
                    k1Var.i.m.a();
                }
            }
            z = false;
            c2Var2 = a3;
            k1Var.i.m.a();
        }
        if (c2Var2 != null) {
            c2Var2.j = this.c;
        }
        this.e = (!g || this.e || c2Var2 == null || c2Var2.i != r11) ? z : r11;
        return c2Var2;
    }
}
