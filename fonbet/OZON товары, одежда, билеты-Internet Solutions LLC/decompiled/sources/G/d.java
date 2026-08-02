package G;

import android.os.Build;
import android.util.CloseGuard;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f9602a;

    static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final CloseGuard f9603a = new CloseGuard();

        a() {
        }

        @Override // G.d.b
        public final void a(@NonNull String str) {
            this.f9603a.open(str);
        }

        @Override // G.d.b
        public final void b() {
            this.f9603a.warnIfOpen();
        }

        @Override // G.d.b
        public final void close() {
            this.f9603a.close();
        }
    }

    private interface b {
        void a(@NonNull String str);

        void b();

        void close();
    }

    static final class c implements b {
        @Override // G.d.b
        public final void a(@NonNull String str) {
        }

        @Override // G.d.b
        public final void b() {
        }

        @Override // G.d.b
        public final void close() {
        }
    }

    private d(b bVar) {
        this.f9602a = bVar;
    }

    @NonNull
    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public final void a() {
        this.f9602a.close();
    }

    public final void c(@NonNull String str) {
        this.f9602a.a(str);
    }

    public final void d() {
        this.f9602a.b();
    }
}
