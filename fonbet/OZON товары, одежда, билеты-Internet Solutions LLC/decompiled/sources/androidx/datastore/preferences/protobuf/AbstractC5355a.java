package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5355a;
import androidx.datastore.preferences.protobuf.AbstractC5355a.AbstractC0779a;
import androidx.datastore.preferences.protobuf.AbstractC5362h;
import androidx.datastore.preferences.protobuf.AbstractC5365k;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5355a<MessageType extends AbstractC5355a<MessageType, BuilderType>, BuilderType extends AbstractC0779a<MessageType, BuilderType>> implements Q {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0779a<MessageType extends AbstractC5355a<MessageType, BuilderType>, BuilderType extends AbstractC0779a<MessageType, BuilderType>> implements S, Cloneable {
    }

    protected static <T> void c(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = C5378y.f42629b;
        iterable.getClass();
        if (!(iterable instanceof D)) {
            if (iterable instanceof a0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t2 : iterable) {
                if (t2 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t2);
            }
            return;
        }
        List<?> underlyingElements = ((D) iterable).getUnderlyingElements();
        D d11 = (D) list;
        int size3 = list.size();
        for (Object obj : underlyingElements) {
            if (obj == null) {
                String str2 = "Element at index " + (d11.size() - size3) + " is null.";
                for (int size4 = d11.size() - 1; size4 >= size3; size4--) {
                    d11.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            if (obj instanceof AbstractC5362h) {
                d11.p();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                AbstractC5362h.e(0, bArr2.length, bArr2);
                d11.p();
            } else {
                d11.add((String) obj);
            }
        }
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    int e(f0 f0Var) {
        int d11 = d();
        if (d11 != -1) {
            return d11;
        }
        int a11 = f0Var.a(this);
        f(a11);
        return a11;
    }

    void f(int i11) {
        throw new UnsupportedOperationException();
    }

    public final void g(OutputStream outputStream) throws IOException {
        AbstractC5376w abstractC5376w = (AbstractC5376w) this;
        int e11 = abstractC5376w.e(null);
        int i11 = AbstractC5365k.f42576d;
        if (e11 > 4096) {
            e11 = 4096;
        }
        AbstractC5365k.d dVar = new AbstractC5365k.d(outputStream, e11);
        abstractC5376w.b(dVar);
        dVar.O();
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final AbstractC5362h toByteString() {
        try {
            int e11 = ((AbstractC5376w) this).e(null);
            AbstractC5362h abstractC5362h = AbstractC5362h.f42524b;
            AbstractC5362h.e eVar = new AbstractC5362h.e(e11);
            ((AbstractC5376w) this).b(eVar.b());
            return eVar.a();
        } catch (IOException e12) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e12);
        }
    }
}
