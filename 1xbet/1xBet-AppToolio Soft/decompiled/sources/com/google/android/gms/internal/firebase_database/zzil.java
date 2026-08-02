package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzil extends zzii {
    private final /* synthetic */ zzim zzrj;

    zzil(zzim zzimVar) {
        this.zzrj = zzimVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzii
    /* renamed from: zzb */
    public final void visitEntry(zzid zzidVar, zzja zzjaVar) {
        this.zzrj.zzn(zzidVar);
        zzik.zza(zzjaVar, this.zzrj);
        this.zzrj.zzfs();
    }
}
