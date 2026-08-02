package androidx.media3.common.text;

/* loaded from: classes7.dex */
public final class CueGroup {
    public final com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> cues;
    public final long presentationTimeUs;
    private static final com.google.common.collect.Ordering<androidx.media3.common.text.Cue> getHighResolutionOutputSizeshNQ4ISI = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            java.lang.Integer valueOf;
            valueOf = java.lang.Integer.valueOf(((androidx.media3.common.text.Cue) obj).zIndex);
            return valueOf;
        }
    });
    public static final androidx.media3.common.text.CueGroup EMPTY_TIME_ZERO = new androidx.media3.common.text.CueGroup(com.google.common.collect.ImmutableList.of(), 0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public CueGroup(java.util.List<androidx.media3.common.text.Cue> list, long j) {
        this.cues = com.google.common.collect.ImmutableList.sortedCopyOf(getHighResolutionOutputSizeshNQ4ISI, list);
        this.presentationTimeUs = j;
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = Camera2StreamConfigurationMap;
        com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> immutableList = this.cues;
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i).bitmap == null) {
                builder.add((com.google.common.collect.ImmutableList.Builder) immutableList.get(i));
            }
        }
        bundle.putParcelableArrayList(str, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(builder.build(), new com.google.common.base.Function() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.text.Cue) obj).toBinderBasedBundle();
            }
        }));
        bundle.putLong(getHighSpeedVideoSizes, this.presentationTimeUs);
        return bundle;
    }

    public static androidx.media3.common.text.CueGroup fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(Camera2StreamConfigurationMap);
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.text.CueGroup$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.text.Cue.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        return new androidx.media3.common.text.CueGroup(fromBundleList, bundle.getLong(getHighSpeedVideoSizes));
    }
}
