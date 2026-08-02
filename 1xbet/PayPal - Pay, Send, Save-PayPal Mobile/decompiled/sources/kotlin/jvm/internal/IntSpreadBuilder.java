package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/jvm/internal/IntSpreadBuilder;", "Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "getSize", "([I)I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "toArray", "()[I", "Camera2StreamConfigurationMap", "[I", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IntSpreadBuilder extends kotlin.jvm.internal.PrimitiveSpreadBuilder<int[]> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int[] getHighResolutionOutputSizeshNQ4ISI;

    public IntSpreadBuilder(int i) {
        super(i);
        this.getHighResolutionOutputSizeshNQ4ISI = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public final int getSize(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return iArr.length;
    }

    public final void add(int value) {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int position = getPosition();
        setPosition(position + 1);
        iArr[position] = value;
    }

    public final int[] toArray() {
        return toArray(this.getHighResolutionOutputSizeshNQ4ISI, new int[size()]);
    }
}
