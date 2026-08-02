package com.google.common.collect;

import androidx.media3.common.TrackGroup;
import com.google.common.collect.I;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class D<K, V> extends I<K, V> {
    private static final long serialVersionUID = 912559;

    public static final class a<K, V> extends I.a<K, V> {
        @Override // com.google.common.collect.I.a
        @Deprecated
        public final I b() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.I.a
        public final I.a d(Object obj, Object obj2) {
            super.d(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.I.a
        public final I.a f(Iterable iterable) {
            super.f(iterable);
            return this;
        }

        @Override // com.google.common.collect.I.a
        public final I.a g(Map map) {
            super.g(map);
            return this;
        }

        @Override // com.google.common.collect.I.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final h0 c() {
            return this.b == 0 ? h0.k : new h0(this.a, this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void i(TrackGroup trackGroup, String str) {
            super.d(trackGroup, str);
        }
    }

    public static class b<K, V> extends I.b<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.I.b
        public final I.a a(int i) {
            return new a(i);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.I
    public final E e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.I
    /* renamed from: h */
    public final E values() {
        return i().keySet();
    }

    public abstract h0 i();

    @Override // com.google.common.collect.I, java.util.Map
    public final Collection values() {
        return i().keySet();
    }

    @Override // com.google.common.collect.I
    public Object writeReplace() {
        return new b(this);
    }
}
