package j3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ads.Jt;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k extends Jt {

    /* renamed from: b, reason: collision with root package name */
    public final Context f17521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f17522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1, false);
        this.f17522c = eVar;
        this.f17521b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i5 = f.f17513a;
        e eVar = this.f17522c;
        Context context = this.f17521b;
        int c5 = eVar.c(context, i5);
        AtomicBoolean atomicBoolean = h.f17515a;
        if (c5 == 1 || c5 == 2 || c5 == 3 || c5 == 9) {
            Intent b3 = eVar.b(c5, context, "n");
            eVar.g(context, c5, b3 == null ? null : PendingIntent.getActivity(context, 0, b3, 201326592));
        }
    }
}
