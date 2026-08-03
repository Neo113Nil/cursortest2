package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(I i2);

    O mergeFrom(I i2);
}
