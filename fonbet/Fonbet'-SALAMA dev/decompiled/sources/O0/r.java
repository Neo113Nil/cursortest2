package O0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4891a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4892b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4893c;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f4891a = true;
        f4892b = true;
        f4893c = i7 >= 28;
    }
}
