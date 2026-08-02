package Ve;

import Ae.C2399j;
import R2.InterfaceC3917k;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public final Nh f30432a;

    /* renamed from: b, reason: collision with root package name */
    public final Te f30433b;

    /* renamed from: c, reason: collision with root package name */
    public final Regex f30434c;

    /* renamed from: d, reason: collision with root package name */
    public String f30435d;

    /* renamed from: e, reason: collision with root package name */
    public String f30436e;

    public Y4(Nh securePreferences, Te metricFacade) {
        Intrinsics.checkNotNullParameter(securePreferences, "securePreferences");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        this.f30432a = securePreferences;
        this.f30433b = metricFacade;
        this.f30434c = new Regex("X.*?=.*?(?=[,;])");
        this.f30436e = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Method method, kotlin.coroutines.jvm.internal.c cVar) {
        C4606s4 c4606s4;
        int i11;
        Iterator it;
        int i12;
        Y4 y42;
        Object obj;
        if (cVar instanceof C4606s4) {
            c4606s4 = (C4606s4) cVar;
            int i13 = c4606s4.f32010i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4606s4.f32010i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4606s4.f32008g;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4606s4.f32010i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    int i14 = (method != null ? (InterfaceC4574r1) method.getAnnotation(InterfaceC4574r1.class) : null) != null ? 1 : 0;
                    it = list.iterator();
                    i12 = i14;
                    y42 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = c4606s4.f32007f;
                    it = c4606s4.f32006e;
                    y42 = c4606s4.f32005d;
                    Sc.s.b(obj2);
                }
                while (it.hasNext()) {
                    MatchResult matchResult = (MatchResult) it.next();
                    Object obj4 = C4718w1.f32333a;
                    Object obj5 = C4172d2.f30846a;
                    Object obj6 = (i12 == 0 || !kotlin.text.h.t(matchResult.getValue(), "X-Sdk-Refresh-Data", false)) ? (i12 == 0 || !kotlin.text.h.t(matchResult.getValue(), "X-Sdk-Id-Key", false)) ? kotlin.text.h.t(matchResult.getValue(), "X-Geo-Sticky", false) ? R0.f29812a : kotlin.text.h.t(matchResult.getValue(), "X-SP-D-M", false) ? C4374k3.f31415a : null : obj4 : obj5;
                    if (obj6 != null) {
                        String value = matchResult.getValue();
                        c4606s4.f32005d = y42;
                        c4606s4.f32006e = it;
                        c4606s4.f32007f = i12;
                        c4606s4.f32010i = 1;
                        y42.getClass();
                        if (obj6 instanceof C4374k3) {
                            if (((C4374k3) obj6).equals(C4374k3.f31415a)) {
                                if (value == null || kotlin.text.h.K(value)) {
                                    value = null;
                                }
                                if (value == null) {
                                    value = y42.f30436e;
                                }
                                y42.f30436e = value;
                            }
                        } else if (obj6 instanceof R0) {
                            if (((R0) obj6).equals(R0.f29812a)) {
                                y42.f30435d = value;
                            }
                        } else if (obj6 instanceof G2) {
                            G2 g22 = (G2) obj6;
                            boolean equals = g22.equals(obj5);
                            Nh nh2 = y42.f30432a;
                            if (equals) {
                                Nh.f29559a.getClass();
                                C4593rk c4593rk = (C4593rk) nh2;
                                obj = W2.j.a((InterfaceC3917k) AbstractC4255g.f31066c.getValue(((C4571qq) c4593rk.f31982c.getValue()).f31921a, AbstractC4255g.f31064a[0]), new C4535pj(value, c4593rk, C4302hh.f31194b, null), c4606s4);
                                Object obj7 = Wc.a.COROUTINE_SUSPENDED;
                                if (obj != obj7) {
                                    obj = Unit.f71690a;
                                }
                                if (obj != obj7) {
                                    obj = Unit.f71690a;
                                }
                                if (obj != obj7) {
                                    obj = Unit.f71690a;
                                }
                            } else if (g22.equals(obj4)) {
                                Nh.f29559a.getClass();
                                C4593rk c4593rk2 = (C4593rk) nh2;
                                obj = W2.j.a((InterfaceC3917k) AbstractC4255g.f31066c.getValue(((C4571qq) c4593rk2.f31982c.getValue()).f31921a, AbstractC4255g.f31064a[0]), new C4535pj(value, c4593rk2, C4302hh.f31195c, null), c4606s4);
                                Object obj8 = Wc.a.COROUTINE_SUSPENDED;
                                if (obj != obj8) {
                                    obj = Unit.f71690a;
                                }
                                if (obj != obj8) {
                                    obj = Unit.f71690a;
                                }
                                if (obj != obj8) {
                                    obj = Unit.f71690a;
                                }
                            } else {
                                obj = Unit.f71690a;
                            }
                            if (obj != Wc.a.COROUTINE_SUSPENDED) {
                                obj = Unit.f71690a;
                            }
                            if (obj != obj3) {
                                return obj3;
                            }
                        }
                        obj = Unit.f71690a;
                        if (obj != obj3) {
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        c4606s4 = new C4606s4(this, cVar);
        Object obj22 = c4606s4.f32008g;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4606s4.f32010i;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        N3 n32;
        Wc.a aVar;
        int i11;
        kotlin.jvm.internal.M m11;
        kotlin.jvm.internal.M m12;
        Y4 y42;
        kotlin.jvm.internal.M m13;
        T t2;
        Y4 y43;
        kotlin.jvm.internal.M m14;
        Object w11;
        kotlin.jvm.internal.M m15;
        kotlin.jvm.internal.M m16;
        kotlin.jvm.internal.M m17;
        Iterator it;
        Iterator it2;
        int i12;
        T t11;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (cVar instanceof N3) {
            n32 = (N3) cVar;
            int i13 = n32.f29524j;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                n32.f29524j = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = n32.f29522h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = n32.f29524j;
                int i14 = 0;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    m11 = new kotlin.jvm.internal.M();
                    m12 = new kotlin.jvm.internal.M();
                    if (z11) {
                        Nh.f29559a.getClass();
                        f.a key = C4302hh.f31194b;
                        n32.f29518d = this;
                        n32.f29519e = m11;
                        n32.f29520f = m12;
                        n32.f29521g = m11;
                        n32.f29524j = 1;
                        C4571qq c4571qq = (C4571qq) ((C4593rk) this.f30432a).f31982c.getValue();
                        c4571qq.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Object w12 = C2399j.w(new Ae.C(new C4396kp(((InterfaceC3917k) AbstractC4255g.f31066c.getValue(c4571qq.f31921a, AbstractC4255g.f31064a[0])).getData(), key), new Rp()), n32);
                        if (w12 != aVar) {
                            m13 = m12;
                            t2 = w12;
                            y43 = this;
                            m14 = m11;
                        }
                        return aVar;
                    }
                    y42 = this;
                    StringBuilder sb2 = new StringBuilder();
                    ArrayList m02 = C7714v.m0((String) m11.f71787a, (String) m12.f71787a, y42.f30436e, y42.f30435d);
                    ArrayList arrayList = new ArrayList();
                    it = m02.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                        }
                        i14 = i12;
                    }
                } else if (i11 == 1) {
                    m11 = n32.f29521g;
                    m13 = n32.f29520f;
                    m14 = n32.f29519e;
                    y43 = n32.f29518d;
                    Sc.s.b(obj);
                    t2 = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m15 = n32.f29521g;
                    m16 = n32.f29520f;
                    m17 = n32.f29519e;
                    y42 = n32.f29518d;
                    Sc.s.b(obj);
                    t11 = obj;
                    m15.f71787a = t11;
                    charSequence = (CharSequence) m17.f71787a;
                    if ((charSequence != null || kotlin.text.h.K(charSequence)) && ((charSequence2 = (CharSequence) m16.f71787a) == null || kotlin.text.h.K(charSequence2))) {
                        y42.f30433b.b(new Bi(S.ST_GET_FAIL_REFRESH, Ur.AUTH_VIEW, Pe.ST_GET_FAIL, null, null, null, null, 120));
                    } else {
                        y42.f30433b.b(new Bi(S.ST_GET_GOOD_REFRESH, Ur.AUTH_VIEW, Pe.ST_GET_GOOD, null, null, null, null, 120));
                    }
                    m12 = m16;
                    m11 = m17;
                    StringBuilder sb22 = new StringBuilder();
                    ArrayList m022 = C7714v.m0((String) m11.f71787a, (String) m12.f71787a, y42.f30436e, y42.f30435d);
                    ArrayList arrayList2 = new ArrayList();
                    it = m022.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str = (String) next;
                        if (str != null && !str.equals("")) {
                            arrayList2.add(next);
                        }
                    }
                    it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            String sb3 = sb22.toString();
                            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                            return String.valueOf(kotlin.text.h.K(sb3) ? null : sb3);
                        }
                        Object next2 = it2.next();
                        i12 = i14 + 1;
                        if (i14 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        String str2 = (String) next2;
                        if (i14 != arrayList2.size() - 1) {
                            sb22.append(str2);
                            sb22.append("; ");
                        } else {
                            sb22.append(str2);
                        }
                        i14 = i12;
                    }
                }
                m11.f71787a = t2;
                Nh nh2 = y43.f30432a;
                Nh.f29559a.getClass();
                f.a key2 = C4302hh.f31195c;
                n32.f29518d = y43;
                n32.f29519e = m14;
                n32.f29520f = m13;
                n32.f29521g = m13;
                n32.f29524j = 2;
                C4571qq c4571qq2 = (C4571qq) ((C4593rk) nh2).f31982c.getValue();
                c4571qq2.getClass();
                Intrinsics.checkNotNullParameter(key2, "key");
                w11 = C2399j.w(new Ae.C(new C4396kp(((InterfaceC3917k) AbstractC4255g.f31066c.getValue(c4571qq2.f31921a, AbstractC4255g.f31064a[0])).getData(), key2), new Rp()), n32);
                if (w11 != aVar) {
                    m15 = m13;
                    m16 = m15;
                    m17 = m14;
                    y42 = y43;
                    t11 = w11;
                    m15.f71787a = t11;
                    charSequence = (CharSequence) m17.f71787a;
                    if (charSequence != null) {
                    }
                    y42.f30433b.b(new Bi(S.ST_GET_FAIL_REFRESH, Ur.AUTH_VIEW, Pe.ST_GET_FAIL, null, null, null, null, 120));
                    m12 = m16;
                    m11 = m17;
                    StringBuilder sb222 = new StringBuilder();
                    ArrayList m0222 = C7714v.m0((String) m11.f71787a, (String) m12.f71787a, y42.f30436e, y42.f30435d);
                    ArrayList arrayList22 = new ArrayList();
                    it = m0222.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = arrayList22.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                        }
                        i14 = i12;
                    }
                }
                return aVar;
            }
        }
        n32 = new N3(this, cVar);
        Object obj2 = n32.f29522h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = n32.f29524j;
        int i142 = 0;
        if (i11 != 0) {
        }
        m11.f71787a = t2;
        Nh nh22 = y43.f30432a;
        Nh.f29559a.getClass();
        f.a key22 = C4302hh.f31195c;
        n32.f29518d = y43;
        n32.f29519e = m14;
        n32.f29520f = m13;
        n32.f29521g = m13;
        n32.f29524j = 2;
        C4571qq c4571qq22 = (C4571qq) ((C4593rk) nh22).f31982c.getValue();
        c4571qq22.getClass();
        Intrinsics.checkNotNullParameter(key22, "key");
        w11 = C2399j.w(new Ae.C(new C4396kp(((InterfaceC3917k) AbstractC4255g.f31066c.getValue(c4571qq22.f31921a, AbstractC4255g.f31064a[0])).getData(), key22), new Rp()), n32);
        if (w11 != aVar) {
        }
        return aVar;
    }
}
