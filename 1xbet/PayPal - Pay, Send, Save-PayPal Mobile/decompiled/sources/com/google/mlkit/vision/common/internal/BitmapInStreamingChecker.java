package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class BitmapInStreamingChecker {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("StreamingFormatChecker", "");
    private final java.util.LinkedList zzb = new java.util.LinkedList();
    private long zzc = -1;

    public void check(com.google.mlkit.vision.common.InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.zzb.add(java.lang.Long.valueOf(elapsedRealtime));
            if (this.zzb.size() > 5) {
                this.zzb.removeFirst();
            }
            if (this.zzb.size() != 5 || elapsedRealtime - ((java.lang.Long) com.google.android.gms.common.internal.Preconditions.checkNotNull((java.lang.Long) this.zzb.peekFirst())).longValue() >= 5000) {
                return;
            }
            long j = this.zzc;
            if (j == -1 || elapsedRealtime - j >= java.util.concurrent.TimeUnit.SECONDS.toMillis(5L)) {
                this.zzc = elapsedRealtime;
                zza.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
            }
        }
    }
}
