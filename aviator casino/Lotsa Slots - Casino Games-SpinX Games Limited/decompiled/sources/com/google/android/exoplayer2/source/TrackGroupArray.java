package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class TrackGroupArray implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_TRACK_GROUPS = 0;
    private static final java.lang.String TAG = "TrackGroupArray";
    private int hashCode;
    public final int length;
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.TrackGroup> trackGroups;
    public static final com.google.android.exoplayer2.source.TrackGroupArray EMPTY = new com.google.android.exoplayer2.source.TrackGroupArray(new com.google.android.exoplayer2.source.TrackGroup[0]);
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.TrackGroupArray> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.TrackGroupArray$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.source.TrackGroupArray.lambda$static$0(bundle);
        }
    };

    public TrackGroupArray(com.google.android.exoplayer2.source.TrackGroup... trackGroupArr) {
        this.trackGroups = com.google.common.collect.ImmutableList.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public com.google.android.exoplayer2.source.TrackGroup get(int i) {
        return this.trackGroups.get(i);
    }

    public int indexOf(com.google.android.exoplayer2.source.TrackGroup trackGroup) {
        int indexOf = this.trackGroups.indexOf(trackGroup);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
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
        com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray = (com.google.android.exoplayer2.source.TrackGroupArray) obj;
        return this.length == trackGroupArray.length && this.trackGroups.equals(trackGroupArray.trackGroups);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(keyForField(0), com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(this.trackGroups));
        return bundle;
    }

    static /* synthetic */ com.google.android.exoplayer2.source.TrackGroupArray lambda$static$0(android.os.Bundle bundle) {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        if (parcelableArrayList == null) {
            return new com.google.android.exoplayer2.source.TrackGroupArray(new com.google.android.exoplayer2.source.TrackGroup[0]);
        }
        return new com.google.android.exoplayer2.source.TrackGroupArray((com.google.android.exoplayer2.source.TrackGroup[]) com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.source.TrackGroup.CREATOR, parcelableArrayList).toArray(new com.google.android.exoplayer2.source.TrackGroup[0]));
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.trackGroups.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.trackGroups.size(); i3++) {
                if (this.trackGroups.get(i).equals(this.trackGroups.get(i3))) {
                    com.google.android.exoplayer2.util.Log.e(TAG, "", new java.lang.IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
