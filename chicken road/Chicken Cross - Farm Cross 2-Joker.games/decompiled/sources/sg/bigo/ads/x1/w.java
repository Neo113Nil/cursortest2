package sg.bigo.ads.x1;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class w {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f13406a;
    public final sg.bigo.ads.P.u b;
    public final String c;
    public final String d;
    public final int h;
    public final boolean i;
    public final int[] f = {0, 30000, 300000};
    public int g = 0;
    public final String e = "bigoad";

    public w(HashMap hashMap, sg.bigo.ads.P.u uVar, int i, String str, String str2, boolean z) {
        this.f13406a = hashMap;
        this.b = uVar;
        this.c = str;
        this.d = str2;
        this.h = i;
        this.i = z;
    }

    public static String a(String str) {
        return (str == null || str.length() < 40) ? str : str.substring(0, 20) + "..." + str.substring(str.length() - 10);
    }

    public final void a(Context context, int i) {
        if (i >= 3) {
            a(this.d);
            return;
        }
        int[] iArr = this.f;
        int i2 = iArr[i % iArr.length];
        if (i2 <= 0) {
            a(this.d);
            sg.bigo.ads.w1.d.a(context, 0, this.c, new sg.bigo.ads.B0.d(this.d), this.e, this.i, this.h, false, this.g, this.f13406a, new v(this, context));
        } else {
            a(this.d);
            AbstractC5446j.a(1, null, new u(this, context), i2);
        }
    }
}
