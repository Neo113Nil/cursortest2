package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/Interaction;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/interaction/Interaction;)F", "", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/interaction/Interaction;", "getInputFormats", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FloatingActionButtonElevationAnimatable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.Interaction getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.Interaction getInputSizeshNQ4ISI;

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighSpeedVideoFpsRanges = f4;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.unit.Dp.m8599boximpl(this.getHighSpeedVideoSizes), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), null, null, 12, null);
    }

    private final float getHighSpeedVideoFpsRanges(androidx.compose.foundation.interaction.Interaction interaction) {
        return interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press ? this.getHighSpeedVideoFpsRangesFor : interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter ? this.Camera2StreamConfigurationMap : interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus ? this.getHighSpeedVideoFpsRanges : this.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) {
                floatingActionButtonElevationAnimatable$snapElevation$1 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) continuation;
                if ((floatingActionButtonElevationAnimatable$snapElevation$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$snapElevation$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = floatingActionButtonElevationAnimatable$snapElevation$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI);
                        if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI.getTargetValue().m8615unboximpl(), highSpeedVideoFpsRanges)) {
                            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighResolutionOutputSizeshNQ4ISI;
                            androidx.compose.ui.unit.Dp m8599boximpl = androidx.compose.ui.unit.Dp.m8599boximpl(highSpeedVideoFpsRanges);
                            floatingActionButtonElevationAnimatable$snapElevation$1.getHighSpeedVideoSizes = 1;
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
            this.getInputFormats = this.getInputSizeshNQ4ISI;
        }
        floatingActionButtonElevationAnimatable$snapElevation$1 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuation);
        java.lang.Object obj2 = floatingActionButtonElevationAnimatable$snapElevation$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = floatingActionButtonElevationAnimatable$snapElevation$1.getHighSpeedVideoSizes;
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
        androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        int i;
        androidx.compose.foundation.interaction.Interaction interaction2;
        try {
            if (continuation instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) {
                floatingActionButtonElevationAnimatable$animateElevation$1 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) continuation;
                if ((floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(interaction);
                        this.getInputSizeshNQ4ISI = interaction;
                        interaction2 = interaction;
                        if (!androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI.getTargetValue().m8615unboximpl(), highSpeedVideoFpsRanges)) {
                            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighResolutionOutputSizeshNQ4ISI;
                            androidx.compose.foundation.interaction.Interaction interaction3 = this.getInputFormats;
                            floatingActionButtonElevationAnimatable$animateElevation$1.Camera2StreamConfigurationMap = interaction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            java.lang.Object m2615animateElevationrAjV9yQ = androidx.compose.material.ElevationKt.m2615animateElevationrAjV9yQ(animatable, highSpeedVideoFpsRanges, interaction3, interaction, floatingActionButtonElevationAnimatable$animateElevation$1);
                            interaction2 = interaction;
                            if (m2615animateElevationrAjV9yQ == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        androidx.compose.foundation.interaction.Interaction interaction4 = (androidx.compose.foundation.interaction.Interaction) floatingActionButtonElevationAnimatable$animateElevation$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        interaction2 = interaction4;
                    }
                    this.getInputFormats = interaction2;
                    interaction = kotlin.Unit.INSTANCE;
                    return interaction;
                }
            }
            if (i != 0) {
            }
            this.getInputFormats = interaction2;
            interaction = kotlin.Unit.INSTANCE;
            return interaction;
        } catch (java.lang.Throwable th) {
            this.getInputFormats = interaction;
            throw th;
        }
        floatingActionButtonElevationAnimatable$animateElevation$1 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuation);
        java.lang.Object obj2 = floatingActionButtonElevationAnimatable$animateElevation$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = floatingActionButtonElevationAnimatable$animateElevation$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
