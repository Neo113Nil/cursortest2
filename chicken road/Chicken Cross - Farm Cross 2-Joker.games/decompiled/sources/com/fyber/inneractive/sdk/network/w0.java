package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class w0 extends v0 {
    public w0(com.fyber.inneractive.sdk.ui.a aVar, Context context, com.fyber.inneractive.sdk.cache.c cVar) {
        super(aVar, context, cVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.c;
            int a2 = t0.a(map);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            Bitmap decodeStream = BitmapFactory.decodeStream(new com.fyber.inneractive.sdk.util.v0(inputStream, atomicInteger));
            if (atomicInteger.get() != a2) {
                decodeStream = null;
            }
            if (decodeStream != null) {
                String a3 = com.fyber.inneractive.sdk.util.w0.a(decodeStream);
                o0Var.f5505a = decodeStream;
                o0Var.b = a3;
            }
            return o0Var;
        } catch (Exception e) {
            IAlog.a("failed parse cacheable network request", e, new Object[0]);
            throw new n0(e);
        }
    }
}
