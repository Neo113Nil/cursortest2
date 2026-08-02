package com.google.android.gms.internal.ads;

import android.provider.Settings;
import android.util.Base64;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413p5 extends AbstractCallableC1817y5 {
    public static volatile Long i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile Long f14962k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile String f14964m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile Long f14966o;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14968h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f14961j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f14963l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f14965n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f14967p = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1413p5(C0965f5 c0965f5, String str, String str2, C0919e4 c0919e4, int i5, int i6, int i7) {
        super(c0965f5, str, str2, c0919e4, i5, i6);
        this.f14968h = i7;
    }

    private final void c() {
        String str = (String) this.f16395e.invoke(null, null);
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            c0919e4.e();
            C1367o4.B0((C1367o4) c0919e4.f10141l, str);
        }
    }

    private final void d() {
        C0919e4 c0919e4 = this.f16394d;
        c0919e4.e();
        C1367o4.H0((C1367o4) c0919e4.f10141l, -1L);
        C0919e4 c0919e42 = this.f16394d;
        c0919e42.e();
        C1367o4.G0((C1367o4) c0919e42.f10141l, -1L);
        int[] iArr = (int[]) this.f16395e.invoke(null, this.f16391a.f13438a);
        synchronized (this.f16394d) {
            try {
                C0919e4 c0919e43 = this.f16394d;
                long j5 = iArr[0];
                c0919e43.e();
                C1367o4.H0((C1367o4) c0919e43.f10141l, j5);
                C0919e4 c0919e44 = this.f16394d;
                long j6 = iArr[1];
                c0919e44.e();
                C1367o4.G0((C1367o4) c0919e44.f10141l, j6);
                int i5 = iArr[2];
                if (i5 != Integer.MIN_VALUE) {
                    C0919e4 c0919e45 = this.f16394d;
                    c0919e45.e();
                    C1367o4.F0((C1367o4) c0919e45.f10141l, i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        if (i == null) {
            synchronized (f14961j) {
                try {
                    if (i == null) {
                        i = (Long) this.f16395e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            long longValue = i.longValue();
            c0919e4.e();
            C1367o4.J0((C1367o4) c0919e4.f10141l, longValue);
        }
    }

    private final void f() {
        if (this.f16391a.f13449n) {
            l();
            return;
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            String str = (String) this.f16395e.invoke(null, this.f16391a.f13438a);
            c0919e4.e();
            C1367o4.w((C1367o4) c0919e4.f10141l, str);
        }
    }

    private final void g() {
        if (f14962k == null) {
            synchronized (f14963l) {
                try {
                    if (f14962k == null) {
                        f14962k = (Long) this.f16395e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            long longValue = f14962k.longValue();
            c0919e4.e();
            C1367o4.C((C1367o4) c0919e4.f10141l, longValue);
        }
    }

    private final void h() {
        C0919e4 c0919e4 = this.f16394d;
        c0919e4.e();
        C1367o4.F((C1367o4) c0919e4.f10141l, "E");
        if (f14964m == null) {
            synchronized (f14965n) {
                try {
                    if (f14964m == null) {
                        f14964m = (String) this.f16395e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e42 = this.f16394d;
            String str = f14964m;
            c0919e42.e();
            C1367o4.F((C1367o4) c0919e42.f10141l, str);
        }
    }

    private final void i() {
        Boolean bool = (Boolean) Q2.r.f5053d.f5056c.a(F7.f8724M2);
        bool.getClass();
        String str = (String) this.f16395e.invoke(null, this.f16391a.f13438a, bool);
        W4 w42 = new W4();
        w42.f12020g = -1L;
        w42.f12021h = -1L;
        HashMap i5 = AbstractC1803xs.i(str);
        if (i5 != null) {
            w42.f12020g = ((Long) i5.get(0)).longValue();
            w42.f12021h = ((Long) i5.get(1)).longValue();
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            long j5 = w42.f12020g;
            c0919e4.e();
            C1367o4.E0((C1367o4) c0919e4.f10141l, j5);
            C0919e4 c0919e42 = this.f16394d;
            long j6 = w42.f12021h;
            c0919e42.e();
            C1367o4.G((C1367o4) c0919e42.f10141l, j6);
        }
    }

    private final void j() {
        synchronized (this.f16394d) {
            String str = (String) this.f16395e.invoke(null, null);
            C0787b5 c0787b5 = new C0787b5();
            HashMap i5 = AbstractC1803xs.i(str);
            if (i5 != null) {
                c0787b5.f12761g = (Long) i5.get(0);
                c0787b5.f12762h = (Long) i5.get(1);
            }
            C0919e4 c0919e4 = this.f16394d;
            long longValue = c0787b5.f12761g.longValue();
            c0919e4.e();
            C1367o4.K0((C1367o4) c0919e4.f10141l, longValue);
            C0919e4 c0919e42 = this.f16394d;
            long longValue2 = c0787b5.f12762h.longValue();
            c0919e42.e();
            C1367o4.L0((C1367o4) c0919e42.f10141l, longValue2);
        }
    }

    private final void k() {
        if (f14966o == null) {
            synchronized (f14967p) {
                try {
                    if (f14966o == null) {
                        f14966o = (Long) this.f16395e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f16394d) {
            C0919e4 c0919e4 = this.f16394d;
            long longValue = f14966o.longValue();
            c0919e4.e();
            C1367o4.a0((C1367o4) c0919e4.f10141l, longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public final void a() {
        int i5;
        switch (this.f14968h) {
            case 0:
                e();
                return;
            case 1:
                g();
                return;
            case 2:
                h();
                return;
            case 3:
                k();
                return;
            case 4:
                c();
                return;
            case 5:
                C0919e4 c0919e4 = this.f16394d;
                c0919e4.e();
                C1367o4.j0((C1367o4) c0919e4.f10141l, 3);
                try {
                    i5 = true != ((Boolean) this.f16395e.invoke(null, this.f16391a.f13438a)).booleanValue() ? 1 : 2;
                    c0919e4.e();
                    C1367o4.j0((C1367o4) c0919e4.f10141l, i5);
                    return;
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e3;
                    }
                    return;
                }
            case 6:
                d();
                return;
            case 7:
                f();
                return;
            case 8:
                i5 = true != ((Boolean) this.f16395e.invoke(null, this.f16391a.f13438a)).booleanValue() ? 1 : 2;
                C0919e4 c0919e42 = this.f16394d;
                c0919e42.e();
                C1367o4.m0((C1367o4) c0919e42.f10141l, i5);
                return;
            case 9:
                C0919e4 c0919e43 = this.f16394d;
                c0919e43.e();
                C1367o4.E((C1367o4) c0919e43.f10141l, -1L);
                long longValue = ((Long) this.f16395e.invoke(null, this.f16391a.f13438a)).longValue();
                c0919e43.e();
                C1367o4.E((C1367o4) c0919e43.f10141l, longValue);
                return;
            case 10:
                i();
                return;
            case 11:
                C0919e4 c0919e44 = this.f16394d;
                try {
                    i5 = true != ((Boolean) this.f16395e.invoke(null, this.f16391a.f13438a)).booleanValue() ? 1 : 2;
                    c0919e44.e();
                    C1367o4.o0((C1367o4) c0919e44.f10141l, i5);
                    return;
                } catch (InvocationTargetException unused) {
                    c0919e44.e();
                    C1367o4.o0((C1367o4) c0919e44.f10141l, 3);
                    return;
                }
            case 12:
                j();
                return;
            default:
                C0919e4 c0919e45 = this.f16394d;
                c0919e45.e();
                C1367o4.p0((C1367o4) c0919e45.f10141l, 3);
                boolean booleanValue = ((Boolean) this.f16395e.invoke(null, this.f16391a.f13438a)).booleanValue();
                synchronized (this.f16394d) {
                    try {
                        if (booleanValue) {
                            C0919e4 c0919e46 = this.f16394d;
                            c0919e46.e();
                            C1367o4.p0((C1367o4) c0919e46.f10141l, 2);
                        } else {
                            C0919e4 c0919e47 = this.f16394d;
                            c0919e47.e();
                            C1367o4.p0((C1367o4) c0919e47.f10141l, 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5
    public void b() {
        switch (this.f14968h) {
            case 7:
                C0965f5 c0965f5 = this.f16391a;
                if (!c0965f5.f13452q) {
                    if (c0965f5.f13449n) {
                        l();
                        break;
                    }
                } else {
                    super.b();
                    break;
                }
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1817y5, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.f14968h) {
            case 7:
                b();
                return null;
            default:
                return super.call();
        }
    }

    public void l() {
        Future future;
        C0965f5 c0965f5 = this.f16391a;
        N2.b bVar = null;
        if (c0965f5.f13443g) {
            if (c0965f5.f == null && (future = c0965f5.f13444h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    c0965f5.f13444h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    c0965f5.f13444h.cancel(true);
                }
            }
            bVar = c0965f5.f;
        }
        if (bVar == null) {
            return;
        }
        try {
            N2.a f = bVar.f();
            String str = f.f3749a;
            char[] cArr = AbstractC1055h5.f13710a;
            if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(str);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                str = Base64.encodeToString(bArr, 11);
            }
            if (str != null) {
                synchronized (this.f16394d) {
                    C0919e4 c0919e4 = this.f16394d;
                    c0919e4.e();
                    C1367o4.w((C1367o4) c0919e4.f10141l, str);
                    C0919e4 c0919e42 = this.f16394d;
                    boolean z3 = f.f3750b;
                    c0919e42.e();
                    C1367o4.M0((C1367o4) c0919e42.f10141l, z3);
                    C0919e4 c0919e43 = this.f16394d;
                    c0919e43.e();
                    C1367o4.k0((C1367o4) c0919e43.f10141l);
                }
            }
        } catch (IOException unused3) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413p5(C0965f5 c0965f5, C0919e4 c0919e4, int i5, int i6) {
        super(c0965f5, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c0919e4, i5, 44);
        this.f14968h = i6;
        switch (i6) {
            case 1:
                super(c0965f5, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c0919e4, i5, 22);
                break;
            case 2:
                super(c0965f5, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c0919e4, i5, 1);
                break;
            case 3:
            case 7:
            case 8:
            case 11:
            default:
                break;
            case 4:
                super(c0965f5, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", c0919e4, i5, 89);
                break;
            case 5:
                super(c0965f5, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c0919e4, i5, 49);
                break;
            case 6:
                super(c0965f5, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c0919e4, i5, 5);
                break;
            case 9:
                super(c0965f5, "P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", c0919e4, i5, 12);
                break;
            case 10:
                super(c0965f5, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", c0919e4, i5, 3);
                break;
            case 12:
                super(c0965f5, "SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", c0919e4, i5, 51);
                break;
            case 13:
                super(c0965f5, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c0919e4, i5, 48);
                break;
        }
    }
}
