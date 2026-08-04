package p155w1;

import com.flurry.android.marketing.messaging.notification.b;
import com.google.android.gms.common.internal.w;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import p033e3.h;

/* JADX INFO: renamed from: w1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028q extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17833a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17836d;

    public C1028q(String str, String str2, Map map) {
        this.f17834b = str;
        this.f17835c = str2;
        this.f17836d = map;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        boolean z4;
        switch (this.f17833a) {
            case 0:
                C0973c0 c0973c0 = H2.a().f17416o;
                Map map = (Map) this.f17836d;
                if (map == null) {
                    map = new HashMap();
                }
                String str = (String) this.f17835c;
                map.put("fl.origin.attribute.version", str);
                HashMap map2 = (HashMap) c0973c0.f17662B;
                String str2 = (String) this.f17834b;
                map2.put(str2, map);
                c0973c0.h(new C0969b0(str2, str, map));
                return;
            case 1:
                C1034s0 c1034s0 = (C1034s0) this.f17836d;
                byte[] bArr = (byte[]) this.f17835c;
                String str3 = c1034s0.f17858A + ((String) this.f17834b) + "_345";
                C1029q0 c1029q0 = new C1029q0(bArr);
                String str4 = c1029q0.f17837a;
                C1029q0.a(str4).g(c1029q0);
                Objects.toString(AbstractC0998i1.f17749c.getFileStreamPath(".yflurrydatasenderblock.".concat(String.valueOf(str4))));
                w wVar = c1034s0.f17861D;
                synchronized (wVar) {
                    try {
                        "addBlockInfo".concat(String.valueOf(str3));
                        String str5 = c1029q0.f17837a;
                        List linkedList = (List) ((LinkedHashMap) wVar.f11336c).get(str3);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        linkedList.add(str5);
                        if (linkedList.size() > 50) {
                            File file = (File) C1029q0.a((String) linkedList.get(0)).f12447b;
                            if (file != null) {
                                file.delete();
                            }
                            linkedList.remove(0);
                        }
                        ((LinkedHashMap) wVar.f11336c).put(str3, linkedList);
                        wVar.q(str3, ".YFlurrySenderIndex.info.", linkedList);
                        if (z4) {
                            wVar.s();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((ReentrantLock) ((C1047w1) this.f17836d).f17918A).lock();
                try {
                    C1047w1.h((C1047w1) this.f17836d, (C2) this.f17834b);
                    h hVar = (h) this.f17835c;
                    if (hVar != null) {
                        ((B1) ((b) hVar.f12673a).f10499c).f17398A = 3;
                        B1 b7 = (B1) ((b) hVar.f12673a).f10499c;
                        int i7 = B1.f17293H;
                        b7.m();
                        ((B1) ((b) hVar.f12673a).f10499c).f17398A = 4;
                        B1 b8 = (B1) ((b) hVar.f12673a).f10499c;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue = b8.f17399B;
                            if (concurrentLinkedQueue.peek() != null) {
                                C2 c3 = (C2) concurrentLinkedQueue.poll();
                                c3.b();
                                b8.i(c3);
                            }
                        }
                    }
                    return;
                } finally {
                    ((ReentrantLock) ((C1047w1) this.f17836d).f17918A).unlock();
                }
        }
    }

    public C1028q(C1034s0 c1034s0, byte[] bArr, String str) {
        this.f17836d = c1034s0;
        this.f17835c = bArr;
        this.f17834b = str;
    }

    public C1028q(C1047w1 c1047w1, C2 c3, h hVar) {
        this.f17836d = c1047w1;
        this.f17834b = c3;
        this.f17835c = hVar;
    }
}
