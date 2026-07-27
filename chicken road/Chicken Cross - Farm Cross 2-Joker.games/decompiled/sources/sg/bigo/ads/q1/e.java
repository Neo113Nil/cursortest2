package sg.bigo.ads.q1;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.U.o;
import sg.bigo.ads.U.q;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.f0.h;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.i.C5239k;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class e {
    public static final e g = new e();

    /* renamed from: a, reason: collision with root package name */
    public long f13262a = 0;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public C5123a e;
    public Context f;

    public static void a(e eVar, Context context, String str, String str2, h hVar) {
        File file;
        eVar.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder append = new StringBuilder().append(q.a(context));
            String str3 = File.separator;
            file = new File(sb.append(append.append(str3).append("playable_zip").toString()).append(str3).append(str2).toString());
            try {
                AbstractC4964v.a(file);
                if (file.mkdirs()) {
                    hVar.a(new C5115b(str, file.getAbsolutePath(), "package.zip", false, true, false, null), false);
                    return;
                }
                d dVar = (d) eVar.d.remove(str2);
                sg.bigo.ads.s1.b.a(dVar != null ? dVar.f13261a : null, 2, str, 0L, 0L, "zip cacheDir mkdirs failed: " + file.getAbsolutePath(), -1);
                eVar.a(str2, 5, "zip cacheDir mkdirs failed: " + file.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
                AbstractC5496a.b("PlayableZip", "prepareAndStartDownload: " + th.getMessage());
                d dVar2 = (d) eVar.d.remove(str2);
                sg.bigo.ads.s1.b.a(dVar2 != null ? dVar2.f13261a : null, 2, str, 0L, 0L, "prepareAndStartDownload: " + th.getMessage(), -1);
                if (file != null) {
                    AbstractC4964v.a(file);
                }
                eVar.a(str2, 6, "prepareAndStartDownload: " + th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
    }

    public static void a(e eVar, Context context) {
        File[] listFiles;
        if (eVar.e == null) {
            eVar.e = new C5123a();
        }
        File file = new File(o.a(new StringBuilder().append(q.a(context)), File.separator, "playable_zip"));
        C5123a c5123a = eVar.e;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory()) {
                arrayList.add(file2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new c());
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < arrayList.size()) {
            File file3 = (File) arrayList.get(i);
            String name = file3.getName();
            if (!eVar.c.containsKey(name) && !eVar.b.containsKey(name) && !eVar.d.containsKey(name)) {
                long lastModified = file3.lastModified();
                int i2 = c5123a.b;
                if (i2 == 0) {
                    i2 = Integer.MAX_VALUE;
                }
                Pair pair = new Pair(Boolean.valueOf(lastModified + c5123a.d < currentTimeMillis), Boolean.valueOf(i >= i2));
                if (((Boolean) pair.first).booleanValue() || ((Boolean) pair.second).booleanValue()) {
                    AbstractC4964v.a(file3);
                }
            }
            i++;
        }
    }

    public final void a(String str, int i, String str2) {
        this.c.remove(str);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b.remove(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((C5239k) it.next()).a(str, i, str2);
        }
    }
}
