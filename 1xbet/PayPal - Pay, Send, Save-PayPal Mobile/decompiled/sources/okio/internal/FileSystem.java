package okio.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!"}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", "path", "Lokio/FileMetadata;", "commonMetadata", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;", "", "commonExists", "(Lokio/FileSystem;Lokio/Path;)Z", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, "mustCreate", "", "commonCreateDirectories", "(Lokio/FileSystem;Lokio/Path;Z)V", "source", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "commonCopy", "(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lkotlin/sequences/Sequence;", "commonListRecursively", "(Lokio/FileSystem;Lokio/Path;Z)Lkotlin/sequences/Sequence;", "Lkotlin/sequences/SequenceScope;", "fileSystem", "Lkotlin/collections/ArrayDeque;", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "postorder", "collectRecursively", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "symlinkTarget", "(Lokio/FileSystem;Lokio/Path;)Lokio/Path;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes5.dex */
public final class FileSystem {
    public static final okio.FileMetadata commonMetadata(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.FileMetadata metadataOrNull = fileSystem.metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(path)));
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, okio.Path path, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        for (okio.Path path2 = path; path2 != null && !fileSystem.exists(path2); path2 = path2.parent()) {
            arrayDeque.addFirst(path2);
        }
        if (z && arrayDeque.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(path);
            sb.append(" already exists.");
            throw new java.io.IOException(sb.toString());
        }
        java.util.Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            okio.FileSystem.createDirectory$default(fileSystem, (okio.Path) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, okio.Path path, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.util.Iterator it = kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((okio.Path) it.next(), z && !it.hasNext());
        }
    }

    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(okio.FileSystem fileSystem, okio.Path path, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return kotlin.sequences.SequencesKt.sequence(new okio.internal.FileSystem$commonListRecursively$1(path, fileSystem, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ae, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01ac, code lost:
    
        if (r10.yield(r1, r4) == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0105, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
    
        if (r11 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        r14 = r10;
        r10 = r3;
        r16 = r2;
        r2 = r0;
        r0 = r11;
        r11 = r1;
        r1 = r16;
        r17 = r12;
        r12 = r6;
        r6 = r3.iterator();
        r13 = r9;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0170, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0171, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c2, code lost:
    
        if (r18.yield(r1, r4) != r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a5  */
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
        okio.FileSystem fileSystem3;
        kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope2;
        boolean z4;
        java.util.List<okio.Path> listOrNull;
        okio.Path path2 = path;
        boolean z5 = z2;
        if (continuation instanceof okio.internal.FileSystem$collectRecursively$1) {
            fileSystem$collectRecursively$1 = (okio.internal.FileSystem$collectRecursively$1) continuation;
            if ((fileSystem$collectRecursively$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                fileSystem$collectRecursively$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = fileSystem$collectRecursively$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileSystem$collectRecursively$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z5) {
                        fileSystem2 = fileSystem;
                        arrayDeque2 = arrayDeque;
                        z3 = z;
                    } else {
                        fileSystem$collectRecursively$1.Camera2StreamConfigurationMap = sequenceScope;
                        fileSystem2 = fileSystem;
                        fileSystem$collectRecursively$1.getHighResolutionOutputSizeshNQ4ISI = fileSystem2;
                        arrayDeque2 = arrayDeque;
                        fileSystem$collectRecursively$1.getHighSpeedVideoFpsRanges = arrayDeque2;
                        fileSystem$collectRecursively$1.getHighSpeedVideoFpsRangesFor = path2;
                        z3 = z;
                        fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor = z3;
                        fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM = z5;
                        fileSystem$collectRecursively$1.getOutputStallDuration = 1;
                    }
                    fileSystem3 = fileSystem2;
                    boolean z6 = z3;
                    sequenceScope2 = sequenceScope;
                    z4 = z6;
                } else if (i == 1) {
                    boolean z7 = fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM;
                    boolean z8 = fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor;
                    okio.Path path3 = (okio.Path) fileSystem$collectRecursively$1.getHighSpeedVideoFpsRangesFor;
                    arrayDeque2 = (kotlin.collections.ArrayDeque) fileSystem$collectRecursively$1.getHighSpeedVideoFpsRanges;
                    fileSystem3 = (okio.FileSystem) fileSystem$collectRecursively$1.getHighResolutionOutputSizeshNQ4ISI;
                    sequenceScope2 = (kotlin.sequences.SequenceScope) fileSystem$collectRecursively$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z5 = z7;
                    z4 = z8;
                    path2 = path3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z9 = fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM;
                        boolean z10 = fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    int i2 = fileSystem$collectRecursively$1.getHighSpeedVideoSizes;
                    boolean z11 = fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM;
                    boolean z12 = fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor;
                    java.util.Iterator<okio.Path> it = (java.util.Iterator) fileSystem$collectRecursively$1.getOutputFormats;
                    okio.Path path4 = (okio.Path) fileSystem$collectRecursively$1.getInputFormats;
                    java.util.List<okio.Path> list = (java.util.List) fileSystem$collectRecursively$1.getInputSizeshNQ4ISI;
                    okio.Path path5 = (okio.Path) fileSystem$collectRecursively$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.collections.ArrayDeque<okio.Path> arrayDeque3 = (kotlin.collections.ArrayDeque) fileSystem$collectRecursively$1.getHighSpeedVideoFpsRanges;
                    okio.FileSystem fileSystem4 = (okio.FileSystem) fileSystem$collectRecursively$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.sequences.SequenceScope<? super okio.Path> sequenceScope3 = (kotlin.sequences.SequenceScope) fileSystem$collectRecursively$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            okio.Path next = it.next();
                            fileSystem$collectRecursively$1.Camera2StreamConfigurationMap = sequenceScope3;
                            fileSystem$collectRecursively$1.getHighResolutionOutputSizeshNQ4ISI = fileSystem4;
                            fileSystem$collectRecursively$1.getHighSpeedVideoFpsRanges = arrayDeque3;
                            fileSystem$collectRecursively$1.getHighSpeedVideoFpsRangesFor = path5;
                            fileSystem$collectRecursively$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            fileSystem$collectRecursively$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(path4);
                            fileSystem$collectRecursively$1.getOutputFormats = it;
                            fileSystem$collectRecursively$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor = z12;
                            fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM = z11;
                            fileSystem$collectRecursively$1.getHighSpeedVideoSizes = i2;
                            fileSystem$collectRecursively$1.getOutputStallDuration = 2;
                            if (collectRecursively(sequenceScope3, fileSystem4, arrayDeque3, next, z12, z11, fileSystem$collectRecursively$1) == coroutine_suspended) {
                                break;
                            }
                        }
                        arrayDeque3.removeLast();
                        z4 = z12;
                        listOrNull = list;
                        arrayDeque2 = arrayDeque3;
                        fileSystem3 = fileSystem4;
                        sequenceScope2 = sequenceScope3;
                        z5 = z11;
                        path2 = path5;
                        if (!z5) {
                            return kotlin.Unit.INSTANCE;
                        }
                        fileSystem$collectRecursively$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope2);
                        fileSystem$collectRecursively$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fileSystem3);
                        fileSystem$collectRecursively$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayDeque2);
                        fileSystem$collectRecursively$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(path2);
                        fileSystem$collectRecursively$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOrNull);
                        fileSystem$collectRecursively$1.getInputFormats = null;
                        fileSystem$collectRecursively$1.getOutputFormats = null;
                        fileSystem$collectRecursively$1.getOutputMinFrameDuration = null;
                        fileSystem$collectRecursively$1.getHighSpeedVideoSizesFor = z4;
                        fileSystem$collectRecursively$1.getOutputMinFrameDurationlomOqCM = z5;
                        fileSystem$collectRecursively$1.getOutputStallDuration = 3;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        arrayDeque3.removeLast();
                        throw th;
                    }
                }
                listOrNull = fileSystem3.listOrNull(path2);
                if (listOrNull == null) {
                    listOrNull = kotlin.collections.CollectionsKt.emptyList();
                }
                if (!listOrNull.isEmpty()) {
                    int i3 = 0;
                    okio.Path path6 = path2;
                    while (true) {
                        if (z4 && arrayDeque2.contains(path6)) {
                            throw new java.io.IOException("symlink cycle at ".concat(java.lang.String.valueOf(path2)));
                        }
                        okio.Path symlinkTarget = symlinkTarget(fileSystem3, path6);
                        if (symlinkTarget == null) {
                            break;
                        }
                        i3++;
                        path6 = symlinkTarget;
                    }
                }
                if (!z5) {
                }
            }
        }
        fileSystem$collectRecursively$1 = new okio.internal.FileSystem$collectRecursively$1(continuation);
        java.lang.Object obj2 = fileSystem$collectRecursively$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileSystem$collectRecursively$1.getOutputStallDuration;
        if (i != 0) {
        }
        listOrNull = fileSystem3.listOrNull(path2);
        if (listOrNull == null) {
        }
        if (!listOrNull.isEmpty()) {
        }
        if (!z5) {
        }
    }

    public static final okio.Path symlinkTarget(okio.FileSystem fileSystem, okio.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        okio.Path parent = path.parent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
        return parent.resolve(symlinkTarget);
    }

    public static final void commonCopy(okio.FileSystem fileSystem, okio.Path path, okio.Path path2) throws java.io.IOException {
        java.lang.Long l;
        java.lang.Throwable th;
        java.lang.Long l2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        okio.Source source = fileSystem.source(path);
        java.lang.Throwable th2 = null;
        try {
            okio.Source source2 = source;
            okio.BufferedSink buffer = okio.Okio.buffer(okio.FileSystem.sink$default(fileSystem, path2, false, 2, null));
            try {
                l2 = java.lang.Long.valueOf(buffer.writeAll(source2));
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
                l2 = null;
            }
        } catch (java.lang.Throwable th6) {
            if (source != null) {
                try {
                    source.close();
                } catch (java.lang.Throwable th7) {
                    kotlin.ExceptionsKt.addSuppressed(th6, th7);
                }
            }
            th2 = th6;
            l = null;
        }
        if (th != null) {
            throw th;
        }
        long longValue = l2.longValue();
        if (source != null) {
            try {
                source.close();
            } catch (java.lang.Throwable th8) {
                th2 = th8;
            }
        }
        l = java.lang.Long.valueOf(longValue);
        if (th2 != null) {
            throw th2;
        }
    }
}
