package okio;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010)J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u0010-J\u001f\u00102\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00108R\u0016\u0010:\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00109"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Lokio/Path;", "zipPath", "fileSystem", "", "Lokio/internal/ZipEntry;", "entries", "", "comment", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "p0", "p1", "getHighSpeedVideoSizes", "(Lokio/Path;Z)Ljava/util/List;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lokio/Path;Lokio/Path;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "createSymlink", "getHighSpeedVideoFpsRangesFor", "Lokio/Path;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lokio/FileSystem;", "Ljava/util/Map;", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion_"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ZipFileSystem extends okio.FileSystem {
    private static final okio.ZipFileSystem.Companion_ Companion_ = new okio.ZipFileSystem.Companion_(null);
    private static final okio.Path getHighSpeedVideoFpsRanges = okio.Path.Companion.get$default(okio.Path.INSTANCE, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 1, (java.lang.Object) null);
    private final okio.FileSystem Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okio.Path getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public ZipFileSystem(okio.Path path, okio.FileSystem fileSystem, java.util.Map<okio.Path, okio.internal.ZipEntry> map, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = path;
        this.Camera2StreamConfigurationMap = fileSystem;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // okio.FileSystem
    public final okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        throw new java.lang.UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public final okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        throw new java.io.IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    public final java.util.List<okio.Path> list(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        java.util.List<okio.Path> highSpeedVideoSizes = getHighSpeedVideoSizes(dir, true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
        return highSpeedVideoSizes;
    }

    @Override // okio.FileSystem
    public final java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        return getHighSpeedVideoSizes(dir, false);
    }

    @Override // okio.FileSystem
    public final okio.Sink sink(okio.Path file, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final okio.Sink appendingSink(okio.Path file, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void createDirectory(okio.Path dir, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void atomicMove(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void delete(okio.Path path, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public final void createSymlink(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        throw new java.io.IOException("zip file systems are read-only");
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokio/ZipFileSystem$Companion_;", "", "<init>", "()V", "Lokio/Path;", "getHighSpeedVideoFpsRanges", "Lokio/Path;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final java.util.List<okio.Path> getHighSpeedVideoSizes(okio.Path p0, boolean p1) {
        okio.internal.ZipEntry zipEntry = this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoFpsRanges.resolve(p0, true));
        if (zipEntry != null) {
            return kotlin.collections.CollectionsKt.toList(zipEntry.getChildren());
        }
        if (p1) {
            throw new java.io.IOException("not a directory: ".concat(java.lang.String.valueOf(p0)));
        }
        return null;
    }

    @Override // okio.FileSystem
    public final okio.Path canonicalize(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.Path resolve = getHighSpeedVideoFpsRanges.resolve(path, true);
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(resolve)) {
            return resolve;
        }
        throw new java.io.FileNotFoundException(java.lang.String.valueOf(path));
    }

    @Override // okio.FileSystem
    public final okio.FileMetadata metadataOrNull(okio.Path path) {
        java.lang.Throwable th;
        okio.internal.ZipEntry zipEntry;
        java.lang.Throwable th2;
        okio.internal.ZipEntry zipEntry2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        okio.internal.ZipEntry zipEntry3 = this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoFpsRanges.resolve(path, true));
        if (zipEntry3 == null) {
            return null;
        }
        if (zipEntry3.getOffset() != -1) {
            okio.FileHandle openReadOnly = this.Camera2StreamConfigurationMap.openReadOnly(this.getHighResolutionOutputSizeshNQ4ISI);
            try {
                okio.BufferedSource buffer = okio.Okio.buffer(openReadOnly.source(zipEntry3.getOffset()));
                try {
                    zipEntry2 = okio.internal.ZipFilesKt.readLocalHeader(buffer, zipEntry3);
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (java.lang.Throwable th4) {
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (java.lang.Throwable th5) {
                            kotlin.ExceptionsKt.addSuppressed(th4, th5);
                        }
                    }
                    th2 = th4;
                    zipEntry2 = null;
                }
            } catch (java.lang.Throwable th6) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (java.lang.Throwable th7) {
                        kotlin.ExceptionsKt.addSuppressed(th6, th7);
                    }
                }
                th = th6;
                zipEntry = null;
            }
            if (th2 != null) {
                throw th2;
            }
            zipEntry = zipEntry2;
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (java.lang.Throwable th8) {
                    th = th8;
                }
            }
            th = null;
            if (th != null) {
                throw th;
            }
            zipEntry3 = zipEntry;
        }
        return new okio.FileMetadata(!zipEntry3.getIsDirectory(), zipEntry3.getIsDirectory(), null, zipEntry3.getIsDirectory() ? null : java.lang.Long.valueOf(zipEntry3.getSize()), zipEntry3.getCreatedAtMillis$okio(), zipEntry3.getLastModifiedAtMillis$okio(), zipEntry3.getLastAccessedAtMillis$okio(), null, 128, null);
    }

    @Override // okio.FileSystem
    public final okio.Source source(okio.Path file) throws java.io.IOException {
        okio.BufferedSource bufferedSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        okio.internal.ZipEntry zipEntry = this.getHighSpeedVideoFpsRangesFor.get(getHighSpeedVideoFpsRanges.resolve(file, true));
        if (zipEntry == null) {
            throw new java.io.FileNotFoundException("no such file: ".concat(java.lang.String.valueOf(file)));
        }
        okio.FileHandle openReadOnly = this.Camera2StreamConfigurationMap.openReadOnly(this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.Throwable th = null;
        try {
            bufferedSource = okio.Okio.buffer(openReadOnly.source(zipEntry.getOffset()));
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (openReadOnly != null) {
                try {
                    openReadOnly.close();
                } catch (java.lang.Throwable th4) {
                    kotlin.ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            bufferedSource = null;
            th = th3;
        }
        if (th == null) {
            okio.BufferedSource bufferedSource2 = bufferedSource;
            okio.internal.ZipFilesKt.skipLocalHeader(bufferedSource2);
            if (zipEntry.getCompressionMethod() == 0) {
                return new okio.internal.FixedLengthSource(bufferedSource2, zipEntry.getSize(), true);
            }
            return new okio.internal.FixedLengthSource(new okio.InflaterSource(new okio.internal.FixedLengthSource(bufferedSource2, zipEntry.getCompressedSize(), true), new java.util.zip.Inflater(true)), zipEntry.getSize(), false);
        }
        throw th;
    }
}
