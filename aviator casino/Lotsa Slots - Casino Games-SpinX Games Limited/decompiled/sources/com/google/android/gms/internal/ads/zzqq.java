package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzqq {
    public static com.google.android.gms.internal.ads.zzgwm zza(java.util.List list) {
        if (android.os.Build.VERSION.SDK_INT < 31 || list == null) {
            return com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        java.util.TreeSet treeSet = new java.util.TreeSet(java.util.Comparator.comparing(com.google.android.gms.internal.ads.zzqp.zza).reversed());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.AudioDescriptor audioDescriptor = (android.media.AudioDescriptor) it.next();
            if (audioDescriptor.getStandard() == 1) {
                byte[] descriptor = audioDescriptor.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 20);
                    sb.append("Invalid SAD length: ");
                    sb.append(length);
                    com.google.android.gms.internal.ads.zzeg.zzc("AudioDescriptorUtil", sb.toString());
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzfl.zzE(i)));
                    }
                }
            }
        }
        return com.google.android.gms.internal.ads.zzgwm.zzq(treeSet);
    }
}
