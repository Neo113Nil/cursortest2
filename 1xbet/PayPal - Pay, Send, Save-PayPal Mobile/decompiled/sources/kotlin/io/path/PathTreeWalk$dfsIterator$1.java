package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "invokeSuspend", n = {"$this$iterator", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class PathTreeWalk$dfsIterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    private /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    final /* synthetic */ kotlin.io.path.PathTreeWalk getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d1, code lost:
    
        r6 = r13;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
    
        if (r1.yield(r12, r17) != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.collections.ArrayDeque arrayDeque;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader;
        boolean contains;
        kotlin.io.path.PathNode pathNode;
        java.nio.file.Path path;
        java.nio.file.Path path2;
        java.nio.file.LinkOption[] linkOptions;
        java.lang.Object highSpeedVideoFpsRanges;
        java.nio.file.LinkOption[] linkOptions2;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader2;
        boolean highSpeedVideoSizes;
        boolean contains2;
        java.nio.file.Path path3;
        kotlin.io.path.PathTreeWalk pathTreeWalk;
        kotlin.io.path.PathNode pathNode2;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader3;
        kotlin.collections.ArrayDeque arrayDeque2;
        kotlin.io.path.PathNode pathNode3;
        java.nio.file.Path path4;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader4;
        kotlin.io.path.PathTreeWalk pathTreeWalk2;
        kotlin.io.path.PathNode pathNode4;
        kotlin.io.path.PathNode pathNode5;
        java.nio.file.LinkOption[] linkOptions3;
        java.nio.file.LinkOption[] linkOptionArr;
        java.nio.file.LinkOption[] linkOptions4;
        char c;
        java.nio.file.LinkOption[] linkOptions5;
        boolean highSpeedVideoSizes2;
        boolean contains3;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        char c2 = 4;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrayDeque = new kotlin.collections.ArrayDeque();
            contains = kotlin.collections.ArraysKt.contains(this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS);
            directoryEntriesReader = new kotlin.io.path.DirectoryEntriesReader(contains);
            path = this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI;
            path2 = this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI;
            linkOptions = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
            highSpeedVideoFpsRanges = kotlin.io.path.PathTreeWalkKt.getHighSpeedVideoFpsRanges(path2, linkOptions);
            pathNode = new kotlin.io.path.PathNode(path, highSpeedVideoFpsRanges, null);
            kotlin.io.path.PathTreeWalk pathTreeWalk3 = this.getOutputStallDurationlomOqCM;
            java.nio.file.Path path5 = pathNode.getHighSpeedVideoFpsRangesFor;
            if (pathNode.getHighResolutionOutputSizeshNQ4ISI != null) {
                kotlin.io.path.PathsKt.checkFileName(path5);
            }
            linkOptions2 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk3.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
            java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
            if (java.nio.file.Files.isDirectory(path5, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                highSpeedVideoSizes = kotlin.io.path.PathTreeWalkKt.getHighSpeedVideoSizes(pathNode);
                if (highSpeedVideoSizes) {
                    throw new java.nio.file.FileSystemLoopException(path5.toString());
                }
                contains2 = kotlin.collections.ArraysKt.contains(pathTreeWalk3.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES);
                if (contains2) {
                    this.getOutputSizes = sequenceScope;
                    this.Camera2StreamConfigurationMap = arrayDeque;
                    this.getHighResolutionOutputSizeshNQ4ISI = directoryEntriesReader;
                    this.getOutputMinFrameDuration = pathNode;
                    this.getInputFormats = pathTreeWalk3;
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                    this.getInputSizeshNQ4ISI = pathNode;
                    this.getOutputFormats = directoryEntriesReader;
                    this.getOutputStallDuration = path5;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getOutputMinFrameDurationlomOqCM = 1;
                    if (sequenceScope.yield(path5, this) != coroutine_suspended) {
                        directoryEntriesReader3 = directoryEntriesReader;
                        arrayDeque2 = arrayDeque;
                        pathNode3 = pathNode;
                        path4 = path5;
                        directoryEntriesReader4 = directoryEntriesReader3;
                        pathTreeWalk2 = pathTreeWalk3;
                        pathNode4 = pathNode3;
                    }
                } else {
                    directoryEntriesReader2 = directoryEntriesReader;
                    path3 = path5;
                    pathTreeWalk = pathTreeWalk3;
                    pathNode2 = pathNode;
                    linkOptions3 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                    linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions3, linkOptions3.length);
                    if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                        pathNode.getHighSpeedVideoSizes = directoryEntriesReader.Camera2StreamConfigurationMap(pathNode2).iterator();
                        arrayDeque.addLast(pathNode);
                    }
                    pathNode5 = pathNode;
                    while (!arrayDeque.isEmpty()) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (java.nio.file.Files.exists(path5, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                    this.getOutputSizes = sequenceScope;
                    this.Camera2StreamConfigurationMap = arrayDeque;
                    this.getHighResolutionOutputSizeshNQ4ISI = directoryEntriesReader;
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathTreeWalk3);
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode);
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(directoryEntriesReader);
                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(path5);
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getOutputMinFrameDurationlomOqCM = 2;
                }
                directoryEntriesReader2 = directoryEntriesReader;
                pathNode5 = pathNode;
                while (!arrayDeque.isEmpty()) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
            } else {
                if (i == 3) {
                    java.nio.file.Path path6 = (java.nio.file.Path) this.getHighSpeedVideoFpsRangesFor;
                    directoryEntriesReader2 = (kotlin.io.path.DirectoryEntriesReader) this.getHighSpeedVideoSizes;
                    kotlin.io.path.PathNode pathNode6 = (kotlin.io.path.PathNode) this.getOutputSizeshNQ4ISI;
                    kotlin.io.path.PathTreeWalk pathTreeWalk4 = (kotlin.io.path.PathTreeWalk) this.getOutputFormats;
                    kotlin.io.path.PathNode pathNode7 = (kotlin.io.path.PathNode) this.getInputSizeshNQ4ISI;
                    kotlin.io.path.PathNode pathNode8 = (kotlin.io.path.PathNode) this.getOutputMinFrameDuration;
                    kotlin.io.path.DirectoryEntriesReader directoryEntriesReader5 = (kotlin.io.path.DirectoryEntriesReader) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArrayDeque arrayDeque3 = (kotlin.collections.ArrayDeque) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.collections.ArrayDeque arrayDeque4 = arrayDeque3;
                    java.nio.file.Path path7 = path6;
                    pathNode5 = pathNode8;
                    kotlin.io.path.PathNode pathNode9 = pathNode6;
                    arrayDeque = arrayDeque4;
                    linkOptions4 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk4.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                    java.nio.file.LinkOption[] linkOptionArr3 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions4, linkOptions4.length);
                    if (java.nio.file.Files.isDirectory(path7, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr3, linkOptionArr3.length))) {
                        pathNode7.getHighSpeedVideoSizes = directoryEntriesReader2.Camera2StreamConfigurationMap(pathNode9).iterator();
                        arrayDeque.addLast(pathNode7);
                    }
                    directoryEntriesReader2 = directoryEntriesReader5;
                    c2 = 4;
                    while (!arrayDeque.isEmpty()) {
                        kotlin.io.path.PathNode pathNode10 = (kotlin.io.path.PathNode) arrayDeque.last();
                        java.util.Iterator<kotlin.io.path.PathNode> it = pathNode10.getHighSpeedVideoSizes;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(it);
                        if (it.hasNext()) {
                            pathNode9 = it.next();
                            kotlin.io.path.PathTreeWalk pathTreeWalk5 = this.getOutputStallDurationlomOqCM;
                            path7 = pathNode9.getHighSpeedVideoFpsRangesFor;
                            if (pathNode9.getHighResolutionOutputSizeshNQ4ISI != null) {
                                kotlin.io.path.PathsKt.checkFileName(path7);
                            }
                            linkOptions5 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk5.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                            java.nio.file.LinkOption[] linkOptionArr4 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions5, linkOptions5.length);
                            if (java.nio.file.Files.isDirectory(path7, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr4, linkOptionArr4.length))) {
                                highSpeedVideoSizes2 = kotlin.io.path.PathTreeWalkKt.getHighSpeedVideoSizes(pathNode9);
                                if (highSpeedVideoSizes2) {
                                    throw new java.nio.file.FileSystemLoopException(path7.toString());
                                }
                                contains3 = kotlin.collections.ArraysKt.contains(pathTreeWalk5.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES);
                                if (contains3) {
                                    this.getOutputSizes = sequenceScope;
                                    this.Camera2StreamConfigurationMap = arrayDeque;
                                    this.getHighResolutionOutputSizeshNQ4ISI = directoryEntriesReader2;
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode5);
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode10);
                                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(it);
                                    this.getInputSizeshNQ4ISI = pathNode9;
                                    this.getOutputFormats = pathTreeWalk5;
                                    this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                                    this.getOutputSizeshNQ4ISI = pathNode9;
                                    this.getHighSpeedVideoSizes = directoryEntriesReader2;
                                    this.getHighSpeedVideoFpsRangesFor = path7;
                                    this.getHighSpeedVideoFpsRanges = 0;
                                    this.getOutputMinFrameDurationlomOqCM = 3;
                                    if (sequenceScope.yield(path7, this) != coroutine_suspended) {
                                        pathNode7 = pathNode9;
                                        pathTreeWalk4 = pathTreeWalk5;
                                        pathNode8 = pathNode5;
                                        directoryEntriesReader5 = directoryEntriesReader2;
                                        path6 = path7;
                                        arrayDeque3 = arrayDeque;
                                        pathNode6 = pathNode7;
                                        kotlin.collections.ArrayDeque arrayDeque42 = arrayDeque3;
                                        java.nio.file.Path path72 = path6;
                                        pathNode5 = pathNode8;
                                        kotlin.io.path.PathNode pathNode92 = pathNode6;
                                        arrayDeque = arrayDeque42;
                                        linkOptions4 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk4.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                                        java.nio.file.LinkOption[] linkOptionArr32 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions4, linkOptions4.length);
                                        if (java.nio.file.Files.isDirectory(path72, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr32, linkOptionArr32.length))) {
                                        }
                                        directoryEntriesReader2 = directoryEntriesReader5;
                                        c2 = 4;
                                        while (!arrayDeque.isEmpty()) {
                                        }
                                    }
                                } else {
                                    pathNode7 = pathNode92;
                                    pathTreeWalk4 = pathTreeWalk5;
                                    directoryEntriesReader5 = directoryEntriesReader2;
                                    linkOptions4 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk4.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                                    java.nio.file.LinkOption[] linkOptionArr322 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions4, linkOptions4.length);
                                    if (java.nio.file.Files.isDirectory(path72, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr322, linkOptionArr322.length))) {
                                    }
                                    directoryEntriesReader2 = directoryEntriesReader5;
                                    c2 = 4;
                                    while (!arrayDeque.isEmpty()) {
                                    }
                                }
                            } else if (java.nio.file.Files.exists(path72, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                                this.getOutputSizes = sequenceScope;
                                this.Camera2StreamConfigurationMap = arrayDeque;
                                this.getHighResolutionOutputSizeshNQ4ISI = directoryEntriesReader2;
                                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode5);
                                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode10);
                                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(it);
                                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode92);
                                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathTreeWalk5);
                                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode92);
                                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(directoryEntriesReader2);
                                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(path72);
                                this.getHighSpeedVideoFpsRanges = 0;
                                c = 4;
                                this.getOutputMinFrameDurationlomOqCM = 4;
                                if (sequenceScope.yield(path72, this) == coroutine_suspended) {
                                }
                            } else {
                                c = 4;
                            }
                            return coroutine_suspended;
                        }
                        c = c2;
                        arrayDeque.removeLast();
                        c2 = c;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            pathNode5 = (kotlin.io.path.PathNode) this.getOutputMinFrameDuration;
            directoryEntriesReader2 = (kotlin.io.path.DirectoryEntriesReader) this.getHighResolutionOutputSizeshNQ4ISI;
            arrayDeque = (kotlin.collections.ArrayDeque) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            while (!arrayDeque.isEmpty()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        path4 = (java.nio.file.Path) this.getOutputStallDuration;
        directoryEntriesReader3 = (kotlin.io.path.DirectoryEntriesReader) this.getOutputFormats;
        pathNode3 = (kotlin.io.path.PathNode) this.getInputSizeshNQ4ISI;
        pathTreeWalk2 = (kotlin.io.path.PathTreeWalk) this.getInputFormats;
        pathNode4 = (kotlin.io.path.PathNode) this.getOutputMinFrameDuration;
        directoryEntriesReader4 = (kotlin.io.path.DirectoryEntriesReader) this.getHighResolutionOutputSizeshNQ4ISI;
        arrayDeque2 = (kotlin.collections.ArrayDeque) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.collections.ArrayDeque arrayDeque5 = arrayDeque2;
        path3 = path4;
        directoryEntriesReader = directoryEntriesReader3;
        directoryEntriesReader2 = directoryEntriesReader4;
        pathTreeWalk = pathTreeWalk2;
        pathNode = pathNode4;
        pathNode2 = pathNode3;
        arrayDeque = arrayDeque5;
        linkOptions3 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
        linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions3, linkOptions3.length);
        if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
        }
        pathNode5 = pathNode;
        while (!arrayDeque.isEmpty()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.io.path.PathTreeWalk$dfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.io.path.PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new kotlin.io.path.PathTreeWalk$dfsIterator$1(this.getOutputStallDurationlomOqCM, continuation);
        pathTreeWalk$dfsIterator$1.getOutputSizes = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathTreeWalk$dfsIterator$1(kotlin.io.path.PathTreeWalk pathTreeWalk, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk$dfsIterator$1> continuation) {
        super(2, continuation);
        this.getOutputStallDurationlomOqCM = pathTreeWalk;
    }
}
