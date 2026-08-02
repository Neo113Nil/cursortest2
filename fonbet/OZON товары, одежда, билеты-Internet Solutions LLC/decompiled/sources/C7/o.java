package C7;

import android.content.Context;

/* loaded from: classes.dex */
public final class o implements D7.c {

    /* renamed from: a, reason: collision with root package name */
    private final m f4446a;

    public o(m mVar) {
        this.f4446a = mVar;
    }

    public final Context a() {
        Context a11 = this.f4446a.a();
        if (a11 != null) {
            return a11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // D7.c
    public final Object zza() {
        Context a11 = this.f4446a.a();
        if (a11 != null) {
            return a11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
