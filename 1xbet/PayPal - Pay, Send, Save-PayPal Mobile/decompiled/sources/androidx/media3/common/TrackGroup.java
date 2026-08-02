package androidx.media3.common;

/* loaded from: classes7.dex */
public final class TrackGroup {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.media3.common.Format[] getHighSpeedVideoFpsRanges;
    public final java.lang.String id;
    public final int length;
    public final int type;
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public TrackGroup(androidx.media3.common.Format... formatArr) {
        this("", formatArr);
    }

    public TrackGroup(java.lang.String str, androidx.media3.common.Format... formatArr) {
        int trackType;
        int i = 1;
        com.google.common.base.Preconditions.checkArgument(formatArr.length > 0);
        this.id = str;
        this.getHighSpeedVideoFpsRanges = formatArr;
        this.length = formatArr.length;
        java.lang.String str2 = formatArr[0].sampleMimeType;
        if (android.text.TextUtils.isEmpty(str2)) {
            trackType = androidx.media3.common.MimeTypes.getTrackType(formatArr[0].containerMimeType);
        } else {
            trackType = androidx.media3.common.MimeTypes.getTrackType(str2);
        }
        this.type = trackType;
        java.lang.String str3 = formatArr[0].language;
        str3 = (str3 == null || str3.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str3;
        int i2 = formatArr[0].roleFlags | 16384;
        while (true) {
            androidx.media3.common.Format[] formatArr2 = this.getHighSpeedVideoFpsRanges;
            if (i >= formatArr2.length) {
                return;
            }
            java.lang.String str4 = formatArr2[i].language;
            if (!str3.equals((str4 == null || str4.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) ? "" : str4)) {
                getHighSpeedVideoSizes("languages", this.getHighSpeedVideoFpsRanges[0].language, this.getHighSpeedVideoFpsRanges[i].language, i);
                return;
            } else {
                if (i2 != (this.getHighSpeedVideoFpsRanges[i].roleFlags | 16384)) {
                    getHighSpeedVideoSizes("role flags", java.lang.Integer.toBinaryString(this.getHighSpeedVideoFpsRanges[0].roleFlags), java.lang.Integer.toBinaryString(this.getHighSpeedVideoFpsRanges[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    public final androidx.media3.common.TrackGroup copyWithId(java.lang.String str) {
        return new androidx.media3.common.TrackGroup(str, this.getHighSpeedVideoFpsRanges);
    }

    public final androidx.media3.common.Format getFormat(int i) {
        return this.getHighSpeedVideoFpsRanges[i];
    }

    public final int indexOf(androidx.media3.common.Format format) {
        int i = 0;
        while (true) {
            androidx.media3.common.Format[] formatArr = this.getHighSpeedVideoFpsRanges;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = ((this.id.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.TrackGroup trackGroup = (androidx.media3.common.TrackGroup) obj;
        return this.id.equals(trackGroup.id) && java.util.Arrays.equals(this.getHighSpeedVideoFpsRanges, trackGroup.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.id);
        sb.append(": ");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRanges));
        return sb.toString();
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.getHighSpeedVideoFpsRanges.length);
        for (androidx.media3.common.Format format : this.getHighSpeedVideoFpsRanges) {
            arrayList.add(format.toBundle());
        }
        bundle.putParcelableArrayList(getHighSpeedVideoSizes, arrayList);
        bundle.putString(Camera2StreamConfigurationMap, this.id);
        return bundle;
    }

    public static androidx.media3.common.TrackGroup fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getHighSpeedVideoSizes);
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.TrackGroup$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Format.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        return new androidx.media3.common.TrackGroup(bundle.getString(Camera2StreamConfigurationMap, ""), (androidx.media3.common.Format[]) fromBundleList.toArray(new androidx.media3.common.Format[0]));
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        androidx.media3.common.util.Log.e("TrackGroup", "", new java.lang.IllegalStateException(sb.toString()));
    }
}
