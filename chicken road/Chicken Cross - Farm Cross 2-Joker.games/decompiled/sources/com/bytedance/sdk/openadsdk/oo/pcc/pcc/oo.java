package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import androidx.media3.common.C;
import com.bytedance.pcc.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.dax.sf.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    public static of<com.bytedance.sdk.openadsdk.oo.pcc> pcc;
    private static final com.bytedance.sdk.openadsdk.oo.pcc.pcc sf = com.bytedance.sdk.openadsdk.oo.pcc.pcc.pcc();

    public static void pcc(final ArrayList<vy> arrayList, final gm.sf<vy> sfVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            if (sfVar != null) {
                sfVar.pcc(arrayList, false);
            }
        } else {
            if (arrayList.get(0) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("applog_2");
                    return pccVar;
                }
            });
            rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = oo.oo(arrayList).entrySet().iterator();
                    } catch (Throwable th) {
                        lo.gm("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        gm.sf sfVar2 = sfVar;
                        if (sfVar2 != null) {
                            sfVar2.pcc(arrayList, false);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            ArrayList arrayList2 = (ArrayList) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                vy vyVar = (vy) it2.next();
                                arrayList3.add(new com.bytedance.sdk.openadsdk.oo.pcc(vyVar.wh(), vyVar.gm()));
                            }
                            com.bytedance.sdk.openadsdk.oo.vj wh = oo.wh(arrayList3);
                            if (wh == null) {
                                wh = new com.bytedance.sdk.openadsdk.oo.vj(false, C.PRIORITY_PROCESSING_FOREGROUND, "result is null", false);
                            }
                            if (sfVar != null) {
                                boolean z = wh.oo;
                                if (oo.sf(arrayList3, wh)) {
                                    z = true;
                                }
                                sfVar.pcc(arrayList2, new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(wh.pcc, wh.sf, wh.gm, z, "").pcc);
                                if (wh.sf == 200) {
                                    com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.1
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                            pccVar.sf("applog_2");
                                            return pccVar;
                                        }
                                    });
                                } else if (z) {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.2
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                            pccVar.sf("applog_2");
                                            return pccVar;
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.3
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                            pccVar.sf("applog_2");
                                            return pccVar;
                                        }
                                    });
                                }
                            }
                        } catch (Throwable th2) {
                            lo.gm("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, ArrayList<vy>> oo(List<vy> list) {
        HashMap<String, ArrayList<vy>> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            vy vyVar = list.get(i);
            String optString = vyVar.gm().optString("app_log_url");
            ArrayList<vy> arrayList = hashMap.get(optString);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(optString, arrayList);
            }
            arrayList.add(vyVar);
        }
        return hashMap;
    }

    private static boolean vj(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        JSONObject oo;
        if (list == null || list.isEmpty() || (oo = list.get(0).oo()) == null) {
            return true;
        }
        return TextUtils.isEmpty(oo.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(List<com.bytedance.sdk.openadsdk.oo.pcc> list, com.bytedance.sdk.openadsdk.oo.vj vjVar) {
        return !vj(list) && vjVar.sf >= 400 && vjVar.sf < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.oo.vj wh(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        if (pcc == null) {
            pcc = lu.gm();
        }
        if (pcc == null) {
            return null;
        }
        int i = wh.pcc() != 3 ? -1 : 3;
        com.bytedance.sdk.openadsdk.oo.pcc.pcc pccVar = sf;
        return pcc.pcc(pccVar.pcc(pccVar.pcc(list, i), System.currentTimeMillis(), pccVar.sf()), pccVar.pcc(list), pccVar.sf(list));
    }

    public static void sf(final ArrayList<vh> arrayList, final gm.sf<vh> sfVar) {
        if (arrayList == null || arrayList.isEmpty() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || arrayList.get(0) == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.dax.gm.sf()) {
            if (sfVar != null) {
                sfVar.pcc(arrayList, true);
                return;
            }
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        Iterator<vh> it = arrayList.iterator();
        while (it.hasNext()) {
            vh next = it.next();
            arrayList2.add(new oo.pcc(next.wh(), next.gm()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.3
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                pccVar.sf("stats_2");
                return pccVar;
            }
        });
        rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.oo.vj pcc2 = oo.pcc(arrayList2);
                if (pcc2 == null) {
                    pcc2 = new com.bytedance.sdk.openadsdk.oo.vj(false, C.PRIORITY_PROCESSING_FOREGROUND, "result is null", false);
                }
                if (sfVar != null) {
                    sfVar.pcc(arrayList, new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(pcc2.pcc, pcc2.sf, pcc2.gm, pcc2.oo, "").pcc);
                    if (pcc2.sf == 200) {
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("stats_2");
                                return pccVar;
                            }
                        });
                    } else if (pcc2.oo) {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.2
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("stats_2");
                                return pccVar;
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.3
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("stats_2");
                                return pccVar;
                            }
                        });
                    }
                }
            }
        });
    }

    public static com.bytedance.sdk.openadsdk.oo.vj pcc(List<oo.pcc> list) {
        if (pcc == null) {
            pcc = lu.gm();
        }
        if (pcc != null && list != null && !list.isEmpty() && com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<oo.pcc> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().sf);
                }
                jSONObject.putOpt("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis / 1000;
                jSONObject.putOpt("ts", Long.valueOf(j));
                jSONObject.putOpt("ts_ms", Long.valueOf(currentTimeMillis));
                String oo = com.bytedance.sdk.openadsdk.core.ork.sf().oo();
                if (oo == null) {
                    oo = "";
                }
                String pcc2 = tsz.pcc();
                StringBuilder append = new StringBuilder(oo).append(j).append(BuildConfig.VERSION_NAME);
                StringBuilder append2 = new StringBuilder(pcc2).append("-").append(currentTimeMillis);
                jSONObject.putOpt("req_sign", com.bytedance.sdk.component.utils.vj.pcc(append.toString()));
                jSONObject.putOpt("req_uniq", com.bytedance.sdk.component.utils.vj.pcc(append2.toString()));
                return pcc.sf(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
