package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/compose/RealDrawScopeSizeResolver;", "Lcoil3/compose/DrawScopeSizeResolver;", "<init>", "()V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/ui/geometry/Size;", "p0", "", "connect", "(Lkotlinx/coroutines/flow/Flow;)V", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RealDrawScopeSizeResolver implements coil3.compose.DrawScopeSizeResolver {
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlinx.coroutines.flow.Flow<androidx.compose.ui.geometry.Size>> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 2, null);

    @Override // coil3.compose.DrawScopeSizeResolver
    public final void connect(kotlinx.coroutines.flow.Flow<androidx.compose.ui.geometry.Size> p0) {
        this.getHighSpeedVideoFpsRangesFor.tryEmit(p0);
    }

    @Override // coil3.view.SizeResolver
    public final java.lang.Object size(kotlin.coroutines.Continuation<? super coil3.view.Size> continuation) {
        final kotlinx.coroutines.flow.Flow transformLatest = kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighSpeedVideoFpsRangesFor, new coil3.compose.RealDrawScopeSizeResolver$size$2(null));
        return kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<coil3.view.Size>() { // from class: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                coil3.view.Size m9769toSizeOrNulluvyYCjk = coil3.compose.internal.UtilsKt.m9769toSizeOrNulluvyYCjk(((androidx.compose.ui.geometry.Size) obj).m5826unboximpl());
                                if (m9769toSizeOrNulluvyYCjk != null) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                    if (flowCollector.emit(m9769toSizeOrNulluvyYCjk, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2", f = "DrawScopeSizeResolver.kt", i = {}, l = {52}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.Camera2StreamConfigurationMap = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super coil3.view.Size> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new coil3.compose.RealDrawScopeSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, continuation);
    }
}
