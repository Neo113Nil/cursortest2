package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
interface f0<T> {
    int a(AbstractC5355a abstractC5355a);

    void b(Object obj, C5364j c5364j, C5369o c5369o) throws IOException;

    void c(T t2, t0 t0Var) throws IOException;

    boolean d(AbstractC5376w abstractC5376w, AbstractC5376w abstractC5376w2);

    int e(AbstractC5376w abstractC5376w);

    boolean isInitialized(T t2);

    void makeImmutable(T t2);

    void mergeFrom(T t2, T t11);

    T newInstance();
}
