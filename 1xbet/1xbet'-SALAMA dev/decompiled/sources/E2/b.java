package E2;

import I2.A;
import I2.P;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbwy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbwy f1910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbtw f1911d = new zzbtw(false, Collections.emptyList());

    public b(Context context, zzbwy zzbwyVar) {
        this.f1908a = context;
        this.f1910c = zzbwyVar;
    }

    public final void a(String str) {
        List<String> list;
        zzbtw zzbtwVar = this.f1911d;
        zzbwy zzbwyVar = this.f1910c;
        if ((zzbwyVar == null || !zzbwyVar.zza().zzf) && !zzbtwVar.zza) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzbwyVar != null) {
            zzbwyVar.zze(str, null, 3);
            return;
        }
        if (!zzbtwVar.zza || (list = zzbtwVar.zzb) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                P p5 = o.f1952C.f1957c;
                new A(this.f1908a, "", strReplace, null).zzb();
            }
        }
    }

    public final boolean b() {
        zzbwy zzbwyVar = this.f1910c;
        return ((zzbwyVar == null || !zzbwyVar.zza().zzf) && !this.f1911d.zza) || this.f1909b;
    }
}
