package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11155a;

    public /* synthetic */ Y(BasePendingResult basePendingResult) {
        this.f11155a = basePendingResult;
    }

    public final void finalize() throws Throwable {
        BasePendingResult.zal(this.f11155a.zaj);
        super.finalize();
    }
}
