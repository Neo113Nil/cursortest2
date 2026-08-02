package com.figma.code.connect;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/figma/code/connect/Figma;", "", "<init>", "()V", "K", "V", "", "Lkotlin/Pair;", "pairs", "mapping", "([Lkotlin/Pair;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Figma {
    public static final com.figma.code.connect.Figma INSTANCE = new com.figma.code.connect.Figma();

    private Figma() {
    }

    public final <K, V> V mapping(kotlin.Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        return (V) ((kotlin.Pair) kotlin.collections.ArraysKt.first(pairs)).getSecond();
    }
}
