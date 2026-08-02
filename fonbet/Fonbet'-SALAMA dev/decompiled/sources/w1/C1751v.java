package w1;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0859k;

/* renamed from: w1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1751v extends G2 {

    /* renamed from: A, reason: collision with root package name */
    public String f17883A;

    /* renamed from: B, reason: collision with root package name */
    public String f17884B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17885C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17886D;

    /* renamed from: E, reason: collision with root package name */
    public I f17887E;

    /* renamed from: F, reason: collision with root package name */
    public C1748u f17888F;

    /* renamed from: G, reason: collision with root package name */
    public K f17889G;

    public final void j() {
        if (TextUtils.isEmpty(this.f17883A) || this.f17887E == null) {
            return;
        }
        String b7 = C0859k.a().b();
        boolean z4 = this.f17885C;
        Context context = AbstractC1707i1.f17743c;
        int i7 = 1;
        try {
            Object obj = com.google.android.gms.common.c.f11214c;
            Integer num = (Integer) com.google.android.gms.common.c.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(com.google.android.gms.common.c.class.getMethod("getInstance", null).invoke(null, null), context);
            int intValue = num != null ? num.intValue() : -1;
            if (intValue == 0) {
                i7 = 3;
            } else if (intValue == 1) {
                i7 = 4;
            } else if (intValue == 2) {
                i7 = 6;
            } else if (intValue == 3) {
                i7 = 7;
            } else if (intValue == 9) {
                i7 = 8;
            } else if (intValue == 18) {
                i7 = 5;
            }
        } catch (Throwable unused) {
        }
        h(new C1754w(b7, z4, i7, this.f17887E));
    }
}
