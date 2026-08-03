package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
public class zzg extends android.os.Handler {
    private final android.os.Looper zza;

    public zzg() {
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzg(android.os.Looper looper) {
        super(looper);
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzg(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zza = android.os.Looper.getMainLooper();
    }
}
