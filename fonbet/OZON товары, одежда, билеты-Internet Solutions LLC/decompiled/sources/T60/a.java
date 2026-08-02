package T60;

import C.o0;
import Kk.C3532b;
import androidx.recyclerview.widget.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.metrix.data.Event;
import ru.ozon.fintech.features.metrix.data.Geopoint;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26693a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26694b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26695c;

    /* renamed from: T60.a$a, reason: collision with other inner class name */
    public static final class C0533a extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26696d;

        public C0533a(long j11) {
            super("on_activity_create", j11, null);
            this.f26696d = j11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26696d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0533a) && this.f26696d == ((C0533a) obj).f26696d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26696d);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f26696d, ")", new StringBuilder("OnActivityCreate(timestamp="));
        }
    }

    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26697d;

        public b(long j11) {
            super("on_app_config_ready", j11, null);
            this.f26697d = j11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26697d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f26697d == ((b) obj).f26697d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26697d);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f26697d, ")", new StringBuilder("OnAppConfigReady(timestamp="));
        }
    }

    public static final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26698d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26699e;

        public c(long j11, boolean z11) {
            super("on_auth_logged", j11, null);
            this.f26698d = j11;
            this.f26699e = z11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26698d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f26698d == cVar.f26698d && this.f26699e == cVar.f26699e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f26699e) + (Long.hashCode(this.f26698d) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnAuthLogged(timestamp=");
            sb2.append(this.f26698d);
            sb2.append(", isNative=");
            return Pk0.a.a(")", sb2, this.f26699e);
        }
    }

    public static final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26700d;

        public d(long j11) {
            super("on_auth_pinpad_load", j11, null);
            this.f26700d = j11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26700d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f26700d == ((d) obj).f26700d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26700d);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f26700d, ")", new StringBuilder("OnAuthPinpadLoad(timestamp="));
        }
    }

    public static final class e extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26701d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26702e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final String f26703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j11, boolean z11, @NotNull String url) {
            super("on_pin_pad_displayed", j11, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f26701d = j11;
            this.f26702e = z11;
            this.f26703f = url;
        }

        @Override // T60.a
        public final long a() {
            return this.f26701d;
        }

        @Override // T60.a
        @NotNull
        public final String b() {
            return this.f26703f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f26701d == eVar.f26701d && this.f26702e == eVar.f26702e && Intrinsics.d(this.f26703f, eVar.f26703f);
        }

        public final int hashCode() {
            return this.f26703f.hashCode() + C3532b.a(Long.hashCode(this.f26701d) * 31, 31, this.f26702e);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPinPadDisplayed(timestamp=");
            sb2.append(this.f26701d);
            sb2.append(", isNative=");
            sb2.append(this.f26702e);
            sb2.append(", url=");
            return o0.c(sb2, this.f26703f, ")");
        }
    }

    public static final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26704d;

        public f(long j11) {
            super("on_process_start", j11, null);
            this.f26704d = j11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26704d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f26704d == ((f) obj).f26704d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26704d);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f26704d, ")", new StringBuilder("OnProcessStart(timestamp="));
        }
    }

    public static final class g extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26705d;

        public g(long j11) {
            super("on_splash_hided", j11, null);
            this.f26705d = j11;
        }

        @Override // T60.a
        public final long a() {
            return this.f26705d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f26705d == ((g) obj).f26705d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f26705d);
        }

        @NotNull
        public final String toString() {
            return P4.f.a(this.f26705d, ")", new StringBuilder("OnSplashHided(timestamp="));
        }
    }

    public static final class h extends a {

        /* renamed from: d, reason: collision with root package name */
        private final long f26706d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f26707e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j11, @NotNull String url) {
            super("on_target_interactive", j11, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f26706d = j11;
            this.f26707e = url;
        }

        @Override // T60.a
        public final long a() {
            return this.f26706d;
        }

        @Override // T60.a
        @NotNull
        public final String b() {
            return this.f26707e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f26706d == hVar.f26706d && Intrinsics.d(this.f26707e, hVar.f26707e);
        }

        public final int hashCode() {
            return this.f26707e.hashCode() + (Long.hashCode(this.f26706d) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTargetInteractive(timestamp=");
            sb2.append(this.f26706d);
            sb2.append(", url=");
            return o0.c(sb2, this.f26707e, ")");
        }
    }

    public a(String str, long j11, String str2) {
        this.f26693a = str;
        this.f26694b = j11;
        this.f26695c = str2;
    }

    public long a() {
        return this.f26694b;
    }

    public String b() {
        return this.f26695c;
    }

    @NotNull
    public final Event c(long j11, @NotNull String deviceTime) {
        Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
        String valueOf = String.valueOf(b());
        return new Event(deviceTime, this.f26693a, new Geopoint(Double.valueOf(0.0d), Double.valueOf(0.0d)), "", valueOf, "navigate", "navigate", 0L, m.e.DEFAULT_DRAG_ANIMATION_DURATION, "unknown", a() - j11);
    }
}
