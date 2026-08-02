package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012'\u0010\n\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\t\u0012\u0019\u0010\r\u001a\u0015\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R2\u0010\u0013\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\t8\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0015\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "", "p1", "p2", "<init>", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function4;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PagerLayoutIntervalContent extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent<androidx.compose.foundation.pager.PagerIntervalContent> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function4<androidx.compose.foundation.pager.PagerScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.pager.PagerIntervalContent> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutIntervalContent(kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, int i) {
        this.getHighSpeedVideoSizes = function4;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        androidx.compose.foundation.lazy.layout.MutableIntervalList mutableIntervalList = new androidx.compose.foundation.lazy.layout.MutableIntervalList();
        mutableIntervalList.addInterval(i, new androidx.compose.foundation.pager.PagerIntervalContent(function1, function4));
        this.Camera2StreamConfigurationMap = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final androidx.compose.foundation.lazy.layout.IntervalList<androidx.compose.foundation.pager.PagerIntervalContent> getIntervals() {
        return this.Camera2StreamConfigurationMap;
    }
}
