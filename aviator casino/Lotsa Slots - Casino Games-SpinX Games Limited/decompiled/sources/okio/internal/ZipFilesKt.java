package okio.internal;

/* compiled from: ZipFiles.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0002\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0000\u001a.\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020&0%H\u0000\u001a\f\u0010'\u001a\u00020\u0016*\u00020(H\u0000\u001a\f\u0010)\u001a\u00020**\u00020(H\u0002\u001a.\u0010+\u001a\u00020,*\u00020(2\u0006\u0010-\u001a\u00020\u00012\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020,0/H\u0002\u001a\u0014\u00100\u001a\u00020\u0016*\u00020(2\u0006\u00101\u001a\u00020\u0016H\u0000\u001a\u0018\u00102\u001a\u0004\u0018\u00010\u0016*\u00020(2\b\u00101\u001a\u0004\u0018\u00010\u0016H\u0002\u001a\u0014\u00103\u001a\u00020**\u00020(2\u0006\u00104\u001a\u00020*H\u0002\u001a\f\u00105\u001a\u00020,*\u00020(H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u00066"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_NTFS_EXTRA", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "filetimeToEpochMillis", "filetime", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readCentralDirectoryZipEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "centralDirectoryZipEntry", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_NTFS_EXTRA = 10;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path path, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<okio.internal.ZipEntry, java.lang.Boolean>() { // from class: okio.internal.ZipFilesKt$openZip$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(okio.internal.ZipEntry it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        return openZip(path, fileSystem, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0198, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016c, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0170, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0171, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0178, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0179, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017a, code lost:
    
        if (r5 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x017c, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0180, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0182, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        r10 = readEocdRecord(r12);
        r11 = r12.readUtf8(r10.getCommentByteCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r12.close();
        r6 = r6 - 20;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r6 <= r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r6 = okio.Okio.buffer(r5.source(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r0.readIntLe() != okio.internal.ZipFilesKt.ZIP64_LOCATOR_SIGNATURE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r7 = r0.readIntLe();
        r13 = r0.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r0.readIntLe() != 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r7 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r7 = okio.Okio.buffer(r5.source(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r0 = r7;
        r13 = r0.readIntLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r13 != okio.internal.ZipFilesKt.ZIP64_EOCD_RECORD_SIGNATURE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        r10 = readZip64EocdRecord(r0, r10);
        r13 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r7 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        throw new java.io.IOException("bad zip: expected " + getHex(okio.internal.ZipFilesKt.ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r7 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        r0 = r0;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        if (r6 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
    
        if (r6 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        r0 = r0;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r6 = new java.util.ArrayList();
        r5 = okio.Okio.buffer(r5.source(r10.getCentralDirectoryOffset()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        r0 = r5;
        r7 = r10.getEntryCount();
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        r9 = readCentralDirectoryZipEntry(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0147, code lost:
    
        if (r9.getOffset() < r10.getCentralDirectoryOffset()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
    
        if (r23.invoke(r9).booleanValue() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0155, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0167, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0168, code lost:
    
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
    
        if (r5 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0172, code lost:
    
        r20 = r12;
        r12 = r3;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r3 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        r12 = r12;
        r3 = new okio.ZipFileSystem(r21, r22, buildIndex(r6), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0192, code lost:
    
        if (r4 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0197, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111 A[Catch: all -> 0x01ca, TryCatch #8 {all -> 0x01ca, blocks: (B:3:0x001d, B:5:0x002e, B:6:0x0037, B:19:0x0055, B:21:0x0061, B:60:0x0111, B:61:0x0114, B:75:0x010a, B:76:0x0115, B:97:0x0187, B:104:0x0198, B:118:0x0182, B:10:0x0199, B:14:0x01a7, B:15:0x01ae, B:121:0x01b0, B:122:0x01b3, B:123:0x01b4, B:124:0x01c9, B:114:0x017c, B:23:0x006c, B:25:0x0078, B:28:0x0089, B:36:0x00e8, B:37:0x00eb, B:53:0x00e1, B:54:0x00ec, B:55:0x00f3, B:56:0x00f4, B:30:0x0094, B:32:0x00a0, B:42:0x00b0, B:43:0x00d6, B:49:0x00db, B:78:0x012c, B:81:0x0139, B:83:0x0149, B:85:0x0155, B:87:0x015b, B:90:0x0160, B:91:0x0167, B:93:0x0168, B:71:0x0104, B:8:0x003f, B:18:0x0048), top: B:2:0x001d, inners: #0, #2, #6, #7, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114 A[Catch: all -> 0x01ca, TryCatch #8 {all -> 0x01ca, blocks: (B:3:0x001d, B:5:0x002e, B:6:0x0037, B:19:0x0055, B:21:0x0061, B:60:0x0111, B:61:0x0114, B:75:0x010a, B:76:0x0115, B:97:0x0187, B:104:0x0198, B:118:0x0182, B:10:0x0199, B:14:0x01a7, B:15:0x01ae, B:121:0x01b0, B:122:0x01b3, B:123:0x01b4, B:124:0x01c9, B:114:0x017c, B:23:0x006c, B:25:0x0078, B:28:0x0089, B:36:0x00e8, B:37:0x00eb, B:53:0x00e1, B:54:0x00ec, B:55:0x00f3, B:56:0x00f4, B:30:0x0094, B:32:0x00a0, B:42:0x00b0, B:43:0x00d6, B:49:0x00db, B:78:0x012c, B:81:0x0139, B:83:0x0149, B:85:0x0155, B:87:0x015b, B:90:0x0160, B:91:0x0167, B:93:0x0168, B:71:0x0104, B:8:0x003f, B:18:0x0048), top: B:2:0x001d, inners: #0, #2, #6, #7, #12 }] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final okio.ZipFileSystem openZip(okio.Path zipPath, okio.FileSystem fileSystem, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> predicate) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        okio.FileHandle openReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            okio.FileHandle fileHandle = openReadOnly;
            long size = fileHandle.size() - 22;
            long j = 0;
            if (size < 0) {
                throw new java.io.IOException("not a zip: size=" + fileHandle.size());
            }
            long max = java.lang.Math.max(size - android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
            while (true) {
                okio.BufferedSource buffer = okio.Okio.buffer(fileHandle.source(size));
                try {
                    if (buffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        break;
                    }
                    buffer.close();
                    size--;
                    if (size < max) {
                        throw new java.io.IOException("not a zip: end of central directory signature not found");
                    }
                    j = 0;
                } catch (java.lang.Throwable th) {
                    buffer.close();
                    throw th;
                }
            }
        } finally {
        }
    }

    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> list) {
        okio.Path path = okio.Path.Companion.get$default(okio.Path.INSTANCE, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 1, (java.lang.Object) null);
        java.util.Map<okio.Path, okio.internal.ZipEntry> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(path, new okio.internal.ZipEntry(path, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        java.util.Iterator it = kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((okio.internal.ZipEntry) t).getCanonicalPath(), ((okio.internal.ZipEntry) t2).getCanonicalPath());
            }
        }).iterator();
        while (it.hasNext()) {
            okio.internal.ZipEntry zipEntry = (okio.internal.ZipEntry) it.next();
            if (mutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    okio.Path parent = zipEntry.getCanonicalPath().parent();
                    if (parent != null) {
                        okio.internal.ZipEntry zipEntry2 = mutableMapOf.get(parent);
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
        }
        return mutableMapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final okio.internal.ZipEntry readCentralDirectoryZipEntry(final okio.BufferedSource bufferedSource) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new java.io.IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(readIntLe));
        }
        bufferedSource.skip(4L);
        short readShortLe = bufferedSource.readShortLe();
        int i = readShortLe & kotlin.UShort.MAX_VALUE;
        if ((readShortLe & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        int readShortLe2 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int readShortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int readShortLe4 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        long readIntLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
        longRef2.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int readShortLe5 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int readShortLe6 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int readShortLe7 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        bufferedSource.skip(8L);
        final kotlin.jvm.internal.Ref.LongRef longRef3 = new kotlin.jvm.internal.Ref.LongRef();
        longRef3.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        java.lang.String readUtf8 = bufferedSource.readUtf8(readShortLe5);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) readUtf8, (char) 0, false, 2, (java.lang.Object) null)) {
            throw new java.io.IOException("bad zip: filename contains 0x00");
        }
        long j = longRef2.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (longRef.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j += 8;
        }
        if (longRef3.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j += 8;
        }
        final long j2 = j;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        readExtra(bufferedSource, readShortLe6, new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Long l) {
                invoke(num.intValue(), l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i2, long j3) {
                if (i2 != 1) {
                    if (i2 != 10) {
                        return;
                    }
                    if (j3 < 4) {
                        throw new java.io.IOException("bad zip: NTFS extra too short");
                    }
                    bufferedSource.skip(4L);
                    final kotlin.jvm.internal.Ref.ObjectRef<java.lang.Long> objectRef4 = objectRef;
                    final okio.BufferedSource bufferedSource2 = bufferedSource;
                    final kotlin.jvm.internal.Ref.ObjectRef<java.lang.Long> objectRef5 = objectRef2;
                    final kotlin.jvm.internal.Ref.ObjectRef<java.lang.Long> objectRef6 = objectRef3;
                    okio.internal.ZipFilesKt.readExtra(bufferedSource, (int) (j3 - 4), new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: okio.internal.ZipFilesKt$readCentralDirectoryZipEntry$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Long l) {
                            invoke(num.intValue(), l.longValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r4v11, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Long] */
                        /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Long] */
                        public final void invoke(int i3, long j4) {
                            if (i3 == 1) {
                                if (objectRef4.element != null) {
                                    throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                                }
                                if (j4 != 24) {
                                    throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                                }
                                objectRef4.element = java.lang.Long.valueOf(bufferedSource2.readLongLe());
                                objectRef5.element = java.lang.Long.valueOf(bufferedSource2.readLongLe());
                                objectRef6.element = java.lang.Long.valueOf(bufferedSource2.readLongLe());
                            }
                        }
                    });
                    return;
                }
                if (kotlin.jvm.internal.Ref.BooleanRef.this.element) {
                    throw new java.io.IOException("bad zip: zip64 extra repeated");
                }
                kotlin.jvm.internal.Ref.BooleanRef.this.element = true;
                if (j3 < j2) {
                    throw new java.io.IOException("bad zip: zip64 extra too short");
                }
                kotlin.jvm.internal.Ref.LongRef longRef4 = longRef2;
                longRef4.element = longRef4.element == 4294967295L ? bufferedSource.readLongLe() : longRef2.element;
                kotlin.jvm.internal.Ref.LongRef longRef5 = longRef;
                longRef5.element = longRef5.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
                kotlin.jvm.internal.Ref.LongRef longRef6 = longRef3;
                longRef6.element = longRef6.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
            }
        });
        if (j2 > 0 && !booleanRef.element) {
            throw new java.io.IOException("bad zip: zip64 extra required but absent");
        }
        return new okio.internal.ZipEntry(okio.Path.Companion.get$default(okio.Path.INSTANCE, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 1, (java.lang.Object) null).resolve(readUtf8), kotlin.text.StringsKt.endsWith$default(readUtf8, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, false, 2, (java.lang.Object) null), bufferedSource.readUtf8(readShortLe7), readIntLe2, longRef.element, longRef2.element, readShortLe2, longRef3.element, readShortLe4, readShortLe3, (java.lang.Long) objectRef.element, (java.lang.Long) objectRef2.element, (java.lang.Long) objectRef3.element, null, null, null, 57344, null);
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource bufferedSource) throws java.io.IOException {
        int readShortLe = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        int readShortLe2 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        long readShortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        if (readShortLe3 != (bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE) || readShortLe != 0 || readShortLe2 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new okio.internal.EocdRecord(readShortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & bufferedSource.readIntLe(), bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE);
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource bufferedSource, okio.internal.EocdRecord eocdRecord) throws java.io.IOException {
        bufferedSource.skip(12L);
        int readIntLe = bufferedSource.readIntLe();
        int readIntLe2 = bufferedSource.readIntLe();
        long readLongLe = bufferedSource.readLongLe();
        if (readLongLe != bufferedSource.readLongLe() || readIntLe != 0 || readIntLe2 != 0) {
            throw new java.io.IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new okio.internal.EocdRecord(readLongLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readExtra(okio.BufferedSource bufferedSource, int i, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function2) {
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
                throw new java.io.IOException("unsupported zip: too many bytes processed for " + readShortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - readShortLe2;
        }
    }

    public static final void skipLocalHeader(okio.BufferedSource bufferedSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }

    public static final okio.internal.ZipEntry readLocalHeader(okio.BufferedSource bufferedSource, okio.internal.ZipEntry centralDirectoryZipEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        okio.internal.ZipEntry readOrSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, centralDirectoryZipEntry);
        kotlin.jvm.internal.Intrinsics.checkNotNull(readOrSkipLocalHeader);
        return readOrSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final okio.internal.ZipEntry readOrSkipLocalHeader(final okio.BufferedSource bufferedSource, okio.internal.ZipEntry zipEntry) {
        int readIntLe = bufferedSource.readIntLe();
        if (readIntLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new java.io.IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(readIntLe));
        }
        bufferedSource.skip(2L);
        short readShortLe = bufferedSource.readShortLe();
        int i = readShortLe & kotlin.UShort.MAX_VALUE;
        if ((readShortLe & 1) != 0) {
            throw new java.io.IOException("unsupported zip: general purpose bit flag=" + getHex(i));
        }
        bufferedSource.skip(18L);
        long readShortLe2 = bufferedSource.readShortLe() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int readShortLe3 = bufferedSource.readShortLe() & kotlin.UShort.MAX_VALUE;
        bufferedSource.skip(readShortLe2);
        if (zipEntry == null) {
            bufferedSource.skip(readShortLe3);
            return null;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
        readExtra(bufferedSource, readShortLe3, new kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Long l) {
                invoke(num.intValue(), l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r11v10, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r11v5, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r11v8, types: [T, java.lang.Integer] */
            public final void invoke(int i2, long j) {
                if (i2 == 21589) {
                    if (j < 1) {
                        throw new java.io.IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = okio.BufferedSource.this.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    okio.BufferedSource bufferedSource2 = okio.BufferedSource.this;
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
                        objectRef.element = java.lang.Integer.valueOf(bufferedSource2.readIntLe());
                    }
                    if (z2) {
                        objectRef2.element = java.lang.Integer.valueOf(okio.BufferedSource.this.readIntLe());
                    }
                    if (z3) {
                        objectRef3.element = java.lang.Integer.valueOf(okio.BufferedSource.this.readIntLe());
                    }
                }
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

    private static final java.lang.String getHex(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0x");
        java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb.append(num);
        return sb.toString();
    }
}
