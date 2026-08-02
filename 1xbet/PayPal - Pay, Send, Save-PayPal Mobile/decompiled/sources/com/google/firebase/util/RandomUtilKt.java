package com.google.firebase.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/random/Random;", "", "length", "", "nextAlphanumericString", "(Lkotlin/random/Random;I)Ljava/lang/String;", "ALPHANUMERIC_ALPHABET", "Ljava/lang/String;", "getALPHANUMERIC_ALPHABET$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RandomUtilKt {
    private static final java.lang.String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final java.lang.String nextAlphanumericString(kotlin.random.Random random, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("invalid length: ".concat(java.lang.String.valueOf(i)).toString());
        }
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            ((kotlin.collections.IntIterator) it).nextInt();
            arrayList.add(java.lang.Character.valueOf(kotlin.text.StringsKt.random(ALPHANUMERIC_ALPHABET, random)));
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
