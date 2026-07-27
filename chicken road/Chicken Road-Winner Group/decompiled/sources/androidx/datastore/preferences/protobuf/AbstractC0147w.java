package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0147w extends AbstractC0126a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0147w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0147w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f;
    }

    public static AbstractC0147w d(Class cls) {
        AbstractC0147w abstractC0147w = defaultInstanceMap.get(cls);
        if (abstractC0147w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0147w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0147w != null) {
            return abstractC0147w;
        }
        AbstractC0147w abstractC0147w2 = (AbstractC0147w) ((AbstractC0147w) j0.d(cls)).c(6);
        if (abstractC0147w2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0147w2);
        return abstractC0147w2;
    }

    public static Object e(Method method, AbstractC0126a abstractC0126a, Object... objArr) {
        try {
            return method.invoke(abstractC0126a, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(AbstractC0147w abstractC0147w, boolean z3) {
        byte byteValue = ((Byte) abstractC0147w.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t3 = T.f2190c;
        t3.getClass();
        boolean e3 = t3.a(abstractC0147w.getClass()).e(abstractC0147w);
        if (z3) {
            abstractC0147w.c(2);
        }
        return e3;
    }

    public static void j(Class cls, AbstractC0147w abstractC0147w) {
        abstractC0147w.h();
        defaultInstanceMap.put(cls, abstractC0147w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0126a
    public final int a(W w3) {
        int h3;
        int h4;
        if (g()) {
            if (w3 == null) {
                T t3 = T.f2190c;
                t3.getClass();
                h4 = t3.a(getClass()).h(this);
            } else {
                h4 = w3.h(this);
            }
            if (h4 >= 0) {
                return h4;
            }
            throw new IllegalStateException(B0.c.h(h4, "serialized size must be non-negative, was "));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (w3 == null) {
            T t4 = T.f2190c;
            t4.getClass();
            h3 = t4.a(getClass()).h(this);
        } else {
            h3 = w3.h(this);
        }
        k(h3);
        return h3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0126a
    public final void b(C0138m c0138m) {
        T t3 = T.f2190c;
        t3.getClass();
        W a3 = t3.a(getClass());
        F f = c0138m.f2264b;
        if (f == null) {
            f = new F(c0138m);
        }
        a3.b(this, f);
    }

    public abstract Object c(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t3 = T.f2190c;
        t3.getClass();
        return t3.a(getClass()).f(this, (AbstractC0147w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            T t3 = T.f2190c;
            t3.getClass();
            return t3.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            T t4 = T.f2190c;
            t4.getClass();
            this.memoizedHashCode = t4.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0147w i() {
        return (AbstractC0147w) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(B0.c.h(i3, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f2170a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
