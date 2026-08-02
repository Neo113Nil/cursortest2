package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t70 extends AbstractC0379k0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, t70> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected of1 unknownFields;

    public t70() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = of1.f5717f;
    }

    /* JADX INFO: renamed from: d */
    public static t70 m4751d(Class cls) {
        t70 t70Var = defaultInstanceMap.get(cls);
        if (t70Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t70Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t70Var != null) {
            return t70Var;
        }
        t70 t70Var2 = (t70) ((t70) gg1.m2039d(cls)).mo507c(6);
        if (t70Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t70Var2);
        return t70Var2;
    }

    /* JADX INFO: renamed from: e */
    public static Object m4752e(Method method, t70 t70Var, Object... objArr) {
        try {
            return method.invoke(t70Var, objArr);
        } catch (IllegalAccessException e) {
            C0270h1.m2189e("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C0270h1.m2189e("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4753f(t70 t70Var, boolean z) {
        byte bByteValue = ((Byte) t70Var.mo507c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        fy0 fy0Var = fy0.f2536c;
        fy0Var.getClass();
        boolean zMo4477c = fy0Var.m1907a(t70Var.getClass()).mo4477c(t70Var);
        if (z) {
            t70Var.mo507c(2);
        }
        return zMo4477c;
    }

    /* JADX INFO: renamed from: j */
    public static void m4754j(Class cls, t70 t70Var) {
        t70Var.m4756h();
        defaultInstanceMap.put(cls, t70Var);
    }

    @Override // p000.AbstractC0379k0
    /* JADX INFO: renamed from: a */
    public final int mo2975a(s51 s51Var) {
        int iMo4482h;
        int iMo4482h2;
        if (m4755g()) {
            if (s51Var == null) {
                fy0 fy0Var = fy0.f2536c;
                fy0Var.getClass();
                iMo4482h2 = fy0Var.m1907a(getClass()).mo4482h(this);
            } else {
                iMo4482h2 = s51Var.mo4482h(this);
            }
            if (iMo4482h2 >= 0) {
                return iMo4482h2;
            }
            C0270h1.m2191g(j11.m2773h("serialized size must be non-negative, was ", iMo4482h2));
            return UNINITIALIZED_HASH_CODE;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (s51Var == null) {
            fy0 fy0Var2 = fy0.f2536c;
            fy0Var2.getClass();
            iMo4482h = fy0Var2.m1907a(getClass()).mo4482h(this);
        } else {
            iMo4482h = s51Var.mo4482h(this);
        }
        m4758k(iMo4482h);
        return iMo4482h;
    }

    @Override // p000.AbstractC0379k0
    /* JADX INFO: renamed from: b */
    public final void mo2976b(C0360ji c0360ji) {
        fy0 fy0Var = fy0.f2536c;
        fy0Var.getClass();
        s51 s51VarM1907a = fy0Var.m1907a(getClass());
        nu1 nu1Var = c0360ji.f3934a;
        if (nu1Var == null) {
            nu1Var = new nu1(c0360ji);
        }
        s51VarM1907a.mo4481g(this, nu1Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo507c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fy0 fy0Var = fy0.f2536c;
        fy0Var.getClass();
        return fy0Var.m1907a(getClass()).mo4483i(this, (t70) obj);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4755g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m4756h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m4755g()) {
            fy0 fy0Var = fy0.f2536c;
            fy0Var.getClass();
            return fy0Var.m1907a(getClass()).mo4479e(this);
        }
        if (this.memoizedHashCode == 0) {
            fy0 fy0Var2 = fy0.f2536c;
            fy0Var2.getClass();
            this.memoizedHashCode = fy0Var2.m1907a(getClass()).mo4479e(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final t70 m4757i() {
        return (t70) mo507c(4);
    }

    /* JADX INFO: renamed from: k */
    public final void m4758k(int i) {
        if (i < 0) {
            C0270h1.m2191g(j11.m2773h("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = ro0.f6925a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        ro0.m4390c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
