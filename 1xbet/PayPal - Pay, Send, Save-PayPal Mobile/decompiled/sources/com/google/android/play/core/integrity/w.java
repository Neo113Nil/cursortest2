package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class w implements com.google.android.play.core.integrity.aw {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f3834a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;
    private final com.google.android.play.integrity.internal.bb f;

    /* synthetic */ w(android.content.Context context, com.google.android.play.core.integrity.v vVar) {
        com.google.android.play.core.integrity.bc bcVar;
        com.google.android.play.core.integrity.o oVar;
        com.google.android.play.core.integrity.o oVar2;
        com.google.android.play.integrity.internal.ay b = com.google.android.play.integrity.internal.az.b(context);
        this.f3834a = b;
        bcVar = com.google.android.play.core.integrity.bb.f3809a;
        com.google.android.play.integrity.internal.bb b2 = com.google.android.play.integrity.internal.ax.b(bcVar);
        this.b = b2;
        oVar = com.google.android.play.core.integrity.n.f3830a;
        com.google.android.play.core.integrity.au auVar = new com.google.android.play.core.integrity.au(b, oVar);
        this.c = auVar;
        oVar2 = com.google.android.play.core.integrity.n.f3830a;
        com.google.android.play.integrity.internal.bb b3 = com.google.android.play.integrity.internal.ax.b(new com.google.android.play.core.integrity.bp(b, b2, auVar, oVar2));
        this.d = b3;
        com.google.android.play.integrity.internal.bb b4 = com.google.android.play.integrity.internal.ax.b(new com.google.android.play.core.integrity.bu(b3));
        this.e = b4;
        this.f = com.google.android.play.integrity.internal.ax.b(new com.google.android.play.core.integrity.ba(b3, b4));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final com.google.android.play.core.integrity.StandardIntegrityManager a() {
        return (com.google.android.play.core.integrity.StandardIntegrityManager) this.f.a();
    }
}
