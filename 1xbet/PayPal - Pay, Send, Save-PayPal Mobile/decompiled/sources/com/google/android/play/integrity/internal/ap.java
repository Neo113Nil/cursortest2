package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class ap extends com.google.android.play.integrity.internal.an {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.ar f3846a;

    ap(com.google.android.play.integrity.internal.ar arVar, int i) {
        super(arVar.size(), i);
        this.f3846a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    protected final java.lang.Object a(int i) {
        return this.f3846a.get(i);
    }
}
