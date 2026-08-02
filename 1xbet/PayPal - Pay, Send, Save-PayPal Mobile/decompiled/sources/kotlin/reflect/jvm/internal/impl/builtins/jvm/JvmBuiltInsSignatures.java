package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JvmBuiltInsSignatures {
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures();
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.plus(kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizesFor;
    private static final java.util.Set<java.lang.String> getInputSizeshNQ4ISI;

    private JvmBuiltInsSignatures() {
    }

    public final java.util.Set<java.lang.String> getDROP_LIST_METHOD_SIGNATURES() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents2 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[]{kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR});
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : listOf) {
            java.lang.String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(jvmPrimitiveType.getJavaKeywordName());
            sb.append("Value()");
            sb.append(jvmPrimitiveType.getDesc());
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, signatureBuildingComponents2.inJavaLang(asString, sb.toString()));
        }
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) linkedHashSet, (java.lang.Iterable) signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), (java.lang.Iterable) signatureBuildingComponents.inJavaLang("CharSequence", "isEmpty()Z"));
        Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE.inJavaUtil("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents3 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        getHighSpeedVideoSizesFor = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) signatureBuildingComponents3.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (java.lang.Iterable) signatureBuildingComponents3.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (java.lang.Iterable) signatureBuildingComponents3.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (java.lang.Iterable) signatureBuildingComponents3.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents4 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.plus((java.util.Set) signatureBuildingComponents4.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (java.lang.Iterable) signatureBuildingComponents4.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), (java.lang.Iterable) signatureBuildingComponents4.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents5 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents6 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[]{kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT});
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.Iterator it = listOf2.iterator();
        while (it.hasNext()) {
            java.lang.String asString2 = ((kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType) it.next()).getWrapperFqName().shortName().asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
            java.lang.String[] constructors = signatureBuildingComponents6.constructors("Ljava/lang/String;");
            kotlin.collections.CollectionsKt.addAll(linkedHashSet2, signatureBuildingComponents6.inJavaLang(asString2, (java.lang.String[]) java.util.Arrays.copyOf(constructors, constructors.length)));
        }
        java.lang.String[] constructors2 = signatureBuildingComponents5.constructors("D");
        java.util.Set plus = kotlin.collections.SetsKt.plus((java.util.Set) linkedHashSet2, (java.lang.Iterable) signatureBuildingComponents5.inJavaLang("Float", (java.lang.String[]) java.util.Arrays.copyOf(constructors2, constructors2.length)));
        java.lang.String[] constructors3 = signatureBuildingComponents5.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.plus(plus, (java.lang.Iterable) signatureBuildingComponents5.inJavaLang("String", (java.lang.String[]) java.util.Arrays.copyOf(constructors3, constructors3.length)));
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents7 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        java.lang.String[] constructors4 = signatureBuildingComponents7.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        getInputSizeshNQ4ISI = signatureBuildingComponents7.inJavaLang("Throwable", (java.lang.String[]) java.util.Arrays.copyOf(constructors4, constructors4.length));
    }

    public final java.util.Set<java.lang.String> getHIDDEN_METHOD_SIGNATURES() {
        return getHighSpeedVideoSizes;
    }

    public final java.util.Set<java.lang.String> getDEPRECATED_LIST_METHODS() {
        return Camera2StreamConfigurationMap;
    }

    public final java.util.Set<java.lang.String> getVISIBLE_METHOD_SIGNATURES() {
        return getHighSpeedVideoSizesFor;
    }

    public final java.util.Set<java.lang.String> getMUTABLE_METHOD_SIGNATURES() {
        return getHighSpeedVideoFpsRanges;
    }

    public final java.util.Set<java.lang.String> getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.Set<java.lang.String> getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return getInputSizeshNQ4ISI;
    }

    public final boolean isSerializableInJava(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        if (isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe);
        if (mapKotlinToJava == null) {
            return false;
        }
        try {
            return java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(mapKotlinToJava.asSingleFqName().asString()));
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public final boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fqNameUnsafe, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.array) || kotlin.reflect.jvm.internal.impl.builtins.StandardNames.isPrimitiveArray(fqNameUnsafe);
    }
}
