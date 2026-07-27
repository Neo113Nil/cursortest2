package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes6.dex */
public final class Ho implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        System.out.println((Object) (((Bn) pair.getFirst()).c + ServerSentEventKt.SPACE + pair.getSecond()));
        Double d = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        System.out.println((Object) (((Bn) pair2.getFirst()).c + ServerSentEventKt.SPACE + pair2.getSecond()));
        return ComparisonsKt.compareValues(d, (Double) pair2.getSecond());
    }
}
