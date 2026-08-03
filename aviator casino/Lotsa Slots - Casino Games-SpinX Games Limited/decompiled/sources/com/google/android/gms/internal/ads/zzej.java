package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzej {
    public static void zza(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 4);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), java.nio.ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void zzb(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
