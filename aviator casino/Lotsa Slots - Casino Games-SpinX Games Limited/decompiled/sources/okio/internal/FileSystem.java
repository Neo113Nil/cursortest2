package okio.internal;

/* compiled from: FileSystem.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aF\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes6.dex */
public final class FileSystem {
    public static final okio.FileMetadata commonMetadata(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new java.io.FileNotFoundException("no such file: " + path);
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, okio.Path dir, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        for (okio.Path path = dir; path != null && !fileSystem.exists(path); path = path.parent()) {
            arrayDeque.addFirst(path);
        }
        if (z && arrayDeque.isEmpty()) {
            throw new java.io.IOException(dir + " already exists.");
        }
        java.util.Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((okio.Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, okio.Path fileOrDirectory, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        java.util.Iterator it = kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((okio.Path) it.next(), z && !it.hasNext());
        }
    }

    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(okio.FileSystem fileSystem, okio.Path dir, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        return kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem$commonListRecursively$1(dir, fileSystem, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        if (r7 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        r6.addLast(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        r7 = r6;
        r10 = r11;
        r11 = r12;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object collectRecursively(kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope, okio.FileSystem fileSystem, kotlin.collections.ArrayDeque<okio.Path> arrayDeque, okio.Path path, boolean z, boolean z2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        okio.internal.FileSystem$collectRecursively$1 fileSystem$collectRecursively$1;
        int i;
        okio.FileSystem fileSystem2;
        kotlin.collections.ArrayDeque<okio.Path> arrayDeque2;
        boolean z3;
        kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope2;
        boolean z4;
        okio.FileSystem fileSystem3;
        java.util.List<okio.Path> listOrNull;
        okio.Path path2 = path;
        boolean z5 = z2;
        if (continuation instanceof okio.internal.FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (okio.internal.FileSystem$collectRecursively$1) continuation;
            if ((fileSystem$collectRecursively$1.label & Integer.MIN_VALUE) != 0) {
                fileSystem$collectRecursively$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fileSystem$collectRecursively$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileSystem$collectRecursively$1.label;
                int i2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z5) {
                        fileSystem2 = fileSystem;
                        arrayDeque2 = arrayDeque;
                        z3 = z;
                    } else {
                        fileSystem$collectRecursively$1.L$0 = sequenceScope;
                        fileSystem2 = fileSystem;
                        fileSystem$collectRecursively$1.L$1 = fileSystem2;
                        arrayDeque2 = arrayDeque;
                        fileSystem$collectRecursively$1.L$2 = arrayDeque2;
                        fileSystem$collectRecursively$1.L$3 = path2;
                        z3 = z;
                        fileSystem$collectRecursively$1.Z$0 = z3;
                        fileSystem$collectRecursively$1.Z$1 = z5;
                        fileSystem$collectRecursively$1.label = 1;
                        if (sequenceScope.yield(path2, fileSystem$collectRecursively$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    sequenceScope2 = sequenceScope;
                    z4 = z3;
                    fileSystem3 = fileSystem2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        boolean z6 = fileSystem$collectRecursively$1.Z$1;
                        boolean z7 = fileSystem$collectRecursively$1.Z$0;
                        java.util.Iterator<okio.Path> it = (java.util.Iterator) fileSystem$collectRecursively$1.L$4;
                        okio.Path path3 = (okio.Path) fileSystem$collectRecursively$1.L$3;
                        kotlin.collections.ArrayDeque<okio.Path> arrayDeque3 = (kotlin.collections.ArrayDeque) fileSystem$collectRecursively$1.L$2;
                        okio.FileSystem fileSystem4 = (okio.FileSystem) fileSystem$collectRecursively$1.L$1;
                        kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope3 = (kotlin.sequences.SequenceScope) fileSystem$collectRecursively$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            while (it.hasNext()) {
                                okio.Path next = it.next();
                                fileSystem$collectRecursively$1.L$0 = sequenceScope3;
                                fileSystem$collectRecursively$1.L$1 = fileSystem4;
                                fileSystem$collectRecursively$1.L$2 = arrayDeque3;
                                fileSystem$collectRecursively$1.L$3 = path3;
                                fileSystem$collectRecursively$1.L$4 = it;
                                fileSystem$collectRecursively$1.Z$0 = z7;
                                fileSystem$collectRecursively$1.Z$1 = z6;
                                fileSystem$collectRecursively$1.label = 2;
                                if (collectRecursively(sequenceScope3, fileSystem4, arrayDeque3, next, z7, z6, fileSystem$collectRecursively$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            arrayDeque3.removeLast();
                            z5 = z6;
                            path2 = path3;
                            sequenceScope2 = sequenceScope3;
                            if (!z5) {
                                return kotlin.Unit.INSTANCE;
                            }
                            fileSystem$collectRecursively$1.L$0 = null;
                            fileSystem$collectRecursively$1.L$1 = null;
                            fileSystem$collectRecursively$1.L$2 = null;
                            fileSystem$collectRecursively$1.L$3 = null;
                            fileSystem$collectRecursively$1.L$4 = null;
                            fileSystem$collectRecursively$1.label = 3;
                            if (sequenceScope2.yield(path2, fileSystem$collectRecursively$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            arrayDeque3.removeLast();
                            throw th;
                        }
                    }
                    boolean z8 = fileSystem$collectRecursively$1.Z$1;
                    boolean z9 = fileSystem$collectRecursively$1.Z$0;
                    okio.Path path4 = (okio.Path) fileSystem$collectRecursively$1.L$3;
                    arrayDeque2 = (kotlin.collections.ArrayDeque) fileSystem$collectRecursively$1.L$2;
                    fileSystem3 = (okio.FileSystem) fileSystem$collectRecursively$1.L$1;
                    sequenceScope2 = (kotlin.sequences.SequenceScope) fileSystem$collectRecursively$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z5 = z8;
                    z4 = z9;
                    path2 = path4;
                }
                listOrNull = fileSystem3.listOrNull(path2);
                if (listOrNull == null) {
                    listOrNull = kotlin.collections.CollectionsKt.emptyList();
                }
                if (true ^ listOrNull.isEmpty()) {
                    okio.Path path5 = path2;
                    while (true) {
                        if (z4 && arrayDeque2.contains(path5)) {
                            throw new java.io.IOException("symlink cycle at " + path2);
                        }
                        okio.Path symlinkTarget = symlinkTarget(fileSystem3, path5);
                        if (symlinkTarget == null) {
                            break;
                        }
                        i2++;
                        path5 = symlinkTarget;
                    }
                }
                if (!z5) {
                }
            }
        }
        fileSystem$collectRecursively$1 = new okio.internal.FileSystem$collectRecursively$1(continuation);
        java.lang.Object obj2 = fileSystem$collectRecursively$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileSystem$collectRecursively$1.label;
        int i22 = 0;
        if (i != 0) {
        }
        listOrNull = fileSystem3.listOrNull(path2);
        if (listOrNull == null) {
        }
        if (true ^ listOrNull.isEmpty()) {
        }
        if (!z5) {
        }
    }

    public static final okio.Path symlinkTarget(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        okio.Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        okio.Path parent = path.parent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
        return parent.resolve(symlinkTarget);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Long] */
    public static final void commonCopy(okio.FileSystem fileSystem, okio.Path source, okio.Path target) throws java.io.IOException {
        java.lang.Throwable th;
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        okio.Source source2 = fileSystem.source(source);
        java.lang.Throwable th2 = null;
        try {
            okio.Source source3 = source2;
            okio.BufferedSink buffer = okio.Okio.buffer(fileSystem.sink(target));
            try {
                l = java.lang.Long.valueOf(buffer.writeAll(source3));
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th4) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (java.lang.Throwable th5) {
                        kotlin.ExceptionsKt.addSuppressed(th4, th5);
                    }
                }
                th = th4;
                l = null;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            if (source2 != null) {
                try {
                    source2.close();
                } catch (java.lang.Throwable th7) {
                    kotlin.ExceptionsKt.addSuppressed(th, th7);
                }
            }
        }
        if (th == null) {
            ?? valueOf = java.lang.Long.valueOf(l.longValue());
            if (source2 != null) {
                try {
                    source2.close();
                } catch (java.lang.Throwable th8) {
                    th2 = th8;
                }
            }
            java.lang.Throwable th9 = th2;
            th2 = valueOf;
            th = th9;
            if (th != null) {
                throw th;
            }
            return;
        }
        throw th;
    }
}
