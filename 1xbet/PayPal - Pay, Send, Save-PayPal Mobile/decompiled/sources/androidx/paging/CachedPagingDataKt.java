package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "cachedIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/ActiveFlowTracker;", "tracker", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/ActiveFlowTracker;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedPagingDataKt {
    public static final <T> kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> cachedIn(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> flow, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return cachedIn(flow, coroutineScope, null);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow cachedIn$default(kotlinx.coroutines.flow.Flow flow, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.paging.ActiveFlowTracker activeFlowTracker, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            activeFlowTracker = null;
        }
        return cachedIn(flow, coroutineScope, activeFlowTracker);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> cachedIn(kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>> flow, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.paging.ActiveFlowTracker activeFlowTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        final kotlinx.coroutines.flow.Flow simpleRunningReduce = androidx.paging.FlowExtKt.simpleRunningReduce(androidx.paging.FlowExtKt.simpleTransformLatest(flow, new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, coroutineScope, activeFlowTracker)), new androidx.paging.CachedPagingDataKt$cachedIn$2(null));
        return kotlinx.coroutines.flow.FlowKt.shareIn(kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.onStart(new kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<T>>() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                final androidx.paging.MulticastedPagingData multicastedPagingData = (androidx.paging.MulticastedPagingData) obj;
                                androidx.paging.PagingData pagingData = new androidx.paging.PagingData(kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.onStart(multicastedPagingData.getHighSpeedVideoFpsRanges.getDownstreamFlow(), new androidx.paging.MulticastedPagingData$asPagingData$1(multicastedPagingData, null)), new androidx.paging.MulticastedPagingData$asPagingData$2(multicastedPagingData, null)), multicastedPagingData.getHighResolutionOutputSizeshNQ4ISI.getUiReceiver(), multicastedPagingData.getHighResolutionOutputSizeshNQ4ISI.getHintReceiver(), 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR (r8v2 'pagingData' androidx.paging.PagingData) = 
                                      (wrap:kotlinx.coroutines.flow.Flow:0x0055: INVOKE 
                                      (wrap:kotlinx.coroutines.flow.Flow:0x004a: INVOKE 
                                      (wrap:kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>>:0x003e: INVOKE 
                                      (wrap:androidx.paging.CachedPageEventFlow<T>:0x003c: IGET (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData) A[WRAPPED] (LINE:1052) androidx.paging.MulticastedPagingData.getHighSpeedVideoSizes androidx.paging.CachedPageEventFlow)
                                     VIRTUAL call: androidx.paging.CachedPageEventFlow.getDownstreamFlow():kotlinx.coroutines.flow.Flow A[MD:():kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> (m), WRAPPED] (LINE:1052))
                                      (wrap:androidx.paging.MulticastedPagingData$asPagingData$1:0x0045: CONSTRUCTOR (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData), (null kotlin.coroutines.Continuation) A[MD:(androidx.paging.MulticastedPagingData<T>, kotlin.coroutines.Continuation<? super androidx.paging.MulticastedPagingData$asPagingData$1>):void (m), WRAPPED] (LINE:1053) call: androidx.paging.MulticastedPagingData$asPagingData$1.<init>(androidx.paging.MulticastedPagingData, kotlin.coroutines.Continuation):void type: CONSTRUCTOR)
                                     STATIC call: kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2):kotlinx.coroutines.flow.Flow A[MD:<T>:(kotlinx.coroutines.flow.Flow<? extends T>, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>):kotlinx.coroutines.flow.Flow<T> (m), WRAPPED] (LINE:1053))
                                      (wrap:androidx.paging.MulticastedPagingData$asPagingData$2:0x0050: CONSTRUCTOR (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData), (null kotlin.coroutines.Continuation) A[MD:(androidx.paging.MulticastedPagingData<T>, kotlin.coroutines.Continuation<? super androidx.paging.MulticastedPagingData$asPagingData$2>):void (m), WRAPPED] (LINE:1054) call: androidx.paging.MulticastedPagingData$asPagingData$2.<init>(androidx.paging.MulticastedPagingData, kotlin.coroutines.Continuation):void type: CONSTRUCTOR)
                                     STATIC call: kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function3):kotlinx.coroutines.flow.Flow A[MD:<T>:(kotlinx.coroutines.flow.Flow<? extends T>, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>):kotlinx.coroutines.flow.Flow<T> (m), WRAPPED] (LINE:1054))
                                      (wrap:androidx.paging.UiReceiver:0x005b: INVOKE 
                                      (wrap:androidx.paging.PagingData<T>:0x0059: IGET (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData) A[WRAPPED] (LINE:1055) androidx.paging.MulticastedPagingData.getHighSpeedVideoFpsRangesFor androidx.paging.PagingData)
                                     VIRTUAL call: androidx.paging.PagingData.getUiReceiver$paging_common():androidx.paging.UiReceiver A[MD:():androidx.paging.UiReceiver (m), WRAPPED] (LINE:1055))
                                      (wrap:androidx.paging.HintReceiver:0x0061: INVOKE 
                                      (wrap:androidx.paging.PagingData<T>:0x005f: IGET (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData) A[WRAPPED] (LINE:1056) androidx.paging.MulticastedPagingData.getHighSpeedVideoFpsRangesFor androidx.paging.PagingData)
                                     VIRTUAL call: androidx.paging.PagingData.getHintReceiver$paging_common():androidx.paging.HintReceiver A[MD:():androidx.paging.HintReceiver (m), WRAPPED] (LINE:1056))
                                      (wrap:kotlin.jvm.functions.Function0:0x0067: CONSTRUCTOR (r8v1 'multicastedPagingData' androidx.paging.MulticastedPagingData A[DONT_INLINE]) A[MD:(androidx.paging.MulticastedPagingData):void (m), WRAPPED] (LINE:1057) call: androidx.paging.MulticastedPagingData$$ExternalSyntheticLambda0.<init>(androidx.paging.MulticastedPagingData):void type: CONSTRUCTOR)
                                     A[DECLARE_VAR, MD:(kotlinx.coroutines.flow.Flow<? extends androidx.paging.PageEvent<T>>, androidx.paging.UiReceiver, androidx.paging.HintReceiver, kotlin.jvm.functions.Function0<androidx.paging.PageEvent$Insert<T>>):void (m)] (LINE:1050) call: androidx.paging.PagingData.<init>(kotlinx.coroutines.flow.Flow, androidx.paging.UiReceiver, androidx.paging.HintReceiver, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.paging.MulticastedPagingData$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r9 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L14
                                    r0 = r9
                                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.getHighSpeedVideoFpsRanges
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r1 = r1 & r2
                                    if (r1 == 0) goto L14
                                    int r9 = r0.getHighSpeedVideoFpsRanges
                                    int r9 = r9 + r2
                                    r0.getHighSpeedVideoFpsRanges = r9
                                    goto L19
                                L14:
                                    androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                                    r0.<init>(r9)
                                L19:
                                    java.lang.Object r9 = r0.getHighSpeedVideoFpsRangesFor
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.getHighSpeedVideoFpsRanges
                                    r3 = 1
                                    if (r2 == 0) goto L32
                                    if (r2 != r3) goto L2a
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    goto L78
                                L2a:
                                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                                    r8.<init>(r9)
                                    throw r8
                                L32:
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    kotlinx.coroutines.flow.FlowCollector r9 = r7.getHighSpeedVideoSizes
                                    r2 = r0
                                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                                    androidx.paging.MulticastedPagingData r8 = (androidx.paging.MulticastedPagingData) r8
                                    androidx.paging.CachedPageEventFlow<T> r2 = r8.getHighSpeedVideoFpsRanges
                                    kotlinx.coroutines.flow.Flow r2 = r2.getDownstreamFlow()
                                    androidx.paging.MulticastedPagingData$asPagingData$1 r4 = new androidx.paging.MulticastedPagingData$asPagingData$1
                                    r5 = 0
                                    r4.<init>(r8, r5)
                                    kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                                    kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.onStart(r2, r4)
                                    androidx.paging.MulticastedPagingData$asPagingData$2 r4 = new androidx.paging.MulticastedPagingData$asPagingData$2
                                    r4.<init>(r8, r5)
                                    kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
                                    kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.onCompletion(r2, r4)
                                    androidx.paging.PagingData<T> r4 = r8.getHighResolutionOutputSizeshNQ4ISI
                                    androidx.paging.UiReceiver r4 = r4.getUiReceiver()
                                    androidx.paging.PagingData<T> r5 = r8.getHighResolutionOutputSizeshNQ4ISI
                                    androidx.paging.HintReceiver r5 = r5.getHintReceiver()
                                    androidx.paging.MulticastedPagingData$$ExternalSyntheticLambda0 r6 = new androidx.paging.MulticastedPagingData$$ExternalSyntheticLambda0
                                    r6.<init>(r8)
                                    androidx.paging.PagingData r8 = new androidx.paging.PagingData
                                    r8.<init>(r2, r4, r5, r6)
                                    r0.getHighSpeedVideoFpsRanges = r3
                                    java.lang.Object r8 = r9.emit(r8, r0)
                                    if (r8 != r1) goto L78
                                    return r1
                                L78:
                                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                                    return r8
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                            /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                int getHighSpeedVideoFpsRanges;
                                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoFpsRangesFor = obj;
                                    this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                                    return androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.getHighSpeedVideoSizes = flowCollector;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    }, new androidx.paging.CachedPagingDataKt$cachedIn$4(activeFlowTracker, null)), new androidx.paging.CachedPagingDataKt$cachedIn$5(activeFlowTracker, null)), coroutineScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getLazily(), 1);
                }
            }
