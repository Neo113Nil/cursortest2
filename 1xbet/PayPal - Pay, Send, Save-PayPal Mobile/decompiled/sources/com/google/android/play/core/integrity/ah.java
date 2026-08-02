package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ah extends com.google.android.play.core.integrity.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.ai f3792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(com.google.android.play.core.integrity.ai aiVar, java.lang.String str, long j) {
        super(str, j);
        this.f3792a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        return this.f3792a.f3793a.b(activity, bundle);
    }
}
