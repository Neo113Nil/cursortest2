package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public final class CueEncoder {
    public byte[] encode(java.util.List<androidx.media3.common.text.Cue> list, long j) {
        java.util.ArrayList<android.os.Bundle> bundleArrayList = androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(list, new com.google.common.base.Function() { // from class: androidx.media3.extractor.text.CueEncoder$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.text.Cue) obj).toSerializableBundle();
            }
        });
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
