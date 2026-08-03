package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface StateSerializer<T> {
    T defaultValue();

    byte[] toByteArray(T t);

    T toState(byte[] bArr);
}
