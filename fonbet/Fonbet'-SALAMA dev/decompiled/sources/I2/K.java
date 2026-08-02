package I2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzfpq;

/* loaded from: classes.dex */
public final class K extends zzfpq {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e7) {
            E2.o.f1952C.f1961g.zzw(e7, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            P p5 = E2.o.f1952C.f1957c;
            Context zzd = E2.o.f1952C.f1961g.zzd();
            if (zzd != null) {
                try {
                    if (((Boolean) zzbeh.zzb.zze()).booleanValue()) {
                        m3.c.a(zzd, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
