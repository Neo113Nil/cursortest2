package com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class pcc implements com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf {
    private String pcc = "video_reward_full";
    private String sf = "video_brand";
    private String gm = "video_splash";
    private String oo = "video_default";
    private String vj = null;
    private String wh = null;
    private String qf = null;
    private String kj = null;
    private String vy = null;

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public void pcc(String str) {
        this.vj = str;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public String gm() {
        if (this.vy == null) {
            this.vy = this.vj + File.separator + this.oo;
            File file = new File(this.vy);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.vy;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public String pcc() {
        if (this.wh == null) {
            this.wh = this.vj + File.separator + this.pcc;
            File file = new File(this.wh);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.wh;
    }

    public String vj() {
        if (this.qf == null) {
            this.qf = this.vj + File.separator + this.sf;
            File file = new File(this.qf);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.qf;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public String sf() {
        if (this.kj == null) {
            this.kj = this.vj + File.separator + this.gm;
            File file = new File(this.kj);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.kj;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public synchronized void oo() {
        Set<String> set = null;
        for (com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc pccVar : wh()) {
            File[] pcc = pccVar.pcc();
            if (pcc != null && pcc.length >= pccVar.sf()) {
                if (set == null) {
                    set = qf();
                }
                int sf = pccVar.sf() - 2;
                if (sf < 0) {
                    sf = 0;
                }
                pcc(pccVar.pcc(), sf, set);
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public boolean pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        if (TextUtils.isEmpty(gmVar.vj()) || TextUtils.isEmpty(gmVar.nac())) {
            return false;
        }
        return new File(gmVar.vj(), gmVar.nac()).exists();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf
    public long sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        if (TextUtils.isEmpty(gmVar.vj()) || TextUtils.isEmpty(gmVar.nac())) {
            return 0L;
        }
        return com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.pcc(gmVar.vj(), gmVar.nac());
    }

    private static void pcc(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.pcc.1
                        @Override // java.util.Comparator
                        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long lastModified = file2.lastModified() - file.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            return lastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file = (File) asList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private List<com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc> wh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc(new File(pcc()).listFiles(), com.bykv.vk.openvk.pcc.pcc.sf.pcc.gm()));
        arrayList.add(new com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc(new File(sf()).listFiles(), com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf()));
        arrayList.add(new com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc(new File(vj()).listFiles(), com.bykv.vk.openvk.pcc.pcc.sf.pcc.oo()));
        arrayList.add(new com.bykv.vk.openvk.pcc.pcc.pcc.pcc.pcc(new File(gm()).listFiles(), com.bykv.vk.openvk.pcc.pcc.sf.pcc.vj()));
        return arrayList;
    }

    private Set<String> qf() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc pccVar : com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.pcc.values()) {
            if (pccVar != null && pccVar.pcc() != null) {
                com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc = pccVar.pcc();
                hashSet.add(com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.sf(pcc.vj(), pcc.nac()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.gm(pcc.vj(), pcc.nac()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf.sf sfVar : com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf.gm.pcc.values()) {
            if (sfVar != null && sfVar.pcc() != null) {
                com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc2 = sfVar.pcc();
                hashSet.add(com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.sf(pcc2.vj(), pcc2.nac()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.gm(pcc2.vj(), pcc2.nac()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
