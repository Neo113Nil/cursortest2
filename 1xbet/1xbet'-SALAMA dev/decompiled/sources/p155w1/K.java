package p155w1;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class K extends G2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public N f17430A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17431B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f17432C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public B f17433D;

    public static void k(K k7) {
        boolean z4 = k7.f17431B;
        String str = null;
        if (z4) {
            if (((z4 && TextUtils.isEmpty(null)) ? k7.f17432C : null) == null) {
                return;
            }
        }
        boolean z7 = k7.f17431B;
        if (z7 && z7 && TextUtils.isEmpty(null)) {
            str = k7.f17432C;
        }
        k7.h(new I(z7, str));
    }
}
