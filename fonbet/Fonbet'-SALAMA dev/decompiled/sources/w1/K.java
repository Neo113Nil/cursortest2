package w1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class K extends G2 {

    /* renamed from: A, reason: collision with root package name */
    public N f17424A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17425B;

    /* renamed from: C, reason: collision with root package name */
    public String f17426C;

    /* renamed from: D, reason: collision with root package name */
    public B f17427D;

    public static void k(K k7) {
        boolean z4 = k7.f17425B;
        String str = null;
        if (z4) {
            if (((z4 && TextUtils.isEmpty(null)) ? k7.f17426C : null) == null) {
                return;
            }
        }
        boolean z7 = k7.f17425B;
        if (z7 && z7 && TextUtils.isEmpty(null)) {
            str = k7.f17426C;
        }
        k7.h(new I(z7, str));
    }
}
