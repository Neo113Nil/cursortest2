package W7;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f33294a = new C0589a();

    /* renamed from: W7.a$a, reason: collision with other inner class name */
    private static class C0589a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f33295a = new AtomicBoolean(false);

        C0589a() {
        }

        @Override // W7.b
        public final boolean getValue() {
            return this.f33295a.get();
        }
    }
}
