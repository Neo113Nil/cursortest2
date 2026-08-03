package com.ironsource;

/* renamed from: com.ironsource.g7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3058g7 {

    /* renamed from: com.ironsource.g7$a */
    public interface a extends com.ironsource.InterfaceC3058g7 {

        /* renamed from: com.ironsource.g7$a$a, reason: collision with other inner class name */
        public static final class C0151a implements com.ironsource.InterfaceC3058g7.a {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Exception f6271a;

            public C0151a(java.lang.Exception exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                this.f6271a = exception;
            }

            public final com.ironsource.InterfaceC3058g7.a.C0151a a(java.lang.Exception exception) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                return new com.ironsource.InterfaceC3058g7.a.C0151a(exception);
            }

            @Override // com.ironsource.InterfaceC3058g7.a
            public boolean b() {
                return true;
            }

            public final java.lang.Exception c() {
                return this.f6271a;
            }

            public final java.lang.Exception d() {
                return this.f6271a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.ironsource.InterfaceC3058g7.a.C0151a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6271a, ((com.ironsource.InterfaceC3058g7.a.C0151a) obj).f6271a);
            }

            public int hashCode() {
                return this.f6271a.hashCode();
            }

            public java.lang.String toString() {
                return "Exception(exception=" + this.f6271a + ")";
            }

            public static /* synthetic */ com.ironsource.InterfaceC3058g7.a.C0151a a(com.ironsource.InterfaceC3058g7.a.C0151a c0151a, java.lang.Exception exc, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    exc = c0151a.f6271a;
                }
                return c0151a.a(exc);
            }

            @Override // com.ironsource.InterfaceC3058g7.a
            public java.lang.String a() {
                java.lang.String message = this.f6271a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* renamed from: com.ironsource.g7$a$b */
        public static final class b implements com.ironsource.InterfaceC3058g7.a {

            /* renamed from: a, reason: collision with root package name */
            private final int f6272a;
            private final java.lang.String b;

            public b(int i, java.lang.String str) {
                this.f6272a = i;
                this.b = str;
            }

            public final com.ironsource.InterfaceC3058g7.a.b a(int i, java.lang.String str) {
                return new com.ironsource.InterfaceC3058g7.a.b(i, str);
            }

            @Override // com.ironsource.InterfaceC3058g7.a
            public boolean b() {
                return this.f6272a != 400;
            }

            public final int c() {
                return this.f6272a;
            }

            public final java.lang.String d() {
                return this.b;
            }

            public final int e() {
                return this.f6272a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.InterfaceC3058g7.a.b)) {
                    return false;
                }
                com.ironsource.InterfaceC3058g7.a.b bVar = (com.ironsource.InterfaceC3058g7.a.b) obj;
                return this.f6272a == bVar.f6272a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b);
            }

            public final java.lang.String f() {
                return this.b;
            }

            public int hashCode() {
                int i = this.f6272a * 31;
                java.lang.String str = this.b;
                return i + (str == null ? 0 : str.hashCode());
            }

            public java.lang.String toString() {
                return "HttpError(errorCode=" + this.f6272a + ", errorMessage=" + this.b + ")";
            }

            public static /* synthetic */ com.ironsource.InterfaceC3058g7.a.b a(com.ironsource.InterfaceC3058g7.a.b bVar, int i, java.lang.String str, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f6272a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.b;
                }
                return bVar.a(i, str);
            }

            @Override // com.ironsource.InterfaceC3058g7.a
            public java.lang.String a() {
                int i = this.f6272a;
                java.lang.String str = this.b;
                if (str == null) {
                    str = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* renamed from: com.ironsource.g7$a$c */
        public static final class c implements com.ironsource.InterfaceC3058g7.a {
            @Override // com.ironsource.InterfaceC3058g7.a
            public java.lang.String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC3058g7.a
            public boolean b() {
                return true;
            }
        }

        java.lang.String a();

        boolean b();
    }

    /* renamed from: com.ironsource.g7$b */
    public static final class b implements com.ironsource.InterfaceC3058g7 {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6273a;

        public b(java.lang.String response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            this.f6273a = response;
        }

        public final com.ironsource.InterfaceC3058g7.b a(java.lang.String response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            return new com.ironsource.InterfaceC3058g7.b(response);
        }

        public final java.lang.String c() {
            return this.f6273a;
        }

        public final java.lang.String d() {
            return this.f6273a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC3058g7.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6273a, ((com.ironsource.InterfaceC3058g7.b) obj).f6273a);
        }

        public int hashCode() {
            return this.f6273a.hashCode();
        }

        public java.lang.String toString() {
            return "Success(response=" + this.f6273a + ")";
        }

        public static /* synthetic */ com.ironsource.InterfaceC3058g7.b a(com.ironsource.InterfaceC3058g7.b bVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f6273a;
            }
            return bVar.a(str);
        }
    }
}
