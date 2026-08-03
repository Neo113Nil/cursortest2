package com.google.android.exoplayer2.text;

/* loaded from: classes3.dex */
public final class CueEncoder {
    public byte[] encode(java.util.List<com.google.android.exoplayer2.text.Cue> list) {
        java.util.ArrayList<android.os.Bundle> bundleArrayList = com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(list);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
