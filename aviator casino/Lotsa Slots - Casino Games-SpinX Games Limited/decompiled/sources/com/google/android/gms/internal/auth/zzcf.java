package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzcf extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.auth.zzcg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcf(com.google.android.gms.internal.auth.zzcg zzcgVar, android.os.Handler handler) {
        super(null);
        this.zza = zzcgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zze();
    }
}
