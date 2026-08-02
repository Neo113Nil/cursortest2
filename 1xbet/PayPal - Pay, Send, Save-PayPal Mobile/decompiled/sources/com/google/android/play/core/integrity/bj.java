package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bj extends com.google.android.play.core.integrity.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.bk f3815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(com.google.android.play.core.integrity.bk bkVar, java.lang.String str, long j) {
        super(str, j);
        this.f3815a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        long j;
        j = this.f3815a.e;
        bundle.putLong("cloud.prj", j);
        return this.f3815a.c.c(activity, bundle);
    }
}
