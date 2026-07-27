package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f8938a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8939b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8940c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8941d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8942e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8943a;

        /* renamed from: b, reason: collision with root package name */
        private String f8944b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f8945c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f8946d;

        /* renamed from: e, reason: collision with root package name */
        private String f8947e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f8943a, this.f8944b, this.f8945c, this.f8946d, this.f8947e, 0);
        }

        public Builder withClassName(String str) {
            this.f8943a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f8946d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f8944b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f8945c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f8947e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i3) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f8938a;
    }

    public Integer getColumn() {
        return this.f8941d;
    }

    public String getFileName() {
        return this.f8939b;
    }

    public Integer getLine() {
        return this.f8940c;
    }

    public String getMethodName() {
        return this.f8942e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f8938a = str;
        this.f8939b = str2;
        this.f8940c = num;
        this.f8941d = num2;
        this.f8942e = str3;
    }
}
