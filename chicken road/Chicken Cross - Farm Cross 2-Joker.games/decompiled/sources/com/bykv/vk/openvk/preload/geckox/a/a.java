package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.ironsource.L6;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AbandonChannelClenUtils.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f4623a;
    private int b = 1;

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        File file2;
        List<Long> b;
        File file3;
        Iterator<Long> it3;
        List<Long> b2;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        File file4;
        String str;
        File file5;
        List<Long> list;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file6 = new File(file, key);
                if (file6.isDirectory() && (value = next.getValue()) != null && value.f4655a != null && !value.f4655a.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f4655a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list2.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.f4654a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i = next2.b;
                            List<Long> list3 = next2.c;
                            File file7 = new File(file6, str2);
                            String str3 = "--pending-delete";
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        File file8 = new File(file6, str2);
                                        File file9 = new File(file6, str2 + "--pending-delete");
                                        file8.renameTo(file9);
                                        arrayList.add(new C0097a(key, str2, i, 0L, file9));
                                    }
                                } else if (list3 != null && (b2 = g.b(file7)) != null && !b2.isEmpty()) {
                                    for (Long l : b2) {
                                        if (list3.get(0).longValue() > l.longValue()) {
                                            File file10 = new File(file7, l + str3);
                                            new File(file7, String.valueOf(l)).renameTo(file10);
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list = list3;
                                            arrayList.add(new C0097a(key, str2, i, l.longValue(), file10));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            file4 = file7;
                                            str = str3;
                                            file5 = file6;
                                            list = list3;
                                        }
                                        it6 = it4;
                                        file7 = file4;
                                        str3 = str;
                                        list3 = list;
                                        file6 = file5;
                                        it7 = it5;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                                file2 = file6;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file11 = file7;
                                file2 = file6;
                                if (list3 != null && (b = g.b(file11)) != null && !b.isEmpty()) {
                                    Iterator<Long> it8 = b.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list3.contains(next3)) {
                                            File file12 = file11;
                                            File file13 = new File(file12, next3 + "--pending-delete");
                                            new File(file12, String.valueOf(next3)).renameTo(file13);
                                            it3 = it8;
                                            file3 = file12;
                                            arrayList.add(new C0097a(key, str2, i, next3.longValue(), file13));
                                        } else {
                                            file3 = file11;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file11 = file3;
                                    }
                                }
                            }
                            it6 = it;
                            file6 = file2;
                            it7 = it2;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0097a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0097a c0097a : list4) {
                            File file14 = c0097a.e;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            boolean a2 = com.bykv.vk.openvk.preload.geckox.utils.b.a(file14);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            if (a2) {
                                b.a(context2).a(c0097a.f4625a, c0097a.b, c0097a.c, 200, c0097a.d, 0, null, uptimeMillis2 - uptimeMillis);
                            } else {
                                b.a(context2).a(c0097a.f4625a, c0097a.b, c0097a.c, 201, c0097a.d, 601, "delete failed", uptimeMillis2 - uptimeMillis);
                            }
                        }
                    }
                } catch (Exception e2) {
                    GeckoLogger.w("clean-channel", "", e2);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = UrlConst.HTTPS + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response doPost = bVar.i().doPost(str, statisticModel.toJson());
                if (doPost.code != 200) {
                    throw new NetworkErrorException("net work get failed, code: " + doPost.code + ", url:" + str);
                }
                if (new JSONObject(doPost.body).getInt("status") != 0) {
                    throw new RuntimeException("upload failed");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: AbandonChannelClenUtils.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    static class C0097a {

        /* renamed from: a, reason: collision with root package name */
        String f4625a;
        String b;
        int c;
        long d;
        File e;

        C0097a(String str, String str2, int i, long j, File file) {
            this.f4625a = str;
            this.b = str2;
            this.c = i;
            this.d = j;
            this.e = file;
        }
    }

    public a(List<String> list) {
        this.f4623a = list;
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4623a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.f4623a.size(); i++) {
                    jSONArray.put(this.f4623a.get(i));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(L6.F, 0);
            jSONObject.put("msg_type", this.b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
