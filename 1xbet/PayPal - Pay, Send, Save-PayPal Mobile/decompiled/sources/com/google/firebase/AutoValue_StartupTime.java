package com.google.firebase;

/* loaded from: classes9.dex */
final class AutoValue_StartupTime extends com.google.firebase.StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    AutoValue_StartupTime(long j, long j2, long j3) {
        this.epochMillis = j;
        this.elapsedRealtime = j2;
        this.uptimeMillis = j3;
    }

    @Override // com.google.firebase.StartupTime
    public final long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public final long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StartupTime{epochMillis=");
        sb.append(this.epochMillis);
        sb.append(", elapsedRealtime=");
        sb.append(this.elapsedRealtime);
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.StartupTime)) {
            return false;
        }
        com.google.firebase.StartupTime startupTime = (com.google.firebase.StartupTime) obj;
        return this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis();
    }

    public final int hashCode() {
        long j = this.epochMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.elapsedRealtime;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.uptimeMillis;
        return ((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }
}
