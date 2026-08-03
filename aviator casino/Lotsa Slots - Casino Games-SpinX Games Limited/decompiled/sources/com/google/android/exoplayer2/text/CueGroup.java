package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class CueGroup implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_CUES = 0;
    private static final int FIELD_PRESENTATION_TIME_US = 1;
    public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> cues;
    public final long presentationTimeUs;
    public static final com.google.android.exoplayer2.text.CueGroup EMPTY_TIME_ZERO = new com.google.android.exoplayer2.text.CueGroup(com.google.common.collect.ImmutableList.of(), 0);
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.text.CueGroup> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.CueGroup$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.text.CueGroup fromBundle;
            fromBundle = com.google.android.exoplayer2.text.CueGroup.fromBundle(bundle);
            return fromBundle;
        }
    };

    public CueGroup(java.util.List<com.google.android.exoplayer2.text.Cue> list, long j) {
        this.cues = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.presentationTimeUs = j;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList(keyForField(0), com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(filterOutBitmapCues(this.cues)));
        bundle.putLong(keyForField(1), this.presentationTimeUs);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.android.exoplayer2.text.CueGroup fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.text.Cue.CREATOR, parcelableArrayList);
        }
        return new com.google.android.exoplayer2.text.CueGroup(fromBundleList, bundle.getLong(keyForField(1)));
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> filterOutBitmapCues(java.util.List<com.google.android.exoplayer2.text.Cue> list) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                builder.add((com.google.common.collect.ImmutableList.Builder) list.get(i));
            }
        }
        return builder.build();
    }
}
