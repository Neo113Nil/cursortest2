package I2;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfhq;

/* loaded from: classes.dex */
public final class A extends AbstractC0308p {

    /* renamed from: a, reason: collision with root package name */
    public final J2.n f3522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3523b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.o f3524c;

    public A(Context context, String str, String str2, J2.o oVar) {
        this.f3522a = new J2.n(E2.o.f1952C.f1957c.x(context, str));
        this.f3523b = str2;
        this.f3524c = oVar;
    }

    @Override // I2.AbstractC0308p
    public final void zza() {
        String str = this.f3523b;
        J2.n nVar = this.f3522a;
        J2.o oVar = this.f3524c;
        if (oVar == null) {
            nVar.zza(str);
        } else {
            new zzfhq(oVar.f3833a, nVar, zzbza.zze, null).zzd(str);
        }
    }
}
