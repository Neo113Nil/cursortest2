package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0665j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0842w extends AbstractC0821a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0842w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected f0 unknownFields;

    public AbstractC0842w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = f0.f11769f;
    }

    public static void g(AbstractC0842w abstractC0842w) throws C {
        if (!o(abstractC0842w, true)) {
            throw new C(new e0().getMessage());
        }
    }

    public static AbstractC0842w l(Class cls) {
        AbstractC0842w abstractC0842wA = defaultInstanceMap.get(cls);
        if (abstractC0842wA == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0842wA = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0842wA == null) {
            abstractC0842wA = ((AbstractC0842w) o0.b(cls)).a();
            if (abstractC0842wA == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0842wA);
        }
        return abstractC0842wA;
    }

    public static Object n(Method method, AbstractC0821a abstractC0821a, Object... objArr) {
        try {
            return method.invoke(abstractC0821a, objArr);
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

    public static final boolean o(AbstractC0842w abstractC0842w, boolean z4) {
        byte bByteValue = ((Byte) abstractC0842w.k(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Z z7 = Z.f11748c;
        z7.getClass();
        boolean zC = z7.a(abstractC0842w.getClass()).c(abstractC0842w);
        if (z4) {
            abstractC0842w.k(2);
        }
        return zC;
    }

    public static AbstractC0842w t(AbstractC0842w abstractC0842w, AbstractC0829i abstractC0829i, C0835o c0835o) throws C {
        C0828h c0828h = (C0828h) abstractC0829i;
        C0830j c0830jH = L3.e.h(c0828h.f11777d, c0828h.A(), c0828h.size(), true);
        AbstractC0842w abstractC0842wU = u(abstractC0842w, c0830jH, c0835o);
        c0830jH.b(0);
        g(abstractC0842wU);
        return abstractC0842wU;
    }

    public static AbstractC0842w u(AbstractC0842w abstractC0842w, L3.e eVar, C0835o c0835o) throws C {
        AbstractC0842w abstractC0842wS = abstractC0842w.s();
        try {
            Z z4 = Z.f11748c;
            z4.getClass();
            c0 c0VarA = z4.a(abstractC0842wS.getClass());
            C0665j c0665j = (C0665j) eVar.f4335b;
            if (c0665j == null) {
                c0665j = new C0665j(eVar, (byte) 0);
            }
            c0VarA.j(abstractC0842wS, c0665j, c0835o);
            c0VarA.b(abstractC0842wS);
            return abstractC0842wS;
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

    public static void v(Class cls, AbstractC0842w abstractC0842w) {
        abstractC0842w.q();
        defaultInstanceMap.put(cls, abstractC0842w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0821a
    public final int b(c0 c0Var) {
        int iF;
        int iF2;
        if (p()) {
            if (c0Var == null) {
                Z z4 = Z.f11748c;
                z4.getClass();
                iF2 = z4.a(getClass()).f(this);
            } else {
                iF2 = c0Var.f(this);
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
        if (c0Var == null) {
            Z z7 = Z.f11748c;
            z7.getClass();
            iF = z7.a(getClass()).f(this);
        } else {
            iF = c0Var.f(this);
        }
        w(iF);
        return iF;
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
        return z4.a(getClass()).h(this, (AbstractC0842w) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0821a
    public final void f(C0832l c0832l) {
        Z z4 = Z.f11748c;
        z4.getClass();
        c0 c0VarA = z4.a(getClass());
        L l7 = c0832l.f11800g;
        if (l7 == null) {
            l7 = new L(c0832l);
        }
        c0VarA.i(this, l7);
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

    public final AbstractC0840u j() {
        return (AbstractC0840u) k(5);
    }

    public abstract Object k(int i7);

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractC0842w a() {
        return (AbstractC0842w) k(6);
    }

    public final boolean p() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void q() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0821a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC0840u d() {
        return (AbstractC0840u) k(5);
    }

    public final AbstractC0842w s() {
        return (AbstractC0842w) k(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = S.f11727a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        S.c(this, sb, 0);
        return sb.toString();
    }

    public final void w(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(p031e1.k.d(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final AbstractC0840u x() {
        AbstractC0840u abstractC0840u = (AbstractC0840u) k(5);
        if (!abstractC0840u.f11826a.equals(this)) {
            abstractC0840u.e();
            AbstractC0840u.f(abstractC0840u.f11827b, this);
        }
        return abstractC0840u;
    }
}
