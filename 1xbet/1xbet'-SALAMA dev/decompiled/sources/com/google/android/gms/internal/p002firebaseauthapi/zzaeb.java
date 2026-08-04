package com.google.android.gms.internal.p002firebaseauthapi;

import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaeb implements zzaeg {
    private final /* synthetic */ String zza;

    public zzaeb(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(m mVar, Object... objArr) {
        mVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
