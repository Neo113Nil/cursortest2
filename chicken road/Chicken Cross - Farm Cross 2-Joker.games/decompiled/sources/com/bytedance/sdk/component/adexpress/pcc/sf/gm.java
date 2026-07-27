package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.pcc.gm.pcc;
import com.bytedance.sdk.component.utils.ye;
import com.ironsource.C4761z5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class gm {
    public abstract File pcc();

    protected boolean pcc(Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar = map.get(it.next());
            if (pccVar != null && !pcc(pccVar.wh())) {
                return false;
            }
        }
        return true;
    }

    protected boolean pcc(List<pcc.C0119pcc> list) {
        if (list == null || list.size() <= 0 || pcc() == null) {
            return false;
        }
        for (pcc.C0119pcc c0119pcc : list) {
            String pcc = com.bytedance.sdk.component.utils.vj.pcc(c0119pcc.pcc());
            if (TextUtils.isEmpty(pcc)) {
                return false;
            }
            File file = new File(pcc(), pcc);
            String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(file);
            if (!file.exists() || !file.isFile() || c0119pcc.sf() == null || !c0119pcc.sf().equals(pcc2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean pcc(pcc.sf sfVar) {
        if (sfVar == null || pcc() == null) {
            return false;
        }
        List<Pair<String, String>> sf = sfVar.sf();
        if (sf == null || sf.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = sf.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public List<pcc.C0119pcc> pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc = pccVar.pcc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (pcc.size() == 0) {
            if (pccVar2 != null && pccVar2.pcc().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = pccVar2.pcc();
                Iterator<String> it = pcc2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar3 = pcc2.get(it.next());
                    if (pccVar3 != null) {
                        arrayList.addAll(pccVar3.wh());
                    }
                }
            }
        } else if (pccVar2 == null || pccVar2.pcc().size() == 0) {
            if (pcc.size() != 0) {
                Iterator<String> it2 = pcc.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar4 = pcc.get(it2.next());
                    if (pccVar4 != null) {
                        arrayList2.addAll(pccVar4.wh());
                    }
                }
            }
        } else {
            Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc3 = pccVar2.pcc();
            for (String str : pcc.keySet()) {
                com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar5 = pcc.get(str);
                com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar6 = pcc3.get(str);
                if (pccVar6 == null && pccVar5 != null) {
                    arrayList2.addAll(pccVar5.wh());
                } else if (pccVar5 == null && pccVar6 != null) {
                    arrayList.addAll(pccVar6.wh());
                } else if (pccVar5 != null) {
                    for (pcc.C0119pcc c0119pcc : pccVar5.wh()) {
                        if (c0119pcc != null && !pccVar6.wh().contains(c0119pcc) && c0119pcc.sf() != null && c0119pcc.pcc() != null) {
                            arrayList2.add(c0119pcc);
                        }
                    }
                    for (pcc.C0119pcc c0119pcc2 : pccVar6.wh()) {
                        if (c0119pcc2 != null && !pccVar5.wh().contains(c0119pcc2)) {
                            arrayList.add(c0119pcc2);
                        }
                    }
                }
            }
        }
        if (pcc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean pcc(List<pcc.C0119pcc> list, List<pcc.C0119pcc> list2) {
        for (pcc.C0119pcc c0119pcc : list) {
            String pcc = c0119pcc.pcc();
            String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(pcc);
            File file = new File(pcc(), pcc2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.qf.sf.pcc wh = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().wh();
            wh.gm(pcc);
            wh.pcc(pcc().getAbsolutePath(), pcc2);
            com.bytedance.sdk.component.qf.sf vj = wh.vj();
            list2.add(c0119pcc);
            if (vj == null || !vj.wh() || vj.vj() == null || !vj.vj().exists()) {
                gm(list2);
                return false;
            }
        }
        return true;
    }

    public List<pcc.C0119pcc> sf(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (pccVar2 == null || pccVar2.wh().isEmpty()) {
            arrayList2.addAll(pccVar.wh());
        } else if (pccVar.wh().isEmpty()) {
            arrayList.addAll(pccVar2.wh());
        } else {
            for (pcc.C0119pcc c0119pcc : pccVar.wh()) {
                if (!pccVar2.wh().contains(c0119pcc) && c0119pcc != null && c0119pcc.pcc() != null && c0119pcc.sf() != null) {
                    arrayList2.add(c0119pcc);
                }
            }
            for (pcc.C0119pcc c0119pcc2 : pccVar2.wh()) {
                if (!pccVar.wh().contains(c0119pcc2)) {
                    arrayList.add(c0119pcc2);
                }
            }
        }
        if (pcc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void sf(List<pcc.C0119pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pcc.C0119pcc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean pcc(String str) {
        File file = new File(pcc().getAbsoluteFile(), com.bytedance.sdk.component.utils.vj.pcc(str) + ".zip");
        com.bytedance.sdk.component.qf.sf.pcc wh = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().wh();
        wh.gm(str);
        wh.pcc(file.getParent(), file.getName());
        com.bytedance.sdk.component.qf.sf vj = wh.vj();
        if (vj.wh() && vj.vj() != null && vj.vj().exists()) {
            File vj2 = vj.vj();
            try {
                ye.pcc(vj2.getAbsolutePath(), file.getParent());
                if (!vj2.exists()) {
                    return true;
                }
                vj2.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void pcc(int i) {
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().oo() != null) {
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().oo().pcc(i);
        }
    }

    public void gm(List<pcc.C0119pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pcc.C0119pcc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void pcc(File file, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        FileOutputStream fileOutputStream;
        if (pccVar == null) {
            return;
        }
        String ork = pccVar.ork();
        if (TextUtils.isEmpty(ork)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            fileOutputStream = new FileOutputStream(file3);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(ork.getBytes(C4761z5.O));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
        }
    }

    public static boolean gm(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        if (pccVar != null) {
            try {
                if (!TextUtils.isEmpty(pccVar.gm())) {
                    if (pccVar2 == null) {
                        return false;
                    }
                    String qf = pccVar.qf();
                    String qf2 = pccVar2.qf();
                    if ((!TextUtils.isEmpty(qf2) && !qf2.equals(qf)) || pcc(pccVar.gm(), pccVar2.gm())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc = pccVar.pcc();
                    Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = pccVar2.pcc();
                    if (pcc.isEmpty()) {
                        return !pcc2.isEmpty();
                    }
                    if (pcc2.isEmpty()) {
                        return false;
                    }
                    return pcc(pcc, pcc2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean pcc(Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map, Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar = map.get(str);
            if (pccVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2 = map2.get(str);
            if (pccVar2 == null) {
                return false;
            }
            if (pcc(pccVar.gm(), pccVar2.gm())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean pcc(String str, String str2) {
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int length = split[i].length() - split2[i].length();
            if (length == 0) {
                int compareTo = split[i].compareTo(split2[i]);
                if (compareTo > 0) {
                    return true;
                }
                if (compareTo < 0) {
                    return false;
                }
                if (i == min - 1) {
                    return split.length > split2.length;
                }
                i++;
            } else if (length > 0) {
                return true;
            }
        }
    }

    public static boolean pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        if (pccVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(pccVar.gm())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return pcc(pccVar.gm(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void sf(File file, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        if (pccVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (pccVar.wh() != null) {
            Iterator<pcc.C0119pcc> it = pccVar.wh().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
