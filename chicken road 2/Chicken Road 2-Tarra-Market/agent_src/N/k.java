package N;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class k extends Z.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f250b = eVar;
        this.f249a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i3 = f.f242a;
        e eVar = this.f250b;
        Context context = this.f249a;
        int b2 = eVar.b(context, i3);
        int i4 = h.f246c;
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
            Intent a2 = eVar.a(context, "n", b2);
            eVar.f(context, b2, a2 == null ? null : PendingIntent.getActivity(context, 0, a2, 201326592));
        }
    }
}
