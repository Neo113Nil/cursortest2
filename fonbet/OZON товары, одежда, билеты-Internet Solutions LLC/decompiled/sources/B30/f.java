package B30;

import C.o0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface f {

    public static abstract class a {

        /* renamed from: B30.f$a$a, reason: collision with other inner class name */
        public static final class C0055a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f2390a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0055a() {
                super(0);
                Intrinsics.checkNotNullParameter("Ошибка удаления данных из хранилища", "message");
                this.f2390a = "Ошибка удаления данных из хранилища";
            }

            @NotNull
            public final String a() {
                return this.f2390a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0055a) && Intrinsics.d(this.f2390a, ((C0055a) obj).f2390a);
            }

            public final int hashCode() {
                return this.f2390a.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("Error(message="), this.f2390a, ")");
            }
        }

        public static abstract class b extends a {

            /* renamed from: B30.f$a$b$a, reason: collision with other inner class name */
            public static final class C0056a extends b {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0056a f2391a = new C0056a(0);
            }

            public /* synthetic */ b(int i11) {
                this();
            }

            private b() {
                super(0);
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2392a;

        /* renamed from: b, reason: collision with root package name */
        private final Exception f2393b;

        public b(String str, Exception exc) {
            this.f2392a = str;
            this.f2393b = exc;
        }

        public final String a() {
            return this.f2392a;
        }

        public final Exception b() {
            return this.f2393b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f2392a, bVar.f2392a) && Intrinsics.d(this.f2393b, bVar.f2393b);
        }

        public final int hashCode() {
            String str = this.f2392a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Exception exc = this.f2393b;
            return hashCode + (exc != null ? exc.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "FastEntryReadResult(data=" + this.f2392a + ", exception=" + this.f2393b + ")";
        }
    }

    public interface c {

        public static abstract class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f2394a;

            /* renamed from: B30.f$c$a$a, reason: collision with other inner class name */
            public static final class C0057a extends a {

                /* renamed from: b, reason: collision with root package name */
                private final String f2395b;

                /* renamed from: c, reason: collision with root package name */
                private final String f2396c;

                public C0057a(String str, String str2) {
                    super(str == null ? "" : str);
                    this.f2395b = str;
                    this.f2396c = str2;
                }

                public final String b() {
                    return this.f2395b;
                }

                public final String c() {
                    return this.f2396c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0057a)) {
                        return false;
                    }
                    C0057a c0057a = (C0057a) obj;
                    return Intrinsics.d(this.f2395b, c0057a.f2395b) && Intrinsics.d(this.f2396c, c0057a.f2396c);
                }

                public final int hashCode() {
                    String str = this.f2395b;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f2396c;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Exception(rawExceptionMessage=");
                    sb2.append(this.f2395b);
                    sb2.append(", stackTrace=");
                    return o0.c(sb2, this.f2396c, ")");
                }
            }

            public static final class b extends a {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(@NotNull String msg) {
                    super(msg);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                }
            }

            public a(String str) {
                this.f2394a = str;
            }

            @NotNull
            public final String a() {
                return this.f2394a;
            }
        }

        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f2397a = new b();
        }
    }

    public static abstract class d {

        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f2398a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2399b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2400c;

            public /* synthetic */ a() {
                this("Токена не существует", null, null);
            }

            @NotNull
            public final String a() {
                return this.f2398a;
            }

            public final String b() {
                return this.f2399b;
            }

            public final String c() {
                return this.f2400c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f2398a, aVar.f2398a) && Intrinsics.d(this.f2399b, aVar.f2399b) && Intrinsics.d(this.f2400c, aVar.f2400c);
            }

            public final int hashCode() {
                int hashCode = this.f2398a.hashCode() * 31;
                String str = this.f2399b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f2400c;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(message=");
                sb2.append(this.f2398a);
                sb2.append(", rawExceptionMessage=");
                sb2.append(this.f2399b);
                sb2.append(", stackTrace=");
                return o0.c(sb2, this.f2400c, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, String str, String str2) {
                super(0);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f2398a = message;
                this.f2399b = str;
                this.f2400c = str2;
            }
        }

        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            private final String f2401a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2402b;

            public b(String str, String str2) {
                super(0);
                this.f2401a = str;
                this.f2402b = str2;
            }

            public final String a() {
                return this.f2401a;
            }

            public final String b() {
                return this.f2402b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.d(this.f2401a, bVar.f2401a) && Intrinsics.d(this.f2402b, bVar.f2402b);
            }

            public final int hashCode() {
                String str = this.f2401a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f2402b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InvalidatedKey(rawExceptionMessage=");
                sb2.append(this.f2401a);
                sb2.append(", stackTrace=");
                return o0.c(sb2, this.f2402b, ")");
            }
        }

        public static abstract class c extends d {

            public static final class a extends c {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final String f2403a;

                /* renamed from: b, reason: collision with root package name */
                private final String f2404b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(@NotNull String token, String str) {
                    super(0);
                    Intrinsics.checkNotNullParameter(token, "token");
                    this.f2403a = token;
                    this.f2404b = str;
                }

                public final String a() {
                    return this.f2404b;
                }

                @NotNull
                public final String b() {
                    return this.f2403a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.d(this.f2403a, aVar.f2403a) && Intrinsics.d(this.f2404b, aVar.f2404b);
                }

                public final int hashCode() {
                    int hashCode = this.f2403a.hashCode() * 31;
                    String str = this.f2404b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Done(token=");
                    sb2.append(this.f2403a);
                    sb2.append(", storageLogData=");
                    return o0.c(sb2, this.f2404b, ")");
                }
            }

            public /* synthetic */ c(int i11) {
                this();
            }

            private c() {
                super(0);
            }
        }

        /* renamed from: B30.f$d$d, reason: collision with other inner class name */
        public static final class C0058d extends d {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0058d f2405a = new C0058d(0);
        }

        public /* synthetic */ d(int i11) {
            this();
        }

        private d() {
        }
    }

    public static abstract class e {

        public static final class a extends e {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "Error(message=null)";
            }
        }

        public static abstract class b extends e {

            public static final class a extends b {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f2406a = new a(0);
            }

            /* renamed from: B30.f$e$b$b, reason: collision with other inner class name */
            public static final class C0059b extends b {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0059b f2407a = new C0059b(0);
            }

            public /* synthetic */ b(int i11) {
                this();
            }

            private b() {
                super(0);
            }
        }

        public /* synthetic */ e(int i11) {
            this();
        }

        private e() {
        }
    }

    /* renamed from: B30.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0060f {

        /* renamed from: B30.f$f$a */
        public static final class a extends AbstractC0060f {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f2408a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2409b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2410c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, String str, String str2) {
                super(0);
                Intrinsics.checkNotNullParameter(message, "message");
                this.f2408a = message;
                this.f2409b = str;
                this.f2410c = str2;
            }

            @NotNull
            public final String a() {
                return this.f2408a;
            }

            public final String b() {
                return this.f2409b;
            }

            public final String c() {
                return this.f2410c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f2408a, aVar.f2408a) && Intrinsics.d(this.f2409b, aVar.f2409b) && Intrinsics.d(this.f2410c, aVar.f2410c);
            }

            public final int hashCode() {
                int hashCode = this.f2408a.hashCode() * 31;
                String str = this.f2409b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f2410c;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(message=");
                sb2.append(this.f2408a);
                sb2.append(", rawExceptionMessage=");
                sb2.append(this.f2409b);
                sb2.append(", stackTrace=");
                return o0.c(sb2, this.f2410c, ")");
            }
        }

        /* renamed from: B30.f$f$b */
        public static final class b extends AbstractC0060f {

            /* renamed from: a, reason: collision with root package name */
            private final String f2411a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2412b;

            public b(String str, String str2) {
                super(0);
                this.f2411a = str;
                this.f2412b = str2;
            }

            public final String a() {
                return this.f2411a;
            }

            public final String b() {
                return this.f2412b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.d(this.f2411a, bVar.f2411a) && Intrinsics.d(this.f2412b, bVar.f2412b);
            }

            public final int hashCode() {
                String str = this.f2411a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f2412b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InvalidatedKey(rawExceptionMessage=");
                sb2.append(this.f2411a);
                sb2.append(", stackTrace=");
                return o0.c(sb2, this.f2412b, ")");
            }
        }

        /* renamed from: B30.f$f$c */
        public static abstract class c extends AbstractC0060f {

            /* renamed from: B30.f$f$c$a */
            public static final class a extends c {

                /* renamed from: a, reason: collision with root package name */
                private final String f2413a;

                public a(String str) {
                    super(0);
                    this.f2413a = str;
                }

                public final String a() {
                    return this.f2413a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && Intrinsics.d(this.f2413a, ((a) obj).f2413a);
                }

                public final int hashCode() {
                    String str = this.f2413a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                @NotNull
                public final String toString() {
                    return o0.c(new StringBuilder("Done(storageLogData="), this.f2413a, ")");
                }
            }

            public /* synthetic */ c(int i11) {
                this();
            }

            private c() {
                super(0);
            }
        }

        /* renamed from: B30.f$f$d */
        public static final class d extends AbstractC0060f {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f2414a = new d(0);
        }

        public /* synthetic */ AbstractC0060f(int i11) {
            this();
        }

        private AbstractC0060f() {
        }
    }

    @NotNull
    b a(@NotNull String str);

    void b(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull String str, @NotNull P70.c cVar);

    void c(@NotNull androidx.fragment.app.r rVar, @NotNull String str, @NotNull Function1<? super d, Unit> function1, @NotNull String str2);

    void d(@NotNull androidx.fragment.app.r rVar, @NotNull String str, @NotNull String str2, @NotNull B60.l lVar, @NotNull String str3);

    void e(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull String str, @NotNull String str2, @NotNull P70.i iVar);

    void f(@NotNull androidx.fragment.app.r rVar, String str, boolean z11, A30.d dVar);

    void g(@NotNull String str, @NotNull Function1<? super a, Unit> function1);

    @NotNull
    c h(@NotNull String str, @NotNull String str2, boolean z11);

    @NotNull
    String i(@NotNull String str);

    void j(@NotNull String str, @NotNull Function1<? super e, Unit> function1);
}
