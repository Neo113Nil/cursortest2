package com.datadog.android.core.sampling;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/core/sampling/Sampler;", "", "T", "", "getSampleRate", "()Ljava/lang/Float;", "item", "", "sample", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Sampler<T> {
    java.lang.Float getSampleRate();

    boolean sample(T item);
}
