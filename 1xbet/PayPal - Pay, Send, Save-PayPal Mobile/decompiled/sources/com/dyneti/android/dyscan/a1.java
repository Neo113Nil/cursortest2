package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class a1 implements androidx.camera.core.ImageAnalysis.Analyzer {

    /* renamed from: a, reason: collision with root package name */
    public int f3289a = 0;
    public int b = 0;
    public int c = 0;
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanView d;

    public a1(com.dyneti.android.dyscan.DyScanView dyScanView) {
        this.d = dyScanView;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(androidx.camera.core.ImageProxy imageProxy) {
        android.graphics.Bitmap createScaledBitmap;
        com.dyneti.android.dyscan.c2 a2;
        com.dyneti.android.dyscan.b1 b1Var;
        com.dyneti.android.dyscan.b1 b1Var2;
        com.dyneti.android.dyscan.b1 b1Var3;
        com.dyneti.android.dyscan.b1 b1Var4;
        com.dyneti.android.dyscan.l lVar;
        com.dyneti.android.dyscan.DyScanView dyScanView = this.d;
        if (dyScanView.f3284a.f3288a == null) {
            imageProxy.close();
            return;
        }
        if (!com.dyneti.android.dyscan.a0.f) {
            imageProxy.close();
            return;
        }
        com.dyneti.android.dyscan.a0.g = dyScanView.p0 && !dyScanView.isVertical();
        if (this.d.B0 == null) {
            this.d.d = imageProxy.getImageInfo().getRotationDegrees();
            this.d.B0 = android.graphics.Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        }
        androidx.camera.core.ImageProxy.PlaneProxy[] planes = imageProxy.getPlanes();
        android.graphics.Rect cropRect = imageProxy.getCropRect();
        java.nio.ByteBuffer buffer = planes[0].getBuffer();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int capacity = buffer.capacity() / height;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(width * height * 4);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = (i2 * 4) + (i * capacity);
                int i4 = i3 + 3;
                if (i4 < buffer.capacity()) {
                    byte b = buffer.get(i3);
                    byte b2 = buffer.get(i3 + 1);
                    byte b3 = buffer.get(i3 + 2);
                    byte b4 = buffer.get(i4);
                    allocate.put(b);
                    allocate.put(b2);
                    allocate.put(b3);
                    allocate.put(b4);
                } else {
                    buffer.capacity();
                }
            }
        }
        allocate.rewind();
        this.d.B0.copyPixelsFromBuffer(allocate);
        android.graphics.Bitmap bitmap = this.d.B0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cropRect, "");
        android.graphics.Bitmap a3 = com.dyneti.android.dyscan.o1.a(bitmap, 0, cropRect, false);
        int height2 = a3.getHeight();
        int width2 = a3.getWidth();
        int i5 = width2 / height2;
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, width2, height2);
        int min = java.lang.Math.min(this.d.B0.getWidth(), this.d.B0.getHeight());
        int min2 = java.lang.Math.min(a3.getWidth(), a3.getHeight());
        int max = java.lang.Math.max(a3.getWidth(), a3.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, this.d.B0.getWidth(), this.d.B0.getHeight());
        android.util.Pair pair = new android.util.Pair(java.lang.Float.valueOf((r13.f3321a.getWidth() - this.d.n.d()) / r13.f3321a.getWidth()), java.lang.Float.valueOf((r13.f3321a.getHeight() - this.d.n.c()) / r13.f3321a.getHeight()));
        if (i5 > 3) {
            pair = new android.util.Pair(java.lang.Float.valueOf(((r6.f3321a.getHeight() - this.d.n.c()) / r6.f3321a.getHeight()) / 2.0f), java.lang.Float.valueOf((r6.f3321a.getWidth() - this.d.n.d()) / r6.f3321a.getWidth()));
        }
        float floatValue = this.d.isVertical() ? ((java.lang.Float) pair.second).floatValue() + 0.1f : ((java.lang.Float) pair.second).floatValue();
        java.lang.Float f = (java.lang.Float) pair.first;
        float f2 = width2;
        float f3 = height2;
        int i6 = this.d.d;
        if (i6 == 90 || i6 == 270) {
            rect.inset((int) ((f2 * floatValue) / 2.0f), (int) ((f.floatValue() * f3) / 2.0f));
        } else {
            rect.inset((int) ((f.floatValue() * f2) / 2.0f), (int) ((f3 * floatValue) / 2.0f));
        }
        android.graphics.Bitmap a4 = com.dyneti.android.dyscan.o1.a(this.d.B0, this.d.d, rect2, false);
        com.dyneti.android.dyscan.DyScanView dyScanView2 = this.d;
        final android.graphics.Bitmap a5 = com.dyneti.android.dyscan.o1.a(a3, dyScanView2.d, rect, dyScanView2.isVertical());
        float height3 = (max - a5.getHeight()) / 2.0f;
        float f4 = (min - min2) / 2.0f;
        float width3 = (min2 - a5.getWidth()) / 2.0f;
        this.d.n.e = a5.getWidth();
        this.d.n.f = a5.getHeight();
        com.dyneti.android.dyscan.DyScanView dyScanView3 = this.d;
        com.dyneti.android.dyscan.l2 l2Var = dyScanView3.n;
        l2Var.g = width3 + f4;
        l2Var.h = height3 + ((a4.getHeight() - max) / 2.0f);
        float f5 = 0.0f;
        if (dyScanView3.isVertical()) {
            createScaledBitmap = android.graphics.Bitmap.createBitmap(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE, a5.getConfig());
            createScaledBitmap.eraseColor(-1);
            new android.graphics.Canvas(createScaledBitmap).drawBitmap(a5, 360.0f - (a5.getWidth() / 2.0f), 0.0f, (android.graphics.Paint) null);
        } else {
            createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(a5, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, com.knotapi.knot.utilities.Constants.METRO_BY_T_MOBILE, true);
        }
        if (createScaledBitmap == null) {
            this.d.a("Failed to scale bitmap");
            return;
        }
        synchronized (this.d.i) {
            com.dyneti.android.dyscan.DyScanView dyScanView4 = this.d;
            a2 = dyScanView4.f3284a.a(createScaledBitmap, a4, dyScanView4.z0);
        }
        imageProxy.close();
        if (a2 != null) {
            this.d.c(a2);
            this.d.a(a2);
            com.dyneti.android.dyscan.DyScanView dyScanView5 = this.d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.dyneti.android.dyscan.b1[] b1VarArr = new com.dyneti.android.dyscan.b1[4];
            int i7 = 0;
            for (int i8 = 4; i7 < i8; i8 = 4) {
                arrayList.add(new java.util.ArrayList());
                i7++;
            }
            java.util.Iterator it = a2.f3295a.iterator();
            while (it.hasNext()) {
                com.dyneti.android.dyscan.f2 f2Var = (com.dyneti.android.dyscan.f2) it.next();
                ((java.util.List) arrayList.get(f2Var.a())).add(f2Var);
            }
            int i9 = 0;
            int i10 = 4;
            while (i9 < i10) {
                java.util.List<com.dyneti.android.dyscan.f2> list = (java.util.List) arrayList.get(i9);
                if (list == null || list.size() == 0) {
                    lVar = null;
                } else {
                    float f6 = f5;
                    float f7 = f6;
                    float f8 = f7;
                    float f9 = f8;
                    float f10 = f9;
                    for (com.dyneti.android.dyscan.f2 f2Var2 : list) {
                        float f11 = f2Var2.f3302a;
                        com.dyneti.android.dyscan.l lVar2 = f2Var2.c;
                        f7 += f11;
                        f6 += lVar2.c * f11;
                        f8 += lVar2.f3318a * f11;
                        f9 += lVar2.d * f11;
                        f10 += f11 * lVar2.b;
                    }
                    lVar = new com.dyneti.android.dyscan.l(f6 / f7, f8 / f7, f9 / f7, f10 / f7);
                }
                b1VarArr[i9] = lVar == null ? null : new com.dyneti.android.dyscan.b1((lVar.f3318a + lVar.b) / 2.0f, (lVar.c + lVar.d) / 2.0f);
                i9++;
                i10 = 4;
                f5 = 0.0f;
            }
            com.dyneti.android.dyscan.b1 b1Var5 = b1VarArr[0];
            java.lang.Float valueOf = (b1Var5 == null || (b1Var4 = b1VarArr[1]) == null) ? null : java.lang.Float.valueOf(b1Var4.f3292a - b1Var5.f3292a);
            com.dyneti.android.dyscan.b1 b1Var6 = b1VarArr[2];
            java.lang.Float valueOf2 = (b1Var6 == null || (b1Var3 = b1VarArr[3]) == null) ? null : java.lang.Float.valueOf(b1Var3.f3292a - b1Var6.f3292a);
            com.dyneti.android.dyscan.b1 b1Var7 = b1VarArr[0];
            java.lang.Float valueOf3 = (b1Var7 == null || (b1Var2 = b1VarArr[2]) == null) ? null : java.lang.Float.valueOf(b1Var2.b - b1Var7.b);
            com.dyneti.android.dyscan.b1 b1Var8 = b1VarArr[1];
            java.lang.Float valueOf4 = (b1Var8 == null || (b1Var = b1VarArr[3]) == null) ? null : java.lang.Float.valueOf(b1Var.b - b1Var8.b);
            if (valueOf == null) {
                valueOf = valueOf2;
            } else if (valueOf2 != null) {
                valueOf = java.lang.Float.valueOf((valueOf2.floatValue() + valueOf.floatValue()) / 2.0f);
            }
            if (valueOf3 == null) {
                valueOf3 = valueOf4;
            } else if (valueOf4 != null) {
                valueOf3 = java.lang.Float.valueOf((valueOf4.floatValue() + valueOf3.floatValue()) / 2.0f);
            }
            if (valueOf != null && valueOf3 != null) {
                dyScanView5.w0.d = java.lang.Float.valueOf((dyScanView5.n.d() * valueOf.floatValue()) / (dyScanView5.n.c() * valueOf3.floatValue()));
            }
        }
        this.d.C0.post(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.a1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.a1.this.a(a5);
            }
        });
        this.d.w0.n.a();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final android.util.Size getDefaultTargetResolution() {
        return new android.util.Size(androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 360);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final int getTargetCoordinateSystem() {
        return 0;
    }

    public final void a(android.graphics.Bitmap bitmap) {
        com.dyneti.android.dyscan.t tVar;
        com.dyneti.android.dyscan.t tVar2;
        com.dyneti.android.dyscan.t tVar3;
        com.dyneti.android.dyscan.t tVar4;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6 += 10000) {
            int i7 = iArr[i6];
            i2 += android.graphics.Color.red(i7);
            i4 += android.graphics.Color.green(i7);
            i3 += android.graphics.Color.blue(i7);
            i5++;
        }
        int i8 = ((i2 + i3) + i4) / (i5 * 3);
        int i9 = this.c;
        int i10 = this.b;
        this.c = i10;
        int i11 = this.f3289a;
        this.b = i11;
        this.f3289a = i8;
        int i12 = (int) (((i9 * 1.0d) + ((i10 * 2.0d) + ((i11 * 2.0d) + (i8 * 1.0d)))) / 6.0d);
        if (i12 > 0) {
            com.dyneti.android.dyscan.t1 t1Var = this.d.w0;
            if (t1Var.g == null) {
                t1Var.g = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - t1Var.f3341a);
            }
        }
        com.dyneti.android.dyscan.g0 g0Var = com.dyneti.android.dyscan.DyScan.b;
        com.dyneti.android.dyscan.DyScanView dyScanView = this.d;
        java.lang.Float f = dyScanView.v0.b;
        if (f == null || !dyScanView.W) {
            int i13 = dyScanView.k;
            if (i13 != 0) {
                float f2 = i13;
                com.dyneti.android.dyscan.f0 f0Var = com.dyneti.android.dyscan.DyScan.b.b;
                if (f2 <= 65.0f && i12 <= 65.0f && dyScanView.W && !dyScanView.g.c()) {
                    com.dyneti.android.dyscan.DyScanView dyScanView2 = this.d;
                    if (com.dyneti.android.dyscan.a0.f && (tVar2 = dyScanView2.g) != null) {
                        tVar2.d();
                    }
                }
            }
            com.dyneti.android.dyscan.DyScanView dyScanView3 = this.d;
            int i14 = dyScanView3.k;
            if (i14 != 0) {
                float f3 = i14;
                com.dyneti.android.dyscan.f0 f0Var2 = com.dyneti.android.dyscan.DyScan.b.b;
                if (f3 >= 150.0f && i12 >= 150.0f && dyScanView3.W && dyScanView3.g.c()) {
                    com.dyneti.android.dyscan.DyScanView dyScanView4 = this.d;
                    if (com.dyneti.android.dyscan.a0.f && (tVar = dyScanView4.g) != null) {
                        tVar.d();
                    }
                }
            }
        } else {
            float floatValue = f.floatValue();
            com.dyneti.android.dyscan.f0 f0Var3 = com.dyneti.android.dyscan.DyScan.b.b;
            if (floatValue <= 150.0f && !this.d.g.c()) {
                com.dyneti.android.dyscan.DyScanView dyScanView5 = this.d;
                if (com.dyneti.android.dyscan.a0.f && (tVar4 = dyScanView5.g) != null) {
                    tVar4.d();
                }
            }
            float floatValue2 = f.floatValue();
            com.dyneti.android.dyscan.f0 f0Var4 = com.dyneti.android.dyscan.DyScan.b.b;
            if (floatValue2 >= 300.0f && this.d.g.c()) {
                com.dyneti.android.dyscan.DyScanView dyScanView6 = this.d;
                if (com.dyneti.android.dyscan.a0.f && (tVar3 = dyScanView6.g) != null) {
                    tVar3.d();
                }
            }
        }
        if (i12 > 150) {
            this.d.h = true;
        } else {
            com.dyneti.android.dyscan.DyScanView dyScanView7 = this.d;
            if (dyScanView7.h && i12 < 100) {
                dyScanView7.h = false;
                dyScanView7.g.a(true);
            }
        }
        com.dyneti.android.dyscan.DyScanView dyScanView8 = this.d;
        if (dyScanView8.h) {
            dyScanView8.g.a(false);
        }
        this.d.k = i12;
    }
}
