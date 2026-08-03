package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class CueDecoder {
    static final java.lang.String BUNDLED_CUES = "c";

    public com.google.common.collect.ImmutableList<com.google.android.exoplayer2.text.Cue> decode(byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        android.os.Bundle readBundle = obtain.readBundle(android.os.Bundle.class.getClassLoader());
        obtain.recycle();
        return com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.text.Cue.CREATOR, (java.util.ArrayList) com.google.android.exoplayer2.util.Assertions.checkNotNull(readBundle.getParcelableArrayList(BUNDLED_CUES)));
    }
}
