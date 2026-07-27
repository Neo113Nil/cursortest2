package sg.bigo.ads.i;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.i.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5239k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12986a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ C5241m c;

    public C5239k(C5241m c5241m, String str, Context context) {
        this.c = c5241m;
        this.f12986a = str;
        this.b = context;
    }

    public final void a(String str, int i, String str2) {
        this.c.r = -1;
        AbstractC5496a.b("PlayableAdCompanion", "preloadZipResource onFailed: key=" + str + ", code=" + i + ", msg=" + str2);
    }

    public final void a(File file) {
        file.getAbsolutePath();
        String str = ((sg.bigo.ads.U0.b) this.c.i).r0;
        if (TextUtils.isEmpty(str)) {
            this.c.r = -1;
            AbstractC5496a.b("PlayableAdCompanion", "preloadZipResource onReady: empty html path, skip local load");
            return;
        }
        if (!this.c.b && !this.c.u) {
            File file2 = new File(file, str);
            if (!file2.isFile()) {
                this.c.r = -1;
                AbstractC5496a.b("PlayableAdCompanion", "preloadZipResource onReady: html file not found: " + file2.getAbsolutePath());
                sg.bigo.ads.s1.b.a(this.c.i, 15, 0L, this.f12986a, 0, (String) null, (String) null, (HashMap) null);
                return;
            } else {
                this.c.d = file2;
                AbstractC5446j.b(new RunnableC5238j(this));
                return;
            }
        }
        this.c.r = -1;
        boolean z = this.c.b;
        boolean z2 = this.c.u;
    }
}
