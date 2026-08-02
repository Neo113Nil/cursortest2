package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0015\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"'\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00158CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"'\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u00158CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "extension", "Lio/ktor/http/ContentType;", "defaultForFileExtension", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Lio/ktor/http/ContentType;", "path", "defaultForFilePath", "", "fromFilePath", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Ljava/util/List;", "ext", "fromFileExtension", "fileExtensions", "(Lio/ktor/http/ContentType;)Ljava/util/List;", "selectDefault", "(Ljava/util/List;)Lio/ktor/http/ContentType;", "A", "B", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "", "groupByPairs", "(Lkotlin/sequences/Sequence;)Ljava/util/Map;", "toContentType", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileContentTypeKt {
    private static final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return io.ktor.http.FileContentTypeKt.$r8$lambda$zr0_L1P1Fu2TscCb4h0thiGP0MU();
        }
    });
    private static final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.Map groupByPairs;
            groupByPairs = io.ktor.http.FileContentTypeKt.groupByPairs(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(io.ktor.http.MimesKt.getMimes()), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.FileContentTypeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return io.ktor.http.FileContentTypeKt.$r8$lambda$XdP2LHtbXyaVnn1gA7aZ6cIPrkM((kotlin.Pair) obj);
                }
            }));
            return groupByPairs;
        }
    });

    public static final io.ktor.http.ContentType defaultForFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return selectDefault(fromFileExtension(io.ktor.http.ContentType.INSTANCE, str));
    }

    public static final io.ktor.http.ContentType defaultForFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return selectDefault(fromFilePath(io.ktor.http.ContentType.INSTANCE, str));
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.StringsKt.lastIndexOfAny$default((java.lang.CharSequence) str2, io.ktor.util.CharsetKt.toCharArray("/\\"), 0, false, 6, (java.lang.Object) null) + 1, false, 4, (java.lang.Object) null);
        if (indexOf$default == -1) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.String substring = str.substring(indexOf$default + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return fromFileExtension(companion, substring);
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        for (java.lang.String lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(kotlin.text.StringsKt.removePrefix(str, (java.lang.CharSequence) ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = kotlin.text.StringsKt.substringAfter(lowerCasePreservingASCIIRules, ".", "")) {
            java.util.List<io.ktor.http.ContentType> list = (java.util.List) ((java.util.Map) getHighSpeedVideoSizes.getValue()).get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final io.ktor.http.ContentType selectDefault(java.util.List<io.ktor.http.ContentType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        io.ktor.http.ContentType contentType = (io.ktor.http.ContentType) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (contentType == null) {
            contentType = io.ktor.http.ContentType.Application.INSTANCE.getOctetStream();
        }
        return contentType.match(io.ktor.http.ContentType.Text.INSTANCE.getAny()) ? io.ktor.http.ContentTypesKt.charset(contentType) != null ? contentType : io.ktor.http.ContentTypesKt.withCharset(contentType, kotlin.text.Charsets.UTF_8) : contentType.match(io.ktor.http.ContentType.Image.INSTANCE.getSVG()) ? io.ktor.http.ContentTypesKt.charset(contentType) != null ? contentType : io.ktor.http.ContentTypesKt.withCharset(contentType, kotlin.text.Charsets.UTF_8) : !contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getAny()) ? contentType : ((contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getAtom()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getJavaScript()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getRss()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getXml()) || contentType.match(io.ktor.http.ContentType.Application.INSTANCE.getXml_Dtd())) && io.ktor.http.ContentTypesKt.charset(contentType) == null) ? io.ktor.http.ContentTypesKt.withCharset(contentType, kotlin.text.Charsets.UTF_8) : contentType;
    }

    public static final io.ktor.http.ContentType toContentType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        } catch (java.lang.Throwable th) {
            throw new java.lang.IllegalArgumentException("Failed to parse ".concat(java.lang.String.valueOf(str)), th);
        }
    }

    public static final <A, B> java.util.Map<A, java.util.List<B>> groupByPairs(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends A, ? extends B>> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
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

    public static /* synthetic */ kotlin.Pair $r8$lambda$XdP2LHtbXyaVnn1gA7aZ6cIPrkM(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return kotlin.TuplesKt.to((io.ktor.http.ContentType) pair.component2(), (java.lang.String) pair.component1());
    }

    public static /* synthetic */ java.util.Map $r8$lambda$zr0_L1P1Fu2TscCb4h0thiGP0MU() {
        java.util.Map caseInsensitiveMap = io.ktor.util.CollectionsKt.caseInsensitiveMap();
        caseInsensitiveMap.putAll(groupByPairs(kotlin.collections.CollectionsKt.asSequence(io.ktor.http.MimesKt.getMimes())));
        return caseInsensitiveMap;
    }

    public static final java.util.List<java.lang.String> fileExtensions(io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.Lazy lazy = getHighSpeedVideoFpsRangesFor;
        java.util.List<java.lang.String> list = (java.util.List) ((java.util.Map) lazy.getValue()).get(contentType);
        if (list != null) {
            return list;
        }
        java.util.List<java.lang.String> list2 = (java.util.List) ((java.util.Map) lazy.getValue()).get(contentType.withoutParameters());
        return list2 == null ? kotlin.collections.CollectionsKt.emptyList() : list2;
    }
}
