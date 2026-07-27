package P0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class l extends b1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f1143b = eVar;
        this.f1142a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = f.f1133a;
        e eVar = this.f1143b;
        Context context = this.f1142a;
        int b3 = eVar.b(context, i4);
        int i5 = i.f1137c;
        if (b3 == 1 || b3 == 2 || b3 == 3 || b3 == 9) {
            Intent a3 = eVar.a(b3, context, "n");
            eVar.f(context, b3, a3 == null ? null : PendingIntent.getActivity(context, 0, a3, 201326592));
        }
    }
}
