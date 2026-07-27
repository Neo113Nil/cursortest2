package sg.bigo.ads.S;

import android.content.Context;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12533a;

    public i(Context context) {
        this.f12533a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = f.i;
        Context context = this.f12533a;
        fVar.getClass();
        if (context == null) {
            return;
        }
        fVar.a(context.getApplicationContext());
    }
}
