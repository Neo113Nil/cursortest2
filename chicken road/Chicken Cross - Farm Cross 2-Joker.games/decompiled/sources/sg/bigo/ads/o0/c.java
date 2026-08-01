package sg.bigo.ads.o0;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class c {
    public static sg.bigo.ads.U.a a(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC5424a serviceConnectionC5424a = new ServiceConnectionC5424a(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, serviceConnectionC5424a, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                C5425b c5425b = new C5425b(serviceConnectionC5424a.a());
                String a2 = c5425b.a();
                Boolean b = c5425b.b();
                if (a2 != null) {
                    return new sg.bigo.ads.U.a(a2, b.booleanValue());
                }
                context.unbindService(serviceConnectionC5424a);
                return null;
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(serviceConnectionC5424a);
        }
    }
}
