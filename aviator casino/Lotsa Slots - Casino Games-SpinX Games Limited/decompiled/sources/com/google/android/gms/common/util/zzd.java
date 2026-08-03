package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzd {
    public static android.os.StrictMode.VmPolicy zza() {
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastS()) {
            android.os.StrictMode.setVmPolicy(com.google.android.gms.common.util.zzc.zza(new android.os.StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
