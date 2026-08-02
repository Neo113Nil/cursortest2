package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.content.Context f3810a;
    final /* synthetic */ com.google.android.play.core.integrity.bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.content.Context context) {
        super(taskCompletionSource);
        this.f3810a = context;
        this.b = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource;
        android.content.Context context = this.f3810a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(java.lang.Integer.valueOf(com.google.android.play.integrity.internal.ai.a(context)));
    }
}
