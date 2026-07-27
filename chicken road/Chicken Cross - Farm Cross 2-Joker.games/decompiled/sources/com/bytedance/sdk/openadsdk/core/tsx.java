package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class tsx {
    private static volatile tsx pcc;
    private Map<String, Map<String, String>> sf = new ConcurrentHashMap();

    private tsx() {
    }

    public static tsx pcc() {
        if (pcc == null) {
            synchronized (tsx.class) {
                if (pcc == null) {
                    pcc = new tsx();
                }
            }
        }
        return pcc;
    }

    public void pcc(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.sf;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.sf.put(str, concurrentHashMap);
    }

    public String pcc(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.sf;
        if (map2 == null || !map2.containsKey(str) || (map = this.sf.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public boolean sf(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.sf;
        if (map2 == null || !map2.containsKey(str) || (map = this.sf.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean gm(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.sf;
        if (map2 == null || !map2.containsKey(str) || (map = this.sf.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void pcc(String str) {
        Map<String, Map<String, String>> map = this.sf;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.sf.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.sf.remove(str);
        }
    }
}
