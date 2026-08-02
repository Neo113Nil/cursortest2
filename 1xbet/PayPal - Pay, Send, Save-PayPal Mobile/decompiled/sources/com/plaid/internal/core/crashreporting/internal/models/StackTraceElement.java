package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "", "", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "function", "filename", "", "lineno", "", "in_app", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Ljava/lang/Boolean;", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StackTraceElement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.internal.core.crashreporting.internal.models.StackTraceElement.Companion INSTANCE = new com.plaid.internal.core.crashreporting.internal.models.StackTraceElement.Companion(null);
    private final java.lang.String filename;
    private final java.lang.String function;
    private final java.lang.Boolean in_app;
    private final int lineno;
    private final java.lang.String module;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement$Companion;", "", "<init>", "()V", "Ljava/lang/StackTraceElement;", "stackTraceElement", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "fromStackTraceElement", "(Ljava/lang/StackTraceElement;)Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "", "stackTraceElements", "fromStackTraceElements", "([Ljava/lang/StackTraceElement;)[Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[] fromStackTraceElements(java.lang.StackTraceElement[] stackTraceElements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElements, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(stackTraceElements.length);
            com.plaid.internal.C0452a6.a.c(com.plaid.internal.C0452a6.f5996a, "Sentry stack trace elements size:  ".concat(java.lang.String.valueOf(arrayList.size())));
            for (java.lang.StackTraceElement stackTraceElement : stackTraceElements) {
                if (stackTraceElement != null) {
                    arrayList.add(fromStackTraceElement(stackTraceElement));
                }
            }
            return (com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[]) arrayList.toArray(new com.plaid.internal.core.crashreporting.internal.models.StackTraceElement[0]);
        }

        private Companion() {
        }

        private final com.plaid.internal.core.crashreporting.internal.models.StackTraceElement fromStackTraceElement(java.lang.StackTraceElement stackTraceElement) {
            java.lang.String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
            java.lang.String methodName = stackTraceElement.getMethodName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName, "");
            java.lang.String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            java.lang.String className2 = stackTraceElement.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "");
            return new com.plaid.internal.core.crashreporting.internal.models.StackTraceElement(className, methodName, fileName, lineNumber, java.lang.Boolean.valueOf(kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className2, (java.lang.CharSequence) "com.plaid", false, 2, (java.lang.Object) null)));
        }
    }

    public StackTraceElement(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.module = str;
        this.function = str2;
        this.filename = str3;
        this.lineno = i;
        this.in_app = bool;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.internal.core.crashreporting.internal.models.StackTraceElement.class, other.getClass())) {
            return false;
        }
        com.plaid.internal.core.crashreporting.internal.models.StackTraceElement stackTraceElement = (com.plaid.internal.core.crashreporting.internal.models.StackTraceElement) other;
        return this.lineno == stackTraceElement.lineno && kotlin.jvm.internal.Intrinsics.areEqual(this.module, stackTraceElement.module) && kotlin.jvm.internal.Intrinsics.areEqual(this.function, stackTraceElement.function) && kotlin.jvm.internal.Intrinsics.areEqual(this.filename, stackTraceElement.filename) && kotlin.jvm.internal.Intrinsics.areEqual(this.in_app, stackTraceElement.in_app);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.module, this.function, this.filename, java.lang.Integer.valueOf(this.lineno));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.module;
        java.lang.String str2 = this.function;
        java.lang.String str3 = this.filename;
        int i = this.lineno;
        java.lang.Boolean bool = this.in_app;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryStackTraceElement{module='");
        sb.append(str);
        sb.append("', function='");
        sb.append(str2);
        sb.append("', filename='");
        sb.append(str3);
        sb.append("', lineno=");
        sb.append(i);
        sb.append(", in_app=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    public /* synthetic */ StackTraceElement(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Boolean bool, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? java.lang.Boolean.FALSE : bool);
    }
}
