package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0675u extends AbstractC0656a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0675u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b0 unknownFields;

    public AbstractC0675u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b0.f9166f;
    }

    public static AbstractC0675u f(Class cls) {
        AbstractC0675u abstractC0675u = defaultInstanceMap.get(cls);
        if (abstractC0675u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0675u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0675u == null) {
            abstractC0675u = (AbstractC0675u) ((AbstractC0675u) h0.d(cls)).e(6);
            if (abstractC0675u == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0675u);
        }
        return abstractC0675u;
    }

    public static Object g(Method method, AbstractC0656a abstractC0656a, Object... objArr) {
        try {
            return method.invoke(abstractC0656a, objArr);
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

    public static final boolean h(AbstractC0675u abstractC0675u, boolean z4) {
        byte bByteValue = ((Byte) abstractC0675u.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Q q7 = Q.f9136c;
        q7.getClass();
        boolean zC = q7.a(abstractC0675u.getClass()).c(abstractC0675u);
        if (z4) {
            abstractC0675u.e(2);
        }
        return zC;
    }

    public static void l(Class cls, AbstractC0675u abstractC0675u) {
        abstractC0675u.j();
        defaultInstanceMap.put(cls, abstractC0675u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0656a
    public final int a(U u4) {
        int iF;
        int iF2;
        if (i()) {
            if (u4 == null) {
                Q q7 = Q.f9136c;
                q7.getClass();
                iF2 = q7.a(getClass()).f(this);
            } else {
                iF2 = u4.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(p031e1.k.d(iF2, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (u4 == null) {
            Q q8 = Q.f9136c;
            q8.getClass();
            iF = q8.a(getClass()).f(this);
        } else {
            iF = u4.f(this);
        }
        m(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0656a
    public final void b(C0666k c0666k) {
        Q q7 = Q.f9136c;
        q7.getClass();
        U uA = q7.a(getClass());
        D d7 = c0666k.f9216m;
        if (d7 == null) {
            d7 = new D(c0666k);
        }
        uA.e(this, d7);
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
        return q7.a(getClass()).h(this, (AbstractC0675u) obj);
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

    public final AbstractC0675u k() {
        return (AbstractC0675u) e(4);
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(p031e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = K.f9116a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        K.c(this, sb, 0);
        return sb.toString();
    }
}
