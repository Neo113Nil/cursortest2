package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/screens/SimplifiedContentCallbacks;", "", "Lkotlin/Function1;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SimplifiedContentCallbacks {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SimplifiedContentCallbacks(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function15, "");
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.Camera2StreamConfigurationMap = function13;
        this.getHighResolutionOutputSizeshNQ4ISI = function14;
        this.getHighSpeedVideoFpsRanges = function15;
    }
}
