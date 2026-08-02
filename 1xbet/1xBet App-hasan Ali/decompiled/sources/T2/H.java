package T2;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.AbstractC1461q8;
import com.google.android.gms.internal.ads.Jt;
import q3.AbstractC2309b;

/* loaded from: classes.dex */
public final class H extends Jt {
    @Override // com.google.android.gms.internal.ads.Jt
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            P2.o oVar = P2.o.f4767B;
            L l5 = oVar.f4771c;
            Context context = oVar.f4774g.f8013e;
            if (context != null) {
                try {
                    if (((Boolean) AbstractC1461q8.f15106b.s()).booleanValue()) {
                        AbstractC2309b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e3) {
            P2.o.f4767B.f4774g.i("AdMobHandler.handleMessage", e3);
        }
    }
}
