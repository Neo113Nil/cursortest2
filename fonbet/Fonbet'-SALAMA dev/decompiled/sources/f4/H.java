package f4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f12924a = new H();

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }
}
