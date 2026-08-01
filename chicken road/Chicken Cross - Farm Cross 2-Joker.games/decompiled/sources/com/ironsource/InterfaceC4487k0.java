package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4487k0 {

    /* renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC4487k0 {
        public static final C1328a c = new C1328a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f8275a;
        private final boolean b;

        /* renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C1328a {
            public /* synthetic */ C1328a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }

            private C1328a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public final String b() {
            return this.f8275a;
        }

        public final String c() {
            return this.f8275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f8275a, ((a) obj).f8275a);
        }

        public int hashCode() {
            String str = this.f8275a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NotReady(reason=" + this.f8275a + ")";
        }

        public a(String str) {
            this.f8275a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f8275a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC4487k0
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC4487k0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8276a = new b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4487k0
        public boolean a() {
            return b;
        }
    }

    boolean a();
}
