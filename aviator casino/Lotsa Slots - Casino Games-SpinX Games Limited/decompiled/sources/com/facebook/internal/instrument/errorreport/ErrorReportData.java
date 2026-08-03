package com.facebook.internal.instrument.errorreport;

/* compiled from: ErrorReportData.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportData;", "", "message", "", "(Ljava/lang/String;)V", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "errorMessage", io.ktor.http.ContentDisposition.Parameters.FileName, "isValid", "", "()Z", "parameters", "Lorg/json/JSONObject;", "getParameters", "()Lorg/json/JSONObject;", "timestamp", "", "Ljava/lang/Long;", "clear", "", "compareTo", "", "data", "save", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorReportData {
    private static final java.lang.String PARAM_TIMESTAMP = "timestamp";
    private static final java.lang.String PRARAM_ERROR_MESSAGE = "error_message";
    private java.lang.String errorMessage;
    private java.lang.String filename;
    private java.lang.Long timestamp;

    public ErrorReportData(java.lang.String str) {
        this.timestamp = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        this.errorMessage = str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(com.facebook.internal.instrument.InstrumentUtility.ERROR_REPORT_PREFIX);
        java.lang.Long l = this.timestamp;
        if (l == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        java.lang.String stringBuffer2 = stringBuffer.append(l.longValue()).append(".json").toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    public ErrorReportData(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.filename = name;
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        org.json.JSONObject readFile = com.facebook.internal.instrument.InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = java.lang.Long.valueOf(readFile.optLong("timestamp", 0L));
            this.errorMessage = readFile.optString("error_message", null);
        }
    }

    public final int compareTo(com.facebook.internal.instrument.errorreport.ErrorReportData data) {
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
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
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
            return super.toString();
        }
        java.lang.String jSONObject = parameters.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "params.toString()");
        return jSONObject;
    }

    public final org.json.JSONObject getParameters() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long l = this.timestamp;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
