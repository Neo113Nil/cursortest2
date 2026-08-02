package U6;

import android.content.Context;

/* loaded from: classes9.dex */
public final class c<T> implements b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27364a;

    private c(Context context) {
        this.f27364a = context;
    }

    public static c a(Context context) {
        if (context != null) {
            return new c(context);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // Pc.a
    public final T get() {
        return (T) this.f27364a;
    }
}
