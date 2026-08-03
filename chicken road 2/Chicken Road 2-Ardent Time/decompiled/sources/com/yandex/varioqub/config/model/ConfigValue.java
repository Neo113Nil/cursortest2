package com.yandex.varioqub.config.model;

/* loaded from: classes.dex */
public final class ConfigValue {
    public static final boolean BOOLEAN_DEFAULT_VALUE = false;
    public static final double DOUBLE_DEFAULT_VALUE = 0.0d;
    public static final long LONG_DEFAULT_VALUE = 0;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_INAPP_DEFAULT = 1;
    public static final int SOURCE_SERVER = 2;
    public static final java.lang.String STRING_DEFAULT_VALUE = "";

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f2734a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2735b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2736c;
    public static final com.yandex.varioqub.config.model.ConfigValue.Companion Companion = new com.yandex.varioqub.config.model.ConfigValue.Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f2733d = java.util.regex.Pattern.compile("^(true|false)$", 2);

    public static final class Companion {
        private Companion() {
        }

        public final com.yandex.varioqub.config.model.ConfigValue createDefault$config_release() {
            return new com.yandex.varioqub.config.model.ConfigValue("", 0, 0L, 4, null);
        }

        public final com.yandex.varioqub.config.model.ConfigValue createInappDefault$config_release(java.lang.String str) {
            return new com.yandex.varioqub.config.model.ConfigValue(str, 1, 0L, 4, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public ConfigValue(java.lang.String str, int i2, long j2) {
        this.f2734a = str;
        this.f2735b = i2;
        this.f2736c = j2;
    }

    public final boolean asBoolean() {
        if (this.f2735b == 0) {
            return false;
        }
        java.util.regex.Pattern pattern = f2733d;
        java.lang.String str = this.f2734a;
        if (str == null) {
            str = "";
        }
        if (pattern.matcher(str).matches()) {
            return java.lang.Boolean.parseBoolean(this.f2734a);
        }
        if (this.f2735b == 1) {
            return false;
        }
        throw new java.lang.IllegalArgumentException(B1.a.j(new java.lang.StringBuilder("Value "), this.f2734a, " cannot be converted to type Boolean"));
    }

    public final double asDouble() {
        if (this.f2735b == 0) {
            return DOUBLE_DEFAULT_VALUE;
        }
        try {
            java.lang.String str = this.f2734a;
            return str != null ? java.lang.Double.parseDouble(str) : DOUBLE_DEFAULT_VALUE;
        } catch (java.lang.NumberFormatException unused) {
            if (this.f2735b == 1) {
                return DOUBLE_DEFAULT_VALUE;
            }
            throw new java.lang.IllegalArgumentException(B1.a.j(new java.lang.StringBuilder("Value "), this.f2734a, " cannot be converted to type Double"));
        }
    }

    public final long asLong() {
        if (this.f2735b == 0) {
            return 0L;
        }
        try {
            java.lang.String str = this.f2734a;
            if (str != null) {
                return java.lang.Long.parseLong(str);
            }
            return 0L;
        } catch (java.lang.NumberFormatException unused) {
            if (this.f2735b == 1) {
                return 0L;
            }
            throw new java.lang.IllegalArgumentException(B1.a.j(new java.lang.StringBuilder("Value "), this.f2734a, " cannot be converted to type Long"));
        }
    }

    public final java.lang.String asString() {
        java.lang.String str;
        return (this.f2735b == 0 || (str = this.f2734a) == null) ? "" : str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!com.yandex.varioqub.config.model.ConfigValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
        }
        com.yandex.varioqub.config.model.ConfigValue configValue = (com.yandex.varioqub.config.model.ConfigValue) obj;
        return kotlin.jvm.internal.i.a(this.f2734a, configValue.f2734a) && this.f2735b == configValue.f2735b && this.f2736c == configValue.f2736c;
    }

    public final int getSourceType() {
        return this.f2735b;
    }

    public final long getTestId() {
        return this.f2736c;
    }

    public final java.lang.String getValue() {
        return this.f2734a;
    }

    public int hashCode() {
        java.lang.String str = this.f2734a;
        return java.lang.Long.hashCode(this.f2736c) + ((((str != null ? str.hashCode() : 0) * 31) + this.f2735b) * 31);
    }

    public java.lang.String toString() {
        return "ConfigValue(value='" + this.f2734a + "', sourceType=" + this.f2735b + ", testId=" + this.f2736c + ')';
    }

    public /* synthetic */ ConfigValue(java.lang.String str, int i2, long j2, int i3, kotlin.jvm.internal.e eVar) {
        this(str, i2, (i3 & 4) != 0 ? -1L : j2);
    }
}
