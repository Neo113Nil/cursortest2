package s0;

import A0.C0040k0;
import G4.l;
import W0.q;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import kotlin.jvm.internal.m;
import p4.InterfaceC2280u;
import z0.AbstractC2749f;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2355d {

    /* renamed from: a, reason: collision with root package name */
    public C2358g f19158a;

    /* renamed from: b, reason: collision with root package name */
    public C2358g f19159b;

    /* renamed from: c, reason: collision with root package name */
    public m f19160c = new C0040k0(23, this);

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2280u f19161d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j5, long j6, AbstractC0542c abstractC0542c) {
        C2353b c2353b;
        int i;
        long j7;
        if (abstractC0542c instanceof C2353b) {
            c2353b = (C2353b) abstractC0542c;
            int i5 = c2353b.f19154m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2353b.f19154m = i5 - Integer.MIN_VALUE;
                C2353b c2353b2 = c2353b;
                Object obj = c2353b2.f19152k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2353b2.f19154m;
                if (i != 0) {
                    l.N(obj);
                    C2358g c2358g = this.f19158a;
                    C2358g c2358g2 = null;
                    j7 = 0;
                    if (((c2358g == null || !c2358g.f7175x) ? null : (C2358g) AbstractC2749f.k(c2358g)) == null) {
                        C2358g c2358g3 = this.f19159b;
                        if (c2358g3 != null) {
                            c2353b2.f19154m = 1;
                            obj = c2358g3.G(j5, j6, c2353b2);
                        }
                    } else {
                        C2358g c2358g4 = this.f19158a;
                        if (c2358g4 != null && c2358g4.f7175x) {
                            c2358g2 = (C2358g) AbstractC2749f.k(c2358g4);
                        }
                        if (c2358g2 != null) {
                            c2353b2.f19154m = 2;
                            obj = c2358g2.G(j5, j6, c2353b2);
                        } else {
                            j7 = 0;
                        }
                    }
                } else if (i == 1) {
                    l.N(obj);
                    j7 = ((q) obj).f6024a;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l.N(obj);
                    j7 = ((q) obj).f6024a;
                }
                return new q(j7);
            }
        }
        c2353b = new C2353b(this, abstractC0542c);
        C2353b c2353b22 = c2353b;
        Object obj2 = c2353b22.f19152k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2353b22.f19154m;
        if (i != 0) {
        }
        return new q(j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j5, AbstractC0542c abstractC0542c) {
        C2354c c2354c;
        int i;
        long j6;
        if (abstractC0542c instanceof C2354c) {
            c2354c = (C2354c) abstractC0542c;
            int i5 = c2354c.f19157m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2354c.f19157m = i5 - Integer.MIN_VALUE;
                Object obj = c2354c.f19155k;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2354c.f19157m;
                if (i != 0) {
                    l.N(obj);
                    C2358g c2358g = this.f19158a;
                    C2358g c2358g2 = null;
                    if (c2358g != null && c2358g.f7175x) {
                        c2358g2 = (C2358g) AbstractC2749f.k(c2358g);
                    }
                    if (c2358g2 == null) {
                        j6 = 0;
                        return new q(j6);
                    }
                    c2354c.f19157m = 1;
                    obj = c2358g2.L(j5, c2354c);
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l.N(obj);
                }
                j6 = ((q) obj).f6024a;
                return new q(j6);
            }
        }
        c2354c = new C2354c(this, abstractC0542c);
        Object obj2 = c2354c.f19155k;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2354c.f19157m;
        if (i != 0) {
        }
        j6 = ((q) obj2).f6024a;
        return new q(j6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a, kotlin.jvm.internal.m] */
    public final InterfaceC2280u c() {
        InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f19160c.invoke();
        if (interfaceC2280u != null) {
            return interfaceC2280u;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
