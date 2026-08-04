package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f11668a;

    public bt(bn bnVar) {
        this.f11668a = bnVar;
    }

    public final /* synthetic */ Task a(long j, long j3, int i7, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f11668a.d(standardIntegrityTokenRequest.a(), j, j3, 0);
    }
}
