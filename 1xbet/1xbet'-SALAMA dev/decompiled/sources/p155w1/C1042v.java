package p155w1;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.C0815k;

/* JADX INFO: renamed from: w1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042v extends G2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f17889A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f17890B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17891C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f17892D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public I f17893E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1039u f17894F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public K f17895G;

    public final void j() {
        if (TextUtils.isEmpty(this.f17889A) || this.f17893E == null) {
            return;
        }
        String strB = C0815k.a().b();
        boolean z4 = this.f17891C;
        Context context = AbstractC0998i1.f17749c;
        int i7 = 1;
        try {
            Object obj = c.f11214c;
            Integer num = (Integer) c.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(c.class.getMethod("getInstance", null).invoke(null, null), context);
            int iIntValue = num != null ? num.intValue() : -1;
            if (iIntValue == 0) {
                i7 = 3;
            } else if (iIntValue == 1) {
                i7 = 4;
            } else if (iIntValue == 2) {
                i7 = 6;
            } else if (iIntValue == 3) {
                i7 = 7;
            } else if (iIntValue == 9) {
                i7 = 8;
            } else if (iIntValue == 18) {
                i7 = 5;
            }
        } catch (Throwable unused) {
        }
        h(new C1045w(strB, z4, i7, this.f17893E));
    }
}
