package com.ironsource;

/* renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3162m4 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Throwable f6385a;
    private final java.lang.String b;
    private final boolean c;

    public C3162m4(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f6385a = throwable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(java.lang.System.lineSeparator());
        boolean z = false;
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + java.lang.System.lineSeparator());
            java.lang.String stackTraceElement2 = stackTraceElement.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "elem.toString()");
            java.lang.String e = com.ironsource.C3180n4.d().e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getInstance().keyword");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) stackTraceElement2, (java.lang.CharSequence) e, false, 2, (java.lang.Object) null)) {
                z = true;
            }
        }
        java.lang.Throwable cause = this.f6385a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(java.lang.System.lineSeparator());
            sb.append(cause.toString());
            sb.append(java.lang.System.lineSeparator());
            java.lang.StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (java.lang.StackTraceElement stackTraceElement3 : stackTrace2) {
                sb.append(stackTraceElement3.toString());
                sb.append(";" + java.lang.System.lineSeparator());
                java.lang.String stackTraceElement4 = stackTraceElement3.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTraceElement4, "elem.toString()");
                java.lang.String e2 = com.ironsource.C3180n4.d().e();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "getInstance().keyword");
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) stackTraceElement4, (java.lang.CharSequence) e2, false, 2, (java.lang.Object) null)) {
                    z = true;
                }
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        this.b = sb2;
        this.c = z;
    }

    public final java.lang.Throwable a() {
        return this.f6385a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.Throwable c() {
        return this.f6385a;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.C3162m4) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6385a, ((com.ironsource.C3162m4) obj).f6385a);
    }

    public int hashCode() {
        return this.f6385a.hashCode();
    }

    public java.lang.String toString() {
        return "CrashReportWrapper(throwable=" + this.f6385a + ")";
    }

    public final com.ironsource.C3162m4 a(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new com.ironsource.C3162m4(throwable);
    }

    public static /* synthetic */ com.ironsource.C3162m4 a(com.ironsource.C3162m4 c3162m4, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = c3162m4.f6385a;
        }
        return c3162m4.a(th);
    }
}
