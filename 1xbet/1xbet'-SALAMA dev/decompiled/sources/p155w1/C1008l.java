package p155w1;

import D0.i;
import I4.j;
import M4.e;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C0815k;
import com.google.android.gms.common.internal.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import p036e6.c;
import p072k1.g;

/* JADX INFO: renamed from: w1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1008l extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17773b;

    public /* synthetic */ C1008l(Object obj, int i7) {
        this.f17772a = i7;
        this.f17773b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Type inference failed for: r7v11, types: [byte[], java.io.Serializable] */
    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        w wVar;
        List arrayList;
        boolean zExists;
        int iN;
        Iterator it;
        boolean zHasNext;
        CharSequence charSequence = null;
        int i7 = 3;
        int i8 = 0;
        boolean z4 = true;
        switch (this.f17772a) {
            case 0:
                C0986f1 c0986f1 = C0986f1.f17715B;
                c0986f1.f17717z = (j) this.f17773b;
                c0986f1.d(new C0982e1(c0986f1, i8));
                return;
            case 1:
                C1042v c1042v = (C1042v) this.f17773b;
                if (!TextUtils.isEmpty(c1042v.f17889A)) {
                    int iH = AbstractC0998i1.h(0, "prev_streaming_api_key");
                    int iHashCode = AbstractC0998i1.k("api_key", "").hashCode();
                    int iHashCode2 = c1042v.f17889A.hashCode();
                    if (iH != iHashCode2 && iHashCode != iHashCode2) {
                        AbstractC0998i1.e(iHashCode2, "prev_streaming_api_key");
                        C0993h0 c0993h0 = H2.a().f17412k;
                        c0993h0.d(new C0981e0(c0993h0, 1));
                    }
                }
                c1042v.j();
                return;
            case 2:
                T t7 = (T) this.f17773b;
                Location locationJ = t7.j();
                if (locationJ != null) {
                    t7.f17541D = locationJ;
                }
                t7.h(new S(t7.f17538A, t7.f17539B, t7.f17541D));
                return;
            case 3:
                Iterator it2 = ((ArrayList) this.f17773b).iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
                return;
            case 4:
                C1034s0 c1034s0 = (C1034s0) this.f17773b;
                c1034s0.getClass();
                if (H2.a().f17404b.f17606B && (wVar = c1034s0.f17861D) != null) {
                    ArrayList<String> arrayList2 = new ArrayList(((LinkedHashMap) wVar.f11336c).keySet());
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    for (String str : arrayList2) {
                        int i9 = 5;
                        if (c1034s0.f17860C.size() > 5) {
                            return;
                        }
                        List list = (List) ((LinkedHashMap) wVar.f11336c).get(str);
                        List<String> listEmptyList = list == null ? Collections.emptyList() : new ArrayList(list);
                        listEmptyList.size();
                        for (String str2 : listEmptyList) {
                            HashSet hashSet = c1034s0.f17860C;
                            if (!hashSet.contains(str2)) {
                                if (c1034s0.f17860C.size() > i9) {
                                }
                                C1029q0 c1029q0 = (C1029q0) C1029q0.a(str2).e();
                                if (c1029q0 == null) {
                                    wVar.r(str2, str);
                                } else {
                                    ?? r7 = c1029q0.f17838b;
                                    if (r7 == 0 || r7.length == 0) {
                                        wVar.r(str2, str);
                                    } else {
                                        "Reading block info ".concat(String.valueOf(str2));
                                        hashSet.add(str2);
                                        String str3 = TextUtils.isEmpty(charSequence) ? "https://data.flurry.com/v1/flr.do" : "null/v1/flr.do";
                                        N0 n2 = new N0();
                                        n2.f17475e = str3;
                                        n2.f17471a = 100000;
                                        n2.f17476f = i7;
                                        i iVar = n2.f17472b;
                                        HashMap map = iVar.f1652a;
                                        List list2 = (List) map.get("Content-Type");
                                        if (list2 == null) {
                                            arrayList = new ArrayList();
                                            map.put("Content-Type", arrayList);
                                        } else {
                                            arrayList = list2;
                                        }
                                        arrayList.add("application/octet-stream");
                                        String strB = C0815k.a().b();
                                        HashMap map2 = iVar.f1652a;
                                        List arrayList3 = (List) map2.get("X-Flurry-Api-Key");
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            map2.put("X-Flurry-Api-Key", arrayList3);
                                        }
                                        arrayList3.add(strB);
                                        n2.f17469J = new e();
                                        n2.f17470K = new c(28);
                                        n2.f17467H = r7;
                                        C1042v c1042v2 = H2.a().f17410h;
                                        n2.f17464E = c1042v2 != null && c1042v2.f17892D;
                                        n2.f17466G = new g(c1034s0, str2, str3, str, false);
                                        F0.d().l(c1034s0, n2);
                                    }
                                    charSequence = null;
                                    i7 = 3;
                                    i9 = 5;
                                }
                                break;
                            }
                        }
                        charSequence = null;
                        i7 = 3;
                    }
                    return;
                }
                return;
            case 5:
                ((A0) this.f17773b).f17285z = C1049x0.f17925e;
                System.currentTimeMillis();
                A0 a2 = (A0) this.f17773b;
                a2.f17283E = null;
                a2.f17281C.a();
                A0 a4 = (A0) this.f17773b;
                HashSet hashSet2 = new HashSet(C1055z0.f17947c.values());
                HashSet hashSet3 = A0.f17278H;
                if (hashSet3 == null || hashSet3.equals(hashSet2)) {
                    A0.f17278H = hashSet2;
                    Context context = AbstractC0998i1.f17749c;
                    Charset charset = D0.f17325a;
                    synchronized (D0.class) {
                        if (context == null) {
                            zExists = false;
                        } else {
                            String strF = D0.f(context);
                            synchronized (D0.class) {
                                zExists = context.getFileStreamPath(strF).exists();
                            }
                        }
                    }
                    if (zExists) {
                        StringBuilder sb = new StringBuilder("Compare version: current=");
                        sb.append(a4.f17281C.f4933a);
                        sb.append(", recorded=");
                        long jI = AbstractC0998i1.i("appVersion", 0L);
                        if (jI == 0) {
                            jI = AbstractC0998i1.h(0, "appVersion");
                        }
                        sb.append(jI);
                        AbstractC0997i0.o(3, sb.toString());
                        long jI2 = AbstractC0998i1.i("appVersion", 0L);
                        if (jI2 == 0) {
                            jI2 = AbstractC0998i1.h(0, "appVersion");
                        }
                        O1.c cVar = a4.f17281C;
                        if (jI2 >= cVar.f4933a) {
                            long j = cVar.f4934b;
                            if (j == 0) {
                                if (A0.f17277G) {
                                    AbstractC0997i0.o(3, "It does not meet any criterias for data fetch.");
                                    z4 = false;
                                }
                            } else if (System.currentTimeMillis() - AbstractC0998i1.i("lastFetch", 0L) <= j) {
                                AbstractC0997i0.o(3, "It does not meet any criterias for data fetch.");
                                z4 = false;
                            }
                        }
                    }
                } else {
                    A0.f17278H = hashSet2;
                }
                if (!z4) {
                    A0 a7 = (A0) this.f17773b;
                    a7.f17280B.m(a7.f17285z, false);
                    return;
                }
                A0 a8 = (A0) this.f17773b;
                if (H2.a().f17409g.j()) {
                    a8.h();
                    return;
                } else {
                    AbstractC0997i0.o(3, "Waiting for ID provider.");
                    H2.a().f17409g.i(a8.f17284F);
                    return;
                }
            case 6:
                C1046w0 c1046w0 = (C1046w0) this.f17773b;
                try {
                    String strD = D0.d(AbstractC0998i1.f17749c);
                    AbstractC0997i0.o(3, "Cached Data: ".concat(String.valueOf(strD)));
                    if (strD != null) {
                        O1.c cVar2 = c1046w0.f17908C;
                        if (D0.b(AbstractC0998i1.k("lastKeyId", null), strD, AbstractC0998i1.k("lastRSA", null))) {
                            try {
                                c1046w0.f17907B.c(AbstractC0997i0.e(new JSONObject(strD)));
                            } catch (Exception e7) {
                                AbstractC0997i0.r("Cached variants parsing error: ", e7);
                            }
                            C1046w0 c1046w1 = C1046w0.f17904K;
                        } else {
                            AbstractC0997i0.q("Incorrect signature for cache.");
                            D0.e(AbstractC0998i1.f17749c);
                            c1046w0.f17908C.c();
                        }
                        break;
                    }
                    if (iN > 0) {
                        while (zHasNext) {
                            break;
                        }
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    AbstractC0997i0.r("Exception!", e8);
                    if (iN > 0) {
                        while (zHasNext) {
                            break;
                        }
                        return;
                    }
                    return;
                } finally {
                    C1046w0.l(c1046w0);
                    if (c1046w0.f17907B.n() > 0) {
                        for (C1055z0 c1055z0 : c1046w0.f17907B.m()) {
                            c1046w0.f17911F.put(c1055z0, new Pair(Boolean.TRUE, Boolean.FALSE));
                            c1046w0.j(c1055z0, true);
                        }
                    }
                }
            case 7:
                C1052y0 c1052y0 = ((H1) ((C1052y0) ((C1008l) this.f17773b).f17773b).f17938b).f17400C;
                if (c1052y0 != null) {
                    ((H1) c1052y0.f17938b).d(new C1008l(c1052y0, 8));
                    return;
                }
                return;
            default:
                H1 h6 = (H1) ((C1052y0) this.f17773b).f17938b;
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = h6.f17399B;
                    if (concurrentLinkedQueue.peek() == null) {
                        ((H1) ((C1052y0) this.f17773b).f17938b).f17398A = 4;
                        ((H1) ((C1052y0) this.f17773b).f17938b).d(new C1008l(this, 7));
                        return;
                    } else {
                        C2 c3 = (C2) concurrentLinkedQueue.poll();
                        c3.b();
                        h6.i(c3);
                    }
                }
                break;
        }
    }
}
