package okio.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0014\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u0005*\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010$\"\u0018\u0010'\u001a\u00020&*\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "(Lokio/Path;Lokio/FileSystem;Lkotlin/jvm/functions/Function1;)Lokio/ZipFileSystem;", "Lokio/BufferedSource;", "readCentralDirectoryZipEntry", "(Lokio/BufferedSource;)Lokio/internal/ZipEntry;", "", "p0", "Lkotlin/Function2;", "", "", "p1", "getHighSpeedVideoSizes", "(Lokio/BufferedSource;ILkotlin/jvm/functions/Function2;)V", "skipLocalHeader", "(Lokio/BufferedSource;)V", "centralDirectoryZipEntry", "readLocalHeader", "(Lokio/BufferedSource;Lokio/internal/ZipEntry;)Lokio/internal/ZipEntry;", "getHighSpeedVideoFpsRangesFor", "filetime", "filetimeToEpochMillis", "(J)J", "date", "time", "dosDateTimeToEpochMillis", "(II)Ljava/lang/Long;", "COMPRESSION_METHOD_DEFLATED", com.visa.cbp.getEncExpo.warmup, "COMPRESSION_METHOD_STORED", "", "Camera2StreamConfigurationMap", "(I)Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ZipFilesKt {
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path path, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(okio.internal.ZipFilesKt.$r8$lambda$0m49k6ldQ8oWxV_T6wYMEhGRS1M((okio.internal.ZipEntry) obj2));
                }
            };
        }
        return openZip(path, fileSystem, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[Catch: all -> 0x0318, TryCatch #9 {all -> 0x0318, blocks: (B:3:0x0018, B:5:0x0029, B:6:0x0031, B:27:0x008d, B:29:0x009b, B:80:0x0186, B:81:0x0189, B:94:0x017f, B:95:0x018a, B:119:0x0203, B:120:0x025a, B:122:0x0260, B:125:0x0272, B:127:0x027c, B:131:0x0284, B:129:0x0292, B:137:0x02d1, B:144:0x02de, B:149:0x01fc, B:10:0x02e5, B:14:0x02f3, B:15:0x02fa, B:164:0x02fc, B:165:0x02ff, B:166:0x0300, B:167:0x0317, B:31:0x00a6, B:33:0x00b2, B:36:0x00c2, B:51:0x015c, B:52:0x015f, B:68:0x0155, B:74:0x0160, B:75:0x0165, B:76:0x0166, B:65:0x014e, B:146:0x01f5, B:8:0x0039, B:18:0x0042, B:26:0x0068, B:161:0x02df, B:162:0x02e4, B:91:0x0178), top: B:2:0x0018, inners: #8, #11, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de A[Catch: all -> 0x0318, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0318, blocks: (B:3:0x0018, B:5:0x0029, B:6:0x0031, B:27:0x008d, B:29:0x009b, B:80:0x0186, B:81:0x0189, B:94:0x017f, B:95:0x018a, B:119:0x0203, B:120:0x025a, B:122:0x0260, B:125:0x0272, B:127:0x027c, B:131:0x0284, B:129:0x0292, B:137:0x02d1, B:144:0x02de, B:149:0x01fc, B:10:0x02e5, B:14:0x02f3, B:15:0x02fa, B:164:0x02fc, B:165:0x02ff, B:166:0x0300, B:167:0x0317, B:31:0x00a6, B:33:0x00b2, B:36:0x00c2, B:51:0x015c, B:52:0x015f, B:68:0x0155, B:74:0x0160, B:75:0x0165, B:76:0x0166, B:65:0x014e, B:146:0x01f5, B:8:0x0039, B:18:0x0042, B:26:0x0068, B:161:0x02df, B:162:0x02e4, B:91:0x0178), top: B:2:0x0018, inners: #8, #11, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:31:0x00a6, B:33:0x00b2, B:36:0x00c2, B:51:0x015c, B:52:0x015f, B:68:0x0155, B:74:0x0160, B:75:0x0165, B:76:0x0166, B:65:0x014e), top: B:30:0x00a6, outer: #9, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f A[Catch: all -> 0x0174, TryCatch #8 {all -> 0x0174, blocks: (B:31:0x00a6, B:33:0x00b2, B:36:0x00c2, B:51:0x015c, B:52:0x015f, B:68:0x0155, B:74:0x0160, B:75:0x0165, B:76:0x0166, B:65:0x014e), top: B:30:0x00a6, outer: #9, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final okio.ZipFileSystem openZip(okio.Path path, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> function1) throws java.io.IOException {
        java.util.ArrayList arrayList;
        kotlin.Unit unit;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        kotlin.Unit unit2;
        java.lang.Throwable th3;
        kotlin.Unit unit3;
        okio.BufferedSource bufferedSource;
        int readIntLe;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        okio.FileHandle openReadOnly = fileSystem.openReadOnly(path);
        try {
            okio.FileHandle fileHandle = openReadOnly;
            long size = fileHandle.size();
            long j = size - 22;
            if (j < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("not a zip: size=");
                sb.append(fileHandle.size());
                throw new java.io.IOException(sb.toString());
            }
            long max = java.lang.Math.max(size - 65558, 0L);
            do {
                okio.BufferedSource buffer = okio.Okio.buffer(fileHandle.source(j));
                try {
                    if (buffer.readIntLe() != 101010256) {
                        buffer.close();
                        j--;
                    } else {
                        short readShortLe = buffer.readShortLe();
                        short readShortLe2 = buffer.readShortLe();
                        long readShortLe3 = buffer.readShortLe() & kotlin.UShort.MAX_VALUE;
                        if (readShortLe3 != (buffer.readShortLe() & kotlin.UShort.MAX_VALUE) || (readShortLe & kotlin.UShort.MAX_VALUE) != 0 || (readShortLe2 & kotlin.UShort.MAX_VALUE) != 0) {
                            throw new java.io.IOException("unsupported zip: spanned");
                        }
                        buffer.skip(4L);
                        okio.internal.EocdRecord eocdRecord = new okio.internal.EocdRecord(readShortLe3, buffer.readIntLe() & 4294967295L, buffer.readShortLe() & kotlin.UShort.MAX_VALUE);
                        java.lang.String readUtf8 = buffer.readUtf8(eocdRecord.getHighSpeedVideoFpsRanges);
                        buffer.close();
                        long j2 = j - 20;
                        if (j2 > 0) {
                            okio.BufferedSource buffer2 = okio.Okio.buffer(fileHandle.source(j2));
                            try {
                                okio.BufferedSource bufferedSource2 = buffer2;
                                if (bufferedSource2.readIntLe() == 117853008) {
                                    int readIntLe2 = bufferedSource2.readIntLe();
                                    long readLongLe = bufferedSource2.readLongLe();
                                    if (bufferedSource2.readIntLe() != 1 || readIntLe2 != 0) {
                                        throw new java.io.IOException("unsupported zip: spanned");
                                    }
                                    okio.BufferedSource buffer3 = okio.Okio.buffer(fileHandle.source(readLongLe));
                                    try {
                                        bufferedSource = buffer3;
                                        readIntLe = bufferedSource.readIntLe();
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                    if (readIntLe != 101075792) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append("bad zip: expected ");
                                        sb2.append(Camera2StreamConfigurationMap(101075792));
                                        sb2.append(" but was ");
                                        sb2.append(Camera2StreamConfigurationMap(readIntLe));
                                        throw new java.io.IOException(sb2.toString());
                                    }
                                    bufferedSource.skip(12L);
                                    int readIntLe3 = bufferedSource.readIntLe();
                                    int readIntLe4 = bufferedSource.readIntLe();
                                    long readLongLe2 = bufferedSource.readLongLe();
                                    if (readLongLe2 != bufferedSource.readLongLe() || readIntLe3 != 0 || readIntLe4 != 0) {
                                        throw new java.io.IOException("unsupported zip: spanned");
                                    }
                                    bufferedSource.skip(8L);
                                    okio.internal.EocdRecord eocdRecord2 = new okio.internal.EocdRecord(readLongLe2, bufferedSource.readLongLe(), eocdRecord.getHighSpeedVideoFpsRanges);
                                    try {
                                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                        if (buffer3 != null) {
                                            try {
                                                buffer3.close();
                                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                            } catch (java.lang.Throwable th5) {
                                                th3 = th5;
                                                unit3 = unit4;
                                            }
                                        }
                                        unit3 = unit4;
                                        th3 = null;
                                        eocdRecord = eocdRecord2;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        eocdRecord = eocdRecord2;
                                        java.lang.Throwable th7 = th;
                                        if (buffer3 != null) {
                                            try {
                                                buffer3.close();
                                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                            } catch (java.lang.Throwable th8) {
                                                kotlin.ExceptionsKt.addSuppressed(th7, th8);
                                            }
                                        }
                                        th3 = th7;
                                        unit3 = null;
                                        if (th3 == null) {
                                        }
                                    }
                                    if (th3 == null) {
                                        throw th3;
                                    }
                                    kotlin.Unit unit7 = unit3;
                                }
                                unit2 = kotlin.Unit.INSTANCE;
                                if (buffer2 != null) {
                                    try {
                                        buffer2.close();
                                        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    } catch (java.lang.Throwable th9) {
                                        th2 = th9;
                                    }
                                }
                                th2 = null;
                            } catch (java.lang.Throwable th10) {
                                if (buffer2 != null) {
                                    try {
                                        buffer2.close();
                                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    } catch (java.lang.Throwable th11) {
                                        kotlin.ExceptionsKt.addSuppressed(th10, th11);
                                    }
                                }
                                th2 = th10;
                                unit2 = null;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            kotlin.Unit unit10 = unit2;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        okio.BufferedSource buffer4 = okio.Okio.buffer(fileHandle.source(eocdRecord.getHighSpeedVideoFpsRangesFor));
                        try {
                            okio.BufferedSource bufferedSource3 = buffer4;
                            long j3 = eocdRecord.Camera2StreamConfigurationMap;
                            long j4 = 0;
                            while (j4 < j3) {
                                okio.internal.ZipEntry readCentralDirectoryZipEntry = readCentralDirectoryZipEntry(bufferedSource3);
                                arrayList = arrayList2;
                                try {
                                    if (readCentralDirectoryZipEntry.getOffset() >= eocdRecord.getHighSpeedVideoFpsRangesFor) {
                                        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (function1.invoke(readCentralDirectoryZipEntry).booleanValue()) {
                                        arrayList.add(readCentralDirectoryZipEntry);
                                    }
                                    j4++;
                                    arrayList2 = arrayList;
                                } catch (java.lang.Throwable th12) {
                                    th = th12;
                                    java.lang.Throwable th13 = th;
                                    if (buffer4 != null) {
                                        try {
                                            buffer4.close();
                                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                                        } catch (java.lang.Throwable th14) {
                                            kotlin.ExceptionsKt.addSuppressed(th13, th14);
                                        }
                                    }
                                    th = th13;
                                    unit = null;
                                    if (th == null) {
                                    }
                                }
                            }
                            arrayList = arrayList2;
                            unit = kotlin.Unit.INSTANCE;
                            if (buffer4 != null) {
                                try {
                                    buffer4.close();
                                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th15) {
                                    th = th15;
                                }
                            }
                            th = null;
                        } catch (java.lang.Throwable th16) {
                            th = th16;
                            arrayList = arrayList2;
                        }
                        if (th == null) {
                            throw th;
                        }
                        kotlin.Unit unit13 = unit;
                        okio.Path path2 = okio.Path.Companion.get$default(okio.Path.INSTANCE, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 1, (java.lang.Object) null);
                        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(path2, new okio.internal.ZipEntry(path2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
                        java.util.Iterator it = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return kotlin.comparisons.ComparisonsKt.compareValues(((okio.internal.ZipEntry) t).getCanonicalPath(), ((okio.internal.ZipEntry) t2).getCanonicalPath());
                            }
                        }).iterator();
                        while (it.hasNext()) {
                            okio.internal.ZipEntry zipEntry = (okio.internal.ZipEntry) it.next();
                            if (((okio.internal.ZipEntry) mutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                                while (true) {
                                    okio.Path parent = zipEntry.getCanonicalPath().parent();
                                    if (parent == null) {
                                        break;
                                    }
                                    okio.internal.ZipEntry zipEntry2 = (okio.internal.ZipEntry) mutableMapOf.get(parent);
                                    if (zipEntry2 != null) {
                                        zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                                        break;
                                    }
                                    okio.internal.ZipEntry zipEntry3 = new okio.internal.ZipEntry(parent, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                                    mutableMapOf.put(parent, zipEntry3);
                                    zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                                    zipEntry = zipEntry3;
                                    it = it;
                                }
                            }
                        }
                        okio.ZipFileSystem zipFileSystem = new okio.ZipFileSystem(path, fileSystem, mutableMapOf, readUtf8);
                        if (openReadOnly != null) {
                            try {
                                openReadOnly.close();
                                kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        return zipFileSystem;
                    }
                } catch (java.lang.Throwable th17) {
                    buffer.close();
                    throw th17;
                }
            } while (j >= max);
            throw new java.io.IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final okio.internal.ZipEntry readCentralDirectoryZipEntry(final okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != 33639248) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("bad zip: expected ");
            sb.append(Camera2StreamConfigurationMap(33639248));
            sb.append(" but was ");
            sb.append(Camera2StreamConfigurationMap(readIntLe));
            throw new java.io.IOException(sb.toString());
        }
        bufferedSource.skip(4L);
        short readShortLe = bufferedSource.readShortLe();
        if ((readShortLe & 1) != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unsupported zip: general purpose bit flag=");
            sb2.append(Camera2StreamConfigurationMap(readShortLe & kotlin.UShort.MAX_VALUE));
            throw new java.io.IOException(sb2.toString());
        }
        short readShortLe2 = bufferedSource.readShortLe();
        short readShortLe3 = bufferedSource.readShortLe();
        short readShortLe4 = bufferedSource.readShortLe();
        long readIntLe2 = bufferedSource.readIntLe();
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = bufferedSource.readIntLe() & 4294967295L;
        final kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
        longRef2.element = bufferedSource.readIntLe() & 4294967295L;
        short readShortLe5 = bufferedSource.readShortLe();
        short readShortLe6 = bufferedSource.readShortLe();
        short readShortLe7 = bufferedSource.readShortLe();
        bufferedSource.skip(8L);
        final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
        longRef3.element = bufferedSource.readIntLe() & 4294967295L;
        java.lang.String readUtf8 = bufferedSource.readUtf8(readShortLe5 & kotlin.UShort.MAX_VALUE);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) readUtf8, (char) 0, false, 2, (java.lang.Object) null)) {
            throw new java.io.IOException("bad zip: filename contains 0x00");
        }
        long j = longRef2.element == 4294967295L ? 8L : 0L;
        if (longRef.element == 4294967295L) {
            j += 8;
        }
        if (longRef3.element == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        getHighSpeedVideoSizes(bufferedSource, readShortLe6 & kotlin.UShort.MAX_VALUE, new kotlin.jvm.functions.Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return okio.internal.ZipFilesKt.m24454$r8$lambda$fzsduIAsuDmDx09oQZvsh85aRw(kotlin.jvm.internal.Ref.BooleanRef.this, j2, longRef2, bufferedSource, longRef, longRef3, objectRef, objectRef2, objectRef3, ((java.lang.Integer) obj).intValue(), ((java.lang.Long) obj2).longValue());
            }
        });
        if (j2 > 0 && !booleanRef.element) {
            throw new java.io.IOException("bad zip: zip64 extra required but absent");
        }
        return new okio.internal.ZipEntry(okio.Path.Companion.get$default(okio.Path.INSTANCE, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 1, (java.lang.Object) null).resolve(readUtf8), kotlin.text.StringsKt.endsWith$default(readUtf8, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null), bufferedSource.readUtf8(readShortLe7 & kotlin.UShort.MAX_VALUE), readIntLe2 & 4294967295L, longRef.element, longRef2.element, readShortLe2 & kotlin.UShort.MAX_VALUE, longRef3.element, readShortLe4 & kotlin.UShort.MAX_VALUE, readShortLe3 & kotlin.UShort.MAX_VALUE, (java.lang.Long) objectRef.element, (java.lang.Long) objectRef2.element, (java.lang.Long) objectRef3.element, null, null, null, 57344, null);
    }

    private static final void getHighSpeedVideoSizes(okio.BufferedSource bufferedSource, int i, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function2) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            int readShortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
            long readShortLe2 = bufferedSource.readShortLe() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < readShortLe2) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(readShortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(java.lang.Integer.valueOf(readShortLe), java.lang.Long.valueOf(readShortLe2));
            long size2 = (bufferedSource.getBuffer().size() + readShortLe2) - size;
            if (size2 < 0) {
                throw new java.io.IOException("unsupported zip: too many bytes processed for ".concat(java.lang.String.valueOf(readShortLe)));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - readShortLe2;
        }
    }

    public static final void skipLocalHeader(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        getHighSpeedVideoFpsRangesFor(bufferedSource, null);
    }

    public static final okio.internal.ZipEntry readLocalHeader(okio.BufferedSource bufferedSource, okio.internal.ZipEntry zipEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipEntry, "");
        okio.internal.ZipEntry highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bufferedSource, zipEntry);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final okio.internal.ZipEntry getHighSpeedVideoFpsRangesFor(final okio.BufferedSource bufferedSource, okio.internal.ZipEntry zipEntry) {
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != 67324752) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("bad zip: expected ");
            sb.append(Camera2StreamConfigurationMap(67324752));
            sb.append(" but was ");
            sb.append(Camera2StreamConfigurationMap(readIntLe));
            throw new java.io.IOException(sb.toString());
        }
        bufferedSource.skip(2L);
        short readShortLe = bufferedSource.readShortLe();
        if ((readShortLe & 1) != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unsupported zip: general purpose bit flag=");
            sb2.append(Camera2StreamConfigurationMap(readShortLe & kotlin.UShort.MAX_VALUE));
            throw new java.io.IOException(sb2.toString());
        }
        bufferedSource.skip(18L);
        long readShortLe2 = bufferedSource.readShortLe();
        int readShortLe3 = 65535 & bufferedSource.readShortLe();
        bufferedSource.skip(readShortLe2 & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (zipEntry == null) {
            bufferedSource.skip(readShortLe3);
            return null;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        getHighSpeedVideoSizes(bufferedSource, readShortLe3, new kotlin.jvm.functions.Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return okio.internal.ZipFilesKt.m24453$r8$lambda$00L8DWbjy5sZTSutntgRZsY7ng(okio.BufferedSource.this, objectRef, objectRef2, objectRef3, ((java.lang.Integer) obj).intValue(), ((java.lang.Long) obj2).longValue());
            }
        });
        return zipEntry.copy$okio((java.lang.Integer) objectRef.element, (java.lang.Integer) objectRef2.element, (java.lang.Integer) objectRef3.element);
    }

    public static final long filetimeToEpochMillis(long j) {
        return (j / 10000) - 11644473600000L;
    }

    public static final java.lang.Long dosDateTimeToEpochMillis(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        return java.lang.Long.valueOf(okio.internal._ZlibJvmKt.datePartsToEpochMillis(((i >> 9) & 127) + 1980, (i >> 5) & 15, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1));
    }

    private static final java.lang.String Camera2StreamConfigurationMap(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0x");
        java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    /* renamed from: $r8$lambda$00L8-DWbjy5sZTSutntgRZsY7ng, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24453$r8$lambda$00L8DWbjy5sZTSutntgRZsY7ng(okio.BufferedSource bufferedSource, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, int i, long j) {
        if (i == 21589) {
            if (j < 1) {
                throw new java.io.IOException("bad zip: extended timestamp extra too short");
            }
            byte readByte = bufferedSource.readByte();
            boolean z = (readByte & 1) == 1;
            boolean z2 = (readByte & 2) == 2;
            boolean z3 = (readByte & 4) == 4;
            long j2 = z ? 5L : 1L;
            if (z2) {
                j2 += 4;
            }
            if (z3) {
                j2 += 4;
            }
            if (j < j2) {
                throw new java.io.IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                objectRef.element = java.lang.Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z2) {
                objectRef2.element = java.lang.Integer.valueOf(bufferedSource.readIntLe());
            }
            if (z3) {
                objectRef3.element = java.lang.Integer.valueOf(bufferedSource.readIntLe());
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$0m49k6ldQ8oWxV_T6wYMEhGRS1M(okio.internal.ZipEntry zipEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipEntry, "");
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$BY2EJxV3DltaiT8Wp4_9EammrI8(kotlin.jvm.internal.Ref.ObjectRef objectRef, okio.BufferedSource bufferedSource, kotlin.jvm.internal.Ref.ObjectRef objectRef2, kotlin.jvm.internal.Ref.ObjectRef objectRef3, int i, long j) {
        if (i == 1) {
            if (objectRef.element != 0) {
                throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j != 24) {
                throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            objectRef.element = java.lang.Long.valueOf(bufferedSource.readLongLe());
            objectRef2.element = java.lang.Long.valueOf(bufferedSource.readLongLe());
            objectRef3.element = java.lang.Long.valueOf(bufferedSource.readLongLe());
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fzsduIAs-uDmDx09oQZvsh85aRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24454$r8$lambda$fzsduIAsuDmDx09oQZvsh85aRw(kotlin.jvm.internal.Ref.BooleanRef booleanRef, long j, kotlin.jvm.internal.Ref.LongRef longRef, final okio.BufferedSource bufferedSource, kotlin.jvm.internal.Ref.LongRef longRef2, kotlin.jvm.internal.Ref.LongRef longRef3, final kotlin.jvm.internal.Ref.ObjectRef objectRef, final kotlin.jvm.internal.Ref.ObjectRef objectRef2, final kotlin.jvm.internal.Ref.ObjectRef objectRef3, int i, long j2) {
        if (i != 1) {
            if (i == 10) {
                if (j2 < 4) {
                    throw new java.io.IOException("bad zip: NTFS extra too short");
                }
                bufferedSource.skip(4L);
                getHighSpeedVideoSizes(bufferedSource, (int) (j2 - 4), new kotlin.jvm.functions.Function2() { // from class: okio.internal.ZipFilesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return okio.internal.ZipFilesKt.$r8$lambda$BY2EJxV3DltaiT8Wp4_9EammrI8(kotlin.jvm.internal.Ref.ObjectRef.this, bufferedSource, objectRef2, objectRef3, ((java.lang.Integer) obj).intValue(), ((java.lang.Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (booleanRef.element) {
                throw new java.io.IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (j2 < j) {
                throw new java.io.IOException("bad zip: zip64 extra too short");
            }
            longRef.element = longRef.element == 4294967295L ? bufferedSource.readLongLe() : longRef.element;
            longRef2.element = longRef2.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
            longRef3.element = longRef3.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
        }
        return kotlin.Unit.INSTANCE;
    }
}
