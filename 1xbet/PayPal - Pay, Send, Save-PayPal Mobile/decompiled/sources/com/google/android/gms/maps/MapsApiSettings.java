package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public final class MapsApiSettings {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String zzb = "MapsApiSettings";

    public static void addInternalUsageAttributionId(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.maps.internal.zzcc.zzb(new com.google.android.gms.maps.zzaj(context, str));
        } catch (android.os.RemoteException unused) {
        }
    }

    private MapsApiSettings() {
    }
}
