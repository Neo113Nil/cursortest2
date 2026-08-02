package P1;

import De.C2862e;
import P1.C3805l;
import P1.Z;
import Sc.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.X0;

/* renamed from: P1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3817y {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b f21599c = new b(xe.J.f105405n0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3805l f21600a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C2862e f21601b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {153}, m = "invokeSuspend")
    /* renamed from: P1.y$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21602d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3804k f21603e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3804k c3804k, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21603e = c3804k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f21603e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21602d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f21602d = 1;
                if (this.f21603e.m(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: P1.y$b */
    public static final class b extends kotlin.coroutines.a implements xe.J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        }
    }

    public C3817y(C3805l c3805l) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        this.f21600a = c3805l;
        CoroutineContext plus = f21599c.plus(S1.k.a()).plus(gVar);
        B0.a key = B0.f105374o0;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        this.f21601b = xe.N.a(plus.plus(X0.a(null)));
    }

    public final Z a(@NotNull W w11, @NotNull C3796c c3796c, @NotNull Function1<? super Z.b, Unit> function1, @NotNull Function1<? super W, ? extends Object> function12) {
        Pair pair;
        S1.p pVar;
        O1.b bVar;
        Object b11;
        O1.c cVar;
        S1.p pVar2;
        O1.b bVar2;
        Object a11;
        O1.c cVar2;
        F f7;
        F f11;
        F f12;
        F f13;
        if (!(w11.b() instanceof C3816x)) {
            return null;
        }
        List<InterfaceC3808o> e11 = ((C3816x) w11.b()).e();
        F e12 = w11.e();
        int c11 = w11.c();
        ArrayList arrayList = new ArrayList(e11.size());
        int size = e11.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC3808o interfaceC3808o = e11.get(i11);
            InterfaceC3808o interfaceC3808o2 = interfaceC3808o;
            if (Intrinsics.d(interfaceC3808o2.getWeight(), e12) && interfaceC3808o2.b() == c11) {
                arrayList.add(interfaceC3808o);
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(e11.size());
            int size2 = e11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                InterfaceC3808o interfaceC3808o3 = e11.get(i12);
                if (interfaceC3808o3.b() == c11) {
                    arrayList2.add(interfaceC3808o3);
                }
            }
            if (!arrayList2.isEmpty()) {
                e11 = arrayList2;
            }
            List<InterfaceC3808o> list = e11;
            f7 = F.f21504b;
            if (e12.compareTo(f7) < 0) {
                int size3 = list.size();
                int i13 = 0;
                F f14 = null;
                F f15 = null;
                while (true) {
                    if (i13 >= size3) {
                        break;
                    }
                    F weight = list.get(i13).getWeight();
                    if (weight.compareTo(e12) >= 0) {
                        if (weight.compareTo(e12) <= 0) {
                            f14 = weight;
                            f15 = f14;
                            break;
                        }
                        if (f15 == null || weight.compareTo(f15) < 0) {
                            f15 = weight;
                        }
                    } else if (f14 == null || weight.compareTo(f14) > 0) {
                        f14 = weight;
                    }
                    i13++;
                }
                if (f14 == null) {
                    f14 = f15;
                }
                arrayList = new ArrayList(list.size());
                int size4 = list.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    InterfaceC3808o interfaceC3808o4 = list.get(i14);
                    if (Intrinsics.d(interfaceC3808o4.getWeight(), f14)) {
                        arrayList.add(interfaceC3808o4);
                    }
                }
            } else {
                f11 = F.f21505c;
                if (e12.compareTo(f11) > 0) {
                    int size5 = list.size();
                    int i15 = 0;
                    F f16 = null;
                    F f17 = null;
                    while (true) {
                        if (i15 >= size5) {
                            break;
                        }
                        F weight2 = list.get(i15).getWeight();
                        if (weight2.compareTo(e12) >= 0) {
                            if (weight2.compareTo(e12) <= 0) {
                                f16 = weight2;
                                f17 = f16;
                                break;
                            }
                            if (f17 == null || weight2.compareTo(f17) < 0) {
                                f17 = weight2;
                            }
                        } else if (f16 == null || weight2.compareTo(f16) > 0) {
                            f16 = weight2;
                        }
                        i15++;
                    }
                    if (f17 != null) {
                        f16 = f17;
                    }
                    arrayList = new ArrayList(list.size());
                    int size6 = list.size();
                    for (int i16 = 0; i16 < size6; i16++) {
                        InterfaceC3808o interfaceC3808o5 = list.get(i16);
                        if (Intrinsics.d(interfaceC3808o5.getWeight(), f16)) {
                            arrayList.add(interfaceC3808o5);
                        }
                    }
                } else {
                    f12 = F.f21505c;
                    int size7 = list.size();
                    int i17 = 0;
                    F f18 = null;
                    F f19 = null;
                    while (true) {
                        if (i17 >= size7) {
                            break;
                        }
                        F weight3 = list.get(i17).getWeight();
                        if (f12 == null || weight3.compareTo(f12) <= 0) {
                            if (weight3.compareTo(e12) >= 0) {
                                if (weight3.compareTo(e12) <= 0) {
                                    f18 = weight3;
                                    f19 = f18;
                                    break;
                                }
                                if (f19 == null || weight3.compareTo(f19) < 0) {
                                    f19 = weight3;
                                }
                            } else if (f18 == null || weight3.compareTo(f18) > 0) {
                                f18 = weight3;
                            }
                        }
                        i17++;
                    }
                    if (f19 != null) {
                        f18 = f19;
                    }
                    arrayList = new ArrayList(list.size());
                    int size8 = list.size();
                    for (int i18 = 0; i18 < size8; i18++) {
                        InterfaceC3808o interfaceC3808o6 = list.get(i18);
                        if (Intrinsics.d(interfaceC3808o6.getWeight(), f18)) {
                            arrayList.add(interfaceC3808o6);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        f13 = F.f21505c;
                        int size9 = list.size();
                        int i19 = 0;
                        F f21 = null;
                        F f22 = null;
                        while (true) {
                            if (i19 >= size9) {
                                break;
                            }
                            F weight4 = list.get(i19).getWeight();
                            if (f13 == null || weight4.compareTo(f13) >= 0) {
                                if (weight4.compareTo(e12) >= 0) {
                                    if (weight4.compareTo(e12) <= 0) {
                                        f21 = weight4;
                                        f22 = f21;
                                        break;
                                    }
                                    if (f22 == null || weight4.compareTo(f22) < 0) {
                                        f22 = weight4;
                                    }
                                } else if (f21 == null || weight4.compareTo(f21) > 0) {
                                    f21 = weight4;
                                }
                            }
                            i19++;
                        }
                        if (f22 != null) {
                            f21 = f22;
                        }
                        arrayList = new ArrayList(list.size());
                        int size10 = list.size();
                        for (int i21 = 0; i21 < size10; i21++) {
                            InterfaceC3808o interfaceC3808o7 = list.get(i21);
                            if (Intrinsics.d(interfaceC3808o7.getWeight(), f21)) {
                                arrayList.add(interfaceC3808o7);
                            }
                        }
                    }
                }
            }
        }
        C3805l c3805l = this.f21600a;
        int size11 = arrayList.size();
        int i22 = 0;
        ArrayList arrayList3 = null;
        while (true) {
            if (i22 >= size11) {
                pair = new Pair(arrayList3, ((r) function12).invoke(w11));
                break;
            }
            InterfaceC3808o interfaceC3808o8 = (InterfaceC3808o) arrayList.get(i22);
            int a12 = interfaceC3808o8.a();
            if (a12 == 0) {
                pVar = c3805l.f21576c;
                synchronized (pVar) {
                    try {
                        c3796c.getClass();
                        C3805l.b bVar3 = new C3805l.b(interfaceC3808o8, null);
                        bVar = c3805l.f21574a;
                        C3805l.a aVar = (C3805l.a) bVar.a(bVar3);
                        if (aVar == null) {
                            cVar = c3805l.f21575b;
                            aVar = (C3805l.a) cVar.a(bVar3);
                        }
                        if (aVar != null) {
                            b11 = aVar.b();
                        } else {
                            Unit unit = Unit.f71690a;
                            try {
                                b11 = c3796c.b(interfaceC3808o8);
                                C3805l.e(c3805l, interfaceC3808o8, c3796c, b11);
                            } catch (Exception e13) {
                                throw new IllegalStateException("Unable to load font " + interfaceC3808o8, e13);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (b11 == null) {
                    throw new IllegalStateException("Unable to load font " + interfaceC3808o8);
                }
                pair = new Pair(arrayList3, C.a(w11.d(), b11, interfaceC3808o8, w11.e(), w11.c()));
            } else if (a12 == 1) {
                pVar2 = c3805l.f21576c;
                synchronized (pVar2) {
                    try {
                        c3796c.getClass();
                        C3805l.b bVar4 = new C3805l.b(interfaceC3808o8, null);
                        bVar2 = c3805l.f21574a;
                        C3805l.a aVar2 = (C3805l.a) bVar2.a(bVar4);
                        if (aVar2 == null) {
                            cVar2 = c3805l.f21575b;
                            aVar2 = (C3805l.a) cVar2.a(bVar4);
                        }
                        if (aVar2 != null) {
                            a11 = aVar2.b();
                        } else {
                            Unit unit2 = Unit.f71690a;
                            try {
                                r.Companion companion = Sc.r.INSTANCE;
                                a11 = c3796c.b(interfaceC3808o8);
                            } catch (Throwable th3) {
                                r.Companion companion2 = Sc.r.INSTANCE;
                                a11 = Sc.s.a(th3);
                            }
                            if (a11 instanceof r.b) {
                                a11 = null;
                            }
                            C3805l.e(c3805l, interfaceC3808o8, c3796c, a11);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (a11 != null) {
                    pair = new Pair(arrayList3, C.a(w11.d(), a11, interfaceC3808o8, w11.e(), w11.c()));
                    break;
                }
                i22++;
            } else {
                if (a12 != 2) {
                    throw new IllegalStateException("Unknown font type " + interfaceC3808o8);
                }
                C3805l.a d11 = c3805l.d(interfaceC3808o8, c3796c);
                if (d11 != null) {
                    if (d11.b() != null && d11.b() != null) {
                        pair = new Pair(arrayList3, C.a(w11.d(), d11.b(), interfaceC3808o8, w11.e(), w11.c()));
                        break;
                    }
                } else if (arrayList3 == null) {
                    arrayList3 = C7714v.m0(interfaceC3808o8);
                } else {
                    arrayList3.add(interfaceC3808o8);
                }
                i22++;
            }
        }
        List list2 = (List) pair.a();
        Object b12 = pair.b();
        if (list2 == null) {
            return new Z.b(b12, true);
        }
        C3804k c3804k = new C3804k(list2, b12, w11, this.f21600a, function1, c3796c);
        C10727i.c(this.f21601b, null, xe.O.UNDISPATCHED, new a(c3804k, null), 1);
        return new Z.a(c3804k);
    }
}
