package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/RoomDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "block", "Lkotlinx/coroutines/flow/Flow;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowUtil {
    public static final <R> kotlinx.coroutines.flow.Flow<R> createFlow(final androidx.room.RoomDatabase roomDatabase, final boolean z, java.lang.String[] strArr, final kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlinx.coroutines.flow.Flow conflate = kotlinx.coroutines.flow.FlowKt.conflate(roomDatabase.getInvalidationTracker().createFlow((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), true));
        return new kotlinx.coroutines.flow.Flow<R>() { // from class: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlin.jvm.functions.Function1 $getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoFpsRanges;
                final /* synthetic */ boolean $getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.room.RoomDatabase $getHighSpeedVideoSizes;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
                
                    if (r8.emit(r9, r0) != r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizes;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.$getHighSpeedVideoFpsRanges;
                                androidx.room.RoomDatabase roomDatabase = this.$getHighSpeedVideoSizes;
                                boolean z = this.$getHighSpeedVideoFpsRangesFor;
                                kotlin.jvm.functions.Function1 function1 = this.$getHighResolutionOutputSizeshNQ4ISI;
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                                anonymousClass1.getHighSpeedVideoSizes = 1;
                                java.lang.Object performSuspending = androidx.room.util.DBUtil.performSuspending(roomDatabase, true, z, function1, anonymousClass1);
                                if (performSuspending != coroutine_suspended) {
                                    obj2 = performSuspending;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                            anonymousClass1.getHighSpeedVideoSizes = 2;
                        }
                    }
                    anonymousClass1 = new androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                    }
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = null;
                    anonymousClass1.getHighSpeedVideoSizes = 2;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj;
                        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                        return androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, androidx.room.RoomDatabase roomDatabase, boolean z, kotlin.jvm.functions.Function1 function1) {
                    this.$getHighSpeedVideoFpsRanges = flowCollector;
                    this.$getHighSpeedVideoSizes = roomDatabase;
                    this.$getHighSpeedVideoFpsRangesFor = z;
                    this.$getHighResolutionOutputSizeshNQ4ISI = function1;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2(flowCollector, roomDatabase, z, function1), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
