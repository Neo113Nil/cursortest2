package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class TrackSelectionArray {
    private int hashCode;
    public final int length;
    private final com.google.android.exoplayer2.trackselection.TrackSelection[] trackSelections;

    public TrackSelectionArray(com.google.android.exoplayer2.trackselection.TrackSelection... trackSelectionArr) {
        this.trackSelections = trackSelectionArr;
        this.length = trackSelectionArr.length;
    }

    public com.google.android.exoplayer2.trackselection.TrackSelection get(int i) {
        return this.trackSelections[i];
    }

    public com.google.android.exoplayer2.trackselection.TrackSelection[] getAll() {
        return (com.google.android.exoplayer2.trackselection.TrackSelection[]) this.trackSelections.clone();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + java.util.Arrays.hashCode(this.trackSelections);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.trackSelections, ((com.google.android.exoplayer2.trackselection.TrackSelectionArray) obj).trackSelections);
    }
}
