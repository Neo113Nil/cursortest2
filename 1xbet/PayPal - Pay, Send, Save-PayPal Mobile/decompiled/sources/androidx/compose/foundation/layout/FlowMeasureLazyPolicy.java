package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0082\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013\u0012'\u0010\u001b\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u0018¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010#\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010!\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00101\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010-\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010B\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010AR\u0014\u00109\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010@\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010DR%\u0010G\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010FR5\u0010I\u001a#\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010H"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "p0", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "p1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p2", "Landroidx/compose/ui/unit/Dp;", "p3", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "p4", "p5", "", "p6", "p7", "p8", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "p9", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "p10", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/foundation/layout/FlowLineInfo;", "p11", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "getHighResolutionOutputSizeshNQ4ISI", "()Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Z", "isHorizontal", "()Z", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getOutputStallDuration", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getOutputMinFrameDuration", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getOutputFormats", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor", "getInputFormats", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "getOutputStallDurationlomOqCM", "Ljava/util/List;", "getOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function4;", "getOutputMinFrameDurationlomOqCM"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FlowMeasureLazyPolicy implements androidx.compose.foundation.layout.FlowLineMeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function4<java.lang.Integer, androidx.compose.foundation.layout.FlowLineInfo, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.CrossAxisAlignment getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.Arrangement.Horizontal getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.FlowLayoutOverflowState getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final int getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.Arrangement.Vertical getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> getOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> list, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super androidx.compose.foundation.layout.FlowLineInfo, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = horizontal;
        this.getHighSpeedVideoSizes = vertical;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = crossAxisAlignment;
        this.getOutputFormats = f2;
        this.getHighSpeedVideoSizesFor = i;
        this.getInputFormats = i2;
        this.getOutputMinFrameDuration = i3;
        this.getInputSizeshNQ4ISI = flowLayoutOverflowState;
        this.getOutputSizeshNQ4ISI = list;
        this.getOutputMinFrameDurationlomOqCM = function4;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: isHorizontal, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getHorizontalArrangement, reason: from getter */
    public final androidx.compose.foundation.layout.Arrangement.Horizontal getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getVerticalArrangement, reason: from getter */
    public final androidx.compose.foundation.layout.Arrangement.Vertical getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getCrossAxisAlignment, reason: from getter */
    public final androidx.compose.foundation.layout.CrossAxisAlignment getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
        return flowMeasureLazyPolicy.Camera2StreamConfigurationMap(subcomposeMeasureScope, constraints.getGetHighSpeedVideoFpsRangesFor());
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> getHighResolutionOutputSizeshNQ4ISI() {
        return new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                androidx.compose.ui.layout.MeasureResult highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowMeasureLazyPolicy.this, (androidx.compose.ui.layout.SubcomposeMeasureScope) obj, (androidx.compose.ui.unit.Constraints) obj2);
                return highSpeedVideoSizes;
            }
        };
    }

    private final androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap(final androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        androidx.compose.foundation.layout.LayoutOrientation layoutOrientation;
        if (this.getHighSpeedVideoSizesFor <= 0 || this.getInputFormats == 0 || this.getOutputMinFrameDuration == 0 || (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) == 0 && this.getInputSizeshNQ4ISI.getType$foundation_layout() != androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Visible)) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowMeasureLazyPolicy.Camera2StreamConfigurationMap();
                    return Camera2StreamConfigurationMap;
                }
            }, 4, null);
        }
        androidx.compose.foundation.layout.ContextualFlowItemIterator contextualFlowItemIterator = new androidx.compose.foundation.layout.ContextualFlowItemIterator(this.getHighSpeedVideoSizesFor, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.util.List highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getHighSpeedVideoSizes(androidx.compose.ui.layout.SubcomposeMeasureScope.this, this, ((java.lang.Integer) obj).intValue(), (androidx.compose.foundation.layout.FlowLineInfo) obj2);
                return highSpeedVideoSizes;
            }
        });
        this.getInputSizeshNQ4ISI.setItemCount$foundation_layout(this.getHighSpeedVideoSizesFor);
        androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
        this.getInputSizeshNQ4ISI.m1656setOverflowMeasurablesVKLhPVY$foundation_layout(flowMeasureLazyPolicy, j, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                androidx.compose.ui.layout.Measurable highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowMeasureLazyPolicy.this, subcomposeMeasureScope, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue());
                return highSpeedVideoSizes;
            }
        });
        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        androidx.compose.foundation.layout.ContextualFlowItemIterator contextualFlowItemIterator2 = contextualFlowItemIterator;
        float f = this.getHighSpeedVideoFpsRangesFor;
        float f2 = this.getOutputFormats;
        if (getCamera2StreamConfigurationMap()) {
            layoutOrientation = androidx.compose.foundation.layout.LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = androidx.compose.foundation.layout.LayoutOrientation.Vertical;
        }
        return androidx.compose.foundation.layout.FlowLayoutKt.m1648breakDownItemsdi9J0FM(subcomposeMeasureScope2, flowMeasureLazyPolicy, contextualFlowItemIterator2, f, f2, androidx.compose.foundation.layout.OrientationIndependentConstraints.m1682constructorimpl(j, layoutOrientation), this.getOutputMinFrameDuration, this.getInputFormats, this.getInputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy, int i, androidx.compose.foundation.layout.FlowLineInfo flowLineInfo, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-195060736, i2, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:487)");
            }
            flowMeasureLazyPolicy.getOutputMinFrameDurationlomOqCM.invoke(java.lang.Integer.valueOf(i), flowLineInfo, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoSizes(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, final androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy, final int i, final androidx.compose.foundation.layout.FlowLineInfo flowLineInfo) {
        return subcomposeMeasureScope.subcompose(java.lang.Integer.valueOf(i), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-195060736, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.FlowMeasureLazyPolicy.this, i, flowLineInfo, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.Measurable getHighSpeedVideoSizes(androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, boolean z, int i) {
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = (kotlin.jvm.functions.Function2) kotlin.collections.CollectionsKt.getOrNull(flowMeasureLazyPolicy.getOutputSizeshNQ4ISI, !z ? 1 : 0);
        if (function2 == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(z);
        sb.append(flowMeasureLazyPolicy.getHighSpeedVideoSizesFor);
        sb.append(i);
        return (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.getOrNull(subcomposeMeasureScope.subcompose(sb.toString(), function2), 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowMeasureLazyPolicy(Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoFpsRangesFor));
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getOutputFormats=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getOutputFormats));
        sb.append(", getHighSpeedVideoSizesFor=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", getInputFormats=");
        sb.append(this.getInputFormats);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getOutputSizeshNQ4ISI=");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(", getOutputMinFrameDurationlomOqCM=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getOutputFormats)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoSizesFor)) * 31) + java.lang.Integer.hashCode(this.getInputFormats)) * 31) + java.lang.Integer.hashCode(this.getOutputMinFrameDuration)) * 31) + this.getInputSizeshNQ4ISI.hashCode()) * 31) + this.getOutputSizeshNQ4ISI.hashCode()) * 31) + this.getOutputMinFrameDurationlomOqCM.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.FlowMeasureLazyPolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.FlowMeasureLazyPolicy flowMeasureLazyPolicy = (androidx.compose.foundation.layout.FlowMeasureLazyPolicy) p0;
        return this.Camera2StreamConfigurationMap == flowMeasureLazyPolicy.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, flowMeasureLazyPolicy.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, flowMeasureLazyPolicy.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoFpsRangesFor, flowMeasureLazyPolicy.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, flowMeasureLazyPolicy.getHighSpeedVideoFpsRanges) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getOutputFormats, flowMeasureLazyPolicy.getOutputFormats) && this.getHighSpeedVideoSizesFor == flowMeasureLazyPolicy.getHighSpeedVideoSizesFor && this.getInputFormats == flowMeasureLazyPolicy.getInputFormats && this.getOutputMinFrameDuration == flowMeasureLazyPolicy.getOutputMinFrameDuration && kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, flowMeasureLazyPolicy.getInputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputSizeshNQ4ISI, flowMeasureLazyPolicy.getOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDurationlomOqCM, flowMeasureLazyPolicy.getOutputMinFrameDurationlomOqCM);
    }

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, int i3, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, java.util.List list, kotlin.jvm.functions.Function4 function4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, i3, flowLayoutOverflowState, list, function4);
    }
}
