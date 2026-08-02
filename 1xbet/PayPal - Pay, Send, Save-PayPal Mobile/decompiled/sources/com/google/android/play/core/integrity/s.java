package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f3832a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;

    /* synthetic */ s(android.content.Context context, com.google.android.play.core.integrity.r rVar) {
        com.google.android.play.core.integrity.ad adVar;
        com.google.android.play.core.integrity.m mVar;
        com.google.android.play.core.integrity.m mVar2;
        com.google.android.play.integrity.internal.ay b = com.google.android.play.integrity.internal.az.b(context);
        this.f3832a = b;
        adVar = com.google.android.play.core.integrity.ac.f3789a;
        com.google.android.play.integrity.internal.bb b2 = com.google.android.play.integrity.internal.ax.b(adVar);
        this.b = b2;
        mVar = com.google.android.play.core.integrity.l.f3827a;
        com.google.android.play.core.integrity.au auVar = new com.google.android.play.core.integrity.au(b, mVar);
        this.c = auVar;
        mVar2 = com.google.android.play.core.integrity.l.f3827a;
        com.google.android.play.integrity.internal.bb b3 = com.google.android.play.integrity.internal.ax.b(new com.google.android.play.core.integrity.al(b, b2, auVar, mVar2));
        this.d = b3;
        this.e = com.google.android.play.integrity.internal.ax.b(new com.google.android.play.core.integrity.ab(b3));
    }

    public final com.google.android.play.core.integrity.IntegrityManager a() {
        return (com.google.android.play.core.integrity.IntegrityManager) this.e.a();
    }
}
