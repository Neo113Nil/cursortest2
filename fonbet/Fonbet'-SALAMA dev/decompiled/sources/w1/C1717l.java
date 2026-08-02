package w1;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C0859k;
import e6.C1054c;
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

/* renamed from: w1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717l extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17767b;

    public /* synthetic */ C1717l(Object obj, int i7) {
        this.f17766a = i7;
        this.f17767b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0200, code lost:
    
        if (w1.A0.f17271G == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0213, code lost:
    
        w1.AbstractC1706i0.o(3, "It does not meet any criterias for data fetch.");
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        if ((java.lang.System.currentTimeMillis() - w1.AbstractC1707i1.i("lastFetch", 0)) > r5) goto L86;
     */
    /* JADX WARN: Type inference failed for: r7v11, types: [byte[], java.io.Serializable] */
    @Override // w1.AbstractRunnableC1687d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        com.google.android.gms.common.internal.w wVar;
        List list;
        boolean exists;
        CharSequence charSequence = null;
        int i7 = 3;
        int i8 = 0;
        boolean z4 = true;
        switch (this.f17766a) {
            case 0:
                C1695f1 c1695f1 = C1695f1.f17709B;
                c1695f1.f17711z = (I4.j) this.f17767b;
                c1695f1.d(new C1691e1(c1695f1, i8));
                return;
            case 1:
                C1751v c1751v = (C1751v) this.f17767b;
                if (!TextUtils.isEmpty(c1751v.f17883A)) {
                    int h6 = AbstractC1707i1.h(0, "prev_streaming_api_key");
                    int hashCode = AbstractC1707i1.k("api_key", "").hashCode();
                    int hashCode2 = c1751v.f17883A.hashCode();
                    if (h6 != hashCode2 && hashCode != hashCode2) {
                        AbstractC1707i1.e(hashCode2, "prev_streaming_api_key");
                        C1702h0 c1702h0 = H2.a().f17406k;
                        c1702h0.d(new C1690e0(c1702h0, 1));
                    }
                }
                c1751v.j();
                return;
            case 2:
                T t7 = (T) this.f17767b;
                Location j = t7.j();
                if (j != null) {
                    t7.f17535D = j;
                }
                t7.h(new S(t7.f17532A, t7.f17533B, t7.f17535D));
                return;
            case 3:
                Iterator it = ((ArrayList) this.f17767b).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                return;
            case 4:
                C1743s0 c1743s0 = (C1743s0) this.f17767b;
                c1743s0.getClass();
                if (H2.a().f17398b.f17600B && (wVar = c1743s0.f17855D) != null) {
                    ArrayList arrayList = new ArrayList(((LinkedHashMap) wVar.f11336c).keySet());
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        int i9 = 5;
                        if (c1743s0.f17854C.size() > 5) {
                            return;
                        }
                        List list2 = (List) ((LinkedHashMap) wVar.f11336c).get(str);
                        List<String> emptyList = list2 == null ? Collections.emptyList() : new ArrayList(list2);
                        emptyList.size();
                        for (String str2 : emptyList) {
                            HashSet hashSet = c1743s0.f17854C;
                            if (!hashSet.contains(str2)) {
                                if (c1743s0.f17854C.size() <= i9) {
                                    C1738q0 c1738q0 = (C1738q0) C1738q0.a(str2).e();
                                    if (c1738q0 == null) {
                                        wVar.r(str2, str);
                                    } else {
                                        ?? r7 = c1738q0.f17832b;
                                        if (r7 == 0 || r7.length == 0) {
                                            wVar.r(str2, str);
                                        } else {
                                            "Reading block info ".concat(String.valueOf(str2));
                                            hashSet.add(str2);
                                            String str3 = TextUtils.isEmpty(charSequence) ? "https://data.flurry.com/v1/flr.do" : "null/v1/flr.do";
                                            N0 n02 = new N0();
                                            n02.f17469e = str3;
                                            n02.f17465a = 100000;
                                            n02.f17470f = i7;
                                            D0.i iVar = n02.f17466b;
                                            HashMap hashMap = iVar.f1652a;
                                            List list3 = (List) hashMap.get("Content-Type");
                                            if (list3 == null) {
                                                list = new ArrayList();
                                                hashMap.put("Content-Type", list);
                                            } else {
                                                list = list3;
                                            }
                                            list.add("application/octet-stream");
                                            String b7 = C0859k.a().b();
                                            HashMap hashMap2 = iVar.f1652a;
                                            List list4 = (List) hashMap2.get("X-Flurry-Api-Key");
                                            if (list4 == null) {
                                                list4 = new ArrayList();
                                                hashMap2.put("X-Flurry-Api-Key", list4);
                                            }
                                            list4.add(b7);
                                            n02.f17463J = new M4.e();
                                            n02.f17464K = new C1054c(28);
                                            n02.f17461H = r7;
                                            C1751v c1751v2 = H2.a().f17404h;
                                            n02.f17458E = c1751v2 != null && c1751v2.f17886D;
                                            n02.f17460G = new k1.g(c1743s0, str2, str3, str, false);
                                            F0.d().l(c1743s0, n02);
                                        }
                                        charSequence = null;
                                        i7 = 3;
                                        i9 = 5;
                                    }
                                }
                            }
                        }
                        charSequence = null;
                        i7 = 3;
                    }
                    return;
                }
                return;
            case 5:
                ((A0) this.f17767b).f17279z = C1758x0.f17919e;
                System.currentTimeMillis();
                A0 a02 = (A0) this.f17767b;
                a02.f17277E = null;
                a02.f17275C.a();
                A0 a03 = (A0) this.f17767b;
                HashSet hashSet2 = new HashSet(C1764z0.f17941c.values());
                HashSet hashSet3 = A0.f17272H;
                if (hashSet3 == null || hashSet3.equals(hashSet2)) {
                    A0.f17272H = hashSet2;
                    Context context = AbstractC1707i1.f17743c;
                    Charset charset = D0.f17319a;
                    synchronized (D0.class) {
                        if (context == null) {
                            exists = false;
                        } else {
                            String f7 = D0.f(context);
                            synchronized (D0.class) {
                                exists = context.getFileStreamPath(f7).exists();
                            }
                        }
                    }
                    if (exists) {
                        StringBuilder sb = new StringBuilder("Compare version: current=");
                        sb.append(a03.f17275C.f4933a);
                        sb.append(", recorded=");
                        long i10 = AbstractC1707i1.i("appVersion", 0L);
                        if (i10 == 0) {
                            i10 = AbstractC1707i1.h(0, "appVersion");
                        }
                        sb.append(i10);
                        AbstractC1706i0.o(3, sb.toString());
                        long i11 = AbstractC1707i1.i("appVersion", 0L);
                        if (i11 == 0) {
                            i11 = AbstractC1707i1.h(0, "appVersion");
                        }
                        O1.c cVar = a03.f17275C;
                        if (i11 >= cVar.f4933a) {
                            long j3 = cVar.f4934b;
                            if (j3 == 0) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                } else {
                    A0.f17272H = hashSet2;
                }
                if (!z4) {
                    A0 a04 = (A0) this.f17767b;
                    a04.f17274B.m(a04.f17279z, false);
                    return;
                }
                A0 a05 = (A0) this.f17767b;
                if (H2.a().f17403g.j()) {
                    a05.h();
                    return;
                } else {
                    AbstractC1706i0.o(3, "Waiting for ID provider.");
                    H2.a().f17403g.i(a05.f17278F);
                    return;
                }
            case 6:
                C1755w0 c1755w0 = (C1755w0) this.f17767b;
                try {
                    try {
                        String d7 = D0.d(AbstractC1707i1.f17743c);
                        AbstractC1706i0.o(3, "Cached Data: ".concat(String.valueOf(d7)));
                        if (d7 != null) {
                            O1.c cVar2 = c1755w0.f17902C;
                            if (D0.b(AbstractC1707i1.k("lastKeyId", null), d7, AbstractC1707i1.k("lastRSA", null))) {
                                try {
                                    c1755w0.f17901B.c(AbstractC1706i0.e(new JSONObject(d7)));
                                } catch (Exception e7) {
                                    AbstractC1706i0.r("Cached variants parsing error: ", e7);
                                }
                                C1755w0 c1755w02 = C1755w0.f17898K;
                            } else {
                                AbstractC1706i0.q("Incorrect signature for cache.");
                                D0.e(AbstractC1707i1.f17743c);
                                c1755w0.f17902C.c();
                            }
                        }
                        C1755w0.l(c1755w0);
                        if (c1755w0.f17901B.n() > 0) {
                            Iterator it3 = c1755w0.f17901B.m().iterator();
                            while (it3.hasNext()) {
                                C1764z0 c1764z0 = (C1764z0) it3.next();
                                c1755w0.f17905F.put(c1764z0, new Pair(Boolean.TRUE, Boolean.FALSE));
                                c1755w0.j(c1764z0, true);
                            }
                            return;
                        }
                        return;
                    } catch (Exception e8) {
                        AbstractC1706i0.r("Exception!", e8);
                        C1755w0.l(c1755w0);
                        if (c1755w0.f17901B.n() > 0) {
                            Iterator it4 = c1755w0.f17901B.m().iterator();
                            while (it4.hasNext()) {
                                C1764z0 c1764z02 = (C1764z0) it4.next();
                                c1755w0.f17905F.put(c1764z02, new Pair(Boolean.TRUE, Boolean.FALSE));
                                c1755w0.j(c1764z02, true);
                            }
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    C1755w0.l(c1755w0);
                    if (c1755w0.f17901B.n() > 0) {
                        Iterator it5 = c1755w0.f17901B.m().iterator();
                        while (it5.hasNext()) {
                            C1764z0 c1764z03 = (C1764z0) it5.next();
                            c1755w0.f17905F.put(c1764z03, new Pair(Boolean.TRUE, Boolean.FALSE));
                            c1755w0.j(c1764z03, true);
                        }
                    }
                    throw th;
                }
            case 7:
                C1761y0 c1761y0 = ((H1) ((C1761y0) ((C1717l) this.f17767b).f17767b).f17932b).f17394C;
                if (c1761y0 != null) {
                    ((H1) c1761y0.f17932b).d(new C1717l(c1761y0, 8));
                    return;
                }
                return;
            default:
                H1 h12 = (H1) ((C1761y0) this.f17767b).f17932b;
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = h12.f17393B;
                    if (concurrentLinkedQueue.peek() == null) {
                        ((H1) ((C1761y0) this.f17767b).f17932b).f17392A = 4;
                        ((H1) ((C1761y0) this.f17767b).f17932b).d(new C1717l(this, 7));
                        return;
                    } else {
                        C2 c22 = (C2) concurrentLinkedQueue.poll();
                        c22.b();
                        h12.i(c22);
                    }
                }
        }
    }
}
