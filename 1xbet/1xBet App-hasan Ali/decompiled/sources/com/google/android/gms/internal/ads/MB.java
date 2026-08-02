package com.google.android.gms.internal.ads;

import I.C0160m;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class MB extends AbstractC1464qB {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, MB> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd;
    protected C1779xC zzt;

    public MB() {
        this.zzq = 0;
        this.zzd = -1;
        this.zzt = C1779xC.f;
    }

    public static Object i(Method method, AbstractC1464qB abstractC1464qB, Object... objArr) {
        try {
            return method.invoke(abstractC1464qB, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void k(Class cls, MB mb) {
        mb.j();
        zzc.put(cls, mb);
    }

    public static MB m(Class cls) {
        MB mb = zzc.get(cls);
        if (mb == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                mb = zzc.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (mb != null) {
            return mb;
        }
        MB mb2 = (MB) ((MB) CC.h(cls)).s(6, null);
        if (mb2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, mb2);
        return mb2;
    }

    public static MB o(MB mb, AbstractC1823yB abstractC1823yB, GB gb) {
        AbstractC1674uy m5 = abstractC1823yB.m();
        MB p5 = p(mb, m5, gb);
        m5.G();
        t(p5);
        return p5;
    }

    public static MB p(MB mb, AbstractC1674uy abstractC1674uy, GB gb) {
        MB n5 = mb.n();
        try {
            InterfaceC1554sC a5 = C1285mC.f14484c.a(n5.getClass());
            C0160m c0160m = (C0160m) abstractC1674uy.f15939l;
            if (c0160m == null) {
                c0160m = new C0160m(abstractC1674uy);
            }
            a5.h(n5, c0160m, gb);
            a5.a(n5);
            return n5;
        } catch (XB e3) {
            if (e3.f12158k) {
                throw new XB(e3.getMessage(), e3);
            }
            throw e3;
        } catch (C1734wC e5) {
            throw new XB(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof XB) {
                throw ((XB) e6.getCause());
            }
            throw new XB(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof XB) {
                throw ((XB) e7.getCause());
            }
            throw e7;
        }
    }

    public static void t(MB mb) {
        if (mb != null && !v(mb, true)) {
            throw new XB(new C1734wC().getMessage());
        }
    }

    public static MB u(MB mb, byte[] bArr, int i, GB gb) {
        if (i == 0) {
            return mb;
        }
        MB n5 = mb.n();
        try {
            InterfaceC1554sC a5 = C1285mC.f14484c.a(n5.getClass());
            a5.f(n5, bArr, 0, i, new C1598tB(gb));
            a5.a(n5);
            return n5;
        } catch (XB e3) {
            if (e3.f12158k) {
                throw new XB(e3.getMessage(), e3);
            }
            throw e3;
        } catch (C1734wC e5) {
            throw new XB(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof XB) {
                throw ((XB) e6.getCause());
            }
            throw new XB(e6.getMessage(), e6);
        } catch (IndexOutOfBoundsException unused) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static final boolean v(MB mb, boolean z3) {
        byte byteValue = ((Byte) mb.s(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g5 = C1285mC.f14484c.a(mb.getClass()).g(mb);
        if (z3) {
            mb.s(2, true == g5 ? mb : null);
        }
        return g5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1464qB
    public final int a(InterfaceC1554sC interfaceC1554sC) {
        int i;
        int i5;
        if (r()) {
            if (interfaceC1554sC == null) {
                i5 = C1285mC.f14484c.a(getClass()).i(this);
            } else {
                i5 = interfaceC1554sC.i(this);
            }
            if (i5 >= 0) {
                return i5;
            }
            throw new IllegalStateException(AbstractC2107A.q("serialized size must be non-negative, was ", i5));
        }
        int i6 = this.zzd;
        if ((i6 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i6 & Integer.MAX_VALUE;
        }
        if (interfaceC1554sC == null) {
            i = C1285mC.f14484c.a(getClass()).i(this);
        } else {
            i = interfaceC1554sC.i(this);
        }
        f(i);
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1285mC.f14484c.a(getClass()).c(this, (MB) obj);
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC2107A.q("serialized size must be non-negative, was ", i));
        }
        this.zzd = i | (this.zzd & zza);
    }

    public final KB g() {
        return (KB) s(5, null);
    }

    public final InterfaceC1195kC h() {
        return (InterfaceC1195kC) s(7, null);
    }

    public final int hashCode() {
        if (r()) {
            return C1285mC.f14484c.a(getClass()).e(this);
        }
        if (this.zzq == 0) {
            this.zzq = C1285mC.f14484c.a(getClass()).e(this);
        }
        return this.zzq;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final KB l() {
        KB kb = (KB) s(5, null);
        if (kb.f10140k.equals(this)) {
            return kb;
        }
        kb.e();
        MB mb = kb.f10141l;
        C1285mC.f14484c.a(mb.getClass()).d(mb, this);
        return kb;
    }

    public final MB n() {
        return (MB) s(4, null);
    }

    public final void q(EB eb) {
        InterfaceC1554sC a5 = C1285mC.f14484c.a(getClass());
        Ps ps = eb.f8471l;
        if (ps == null) {
            ps = new Ps(eb);
        }
        a5.j(this, ps);
    }

    public final boolean r() {
        return (this.zzd & zza) != 0;
    }

    public abstract Object s(int i, MB mb);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC1017gC.f13575a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC1017gC.c(this, sb, 0);
        return sb.toString();
    }
}
