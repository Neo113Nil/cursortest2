package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7444a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f7445b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f7446c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f7447d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f7448e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f7449a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f7450b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.Integer f7451c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Integer f7452d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f7453e;

        public io.appmetrica.analytics.plugins.StackTraceItem build() {
            return new io.appmetrica.analytics.plugins.StackTraceItem(this.f7449a, this.f7450b, this.f7451c, this.f7452d, this.f7453e, 0);
        }

        public io.appmetrica.analytics.plugins.StackTraceItem.Builder withClassName(java.lang.String str) {
            this.f7449a = str;
            return this;
        }

        public io.appmetrica.analytics.plugins.StackTraceItem.Builder withColumn(java.lang.Integer num) {
            this.f7452d = num;
            return this;
        }

        public io.appmetrica.analytics.plugins.StackTraceItem.Builder withFileName(java.lang.String str) {
            this.f7450b = str;
            return this;
        }

        public io.appmetrica.analytics.plugins.StackTraceItem.Builder withLine(java.lang.Integer num) {
            this.f7451c = num;
            return this;
        }

        public io.appmetrica.analytics.plugins.StackTraceItem.Builder withMethodName(java.lang.String str) {
            this.f7453e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, int i2) {
        this(str, str2, num, num2, str3);
    }

    public java.lang.String getClassName() {
        return this.f7444a;
    }

    public java.lang.Integer getColumn() {
        return this.f7447d;
    }

    public java.lang.String getFileName() {
        return this.f7445b;
    }

    public java.lang.Integer getLine() {
        return this.f7446c;
    }

    public java.lang.String getMethodName() {
        return this.f7448e;
    }

    private StackTraceItem(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3) {
        this.f7444a = str;
        this.f7445b = str2;
        this.f7446c = num;
        this.f7447d = num2;
        this.f7448e = str3;
    }
}
