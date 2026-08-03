package kotlin.collections;

/* compiled from: Arrays.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\u00060\u0003¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\n*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u000b\u001aH\u0010\f\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\u0002H\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001fH\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"flatten", "", "T", "", "([[Ljava/lang/Object;)Ljava/util/List;", "unzip", "Lkotlin/Pair;", "R", "([Lkotlin/Pair;)Lkotlin/Pair;", "isNullOrEmpty", "", "([Ljava/lang/Object;)Z", "ifEmpty", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contentDeepEqualsImpl", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes6.dex */
class ArraysKt__ArraysKt extends kotlin.collections.ArraysKt__ArraysJVMKt {
    public static final <T> java.util.List<T> flatten(T[][] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[][] tArr2 = tArr;
        int i = 0;
        for (T[] tArr3 : tArr2) {
            i += tArr3.length;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        int length = tArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            kotlin.collections.CollectionsKt.addAll(arrayList, tArr[i2]);
        }
        return arrayList;
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(pairArr.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(pairArr.length);
        for (kotlin.Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }

    private static final boolean isNullOrEmpty(java.lang.Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.lang.Object[] objArr, kotlin.jvm.functions.Function0 defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            java.lang.Object[] objArr = tArr[i];
            java.lang.Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof java.lang.Object[]) && (objArr2 instanceof java.lang.Object[])) {
                    if (!kotlin.collections.ArraysKt.contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!java.util.Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!java.util.Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!java.util.Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!java.util.Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!java.util.Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!java.util.Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!java.util.Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!java.util.Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UByteArray) && (objArr2 instanceof kotlin.UByteArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m11376contentEqualskV0jMPg(((kotlin.UByteArray) objArr).getStorage(), ((kotlin.UByteArray) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UShortArray) && (objArr2 instanceof kotlin.UShortArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m11374contentEqualsFGO6Aew(((kotlin.UShortArray) objArr).getStorage(), ((kotlin.UShortArray) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UIntArray) && (objArr2 instanceof kotlin.UIntArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m11375contentEqualsKJPZfPQ(((kotlin.UIntArray) objArr).getStorage(), ((kotlin.UIntArray) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.ULongArray) && (objArr2 instanceof kotlin.ULongArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m11377contentEqualslec5QzE(((kotlin.ULongArray) objArr).getStorage(), ((kotlin.ULongArray) objArr2).getStorage())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final <T> java.lang.String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((kotlin.ranges.RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new java.util.ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, java.lang.StringBuilder sb, java.util.List<java.lang.Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            java.lang.Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
            } else if (objArr instanceof java.lang.Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                java.lang.String arrays = java.util.Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                java.lang.String arrays2 = java.util.Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays2, "toString(...)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                java.lang.String arrays3 = java.util.Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays3, "toString(...)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                java.lang.String arrays4 = java.util.Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays4, "toString(...)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                java.lang.String arrays5 = java.util.Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays5, "toString(...)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                java.lang.String arrays6 = java.util.Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays6, "toString(...)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                java.lang.String arrays7 = java.util.Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays7, "toString(...)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                java.lang.String arrays8 = java.util.Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays8, "toString(...)");
                sb.append(arrays8);
            } else if (objArr instanceof kotlin.UByteArray) {
                kotlin.UByteArray uByteArray = (kotlin.UByteArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m11382contentToString2csIQuQ(uByteArray != null ? uByteArray.getStorage() : null));
            } else if (objArr instanceof kotlin.UShortArray) {
                kotlin.UShortArray uShortArray = (kotlin.UShortArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m11384contentToStringd6D3K8(uShortArray != null ? uShortArray.getStorage() : null));
            } else if (objArr instanceof kotlin.UIntArray) {
                kotlin.UIntArray uIntArray = (kotlin.UIntArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m11383contentToStringXUkPCBk(uIntArray != null ? uIntArray.getStorage() : null));
            } else if (objArr instanceof kotlin.ULongArray) {
                kotlin.ULongArray uLongArray = (kotlin.ULongArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m11385contentToStringuLth9ew(uLongArray != null ? uLongArray.getStorage() : null));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }
}
