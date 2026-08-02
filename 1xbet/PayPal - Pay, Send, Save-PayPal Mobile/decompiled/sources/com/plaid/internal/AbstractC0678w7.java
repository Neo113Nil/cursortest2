package com.plaid.internal;

/* renamed from: com.plaid.internal.w7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC0678w7 extends java.lang.Exception {

    /* renamed from: com.plaid.internal.w7$a */
    public static final class a extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.AbstractC0678w7.a f6611a = new com.plaid.internal.AbstractC0678w7.a();

        public a() {
            super("Cellular network not available.", "ConnectivityManager established that a cellular network is not available, running on a simulator or a device with no sim card is no supported.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$b */
    public static final class b extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.AbstractC0678w7.b f6612a = new com.plaid.internal.AbstractC0678w7.b();

        public b() {
            super("Invalid URL, please check the format.", "Unable to convert the URL string to an URL object.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$c */
    public static final class c extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Exception f6613a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(java.lang.Exception exc) {
            super(r0.toString(), null, exc, 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Networking error, cause: ");
            sb.append(exc.getMessage());
            this.f6613a = exc;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0678w7.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6613a, ((com.plaid.internal.AbstractC0678w7.c) obj).f6613a);
        }

        public final int hashCode() {
            return this.f6613a.hashCode();
        }

        @Override // java.lang.Throwable
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkRequestException(exception=");
            sb.append(this.f6613a);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.w7$d */
    public static final class d extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f6614a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(java.lang.String str) {
            super(r0.toString(), "Unable to get a redirection path or a result path from the URL, probably the SNAURL is corrupted (or maybe expired).", null, 4);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to get a valid result from the requested URL (");
            sb.append(str);
            sb.append(").");
            this.f6614a = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0678w7.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6614a, ((com.plaid.internal.AbstractC0678w7.d) obj).f6614a);
        }

        public final int hashCode() {
            return this.f6614a.hashCode();
        }

        @Override // java.lang.Throwable
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoResultFromUrl(result=");
            sb.append(this.f6614a);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: com.plaid.internal.w7$e */
    public static final class e extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.AbstractC0678w7.e f6615a = new com.plaid.internal.AbstractC0678w7.e();

        public e() {
            super("Can't run inside main thread.", null, null, 6);
        }
    }

    /* renamed from: com.plaid.internal.w7$f */
    public static final class f extends com.plaid.internal.AbstractC0678w7 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Exception f6616a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(java.lang.Exception exc) {
            super(r0.toString(), null, null, 6);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected error happened: ");
            sb.append(exc.getMessage());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            this.f6616a = exc;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.plaid.internal.AbstractC0678w7.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6616a, ((com.plaid.internal.AbstractC0678w7.f) obj).f6616a);
        }

        public final int hashCode() {
            return this.f6616a.hashCode();
        }

        @Override // java.lang.Throwable
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnexpectedException(exception=");
            sb.append(this.f6616a);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0678w7(java.lang.String str, java.lang.String str2, java.lang.Exception exc, int i) {
        super(kotlin.text.StringsKt.trimIndent(r6.toString()), exc);
        str2 = (i & 2) != 0 ? null : str2;
        exc = (i & 4) != 0 ? null : exc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n    ");
        sb.append(str);
        sb.append("\n    TechnicalError: ");
        sb.append(str2 == null ? "Undefined" : str2);
        sb.append("\n  ");
    }
}
