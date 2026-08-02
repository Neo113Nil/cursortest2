package M9;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f17717a = new AtomicBoolean();

    public static void a(Context context) {
        if (f17717a.getAndSet(true)) {
            return;
        }
        h.c(new b(context));
    }
}
