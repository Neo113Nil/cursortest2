package Cm;

import D1.InterfaceC2801g;
import He.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S7.r;
import T7.S;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.compose.foundation.layout.Y;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.F;
import com.google.gson.internal.l;
import com.google.gson.internal.o;
import io.sentry.android.core.util.a;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements AbstractC5887f.a, o, a.InterfaceC1104a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5158a;

    public /* synthetic */ e(int i11) {
        this.f5158a = i11;
    }

    public static androidx.constraintlayout.widget.d b(ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        return dVar;
    }

    public static String c(String str, int i11, String str2, String str3, int i12) {
        return str + i11 + str2 + i12 + str3;
    }

    public static StringBuilder e(double d11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(d11);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder g(int i11, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static Function2 h(C3969l c3969l, Y y11, C3969l c3969l2, A0 a02) {
        F1.b(c3969l, y11, InterfaceC2801g.a.e());
        F1.b(c3969l2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    public static void i(String str, String str2, String str3, StringBuilder sb2, List list) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    @Override // io.sentry.android.core.util.a.InterfaceC1104a
    public Object a(Context context) {
        PackageManager.ApplicationInfoFlags of2;
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of2 = PackageManager.ApplicationInfoFlags.of(128L);
            applicationInfo = packageManager.getApplicationInfo(packageName, of2);
            return applicationInfo;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public g d(F f7, r rVar) {
        switch (this.f5158a) {
            case 2:
                return S.d(f7);
            default:
                return U7.g.d(f7, rVar);
        }
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new l();
    }
}
