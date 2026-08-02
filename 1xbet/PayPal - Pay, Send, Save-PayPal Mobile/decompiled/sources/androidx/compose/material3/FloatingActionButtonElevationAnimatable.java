package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\n\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\n\u0010\u000fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/Interaction;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/interaction/Interaction;)F", "", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "getOutputFormats", "Landroidx/compose/foundation/interaction/Interaction;", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FloatingActionButtonElevationAnimatable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    float Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.Interaction getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.Interaction getHighSpeedVideoSizesFor;

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.Camera2StreamConfigurationMap = f4;
        this.getHighSpeedVideoSizes = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.unit.Dp.m8599boximpl(this.getHighSpeedVideoFpsRanges), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), null, null, 12, null);
    }

    private final float getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.interaction.Interaction interaction) {
        return interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press ? this.getHighSpeedVideoFpsRangesFor : interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter ? this.getHighResolutionOutputSizeshNQ4ISI : interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus ? this.Camera2StreamConfigurationMap : this.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) {
                floatingActionButtonElevationAnimatable$snapElevation$1 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) continuation;
                if ((floatingActionButtonElevationAnimatable$snapElevation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$snapElevation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = floatingActionButtonElevationAnimatable$snapElevation$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getOutputFormats);
                        if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes.getTargetValue().m8615unboximpl(), highSpeedVideoFpsRangesFor)) {
                            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighSpeedVideoSizes;
                            androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(highSpeedVideoFpsRangesFor);
                            floatingActionButtonElevationAnimatable$snapElevation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (animatable.snapTo(m8599boximpl, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            this.getHighSpeedVideoSizesFor = this.getOutputFormats;
        }
        floatingActionButtonElevationAnimatable$snapElevation$1 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuation);
        java.lang.Object obj2 = floatingActionButtonElevationAnimatable$snapElevation$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = floatingActionButtonElevationAnimatable$snapElevation$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.foundation.interaction.Interaction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.foundation.interaction.Interaction] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        int i;
        androidx.compose.foundation.interaction.Interaction interaction2;
        try {
            if (continuation instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) {
                floatingActionButtonElevationAnimatable$animateElevation$1 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) continuation;
                if ((floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(interaction);
                        this.getOutputFormats = interaction;
                        interaction2 = interaction;
                        if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes.getTargetValue().m8615unboximpl(), highSpeedVideoFpsRangesFor)) {
                            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighSpeedVideoSizes;
                            androidx.compose.foundation.interaction.Interaction interaction3 = this.getHighSpeedVideoSizesFor;
                            floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI = interaction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRanges = 1;
                            java.lang.Object m4300animateElevationrAjV9yQ = androidx.compose.material3.internal.ElevationKt.m4300animateElevationrAjV9yQ(animatable, highSpeedVideoFpsRangesFor, interaction3, interaction, floatingActionButtonElevationAnimatable$animateElevation$1);
                            interaction2 = interaction;
                            if (m4300animateElevationrAjV9yQ == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.compose.foundation.interaction.Interaction interaction4 = (androidx.compose.foundation.interaction.Interaction) floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        interaction2 = interaction4;
                    }
                    this.getHighSpeedVideoSizesFor = interaction2;
                    interaction = kotlin.Unit.INSTANCE;
                    return interaction;
                }
            }
            if (i != 0) {
            }
            this.getHighSpeedVideoSizesFor = interaction2;
            interaction = kotlin.Unit.INSTANCE;
            return interaction;
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizesFor = interaction;
            throw th;
        }
        floatingActionButtonElevationAnimatable$animateElevation$1 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuation);
        java.lang.Object obj2 = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRanges;
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
