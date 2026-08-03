package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Lm implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        kotlin.Pair pair = (kotlin.Pair) obj;
        java.lang.System.out.println((java.lang.Object) (((com.inmobi.media.Gl) pair.getFirst()).c + io.ktor.sse.ServerSentEventKt.SPACE + pair.getSecond()));
        java.lang.Double d = (java.lang.Double) pair.getSecond();
        kotlin.Pair pair2 = (kotlin.Pair) obj2;
        java.lang.System.out.println((java.lang.Object) (((com.inmobi.media.Gl) pair2.getFirst()).c + io.ktor.sse.ServerSentEventKt.SPACE + pair2.getSecond()));
        return kotlin.comparisons.ComparisonsKt.compareValues(d, (java.lang.Double) pair2.getSecond());
    }
}
