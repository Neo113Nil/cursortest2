package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0686j;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class C extends AbstractC0891a {
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

    public static void f(C c3) {
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

    public static Object l(Method method, AbstractC0891a abstractC0891a, Object... objArr) {
        try {
            return method.invoke(abstractC0891a, objArr);
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
        byte byteValue = ((Byte) c3.j(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C0916m0 c0916m0 = C0916m0.f12232c;
        c0916m0.getClass();
        boolean c4 = c0916m0.a(c3.getClass()).c(c3);
        if (z4) {
            c3.j(2);
        }
        return c4;
    }

    public static J p(J j) {
        int size = j.size();
        return j.a(size == 0 ? 10 : size * 2);
    }

    public static C r(C c3, byte[] bArr) {
        int length = bArr.length;
        C0928t a2 = C0928t.a();
        C q7 = c3.q();
        try {
            C0916m0 c0916m0 = C0916m0.f12232c;
            c0916m0.getClass();
            InterfaceC0925r0 a4 = c0916m0.a(q7.getClass());
            C0868d c0868d = new C0868d();
            a2.getClass();
            a4.i(q7, bArr, 0, length, c0868d);
            a4.b(q7);
            f(q7);
            return q7;
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

    public static C s(C c3, H6.b bVar, C0928t c0928t) {
        C q7 = c3.q();
        try {
            C0916m0 c0916m0 = C0916m0.f12232c;
            c0916m0.getClass();
            InterfaceC0925r0 a2 = c0916m0.a(q7.getClass());
            C0686j c0686j = (C0686j) bVar.f3426c;
            if (c0686j == null) {
                c0686j = new C0686j(bVar);
            }
            a2.g(q7, c0686j, c0928t);
            a2.b(q7);
            return q7;
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

    @Override // com.google.protobuf.AbstractC0891a
    public final int c(InterfaceC0925r0 interfaceC0925r0) {
        int h6;
        int h7;
        if (n()) {
            if (interfaceC0925r0 == null) {
                C0916m0 c0916m0 = C0916m0.f12232c;
                c0916m0.getClass();
                h7 = c0916m0.a(getClass()).h(this);
            } else {
                h7 = interfaceC0925r0.h(this);
            }
            if (h7 >= 0) {
                return h7;
            }
            throw new IllegalStateException(e1.k.d(h7, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (interfaceC0925r0 == null) {
            C0916m0 c0916m02 = C0916m0.f12232c;
            c0916m02.getClass();
            h6 = c0916m02.a(getClass()).h(this);
        } else {
            h6 = interfaceC0925r0.h(this);
        }
        u(h6);
        return h6;
    }

    @Override // com.google.protobuf.AbstractC0891a
    public final void e(AbstractC0923q abstractC0923q) {
        C0916m0 c0916m0 = C0916m0.f12232c;
        c0916m0.getClass();
        InterfaceC0925r0 a2 = c0916m0.a(getClass());
        X x4 = abstractC0923q.f12261c;
        if (x4 == null) {
            x4 = new X(abstractC0923q);
        }
        a2.e(this, x4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0916m0 c0916m0 = C0916m0.f12232c;
        c0916m0.getClass();
        return c0916m0.a(getClass()).j(this, (C) obj);
    }

    public final void g() {
        this.memoizedHashCode = 0;
    }

    public final void h() {
        u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final int hashCode() {
        if (n()) {
            C0916m0 c0916m0 = C0916m0.f12232c;
            c0916m0.getClass();
            return c0916m0.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            C0916m0 c0916m02 = C0916m0.f12232c;
            c0916m02.getClass();
            this.memoizedHashCode = c0916m02.a(getClass()).f(this);
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
        String obj = super.toString();
        char[] cArr = AbstractC0900e0.f12181a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0900e0.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }
}
