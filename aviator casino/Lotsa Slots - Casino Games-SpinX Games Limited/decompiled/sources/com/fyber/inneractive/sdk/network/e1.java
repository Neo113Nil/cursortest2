package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class e1 extends com.fyber.inneractive.sdk.network.t0 {
    public final java.lang.String p;

    public e1(com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d dVar, java.lang.String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(dVar, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        this.p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        com.fyber.inneractive.sdk.network.d1 d1Var = new com.fyber.inneractive.sdk.network.d1();
        try {
            java.io.InputStream inputStream = lVar.c;
            if (inputStream != null) {
                int a2 = com.fyber.inneractive.sdk.network.t0.a(map);
                java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
                if (atomicInteger.get() != a2) {
                    decodeStream = null;
                }
                if (decodeStream != null) {
                    int width = decodeStream.getWidth();
                    int height = decodeStream.getHeight();
                    int i2 = width * height;
                    int[] iArr = new int[i2];
                    decodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i3 = -1;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int i5 = iArr[i4];
                        if (i4 != 0) {
                            if (i5 != i3) {
                                d1Var.f3836a = decodeStream;
                                com.fyber.inneractive.sdk.util.IAlog.a("SimpleImageLoader: Got a valid bitmap %s", this.p);
                                break;
                            }
                        } else {
                            i3 = i5;
                        }
                    }
                }
                com.fyber.inneractive.sdk.util.IAlog.a("SimpleImageLoader: Got an invalid bitmap", new java.lang.Object[0]);
                d1Var.b = "Got an invalid bitmap";
            }
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.c("SimpleImageLoader: Exception on load image %s %s", e.getMessage(), e.toString());
            d1Var.b = e.getMessage();
        } catch (java.lang.OutOfMemoryError e2) {
            com.fyber.inneractive.sdk.util.IAlog.c("SimpleImageLoader: OutOfMemoryError on load image %s", e2.getMessage());
            android.graphics.Bitmap bitmap = d1Var.f3836a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            d1Var.b = e2.getMessage();
        }
        o0Var.f3851a = d1Var;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        return this.p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }
}
