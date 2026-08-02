package b3;

import W2.g;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0780a extends l {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        g gVar = new g(4);
        zzb = gVar;
        zzc = new i("SmsRetriever.API", gVar, hVar);
    }

    public AbstractC0780a(Activity activity) {
        super(activity, activity, zzc, e.f11086o, k.f11205c);
    }

    public AbstractC0780a(Context context) {
        super(context, null, zzc, e.f11086o, k.f11205c);
    }
}
