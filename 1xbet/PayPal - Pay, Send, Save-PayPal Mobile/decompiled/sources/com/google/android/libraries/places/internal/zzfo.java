package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzfo {
    private final java.lang.String zza;
    private final int zzb;
    private final com.google.android.libraries.places.internal.zzfn zzc;
    private final boolean zzd;
    private final int zze;

    public zzfo(android.net.wifi.WifiInfo wifiInfo, android.net.wifi.ScanResult scanResult) {
        com.google.android.libraries.places.internal.zzfn zzfnVar;
        java.lang.String str = scanResult.BSSID;
        java.lang.String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (android.text.TextUtils.isEmpty(str2)) {
            zzfnVar = com.google.android.libraries.places.internal.zzfn.OTHER;
        } else {
            java.lang.String upperCase = str2.toUpperCase(java.util.Locale.getDefault());
            zzfnVar = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? com.google.android.libraries.places.internal.zzfn.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? com.google.android.libraries.places.internal.zzfn.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? com.google.android.libraries.places.internal.zzfn.EAP : com.google.android.libraries.places.internal.zzfn.OTHER;
        }
        boolean z = false;
        if (wifiInfo != null && !android.text.TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.zza = str;
        this.zzb = i;
        this.zzc = zzfnVar;
        this.zzd = z;
        this.zze = i2;
    }

    public final int zze() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final com.google.android.libraries.places.internal.zzfn zzc() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
