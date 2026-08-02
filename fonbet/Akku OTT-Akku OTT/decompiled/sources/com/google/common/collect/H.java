package com.google.common.collect;

import com.google.common.collect.G;
import com.google.common.collect.I;
import com.google.common.collect.L;
import com.google.common.collect.n0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/* loaded from: classes4.dex */
public class H<K, V> extends L<K, V> implements Q<K, V> {
    private static final long serialVersionUID = 0;

    public static final class a<K, V> extends L.a<K, V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(android.support.v4.media.a.a(readInt, "Invalid key count "));
        }
        I.a a2 = I.a();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(android.support.v4.media.a.a(readInt2, "Invalid value count "));
            }
            G.b bVar = G.b;
            G.a aVar = new G.a();
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                aVar.c(readObject2);
            }
            a2.d(readObject, aVar.g());
            i += readInt2;
        }
        try {
            j0 a3 = a2.a(true);
            n0.a<? super L<?, ?>> aVar2 = L.c.a;
            aVar2.getClass();
            try {
                aVar2.a.set(this, a3);
                n0.a<? super L<?, ?>> aVar3 = L.c.b;
                aVar3.getClass();
                try {
                    aVar3.a.set(this, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.b(this, objectOutputStream);
    }

    @Override // com.google.common.collect.L, com.google.common.collect.W
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final G<V> get(K k) {
        G<V> g = (G) this.e.get(k);
        if (g != null) {
            return g;
        }
        G.b bVar = G.b;
        return i0.e;
    }
}
