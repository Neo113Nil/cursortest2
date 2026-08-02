package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class u implements com.google.android.play.core.integrity.av {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f3833a;

    public final com.google.android.play.core.integrity.u a(android.content.Context context) {
        this.f3833a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final com.google.android.play.core.integrity.aw b() {
        com.google.android.play.integrity.internal.ba.a(this.f3833a, android.content.Context.class);
        return new com.google.android.play.core.integrity.w(this.f3833a, null);
    }

    /* synthetic */ u(com.google.android.play.core.integrity.t tVar) {
    }

    private u() {
        throw null;
    }
}
