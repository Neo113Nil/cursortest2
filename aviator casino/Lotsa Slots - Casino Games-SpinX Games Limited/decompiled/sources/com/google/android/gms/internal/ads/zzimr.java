package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimr {
    public static java.util.List zza(int i) {
        return i == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList(i);
    }

    static java.util.HashSet zzb(int i) {
        return new java.util.HashSet(zzd(i));
    }

    public static java.util.LinkedHashMap zzc(int i) {
        return new java.util.LinkedHashMap(zzd(i));
    }

    private static int zzd(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
