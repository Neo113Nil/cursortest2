package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0686j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0886w extends AbstractC0865a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0886w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected f0 unknownFields;

    public AbstractC0886w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = f0.f11769f;
    }

    public static void g(AbstractC0886w abstractC0886w) {
        if (!o(abstractC0886w, true)) {
            throw new C(new e0().getMessage());
        }
    }

    public static AbstractC0886w l(Class cls) {
        AbstractC0886w abstractC0886w = defaultInstanceMap.get(cls);
        if (abstractC0886w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0886w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0886w == null) {
            abstractC0886w = ((AbstractC0886w) o0.b(cls)).a();
            if (abstractC0886w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0886w);
        }
        return abstractC0886w;
    }

    public static Object n(Method method, AbstractC0865a abstractC0865a, Object... objArr) {
        try {
            return method.invoke(abstractC0865a, objArr);
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

    public static final boolean o(AbstractC0886w abstractC0886w, boolean z4) {
        byte byteValue = ((Byte) abstractC0886w.k(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Z z7 = Z.f11748c;
        z7.getClass();
        boolean c3 = z7.a(abstractC0886w.getClass()).c(abstractC0886w);
        if (z4) {
            abstractC0886w.k(2);
        }
        return c3;
    }

    public static AbstractC0886w t(AbstractC0886w abstractC0886w, AbstractC0873i abstractC0873i, C0879o c0879o) {
        C0872h c0872h = (C0872h) abstractC0873i;
        C0874j h6 = L3.e.h(c0872h.f11777d, c0872h.A(), c0872h.size(), true);
        AbstractC0886w u4 = u(abstractC0886w, h6, c0879o);
        h6.b(0);
        g(u4);
        return u4;
    }

    public static AbstractC0886w u(AbstractC0886w abstractC0886w, L3.e eVar, C0879o c0879o) {
        AbstractC0886w s7 = abstractC0886w.s();
        try {
            Z z4 = Z.f11748c;
            z4.getClass();
            c0 a2 = z4.a(s7.getClass());
            C0686j c0686j = (C0686j) eVar.f4335b;
            if (c0686j == null) {
                c0686j = new C0686j(eVar, (byte) 0);
            }
            a2.j(s7, c0686j, c0879o);
            a2.b(s7);
            return s7;
        } catch (C e7) {
            if (e7.f11704a) {
                throw new C(e7.getMessage(), e7);
            }
            throw e7;
        } catch (e0 e8) {
            throw new C(e8.getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof C) {
                throw ((C) e9.getCause());
            }
            throw new C(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C) {
                throw ((C) e10.getCause());
            }
            throw e10;
        }
    }

    public static void v(Class cls, AbstractC0886w abstractC0886w) {
        abstractC0886w.q();
        defaultInstanceMap.put(cls, abstractC0886w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0865a
    public final int b(c0 c0Var) {
        int f7;
        int f8;
        if (p()) {
            if (c0Var == null) {
                Z z4 = Z.f11748c;
                z4.getClass();
                f8 = z4.a(getClass()).f(this);
            } else {
                f8 = c0Var.f(this);
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
        if (c0Var == null) {
            Z z7 = Z.f11748c;
            z7.getClass();
            f7 = z7.a(getClass()).f(this);
        } else {
            f7 = c0Var.f(this);
        }
        w(f7);
        return f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z z4 = Z.f11748c;
        z4.getClass();
        return z4.a(getClass()).h(this, (AbstractC0886w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0865a
    public final void f(C0876l c0876l) {
        Z z4 = Z.f11748c;
        z4.getClass();
        c0 a2 = z4.a(getClass());
        L l7 = c0876l.f11800g;
        if (l7 == null) {
            l7 = new L(c0876l);
        }
        a2.i(this, l7);
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (p()) {
            Z z4 = Z.f11748c;
            z4.getClass();
            return z4.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            Z z7 = Z.f11748c;
            z7.getClass();
            this.memoizedHashCode = z7.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        w(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final AbstractC0884u j() {
        return (AbstractC0884u) k(5);
    }

    public abstract Object k(int i7);

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractC0886w a() {
        return (AbstractC0886w) k(6);
    }

    public final boolean p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void q() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0865a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC0884u d() {
        return (AbstractC0884u) k(5);
    }

    public final AbstractC0886w s() {
        return (AbstractC0886w) k(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = S.f11727a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        S.c(this, sb, 0);
        return sb.toString();
    }

    public final void w(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final AbstractC0884u x() {
        AbstractC0884u abstractC0884u = (AbstractC0884u) k(5);
        if (!abstractC0884u.f11826a.equals(this)) {
            abstractC0884u.e();
            AbstractC0884u.f(abstractC0884u.f11827b, this);
        }
        return abstractC0884u;
    }
}
