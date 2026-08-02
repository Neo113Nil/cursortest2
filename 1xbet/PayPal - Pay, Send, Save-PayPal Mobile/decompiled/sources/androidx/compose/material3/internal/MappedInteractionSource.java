package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/material3/internal/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "underlyingInteractionSource", "Landroidx/compose/ui/geometry/Offset;", "delta", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "Lkotlinx/coroutines/flow/Flow;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MappedInteractionSource implements androidx.compose.foundation.interaction.InteractionSource {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;
    private final java.util.Map<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.foundation.interaction.PressInteraction.Press> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions;

    private MappedInteractionSource(androidx.compose.foundation.interaction.InteractionSource interactionSource, long j) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        final kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = interactionSource.getInteractions();
        this.interactions = new kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction>() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoSizes;
                final /* synthetic */ androidx.compose.material3.internal.MappedInteractionSource getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    java.util.Map map;
                    androidx.compose.foundation.interaction.Interaction interaction;
                    java.util.Map map2;
                    java.util.Map map3;
                    if (continuation instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoSizes;
                                androidx.compose.foundation.interaction.PressInteraction.Cancel cancel = (androidx.compose.foundation.interaction.Interaction) obj;
                                if (cancel instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                                    interaction = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(this.getHighResolutionOutputSizeshNQ4ISI, (androidx.compose.foundation.interaction.PressInteraction.Press) cancel);
                                    map3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                                    map3.put(cancel, interaction);
                                } else {
                                    if (cancel instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                                        map2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                                        androidx.compose.foundation.interaction.PressInteraction.Cancel cancel2 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) cancel;
                                        androidx.compose.foundation.interaction.PressInteraction.Press press = (androidx.compose.foundation.interaction.PressInteraction.Press) map2.remove(cancel2.getPress());
                                        if (press != null) {
                                            cancel2 = new androidx.compose.foundation.interaction.PressInteraction.Cancel(press);
                                        }
                                        cancel = cancel2;
                                    } else if (cancel instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                                        map = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                                        androidx.compose.foundation.interaction.PressInteraction.Release release = (androidx.compose.foundation.interaction.PressInteraction.Release) cancel;
                                        androidx.compose.foundation.interaction.PressInteraction.Press press2 = (androidx.compose.foundation.interaction.PressInteraction.Press) map.remove(release.getPress());
                                        if (press2 != null) {
                                            release = new androidx.compose.foundation.interaction.PressInteraction.Release(press2);
                                        }
                                        interaction = release;
                                    }
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                    if (flowCollector.emit(cancel, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                cancel = interaction;
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                if (flowCollector.emit(cancel, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                        return androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, androidx.compose.material3.internal.MappedInteractionSource mappedInteractionSource) {
                    this.$getHighSpeedVideoSizes = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = mappedInteractionSource;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.compose.foundation.interaction.Interaction> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> getInteractions() {
        return this.interactions;
    }

    public static final /* synthetic */ androidx.compose.foundation.interaction.PressInteraction.Press access$mapPress(androidx.compose.material3.internal.MappedInteractionSource mappedInteractionSource, androidx.compose.foundation.interaction.PressInteraction.Press press) {
        return new androidx.compose.foundation.interaction.PressInteraction.Press(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(press.getPressPosition(), mappedInteractionSource.getHighSpeedVideoFpsRanges), null);
    }

    public /* synthetic */ MappedInteractionSource(androidx.compose.foundation.interaction.InteractionSource interactionSource, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, j);
    }
}
