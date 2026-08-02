package com.plaid.internal;

/* renamed from: com.plaid.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC0624q6 {

    /* renamed from: com.plaid.internal.q6$a */
    public static final class a implements com.plaid.internal.InterfaceC0624q6 {

        /* renamed from: a, reason: collision with root package name */
        public final com.plaid.internal.AbstractC0678w7 f6546a;

        public a(com.plaid.internal.AbstractC0678w7 abstractC0678w7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0678w7, "");
            this.f6546a = abstractC0678w7;
        }

        public final com.plaid.internal.AbstractC0678w7 a() {
            return this.f6546a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.InterfaceC0624q6.a) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6546a, ((com.plaid.internal.InterfaceC0624q6.a) obj).f6546a);
        }

        public final int hashCode() {
            return this.f6546a.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fail(twilioVerifySnaException=");
            sb.append(this.f6546a);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.q6$b */
    public static final class b implements com.plaid.internal.InterfaceC0624q6 {

        /* renamed from: a, reason: collision with root package name */
        public final com.plaid.internal.C0541h4 f6547a;

        public b(com.plaid.internal.C0541h4 c0541h4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0541h4, "");
            this.f6547a = c0541h4;
        }

        public final com.plaid.internal.C0541h4 a() {
            return this.f6547a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.InterfaceC0624q6.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6547a, ((com.plaid.internal.InterfaceC0624q6.b) obj).f6547a);
        }

        public final int hashCode() {
            return this.f6547a.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(networkRequestResult=");
            sb.append(this.f6547a);
            sb.append(')');
            return sb.toString();
        }
    }
}
