package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzee extends com.google.android.gms.internal.drive.zzet {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("EventCallback", "");
    private final com.google.android.gms.drive.events.zzi zzgt;
    private final com.google.android.gms.internal.drive.zzeg zzgu;
    private final java.util.List<java.lang.Integer> zzgv = new java.util.ArrayList();
    private final int zzda = 1;

    public zzee(android.os.Looper looper, android.content.Context context, int i, com.google.android.gms.drive.events.zzi zziVar) {
        this.zzgt = zziVar;
        this.zzgu = new com.google.android.gms.internal.drive.zzeg(looper, context);
    }

    public final void zzf(int i) {
        this.zzgv.add(1);
    }

    public final boolean zzg(int i) {
        return this.zzgv.contains(1);
    }

    @Override // com.google.android.gms.internal.drive.zzes
    public final void zzc(com.google.android.gms.internal.drive.zzfp zzfpVar) throws android.os.RemoteException {
        com.google.android.gms.drive.events.DriveEvent zzat = zzfpVar.zzat();
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzda == zzat.getType());
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzgv.contains(java.lang.Integer.valueOf(zzat.getType())));
        com.google.android.gms.internal.drive.zzeg zzegVar = this.zzgu;
        zzegVar.sendMessage(zzegVar.obtainMessage(1, new android.util.Pair(this.zzgt, zzat)));
    }
}
