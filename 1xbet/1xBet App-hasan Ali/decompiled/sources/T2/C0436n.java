package T2;

import Q2.C0;
import Q2.C0379q;
import android.content.Context;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1543s1;
import com.google.android.gms.internal.ads.C1815y3;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.K3;
import com.google.android.gms.internal.ads.P9;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: T2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436n extends C1390oj {

    /* renamed from: n, reason: collision with root package name */
    public final Context f5728n;

    public C0436n(Context context, C1543s1 c1543s1) {
        super(c1543s1);
        this.f5728n = context;
    }

    public static C0 r(Context context) {
        C0 c02 = new C0(new K3(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new C0436n(context, new C1543s1(23)));
        c02.i();
        return c02;
    }

    @Override // com.google.android.gms.internal.ads.C1390oj, com.google.android.gms.internal.ads.InterfaceC1680v3
    public final C1815y3 d(A3 a32) {
        if (a32.f7520l == 0) {
            String str = (String) Q2.r.f5053d.f5056c.a(F7.f8876o4);
            String str2 = a32.f7521m;
            if (Pattern.matches(str, str2)) {
                U2.e eVar = C0379q.f.f5048a;
                j3.f fVar = j3.f.f17514b;
                Context context = this.f5728n;
                if (fVar.c(context, 13400000) == 0) {
                    C1815y3 d5 = new P9(context).d(a32);
                    if (d5 != null) {
                        G.m("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return d5;
                    }
                    G.m("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.d(a32);
    }
}
