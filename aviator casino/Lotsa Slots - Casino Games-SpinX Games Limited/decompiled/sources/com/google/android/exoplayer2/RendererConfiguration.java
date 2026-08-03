package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class RendererConfiguration {
    public static final com.google.android.exoplayer2.RendererConfiguration DEFAULT = new com.google.android.exoplayer2.RendererConfiguration(false);
    public final boolean tunneling;

    public RendererConfiguration(boolean z) {
        this.tunneling = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.tunneling == ((com.google.android.exoplayer2.RendererConfiguration) obj).tunneling;
    }

    public int hashCode() {
        return !this.tunneling ? 1 : 0;
    }
}
