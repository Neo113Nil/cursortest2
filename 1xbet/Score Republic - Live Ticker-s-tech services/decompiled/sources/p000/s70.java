package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s70 extends AbstractC0342j0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, s70> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected nf1 unknownFields;

    public s70() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = nf1.f5398f;
    }

    /* JADX INFO: renamed from: f */
    public static s70 m4490f(Class cls) {
        s70 s70Var = defaultInstanceMap.get(cls);
        if (s70Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                s70Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (s70Var != null) {
            return s70Var;
        }
        s70 s70Var2 = (s70) ((s70) fg1.m1776b(cls)).mo182e(6);
        if (s70Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, s70Var2);
        return s70Var2;
    }

    /* JADX INFO: renamed from: g */
    public static Object m4491g(Method method, s70 s70Var, Object... objArr) {
        try {
            return method.invoke(s70Var, objArr);
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

    /* JADX INFO: renamed from: h */
    public static final boolean m4492h(s70 s70Var, boolean z) {
        byte bByteValue = ((Byte) s70Var.mo182e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ey0 ey0Var = ey0.f2207c;
        ey0Var.getClass();
        boolean zMo4250c = ey0Var.m1525a(s70Var.getClass()).mo4250c(s70Var);
        if (z) {
            s70Var.mo182e(2);
        }
        return zMo4250c;
    }

    /* JADX INFO: renamed from: l */
    public static void m4493l(Class cls, s70 s70Var) {
        s70Var.m4496j();
        defaultInstanceMap.put(cls, s70Var);
    }

    @Override // p000.AbstractC0342j0
    /* JADX INFO: renamed from: a */
    public final int mo2754a(r51 r51Var) {
        int iMo4254g;
        int iMo4254g2;
        if (m4495i()) {
            if (r51Var == null) {
                ey0 ey0Var = ey0.f2207c;
                ey0Var.getClass();
                iMo4254g2 = ey0Var.m1525a(getClass()).mo4254g(this);
            } else {
                iMo4254g2 = r51Var.mo4254g(this);
            }
            if (iMo4254g2 >= 0) {
                return iMo4254g2;
            }
            C0270h1.m2191g(j11.m2773h("serialized size must be non-negative, was ", iMo4254g2));
            return UNINITIALIZED_HASH_CODE;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (r51Var == null) {
            ey0 ey0Var2 = ey0.f2207c;
            ey0Var2.getClass();
            iMo4254g = ey0Var2.m1525a(getClass()).mo4254g(this);
        } else {
            iMo4254g = r51Var.mo4254g(this);
        }
        m4498m(iMo4254g);
        return iMo4254g;
    }

    @Override // p000.AbstractC0342j0
    /* JADX INFO: renamed from: c */
    public final void mo2756c(AbstractC0397ki abstractC0397ki) {
        ey0 ey0Var = ey0.f2207c;
        ey0Var.getClass();
        r51 r51VarM1525a = ey0Var.m1525a(getClass());
        b90 b90Var = abstractC0397ki.f4385a;
        if (b90Var == null) {
            b90Var = new b90(abstractC0397ki);
        }
        r51VarM1525a.mo4255h(this, b90Var);
    }

    /* JADX INFO: renamed from: d */
    public final o70 m4494d() {
        return (o70) mo182e(5);
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo182e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ey0 ey0Var = ey0.f2207c;
        ey0Var.getClass();
        return ey0Var.m1525a(getClass()).mo4256i(this, (s70) obj);
    }

    public final int hashCode() {
        if (m4495i()) {
            ey0 ey0Var = ey0.f2207c;
            ey0Var.getClass();
            return ey0Var.m1525a(getClass()).mo4252e(this);
        }
        if (this.memoizedHashCode == 0) {
            ey0 ey0Var2 = ey0.f2207c;
            ey0Var2.getClass();
            this.memoizedHashCode = ey0Var2.m1525a(getClass()).mo4252e(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4495i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m4496j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: k */
    public final s70 m4497k() {
        return (s70) mo182e(4);
    }

    /* JADX INFO: renamed from: m */
    public final void m4498m(int i) {
        if (i < 0) {
            C0270h1.m2191g(j11.m2773h("serialized size must be non-negative, was ", i));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = qo0.f6548a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        qo0.m4119c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
