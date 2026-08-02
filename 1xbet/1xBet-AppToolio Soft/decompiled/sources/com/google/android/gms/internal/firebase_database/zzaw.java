package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaw {
    private final List<String> zzei;
    private final Map<String, Object> zzej;

    public zzaw(List<String> list, Map<String, Object> map) {
        this.zzei = list;
        this.zzej = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        if (this.zzei.equals(zzawVar.zzei)) {
            return this.zzej.equals(zzawVar.zzej);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzei.hashCode() * 31) + this.zzej.hashCode();
    }

    public final String toString() {
        String zzb = zzag.zzb(this.zzei);
        String valueOf = String.valueOf(this.zzej);
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 11 + String.valueOf(valueOf).length());
        sb.append(zzb);
        sb.append(" (params: ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
