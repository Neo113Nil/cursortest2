package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"Lcoil3/compose/ConstraintsSizeResolver;", "Lcoil3/size/SizeResolver;", "Landroidx/compose/ui/layout/LayoutModifier;", "<init>", "()V", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "setConstraints-BRTryo0", "(J)V", "setConstraints", "getHighSpeedVideoFpsRangesFor", "J", "getHighResolutionOutputSizeshNQ4ISI", "", "Lkotlin/coroutines/Continuation;", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConstraintsSizeResolver implements coil3.view.SizeResolver, androidx.compose.ui.layout.LayoutModifier {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI = coil3.compose.internal.UtilsKt.getZeroConstraints();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<kotlin.coroutines.Continuation<kotlin.Unit>> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object, kotlinx.coroutines.CancellableContinuation] */
    @Override // coil3.view.SizeResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object size(kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
        coil3.compose.ConstraintsSizeResolver$size$1 constraintsSizeResolver$size$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Throwable th;
        if (continuation instanceof coil3.compose.ConstraintsSizeResolver$size$1) {
            constraintsSizeResolver$size$1 = (coil3.compose.ConstraintsSizeResolver$size$1) continuation;
            if ((constraintsSizeResolver$size$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                constraintsSizeResolver$size$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = constraintsSizeResolver$size$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintsSizeResolver$size$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (androidx.compose.ui.unit.Constraints.m8558isZeroimpl(this.getHighResolutionOutputSizeshNQ4ISI)) {
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                        try {
                            constraintsSizeResolver$size$1.getHighSpeedVideoSizes = objectRef2;
                            constraintsSizeResolver$size$1.getHighSpeedVideoFpsRangesFor = 1;
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(constraintsSizeResolver$size$1), 1);
                            cancellableContinuationImpl.initCancellability();
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                            objectRef2.element = cancellableContinuationImpl2;
                            this.getHighSpeedVideoFpsRangesFor.add(cancellableContinuationImpl2);
                            java.lang.Object result = cancellableContinuationImpl.getResult();
                            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(constraintsSizeResolver$size$1);
                            }
                            if (result == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef = objectRef2;
                        } catch (java.lang.Throwable th2) {
                            objectRef = objectRef2;
                            th = th2;
                            kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRangesFor).remove(objectRef.element);
                            throw th;
                        }
                    }
                    return coil3.compose.internal.UtilsKt.m9768toSizeBRTryo0(this.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) constraintsSizeResolver$size$1.getHighSpeedVideoSizes;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRangesFor).remove(objectRef.element);
                    throw th;
                }
                kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRangesFor).remove(objectRef.element);
                return coil3.compose.internal.UtilsKt.m9768toSizeBRTryo0(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
        constraintsSizeResolver$size$1 = new coil3.compose.ConstraintsSizeResolver$size$1(this, continuation);
        java.lang.Object obj2 = constraintsSizeResolver$size$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintsSizeResolver$size$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRangesFor).remove(objectRef.element);
        return coil3.compose.internal.UtilsKt.m9768toSizeBRTryo0(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2052measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        m9743setConstraintsBRTryo0(j);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return coil3.compose.ConstraintsSizeResolver.$r8$lambda$4cykPg4XVGwra1EyYFgexIeHci4(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
    public final void m9743setConstraintsBRTryo0(long constraints) {
        this.getHighResolutionOutputSizeshNQ4ISI = constraints;
        if (androidx.compose.ui.unit.Constraints.m8558isZeroimpl(constraints)) {
            return;
        }
        java.util.List<kotlin.coroutines.Continuation<kotlin.Unit>> list = this.getHighSpeedVideoFpsRangesFor;
        if (list.isEmpty()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) it.next();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4cykPg4XVGwra1EyYFgexIeHci4(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
