package O0;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f4892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4893c;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f4891a = true;
        f4892b = true;
        f4893c = i7 >= 28;
    }
}
