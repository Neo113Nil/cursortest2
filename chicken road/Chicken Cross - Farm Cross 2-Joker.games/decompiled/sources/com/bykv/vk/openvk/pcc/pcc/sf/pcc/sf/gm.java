package com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf;

import android.content.Context;
import com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class gm {
    public static final ConcurrentHashMap<String, sf> pcc = new ConcurrentHashMap<>();

    public static synchronized void pcc(Context context, com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, pcc.InterfaceC0095pcc interfaceC0095pcc) {
        synchronized (gm.class) {
            if (gmVar == null) {
                return;
            }
            ConcurrentHashMap<String, sf> concurrentHashMap = pcc;
            sf sfVar = concurrentHashMap.get(gmVar.nac());
            if (sfVar == null) {
                sfVar = new sf(context, gmVar);
                concurrentHashMap.put(gmVar.nac(), sfVar);
                new Object[]{"preloadVideo:  cache size = ", Integer.valueOf(gmVar.wh()), gmVar.nac()};
            }
            sfVar.pcc(interfaceC0095pcc);
            new Object[]{"preloadVideo:  cache size = ", Integer.valueOf(gmVar.wh()), gmVar.nac()};
        }
    }

    public static synchronized void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        synchronized (gm.class) {
            sf remove = pcc.remove(gmVar.nac());
            if (remove != null) {
                remove.pcc(true);
            }
            new Object[]{"removePreload:  cache size = ", Integer.valueOf(gmVar.wh()), gmVar.nac()};
        }
    }
}
