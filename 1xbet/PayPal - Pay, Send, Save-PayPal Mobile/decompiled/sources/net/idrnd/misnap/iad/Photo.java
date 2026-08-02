package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lnet/idrnd/misnap/iad/Photo;", "", "", "jpegData", "", "timestamp", "<init>", "([BJ)V", "a", "[B", "getJpegData$iad_2_4_3_misnap", "()[B", util.h.xy.cb.b.f1091, "J", "getTimestamp$iad_2_4_3_misnap", "()J"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class Photo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] jpegData;

    /* renamed from: b, reason: from kotlin metadata */
    public final long timestamp;

    public Photo(byte[] bArr, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.jpegData = bArr;
        this.timestamp = j;
    }

    /* renamed from: getJpegData$iad_2_4_3_misnap, reason: from getter */
    public final byte[] getJpegData() {
        return this.jpegData;
    }

    /* renamed from: getTimestamp$iad_2_4_3_misnap, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }
}
