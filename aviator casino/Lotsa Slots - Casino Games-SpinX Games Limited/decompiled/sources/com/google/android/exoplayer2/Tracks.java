package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class Tracks implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_TRACK_GROUPS = 0;
    private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> groups;
    public static final com.google.android.exoplayer2.Tracks EMPTY = new com.google.android.exoplayer2.Tracks(com.google.common.collect.ImmutableList.of());
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Tracks> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Tracks$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.Tracks.lambda$static$0(bundle);
        }
    };

    public static final class Group implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Tracks.Group> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Tracks$Group$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                return com.google.android.exoplayer2.Tracks.Group.lambda$static$0(bundle);
            }
        };
        private static final int FIELD_ADAPTIVE_SUPPORTED = 4;
        private static final int FIELD_TRACK_GROUP = 0;
        private static final int FIELD_TRACK_SELECTED = 3;
        private static final int FIELD_TRACK_SUPPORT = 1;
        private final boolean adaptiveSupported;
        public final int length;
        private final com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        public Group(com.google.android.exoplayer2.source.TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = false;
            com.google.android.exoplayer2.util.Assertions.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.adaptiveSupported = z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public com.google.android.exoplayer2.source.TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public com.google.android.exoplayer2.Format getTrackFormat(int i) {
            return this.mediaTrackGroup.getFormat(i);
        }

        public int getTrackSupport(int i) {
            return this.trackSupport[i];
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.trackSupport[i];
            return i2 == 4 || (z && i2 == 3);
        }

        public boolean isSelected() {
            return com.google.common.primitives.Booleans.contains(this.trackSelected, true);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.trackSupport.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i) {
            return this.trackSelected[i];
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
            com.google.android.exoplayer2.Tracks.Group group = (com.google.android.exoplayer2.Tracks.Group) obj;
            return this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && java.util.Arrays.equals(this.trackSupport, group.trackSupport) && java.util.Arrays.equals(this.trackSelected, group.trackSelected);
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.trackSupport)) * 31) + java.util.Arrays.hashCode(this.trackSelected);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(keyForField(0), this.mediaTrackGroup.toBundle());
            bundle.putIntArray(keyForField(1), this.trackSupport);
            bundle.putBooleanArray(keyForField(3), this.trackSelected);
            bundle.putBoolean(keyForField(4), this.adaptiveSupported);
            return bundle;
        }

        static /* synthetic */ com.google.android.exoplayer2.Tracks.Group lambda$static$0(android.os.Bundle bundle) {
            com.google.android.exoplayer2.source.TrackGroup fromBundle = com.google.android.exoplayer2.source.TrackGroup.CREATOR.fromBundle((android.os.Bundle) com.google.android.exoplayer2.util.Assertions.checkNotNull(bundle.getBundle(keyForField(0))));
            return new com.google.android.exoplayer2.Tracks.Group(fromBundle, bundle.getBoolean(keyForField(4), false), (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(keyForField(1)), new int[fromBundle.length]), (boolean[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getBooleanArray(keyForField(3)), new boolean[fromBundle.length]));
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    public Tracks(java.util.List<com.google.android.exoplayer2.Tracks.Group> list) {
        this.groups = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    public com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Tracks.Group> getGroups() {
        return this.groups;
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            if (this.groups.get(i2).getType() == i && this.groups.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @java.lang.Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.groups.size(); i2++) {
            com.google.android.exoplayer2.Tracks.Group group = this.groups.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((com.google.android.exoplayer2.Tracks) obj).groups);
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(keyForField(0), com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    static /* synthetic */ com.google.android.exoplayer2.Tracks lambda$static$0(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.Tracks.Group.CREATOR, parcelableArrayList);
        }
        return new com.google.android.exoplayer2.Tracks(fromBundleList);
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
