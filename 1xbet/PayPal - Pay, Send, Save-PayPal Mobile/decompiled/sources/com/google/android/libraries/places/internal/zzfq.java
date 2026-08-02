package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfq {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = java.util.concurrent.TimeUnit.MINUTES.toMicros(1);
    private final com.google.android.libraries.places.internal.zzef zzc;
    private final android.content.Context zzd;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r14.contains("_optout") == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.collect.ImmutableList zza(java.lang.String str) {
        boolean z;
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) this.zzd.getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return com.google.common.collect.ImmutableList.of();
        }
        java.util.List<android.net.wifi.ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null || scanResults.isEmpty()) {
            return com.google.common.collect.ImmutableList.of();
        }
        com.google.common.collect.ImmutableList immutableSortedCopy = com.google.common.collect.Ordering.from(com.google.android.libraries.places.internal.zzfp.zza).immutableSortedCopy(scanResults);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.wifi.WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        int size = immutableSortedCopy.size();
        for (int i = 0; i < size; i++) {
            android.net.wifi.ScanResult scanResult = (android.net.wifi.ScanResult) immutableSortedCopy.get(i);
            if (scanResult != null && !android.text.TextUtils.isEmpty(scanResult.SSID)) {
                long zzb2 = this.zzc.zzb();
                long j = scanResult.timestamp;
                long j2 = zzb;
                java.lang.String str2 = scanResult.SSID;
                if (str2 == null) {
                    throw new java.lang.IllegalArgumentException("Null SSID.");
                }
                if (str2.indexOf(95) >= 0) {
                    java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ENGLISH);
                    z = true;
                    if (!lowerCase.contains("_nomap")) {
                    }
                    if ((zzb2 * 1000) - j <= j2 && !z) {
                        arrayList.add(new com.google.android.libraries.places.internal.zzfo(connectionInfo, scanResult));
                    }
                }
                z = false;
                if ((zzb2 * 1000) - j <= j2) {
                    arrayList.add(new com.google.android.libraries.places.internal.zzfo(connectionInfo, scanResult));
                }
            }
        }
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    zzfq(android.content.Context context, com.google.android.libraries.places.internal.zzef zzefVar) {
        this.zzd = context;
        this.zzc = zzefVar;
    }
}
