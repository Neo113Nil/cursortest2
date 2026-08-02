package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class PathTreeWalk$bfsIterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.io.path.PathTreeWalk getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.collections.ArrayDeque arrayDeque;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader;
        boolean contains;
        java.nio.file.Path path;
        java.nio.file.Path path2;
        java.nio.file.LinkOption[] linkOptions;
        java.lang.Object highSpeedVideoFpsRanges;
        java.nio.file.Path path3;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader2;
        kotlin.io.path.PathTreeWalk pathTreeWalk;
        kotlin.io.path.PathNode pathNode;
        java.nio.file.LinkOption[] linkOptions2;
        java.nio.file.LinkOption[] linkOptionArr;
        kotlin.collections.ArrayDeque arrayDeque2;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader3;
        java.nio.file.Path path4;
        java.nio.file.LinkOption[] linkOptions3;
        boolean highSpeedVideoSizes;
        boolean contains2;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrayDeque = new kotlin.collections.ArrayDeque();
            contains = kotlin.collections.ArraysKt.contains(this.getOutputStallDuration.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS);
            directoryEntriesReader = new kotlin.io.path.DirectoryEntriesReader(contains);
            path = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI;
            path2 = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI;
            linkOptions = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(this.getOutputStallDuration.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
            highSpeedVideoFpsRanges = kotlin.io.path.PathTreeWalkKt.getHighSpeedVideoFpsRanges(path2, linkOptions);
            arrayDeque.addLast(new kotlin.io.path.PathNode(path, highSpeedVideoFpsRanges, null));
        } else if (i == 1) {
            path4 = (java.nio.file.Path) this.getHighSpeedVideoSizesFor;
            directoryEntriesReader3 = (kotlin.io.path.DirectoryEntriesReader) this.getInputSizeshNQ4ISI;
            pathNode = (kotlin.io.path.PathNode) this.getOutputMinFrameDuration;
            pathTreeWalk = (kotlin.io.path.PathTreeWalk) this.getHighSpeedVideoFpsRangesFor;
            directoryEntriesReader2 = (kotlin.io.path.DirectoryEntriesReader) this.Camera2StreamConfigurationMap;
            arrayDeque2 = (kotlin.collections.ArrayDeque) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            path3 = path4;
            directoryEntriesReader = directoryEntriesReader3;
            arrayDeque = arrayDeque2;
            linkOptions2 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
            linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
            if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                arrayDeque.addAll(directoryEntriesReader.Camera2StreamConfigurationMap(pathNode));
            }
            directoryEntriesReader = directoryEntriesReader2;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            directoryEntriesReader = (kotlin.io.path.DirectoryEntriesReader) this.Camera2StreamConfigurationMap;
            arrayDeque = (kotlin.collections.ArrayDeque) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (!arrayDeque.isEmpty()) {
            pathNode = (kotlin.io.path.PathNode) arrayDeque.removeFirst();
            pathTreeWalk = this.getOutputStallDuration;
            path3 = pathNode.getHighSpeedVideoFpsRangesFor;
            if (pathNode.getHighResolutionOutputSizeshNQ4ISI != null) {
                kotlin.io.path.PathsKt.checkFileName(path3);
            }
            linkOptions3 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
            java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions3, linkOptions3.length);
            if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                highSpeedVideoSizes = kotlin.io.path.PathTreeWalkKt.getHighSpeedVideoSizes(pathNode);
                if (highSpeedVideoSizes) {
                    throw new java.nio.file.FileSystemLoopException(path3.toString());
                }
                contains2 = kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES);
                if (contains2) {
                    this.getOutputSizeshNQ4ISI = sequenceScope;
                    this.getHighSpeedVideoFpsRanges = arrayDeque;
                    this.Camera2StreamConfigurationMap = directoryEntriesReader;
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode);
                    this.getHighSpeedVideoFpsRangesFor = pathTreeWalk;
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                    this.getOutputMinFrameDuration = pathNode;
                    this.getInputSizeshNQ4ISI = directoryEntriesReader;
                    this.getHighSpeedVideoSizesFor = path3;
                    this.getHighSpeedVideoSizes = 0;
                    this.getOutputFormats = 1;
                    if (sequenceScope.yield(path3, this) != coroutine_suspended) {
                        directoryEntriesReader2 = directoryEntriesReader;
                        arrayDeque2 = arrayDeque;
                        path4 = path3;
                        directoryEntriesReader3 = directoryEntriesReader2;
                        path3 = path4;
                        directoryEntriesReader = directoryEntriesReader3;
                        arrayDeque = arrayDeque2;
                        linkOptions2 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                        linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
                        if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                        }
                        directoryEntriesReader = directoryEntriesReader2;
                        while (!arrayDeque.isEmpty()) {
                        }
                    }
                } else {
                    directoryEntriesReader2 = directoryEntriesReader;
                    linkOptions2 = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(kotlin.collections.ArraysKt.contains(pathTreeWalk.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.FOLLOW_LINKS));
                    linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
                    if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    }
                    directoryEntriesReader = directoryEntriesReader2;
                    while (!arrayDeque.isEmpty()) {
                    }
                }
            } else if (java.nio.file.Files.exists(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                this.getOutputSizeshNQ4ISI = sequenceScope;
                this.getHighSpeedVideoFpsRanges = arrayDeque;
                this.Camera2StreamConfigurationMap = directoryEntriesReader;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathTreeWalk);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pathNode);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(directoryEntriesReader);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(path3);
                this.getHighSpeedVideoSizes = 0;
                this.getOutputFormats = 2;
                if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.io.path.PathTreeWalk$bfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.io.path.PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new kotlin.io.path.PathTreeWalk$bfsIterator$1(this.getOutputStallDuration, continuation);
        pathTreeWalk$bfsIterator$1.getOutputSizeshNQ4ISI = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathTreeWalk$bfsIterator$1(kotlin.io.path.PathTreeWalk pathTreeWalk, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk$bfsIterator$1> continuation) {
        super(2, continuation);
        this.getOutputStallDuration = pathTreeWalk;
    }
}
