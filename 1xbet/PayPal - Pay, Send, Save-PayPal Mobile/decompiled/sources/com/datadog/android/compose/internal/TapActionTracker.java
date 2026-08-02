package com.datadog.android.compose.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017"}, d2 = {"Lcom/datadog/android/compose/internal/TapActionTracker;", "Lkotlin/Function0;", "", "", "targetName", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Landroidx/compose/runtime/State;", "onTap", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "<init>", "(Ljava/lang/String;Ljava/util/Map;Landroidx/compose/runtime/State;Lcom/datadog/android/rum/RumMonitor;)V", "invoke", "()V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/RumMonitor;", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapActionTracker implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumMonitor getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public TapActionTracker(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, com.datadog.android.rum.RumMonitor rumMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumMonitor, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRanges = rumMonitor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ TapActionTracker(java.lang.String str, java.util.Map map, androidx.compose.runtime.State state, com.datadog.android.rum.RumMonitor rumMonitor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, state, rumMonitor);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        com.datadog.android.rum.RumMonitor rumMonitor = this.getHighSpeedVideoFpsRanges;
        com.datadog.android.rum.RumActionType rumActionType = com.datadog.android.rum.RumActionType.TAP;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        rumMonitor.addAction(rumActionType, str, kotlin.collections.MapsKt.plus(this.Camera2StreamConfigurationMap, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_TITLE, str))));
        this.getHighSpeedVideoSizes.getValue().invoke();
    }
}
