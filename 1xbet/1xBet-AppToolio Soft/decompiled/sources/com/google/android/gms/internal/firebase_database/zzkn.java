package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzkn<T, U> {
    private final T first;
    private final U second;

    public zzkn(T t, U u) {
        this.first = t;
        this.second = u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkn zzknVar = (zzkn) obj;
        T t = this.first;
        if (t == null ? zzknVar.first != null : !t.equals(zzknVar.first)) {
            return false;
        }
        U u = this.second;
        return u == null ? zzknVar.second == null : u.equals(zzknVar.second);
    }

    public final T getFirst() {
        return this.first;
    }

    public final int hashCode() {
        T t = this.first;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        U u = this.second;
        return hashCode + (u != null ? u.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.first);
        String valueOf2 = String.valueOf(this.second);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length());
        sb.append("Pair(");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }

    public final U zzgv() {
        return this.second;
    }
}
