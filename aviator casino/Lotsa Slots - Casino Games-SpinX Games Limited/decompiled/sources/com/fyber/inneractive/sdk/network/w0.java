package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class w0 extends com.fyber.inneractive.sdk.network.v0 {
    public w0(com.fyber.inneractive.sdk.ui.a aVar, android.content.Context context, com.fyber.inneractive.sdk.cache.b bVar) {
        super(aVar, context, bVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            java.io.InputStream inputStream = lVar.c;
            int a2 = com.fyber.inneractive.sdk.network.t0.a(map);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
            if (atomicInteger.get() != a2) {
                decodeStream = null;
            }
            if (decodeStream != null) {
                java.lang.String a3 = com.fyber.inneractive.sdk.util.w0.a(decodeStream);
                o0Var.f3851a = decodeStream;
                o0Var.b = a3;
            }
            return o0Var;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse cacheable network request", e, new java.lang.Object[0]);
            throw new com.fyber.inneractive.sdk.network.n0(e);
        }
    }
}
