package f4;

import D6.y0;
import W5.AbstractC0486a1;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import e4.C1031e;
import i3.C1263a;

/* renamed from: f4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1098j implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12944b;

    public /* synthetic */ C1098j(Object obj, int i7) {
        this.f12943a = i7;
        this.f12944b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.f12943a) {
            case 0:
                if (exc instanceof Y3.k) {
                    C1263a c1263a = C1096h.f12937f;
                    c1263a.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    C1096h c1096h = (C1096h) ((y0) this.f12944b).f1892c;
                    int i7 = (int) c1096h.f12939b;
                    c1096h.f12939b = (i7 == 30 || i7 == 60 || i7 == 120 || i7 == 240 || i7 == 480) ? 2 * c1096h.f12939b : i7 != 960 ? 30L : 960L;
                    c1096h.f12938a = (c1096h.f12939b * 1000) + System.currentTimeMillis();
                    c1263a.e(AbstractC0486a1.g("Scheduling refresh for ", c1096h.f12938a), new Object[0]);
                    c1096h.f12941d.postDelayed(c1096h.f12942e, c1096h.f12939b * 1000);
                    break;
                }
                break;
            default:
                Log.e("c", "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
                boolean z4 = exc instanceof C1031e;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12944b;
                if (!z4 || !((C1031e) exc).f12676a.endsWith("UNAUTHORIZED_DOMAIN")) {
                    taskCompletionSource.setResult(new F(null, null, null));
                    break;
                } else {
                    taskCompletionSource.setException(exc);
                    break;
                }
                break;
        }
    }
}
