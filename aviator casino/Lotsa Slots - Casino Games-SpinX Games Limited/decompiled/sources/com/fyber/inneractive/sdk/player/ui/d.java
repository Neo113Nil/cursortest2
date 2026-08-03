package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4162a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.e b;

    public d(com.fyber.inneractive.sdk.player.ui.e eVar, boolean z) {
        this.b = eVar;
        this.f4162a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4162a == this.b.hasWindowFocus()) {
            this.b.f();
        }
    }
}
