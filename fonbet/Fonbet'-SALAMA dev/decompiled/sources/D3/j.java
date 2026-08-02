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
import i4.RunnableC1276m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k4.C1343e;
import l.C1373k;
import n4.AbstractC1472f;
import n4.C1473g;
import n4.C1479m;
import n4.N;
import v4.t;
import v4.v;
import z5.C1821c;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1722a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1724c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1725d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1726e;

    public /* synthetic */ j(Object obj, String str, Object obj2, boolean z4, int i7) {
        this.f1722a = i7;
        this.f1725d = obj;
        this.f1723b = str;
        this.f1726e = obj2;
        this.f1724c = z4;
    }

    public static HashMap j(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public static void n(s4.g gVar) {
        if (gVar.e() && gVar.c() && gVar.d()) {
            if (!gVar.d() || gVar.f16165b == 0) {
                throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        if (p6.c.j(r5.f16166c) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(s4.g gVar) {
        if (!gVar.f16170g.equals(v4.m.f17189a)) {
            if (gVar.f16170g.equals(t.f17199a)) {
                if (gVar.e()) {
                    if (!gVar.e()) {
                        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
                    }
                }
                if (gVar.c()) {
                    if (!gVar.c()) {
                        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
                    }
                    if (p6.c.j(gVar.f16168e)) {
                        return;
                    }
                    throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
                }
                return;
            }
            return;
        }
        if (gVar.e()) {
            if (!gVar.e()) {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
            v4.r rVar = gVar.f16166c;
            if (!gVar.e()) {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
            v4.c cVar = gVar.f16167d;
            v4.c cVar2 = v4.c.f17169b;
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
            v4.r rVar2 = gVar.f16168e;
            if (!gVar.c()) {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
            v4.c cVar3 = gVar.f16169f;
            v4.c cVar4 = v4.c.f17170c;
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

    public void d(AbstractC1472f abstractC1472f) {
        N n2 = N.f15386b;
        synchronized (n2.f15387a) {
            try {
                List list = (List) n2.f15387a.get(abstractC1472f);
                if (list == null) {
                    list = new ArrayList();
                    n2.f15387a.put(abstractC1472f, list);
                }
                list.add(abstractC1472f);
                if (!abstractC1472f.e().c()) {
                    AbstractC1472f a2 = abstractC1472f.a(s4.h.a(abstractC1472f.e().f16172a));
                    List list2 = (List) n2.f15387a.get(a2);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        n2.f15387a.put(a2, list2);
                    }
                    list2.add(abstractC1472f);
                }
                boolean z4 = true;
                abstractC1472f.f15414c = true;
                q4.k.c(!abstractC1472f.f15412a.get());
                if (abstractC1472f.f15413b != null) {
                    z4 = false;
                }
                q4.k.c(z4);
                abstractC1472f.f15413b = n2;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C1479m) this.f1723b).q(new RunnableC1276m(this, abstractC1472f, 1));
    }

    public void e(String str, String str2) {
        i iVar = new i(3, false);
        ((android.support.v4.media.session.t) this.f1726e).f8078d = iVar;
        this.f1726e = iVar;
        iVar.f8077c = str2;
        iVar.f8076b = str;
    }

    public boolean f(X x4, C0101g c0101g) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(x4.f283C);
        int i7 = x4.f296P;
        if (equals && i7 == 16) {
            i7 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(v2.t.o(i7));
        int i8 = x4.f297Q;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        canBeSpatialized = ((Spatializer) this.f1723b).canBeSpatialized((AudioAttributes) c0101g.a().f16591b, channelMask.build());
        return canBeSpatialized;
    }

    public j g(String str, String str2) {
        return h(str2, str != null ? new v(str, v4.j.f17184e) : v4.j.f17184e);
    }

    public j h(String str, v4.r rVar) {
        q4.l.b(str);
        if (!rVar.r() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        v4.c b7 = str != null ? v4.c.b(str) : null;
        s4.g gVar = (s4.g) this.f1726e;
        if (gVar.c()) {
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        q4.k.c(rVar.r() || rVar.isEmpty());
        q4.k.c(!(rVar instanceof v4.o));
        s4.g a2 = gVar.a();
        a2.f16168e = rVar;
        a2.f16169f = b7;
        n(a2);
        p(a2);
        q4.k.c(a2.f());
        return new j((C1479m) this.f1723b, (C1473g) this.f1725d, a2, this.f1724c);
    }

    public s4.h i() {
        return new s4.h((C1473g) this.f1725d, (s4.g) this.f1726e);
    }

    public void k(AbstractC1472f abstractC1472f) {
        N n2 = N.f15386b;
        synchronized (n2.f15387a) {
            try {
                List list = (List) n2.f15387a.get(abstractC1472f);
                if (list != null && !list.isEmpty()) {
                    if (abstractC1472f.e().c()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            AbstractC1472f abstractC1472f2 = (AbstractC1472f) list.get(size);
                            if (!hashSet.contains(abstractC1472f2.e())) {
                                hashSet.add(abstractC1472f2.e());
                                abstractC1472f2.h();
                            }
                        }
                    } else {
                        ((AbstractC1472f) list.get(0)).h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C1479m) this.f1723b).q(new RunnableC1276m(this, abstractC1472f, 0));
    }

    public j l(String str, String str2) {
        return m(str2, str != null ? new v(str, v4.j.f17184e) : v4.j.f17184e);
    }

    public j m(String str, v4.r rVar) {
        q4.l.b(str);
        if (!rVar.r() && !rVar.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        }
        s4.g gVar = (s4.g) this.f1726e;
        if (gVar.e()) {
            throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
        }
        v4.c b7 = str != null ? str.equals("[MIN_NAME]") ? v4.c.f17169b : str.equals("[MAX_KEY]") ? v4.c.f17170c : v4.c.b(str) : null;
        q4.k.c(rVar.r() || rVar.isEmpty());
        q4.k.c(!(rVar instanceof v4.o));
        s4.g a2 = gVar.a();
        a2.f16166c = rVar;
        a2.f16167d = b7;
        n(a2);
        p(a2);
        q4.k.c(a2.f());
        return new j((C1479m) this.f1723b, (C1473g) this.f1725d, a2, this.f1724c);
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
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
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
                return e1.k.i(sb2, (String) this.f1726e, ")");
            default:
                return super.toString();
        }
    }

    public j(C1373k c1373k) {
        this.f1722a = 6;
        s sVar = new s(c1373k, "flutter/restoration", y.f688b, null);
        this.f1724c = false;
        C1821c c1821c = new C1821c(this, 1);
        this.f1725d = sVar;
        sVar.b(c1821c);
    }

    public j(H4.i iVar, x0 x0Var, C1343e c1343e, boolean z4) {
        this.f1722a = 2;
        this.f1723b = iVar;
        this.f1725d = x0Var;
        this.f1726e = c1343e;
        this.f1724c = z4;
    }

    public j(C1479m c1479m, C1473g c1473g, s4.g gVar, boolean z4) {
        this.f1722a = 4;
        this.f1723b = c1479m;
        this.f1725d = c1473g;
        this.f1726e = gVar;
        this.f1724c = z4;
        q4.k.b("Validation of queries failed.", gVar.f());
    }

    public j(C1479m c1479m, C1473g c1473g) {
        this.f1722a = 4;
        this.f1723b = c1479m;
        this.f1725d = c1473g;
        this.f1726e = s4.g.f16163i;
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
        int immersiveAudioLevel;
        this.f1722a = 5;
        this.f1723b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f1724c = immersiveAudioLevel != 0;
    }
}
