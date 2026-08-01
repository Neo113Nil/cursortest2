package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5520a;

    public a(g gVar) {
        this.f5520a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f5520a) {
            g gVar = this.f5520a;
            if (gVar.i == null) {
                return null;
            }
            gVar.d();
            g gVar2 = this.f5520a;
            int i = gVar2.k;
            if (i >= 2000 && i >= gVar2.j.size()) {
                this.f5520a.c();
                this.f5520a.k = 0;
            }
            return null;
        }
    }
}
