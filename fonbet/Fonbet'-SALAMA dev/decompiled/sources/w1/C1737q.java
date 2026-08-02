package w1;

import e3.C1023h;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: w1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737q extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17827a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17830d;

    public C1737q(String str, String str2, Map map) {
        this.f17828b = str;
        this.f17829c = str2;
        this.f17830d = map;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        boolean z4;
        switch (this.f17827a) {
            case 0:
                C1682c0 c1682c0 = H2.a().f17410o;
                Map map = (Map) this.f17830d;
                if (map == null) {
                    map = new HashMap();
                }
                String str = (String) this.f17829c;
                map.put("fl.origin.attribute.version", str);
                HashMap hashMap = (HashMap) c1682c0.f17656B;
                String str2 = (String) this.f17828b;
                hashMap.put(str2, map);
                c1682c0.h(new C1678b0(str2, str, map));
                return;
            case 1:
                C1743s0 c1743s0 = (C1743s0) this.f17830d;
                byte[] bArr = (byte[]) this.f17829c;
                String str3 = c1743s0.f17852A + ((String) this.f17828b) + "_345";
                C1738q0 c1738q0 = new C1738q0(bArr);
                String str4 = c1738q0.f17831a;
                C1738q0.a(str4).g(c1738q0);
                Objects.toString(AbstractC1707i1.f17743c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str4))));
                com.google.android.gms.common.internal.w wVar = c1743s0.f17855D;
                synchronized (wVar) {
                    try {
                        "addBlockInfo".concat(String.valueOf(str3));
                        String str5 = c1738q0.f17831a;
                        List list = (List) ((LinkedHashMap) wVar.f11336c).get(str3);
                        if (list == null) {
                            list = new LinkedList();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        list.add(str5);
                        if (list.size() > 50) {
                            File file = (File) C1738q0.a((String) list.get(0)).f12441b;
                            if (file != null) {
                                file.delete();
                            }
                            list.remove(0);
                        }
                        ((LinkedHashMap) wVar.f11336c).put(str3, list);
                        wVar.q(str3, ".YFlurrySenderIndex.info.", list);
                        if (z4) {
                            wVar.s();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((ReentrantLock) ((C1756w1) this.f17830d).f17912A).lock();
                try {
                    C1756w1.h((C1756w1) this.f17830d, (C2) this.f17828b);
                    C1023h c1023h = (C1023h) this.f17829c;
                    if (c1023h != null) {
                        ((B1) ((com.flurry.android.marketing.messaging.notification.b) c1023h.f12667a).f10499c).f17392A = 3;
                        B1 b12 = (B1) ((com.flurry.android.marketing.messaging.notification.b) c1023h.f12667a).f10499c;
                        int i7 = B1.f17287H;
                        b12.m();
                        ((B1) ((com.flurry.android.marketing.messaging.notification.b) c1023h.f12667a).f10499c).f17392A = 4;
                        B1 b13 = (B1) ((com.flurry.android.marketing.messaging.notification.b) c1023h.f12667a).f10499c;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue = b13.f17393B;
                            if (concurrentLinkedQueue.peek() != null) {
                                C2 c22 = (C2) concurrentLinkedQueue.poll();
                                c22.b();
                                b13.i(c22);
                            }
                        }
                    }
                    return;
                } finally {
                    ((ReentrantLock) ((C1756w1) this.f17830d).f17912A).unlock();
                }
        }
    }

    public C1737q(C1743s0 c1743s0, byte[] bArr, String str) {
        this.f17830d = c1743s0;
        this.f17829c = bArr;
        this.f17828b = str;
    }

    public C1737q(C1756w1 c1756w1, C2 c22, C1023h c1023h) {
        this.f17830d = c1756w1;
        this.f17828b = c22;
        this.f17829c = c1023h;
    }
}
