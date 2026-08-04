package D3;

import A1.X;
import A1.x0;
import A5.s;
import A5.y;
import C1.C0101g;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p098n4.AbstractC0933f;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.N;
import v4.t;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1726e;

    public /* synthetic */ j(Object obj, String str, Object obj2, boolean z4, int i7) {
        this.f1722a = i7;
        this.f1725d = obj;
        this.f1723b = str;
        this.f1726e = obj2;
        this.f1724c = z4;
    }

    public static HashMap j(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public static void n(p134s4.g gVar) {
        if (gVar.e() && gVar.c() && gVar.d()) {
            if (!gVar.d() || gVar.f16171b == 0) {
                throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static void p(p134s4.g gVar) {
        if (!gVar.f16176g.equals(v4.m.f17195a)) {
            if (gVar.f16176g.equals(t.f17205a)) {
                if (gVar.e()) {
                    if (!gVar.e()) {
                        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                    }
                    if (p115p6.c.j(gVar.f16172c)) {
                        if (gVar.c()) {
                            return;
                        }
                        if (gVar.c()) {
                            throw new IllegalArgumentException("Cannot get index end value if start has not been set");
                        }
                        if (p115p6.c.j(gVar.f16174e)) {
                            return;
                        }
                    }
                } else {
                    if (gVar.c()) {
                        return;
                    }
                    if (gVar.c()) {
                        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
                    }
                    if (p115p6.c.j(gVar.f16174e)) {
                        return;
                    }
                }
                throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
            }
            return;
        }
        if (gVar.e()) {
            if (!gVar.e()) {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
            v4.r rVar = gVar.f16172c;
            if (!gVar.e()) {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
            v4.c cVar = gVar.f16173d;
            v4.c cVar2 = v4.c.f17175b;
            if (cVar == null) {
                cVar = cVar2;
            }
            if (!D.m(cVar, cVar2) || !(rVar instanceof v)) {
                throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
        if (gVar.c()) {
            if (!gVar.c()) {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
            v4.r rVar2 = gVar.f16174e;
            if (!gVar.c()) {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
            v4.c cVar3 = gVar.f16175f;
            v4.c cVar4 = v4.c.f17176c;
            if (cVar3 == null) {
                cVar3 = cVar4;
            }
            if (!cVar3.equals(cVar4) || !(rVar2 instanceof v)) {
                throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
    }

    public void a(Object obj, String str) {
        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(3, false);
        ((android.support.v4.media.session.t) this.f1726e).f8078d = tVar;
        this.f1726e = tVar;
        tVar.f8077c = obj;
        tVar.f8076b = str;
    }

    public void b(String str, long j) {
        e(str, String.valueOf(j));
    }

    public void c(String str, boolean z4) {
        e(str, String.valueOf(z4));
    }

    public void d(AbstractC0933f abstractC0933f) {
        N n2 = N.f15392b;
        synchronized (n2.f15393a) {
            try {
                List arrayList = (List) n2.f15393a.get(abstractC0933f);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    n2.f15393a.put(abstractC0933f, arrayList);
                }
                arrayList.add(abstractC0933f);
                if (!abstractC0933f.e().c()) {
                    AbstractC0933f abstractC0933fA = abstractC0933f.a(p134s4.h.a(abstractC0933f.e().f16178a));
                    List arrayList2 = (List) n2.f15393a.get(abstractC0933fA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        n2.f15393a.put(abstractC0933fA, arrayList2);
                    }
                    arrayList2.add(abstractC0933f);
                }
                boolean z4 = true;
                abstractC0933f.f15420c = true;
                p120q4.k.c(!abstractC0933f.f15418a.get());
                if (abstractC0933f.f15419b != null) {
                    z4 = false;
                }
                p120q4.k.c(z4);
                abstractC0933f.f15419b = n2;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C0940m) this.f1723b).q(new p063i4.m(this, abstractC0933f, 1));
    }

    public void e(String str, String str2) {
        i iVar = new i(3, false);
        ((android.support.v4.media.session.t) this.f1726e).f8078d = iVar;
        this.f1726e = iVar;
        iVar.f8077c = str2;
        iVar.f8076b = str;
    }

    public boolean f(X x4, C0101g c0101g) {
        boolean zEquals = "audio/eac3-joc".equals(x4.f283C);
        int i7 = x4.f296P;
        if (zEquals && i7 == 16) {
            i7 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(p151v2.t.o(i7));
        int i8 = x4.f297Q;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return ((Spatializer) this.f1723b).canBeSpatialized((AudioAttributes) c0101g.a().f16597b, channelMask.build());
    }

    public j g(String str, String str2) {
        return h(str2, str != null ? new v(str, v4.j.f17190e) : v4.j.f17190e);
    }

    public j h(String str, v4.r rVar) {
        p120q4.l.b(str);
        if (!rVar.r() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        v4.c cVarB = str != null ? v4.c.b(str) : null;
        p134s4.g gVar = (p134s4.g) this.f1726e;
        if (gVar.c()) {
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        p120q4.k.c(rVar.r() || rVar.isEmpty());
        p120q4.k.c(!(rVar instanceof v4.o));
        p134s4.g gVarA = gVar.a();
        gVarA.f16174e = rVar;
        gVarA.f16175f = cVarB;
        n(gVarA);
        p(gVarA);
        p120q4.k.c(gVarA.f());
        return new j((C0940m) this.f1723b, (C0934g) this.f1725d, gVarA, this.f1724c);
    }

    public p134s4.h i() {
        return new p134s4.h((C0934g) this.f1725d, (p134s4.g) this.f1726e);
    }

    public void k(AbstractC0933f abstractC0933f) {
        N n2 = N.f15392b;
        synchronized (n2.f15393a) {
            try {
                List list = (List) n2.f15393a.get(abstractC0933f);
                if (list != null && !list.isEmpty()) {
                    if (abstractC0933f.e().c()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            AbstractC0933f abstractC0933f2 = (AbstractC0933f) list.get(size);
                            if (!hashSet.contains(abstractC0933f2.e())) {
                                hashSet.add(abstractC0933f2.e());
                                abstractC0933f2.h();
                            }
                        }
                    } else {
                        ((AbstractC0933f) list.get(0)).h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C0940m) this.f1723b).q(new p063i4.m(this, abstractC0933f, 0));
    }

    public j l(String str, String str2) {
        return m(str2, str != null ? new v(str, v4.j.f17190e) : v4.j.f17190e);
    }

    public j m(String str, v4.r rVar) {
        v4.c cVarB;
        p120q4.l.b(str);
        if (!rVar.r() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        }
        p134s4.g gVar = (p134s4.g) this.f1726e;
        if (gVar.e()) {
            throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
        }
        if (str == null) {
            cVarB = null;
        } else if (str.equals("[MIN_NAME]")) {
            cVarB = v4.c.f17175b;
        } else {
            cVarB = str.equals("[MAX_KEY]") ? v4.c.f17176c : v4.c.b(str);
        }
        p120q4.k.c(rVar.r() || rVar.isEmpty());
        p120q4.k.c(!(rVar instanceof v4.o));
        p134s4.g gVarA = gVar.a();
        gVarA.f16172c = rVar;
        gVarA.f16173d = cVarB;
        n(gVarA);
        p(gVarA);
        p120q4.k.c(gVarA.f());
        return new j((C0940m) this.f1723b, (C0934g) this.f1725d, gVarA, this.f1724c);
    }

    public void o() {
        if (this.f1724c) {
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    public String toString() {
        switch (this.f1722a) {
            case 0:
                boolean z4 = this.f1724c;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f1723b);
                sb.append('{');
                String str = "";
                for (android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) ((android.support.v4.media.session.t) this.f1725d).f8078d; tVar != null; tVar = (android.support.v4.media.session.t) tVar.f8078d) {
                    Object obj = tVar.f8077c;
                    if ((tVar instanceof i) || obj != null || !z4) {
                        sb.append(str);
                        String str2 = (String) tVar.f8076b;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder("DatabaseInfo(databaseId:");
                sb2.append((H4.f) this.f1725d);
                sb2.append(" host:");
                return p031e1.k.i(sb2, (String) this.f1726e, ")");
            default:
                return super.toString();
        }
    }

    public j(p078l.k kVar) {
        this.f1722a = 6;
        s sVar = new s(kVar, "flutter/restoration", y.f688b, null);
        this.f1724c = false;
        p174z5.c cVar = new p174z5.c(this, 1);
        this.f1725d = sVar;
        sVar.b(cVar);
    }

    public j(H4.i iVar, x0 x0Var, p075k4.e eVar, boolean z4) {
        this.f1722a = 2;
        this.f1723b = iVar;
        this.f1725d = x0Var;
        this.f1726e = eVar;
        this.f1724c = z4;
    }

    public j(C0940m c0940m, C0934g c0934g, p134s4.g gVar, boolean z4) {
        this.f1722a = 4;
        this.f1723b = c0940m;
        this.f1725d = c0934g;
        this.f1726e = gVar;
        this.f1724c = z4;
        p120q4.k.b("Validation of queries failed.", gVar.f());
    }

    public j(C0940m c0940m, C0934g c0934g) {
        this.f1722a = 4;
        this.f1723b = c0940m;
        this.f1725d = c0934g;
        this.f1726e = p134s4.g.f16169i;
        this.f1724c = false;
    }

    public j(String str) {
        this.f1722a = 0;
        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(3, false);
        this.f1725d = tVar;
        this.f1726e = tVar;
        this.f1724c = false;
        this.f1723b = str;
    }

    public j(Spatializer spatializer) {
        this.f1722a = 5;
        this.f1723b = spatializer;
        this.f1724c = spatializer.getImmersiveAudioLevel() != 0;
    }
}
