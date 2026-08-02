package com.bumptech.glide.manager;

import com.bumptech.glide.manager.s;

/* loaded from: classes3.dex */
public final class t implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s.c.a b;

    public t(s.c.a aVar, boolean z) {
        this.b = aVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.util.m.a();
        s.c cVar = s.c.this;
        boolean z = cVar.a;
        boolean z2 = this.a;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
