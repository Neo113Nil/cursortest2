package androidx.media3.extractor.metadata.scte35;

/* loaded from: classes2.dex */
public abstract class SpliceCommand implements androidx.media3.common.Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ androidx.media3.common.Format getWrappedMetadataFormat() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        androidx.media3.common.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public java.lang.String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
