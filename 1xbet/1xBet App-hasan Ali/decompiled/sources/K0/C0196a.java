package K0;

import A0.o1;
import P.AbstractC0317t;
import P.AbstractC0329z;
import P.C0315s;
import P.C0326x0;
import P.EnumC0330z0;
import P.F0;
import P.H0;
import P.InterfaceC0298j;
import Q2.C0;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.RectF;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import h0.C1989c;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o4.AbstractC2227e;
import p4.C2268h;
import p4.InterfaceC2271k;
import p4.U;
import p4.b0;
import r.C2322H;
import r0.AbstractC2346c;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0196a implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2810k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2811l;

    public /* synthetic */ C0196a(int i, int i5, Object obj) {
        this.f2810k = i5;
        this.f2811l = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Type inference failed for: r0v59, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v34, types: [i4.e, kotlin.jvm.internal.m] */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean e3;
        char c5;
        char c6;
        Y.f fVar;
        Collection i02;
        char c7 = 7;
        Object obj3 = null;
        int i = 0;
        switch (this.f2810k) {
            case 0:
                C1989c x5 = i0.F.x((RectF) obj);
                C1989c x6 = i0.F.x((RectF) obj2);
                switch (((o1) this.f2811l).f547a) {
                    case 5:
                        e3 = x5.e(x6);
                        break;
                    default:
                        long a5 = x5.a();
                        float intBitsToFloat = Float.intBitsToFloat((int) (a5 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (a5 & 4294967295L));
                        e3 = (intBitsToFloat >= x6.f17193a) & (intBitsToFloat < x6.f17195c) & (intBitsToFloat2 >= x6.f17194b) & (intBitsToFloat2 < x6.f17196d);
                        break;
                }
                return Boolean.valueOf(e3);
            case 1:
                ((Integer) obj2).getClass();
                ((O3.s) this.f2811l).e(AbstractC0329z.B(7), (C0315s) obj);
                return W3.o.f6046a;
            case 2:
                ((Integer) obj).getClass();
                boolean z3 = obj2 instanceof InterfaceC0298j;
                C0 c02 = (C0) this.f2811l;
                if (z3) {
                    InterfaceC0298j interfaceC0298j = (InterfaceC0298j) obj2;
                    C2322H c2322h = (C2322H) c02.f4908h;
                    if (c2322h == null) {
                        int i5 = r.P.f18958a;
                        c2322h = new C2322H();
                        c02.f4908h = c2322h;
                    }
                    c2322h.i(interfaceC0298j);
                    ((R.e) c02.f).c(interfaceC0298j);
                }
                if (obj2 instanceof H0) {
                    c02.d((H0) obj2);
                }
                if (obj2 instanceof C0326x0) {
                    ((C0326x0) obj2).d();
                }
                return W3.o.f6046a;
            case 3:
                F0 f02 = (F0) this.f2811l;
                Set set = (Set) obj;
                synchronized (f02.f4291b) {
                    try {
                        if (((EnumC0330z0) f02.f4307t.getValue()).compareTo(EnumC0330z0.f4611o) >= 0) {
                            C2322H c2322h2 = f02.f4295g;
                            if (set instanceof R.h) {
                                C2322H c2322h3 = ((R.h) set).f5119k;
                                Object[] objArr = c2322h3.f18934b;
                                long[] jArr = c2322h3.f18933a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j5 = jArr[i6];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                            for (int i8 = i; i8 < i7; i8++) {
                                                if ((j5 & 255) < 128) {
                                                    Object obj4 = objArr[(i6 << 3) + i8];
                                                    if (!(obj4 instanceof Z.v) || ((Z.v) obj4).b(1)) {
                                                        c2322h2.a(obj4);
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i7 != 8) {
                                            }
                                        }
                                        if (i6 != length) {
                                            i6++;
                                            i = 0;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof Z.v) || ((Z.v) obj5).b(1)) {
                                        c2322h2.a(obj5);
                                    }
                                }
                            }
                            obj3 = f02.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((C2268h) obj3).resumeWith(W3.o.f6046a);
                }
                return W3.o.f6046a;
            case 4:
                Set set2 = (Set) obj;
                if (!(set2 instanceof R.h)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if ((obj6 instanceof Z.v) && !((Z.v) obj6).b(4)) {
                            }
                            ((r4.c) this.f2811l).q(set2);
                        }
                    }
                    return W3.o.f6046a;
                }
                C2322H c2322h4 = ((R.h) set2).f5119k;
                Object[] objArr2 = c2322h4.f18934b;
                long[] jArr2 = c2322h4.f18933a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j6 = jArr2[i9];
                        if ((((~j6) << c7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j6 & 255) < 128) {
                                    Object obj7 = objArr2[(i9 << 3) + i11];
                                    c6 = c7;
                                    if ((obj7 instanceof Z.v) && !((Z.v) obj7).b(4)) {
                                    }
                                } else {
                                    c6 = c7;
                                }
                                j6 >>= 8;
                                i11++;
                                c7 = c6;
                            }
                            c5 = c7;
                            if (i10 != 8) {
                            }
                        } else {
                            c5 = c7;
                        }
                        if (i9 != length2) {
                            i9++;
                            c7 = c5;
                        }
                    }
                }
                return W3.o.f6046a;
            case 5:
                ((Integer) obj2).getClass();
                N4.b.B((AquaMatchMoment) this.f2811l, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC0444a.Q((InterfaceC2015a) this.f2811l, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0444a.J((Context) this.f2811l, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 8:
                ((Integer) obj2).getClass();
                V3.b.a((X.d) this.f2811l, (C0315s) obj, AbstractC0329z.B(439));
                return W3.o.f6046a;
            case 9:
                Y.b bVar = (Y.b) obj;
                List list = (List) ((kotlin.jvm.internal.m) this.f2811l).invoke(bVar, obj2);
                int size = list.size();
                while (i < size) {
                    Object obj8 = list.get(i);
                    if (obj8 != null && (fVar = bVar.f6100l) != null && !fVar.c(obj8)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj8).toString());
                    }
                    i++;
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 10:
                Collection collection = (Set) obj;
                while (true) {
                    Z.s sVar = (Z.s) this.f2811l;
                    AtomicReference atomicReference = sVar.f6231b;
                    Object obj9 = atomicReference.get();
                    if (obj9 == null) {
                        i02 = collection;
                    } else if (obj9 instanceof Set) {
                        i02 = X3.n.O(obj9, collection);
                    } else {
                        if (!(obj9 instanceof List)) {
                            AbstractC0317t.d("Unexpected notification");
                            throw new D2.e();
                        }
                        i02 = X3.m.i0((Collection) obj9, AbstractC2346c.A(collection));
                    }
                    while (!atomicReference.compareAndSet(obj9, i02)) {
                        if (atomicReference.get() != obj9) {
                            break;
                        }
                    }
                    if (sVar.c()) {
                        sVar.f6230a.c(new O3.l(9, sVar));
                    }
                    return W3.o.f6046a;
                    break;
                }
            case 11:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.l.f("$this$DelimitedRangesSequence", charSequence);
                int G02 = AbstractC2227e.G0(charSequence, (char[]) this.f2811l, intValue, false);
                if (G02 < 0) {
                    return null;
                }
                return new W3.h(Integer.valueOf(G02), 1);
            default:
                int intValue2 = ((Integer) obj).intValue();
                a4.f fVar2 = (a4.f) obj2;
                a4.g key = fVar2.getKey();
                Object l5 = ((t4.t) this.f2811l).f19631l.l(key);
                if (key != p4.r.f18819l) {
                    if (fVar2 != l5) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    Object obj10 = (U) l5;
                    Object obj11 = (U) fVar2;
                    while (obj11 != null) {
                        if (obj11 != obj10 && (obj11 instanceof u4.p)) {
                            InterfaceC2271k interfaceC2271k = (InterfaceC2271k) b0.f18781l.get((u4.p) obj11);
                            obj11 = interfaceC2271k != null ? interfaceC2271k.getParent() : null;
                        } else {
                            obj3 = obj11;
                            if (obj3 == obj10) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj10 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj10) {
                    }
                }
                return Integer.valueOf(intValue2);
        }
    }

    public /* synthetic */ C0196a(int i, Object obj) {
        this.f2810k = i;
        this.f2811l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0196a(i4.e eVar) {
        this.f2810k = 9;
        this.f2811l = (kotlin.jvm.internal.m) eVar;
    }
}
