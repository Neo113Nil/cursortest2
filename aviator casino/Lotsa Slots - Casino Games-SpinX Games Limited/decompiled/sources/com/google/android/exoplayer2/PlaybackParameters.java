package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class PlaybackParameters implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_PITCH = 1;
    private static final int FIELD_SPEED = 0;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final com.google.android.exoplayer2.PlaybackParameters DEFAULT = new com.google.android.exoplayer2.PlaybackParameters(1.0f);
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PlaybackParameters> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.PlaybackParameters$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.PlaybackParameters.lambda$static$0(bundle);
        }
    };

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(float f, float f2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(f > 0.0f);
        com.google.android.exoplayer2.util.Assertions.checkArgument(f2 > 0.0f);
        this.speed = f;
        this.pitch = f2;
        this.scaledUsPerMs = java.lang.Math.round(f * 1000.0f);
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * this.scaledUsPerMs;
    }

    public com.google.android.exoplayer2.PlaybackParameters withSpeed(float f) {
        return new com.google.android.exoplayer2.PlaybackParameters(f, this.pitch);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.PlaybackParameters playbackParameters = (com.google.android.exoplayer2.PlaybackParameters) obj;
        return this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch;
    }

    public int hashCode() {
        return ((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + java.lang.Float.floatToRawIntBits(this.speed)) * 31) + java.lang.Float.floatToRawIntBits(this.pitch);
    }

    public java.lang.String toString() {
        return com.google.android.exoplayer2.util.Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.speed), java.lang.Float.valueOf(this.pitch));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(keyForField(0), this.speed);
        bundle.putFloat(keyForField(1), this.pitch);
        return bundle;
    }

    static /* synthetic */ com.google.android.exoplayer2.PlaybackParameters lambda$static$0(android.os.Bundle bundle) {
        return new com.google.android.exoplayer2.PlaybackParameters(bundle.getFloat(keyForField(0), 1.0f), bundle.getFloat(keyForField(1), 1.0f));
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
