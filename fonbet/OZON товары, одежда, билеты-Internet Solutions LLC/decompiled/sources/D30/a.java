package D30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: D30.a$a, reason: collision with other inner class name */
    public static final class C0130a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0130a f5764a = new C0130a(0);
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f5765a = new b(0);
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5766a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5767b;

        public c(String str, String str2) {
            super(0);
            this.f5766a = str;
            this.f5767b = str2;
        }

        public final String b() {
            return this.f5766a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f5766a, cVar.f5766a) && Intrinsics.d(this.f5767b, cVar.f5767b);
        }

        public final int hashCode() {
            String str = this.f5766a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f5767b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoodPassword(challengeID=");
            sb2.append(this.f5766a);
            sb2.append(", signToken=");
            return o0.c(sb2, this.f5767b, ")");
        }
    }

    public static final class d extends a implements D30.b {

        /* renamed from: a, reason: collision with root package name */
        private final D30.e f5768a;

        public d(D30.e eVar) {
            super(0);
            this.f5768a = eVar;
        }

        @Override // D30.b
        public final D30.e a() {
            return this.f5768a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f5768a, ((d) obj).f5768a);
        }

        public final int hashCode() {
            D30.e eVar = this.f5768a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "IncorrectPinCode(throttleStatus=" + this.f5768a + ")";
        }
    }

    public static final class e extends a implements D30.b {

        /* renamed from: a, reason: collision with root package name */
        private final D30.e f5769a;

        public e(D30.e eVar) {
            super(0);
            this.f5769a = eVar;
        }

        @Override // D30.b
        public final D30.e a() {
            return this.f5769a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f5769a, ((e) obj).f5769a);
        }

        public final int hashCode() {
            D30.e eVar = this.f5769a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "LoginThrottled(throttleStatus=" + this.f5769a + ")";
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f5770a = new f(0);
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f5771a = new g(0);
    }

    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f5772a = new h(0);
    }

    public static final class i extends a implements D30.b {

        /* renamed from: a, reason: collision with root package name */
        private final D30.e f5773a;

        public i(D30.e eVar) {
            super(0);
            this.f5773a = eVar;
        }

        @Override // D30.b
        public final D30.e a() {
            return this.f5773a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.d(this.f5773a, ((i) obj).f5773a);
        }

        public final int hashCode() {
            D30.e eVar = this.f5773a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "WrongPassword(throttleStatus=" + this.f5773a + ")";
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
