package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzjx implements zzlh {
    private static final zzjx zza = new zzjx();

    private zzjx() {
    }

    public static zzjx zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlg zzb(Class cls) {
        if (!zzkc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzlg) zzkc.zzbC(cls.asSubclass(zzkc.class)).zzl(3, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean zzc(Class cls) {
        return zzkc.class.isAssignableFrom(cls);
    }
}
