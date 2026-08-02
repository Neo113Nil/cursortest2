package A0;

import android.os.Build;
import r.C2316B;

/* renamed from: A0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0051p implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C2316B c2316b = F.f189U0;
        synchronized (c2316b) {
            try {
                int i = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    Object[] objArr = c2316b.f18904a;
                    int i5 = c2316b.f18905b;
                    while (i < i5) {
                        F f = (F) objArr[i];
                        boolean showLayoutBounds = f.getShowLayoutBounds();
                        Class cls = F.f186R0;
                        f.setShowLayoutBounds(Z.w());
                        if (showLayoutBounds != f.getShowLayoutBounds()) {
                            F.q(f.getRoot());
                        }
                        i++;
                    }
                } else {
                    Object[] objArr2 = c2316b.f18904a;
                    int i6 = c2316b.f18905b;
                    while (i < i6) {
                        F.q(((F) objArr2[i]).getRoot());
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
