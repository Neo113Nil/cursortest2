package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0665j;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C extends AbstractC0847a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected B0 unknownFields;

    public C() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = B0.f12098f;
    }

    public static void f(C c3) throws M {
        if (!m(c3, true)) {
            throw new M(new A0().getMessage());
        }
    }

    public static C k(Class cls) {
        C c3 = defaultInstanceMap.get(cls);
        if (c3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c3 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (c3 == null) {
            c3 = (C) ((C) K0.b(cls)).j(6);
            if (c3 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, c3);
        }
        return c3;
    }

    public static Object l(Method method, AbstractC0847a abstractC0847a, Object... objArr) {
        try {
            return method.invoke(abstractC0847a, objArr);
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

    public static final boolean m(C c3, boolean z4) {
        byte bByteValue = ((Byte) c3.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0872m0 c0872m0 = C0872m0.f12232c;
        c0872m0.getClass();
        boolean zC = c0872m0.a(c3.getClass()).c(c3);
        if (z4) {
            c3.j(2);
        }
        return zC;
    }

    public static J p(J j) {
        int size = j.size();
        return j.a(size == 0 ? 10 : size * 2);
    }

    public static C r(C c3, byte[] bArr) throws M {
        int length = bArr.length;
        C0884t c0884tA = C0884t.a();
        C cQ = c3.q();
        try {
            C0872m0 c0872m0 = C0872m0.f12232c;
            c0872m0.getClass();
            InterfaceC0881r0 interfaceC0881r0A = c0872m0.a(cQ.getClass());
            C0824d c0824d = new C0824d();
            c0884tA.getClass();
            interfaceC0881r0A.i(cQ, bArr, 0, length, c0824d);
            interfaceC0881r0A.b(cQ);
            f(cQ);
            return cQ;
        } catch (A0 e7) {
            throw new M(e7.getMessage());
        } catch (M e8) {
            if (e8.f12124a) {
                throw new M(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof M) {
                throw ((M) e9.getCause());
            }
            throw new M(e9.getMessage(), e9);
        } catch (IndexOutOfBoundsException unused) {
            throw M.h();
        }
    }

    public static C s(C c3, H6.b bVar, C0884t c0884t) throws M {
        C cQ = c3.q();
        try {
            C0872m0 c0872m0 = C0872m0.f12232c;
            c0872m0.getClass();
            InterfaceC0881r0 interfaceC0881r0A = c0872m0.a(cQ.getClass());
            C0665j c0665j = (C0665j) bVar.f3426c;
            if (c0665j == null) {
                c0665j = new C0665j(bVar);
            }
            interfaceC0881r0A.g(cQ, c0665j, c0884t);
            interfaceC0881r0A.b(cQ);
            return cQ;
        } catch (A0 e7) {
            throw new M(e7.getMessage());
        } catch (M e8) {
            if (e8.f12124a) {
                throw new M(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof M) {
                throw ((M) e9.getCause());
            }
            throw new M(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof M) {
                throw ((M) e10.getCause());
            }
            throw e10;
        }
    }

    public static void t(Class cls, C c3) {
        c3.o();
        defaultInstanceMap.put(cls, c3);
    }

    @Override // com.google.protobuf.AbstractC0847a
    public final int c(InterfaceC0881r0 interfaceC0881r0) {
        int iH;
        int iH2;
        if (n()) {
            if (interfaceC0881r0 == null) {
                C0872m0 c0872m0 = C0872m0.f12232c;
                c0872m0.getClass();
                iH2 = c0872m0.a(getClass()).h(this);
            } else {
                iH2 = interfaceC0881r0.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(p031e1.k.d(iH2, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (interfaceC0881r0 == null) {
            C0872m0 c0872m1 = C0872m0.f12232c;
            c0872m1.getClass();
            iH = c0872m1.a(getClass()).h(this);
        } else {
            iH = interfaceC0881r0.h(this);
        }
        u(iH);
        return iH;
    }

    @Override // com.google.protobuf.AbstractC0847a
    public final void e(AbstractC0879q abstractC0879q) {
        C0872m0 c0872m0 = C0872m0.f12232c;
        c0872m0.getClass();
        InterfaceC0881r0 interfaceC0881r0A = c0872m0.a(getClass());
        X x4 = abstractC0879q.f12261c;
        if (x4 == null) {
            x4 = new X(abstractC0879q);
        }
        interfaceC0881r0A.e(this, x4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0872m0 c0872m0 = C0872m0.f12232c;
        c0872m0.getClass();
        return c0872m0.a(getClass()).j(this, (C) obj);
    }

    public final void g() {
        this.memoizedHashCode = 0;
    }

    public final void h() {
        u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final int hashCode() {
        if (n()) {
            C0872m0 c0872m0 = C0872m0.f12232c;
            c0872m0.getClass();
            return c0872m0.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            C0872m0 c0872m1 = C0872m0.f12232c;
            c0872m1.getClass();
            this.memoizedHashCode = c0872m1.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final A i() {
        return (A) j(5);
    }

    public abstract Object j(int i7);

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final C q() {
        return (C) j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0856e0.f12181a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0856e0.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(p031e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }
}
