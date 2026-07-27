package sg.bigo.ads.I0;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.n1.r;

/* loaded from: classes3.dex */
public final class c implements sg.bigo.ads.Y.e {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, Intent intent) {
        int i;
        String action = intent.getAction();
        if (I.a((CharSequence) action)) {
            return;
        }
        int i2 = f.f12337a;
        action.getClass();
        if (!action.equals("android.intent.action.SCREEN_OFF")) {
            i = action.equals("android.intent.action.USER_PRESENT") ? 1 : 2;
            if (i2 == f.f12337a) {
                Iterator it = f.b.iterator();
                while (it.hasNext()) {
                    r rVar = (r) it.next();
                    if (f.f12337a == 1) {
                        synchronized (rVar) {
                            rVar.b();
                            rVar.b.post(rVar.d);
                        }
                    } else {
                        rVar.getClass();
                    }
                }
                return;
            }
            return;
        }
        f.f12337a = i;
        if (i2 == f.f12337a) {
        }
    }
}
