package sg.bigo.ads.h;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12847a;
    public final /* synthetic */ sg.bigo.ads.P.c b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Y0 d;

    public P0(Context context, FrameLayout frameLayout, sg.bigo.ads.C.l lVar, sg.bigo.ads.P.c cVar, Y0 y0) {
        this.d = y0;
        this.f12847a = frameLayout;
        this.b = cVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0 y0 = this.d;
        y0.N = false;
        boolean a2 = y0.a(this.f12847a);
        if (this.b instanceof InterfaceC5087a) {
            Y0 y02 = this.d;
            if (y02.y == 0) {
                y02.y = SystemClock.elapsedRealtime();
                ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.b)).L0 = this.d.y;
            }
        }
        sg.bigo.ads.P.c cVar = this.b;
        Y0 y03 = this.d;
        X0 x0 = y03.L;
        int i = y03.w;
        boolean z = y03.v;
        x0.getClass();
        sg.bigo.ads.s1.b.b(X0.a(i, z), this.d.x, "1", cVar);
        Context context = this.c;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        AlertDialog create = new AlertDialog.Builder(this.c).setCancelable(!a2).setOnCancelListener(new N0(this)).create();
        create.requestWindowFeature(1);
        create.show();
        Window window = create.getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setGravity(17);
        window.setContentView(this.f12847a);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        this.d.k = create;
        this.f12847a.setVisibility(4);
        this.f12847a.post(new O0(this));
        Y0 y04 = this.d;
        Runnable runnable = y04.f;
        if (runnable != null) {
            runnable.run();
            y04.f = null;
            y04.t = true;
        }
    }
}
