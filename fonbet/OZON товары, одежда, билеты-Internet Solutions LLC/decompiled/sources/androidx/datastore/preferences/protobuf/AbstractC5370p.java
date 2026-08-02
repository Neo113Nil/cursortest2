package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.C5372s;
import androidx.datastore.preferences.protobuf.C5372s.b;
import java.io.IOException;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5370p<T extends C5372s.b<T>> {
    AbstractC5370p() {
    }

    abstract void a(Map.Entry entry);

    abstract AbstractC5376w.e b(C5369o c5369o, Q q11, int i11);

    abstract C5372s<T> c(Object obj);

    abstract C5372s<T> d(Object obj);

    abstract boolean e(Q q11);

    abstract void f(Object obj);

    abstract Object g(Object obj) throws IOException;

    abstract void h(Object obj) throws IOException;

    abstract void i(Object obj) throws IOException;

    abstract void j(Map.Entry entry) throws IOException;
}
