package sg.bigo.ads.q1;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.U.q;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.f0.h;
import sg.bigo.ads.i.C5239k;
import sg.bigo.ads.n1.n;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13259a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC5087a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C5239k e;
    public final /* synthetic */ e f;

    public a(e eVar, Context context, String str, InterfaceC5087a interfaceC5087a, String str2, C5239k c5239k) {
        this.f = eVar;
        this.f13259a = context;
        this.b = str;
        this.c = interfaceC5087a;
        this.d = str2;
        this.e = c5239k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:3:0x0002, B:10:0x0071, B:12:0x0077, B:13:0x007e, B:15:0x0085, B:17:0x008b, B:18:0x0090, B:22:0x00a2, B:24:0x00a8, B:26:0x00c2, B:29:0x00d6, B:32:0x00ea, B:37:0x0058, B:5:0x0044, B:34:0x004b), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:3:0x0002, B:10:0x0071, B:12:0x0077, B:13:0x007e, B:15:0x0085, B:17:0x008b, B:18:0x0090, B:22:0x00a2, B:24:0x00a8, B:26:0x00c2, B:29:0x00d6, B:32:0x00ea, B:37:0x0058, B:5:0x0044, B:34:0x004b), top: B:2:0x0002, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        try {
            Context context = this.f13259a;
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            StringBuilder append = new StringBuilder().append(q.a(context));
            String str2 = File.separator;
            File file = new File(sb.append(append.append(str2).append("playable_zip").toString()).append(str2).append(str).toString());
            File file2 = new File(file, "package.zip");
            try {
            } catch (Throwable th) {
                AbstractC5496a.b("PlayableZip", "isCacheReady: " + th.getMessage());
            }
            if (!file.isDirectory()) {
                z = false;
                if (!z) {
                    long length = file2.isFile() ? file2.length() : 0L;
                    if (file2.isFile() && !file2.delete()) {
                        AbstractC5496a.b("PlayableZip", "cache hit: delete legacy package.zip failed");
                    }
                    sg.bigo.ads.s1.b.a(this.c, 1, this.d, length, 0L, null, 0);
                    this.e.a(file);
                    return;
                }
                h hVar = n.n.h;
                if (hVar == null) {
                    sg.bigo.ads.s1.b.a(this.c, 2, this.d, 0L, 0L, "DownloadManager not ready", -1);
                    this.e.a(this.b, 1, "DownloadManager not ready");
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.f.b.putIfAbsent(this.b, copyOnWriteArrayList);
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                }
                copyOnWriteArrayList.add(this.e);
                if (this.f.c.putIfAbsent(this.b, Boolean.TRUE) != null) {
                    return;
                }
                this.f.d.put(this.b, new d(this.c, this.d));
                e.a(e.g, this.f13259a, this.d, this.b, hVar);
                return;
            }
            z = new File(file, ".bigo_playable_extract_ok").isFile();
            if (!z) {
            }
        } catch (Throwable th2) {
            AbstractC5496a.b("PlayableZip", "downloadAndExtract setup failed: " + th2.getMessage());
            this.f.c.remove(this.b);
            sg.bigo.ads.s1.b.a(this.c, 2, this.d, 0L, 0L, "download zip error: " + th2.getMessage(), -1);
            this.e.a(this.b, 6, "download zip error: " + th2.getMessage());
        }
    }
}
