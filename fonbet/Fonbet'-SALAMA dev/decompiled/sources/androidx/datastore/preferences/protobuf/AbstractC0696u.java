package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0696u extends AbstractC0677a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0696u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b0 unknownFields;

    public AbstractC0696u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b0.f9166f;
    }

    public static AbstractC0696u f(Class cls) {
        AbstractC0696u abstractC0696u = defaultInstanceMap.get(cls);
        if (abstractC0696u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0696u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0696u == null) {
            abstractC0696u = (AbstractC0696u) ((AbstractC0696u) h0.d(cls)).e(6);
            if (abstractC0696u == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0696u);
        }
        return abstractC0696u;
    }

    public static Object g(Method method, AbstractC0677a abstractC0677a, Object... objArr) {
        try {
            return method.invoke(abstractC0677a, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0696u abstractC0696u, boolean z4) {
        byte byteValue = ((Byte) abstractC0696u.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Q q7 = Q.f9136c;
        q7.getClass();
        boolean c3 = q7.a(abstractC0696u.getClass()).c(abstractC0696u);
        if (z4) {
            abstractC0696u.e(2);
        }
        return c3;
    }

    public static void l(Class cls, AbstractC0696u abstractC0696u) {
        abstractC0696u.j();
        defaultInstanceMap.put(cls, abstractC0696u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0677a
    public final int a(U u4) {
        int f7;
        int f8;
        if (i()) {
            if (u4 == null) {
                Q q7 = Q.f9136c;
                q7.getClass();
                f8 = q7.a(getClass()).f(this);
            } else {
                f8 = u4.f(this);
            }
            if (f8 >= 0) {
                return f8;
            }
            throw new IllegalStateException(e1.k.d(f8, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (u4 == null) {
            Q q8 = Q.f9136c;
            q8.getClass();
            f7 = q8.a(getClass()).f(this);
        } else {
            f7 = u4.f(this);
        }
        m(f7);
        return f7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0677a
    public final void b(C0687k c0687k) {
        Q q7 = Q.f9136c;
        q7.getClass();
        U a2 = q7.a(getClass());
        D d7 = c0687k.f9216m;
        if (d7 == null) {
            d7 = new D(c0687k);
        }
        a2.e(this, d7);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public abstract Object e(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q q7 = Q.f9136c;
        q7.getClass();
        return q7.a(getClass()).h(this, (AbstractC0696u) obj);
    }

    public final int hashCode() {
        if (i()) {
            Q q7 = Q.f9136c;
            q7.getClass();
            return q7.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            Q q8 = Q.f9136c;
            q8.getClass();
            this.memoizedHashCode = q8.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final AbstractC0696u k() {
        return (AbstractC0696u) e(4);
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = K.f9116a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        K.c(this, sb, 0);
        return sb.toString();
    }
}
