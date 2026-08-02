package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/jvm/internal/ShortSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "getSize", "([S)I", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(S)V", "toArray", "()[S", "Camera2StreamConfigurationMap", "[S", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ShortSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<short[]> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final short[] getHighSpeedVideoSizes;

    public ShortSpreadBuilder(int i) {
        super(i);
        this.getHighSpeedVideoSizes = new short[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public final int getSize(short[] sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        return sArr.length;
    }

    public final void add(short value) {
        short[] sArr = this.getHighSpeedVideoSizes;
        int position = getPosition();
        setPosition(position + 1);
        sArr[position] = value;
    }

    public final short[] toArray() {
        return toArray(this.getHighSpeedVideoSizes, new short[size()]);
    }
}
