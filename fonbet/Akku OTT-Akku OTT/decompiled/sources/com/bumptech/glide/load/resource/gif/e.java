package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.resource.gif.g;
import com.bumptech.glide.m;

/* loaded from: classes3.dex */
public final class e extends com.bumptech.glide.load.resource.drawable.c<c> {
    @Override // com.bumptech.glide.load.engine.x
    public final int a() {
        g gVar = ((c) this.a).a.a;
        com.bumptech.glide.gifdecoder.e eVar = gVar.a;
        return (eVar.j.length * 4) + eVar.d.limit() + eVar.i.length + gVar.o;
    }

    @Override // com.bumptech.glide.load.engine.x
    @NonNull
    public final Class<c> c() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.resource.drawable.c, com.bumptech.glide.load.engine.t
    public final void initialize() {
        ((c) this.a).a.a.l.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.x
    public final void recycle() {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar;
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar2;
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar3;
        c cVar = (c) this.a;
        cVar.stop();
        cVar.d = true;
        g gVar = cVar.a.a;
        m mVar = gVar.d;
        gVar.c.clear();
        Bitmap bitmap = gVar.l;
        if (bitmap != null) {
            gVar.e.d(bitmap);
            gVar.l = null;
        }
        gVar.f = false;
        g.a aVar = gVar.i;
        if (aVar != null) {
            mVar.e(aVar);
            gVar.i = null;
        }
        g.a aVar2 = gVar.k;
        if (aVar2 != null) {
            mVar.e(aVar2);
            gVar.k = null;
        }
        g.a aVar3 = gVar.n;
        if (aVar3 != null) {
            mVar.e(aVar3);
            gVar.n = null;
        }
        com.bumptech.glide.gifdecoder.e eVar = gVar.a;
        a.InterfaceC0053a interfaceC0053a = eVar.c;
        eVar.l = null;
        byte[] bArr = eVar.i;
        if (bArr != null && (bVar3 = ((b) interfaceC0053a).b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = eVar.j;
        if (iArr != null && (bVar2 = ((b) interfaceC0053a).b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap2 = eVar.m;
        if (bitmap2 != null) {
            ((b) interfaceC0053a).a.d(bitmap2);
        }
        eVar.m = null;
        eVar.d = null;
        eVar.s = null;
        byte[] bArr2 = eVar.e;
        if (bArr2 != null && (bVar = ((b) interfaceC0053a).b) != null) {
            bVar.put(bArr2);
        }
        gVar.j = true;
    }
}
