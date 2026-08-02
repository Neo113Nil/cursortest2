package okio;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001:B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\nJ\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eJ\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0013\u0010)\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020*8G¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u00100\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b2\u00101R\u0013\u00104\u001a\u0004\u0018\u0001038G¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b6\u0010'R\u0011\u00107\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0013\u00108\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b8\u0010\u0014R\u0011\u00109\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b9\u00101"}, d2 = {"Lokio/Path;", "", "Lokio/ByteString;", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "<init>", "(Lokio/ByteString;)V", "", "child", "resolve", "(Ljava/lang/String;)Lokio/Path;", "(Lokio/ByteString;)Lokio/Path;", "(Lokio/Path;)Lokio/Path;", "", "normalize", "(Ljava/lang/String;Z)Lokio/Path;", "(Lokio/ByteString;Z)Lokio/Path;", "(Lokio/Path;Z)Lokio/Path;", "other", "relativeTo", "normalized", "()Lokio/Path;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "toNioPath", "()Ljava/nio/file/Path;", "", "compareTo", "(Lokio/Path;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lokio/ByteString;", "getBytes$okio", "()Lokio/ByteString;", "getRoot", "root", "", "getSegments", "()Ljava/util/List;", "segments", "getSegmentsBytes", "segmentsBytes", "isAbsolute", "()Z", "isRelative", "", "volumeLetter", "()Ljava/lang/Character;", "nameBytes", "name", "parent", "isRoot", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Path implements java.lang.Comparable<okio.Path> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Path.Companion INSTANCE = new okio.Path.Companion(null);
    public static final java.lang.String DIRECTORY_SEPARATOR;
    private final okio.ByteString bytes;

    public Path(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        this.bytes = byteString;
    }

    /* renamed from: getBytes$okio, reason: from getter */
    public final okio.ByteString getBytes() {
        return this.bytes;
    }

    public final okio.Path resolve(okio.Path child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, child, false);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(str, z);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, okio.ByteString byteString, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(byteString, z);
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path path, okio.Path path2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(path2, z);
    }

    public final okio.Path resolve(okio.Path child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, child, normalize);
    }

    public final java.io.File toFile() {
        return new java.io.File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = java.nio.file.Paths.get(toString(), new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
        return path;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u0007*\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokio/Path$Companion;", "", "<init>", "()V", "", "", "normalize", "Lokio/Path;", "get", "(Ljava/lang/String;Z)Lokio/Path;", "Ljava/io/File;", "(Ljava/io/File;Z)Lokio/Path;", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Z)Lokio/Path;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(str, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return okio.internal.Path.commonToPath(str, z);
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.io.File file, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(file, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File file, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            java.lang.String obj = file.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return get(obj, z);
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion companion, java.nio.file.Path path, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(path, z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path path, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            return get(path.toString(), z);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            return get$default(this, path, false, 1, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return get$default(this, str, false, 1, (java.lang.Object) null);
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return get$default(this, file, false, 1, (java.lang.Object) null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.String str = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        DIRECTORY_SEPARATOR = str;
    }

    public final okio.Path getRoot() {
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            return null;
        }
        return new okio.Path(getBytes().substring(0, access$rootLength));
    }

    public final java.util.List<java.lang.String> getSegments() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes().size() && getBytes().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes().getByte(access$rootLength) == 47 || getBytes().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((okio.ByteString) it.next()).utf8());
        }
        return arrayList3;
    }

    public final java.util.List<okio.ByteString> getSegmentsBytes() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < getBytes().size() && getBytes().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = getBytes().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (getBytes().getByte(access$rootLength) == 47 || getBytes().getByte(access$rootLength) == 92) {
                arrayList.add(getBytes().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        return arrayList;
    }

    public final boolean isAbsolute() {
        return okio.internal.Path.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.Path.access$rootLength(this) == -1;
    }

    public final java.lang.Character volumeLetter() {
        if (okio.ByteString.indexOf$default(getBytes(), okio.internal.Path.Camera2StreamConfigurationMap, 0, 2, (java.lang.Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) getBytes().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(c);
    }

    public final okio.ByteString nameBytes() {
        int access$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        if (access$getIndexOfLastSlash != -1) {
            return okio.ByteString.substring$default(getBytes(), access$getIndexOfLastSlash + 1, 0, 2, null);
        }
        return (volumeLetter() == null || getBytes().size() != 2) ? getBytes() : okio.ByteString.EMPTY;
    }

    public final java.lang.String name() {
        return nameBytes().utf8();
    }

    public final okio.Path parent() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.getHighResolutionOutputSizeshNQ4ISI) || kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.Camera2StreamConfigurationMap) || kotlin.jvm.internal.Intrinsics.areEqual(getBytes(), okio.internal.Path.getHighSpeedVideoSizes) || okio.internal.Path.access$lastSegmentIsDotDot(this)) {
            return null;
        }
        int access$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        if (access$getIndexOfLastSlash != 2 || volumeLetter() == null) {
            if (access$getIndexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.getHighSpeedVideoSizes)) {
                return null;
            }
            if (access$getIndexOfLastSlash == -1 && volumeLetter() != null) {
                if (getBytes().size() == 2) {
                    return null;
                }
                return new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 2, 1, null));
            }
            if (access$getIndexOfLastSlash == -1) {
                return new okio.Path(okio.internal.Path.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (access$getIndexOfLastSlash == 0) {
                return new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 1, 1, null));
            }
            return new okio.Path(okio.ByteString.substring$default(getBytes(), 0, access$getIndexOfLastSlash, 1, null));
        }
        if (getBytes().size() == 3) {
            return null;
        }
        return new okio.Path(okio.ByteString.substring$default(getBytes(), 0, 3, 1, null));
    }

    public final boolean isRoot() {
        return okio.internal.Path.access$rootLength(this) == getBytes().size();
    }

    public final okio.Path resolve(java.lang.String child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().writeUtf8(child), false), false);
    }

    public final okio.Path resolve(okio.ByteString child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().write(child), false), false);
    }

    public final okio.Path resolve(java.lang.String child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().writeUtf8(child), false), normalize);
    }

    public final okio.Path resolve(okio.ByteString child, boolean normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new okio.Buffer().write(child), false), normalize);
    }

    public final okio.Path relativeTo(okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getRoot(), other.getRoot())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paths of different roots cannot be relative to each other: ");
            sb.append(this);
            sb.append(" and ");
            sb.append(other);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<okio.ByteString> segmentsBytes = getSegmentsBytes();
        java.util.List<okio.ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int min = java.lang.Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < min && kotlin.jvm.internal.Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i != min || getBytes().size() != other.getBytes().size()) {
            if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(okio.internal.Path.getHighSpeedVideoFpsRangesFor) == -1) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(other.getBytes(), okio.internal.Path.getHighResolutionOutputSizeshNQ4ISI)) {
                    return this;
                }
                okio.Buffer buffer = new okio.Buffer();
                okio.ByteString highSpeedVideoFpsRanges = okio.internal.Path.getHighSpeedVideoFpsRanges(other);
                if (highSpeedVideoFpsRanges == null && (highSpeedVideoFpsRanges = okio.internal.Path.getHighSpeedVideoFpsRanges(this)) == null) {
                    highSpeedVideoFpsRanges = okio.internal.Path.getHighSpeedVideoSizes(DIRECTORY_SEPARATOR);
                }
                int size = segmentsBytes2.size();
                for (int i2 = i; i2 < size; i2++) {
                    buffer.write(okio.internal.Path.getHighSpeedVideoFpsRangesFor);
                    buffer.write(highSpeedVideoFpsRanges);
                }
                int size2 = segmentsBytes.size();
                while (i < size2) {
                    buffer.write(segmentsBytes.get(i));
                    buffer.write(highSpeedVideoFpsRanges);
                    i++;
                }
                return okio.internal.Path.toPath(buffer, false);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Impossible relative path to resolve: ");
            sb2.append(this);
            sb2.append(" and ");
            sb2.append(other);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return okio.Path.Companion.get$default(INSTANCE, ".", false, 1, (java.lang.Object) null);
    }

    public final okio.Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    @Override // java.lang.Comparable
    public final int compareTo(okio.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return getBytes().compareTo(other.getBytes());
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof okio.Path) && kotlin.jvm.internal.Intrinsics.areEqual(((okio.Path) other).getBytes(), getBytes());
    }

    public final int hashCode() {
        return getBytes().hashCode();
    }

    public final java.lang.String toString() {
        return getBytes().utf8();
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path path, boolean z) {
        return INSTANCE.get(path, z);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String str, boolean z) {
        return INSTANCE.get(str, z);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File file, boolean z) {
        return INSTANCE.get(file, z);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File file) {
        return INSTANCE.get(file);
    }
}
