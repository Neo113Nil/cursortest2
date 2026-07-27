package l1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;

/* loaded from: classes.dex */
public final class l extends A1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.f11020b = fVar;
        this.f11019a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i3 = g.f11011a;
        f fVar = this.f11020b;
        Context context = this.f11019a;
        int b6 = fVar.b(context, i3);
        int i6 = i.f11015c;
        if (b6 == 1 || b6 == 2 || b6 == 3 || b6 == 9) {
            Intent a6 = fVar.a(context, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, b6);
            fVar.f(context, b6, a6 == null ? null : PendingIntent.getActivity(context, 0, a6, 201326592));
        }
    }
}
