package com.ironsource;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4369d7 {

    /* renamed from: com.ironsource.d7$a */
    public interface a extends InterfaceC4369d7 {

        /* renamed from: com.ironsource.d7$a$a, reason: collision with other inner class name */
        public static final class C1323a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final Exception f8135a;

            public C1323a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f8135a = exception;
            }

            public final C1323a a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C1323a(exception);
            }

            @Override // com.ironsource.InterfaceC4369d7.a
            public boolean b() {
                return true;
            }

            public final Exception c() {
                return this.f8135a;
            }

            public final Exception d() {
                return this.f8135a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1323a) && Intrinsics.areEqual(this.f8135a, ((C1323a) obj).f8135a);
            }

            public int hashCode() {
                return this.f8135a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.f8135a + ")";
            }

            public static /* synthetic */ C1323a a(C1323a c1323a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c1323a.f8135a;
                }
                return c1323a.a(exc);
            }

            @Override // com.ironsource.InterfaceC4369d7.a
            public String a() {
                String message = this.f8135a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* renamed from: com.ironsource.d7$a$b */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final int f8136a;
            private final String b;

            public b(int i, String str) {
                this.f8136a = i;
                this.b = str;
            }

            public final b a(int i, String str) {
                return new b(i, str);
            }

            @Override // com.ironsource.InterfaceC4369d7.a
            public boolean b() {
                return this.f8136a != 400;
            }

            public final int c() {
                return this.f8136a;
            }

            public final String d() {
                return this.b;
            }

            public final int e() {
                return this.f8136a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f8136a == bVar.f8136a && Intrinsics.areEqual(this.b, bVar.b);
            }

            public final String f() {
                return this.b;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f8136a) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.f8136a + ", errorMessage=" + this.b + ")";
            }

            public static /* synthetic */ b a(b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f8136a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.b;
                }
                return bVar.a(i, str);
            }

            @Override // com.ironsource.InterfaceC4369d7.a
            public String a() {
                int i = this.f8136a;
                String str = this.b;
                if (str == null) {
                    str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* renamed from: com.ironsource.d7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4369d7.a
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4369d7.a
            public boolean b() {
                return true;
            }
        }

        String a();

        boolean b();
    }

    /* renamed from: com.ironsource.d7$b */
    public static final class b implements InterfaceC4369d7 {

        /* renamed from: a, reason: collision with root package name */
        private final String f8137a;

        public b(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f8137a = response;
        }

        public final b a(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        public final String c() {
            return this.f8137a;
        }

        public final String d() {
            return this.f8137a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f8137a, ((b) obj).f8137a);
        }

        public int hashCode() {
            return this.f8137a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.f8137a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f8137a;
            }
            return bVar.a(str);
        }
    }
}
