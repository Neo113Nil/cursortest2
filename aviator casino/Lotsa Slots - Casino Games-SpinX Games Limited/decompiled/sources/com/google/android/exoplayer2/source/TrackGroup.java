package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class TrackGroup implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.TrackGroup> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.TrackGroup$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.source.TrackGroup.lambda$static$0(bundle);
        }
    };
    private static final int FIELD_FORMATS = 0;
    private static final int FIELD_ID = 1;
    private static final java.lang.String TAG = "TrackGroup";
    private final com.google.android.exoplayer2.Format[] formats;
    private int hashCode;
    public final java.lang.String id;
    public final int length;
    public final int type;

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    public TrackGroup(com.google.android.exoplayer2.Format... formatArr) {
        this("", formatArr);
    }

    public TrackGroup(java.lang.String str, com.google.android.exoplayer2.Format... formatArr) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = com.google.android.exoplayer2.util.MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? com.google.android.exoplayer2.util.MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }

    public com.google.android.exoplayer2.source.TrackGroup copyWithId(java.lang.String str) {
        return new com.google.android.exoplayer2.source.TrackGroup(str, this.formats);
    }

    public com.google.android.exoplayer2.Format getFormat(int i) {
        return this.formats[i];
    }

    public int indexOf(com.google.android.exoplayer2.Format format) {
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + java.util.Arrays.hashCode(this.formats);
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
        com.google.android.exoplayer2.source.TrackGroup trackGroup = (com.google.android.exoplayer2.source.TrackGroup) obj;
        return this.id.equals(trackGroup.id) && java.util.Arrays.equals(this.formats, trackGroup.formats);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.formats.length);
        for (com.google.android.exoplayer2.Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(keyForField(0), arrayList);
        bundle.putString(keyForField(1), this.id);
        return bundle;
    }

    static /* synthetic */ com.google.android.exoplayer2.source.TrackGroup lambda$static$0(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.Format.CREATOR, parcelableArrayList);
        }
        return new com.google.android.exoplayer2.source.TrackGroup(bundle.getString(keyForField(1), ""), (com.google.android.exoplayer2.Format[]) fromBundleList.toArray(new com.google.android.exoplayer2.Format[0]));
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private void verifyCorrectness() {
        java.lang.String normalizeLanguage = normalizeLanguage(this.formats[0].language);
        int normalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            com.google.android.exoplayer2.Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!normalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                logErrorMessage("languages", this.formats[0].language, this.formats[i].language, i);
                return;
            } else {
                if (normalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                    logErrorMessage("role flags", java.lang.Integer.toBinaryString(this.formats[0].roleFlags), java.lang.Integer.toBinaryString(this.formats[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    private static java.lang.String normalizeLanguage(java.lang.String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void logErrorMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        com.google.android.exoplayer2.util.Log.e(TAG, "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
