package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final /* synthetic */ class zzfp implements java.util.Comparator {
    static final /* synthetic */ com.google.android.libraries.places.internal.zzfp zza = new com.google.android.libraries.places.internal.zzfp();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((android.net.wifi.ScanResult) obj2).level - ((android.net.wifi.ScanResult) obj).level;
    }

    private /* synthetic */ zzfp() {
    }
}
