package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzqk extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqn zza;
    private final android.content.ContentResolver zzb;
    private final android.net.Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqk(com.google.android.gms.internal.ads.zzqn zzqnVar, android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(handler);
        java.util.Objects.requireNonNull(zzqnVar);
        this.zza = zzqnVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzi();
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
