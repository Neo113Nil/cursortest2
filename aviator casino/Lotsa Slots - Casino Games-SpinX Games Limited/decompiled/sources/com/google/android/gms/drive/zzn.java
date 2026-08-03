package com.google.android.gms.drive;

@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class zzn extends com.google.android.gms.drive.ExecutionOptions {
    private boolean zzat;

    public static com.google.android.gms.drive.zzn zza(com.google.android.gms.drive.ExecutionOptions executionOptions) {
        com.google.android.gms.drive.zzp zzpVar = new com.google.android.gms.drive.zzp();
        if (executionOptions != null) {
            zzpVar.setConflictStrategy(executionOptions.zzn());
            zzpVar.setNotifyOnCompletion(executionOptions.zzm());
            java.lang.String zzl = executionOptions.zzl();
            if (zzl != null) {
                zzpVar.setTrackingTag(zzl);
            }
        }
        return (com.google.android.gms.drive.zzn) zzpVar.build();
    }

    private zzn(java.lang.String str, boolean z, int i, boolean z2) {
        super(str, z, i);
        this.zzat = z2;
    }

    public final boolean zzp() {
        return this.zzat;
    }
}
