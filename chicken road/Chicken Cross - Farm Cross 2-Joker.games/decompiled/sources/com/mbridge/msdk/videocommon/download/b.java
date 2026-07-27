package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DownLoadManager.java */
/* loaded from: classes6.dex */
public class b {
    private static volatile b f;

    /* renamed from: a, reason: collision with root package name */
    private boolean f10334a = false;
    private ConcurrentHashMap<String, l> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> c;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> d;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> e;

    private b() {
    }

    public static b getInstance() {
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    f = new b();
                }
            }
        }
        return f;
    }

    public a a(String str, String str2) {
        l c = c(str);
        if (c != null) {
            return c.a(str2);
        }
        return null;
    }

    public CopyOnWriteArrayList<CampaignEx> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public l c(String str) {
        ConcurrentHashMap<String, l> concurrentHashMap = this.b;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public l createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i, com.mbridge.msdk.videocommon.listener.a aVar) {
        l lVar;
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.b.containsKey(str)) {
            lVar = this.b.get(str);
            if (lVar == null) {
                lVar = new l(context, copyOnWriteArrayList, str, i);
                this.b.put(str, lVar);
            }
            if (i == 94 || i == 287) {
                lVar.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
            } else {
                lVar.a(aVar);
            }
            lVar.b(copyOnWriteArrayList);
        } else {
            lVar = new l(context, copyOnWriteArrayList, str, i);
            if (i == 94 || i == 287) {
                lVar.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
            } else {
                lVar.a(aVar);
            }
            this.b.put(str, lVar);
        }
        return lVar;
    }

    public void load(String str) {
        l c = c(str);
        if (c != null) {
            c.d();
        }
    }

    public boolean b(int i, String str, boolean z) {
        try {
            l c = c(str);
            if (c != null) {
                return c.b(i, z) != null;
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public CopyOnWriteArrayList<a> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public void c(String str, String str2) {
        l c = c(str);
        if (c != null) {
            try {
                c.b(str2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DownLoadManager", e.getMessage());
                }
            }
        }
    }

    public a a(int i, String str, boolean z) {
        l c = c(str);
        if (c != null) {
            return c.a(i, z);
        }
        return null;
    }

    public boolean a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return a(i, str, z, i2, z2, i3, list, false, null);
    }

    public boolean a(int i, String str, List<CampaignEx> list) {
        l c = c(str);
        if (c == null) {
            c = createUnitCache(com.mbridge.msdk.foundation.controller.c.n().d(), str, (CopyOnWriteArrayList<CampaignEx>) list, i, (com.mbridge.msdk.videocommon.listener.a) null);
        }
        if (c != null) {
            return c.a(list, str);
        }
        return false;
    }

    public void b(boolean z) {
        this.f10334a = z;
        ConcurrentHashMap<String, l> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value = it.next().getValue();
                if (value != null) {
                    value.e();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x018b, code lost:
    
        if (r4.size() > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0192, code lost:
    
        if (r14.c != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0194, code lost:
    
        r14.c = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x019d, code lost:
    
        if (r14.e != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x019f, code lost:
    
        r14.e = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01a8, code lost:
    
        if (r14.d != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01aa, code lost:
    
        r14.d = new java.util.concurrent.ConcurrentHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b1, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b7, code lost:
    
        if (r2.size() <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01b9, code lost:
    
        r3 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r4 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r5 = new java.util.concurrent.CopyOnWriteArrayList<>();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d0, code lost:
    
        if (r2.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d2, code lost:
    
        r6 = r2.next();
        r7 = new java.util.concurrent.ConcurrentHashMap();
        r8 = r6.h();
        r7.put(r8.getId() + r8.getVideoUrlEncode() + r8.getBidToken(), r6);
        r3.add(r7);
        r4.add(r8);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020f, code lost:
    
        a(r16, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0129, code lost:
    
        if (r5.size() >= r18) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list, boolean z3, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        l c;
        boolean z4;
        CampaignEx campaignEx;
        boolean z5 = false;
        if (list != null) {
            try {
                if (list.size() != 0 && (c = c(str)) != null) {
                    List<a> a2 = c.a(str, i, z, list, z3, eVar);
                    if (a2 != null && a2.size() != 0) {
                        if (z2) {
                            if (list.size() <= 0 || (campaignEx = list.get(0)) == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                z4 = false;
                            } else {
                                q0.c("DownLoadManager", "Is not check video download status with TPL");
                                z4 = true;
                            }
                            try {
                                if (i3 == 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (a aVar : a2) {
                                        for (CampaignEx campaignEx2 : list) {
                                            if (aVar != null && aVar.h() != null && campaignEx2 != null && campaignEx2.getId().equals(aVar.h().getId()) && campaignEx2.getRequestId().equals(aVar.h().getRequestId())) {
                                                arrayList.add(aVar);
                                            }
                                        }
                                    }
                                    z5 = arrayList.size() > 0 ? true : z4;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (a aVar2 : a2) {
                                        for (CampaignEx campaignEx3 : list) {
                                            if (aVar2 != null && aVar2.h() != null && campaignEx3 != null && campaignEx3.getId().equals(aVar2.h().getId()) && campaignEx3.getRequestId().equals(aVar2.h().getRequestId())) {
                                                arrayList2.add(aVar2);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                z5 = z4;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                                return z5;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (a aVar3 : a2) {
                                for (CampaignEx campaignEx4 : list) {
                                    if (aVar3 != null && aVar3.h() != null && campaignEx4 != null && campaignEx4.getId().equals(aVar3.h().getId()) && campaignEx4.getRequestId().equals(aVar3.h().getRequestId())) {
                                        arrayList3.add(aVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return z5;
    }

    public int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> c;
        a value;
        CampaignEx h;
        ConcurrentHashMap<String, l> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value2 = it.next().getValue();
                if (value2 != null && (c = value2.c()) != null) {
                    int size = c.size();
                    for (int i = 0; i < size; i++) {
                        Map<String, a> map = c.get(i);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (h = value.h()) != null) {
                                String videoUrlEncode = h.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.o();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public l createUnitCache(Context context, String str, CampaignEx campaignEx, int i, com.mbridge.msdk.videocommon.listener.a aVar) {
        l lVar;
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.b.containsKey(str)) {
            lVar = this.b.get(str);
            if (lVar == null) {
                lVar = new l(context, campaignEx, str, i);
                this.b.put(str, lVar);
            }
            if (i != 94 && i != 287) {
                lVar.a(aVar);
            } else {
                lVar.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
            }
            lVar.f(campaignEx);
        } else {
            lVar = new l(context, campaignEx, str, i);
            if (i != 94 && i != 287) {
                lVar.a(aVar);
            } else {
                lVar.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
            }
            this.b.put(str, lVar);
        }
        return lVar;
    }

    private void a(String str, CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2, CopyOnWriteArrayList<a> copyOnWriteArrayList3) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4;
        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
            if (campaignEx.getSecondRequestIndex() == 1 && (concurrentHashMap = this.d) != null && (copyOnWriteArrayList4 = concurrentHashMap.get(str)) != null && copyOnWriteArrayList4.size() > 0 && copyOnWriteArrayList4.get(0).getLocalRequestId().equals(campaignEx.getLocalRequestId())) {
                return;
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> concurrentHashMap2 = this.c;
        if (concurrentHashMap2 == null) {
            this.c = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap2.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap3 = this.e;
        if (concurrentHashMap3 == null) {
            this.e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap3.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap4 = this.d;
        if (concurrentHashMap4 == null) {
            this.d = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap4.remove(str);
        }
        this.c.put(str, copyOnWriteArrayList);
        this.d.put(str, copyOnWriteArrayList2);
        this.e.put(str, copyOnWriteArrayList3);
    }

    public void a(boolean z) {
        if (z) {
            if (this.f10334a) {
                return;
            }
        } else {
            this.f10334a = false;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().d();
            }
        }
    }

    public void a() {
        ConcurrentHashMap<String, l> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                a(entry.getValue(), entry.getKey());
            }
        }
    }

    private void a(l lVar, String str) {
        try {
            com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), str);
            if (c == null) {
                return;
            }
            if (c.l() == 2) {
                lVar.e();
            } else {
                lVar.d();
            }
        } catch (Exception e) {
            q0.b("DownLoadManager", e.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                m e2 = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
                if (e2 == null) {
                    e2 = m.j(str);
                }
                if (e2.q() == 2) {
                    lVar.e();
                } else {
                    lVar.d();
                }
            } catch (Exception e3) {
                q0.b("DownLoadManager", e3.getMessage());
            }
        }
    }
}
