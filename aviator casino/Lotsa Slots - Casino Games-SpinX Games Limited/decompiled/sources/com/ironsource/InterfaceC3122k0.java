package com.ironsource;

/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3122k0 {

    /* renamed from: com.ironsource.k0$a */
    public static final class a implements com.ironsource.InterfaceC3122k0 {
        public static final com.ironsource.InterfaceC3122k0.a.C0152a c = new com.ironsource.InterfaceC3122k0.a.C0152a(null);

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6331a;
        private final boolean b;

        /* renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C0152a {
            public /* synthetic */ C0152a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.ironsource.InterfaceC3122k0.a a(java.lang.String str) {
                return new com.ironsource.InterfaceC3122k0.a(str);
            }

            private C0152a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final com.ironsource.InterfaceC3122k0.a a(java.lang.String str) {
            return new com.ironsource.InterfaceC3122k0.a(str);
        }

        public final java.lang.String b() {
            return this.f6331a;
        }

        public final java.lang.String c() {
            return this.f6331a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.InterfaceC3122k0.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6331a, ((com.ironsource.InterfaceC3122k0.a) obj).f6331a);
        }

        public int hashCode() {
            java.lang.String str = this.f6331a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public java.lang.String toString() {
            return "NotReady(reason=" + this.f6331a + ")";
        }

        public a(java.lang.String str) {
            this.f6331a = str;
        }

        public static /* synthetic */ com.ironsource.InterfaceC3122k0.a a(com.ironsource.InterfaceC3122k0.a aVar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f6331a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC3122k0
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: com.ironsource.k0$b */
    public static final class b implements com.ironsource.InterfaceC3122k0 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.InterfaceC3122k0.b f6332a = new com.ironsource.InterfaceC3122k0.b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC3122k0
        public boolean a() {
            return b;
        }
    }

    boolean a();
}
