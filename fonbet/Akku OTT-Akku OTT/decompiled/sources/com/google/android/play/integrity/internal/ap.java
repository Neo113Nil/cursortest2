package com.google.android.play.integrity.internal;

/* loaded from: classes4.dex */
final class ap extends an {
    private final ar a;

    public ap(ar arVar, int i) {
        super(arVar.size(), i);
        this.a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a(int i) {
        return this.a.get(i);
    }
}
