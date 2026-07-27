package sg.bigo.ads.S;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12534a = true;

    public static void a(Context context, String str, a aVar, Runnable runnable) {
        if (!f12534a) {
            if (context == null || aVar == null) {
                return;
            }
            aVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e) {
            f12534a = false;
            if (context == null || aVar == null) {
                return;
            }
            aVar.a(context, str, 1, e.toString());
        } catch (Throwable th) {
            th.toString();
            if (context == null || aVar == null) {
                return;
            }
            aVar.a(context, str, 4, th.toString());
        }
    }
}
