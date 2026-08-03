package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class TrackSelectionOverride implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.TrackSelectionOverride$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.trackselection.TrackSelectionOverride.lambda$static$0(bundle);
        }
    };
    private static final int FIELD_TRACKS = 1;
    private static final int FIELD_TRACK_GROUP = 0;
    public final com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup;
    public final com.google.common.collect.ImmutableList<java.lang.Integer> trackIndices;

    public TrackSelectionOverride(com.google.android.exoplayer2.source.TrackGroup trackGroup, int i) {
        this(trackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i)));
    }

    public TrackSelectionOverride(com.google.android.exoplayer2.source.TrackGroup trackGroup, java.util.List<java.lang.Integer> list) {
        if (!list.isEmpty() && (((java.lang.Integer) java.util.Collections.min(list)).intValue() < 0 || ((java.lang.Integer) java.util.Collections.max(list)).intValue() >= trackGroup.length)) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.mediaTrackGroup = trackGroup;
        this.trackIndices = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    public int getType() {
        return this.mediaTrackGroup.type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) obj;
        return this.mediaTrackGroup.equals(trackSelectionOverride.mediaTrackGroup) && this.trackIndices.equals(trackSelectionOverride.trackIndices);
    }

    public int hashCode() {
        return this.mediaTrackGroup.hashCode() + (this.trackIndices.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBundle(keyForField(0), this.mediaTrackGroup.toBundle());
        bundle.putIntArray(keyForField(1), com.google.common.primitives.Ints.toArray(this.trackIndices));
        return bundle;
    }

    static /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionOverride lambda$static$0(android.os.Bundle bundle) {
        return new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(com.google.android.exoplayer2.source.TrackGroup.CREATOR.fromBundle((android.os.Bundle) com.google.android.exoplayer2.util.Assertions.checkNotNull(bundle.getBundle(keyForField(0)))), com.google.common.primitives.Ints.asList((int[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(bundle.getIntArray(keyForField(1)))));
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
