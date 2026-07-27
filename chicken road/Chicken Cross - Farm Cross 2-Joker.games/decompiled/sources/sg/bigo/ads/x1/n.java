package sg.bigo.ads.x1;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f13398a;

    public n(p pVar) {
        this.f13398a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6 A[EDGE_INSN: B:57:0x01b6->B:58:0x01b6 BREAK  A[LOOP:0: B:2:0x0012->B:76:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        int i2;
        CopyOnWriteArrayList copyOnWriteArrayList3;
        sg.bigo.ads.P.u uVar;
        int i3;
        int i4;
        int i5;
        sg.bigo.ads.P.u uVar2;
        int i6;
        sg.bigo.ads.P.u uVar3;
        int i7;
        this.f13398a.f13400a.size();
        Iterator it = this.f13398a.f13400a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            s sVar = (s) it.next();
            Context context = this.f13398a.e;
            CopyOnWriteArrayList copyOnWriteArrayList4 = sVar.r;
            if (copyOnWriteArrayList4 == null) {
                AbstractC5496a.b("TrackerInfo", "retryThirdTrackImpl mThirdImpressionTrack is error.");
            } else if (sVar.h < sVar.p.c && (r7 = copyOnWriteArrayList4.size()) != 0) {
                sg.bigo.ads.P.u uVar4 = sVar.p;
                if (sVar.i + uVar4.d < System.currentTimeMillis()) {
                    sVar.i = System.currentTimeMillis();
                    sVar.h++;
                    Iterator it2 = sVar.r.iterator();
                    while (it2.hasNext()) {
                        sVar.a(context, "impl_track", (q) it2.next());
                    }
                    copyOnWriteArrayList = sVar.s;
                    if (copyOnWriteArrayList != null && sVar.j < sVar.p.c && copyOnWriteArrayList.size() != 0) {
                        uVar3 = sVar.p;
                        if (sVar.k + uVar3.d < System.currentTimeMillis()) {
                            sVar.k = System.currentTimeMillis();
                            sVar.j++;
                            Iterator it3 = sVar.s.iterator();
                            i = 0;
                            while (it3.hasNext()) {
                                i++;
                                sVar.a(context, "click_track", (q) it3.next());
                            }
                            if (i == 0 && (i7 = sVar.j) > 0) {
                                sVar.j = i7 - 1;
                            }
                            copyOnWriteArrayList2 = sVar.t;
                            if (copyOnWriteArrayList2 != null && sVar.l < sVar.p.c && copyOnWriteArrayList2.size() != 0) {
                                uVar2 = sVar.p;
                                if (sVar.m + uVar2.d < System.currentTimeMillis()) {
                                    sVar.m = System.currentTimeMillis();
                                    sVar.l++;
                                    Iterator it4 = sVar.t.iterator();
                                    i2 = 0;
                                    while (it4.hasNext()) {
                                        i2++;
                                        sVar.a(context, "nurl_track", (q) it4.next());
                                    }
                                    if (i2 == 0 && (i6 = sVar.l) > 0) {
                                        sVar.l = i6 - 1;
                                    }
                                    copyOnWriteArrayList3 = sVar.u;
                                    if (copyOnWriteArrayList3 == null || sVar.n >= sVar.p.c || copyOnWriteArrayList3.size() == 0) {
                                        i3 = i8;
                                    } else {
                                        uVar = sVar.p;
                                        i3 = i8;
                                        if (sVar.o + uVar.d < System.currentTimeMillis()) {
                                            sVar.o = System.currentTimeMillis();
                                            sVar.n++;
                                            Iterator it5 = sVar.u.iterator();
                                            i4 = 0;
                                            while (it5.hasNext()) {
                                                i4++;
                                                sVar.a(context, "lurl_track", (q) it5.next());
                                            }
                                            if (i4 == 0 && (i5 = sVar.n) > 0) {
                                                sVar.n = i5 - 1;
                                            }
                                            int i9 = r7 + i + i2 + i4;
                                            if (!sVar.a(sVar.r, sVar.h) && sVar.a(sVar.s, sVar.j) && sVar.a(sVar.t, sVar.l) && sVar.a(sVar.u, sVar.n)) {
                                                sVar.toString();
                                                t.a(sVar);
                                                it.remove();
                                                i8 = i3;
                                            } else {
                                                i8 = i3 + i9;
                                                if (i8 <= 20) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    i4 = 0;
                                    int i92 = r7 + i + i2 + i4;
                                    if (!sVar.a(sVar.r, sVar.h)) {
                                    }
                                    i8 = i3 + i92;
                                    if (i8 <= 20) {
                                    }
                                }
                            }
                            i2 = 0;
                            copyOnWriteArrayList3 = sVar.u;
                            if (copyOnWriteArrayList3 == null) {
                                uVar = sVar.p;
                                i3 = i8;
                                if (sVar.o + uVar.d < System.currentTimeMillis()) {
                                }
                                i4 = 0;
                                int i922 = r7 + i + i2 + i4;
                                if (!sVar.a(sVar.r, sVar.h)) {
                                }
                                i8 = i3 + i922;
                                if (i8 <= 20) {
                                }
                            }
                            i3 = i8;
                            i4 = 0;
                            int i9222 = r7 + i + i2 + i4;
                            if (!sVar.a(sVar.r, sVar.h)) {
                            }
                            i8 = i3 + i9222;
                            if (i8 <= 20) {
                            }
                        }
                    }
                    i = 0;
                    copyOnWriteArrayList2 = sVar.t;
                    if (copyOnWriteArrayList2 != null) {
                        uVar2 = sVar.p;
                        if (sVar.m + uVar2.d < System.currentTimeMillis()) {
                        }
                    }
                    i2 = 0;
                    copyOnWriteArrayList3 = sVar.u;
                    if (copyOnWriteArrayList3 == null) {
                    }
                    i3 = i8;
                    i4 = 0;
                    int i92222 = r7 + i + i2 + i4;
                    if (!sVar.a(sVar.r, sVar.h)) {
                    }
                    i8 = i3 + i92222;
                    if (i8 <= 20) {
                    }
                }
            }
            int size = 0;
            copyOnWriteArrayList = sVar.s;
            if (copyOnWriteArrayList != null) {
                uVar3 = sVar.p;
                if (sVar.k + uVar3.d < System.currentTimeMillis()) {
                }
            }
            i = 0;
            copyOnWriteArrayList2 = sVar.t;
            if (copyOnWriteArrayList2 != null) {
            }
            i2 = 0;
            copyOnWriteArrayList3 = sVar.u;
            if (copyOnWriteArrayList3 == null) {
            }
            i3 = i8;
            i4 = 0;
            int i922222 = size + i + i2 + i4;
            if (!sVar.a(sVar.r, sVar.h)) {
            }
            i8 = i3 + i922222;
            if (i8 <= 20) {
            }
        }
        if (this.f13398a.f13400a.size() == 0) {
            p pVar = this.f13398a;
            Set set = pVar.f13400a;
            sg.bigo.ads.P.u uVar5 = pVar.c;
            AbstractC5025b.a("tb_tracker", "ctime < " + (System.currentTimeMillis() - 86400000), null);
            Cursor a2 = AbstractC5025b.a("tb_tracker", "last_retry_ts < " + (System.currentTimeMillis() - 1800000), null, "last_retry_ts", 10);
            ArrayList arrayList = new ArrayList();
            if (a2 != null) {
                while (a2.moveToNext()) {
                    s sVar2 = new s(uVar5, a2);
                    arrayList.add(sVar2);
                    sVar2.toString();
                }
                a2.close();
            }
            set.addAll(arrayList);
            this.f13398a.f13400a.size();
        }
        this.f13398a.f13400a.size();
        if (this.f13398a.f13400a.size() > 0) {
            AbstractC5446j.a(1, null, this.f13398a.f, 20000L);
        } else {
            p.g = false;
        }
    }
}
