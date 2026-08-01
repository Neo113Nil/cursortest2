package sg.bigo.ads.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.e.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5080d {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12744a;

    public C5080d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f12744a = concurrentHashMap;
        new ArrayList().add(concurrentHashMap);
    }

    public static void a(String str, ConcurrentHashMap concurrentHashMap) {
        List<Ad> list = (List) concurrentHashMap.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Ad ad : list) {
            if (ad != null && ad.isExpired()) {
                AbstractC5446j.a(2, null, new RunnableC5078b(ad), 0L);
                list.remove(ad);
            }
        }
    }

    public final void a(p pVar, Ad ad) {
        sg.bigo.ads.T0.g gVar;
        List list;
        if (pVar == null) {
            return;
        }
        String str = pVar.l;
        String str2 = TextUtils.isEmpty(str) ? null : str + "_" + pVar.v + "_" + pVar.b;
        if (TextUtils.isEmpty(str2) || (gVar = sg.bigo.ads.O.g.f12472a) == null) {
            return;
        }
        sg.bigo.ads.T0.b a2 = gVar.L.a(str);
        int i = a2 != null ? a2.b : 0;
        ConcurrentHashMap concurrentHashMap = this.f12744a;
        a(str2, concurrentHashMap);
        List list2 = (List) concurrentHashMap.get(str2);
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(ad);
            concurrentHashMap.put(str2, copyOnWriteArrayList);
            list = copyOnWriteArrayList;
        } else {
            int indexOf = list2.indexOf(ad);
            if (indexOf >= 0) {
                list2.set(indexOf, ad);
                list = list2;
            } else {
                list2.add(ad);
                list = list2;
            }
        }
        sg.bigo.ads.P.c[] a3 = sg.bigo.ads.Z0.m.a(ad);
        for (int i2 = 0; a3 != null && i2 < a3.length; i2++) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) a3[i2];
            bVar.c0 = true;
            bVar.a0 = bVar.b0;
        }
        Object[] array = list.toArray();
        if (array != null) {
            List asList = Arrays.asList(array);
            Collections.sort(asList, Collections.reverseOrder());
            list.clear();
            list.addAll(asList);
        }
        int size = list.size();
        if (i > 0 && size > i) {
            try {
                Ad ad2 = (Ad) list.remove(i);
                if (ad2 != null) {
                    ad2.toString();
                }
                if (ad2 != null) {
                    AbstractC5446j.a(2, null, new RunnableC5078b(ad2), 0L);
                }
            } catch (Exception e) {
                AbstractC5496a.a("AdCacheManager", "AdCacheManager:doAdPut, error = " + e.getMessage());
            }
        }
        if (ad != null) {
            ad.toString();
        }
        list.size();
    }
}
