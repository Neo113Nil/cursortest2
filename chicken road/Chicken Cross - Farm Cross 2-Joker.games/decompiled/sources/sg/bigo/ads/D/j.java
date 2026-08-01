package sg.bigo.ads.D;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.U.q;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12252a;

    public j(k kVar) {
        this.f12252a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        try {
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) this.f12252a.k.f12482a);
            if (kVar.p()) {
                Context context = this.f12252a.k.e;
                StringBuilder sb2 = new StringBuilder();
                if (kVar.o()) {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder append = new StringBuilder().append(q.a(context));
                    String str = File.separator;
                    sb = sb3.append(append.append(str).append("video").toString()).append(str).append("vpaid").toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder append2 = new StringBuilder().append(q.a(context));
                    String str2 = File.separator;
                    sb = sb4.append(append2.append(str2).append("video").toString()).append(str2).append("files").toString();
                }
                File file = new File(sb2.append(sb).append(File.separator).append(kVar.d()).toString());
                if (file.exists()) {
                    return;
                }
                if (new File(file.getParentFile(), file.getName() + ".tmp").exists()) {
                    return;
                }
                sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) kVar, new AdError(2010, "resource clear."), true, true);
            }
        } catch (Exception unused) {
        }
    }
}
