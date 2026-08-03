package io.ktor.http;

/* compiled from: FileContentType.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u001a\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"-\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"-\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, "Lio/ktor/http/ContentType;", "defaultForFileExtension", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Lio/ktor/http/ContentType;", "path", "defaultForFilePath", "", "fromFilePath", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Ljava/util/List;", "ext", "fromFileExtension", "fileExtensions", "(Lio/ktor/http/ContentType;)Ljava/util/List;", "selectDefault", "(Ljava/util/List;)Lio/ktor/http/ContentType;", "", "matchApplicationTypeWithCharset", "(Lio/ktor/http/ContentType;)Z", "withCharsetUTF8IfNeeded", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentType;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "", "groupByPairs", "(Lkotlin/sequences/Sequence;)Ljava/util/Map;", "toContentType", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "contentTypesByExtensions$delegate", "Lkotlin/Lazy;", "getContentTypesByExtensions", "()Ljava/util/Map;", "contentTypesByExtensions", "extensionsByContentType$delegate", "getExtensionsByContentType", "extensionsByContentType", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileContentTypeKt {
    private static final kotlin.Lazy contentTypesByExtensions$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.Map contentTypesByExtensions_delegate$lambda$1;
            contentTypesByExtensions_delegate$lambda$1 = io.ktor.http.FileContentTypeKt.contentTypesByExtensions_delegate$lambda$1();
            return contentTypesByExtensions_delegate$lambda$1;
        }
    });
    private static final kotlin.Lazy extensionsByContentType$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.Map extensionsByContentType_delegate$lambda$3;
            extensionsByContentType_delegate$lambda$3 = io.ktor.http.FileContentTypeKt.extensionsByContentType_delegate$lambda$3();
            return extensionsByContentType_delegate$lambda$3;
        }
    });

    public static final io.ktor.http.ContentType defaultForFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        return selectDefault(fromFileExtension(io.ktor.http.ContentType.INSTANCE, extension));
    }

    public static final io.ktor.http.ContentType defaultForFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return selectDefault(fromFilePath(io.ktor.http.ContentType.INSTANCE, path));
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.lang.String str = path;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '.', kotlin.text.StringsKt.lastIndexOfAny$default((java.lang.CharSequence) str, io.ktor.util.CharsetKt.toCharArray("/\\"), 0, false, 6, (java.lang.Object) null) + 1, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.String substring = path.substring(indexOf$default + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return fromFileExtension(companion, substring);
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String ext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        for (java.lang.String lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(kotlin.text.StringsKt.removePrefix(ext, (java.lang.CharSequence) ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = kotlin.text.StringsKt.substringAfter(lowerCasePreservingASCIIRules, ".", "")) {
            java.util.List<io.ktor.http.ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final java.util.List<java.lang.String> fileExtensions(io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "<this>");
        java.util.List<java.lang.String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        java.util.List<java.lang.String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? kotlin.collections.CollectionsKt.emptyList() : list2;
    }

    private static final java.util.Map<java.lang.String, java.util.List<io.ktor.http.ContentType>> getContentTypesByExtensions() {
        return (java.util.Map) contentTypesByExtensions$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map contentTypesByExtensions_delegate$lambda$1() {
        java.util.Map caseInsensitiveMap = io.ktor.util.CollectionsKt.caseInsensitiveMap();
        caseInsensitiveMap.putAll(groupByPairs(kotlin.collections.CollectionsKt.asSequence(io.ktor.http.MimesKt.getMimes())));
        return caseInsensitiveMap;
    }

    private static final java.util.Map<io.ktor.http.ContentType, java.util.List<java.lang.String>> getExtensionsByContentType() {
        return (java.util.Map) extensionsByContentType$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map extensionsByContentType_delegate$lambda$3() {
        return groupByPairs(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(io.ktor.http.MimesKt.getMimes()), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Pair extensionsByContentType_delegate$lambda$3$lambda$2;
                extensionsByContentType_delegate$lambda$3$lambda$2 = io.ktor.http.FileContentTypeKt.extensionsByContentType_delegate$lambda$3$lambda$2((kotlin.Pair) obj);
                return extensionsByContentType_delegate$lambda$3$lambda$2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair extensionsByContentType_delegate$lambda$3$lambda$2(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return kotlin.TuplesKt.to((io.ktor.http.ContentType) pair.component2(), (java.lang.String) pair.component1());
    }

    public static final io.ktor.http.ContentType selectDefault(java.util.List<io.ktor.http.ContentType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        io.ktor.http.ContentType contentType = (io.ktor.http.ContentType) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (contentType == null) {
            contentType = io.ktor.http.ContentType.Application.INSTANCE.getOctetStream();
        }
        return (contentType.match(io.ktor.http.ContentType.Text.INSTANCE.getAny()) || contentType.match(io.ktor.http.ContentType.Image.INSTANCE.getSVG()) || matchApplicationTypeWithCharset(contentType)) ? withCharsetUTF8IfNeeded(contentType) : contentType;
    }

    private static final boolean matchApplicationTypeWithCharset(io.ktor.http.ContentType contentType) {
        if (contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getAny())) {
            return contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getAtom()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getJavaScript()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getRss()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getXml()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getXml_Dtd());
        }
        return false;
    }

    private static final io.ktor.http.ContentType withCharsetUTF8IfNeeded(io.ktor.http.ContentType contentType) {
        return io.ktor.http.ContentTypesKt.charset(contentType) != null ? contentType : io.ktor.http.ContentTypesKt.withCharset(contentType, kotlin.text.Charsets.UTF_8);
    }

    public static final io.ktor.http.ContentType toContentType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        } catch (java.lang.Throwable th) {
            throw new java.lang.IllegalArgumentException("Failed to parse " + str, th);
        }
    }

    public static final <A, B> java.util.Map<A, java.util.List<B>> groupByPairs(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends A, ? extends B>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (kotlin.Pair<? extends A, ? extends B> pair : sequence) {
            A first = pair.getFirst();
            java.lang.Object obj = linkedHashMap.get(first);
            if (obj == null) {
                obj = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(first, obj);
            }
            ((java.util.List) obj).add(pair);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
