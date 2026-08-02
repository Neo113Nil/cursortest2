package Ds;

import AZ.a;
import com.google.android.gms.internal.mlkit_common.zzay;
import r8.c;
import ru.ozon.app.android.di.module.NavigationDependenciesModule;

/* renamed from: Ds.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2880a implements AZ.a {
    public static c.a b(int i11, c.a aVar, String str) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i11);
        aVar.b(zzayVar.zzb());
        aVar.a();
        return c.a(str);
    }

    public static void c(String str, String str2, String str3, StringBuilder sb2, boolean z11) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(z11);
        sb2.append(str3);
    }

    @Override // AZ.a
    public void a(a.C0019a c0019a) {
        NavigationDependenciesModule.provideNavigationConfig$lambda$1(c0019a);
    }
}
