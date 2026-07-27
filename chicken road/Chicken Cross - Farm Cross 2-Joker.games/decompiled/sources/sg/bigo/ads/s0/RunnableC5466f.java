package sg.bigo.ads.s0;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.s0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5466f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13289a;
    public final /* synthetic */ k b;

    public RunnableC5466f(k kVar, Context context) {
        this.b = kVar;
        this.f13289a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        k kVar = this.b;
        Context context = this.f13289a;
        kVar.getClass();
        if (AbstractC5446j.e()) {
            return;
        }
        File file = new File(kVar.b(context));
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            Arrays.sort(listFiles, new C5467g());
            long currentTimeMillis = System.currentTimeMillis() - kVar.c.d;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                if (i >= kVar.a() || file2.lastModified() <= currentTimeMillis) {
                    file2.delete();
                }
            }
        }
    }
}
