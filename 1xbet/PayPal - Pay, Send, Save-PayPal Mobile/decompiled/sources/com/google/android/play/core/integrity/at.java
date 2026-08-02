package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f3802a;
    private final com.google.android.play.integrity.internal.bd b;

    at(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f3802a = bdVar;
        this.b = bdVar2;
    }

    final com.google.android.play.core.integrity.as a(android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        return new com.google.android.play.core.integrity.as((android.content.Context) this.f3802a.a(), (com.google.android.play.core.integrity.k) this.b.a(), activity, taskCompletionSource, aeVar);
    }
}
