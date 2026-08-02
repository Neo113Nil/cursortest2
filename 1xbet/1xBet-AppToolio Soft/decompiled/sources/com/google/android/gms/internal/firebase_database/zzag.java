package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzag {
    public static void zza(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        String valueOf = String.valueOf(String.format(str, objArr));
        throw new AssertionError(valueOf.length() != 0 ? "hardAssert failed: ".concat(valueOf) : new String("hardAssert failed: "));
    }

    public static Long zzb(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static String zzb(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    public static List<String> zzg(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }
}
