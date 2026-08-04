package p167y2;

import F2.C0241m;
import F2.C0247p;
import F2.C0252s;
import F2.V;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.ads.zzbok;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile V f18139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f18140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature[] f18141c;

    static {
        Feature feature = new Feature("additional_video_csi", 1L);
        f18140b = feature;
        f18141c = new Feature[]{feature};
    }

    public static V a(Context context) {
        if (f18139a == null) {
            synchronized (B.class) {
                try {
                    if (f18139a == null) {
                        C0247p c0247p = C0252s.f2717f.f2719b;
                        zzbok zzbokVar = new zzbok();
                        c0247p.getClass();
                        f18139a = (V) new C0241m(c0247p, context, zzbokVar).d(context, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18139a;
    }
}
