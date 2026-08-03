package com.facebook.internal.instrument;

/* compiled from: InstrumentData.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003,-.B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001b\b\u0012\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010%\u001a\u00020&J\u0011\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010*\u001a\u00020&J\b\u0010+\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0010\u0010 \u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", com.ironsource.X3.a.v, "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "anrCause", "", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "analysisReportParameters", "Lorg/json/JSONObject;", "getAnalysisReportParameters", "()Lorg/json/JSONObject;", "appVersion", "cause", "exceptionReportParameters", "getExceptionReportParameters", "featureNames", io.ktor.http.ContentDisposition.Parameters.FileName, "isValid", "", "()Z", "parameters", "getParameters", "stackTrace", "timestamp", "", "Ljava/lang/Long;", "type", "clear", "", "compareTo", "", "data", "save", "toString", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Type", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.instrument.InstrumentData.Companion INSTANCE = new com.facebook.internal.instrument.InstrumentData.Companion(null);
    private static final java.lang.String PARAM_APP_VERSION = "app_version";
    private static final java.lang.String PARAM_CALLSTACK = "callstack";
    private static final java.lang.String PARAM_DEVICE_MODEL = "device_model";
    private static final java.lang.String PARAM_DEVICE_OS = "device_os_version";
    private static final java.lang.String PARAM_FEATURE_NAMES = "feature_names";
    private static final java.lang.String PARAM_REASON = "reason";
    private static final java.lang.String PARAM_TIMESTAMP = "timestamp";
    private static final java.lang.String PARAM_TYPE = "type";
    private static final java.lang.String UNKNOWN = "Unknown";
    private java.lang.String appVersion;
    private java.lang.String cause;
    private org.json.JSONArray featureNames;
    private java.lang.String filename;
    private java.lang.String stackTrace;
    private java.lang.Long timestamp;
    private com.facebook.internal.instrument.InstrumentData.Type type;

    /* compiled from: InstrumentData.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.internal.instrument.InstrumentData.Type.valuesCustom().length];
            iArr[com.facebook.internal.instrument.InstrumentData.Type.Analysis.ordinal()] = 1;
            iArr[com.facebook.internal.instrument.InstrumentData.Type.AnrReport.ordinal()] = 2;
            iArr[com.facebook.internal.instrument.InstrumentData.Type.CrashReport.ordinal()] = 3;
            iArr[com.facebook.internal.instrument.InstrumentData.Type.CrashShield.ordinal()] = 4;
            iArr[com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(java.io.File file, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public /* synthetic */ InstrumentData(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(java.lang.Throwable th, com.facebook.internal.instrument.InstrumentData.Type type, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(org.json.JSONArray jSONArray, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    /* compiled from: InstrumentData.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: InstrumentData.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.facebook.internal.instrument.InstrumentData.Type.valuesCustom().length];
                iArr[com.facebook.internal.instrument.InstrumentData.Type.Analysis.ordinal()] = 1;
                iArr[com.facebook.internal.instrument.InstrumentData.Type.AnrReport.ordinal()] = 2;
                iArr[com.facebook.internal.instrument.InstrumentData.Type.CrashReport.ordinal()] = 3;
                iArr[com.facebook.internal.instrument.InstrumentData.Type.CrashShield.ordinal()] = 4;
                iArr[com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            int i = com.facebook.internal.instrument.InstrumentData.Type.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i == 4) {
                return "CrashShield";
            }
            if (i == 5) {
                return "ThreadCheck";
            }
            return "Unknown";
        }

        public final java.lang.String getLogPrefix() {
            int i = com.facebook.internal.instrument.InstrumentData.Type.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return com.facebook.internal.instrument.InstrumentUtility.ANALYSIS_REPORT_PREFIX;
            }
            if (i == 2) {
                return com.facebook.internal.instrument.InstrumentUtility.ANR_REPORT_PREFIX;
            }
            if (i == 3) {
                return com.facebook.internal.instrument.InstrumentUtility.CRASH_REPORT_PREFIX;
            }
            if (i == 4) {
                return com.facebook.internal.instrument.InstrumentUtility.CRASH_SHIELD_PREFIX;
            }
            if (i == 5) {
                return com.facebook.internal.instrument.InstrumentUtility.THREAD_CHECK_PREFIX;
            }
            return "Unknown";
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.internal.instrument.InstrumentData.Type[] valuesCustom() {
            com.facebook.internal.instrument.InstrumentData.Type[] valuesCustom = values();
            return (com.facebook.internal.instrument.InstrumentData.Type[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private InstrumentData(org.json.JSONArray jSONArray) {
        this.type = com.facebook.internal.instrument.InstrumentData.Type.Analysis;
        this.timestamp = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        this.featureNames = jSONArray;
        java.lang.String stringBuffer = new java.lang.StringBuffer(com.facebook.internal.instrument.InstrumentUtility.ANALYSIS_REPORT_PREFIX).append(java.lang.String.valueOf(this.timestamp)).append(".json").toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(java.lang.Throwable th, com.facebook.internal.instrument.InstrumentData.Type type) {
        this.type = type;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        this.appVersion = com.facebook.internal.Utility.getAppVersion();
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        this.cause = com.facebook.internal.instrument.InstrumentUtility.getCause(th);
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility2 = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        this.stackTrace = com.facebook.internal.instrument.InstrumentUtility.getStackTrace(th);
        this.timestamp = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        java.lang.String stringBuffer = new java.lang.StringBuffer().append(type.getLogPrefix()).append(java.lang.String.valueOf(this.timestamp)).append(".json").toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(java.lang.String str, java.lang.String str2) {
        this.type = com.facebook.internal.instrument.InstrumentData.Type.AnrReport;
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        this.appVersion = com.facebook.internal.Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        java.lang.String stringBuffer = new java.lang.StringBuffer(com.facebook.internal.instrument.InstrumentUtility.ANR_REPORT_PREFIX).append(java.lang.String.valueOf(this.timestamp)).append(".json").toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer;
    }

    private InstrumentData(java.io.File file) {
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        this.type = INSTANCE.getType(name);
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        org.json.JSONObject readFile = com.facebook.internal.instrument.InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = java.lang.Long.valueOf(readFile.optLong("timestamp", 0L));
            this.appVersion = readFile.optString(PARAM_APP_VERSION, null);
            this.cause = readFile.optString("reason", null);
            this.stackTrace = readFile.optString(PARAM_CALLSTACK, null);
            this.featureNames = readFile.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }

    public final int compareTo(com.facebook.internal.instrument.InstrumentData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        java.lang.Long l = this.timestamp;
        if (l == null) {
            return -1;
        }
        long longValue = l.longValue();
        java.lang.Long l2 = data.timestamp;
        if (l2 == null) {
            return 1;
        }
        return kotlin.jvm.internal.Intrinsics.compare(l2.longValue(), longValue);
    }

    public final boolean isValid() {
        com.facebook.internal.instrument.InstrumentData.Type type = this.type;
        int i = type == null ? -1 : com.facebook.internal.instrument.InstrumentData.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                    return false;
                }
            } else if ((i != 3 && i != 4 && i != 5) || this.stackTrace == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void save() {
        if (isValid()) {
            com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
            com.facebook.internal.instrument.InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public final void clear() {
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        com.facebook.internal.instrument.InstrumentUtility.deleteFile(this.filename);
    }

    public java.lang.String toString() {
        org.json.JSONObject parameters = getParameters();
        if (parameters == null) {
            java.lang.String jSONObject = new org.json.JSONObject().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        java.lang.String jSONObject2 = parameters.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    private final org.json.JSONObject getParameters() {
        com.facebook.internal.instrument.InstrumentData.Type type = this.type;
        int i = type == null ? -1 : com.facebook.internal.instrument.InstrumentData.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return getAnalysisReportParameters();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return getExceptionReportParameters();
        }
        return null;
    }

    private final org.json.JSONObject getAnalysisReportParameters() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            java.lang.Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private final org.json.JSONObject getExceptionReportParameters() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, android.os.Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, android.os.Build.MODEL);
            java.lang.String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            java.lang.Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            java.lang.String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            java.lang.String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            com.facebook.internal.instrument.InstrumentData.Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* compiled from: InstrumentData.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Builder;", "", "()V", "build", "Lcom/facebook/internal/instrument/InstrumentData;", "anrCause", "", "st", "e", "", "t", "Lcom/facebook/internal/instrument/InstrumentData$Type;", com.ironsource.X3.a.v, "Lorg/json/JSONArray;", "load", "file", "Ljava/io/File;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        public static final com.facebook.internal.instrument.InstrumentData.Builder INSTANCE = new com.facebook.internal.instrument.InstrumentData.Builder();

        private Builder() {
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.instrument.InstrumentData load(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            return new com.facebook.internal.instrument.InstrumentData(file, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.instrument.InstrumentData build(java.lang.Throwable e, com.facebook.internal.instrument.InstrumentData.Type t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            return new com.facebook.internal.instrument.InstrumentData(e, t, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.instrument.InstrumentData build(org.json.JSONArray features) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
            return new com.facebook.internal.instrument.InstrumentData(features, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.internal.instrument.InstrumentData build(java.lang.String anrCause, java.lang.String st) {
            return new com.facebook.internal.instrument.InstrumentData(anrCause, st, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    /* compiled from: InstrumentData.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "()V", "PARAM_APP_VERSION", "", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "getType", "Lcom/facebook/internal/instrument/InstrumentData$Type;", io.ktor.http.ContentDisposition.Parameters.FileName, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.internal.instrument.InstrumentData.Type getType(java.lang.String filename) {
            if (kotlin.text.StringsKt.startsWith$default(filename, com.facebook.internal.instrument.InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, (java.lang.Object) null)) {
                return com.facebook.internal.instrument.InstrumentData.Type.CrashReport;
            }
            if (kotlin.text.StringsKt.startsWith$default(filename, com.facebook.internal.instrument.InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, (java.lang.Object) null)) {
                return com.facebook.internal.instrument.InstrumentData.Type.CrashShield;
            }
            if (kotlin.text.StringsKt.startsWith$default(filename, com.facebook.internal.instrument.InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, (java.lang.Object) null)) {
                return com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck;
            }
            if (kotlin.text.StringsKt.startsWith$default(filename, com.facebook.internal.instrument.InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, (java.lang.Object) null)) {
                return com.facebook.internal.instrument.InstrumentData.Type.Analysis;
            }
            if (kotlin.text.StringsKt.startsWith$default(filename, com.facebook.internal.instrument.InstrumentUtility.ANR_REPORT_PREFIX, false, 2, (java.lang.Object) null)) {
                return com.facebook.internal.instrument.InstrumentData.Type.AnrReport;
            }
            return com.facebook.internal.instrument.InstrumentData.Type.Unknown;
        }
    }
}
