package com.google.ads.mediation;

import p167y2.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f10508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L2.m f10509b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, L2.m mVar) {
        this.f10508a = abstractAdViewAdapter;
        this.f10509b = mVar;
    }

    @Override // p167y2.m
    public final void b() {
        this.f10509b.onAdClosed(this.f10508a);
    }

    @Override // p167y2.m
    public final void e() {
        this.f10509b.onAdOpened(this.f10508a);
    }
}
