package sg.bigo.ads.S;

import android.content.Context;
import android.text.TextUtils;
import sg.bigo.ads.Y0.C5012b;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12531a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a c;

    public g(Context context, String str, C5012b c5012b) {
        this.f12531a = context;
        this.b = str;
        this.c = c5012b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        f fVar = f.i;
        Context context = this.f12531a;
        String str2 = this.b;
        a aVar = this.c;
        fVar.getClass();
        Thread.currentThread().getName();
        if (context == null) {
            AbstractC5496a.a("ChromeTabsStatic", "Preload: empty context!");
            if (aVar == null) {
                return;
            } else {
                str = "Invalid context";
            }
        } else {
            context = context.getApplicationContext();
            if (!TextUtils.isEmpty(str2)) {
                fVar.b.add(str2);
                if (!fVar.a(context)) {
                    fVar.b.remove(str2);
                    if (aVar != null) {
                        aVar.a(context, str2, 2, "Failed to make connection of Chrome service.");
                        return;
                    }
                    return;
                }
                if (!fVar.h) {
                    fVar.a();
                }
                if (aVar != null) {
                    aVar.a("", "0", "");
                    return;
                }
                return;
            }
            AbstractC5496a.a("ChromeTabsStatic", "Preload: empty url!");
            if (aVar == null) {
                return;
            } else {
                str = "Invalid url";
            }
        }
        aVar.a(context, str2, 3, str);
    }
}
