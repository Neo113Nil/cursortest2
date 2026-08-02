package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/rum/tracking/ComponentPredicate;", "T", "", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "accept", "(Ljava/lang/Object;)Z", "", "getViewName", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ComponentPredicate<T> {
    boolean accept(T component);

    java.lang.String getViewName(T component);
}
