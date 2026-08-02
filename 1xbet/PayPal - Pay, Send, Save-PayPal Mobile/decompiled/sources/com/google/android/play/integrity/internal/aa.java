package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class aa extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.IBinder f3838a;
    final /* synthetic */ com.google.android.play.integrity.internal.ad b;

    aa(com.google.android.play.integrity.internal.ad adVar, android.os.IBinder iBinder) {
        this.f3838a = iBinder;
        this.b = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.z zVar;
        java.util.List list;
        java.util.List list2;
        zVar = this.b.f3840a.j;
        this.b.f3840a.f3842o = (android.os.IInterface) zVar.a(this.f3838a);
        com.google.android.play.integrity.internal.ae.r(this.b.f3840a);
        this.b.f3840a.h = false;
        list = this.b.f3840a.e;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        list2 = this.b.f3840a.e;
        list2.clear();
    }
}
