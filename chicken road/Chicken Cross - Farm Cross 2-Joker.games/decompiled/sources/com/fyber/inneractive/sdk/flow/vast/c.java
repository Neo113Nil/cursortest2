package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.s;
import com.fyber.inneractive.sdk.model.vast.t;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.player.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5414a;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public boolean e = false;
    public boolean f = false;
    public final LinkedHashMap g = new LinkedHashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();

    public c(boolean z) {
        this.f5414a = true;
        this.f5414a = z;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i) {
        String str;
        List list;
        Integer num;
        Integer num2;
        String str2;
        ArrayList arrayList = hVar.h;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!h0.f(str3)) {
                    throw new b("Found non-secure click tracking url for companion. url: " + str3, 0);
                }
            }
            if (i > 0) {
                this.i.add(hVar);
            }
        }
        String str4 = hVar.g;
        if (!h0.f(str4)) {
            throw new b("Found non-secure click through url: " + str4, 0);
        }
        if (!hVar.a()) {
            if (this.j.contains(hVar)) {
                return;
            }
            this.j.add(hVar);
            return;
        }
        Integer num3 = hVar.f5458a;
        Integer num4 = hVar.b;
        if (num3 == null || num4 == null || num3.intValue() < 100 || num4.intValue() < 100) {
            throw new b("Incompatible size: " + num3 + "," + num4, 16);
        }
        ArrayList arrayList2 = hVar.j;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            w wVar = (w) it2.next();
            if (!h0.f(wVar.b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str5 = hVar.c;
        l lVar = hVar.d;
        if (lVar != null) {
            k a2 = k.a(lVar.f5460a);
            if (a2 == null) {
                throw new b("Found invalid creative type: " + lVar.f5460a, 32);
            }
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i, num3.intValue(), num4.intValue(), str5, str4, arrayList, list, lVar.b, a2);
        } else {
            str = str5;
            list = arrayList2;
            num = num4;
            num2 = num3;
            str2 = str4;
        }
        String str6 = hVar.e;
        if (!TextUtils.isEmpty(str6)) {
            if (!h0.f(str6)) {
                throw new b("Found non-secure iframe url: " + str6, 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i, num2.intValue(), num.intValue(), str, str2, arrayList, list, str6, null);
        }
        String str7 = hVar.f;
        if (!TextUtils.isEmpty(str7)) {
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Html, i, num2.intValue(), num.intValue(), str, str2, arrayList, list, str7, null);
        }
        bVar.g.size();
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) {
        int d = o.d();
        int c = o.c();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.d, d, c), new d(d, c));
            bVar.f5453a = str;
            ArrayList arrayList = fVar.c.c;
            if (arrayList != null) {
                List list2 = list;
                if (!arrayList.isEmpty()) {
                    if (list == null) {
                        list2 = list;
                        if (fVar.b != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(fVar);
                            list2 = arrayList2;
                        }
                    }
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).b;
                            if (a0Var != null) {
                                a(bVar, a0Var);
                            }
                        }
                    }
                    a(bVar, fVar.c);
                    if (bVar.d.size() == 0) {
                        if (this.g.isEmpty()) {
                            throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                        }
                        throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                    }
                    ArrayList arrayList3 = new ArrayList(bVar.g);
                    Collections.sort(arrayList3, bVar.h);
                    if (!arrayList3.isEmpty()) {
                        Iterator it2 = this.j.iterator();
                        while (it2.hasNext()) {
                            com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it2.next();
                            if (!hVar.a()) {
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) it3.next();
                                    ArrayList arrayList4 = hVar.h;
                                    if (arrayList4 != null) {
                                        Iterator it4 = arrayList4.iterator();
                                        while (it4.hasNext()) {
                                            cVar.a(x.EVENT_CLICK, (String) it4.next());
                                        }
                                    }
                                    String str2 = hVar.g;
                                    if (TextUtils.isEmpty(cVar.g)) {
                                        cVar.g = str2;
                                    }
                                    ArrayList arrayList5 = hVar.j;
                                    if (arrayList5 != null) {
                                        Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            w wVar = (w) it5.next();
                                            x a2 = x.a(wVar.f5468a);
                                            String str3 = wVar.b;
                                            if (a2 != null && str3 != null) {
                                                cVar.a(a2, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i = 0;
                    if (IAlog.f5940a == 2) {
                        IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                        Iterator it6 = new ArrayList(bVar.d).iterator();
                        int i2 = 0;
                        while (it6.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), (r) it6.next());
                            i2++;
                        }
                    }
                    if (IAlog.f5940a == 2) {
                        IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                        ArrayList arrayList6 = new ArrayList(bVar.g);
                        Collections.sort(arrayList6, bVar.h);
                        if (arrayList6.size() > 0) {
                            Iterator it7 = arrayList6.iterator();
                            while (it7.hasNext()) {
                                IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), ((com.fyber.inneractive.sdk.model.vast.c) it7.next()).a());
                                i++;
                            }
                        } else {
                            IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                        }
                    }
                    return bVar;
                }
            }
            throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.g gVar) {
        String[] split;
        f fVar;
        Integer num;
        HashMap hashMap;
        List list;
        IAlog.a("%sprocessing ad element: %s", "VastProcessor: ", gVar);
        ArrayList arrayList = gVar.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                IAlog.a("%sadding impression url: %s", "VastProcessor: ", str);
                x xVar = x.EVENT_IMPRESSION;
                if (h0.f(str)) {
                    bVar.a(xVar, str);
                } else {
                    throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar.a());
                }
            }
        }
        String str2 = gVar.f5457a;
        if (!TextUtils.isEmpty(str2)) {
            IAlog.a("%sadding error url: %s", "VastProcessor: ", str2);
            bVar.a(x.EVENT_ERROR, str2);
        }
        if (IAConfigManager.R.M != null) {
            Iterator it2 = gVar.d.iterator();
            while (it2.hasNext()) {
                com.fyber.inneractive.sdk.measurement.h hVar = (com.fyber.inneractive.sdk.measurement.h) it2.next();
                if (hVar.b()) {
                    bVar.e.add(hVar);
                } else {
                    x xVar2 = x.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (((xVar2 == null || (hashMap = hVar.c) == null || (list = (List) hashMap.get(xVar2)) == null) ? 0 : list.size()) > 0) {
                        n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar2), com.fyber.inneractive.sdk.measurement.i.VERIFICATION_NOT_SUPPORTED), xVar2);
                    }
                    this.k.add(hVar);
                }
            }
        }
        Iterator it3 = gVar.c.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            q qVar = mVar.f5461a;
            if (qVar != null) {
                ArrayList arrayList2 = qVar.f5464a;
                if (arrayList2 != null) {
                    bVar.j = arrayList2.size();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        r rVar = (r) it4.next();
                        String str3 = rVar.f5465a;
                        s sVar = s.progressive;
                        if (!str3.equals(sVar.a())) {
                            fVar = new f(e.UNSUPPORTED_DELIVERY, sVar.a());
                        } else {
                            if (this.c > -1 && (num = rVar.e) != null && num.intValue() != 0) {
                                int intValue = rVar.e.intValue();
                                int i = this.b;
                                if (intValue < i) {
                                    fVar = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i));
                                } else {
                                    int intValue2 = rVar.e.intValue();
                                    int i2 = this.c;
                                    if (intValue2 > i2) {
                                        fVar = new f(e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                                    }
                                }
                            }
                            if (t.a(rVar.d) != t.UNKNOWN) {
                                if (this.e && rVar.b.intValue() >= rVar.c.intValue()) {
                                    fVar = new f(e.VERTICAL_VIDEO_EXPECTED);
                                } else {
                                    String str4 = rVar.f;
                                    if (str4 != null && this.f && str4.equalsIgnoreCase("VPAID")) {
                                        fVar = new f(e.FILTERED_BY_APP_OR_UNIT);
                                    } else if (TextUtils.isEmpty(rVar.g)) {
                                        fVar = new f(e.NO_CONTENT);
                                    } else {
                                        fVar = !h0.f(rVar.g) ? new f(e.UNSECURED_VIDEO_URL) : null;
                                    }
                                }
                            } else {
                                fVar = new f(e.UNSUPPORTED_MIME_TYPE);
                            }
                        }
                        if (fVar != null) {
                            IAlog.a("%smedia file filtered!: %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", rVar);
                            IAlog.a("%s-- %s", "VastProcessor: ", fVar);
                            this.g.put(rVar, fVar);
                        } else {
                            IAlog.a("%sadding media file: %s", "VastProcessor: ", rVar);
                            bVar.d.add(rVar);
                            bVar.k.add(rVar);
                            bVar.i++;
                        }
                    }
                }
                ArrayList arrayList3 = qVar.d;
                if (arrayList3 != null) {
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        String str5 = (String) it5.next();
                        x xVar3 = x.EVENT_CLICK;
                        if (h0.f(str5)) {
                            bVar.a(xVar3, str5);
                        } else {
                            throw new h("VastErrorUnsecure", "found unsecure tracking event: " + xVar3.a());
                        }
                    }
                }
                ArrayList arrayList4 = qVar.b;
                if (arrayList4 != null) {
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        w wVar = (w) it6.next();
                        x a2 = x.a(wVar.f5468a);
                        if (a2 != x.UNKNOWN) {
                            bVar.a(a2, wVar.b);
                        }
                        if (a2 == x.EVENT_PROGRESS) {
                            String str6 = wVar.b;
                            String str7 = wVar.c;
                            com.fyber.inneractive.sdk.model.vast.e eVar = new com.fyber.inneractive.sdk.model.vast.e(str6, str7);
                            if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7) && eVar.d != 0) {
                                bVar.m.add(eVar);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(qVar.c)) {
                    bVar.b = qVar.c;
                }
                String str8 = qVar.e;
                if (!TextUtils.isEmpty(str8) && (split = str8.split(ServerSentEventKt.COLON)) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str8);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            if (this.f5414a) {
                com.fyber.inneractive.sdk.model.vast.o oVar = gVar.e;
                if (oVar != null) {
                    bVar.f = oVar;
                }
                v vVar = gVar.g;
                if (vVar != null) {
                    bVar.p = vVar;
                }
                com.fyber.inneractive.sdk.model.vast.j jVar = mVar.b;
                ArrayList<com.fyber.inneractive.sdk.model.vast.h> arrayList5 = jVar == null ? null : jVar.f5459a;
                if (arrayList5 != null) {
                    for (com.fyber.inneractive.sdk.model.vast.h hVar2 : arrayList5) {
                        try {
                            a(bVar, hVar2, gVar.f);
                        } catch (b e) {
                            IAlog.a("Failed processing companion ad: %s error = %s", hVar2, e.getMessage());
                            hVar2.i = e;
                            this.h.add(hVar2);
                        }
                    }
                }
                ArrayList arrayList6 = gVar.h;
                String str9 = !arrayList6.isEmpty() ? ((com.fyber.inneractive.sdk.model.vast.n) arrayList6.get(0)).f5462a : null;
                if (!TextUtils.isEmpty(str9)) {
                    bVar.n = str9;
                }
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.i iVar, int i, int i2, int i3, String str, String str2, List list, List list2, String str3, k kVar) {
        com.fyber.inneractive.sdk.model.vast.h hVar;
        Integer num;
        Integer num2;
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(iVar, i2, i3, str, i);
        cVar.g = str2;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                cVar.a(x.a(wVar.f5468a), wVar.b);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                cVar.a(x.EVENT_CLICK, (String) it2.next());
            }
        }
        if (!this.i.isEmpty()) {
            if (cVar.h > 0) {
                hVar = (com.fyber.inneractive.sdk.model.vast.h) this.i.remove(r2.size() - 1);
            } else {
                hVar = null;
            }
            String str4 = cVar.e;
            Iterator it3 = this.i.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.model.vast.h hVar2 = (com.fyber.inneractive.sdk.model.vast.h) it3.next();
                String str5 = hVar2.c;
                if ((str4 != null && str4.equals(str5)) || ((str5 == null && (num = hVar2.f5458a) != null && cVar.c == num.intValue() && (num2 = hVar2.b) != null && cVar.d == num2.intValue()) || !hVar2.a())) {
                    ArrayList arrayList = hVar2.h;
                    if (arrayList.size() > 0) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            String str6 = (String) it4.next();
                            if (h0.f(str6)) {
                                cVar.a(x.EVENT_CLICK, str6);
                            }
                        }
                    }
                }
            }
            if (hVar != null) {
                this.i.add(hVar);
            }
        }
        cVar.f = str3;
        cVar.b = kVar;
        bVar.g.add(cVar);
        bVar.l.add(cVar);
    }
}
