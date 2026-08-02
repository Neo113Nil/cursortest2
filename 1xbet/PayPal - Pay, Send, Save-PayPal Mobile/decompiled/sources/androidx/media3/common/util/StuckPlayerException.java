package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class StuckPlayerException extends java.lang.IllegalStateException {
    public static final int STUCK_BUFFERING_NOT_LOADING = 0;
    public static final int STUCK_BUFFERING_NO_PROGRESS = 1;
    public static final int STUCK_PLAYING_NOT_ENDING = 3;
    public static final int STUCK_PLAYING_NO_PROGRESS = 2;
    public static final int STUCK_SUPPRESSED = 4;
    public final int stuckType;
    public final int timeoutMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StuckType {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.util.StuckPlayerException stuckPlayerException = (androidx.media3.common.util.StuckPlayerException) obj;
        return this.stuckType == stuckPlayerException.stuckType && this.timeoutMs == stuckPlayerException.timeoutMs;
    }

    public final int hashCode() {
        return ((this.stuckType + 527) * 31) + this.timeoutMs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StuckPlayerException(int i, int i2) {
        super(r0);
        java.lang.String obj;
        if (i == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Player stuck buffering and not loading for ");
            sb.append(i2);
            sb.append(" ms");
            obj = sb.toString();
        } else if (i == 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Player stuck buffering with no progress for ");
            sb2.append(i2);
            sb2.append(" ms");
            obj = sb2.toString();
        } else if (i == 2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Player stuck playing with no progress for ");
            sb3.append(i2);
            sb3.append(" ms");
            obj = sb3.toString();
        } else if (i == 3) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Player stuck playing without ending for ");
            sb4.append(i2);
            sb4.append(" ms");
            obj = sb4.toString();
        } else if (i == 4) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Player stuck suppressed for ");
            sb5.append(i2);
            sb5.append(" ms");
            obj = sb5.toString();
        } else {
            throw new java.lang.IllegalStateException();
        }
        this.stuckType = i;
        this.timeoutMs = i2;
    }
}
