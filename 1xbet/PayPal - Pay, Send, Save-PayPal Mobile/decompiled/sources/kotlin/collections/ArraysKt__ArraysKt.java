package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aI\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0005*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"T", "", "", "flatten", "([[Ljava/lang/Object;)Ljava/util/List;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Pair;", "unzip", "([Lkotlin/Pair;)Lkotlin/Pair;", "other", "", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "p0", "", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes3.dex */
public class ArraysKt__ArraysKt extends kotlin.collections.ArraysKt__ArraysJVMKt {
    public static final <T> java.util.List<T> flatten(T[][] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        T[][] tArr2 = tArr;
        long j = 0;
        for (T[] tArr3 : tArr2) {
            j += tArr3.length;
        }
        if (j == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Sum of all arrays lengths (");
            sb.append(j);
            sb.append(") exceeds maximum list size (2147483647)");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.lang.Object[] objArr = new java.lang.Object[(int) j];
        int length = tArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            T[] tArr4 = tArr[i2];
            kotlin.collections.ArraysKt.copyInto$default(tArr4, objArr, i, 0, 0, 12, (java.lang.Object) null);
            i += tArr4.length;
        }
        java.util.List<T> asList = kotlin.collections.ArraysKt.asList(objArr);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asList, "");
        return asList;
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(pairArr.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(pairArr.length);
        for (kotlin.Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
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
                if (objArr != 0 && objArr2 != 0) {
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
                        if (!kotlin.collections.unsigned.UArraysKt.m23615contentEqualskV0jMPg(((kotlin.UByteArray) objArr).getGetHighSpeedVideoFpsRanges(), ((kotlin.UByteArray) objArr2).getGetHighSpeedVideoFpsRanges())) {
                            return false;
                        }
                    } else if ((objArr instanceof kotlin.UShortArray) && (objArr2 instanceof kotlin.UShortArray)) {
                        if (!kotlin.collections.unsigned.UArraysKt.m23613contentEqualsFGO6Aew(((kotlin.UShortArray) objArr).getGetHighSpeedVideoFpsRanges(), ((kotlin.UShortArray) objArr2).getGetHighSpeedVideoFpsRanges())) {
                            return false;
                        }
                    } else if ((objArr instanceof kotlin.UIntArray) && (objArr2 instanceof kotlin.UIntArray)) {
                        if (!kotlin.collections.unsigned.UArraysKt.m23614contentEqualsKJPZfPQ(((kotlin.UIntArray) objArr).getGetHighSpeedVideoFpsRanges(), ((kotlin.UIntArray) objArr2).getGetHighSpeedVideoFpsRanges())) {
                            return false;
                        }
                    } else if ((objArr instanceof kotlin.ULongArray) && (objArr2 instanceof kotlin.ULongArray)) {
                        if (!kotlin.collections.unsigned.UArraysKt.m23616contentEqualslec5QzE(((kotlin.ULongArray) objArr).getGetHighSpeedVideoFpsRanges(), ((kotlin.ULongArray) objArr2).getGetHighSpeedVideoFpsRanges())) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(objArr, objArr2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final <T> java.lang.String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((kotlin.ranges.RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        getHighResolutionOutputSizeshNQ4ISI(tArr, sb, new java.util.ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void getHighResolutionOutputSizeshNQ4ISI(T[] tArr, java.lang.StringBuilder sb, java.util.List<java.lang.Object[]> list) {
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
                sb.append("null");
            } else if (objArr instanceof java.lang.Object[]) {
                getHighResolutionOutputSizeshNQ4ISI(objArr, sb, list);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                java.lang.String arrays = java.util.Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                java.lang.String arrays2 = java.util.Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays2, "");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                java.lang.String arrays3 = java.util.Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays3, "");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                java.lang.String arrays4 = java.util.Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays4, "");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                java.lang.String arrays5 = java.util.Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays5, "");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                java.lang.String arrays6 = java.util.Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays6, "");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                java.lang.String arrays7 = java.util.Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays7, "");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                java.lang.String arrays8 = java.util.Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays8, "");
                sb.append(arrays8);
            } else if (objArr instanceof kotlin.UByteArray) {
                kotlin.UByteArray uByteArray = (kotlin.UByteArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m23621contentToString2csIQuQ(uByteArray != null ? uByteArray.getGetHighSpeedVideoFpsRanges() : null));
            } else if (objArr instanceof kotlin.UShortArray) {
                kotlin.UShortArray uShortArray = (kotlin.UShortArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m23623contentToStringd6D3K8(uShortArray != null ? uShortArray.getGetHighSpeedVideoFpsRanges() : null));
            } else if (objArr instanceof kotlin.UIntArray) {
                kotlin.UIntArray uIntArray = (kotlin.UIntArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m23622contentToStringXUkPCBk(uIntArray != null ? uIntArray.getGetHighSpeedVideoFpsRanges() : null));
            } else if (objArr instanceof kotlin.ULongArray) {
                kotlin.ULongArray uLongArray = (kotlin.ULongArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m23624contentToStringuLth9ew(uLongArray != null ? uLongArray.getGetHighSpeedVideoFpsRanges() : null));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }
}
