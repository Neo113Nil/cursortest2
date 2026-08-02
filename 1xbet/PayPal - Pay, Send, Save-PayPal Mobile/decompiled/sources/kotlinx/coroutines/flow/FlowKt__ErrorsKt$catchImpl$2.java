package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$catchImpl$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        int i;
        java.lang.Object obj;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            if ((flowKt__ErrorsKt$catchImpl$2$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ErrorsKt$catchImpl$2$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    try {
                        kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoSizes;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.Camera2StreamConfigurationMap = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (flowCollector.emit(t, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th) {
                        obj = (T) th;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                        flowKt__ErrorsKt$catchImpl$2.Camera2StreamConfigurationMap.element = (T) obj;
                        throw ((java.lang.Throwable) obj);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__ErrorsKt$catchImpl$2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (java.lang.Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                        */
                    /*
                        this = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                        if (r0 == 0) goto L14
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                        int r1 = r0.getHighSpeedVideoFpsRangesFor
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.getHighSpeedVideoFpsRangesFor
                        int r6 = r6 + r2
                        r0.getHighSpeedVideoFpsRangesFor = r6
                        goto L19
                    L14:
                        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                        r0.<init>(r4, r6)
                    L19:
                        java.lang.Object r6 = r0.getHighSpeedVideoFpsRanges
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.getHighSpeedVideoFpsRangesFor
                        r3 = 1
                        if (r2 == 0) goto L38
                        if (r2 != r3) goto L30
                        java.lang.Object r5 = r0.Camera2StreamConfigurationMap
                        kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
                        kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
                        goto L48
                    L2e:
                        r6 = move-exception
                        goto L4e
                    L30:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L38:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector<T> r6 = r4.getHighSpeedVideoSizes     // Catch: java.lang.Throwable -> L4b
                        r0.Camera2StreamConfigurationMap = r4     // Catch: java.lang.Throwable -> L4b
                        r0.getHighSpeedVideoFpsRangesFor = r3     // Catch: java.lang.Throwable -> L4b
                        java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4b
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    L4b:
                        r5 = move-exception
                        r6 = r5
                        r5 = r4
                    L4e:
                        kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.Camera2StreamConfigurationMap
                        r5.element = r6
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                /* JADX WARN: Multi-variable type inference failed */
                FlowKt__ErrorsKt$catchImpl$2(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> objectRef) {
                    this.getHighSpeedVideoSizes = flowCollector;
                    this.Camera2StreamConfigurationMap = objectRef;
                }
            }
