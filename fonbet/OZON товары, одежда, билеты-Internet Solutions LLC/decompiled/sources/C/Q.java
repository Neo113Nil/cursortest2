package C;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final Q f4125c;

    /* renamed from: a, reason: collision with root package name */
    private final float f4126a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4127b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private float f4128a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        private float f4129b = 0.0f;

        @NonNull
        public final Q a() {
            return new Q(this.f4128a, this.f4129b);
        }

        @NonNull
        public final void b() {
            this.f4129b = 1.0f;
        }

        @NonNull
        public final void c() {
            this.f4128a = 1.0f;
        }
    }

    static {
        a aVar = new a();
        aVar.c();
        aVar.b();
        f4125c = aVar.a();
    }

    Q(float f7, float f11) {
        this.f4126a = f7;
        this.f4127b = f11;
    }

    public final float a() {
        return this.f4127b;
    }

    public final float b() {
        return this.f4126a;
    }
}
