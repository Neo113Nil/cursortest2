package androidx.media3.common;

/* loaded from: classes7.dex */
public final class Tracks {
    public static final androidx.media3.common.Tracks EMPTY = new androidx.media3.common.Tracks(com.google.common.collect.ImmutableList.of());
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private final com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> getHighResolutionOutputSizeshNQ4ISI;

    public static final class Group {
        private final boolean Camera2StreamConfigurationMap;
        private final int[] getInputFormats;
        private final androidx.media3.common.TrackGroup getInputSizeshNQ4ISI;
        private final boolean[] getOutputFormats;
        public final int length;
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public Group(androidx.media3.common.TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            com.google.common.base.Preconditions.checkArgument(i == iArr.length && i == zArr.length);
            this.getInputSizeshNQ4ISI = trackGroup;
            this.Camera2StreamConfigurationMap = z && i > 1;
            this.getInputFormats = (int[]) iArr.clone();
            this.getOutputFormats = (boolean[]) zArr.clone();
        }

        public final androidx.media3.common.TrackGroup getMediaTrackGroup() {
            return this.getInputSizeshNQ4ISI;
        }

        public final androidx.media3.common.Format getTrackFormat(int i) {
            return this.getInputSizeshNQ4ISI.getFormat(i);
        }

        public final int getTrackSupport(int i) {
            return this.getInputFormats[i];
        }

        public final boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public final boolean isTrackSupported(int i, boolean z) {
            int i2 = this.getInputFormats[i];
            if (i2 != 4) {
                return z && i2 == 3;
            }
            return true;
        }

        public final boolean isSelected() {
            return com.google.common.primitives.Booleans.contains(this.getOutputFormats, true);
        }

        public final boolean isAdaptiveSupported() {
            return this.Camera2StreamConfigurationMap;
        }

        public final boolean isSupported() {
            return isSupported(false);
        }

        public final boolean isSupported(boolean z) {
            for (int i = 0; i < this.getInputFormats.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isTrackSelected(int i) {
            return this.getOutputFormats[i];
        }

        public final int getType() {
            return this.getInputSizeshNQ4ISI.type;
        }

        public final androidx.media3.common.Tracks.Group copyWithId(java.lang.String str) {
            return new androidx.media3.common.Tracks.Group(this.getInputSizeshNQ4ISI.copyWithId(str), this.Camera2StreamConfigurationMap, this.getInputFormats, this.getOutputFormats);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) obj;
            return this.Camera2StreamConfigurationMap == group.Camera2StreamConfigurationMap && this.getInputSizeshNQ4ISI.equals(group.getInputSizeshNQ4ISI) && java.util.Arrays.equals(this.getInputFormats, group.getInputFormats) && java.util.Arrays.equals(this.getOutputFormats, group.getOutputFormats);
        }

        public final int hashCode() {
            int hashCode = this.getInputSizeshNQ4ISI.hashCode();
            boolean z = this.Camera2StreamConfigurationMap;
            return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.getInputFormats)) * 31) + java.util.Arrays.hashCode(this.getOutputFormats);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI.toBundle());
            bundle.putIntArray(getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats);
            bundle.putBooleanArray(getHighSpeedVideoFpsRanges, this.getOutputFormats);
            bundle.putBoolean(getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            return bundle;
        }

        public static androidx.media3.common.Tracks.Group fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.TrackGroup fromBundle = androidx.media3.common.TrackGroup.fromBundle((android.os.Bundle) com.google.common.base.Preconditions.checkNotNull(bundle.getBundle(getHighSpeedVideoSizes)));
            return new androidx.media3.common.Tracks.Group(fromBundle, bundle.getBoolean(getHighSpeedVideoFpsRangesFor, false), (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(getHighResolutionOutputSizeshNQ4ISI), new int[fromBundle.length]), (boolean[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getBooleanArray(getHighSpeedVideoFpsRanges), new boolean[fromBundle.length]));
        }
    }

    public Tracks(java.util.List<androidx.media3.common.Tracks.Group> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    public final com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> getGroups() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public final boolean containsType(int i) {
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    public final boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get(i2).getType() == i && this.getHighResolutionOutputSizeshNQ4ISI.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public final boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @java.lang.Deprecated
    public final boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }

    public final boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
            androidx.media3.common.Tracks.Group group = this.getHighResolutionOutputSizeshNQ4ISI.get(i2);
            if (group.isSelected() && group.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(((androidx.media3.common.Tracks) obj).getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(getHighSpeedVideoFpsRangesFor, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.getHighResolutionOutputSizeshNQ4ISI, new com.google.common.base.Function() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.Tracks.Group) obj).toBundle();
            }
        }));
        return bundle;
    }

    public static androidx.media3.common.Tracks fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getHighSpeedVideoFpsRangesFor);
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.Tracks$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Tracks.Group.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        return new androidx.media3.common.Tracks(fromBundleList);
    }
}
