package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface IParamsAppender<T> {
    void appendParams(android.net.Uri.Builder builder, T t);
}
