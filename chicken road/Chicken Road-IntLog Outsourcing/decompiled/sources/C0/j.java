package C0;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class j {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
