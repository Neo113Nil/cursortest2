package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class ad implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.integrity.internal.ae f3840a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.play.integrity.internal.s sVar;
        sVar = this.f3840a.c;
        sVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f3840a.c().post(new com.google.android.play.integrity.internal.aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.play.integrity.internal.s sVar;
        sVar = this.f3840a.c;
        sVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f3840a.c().post(new com.google.android.play.integrity.internal.ab(this));
    }

    /* synthetic */ ad(com.google.android.play.integrity.internal.ae aeVar, com.google.android.play.integrity.internal.ac acVar) {
        this.f3840a = aeVar;
    }
}
