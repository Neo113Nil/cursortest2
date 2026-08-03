package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzdb {
    public static boolean zza(boolean z) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? android.os.Build.FINGERPRINT.contains("generic") || android.os.Build.FINGERPRINT.contains("emulator") || android.os.Build.HARDWARE.contains("ranchu") : android.os.Build.DEVICE.startsWith("generic");
    }
}
