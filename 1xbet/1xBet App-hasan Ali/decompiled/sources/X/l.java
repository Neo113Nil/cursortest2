package X;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6064a;

    static {
        long j5;
        try {
            j5 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j5 = -1;
        }
        f6064a = j5;
    }
}
