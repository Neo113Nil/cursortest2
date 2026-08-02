package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u000f*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentedButtonContentMeasurePolicy implements androidx.compose.ui.layout.MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private androidx.compose.animation.core.Animatable<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> animatable;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Integer> animationSpec;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineScope scope;

    public SegmentedButtonContentMeasurePolicy(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.AnimationSpec<java.lang.Integer> animationSpec) {
        this.scope = coroutineScope;
        this.animationSpec = animationSpec;
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Integer> getAnimationSpec() {
        return this.animationSpec;
    }

    public final androidx.compose.animation.core.Animatable<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final void setAnimatable(androidx.compose.animation.core.Animatable<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> animatable) {
        this.animatable = animatable;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        float f;
        float f2;
        int i = 0;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list.get(0);
        int i2 = 1;
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list.get(1);
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(list2.get(i3).mo7353measureBRTryo0(j));
        }
        final java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int width = ((androidx.compose.ui.layout.Placeable) obj).getWidth();
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex > 0) {
                int i4 = 1;
                while (true) {
                    java.lang.Object obj4 = arrayList2.get(i4);
                    int width2 = ((androidx.compose.ui.layout.Placeable) obj4).getWidth();
                    if (width < width2) {
                        obj = obj4;
                        width = width2;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : 0;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list3.size());
        int size2 = list3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList3.add(list3.get(i5).mo7353measureBRTryo0(j));
        }
        final java.util.ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList4.get(0);
            int width4 = ((androidx.compose.ui.layout.Placeable) obj2).getWidth();
            int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex2 > 0) {
                int i6 = 1;
                while (true) {
                    java.lang.Object obj5 = arrayList4.get(i6);
                    int width5 = ((androidx.compose.ui.layout.Placeable) obj5).getWidth();
                    if (width4 < width5) {
                        obj2 = obj5;
                        width4 = width5;
                    }
                    if (i6 == lastIndex2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
        java.lang.Integer valueOf = placeable2 != null ? java.lang.Integer.valueOf(placeable2.getWidth()) : null;
        if (arrayList4.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList4.get(0);
            int height = ((androidx.compose.ui.layout.Placeable) obj3).getHeight();
            int lastIndex3 = kotlin.collections.CollectionsKt.getLastIndex(arrayList4);
            if (lastIndex3 > 0) {
                while (true) {
                    java.lang.Object obj6 = arrayList4.get(i2);
                    int height2 = ((androidx.compose.ui.layout.Placeable) obj6).getHeight();
                    if (height < height2) {
                        obj3 = obj6;
                        height = height2;
                    }
                    if (i2 == lastIndex3) {
                        break;
                    }
                    i2++;
                }
            }
        }
        androidx.compose.ui.layout.Placeable placeable3 = (androidx.compose.ui.layout.Placeable) obj3;
        int height3 = placeable3 != null ? placeable3.getHeight() : 0;
        int max = java.lang.Math.max(measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.SegmentedButtonDefaults.INSTANCE.m3713getIconSizeD9Ej5fM()), width3);
        f = androidx.compose.material3.SegmentedButtonKt.getHighSpeedVideoFpsRangesFor;
        int i7 = measureScope.mo1412roundToPx0680j_4(f);
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (width3 == 0) {
            int i8 = measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.SegmentedButtonDefaults.INSTANCE.m3713getIconSizeD9Ej5fM());
            f2 = androidx.compose.material3.SegmentedButtonKt.getHighSpeedVideoFpsRangesFor;
            i = (-(i8 + measureScope.mo1412roundToPx0680j_4(f2))) / 2;
        }
        final int i9 = i;
        java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI;
        if (num == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i9);
        } else {
            androidx.compose.animation.core.Animatable<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> animatable = this.animatable;
            if (animatable == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                animatable = new androidx.compose.animation.core.Animatable<>(num, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), null, null, 12, null);
                this.animatable = animatable;
            }
            if (animatable.getTargetValue().intValue() != i9) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1(animatable, i9, this, null), 3, null);
            }
        }
        final int i10 = height3;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, max + i7 + intValue, height3, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SegmentedButtonContentMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj7) {
                return androidx.compose.material3.SegmentedButtonContentMeasurePolicy.$r8$lambda$Dx0G4FspBxyLiryMruFNiFxqli4(arrayList2, measureScope, this, i9, arrayList4, i10, (androidx.compose.ui.layout.Placeable.PlacementScope) obj7);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dx0G4FspBxyLiryMruFNiFxqli4(java.util.List list, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.material3.SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, java.util.List list2, int i2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        float f;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i3);
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        int i4 = measureScope.mo1412roundToPx0680j_4(androidx.compose.material3.SegmentedButtonDefaults.INSTANCE.m3713getIconSizeD9Ej5fM());
        f = androidx.compose.material3.SegmentedButtonKt.getHighSpeedVideoFpsRangesFor;
        int i5 = measureScope.mo1412roundToPx0680j_4(f);
        androidx.compose.animation.core.Animatable<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> animatable = segmentedButtonContentMeasurePolicy.animatable;
        int intValue = animatable != null ? animatable.getValue().intValue() : i;
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) list2.get(i6);
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, i4 + i5 + intValue, (i2 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
