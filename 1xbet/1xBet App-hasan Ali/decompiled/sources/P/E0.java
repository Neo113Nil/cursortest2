package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import r.C2322H;

/* loaded from: classes.dex */
public final class E0 extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public List f4273k;

    /* renamed from: l, reason: collision with root package name */
    public List f4274l;

    /* renamed from: m, reason: collision with root package name */
    public List f4275m;

    /* renamed from: n, reason: collision with root package name */
    public C2322H f4276n;

    /* renamed from: o, reason: collision with root package name */
    public C2322H f4277o;

    /* renamed from: p, reason: collision with root package name */
    public C2322H f4278p;

    /* renamed from: q, reason: collision with root package name */
    public Set f4279q;

    /* renamed from: r, reason: collision with root package name */
    public C2322H f4280r;

    /* renamed from: s, reason: collision with root package name */
    public int f4281s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ InterfaceC0281a0 f4282t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ F0 f4283u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(F0 f02, a4.c cVar) {
        super(3, cVar);
        this.f4283u = f02;
    }

    public static final void f(F0 f02, List list, List list2, List list3, C2322H c2322h, C2322H c2322h2, C2322H c2322h3, C2322H c2322h4) {
        char c5;
        long j5;
        long j6;
        synchronized (f02.f4291b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C0327y c0327y = (C0327y) list3.get(i);
                    c0327y.a();
                    f02.J(c0327y);
                }
                list3.clear();
                Object[] objArr = c2322h.f18934b;
                long[] jArr = c2322h.f18933a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    j5 = 255;
                    while (true) {
                        long j7 = jArr[i5];
                        c5 = 7;
                        j6 = -9187201950435737472L;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j7 & 255) < 128) {
                                    C0327y c0327y2 = (C0327y) objArr[(i5 << 3) + i7];
                                    c0327y2.a();
                                    f02.J(c0327y2);
                                }
                                j7 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else {
                    c5 = 7;
                    j5 = 255;
                    j6 = -9187201950435737472L;
                }
                c2322h.b();
                Object[] objArr2 = c2322h2.f18934b;
                long[] jArr2 = c2322h2.f18933a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr2[i8];
                        if ((((~j8) << c5) & j8 & j6) != j6) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j8 & j5) < 128) {
                                    ((C0327y) objArr2[(i8 << 3) + i10]).g();
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length2) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                c2322h2.b();
                c2322h3.b();
                Object[] objArr3 = c2322h4.f18934b;
                long[] jArr3 = c2322h4.f18933a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j9 = jArr3[i11];
                        if ((((~j9) << c5) & j9 & j6) != j6) {
                            int i12 = 8 - ((~(i11 - length3)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j9 & j5) < 128) {
                                    C0327y c0327y3 = (C0327y) objArr3[(i11 << 3) + i13];
                                    c0327y3.a();
                                    f02.J(c0327y3);
                                }
                                j9 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length3) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                c2322h4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void h(List list, F0 f02) {
        list.clear();
        synchronized (f02.f4291b) {
            try {
                ArrayList arrayList = f02.f4297j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC0287d0) arrayList.get(i));
                }
                f02.f4297j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        E0 e02 = new E0(this.f4283u, (a4.c) obj3);
        e02.f4282t = (InterfaceC0281a0) obj2;
        e02.invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e7 -> B:6:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00f5 -> B:7:0x008c). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0281a0 interfaceC0281a0;
        C2322H c2322h;
        C2322H c2322h2;
        List list;
        Set set;
        List list2;
        C2322H c2322h3;
        List list3;
        C2322H c2322h4;
        List list4;
        C2322H c2322h5;
        List list5;
        C2322H c2322h6;
        F0 f02;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4281s;
        if (i == 0) {
            G4.l.N(obj);
            interfaceC0281a0 = this.f4282t;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i5 = r.P.f18958a;
            c2322h = new C2322H();
            C2322H c2322h7 = new C2322H();
            C2322H c2322h8 = new C2322H();
            R.h hVar = new R.h(c2322h8);
            c2322h2 = new C2322H();
            list = arrayList;
            set = hVar;
            list2 = arrayList2;
            c2322h3 = c2322h8;
            list3 = arrayList3;
            c2322h4 = c2322h7;
            synchronized (this.f4283u.f4291b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2322H c2322h9 = this.f4280r;
                set = this.f4279q;
                c2322h3 = this.f4278p;
                c2322h4 = this.f4277o;
                c2322h = this.f4276n;
                list3 = this.f4275m;
                list2 = this.f4274l;
                list = this.f4273k;
                InterfaceC0281a0 interfaceC0281a02 = this.f4282t;
                G4.l.N(obj);
                c2322h2 = c2322h9;
                interfaceC0281a0 = interfaceC0281a02;
                F0.s(this.f4283u);
                synchronized (this.f4283u.f4291b) {
                }
                F0 f03 = this.f4283u;
                this.f4282t = interfaceC0281a0;
                this.f4273k = list;
                this.f4274l = list2;
                this.f4275m = list3;
                this.f4276n = c2322h;
                this.f4277o = c2322h4;
                this.f4278p = c2322h3;
                this.f4279q = set;
                this.f4280r = c2322h2;
                this.f4281s = 1;
                if (F0.r(f03, this) != enumC0510a) {
                    List list6 = list;
                    c2322h5 = c2322h;
                    c2322h6 = c2322h2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    C2322H c2322h10 = c2322h4;
                    C2322H c2322h11 = c2322h3;
                    f02 = this.f4283u;
                    s4.M m5 = F0.f4288x;
                    if (f02.I()) {
                        List list7 = list4;
                        c2322h2 = c2322h6;
                        c2322h = c2322h5;
                        list = list5;
                        list3 = list7;
                        c2322h3 = c2322h11;
                        c2322h4 = c2322h10;
                        set = set2;
                        synchronized (this.f4283u.f4291b) {
                        }
                    } else {
                        D0 d02 = new D0(this.f4283u, c2322h11, c2322h6, list5, list2, c2322h5, list4, c2322h10, set2);
                        this.f4282t = interfaceC0281a0;
                        this.f4273k = list5;
                        this.f4274l = list2;
                        this.f4275m = list4;
                        this.f4276n = c2322h5;
                        this.f4277o = c2322h10;
                        this.f4278p = c2322h11;
                        this.f4279q = set2;
                        this.f4280r = c2322h6;
                        this.f4281s = 2;
                        if (interfaceC0281a0.n(d02, this) != enumC0510a) {
                            List list8 = list4;
                            c2322h2 = c2322h6;
                            c2322h = c2322h5;
                            list = list5;
                            list3 = list8;
                            c2322h3 = c2322h11;
                            c2322h4 = c2322h10;
                            set = set2;
                            F0.s(this.f4283u);
                            synchronized (this.f4283u.f4291b) {
                            }
                        }
                    }
                }
                return enumC0510a;
            }
            C2322H c2322h12 = this.f4280r;
            set = this.f4279q;
            c2322h3 = this.f4278p;
            c2322h4 = this.f4277o;
            C2322H c2322h13 = this.f4276n;
            List list9 = this.f4275m;
            list2 = this.f4274l;
            List list10 = this.f4273k;
            InterfaceC0281a0 interfaceC0281a03 = this.f4282t;
            G4.l.N(obj);
            c2322h6 = c2322h12;
            interfaceC0281a0 = interfaceC0281a03;
            list4 = list9;
            list5 = list10;
            c2322h5 = c2322h13;
            Set set22 = set;
            C2322H c2322h102 = c2322h4;
            C2322H c2322h112 = c2322h3;
            f02 = this.f4283u;
            s4.M m52 = F0.f4288x;
            if (f02.I()) {
            }
        }
    }
}
