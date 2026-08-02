package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
final class LongRational {
    final long getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoSizes;

    LongRational(long j, long j2) {
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
    }

    LongRational(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
