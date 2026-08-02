package Bk;

import H8.g;
import S7.q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.fragment.app.ComponentCallbacksC5392m;
import b8.C5584d;
import c8.C5762a;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import java.util.Map;
import m3.r;
import org.joda.time.DateTime;
import u3.InterfaceC9928b;

/* renamed from: Bk.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2638a implements z.a, g.a, r.a {
    public static long a() {
        return new DateTime().getMillis();
    }

    public static String d(String str, ComponentCallbacksC5392m componentCallbacksC5392m, String str2) {
        return str + componentCallbacksC5392m + str2;
    }

    public static void e(StringBuilder sb2, String str, String str2, Map map, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(map);
        sb2.append(str3);
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return C5762a.a((C5584d) qVar);
    }

    @Override // H8.g.a
    public String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
