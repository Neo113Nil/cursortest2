package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ol1 extends bm1 {

    /* JADX INFO: renamed from: a */
    public final Context f5784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h90 f5785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol1(h90 h90Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f5785b = h90Var;
        this.f5784a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = i90.f3484a;
        h90 h90Var = this.f5785b;
        Context context = this.f5784a;
        int iM2575b = h90Var.m2575b(context, i2);
        int i3 = o90.f5673e;
        if (iM2575b == 1 || iM2575b == 2 || iM2575b == 3 || iM2575b == 9) {
            Intent intentM2574a = h90Var.m2574a(iM2575b, context, "n");
            h90Var.m2240f(context, iM2575b, intentM2574a == null ? null : PendingIntent.getActivity(context, 0, intentM2574a, 201326592));
        }
    }
}
