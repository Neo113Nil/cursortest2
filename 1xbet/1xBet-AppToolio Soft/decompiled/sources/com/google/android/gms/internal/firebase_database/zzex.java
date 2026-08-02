package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzex {
    private final long zzlq;

    public zzex(long j) {
        this.zzlq = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzlq == ((zzex) obj).zzlq;
    }

    public final int hashCode() {
        long j = this.zzlq;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.zzlq;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Tag{tagNumber=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public final long zzcm() {
        return this.zzlq;
    }
}
