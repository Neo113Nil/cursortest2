package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/jvm/internal/BooleanSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "getSize", "([Z)I", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Z)V", "toArray", "()[Z", "getHighResolutionOutputSizeshNQ4ISI", "[Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BooleanSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<boolean[]> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean[] getHighSpeedVideoSizes;

    public BooleanSpreadBuilder(int i) {
        super(i);
        this.getHighSpeedVideoSizes = new boolean[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public final int getSize(boolean[] zArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zArr, "");
        return zArr.length;
    }

    public final void add(boolean value) {
        boolean[] zArr = this.getHighSpeedVideoSizes;
        int position = getPosition();
        setPosition(position + 1);
        zArr[position] = value;
    }

    public final boolean[] toArray() {
        return toArray(this.getHighSpeedVideoSizes, new boolean[size()]);
    }
}
