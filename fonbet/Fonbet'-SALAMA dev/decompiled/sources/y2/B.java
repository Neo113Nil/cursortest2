package y2;

import F2.C0241m;
import F2.C0247p;
import F2.C0252s;
import F2.V;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.ads.zzbok;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static volatile V f18133a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f18134b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature[] f18135c;

    static {
        Feature feature = new Feature("additional_video_csi", 1L);
        f18134b = feature;
        f18135c = new Feature[]{feature};
    }

    public static V a(Context context) {
        if (f18133a == null) {
            synchronized (B.class) {
                try {
                    if (f18133a == null) {
                        C0247p c0247p = C0252s.f2717f.f2719b;
                        zzbok zzbokVar = new zzbok();
                        c0247p.getClass();
                        f18133a = (V) new C0241m(c0247p, context, zzbokVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        return f18133a;
    }
}
