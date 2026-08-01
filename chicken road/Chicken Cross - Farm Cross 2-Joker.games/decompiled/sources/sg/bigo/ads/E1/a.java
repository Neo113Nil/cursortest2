package sg.bigo.ads.E1;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import sg.bigo.ads.U.o;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12277a;
    public final /* synthetic */ b b;

    public a(b bVar, Context context) {
        this.b = bVar;
        this.f12277a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.set(true);
        b bVar = this.b;
        Context context = this.f12277a;
        if (new File(o.a(new StringBuilder().append(bVar.b(context)), File.separator, "banner_insert_js.js")).exists()) {
            String a2 = bVar.a(context);
            bVar.f12790a = a2;
            if (!TextUtils.isEmpty(a2)) {
                bVar.b = true;
            }
        }
        if (bVar.a(bVar.c(), bVar.e())) {
            bVar.a(bVar.c(), context);
        }
    }
}
