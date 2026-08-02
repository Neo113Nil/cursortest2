package J2;

import Q2.C0367k;
import Q2.C0375o;
import Q2.C0379q;
import Q2.G;
import android.content.Context;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import m3.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final G f2708b;

    public e(Context context, String str) {
        v.f("context cannot be null", context);
        C0375o c0375o = C0379q.f.f5049b;
        BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
        c0375o.getClass();
        G g5 = (G) new C0367k(c0375o, context, str, binderC0610Ia).d(context, false);
        this.f2707a = context;
        this.f2708b = g5;
    }
}
