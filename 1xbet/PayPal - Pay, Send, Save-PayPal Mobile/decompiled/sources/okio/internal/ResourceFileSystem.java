package okio.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\"J\u001f\u0010%\u001a\u00020$2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020$2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010&J\u001f\u0010+\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R'\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t010\u000e8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.DIRECT, "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "atomicMove", "(Lokio/Path;Lokio/Path;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "createSymlink", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ClassLoader;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lokio/FileSystem;", "Lkotlin/Pair;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "Companion_"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResourceFileSystem extends okio.FileSystem {
    private static final okio.internal.ResourceFileSystem.Companion_ Companion_ = new okio.internal.ResourceFileSystem.Companion_(null);
    private static final okio.Path getHighSpeedVideoSizes = okio.Path.Companion.get$default(okio.Path.INSTANCE, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 1, (java.lang.Object) null);
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.ClassLoader getHighSpeedVideoSizes;
    private final okio.FileSystem getHighSpeedVideoFpsRangesFor;

    public ResourceFileSystem(java.lang.ClassLoader classLoader, boolean z, okio.FileSystem fileSystem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSystem, "");
        this.getHighSpeedVideoSizes = classLoader;
        this.getHighSpeedVideoFpsRangesFor = fileSystem;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: okio.internal.ResourceFileSystem$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return okio.internal.ResourceFileSystem.$r8$lambda$facOLvgH430tWEbMJ6M5fXJ61zo(okio.internal.ResourceFileSystem.this);
            }
        });
        this.Camera2StreamConfigurationMap = lazy;
        if (z) {
            ((java.util.List) lazy.getValue()).size();
        }
    }

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader classLoader, boolean z, okio.FileSystem fileSystem, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i & 4) != 0 ? okio.FileSystem.SYSTEM : fileSystem);
    }

    @Override // okio.FileSystem
    public final okio.FileHandle openReadOnly(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (!okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges(file)) {
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(file)));
        }
        okio.Path path = getHighSpeedVideoSizes;
        java.lang.String obj = path.resolve(file, true).relativeTo(path).toString();
        for (kotlin.Pair pair : (java.util.List) this.Camera2StreamConfigurationMap.getValue()) {
            try {
                return ((okio.FileSystem) pair.component1()).openReadOnly(((okio.Path) pair.component2()).resolve(obj));
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(file)));
    }

    @Override // okio.FileSystem
    public final okio.FileHandle openReadWrite(okio.Path file, boolean mustCreate, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        throw new java.io.IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public final okio.FileMetadata metadataOrNull(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        if (!okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges(path)) {
            return null;
        }
        okio.Path path2 = getHighSpeedVideoSizes;
        java.lang.String obj = path2.resolve(path, true).relativeTo(path2).toString();
        for (kotlin.Pair pair : (java.util.List) this.Camera2StreamConfigurationMap.getValue()) {
            okio.FileMetadata metadataOrNull = ((okio.FileSystem) pair.component1()).metadataOrNull(((okio.Path) pair.component2()).resolve(obj));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public final okio.Source source(okio.Path file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (!okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges(file)) {
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(file)));
        }
        okio.Path path = getHighSpeedVideoSizes;
        java.net.URL resource = this.getHighSpeedVideoSizes.getResource(okio.Path.resolve$default(path, file, false, 2, (java.lang.Object) null).relativeTo(path).toString());
        if (resource == null) {
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(file)));
        }
        java.net.URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof java.net.JarURLConnection) {
            ((java.net.JarURLConnection) openConnection).setUseCaches(false);
        }
        java.io.InputStream inputStream = openConnection.getInputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "");
        return okio.Okio.source(inputStream);
    }

    @Override // okio.FileSystem
    public final okio.Sink sink(okio.Path file, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @Override // okio.FileSystem
    public final okio.Sink appendingSink(okio.Path file, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @Override // okio.FileSystem
    public final void createDirectory(okio.Path dir, boolean mustCreate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @Override // okio.FileSystem
    public final void atomicMove(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @Override // okio.FileSystem
    public final void delete(okio.Path path, boolean mustExist) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @Override // okio.FileSystem
    public final void createSymlink(okio.Path source, okio.Path target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this);
        sb.append(" is read-only");
        throw new java.io.IOException(sb.toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\b"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion_;", "", "<init>", "()V", "Lokio/Path;", "p0", "getHighSpeedVideoSizes", "(Lokio/Path;Lokio/Path;)Lokio/Path;", "Lokio/Path;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public static okio.Path getHighSpeedVideoSizes(okio.Path path, okio.Path path2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
            return okio.internal.ResourceFileSystem.getHighSpeedVideoSizes.resolve(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.removePrefix(path.toString(), (java.lang.CharSequence) path2.toString()), '\\', kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        }

        public static final /* synthetic */ boolean getHighSpeedVideoFpsRanges(okio.Path path) {
            return !kotlin.text.StringsKt.endsWith(path.name(), ".class", true);
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ boolean $r8$lambda$JLwKVsMM0AyplhHMXqN1dQMlhHM(okio.internal.ZipEntry zipEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zipEntry, "");
        return okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges(zipEntry.getCanonicalPath());
    }

    public static /* synthetic */ java.util.List $r8$lambda$facOLvgH430tWEbMJ6M5fXJ61zo(okio.internal.ResourceFileSystem resourceFileSystem) {
        int lastIndexOf$default;
        kotlin.Pair pair;
        java.lang.ClassLoader classLoader = resourceFileSystem.getHighSpeedVideoSizes;
        java.util.Enumeration<java.net.URL> resources = classLoader.getResources("");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        java.util.ArrayList list = java.util.Collections.list(resources);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.net.URL url = (java.net.URL) it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNull(url);
            kotlin.Pair pair2 = kotlin.jvm.internal.Intrinsics.areEqual(url.getProtocol(), "file") ? kotlin.TuplesKt.to(resourceFileSystem.getHighSpeedVideoFpsRangesFor, okio.Path.Companion.get$default(okio.Path.INSTANCE, new java.io.File(url.toURI()), false, 1, (java.lang.Object) null)) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Enumeration<java.net.URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources2, "");
        java.util.ArrayList<java.net.URL> list2 = java.util.Collections.list(resources2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.net.URL url2 : list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(url2);
            java.lang.String obj = url2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            if (kotlin.text.StringsKt.startsWith$default(obj, "jar:file:", false, 2, (java.lang.Object) null) && (lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) obj, "!", 0, false, 6, (java.lang.Object) null)) != -1) {
                okio.Path.Companion companion = okio.Path.INSTANCE;
                java.lang.String substring = obj.substring(4, lastIndexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                pair = kotlin.TuplesKt.to(okio.internal.ZipFilesKt.openZip(okio.Path.Companion.get$default(companion, new java.io.File(java.net.URI.create(substring)), false, 1, (java.lang.Object) null), resourceFileSystem.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function1() { // from class: okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(okio.internal.ResourceFileSystem.$r8$lambda$JLwKVsMM0AyplhHMXqN1dQMlhHM((okio.internal.ZipEntry) obj2));
                    }
                }), getHighSpeedVideoSizes);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList3.add(pair);
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList3);
    }

    @Override // okio.FileSystem
    public final okio.Path canonicalize(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return getHighSpeedVideoSizes.resolve(path, true);
    }

    @Override // okio.FileSystem
    public final java.util.List<okio.Path> list(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        okio.Path path = getHighSpeedVideoSizes;
        java.lang.String obj = path.resolve(dir, true).relativeTo(path).toString();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        boolean z = false;
        for (kotlin.Pair pair : (java.util.List) this.Camera2StreamConfigurationMap.getValue()) {
            okio.FileSystem fileSystem = (okio.FileSystem) pair.component1();
            okio.Path path2 = (okio.Path) pair.component2();
            try {
                java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
                java.util.List<okio.Path> list = fileSystem.list(path2.resolve(obj));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges((okio.Path) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoSizes((okio.Path) it.next(), path2));
                }
                kotlin.collections.CollectionsKt.addAll(linkedHashSet2, arrayList3);
                z = true;
            } catch (java.io.IOException unused) {
            }
        }
        if (!z) {
            throw new java.io.FileNotFoundException("file not found: ".concat(java.lang.String.valueOf(dir)));
        }
        return kotlin.collections.CollectionsKt.toList(linkedHashSet);
    }

    @Override // okio.FileSystem
    public final java.util.List<okio.Path> listOrNull(okio.Path dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "");
        okio.Path path = getHighSpeedVideoSizes;
        java.lang.String obj = path.resolve(dir, true).relativeTo(path).toString();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = ((java.util.List) this.Camera2StreamConfigurationMap.getValue()).iterator();
        boolean z = false;
        while (true) {
            java.util.ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Pair pair = (kotlin.Pair) it.next();
            okio.FileSystem fileSystem = (okio.FileSystem) pair.component1();
            okio.Path path2 = (okio.Path) pair.component2();
            java.util.List<okio.Path> listOrNull = fileSystem.listOrNull(path2.resolve(obj));
            if (listOrNull != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listOrNull) {
                    if (okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoFpsRanges((okio.Path) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                java.util.Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(okio.internal.ResourceFileSystem.Companion_.getHighSpeedVideoSizes((okio.Path) it2.next(), path2));
                }
                arrayList = arrayList4;
            }
            if (arrayList != null) {
                kotlin.collections.CollectionsKt.addAll(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return kotlin.collections.CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }
}
