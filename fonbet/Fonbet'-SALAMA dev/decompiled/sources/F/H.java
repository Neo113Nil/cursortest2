package F;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f2425a;

    static {
        new HashSet();
    }

    public H(Context context) {
        this.f2425a = (NotificationManager) context.getSystemService("notification");
    }
}
