package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValueElementSequence implements kotlin.sequences.Sequence<androidx.compose.ui.platform.ValueElement> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.platform.ValueElement> getHighSpeedVideoSizes = new java.util.ArrayList();

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<androidx.compose.ui.platform.ValueElement> iterator() {
        return this.getHighSpeedVideoSizes.iterator();
    }

    public final void set(java.lang.String name2, java.lang.Object value) {
        this.getHighSpeedVideoSizes.add(new androidx.compose.ui.platform.ValueElement(name2, value));
    }
}
