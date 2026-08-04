package p042f4;

import D6.y0;
import W5.AbstractC0486a1;
import Y3.k;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import p034e4.e;
import p062i3.a;

/* JADX INFO: renamed from: f4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0901j implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12950b;

    public /* synthetic */ C0901j(Object obj, int i7) {
        this.f12949a = i7;
        this.f12950b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f12949a) {
            case 0:
                if (exc instanceof k) {
                    a aVar = C0899h.f12943f;
                    aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    C0899h c0899h = (C0899h) ((y0) this.f12950b).f1892c;
                    int i7 = (int) c0899h.f12945b;
                    c0899h.f12945b = (i7 == 30 || i7 == 60 || i7 == 120 || i7 == 240 || i7 == 480) ? 2 * c0899h.f12945b : i7 != 960 ? 30L : 960L;
                    c0899h.f12944a = (c0899h.f12945b * 1000) + System.currentTimeMillis();
                    aVar.e(AbstractC0486a1.g("Scheduling refresh for ", c0899h.f12944a), new Object[0]);
                    c0899h.f12947d.postDelayed(c0899h.f12948e, c0899h.f12945b * 1000);
                }
                break;
            default:
                Log.e("c", "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
                boolean z4 = exc instanceof e;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12950b;
                if (z4 && ((e) exc).f12682a.endsWith("UNAUTHORIZED_DOMAIN")) {
                    taskCompletionSource.setException(exc);
                } else {
                    taskCompletionSource.setResult(new F(null, null, null));
                }
                break;
        }
    }
}
