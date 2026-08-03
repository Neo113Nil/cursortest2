package kotlin.collections.unsigned;

/* compiled from: _UArraysJvm.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u0000\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0000\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014*\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014*\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010&\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020[*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010^\u001a+\u0010Z\u001a\u00020[*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010_\u001a+\u0010Z\u001a\u00020[*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010`\u001a+\u0010Z\u001a\u00020a*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a+\u0010Z\u001a\u00020a*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010d\u001a+\u0010Z\u001a\u00020a*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010e\u001a+\u0010Z\u001a\u00020a*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"elementAt", "Lkotlin/UInt;", "Lkotlin/UIntArray;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "elementAt-qFRl0hI", "([II)I", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "elementAt-r7IrZao", "([JI)J", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "elementAt-PpDY95g", "([BI)B", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "elementAt-nggk6HY", "([SI)S", "asList", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "element", "fromIndex", "toIndex", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min--ajY-9A", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes6.dex */
class UArraysKt___UArraysJvmKt {
    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m11287elementAtqFRl0hI(int[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UIntArray.m10956getpVg5ArA(elementAt, i);
    }

    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m11288elementAtr7IrZao(long[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.ULongArray.m11035getsVKNKU(elementAt, i);
    }

    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m11285elementAtPpDY95g(byte[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UByteArray.m10877getw2LRezQ(elementAt, i);
    }

    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m11286elementAtnggk6HY(short[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UShortArray.m11140getMh2AYeg(elementAt, i);
    }

    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final java.util.List<kotlin.UInt> m11273asListajY9A(int[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final java.util.List<kotlin.ULong> m11275asListQwZRm1k(long[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final java.util.List<kotlin.UByte> m11274asListGBYM_sE(byte[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final java.util.List<kotlin.UShort> m11276asListrL5Bavg(short[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m11278binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = kotlin.UIntArray.m10957getSizeimpl(iArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m11277binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m11277binarySearch2fe2U9s(int[] binarySearch, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, kotlin.UIntArray.m10957getSizeimpl(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i);
            if (uintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m11282binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.ULongArray.m11036getSizeimpl(jArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m11281binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m11281binarySearchK6DWlUc(long[] binarySearch, long j, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.ULongArray.m11036getSizeimpl(binarySearch));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int ulongCompare = kotlin.UnsignedKt.ulongCompare(binarySearch[i4], j);
            if (ulongCompare < 0) {
                i = i4 + 1;
            } else {
                if (ulongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m11284binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.m10878getSizeimpl(bArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m11283binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m11283binarySearchWpHrYlw(byte[] binarySearch, byte b, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UByteArray.m10878getSizeimpl(binarySearch));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (uintCompare < 0) {
                i = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m11280binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UShortArray.m11141getSizeimpl(sArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m11279binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m11279binarySearchEtDCXyQ(short[] binarySearch, short s, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UShortArray.m11141getSizeimpl(binarySearch));
        int i3 = s & kotlin.UShort.MAX_VALUE;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (uintCompare < 0) {
                i = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m11289maxajY9A(int[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m11658maxOrNullajY9A(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m11291maxQwZRm1k(long[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m11660maxOrNullQwZRm1k(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m11290maxGBYM_sE(byte[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m11659maxOrNullGBYM_sE(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m11292maxrL5Bavg(short[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m11661maxOrNullrL5Bavg(max);
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m11295maxByjgv0xPQ(int[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.m10959isEmptyimpl(maxBy)) {
            return null;
        }
        int m10956getpVg5ArA = kotlin.UIntArray.m10956getpVg5ArA(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UInt.m10890boximpl(m10956getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int m10956getpVg5ArA2 = kotlin.UIntArray.m10956getpVg5ArA(maxBy, i);
                    R invoke2 = selector.invoke(kotlin.UInt.m10890boximpl(m10956getpVg5ArA2));
                    if (invoke.compareTo(invoke2) < 0) {
                        m10956getpVg5ArA = m10956getpVg5ArA2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UInt.m10890boximpl(m10956getpVg5ArA);
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m11294maxByMShoTSo(long[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.m11038isEmptyimpl(maxBy)) {
            return null;
        }
        long m11035getsVKNKU = kotlin.ULongArray.m11035getsVKNKU(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.ULong.m10969boximpl(m11035getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long m11035getsVKNKU2 = kotlin.ULongArray.m11035getsVKNKU(maxBy, i);
                    R invoke2 = selector.invoke(kotlin.ULong.m10969boximpl(m11035getsVKNKU2));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11035getsVKNKU = m11035getsVKNKU2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.ULong.m10969boximpl(m11035getsVKNKU);
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m11293maxByJOV_ifY(byte[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.m10880isEmptyimpl(maxBy)) {
            return null;
        }
        byte m10877getw2LRezQ = kotlin.UByteArray.m10877getw2LRezQ(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UByte.m10810boximpl(m10877getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte m10877getw2LRezQ2 = kotlin.UByteArray.m10877getw2LRezQ(maxBy, i);
                    R invoke2 = selector.invoke(kotlin.UByte.m10810boximpl(m10877getw2LRezQ2));
                    if (invoke.compareTo(invoke2) < 0) {
                        m10877getw2LRezQ = m10877getw2LRezQ2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UByte.m10810boximpl(m10877getw2LRezQ);
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m11296maxByxTcfx_M(short[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.m11143isEmptyimpl(maxBy)) {
            return null;
        }
        short m11140getMh2AYeg = kotlin.UShortArray.m11140getMh2AYeg(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UShort.m11076boximpl(m11140getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short m11140getMh2AYeg2 = kotlin.UShortArray.m11140getMh2AYeg(maxBy, i);
                    R invoke2 = selector.invoke(kotlin.UShort.m11076boximpl(m11140getMh2AYeg2));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11140getMh2AYeg = m11140getMh2AYeg2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UShort.m11076boximpl(m11140getMh2AYeg);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m11298maxWithYmdZ_VM(int[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11667maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m11300maxWithzrEWJaI(long[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11669maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m11297maxWithXMRcp5o(byte[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11666maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m11299maxWitheOHTfZs(short[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11668maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m11301minajY9A(int[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m11714minOrNullajY9A(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m11303minQwZRm1k(long[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m11716minOrNullQwZRm1k(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m11302minGBYM_sE(byte[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m11715minOrNullGBYM_sE(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m11304minrL5Bavg(short[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m11717minOrNullrL5Bavg(min);
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m11307minByjgv0xPQ(int[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.m10959isEmptyimpl(minBy)) {
            return null;
        }
        int m10956getpVg5ArA = kotlin.UIntArray.m10956getpVg5ArA(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UInt.m10890boximpl(m10956getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int m10956getpVg5ArA2 = kotlin.UIntArray.m10956getpVg5ArA(minBy, i);
                    R invoke2 = selector.invoke(kotlin.UInt.m10890boximpl(m10956getpVg5ArA2));
                    if (invoke.compareTo(invoke2) > 0) {
                        m10956getpVg5ArA = m10956getpVg5ArA2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UInt.m10890boximpl(m10956getpVg5ArA);
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m11306minByMShoTSo(long[] minBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.m11038isEmptyimpl(minBy)) {
            return null;
        }
        long m11035getsVKNKU = kotlin.ULongArray.m11035getsVKNKU(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.ULong.m10969boximpl(m11035getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long m11035getsVKNKU2 = kotlin.ULongArray.m11035getsVKNKU(minBy, i);
                    R invoke2 = selector.invoke(kotlin.ULong.m10969boximpl(m11035getsVKNKU2));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11035getsVKNKU = m11035getsVKNKU2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.ULong.m10969boximpl(m11035getsVKNKU);
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m11305minByJOV_ifY(byte[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.m10880isEmptyimpl(minBy)) {
            return null;
        }
        byte m10877getw2LRezQ = kotlin.UByteArray.m10877getw2LRezQ(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UByte.m10810boximpl(m10877getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte m10877getw2LRezQ2 = kotlin.UByteArray.m10877getw2LRezQ(minBy, i);
                    R invoke2 = selector.invoke(kotlin.UByte.m10810boximpl(m10877getw2LRezQ2));
                    if (invoke.compareTo(invoke2) > 0) {
                        m10877getw2LRezQ = m10877getw2LRezQ2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UByte.m10810boximpl(m10877getw2LRezQ);
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m11308minByxTcfx_M(short[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.m11143isEmptyimpl(minBy)) {
            return null;
        }
        short m11140getMh2AYeg = kotlin.UShortArray.m11140getMh2AYeg(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UShort.m11076boximpl(m11140getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short m11140getMh2AYeg2 = kotlin.UShortArray.m11140getMh2AYeg(minBy, i);
                    R invoke2 = selector.invoke(kotlin.UShort.m11076boximpl(m11140getMh2AYeg2));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11140getMh2AYeg = m11140getMh2AYeg2;
                        invoke = invoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.UShort.m11076boximpl(m11140getMh2AYeg);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m11310minWithYmdZ_VM(int[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11723minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m11312minWithzrEWJaI(long[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11725minWithOrNullzrEWJaI(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m11309minWithXMRcp5o(byte[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11722minWithOrNullXMRcp5o(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m11311minWitheOHTfZs(short[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m11724minWithOrNulleOHTfZs(minWith, comparator);
    }

    private static final java.math.BigDecimal sumOfBigDecimal(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m10957getSizeimpl = kotlin.UIntArray.m10957getSizeimpl(sumOf);
        for (int i = 0; i < m10957getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UInt.m10890boximpl(kotlin.UIntArray.m10956getpVg5ArA(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m11036getSizeimpl = kotlin.ULongArray.m11036getSizeimpl(sumOf);
        for (int i = 0; i < m11036getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.ULong.m10969boximpl(kotlin.ULongArray.m11035getsVKNKU(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m10878getSizeimpl = kotlin.UByteArray.m10878getSizeimpl(sumOf);
        for (int i = 0; i < m10878getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UByte.m10810boximpl(kotlin.UByteArray.m10877getw2LRezQ(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m11141getSizeimpl = kotlin.UShortArray.m11141getSizeimpl(sumOf);
        for (int i = 0; i < m11141getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UShort.m11076boximpl(kotlin.UShortArray.m11140getMh2AYeg(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m10957getSizeimpl = kotlin.UIntArray.m10957getSizeimpl(sumOf);
        for (int i = 0; i < m10957getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UInt.m10890boximpl(kotlin.UIntArray.m10956getpVg5ArA(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m11036getSizeimpl = kotlin.ULongArray.m11036getSizeimpl(sumOf);
        for (int i = 0; i < m11036getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.ULong.m10969boximpl(kotlin.ULongArray.m11035getsVKNKU(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m10878getSizeimpl = kotlin.UByteArray.m10878getSizeimpl(sumOf);
        for (int i = 0; i < m10878getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UByte.m10810boximpl(kotlin.UByteArray.m10877getw2LRezQ(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m11141getSizeimpl = kotlin.UShortArray.m11141getSizeimpl(sumOf);
        for (int i = 0; i < m11141getSizeimpl; i++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UShort.m11076boximpl(kotlin.UShortArray.m11140getMh2AYeg(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }
}
