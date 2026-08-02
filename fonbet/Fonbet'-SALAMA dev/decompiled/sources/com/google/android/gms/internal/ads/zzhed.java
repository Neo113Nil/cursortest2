package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhed {
    public static HashSet zza(int i7) {
        return new HashSet(zzd(i7));
    }

    public static LinkedHashMap zzb(int i7) {
        return new LinkedHashMap(zzd(i7));
    }

    public static List zzc(int i7) {
        return i7 == 0 ? Collections.emptyList() : new ArrayList(i7);
    }

    private static int zzd(int i7) {
        return i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : f.API_PRIORITY_OTHER;
    }
}
