package G7;

import android.content.Context;

/* loaded from: classes9.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private Context f9739a;

    public final void a(Context context) {
        this.f9739a = context;
    }

    public final k b() {
        Context context = this.f9739a;
        if (context != null) {
            return new k(context);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
