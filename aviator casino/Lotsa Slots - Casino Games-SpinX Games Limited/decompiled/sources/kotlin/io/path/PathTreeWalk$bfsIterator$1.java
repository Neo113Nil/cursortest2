package kotlin.io.path;

/* compiled from: PathTreeWalk.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {191, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class PathTreeWalk$bfsIterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PathTreeWalk$bfsIterator$1(kotlin.io.path.PathTreeWalk pathTreeWalk, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk$bfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.io.path.PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new kotlin.io.path.PathTreeWalk$bfsIterator$1(this.this$0, continuation);
        pathTreeWalk$bfsIterator$1.L$0 = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.io.path.PathTreeWalk$bfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00fc -> B:6:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fe -> B:6:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean followLinks;
        java.nio.file.Path path;
        java.nio.file.Path path2;
        java.lang.Object keyOf;
        kotlin.sequences.SequenceScope sequenceScope;
        kotlin.collections.ArrayDeque arrayDeque;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader;
        kotlin.io.path.PathNode pathNode;
        java.nio.file.Path path3;
        kotlin.io.path.PathTreeWalk pathTreeWalk;
        java.nio.file.LinkOption[] linkOptionArr;
        kotlin.sequences.SequenceScope sequenceScope2;
        kotlin.collections.ArrayDeque arrayDeque2;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader2;
        kotlin.io.path.PathNode pathNode2;
        kotlin.io.path.PathTreeWalk pathTreeWalk2;
        java.nio.file.Path path4;
        boolean createsCycle;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope3 = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.collections.ArrayDeque arrayDeque3 = new kotlin.collections.ArrayDeque();
            followLinks = this.this$0.getFollowLinks();
            kotlin.io.path.DirectoryEntriesReader directoryEntriesReader3 = new kotlin.io.path.DirectoryEntriesReader(followLinks);
            path = this.this$0.start;
            path2 = this.this$0.start;
            keyOf = kotlin.io.path.PathTreeWalkKt.keyOf(path2, this.this$0.getLinkOptions());
            arrayDeque3.addLast(new kotlin.io.path.PathNode(path, keyOf, null));
            sequenceScope = sequenceScope3;
            arrayDeque = arrayDeque3;
            directoryEntriesReader = directoryEntriesReader3;
        } else if (i == 1) {
            path4 = (java.nio.file.Path) this.L$5;
            pathTreeWalk2 = (kotlin.io.path.PathTreeWalk) this.L$4;
            pathNode2 = (kotlin.io.path.PathNode) this.L$3;
            directoryEntriesReader2 = (kotlin.io.path.DirectoryEntriesReader) this.L$2;
            arrayDeque2 = (kotlin.collections.ArrayDeque) this.L$1;
            sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            pathNode = pathNode2;
            sequenceScope = sequenceScope2;
            kotlin.collections.ArrayDeque arrayDeque4 = arrayDeque2;
            path3 = path4;
            directoryEntriesReader = directoryEntriesReader2;
            pathTreeWalk = pathTreeWalk2;
            arrayDeque = arrayDeque4;
            java.nio.file.LinkOption[] linkOptions = pathTreeWalk.getLinkOptions();
            linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
            if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                arrayDeque.addAll(directoryEntriesReader.readEntries(pathNode));
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            directoryEntriesReader = (kotlin.io.path.DirectoryEntriesReader) this.L$2;
            arrayDeque = (kotlin.collections.ArrayDeque) this.L$1;
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (!arrayDeque.isEmpty()) {
            pathNode = (kotlin.io.path.PathNode) arrayDeque.removeFirst();
            pathTreeWalk = this.this$0;
            path3 = pathNode.getPath();
            if (pathNode.getParent() != null) {
                kotlin.io.path.PathsKt.checkFileName(path3);
            }
            java.nio.file.LinkOption[] linkOptions2 = pathTreeWalk.getLinkOptions();
            java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
            if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                createsCycle = kotlin.io.path.PathTreeWalkKt.createsCycle(pathNode);
                if (!createsCycle) {
                    if (pathTreeWalk.getIncludeDirectories()) {
                        this.L$0 = sequenceScope;
                        this.L$1 = arrayDeque;
                        this.L$2 = directoryEntriesReader;
                        this.L$3 = pathNode;
                        this.L$4 = pathTreeWalk;
                        this.L$5 = path3;
                        this.label = 1;
                        if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sequenceScope2 = sequenceScope;
                        pathNode2 = pathNode;
                        directoryEntriesReader2 = directoryEntriesReader;
                        path4 = path3;
                        arrayDeque2 = arrayDeque;
                        pathTreeWalk2 = pathTreeWalk;
                        pathNode = pathNode2;
                        sequenceScope = sequenceScope2;
                        kotlin.collections.ArrayDeque arrayDeque42 = arrayDeque2;
                        path3 = path4;
                        directoryEntriesReader = directoryEntriesReader2;
                        pathTreeWalk = pathTreeWalk2;
                        arrayDeque = arrayDeque42;
                    }
                    java.nio.file.LinkOption[] linkOptions3 = pathTreeWalk.getLinkOptions();
                    linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions3, linkOptions3.length);
                    if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    }
                    while (!arrayDeque.isEmpty()) {
                    }
                } else {
                    throw new java.nio.file.FileSystemLoopException(path3.toString());
                }
            } else if (java.nio.file.Files.exists(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = directoryEntriesReader;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
