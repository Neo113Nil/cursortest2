package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziz {
    public static final com.google.android.gms.internal.ads.zziz zza = new com.google.android.gms.internal.ads.zziy().zzg();
    private final java.util.Map zzb;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zziz) {
            return this.zzb.equals(((com.google.android.gms.internal.ads.zziz) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final java.util.Set zza() {
        return this.zzb.keySet();
    }

    public final void zzb(android.media.MediaFormat mediaFormat) {
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof java.lang.Integer) {
                mediaFormat.setInteger(str, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                mediaFormat.setLong(str, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Float) {
                mediaFormat.setFloat(str, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.lang.String) {
                mediaFormat.setString(str, (java.lang.String) value);
            } else if (value instanceof java.nio.ByteBuffer) {
                mediaFormat.setByteBuffer(str, (java.nio.ByteBuffer) value);
            }
        }
    }

    final /* synthetic */ java.util.Map zzc() {
        return this.zzb;
    }
}
