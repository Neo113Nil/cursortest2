package P2;

import D6.y0;
import I2.P;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzddb;

/* loaded from: classes.dex */
public final class w implements zzddb {

    /* renamed from: a, reason: collision with root package name */
    public final o f5571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5572b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5573c;

    public w(o oVar, int i7, String str) {
        this.f5571a = oVar;
        this.f5572b = i7;
        this.f5573c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze(v vVar) {
        if (vVar == null || this.f5572b != 2 || TextUtils.isEmpty(this.f5573c)) {
            return;
        }
        y0 y0Var = new y0(15, this, vVar);
        I2.K k7 = P.f3579l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            y0Var.run();
        } else {
            zzbza.zza.execute(y0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
    }
}
