package com.plaid.internal;

/* loaded from: classes16.dex */
public abstract class D6 {

    public static final class a extends com.plaid.internal.D6 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f5770a;

        public a(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.f5770a = str;
        }

        public final java.lang.String a() {
            return this.f5770a;
        }

        public final java.lang.String toString() {
            return io.ktor.http.auth.AuthScheme.OAuth;
        }
    }

    public static final class b extends com.plaid.internal.D6 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f5771a;

        public b(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.f5771a = str;
        }

        public final java.lang.String toString() {
            return "OutOfProcess";
        }
    }

    public static final class c extends com.plaid.internal.D6 {
        public final java.lang.String toString() {
            return "OutOfProcessClosed";
        }
    }

    public static final class d extends com.plaid.internal.D6 {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.Exception f5772a;

        public d(java.lang.Exception exc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.f5772a = exc;
        }

        public final java.lang.Exception a() {
            return this.f5772a;
        }

        public final java.lang.String toString() {
            return "RedirectError";
        }
    }

    public static final class e extends com.plaid.internal.D6 {
        public final java.lang.String toString() {
            return "ResumeInProcess";
        }
    }
}
