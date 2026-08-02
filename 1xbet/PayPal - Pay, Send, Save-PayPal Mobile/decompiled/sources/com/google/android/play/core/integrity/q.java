package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class q implements com.google.android.play.core.integrity.x {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f3831a;

    public final com.google.android.play.core.integrity.q a(android.content.Context context) {
        this.f3831a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final com.google.android.play.core.integrity.s b() {
        com.google.android.play.integrity.internal.ba.a(this.f3831a, android.content.Context.class);
        return new com.google.android.play.core.integrity.s(this.f3831a, null);
    }

    /* synthetic */ q(com.google.android.play.core.integrity.p pVar) {
    }

    private q() {
        throw null;
    }
}
