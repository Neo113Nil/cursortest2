package com.facebook.internal.instrument;

/* compiled from: InstrumentUtility.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0007¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0007¢\u0006\u0002\u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0007¢\u0006\u0002\u0010!J\u001c\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\u0010H\u0007J$\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J\u001c\u0010.\u001a\u00020(2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentUtility;", "", "()V", "ANALYSIS_REPORT_PREFIX", "", "ANR_REPORT_PREFIX", "CODELESS_PREFIX", "CRASH_REPORT_PREFIX", "CRASH_SHIELD_PREFIX", "ERROR_REPORT_PREFIX", "FBSDK_PREFIX", "INSTRUMENT_DIR", "METASDK_PREFIX", "SUGGESTED_EVENTS_PREFIX", "THREAD_CHECK_PREFIX", "deleteFile", "", io.ktor.http.ContentDisposition.Parameters.FileName, "getCause", "e", "", "getInstrumentReportDir", "Ljava/io/File;", "getStackTrace", "thread", "Ljava/lang/Thread;", "isFromFbOrMeta", "element", "Ljava/lang/StackTraceElement;", "isSDKRelatedException", "isSDKRelatedThread", "listAnrReportFiles", "", "()[Ljava/io/File;", "listExceptionAnalysisReportFiles", "listExceptionReportFiles", "readFile", "Lorg/json/JSONObject;", "deleteOnException", "sendReports", "", com.ironsource.X3.i.W, "reports", "Lorg/json/JSONArray;", "callback", "Lcom/facebook/GraphRequest$Callback;", "writeFile", "content", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentUtility {
    public static final java.lang.String ANALYSIS_REPORT_PREFIX = "analysis_log_";
    public static final java.lang.String ANR_REPORT_PREFIX = "anr_log_";
    private static final java.lang.String CODELESS_PREFIX = "com.facebook.appevents.codeless";
    public static final java.lang.String CRASH_REPORT_PREFIX = "crash_log_";
    public static final java.lang.String CRASH_SHIELD_PREFIX = "shield_log_";
    public static final java.lang.String ERROR_REPORT_PREFIX = "error_log_";
    private static final java.lang.String FBSDK_PREFIX = "com.facebook";
    public static final com.facebook.internal.instrument.InstrumentUtility INSTANCE = new com.facebook.internal.instrument.InstrumentUtility();
    private static final java.lang.String INSTRUMENT_DIR = "instrument";
    private static final java.lang.String METASDK_PREFIX = "com.meta";
    private static final java.lang.String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";
    public static final java.lang.String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCause(java.lang.Throwable e) {
        if (e == null) {
            return null;
        }
        if (e.getCause() == null) {
            return e.toString();
        }
        return java.lang.String.valueOf(e.getCause());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getStackTrace(java.lang.Throwable e) {
        java.lang.Throwable th = null;
        if (e == null) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        while (e != null && e != th) {
            java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                java.lang.StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                jSONArray.put(stackTraceElement.toString());
            }
            th = e;
            e = e.getCause();
        }
        return jSONArray.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getStackTrace(java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "thread");
        java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isSDKRelatedException(java.lang.Throwable e) {
        if (e == null) {
            return false;
        }
        java.lang.Throwable th = null;
        while (e != null && e != th) {
            java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                java.lang.StackTraceElement element = stackTrace[i];
                i++;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(element, "element");
                if (isFromFbOrMeta(element)) {
                    return true;
                }
            }
            th = e;
            e = e.getCause();
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isSDKRelatedThread(java.lang.Thread thread) {
        java.lang.StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (java.lang.StackTraceElement element : stackTrace) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(element, "element");
                if (isFromFbOrMeta(element)) {
                    java.lang.String className = element.getClassName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!kotlin.text.StringsKt.startsWith$default(className, CODELESS_PREFIX, false, 2, (java.lang.Object) null)) {
                        java.lang.String className2 = element.getClassName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!kotlin.text.StringsKt.startsWith$default(className2, SUGGESTED_EVENTS_PREFIX, false, 2, (java.lang.Object) null)) {
                            return true;
                        }
                    }
                    java.lang.String methodName = element.getMethodName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (kotlin.text.StringsKt.startsWith$default(methodName, "onClick", false, 2, (java.lang.Object) null)) {
                        continue;
                    } else {
                        java.lang.String methodName2 = element.getMethodName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (kotlin.text.StringsKt.startsWith$default(methodName2, "onItemClick", false, 2, (java.lang.Object) null)) {
                            continue;
                        } else {
                            java.lang.String methodName3 = element.getMethodName();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!kotlin.text.StringsKt.startsWith$default(methodName3, "onTouch", false, 2, (java.lang.Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File[] listAnrReportFiles() {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new java.io.File[0];
        }
        java.io.File[] listFiles = instrumentReportDir.listFiles(new java.io.FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5211listAnrReportFiles$lambda1;
                m5211listAnrReportFiles$lambda1 = com.facebook.internal.instrument.InstrumentUtility.m5211listAnrReportFiles$lambda1(file, str);
                return m5211listAnrReportFiles$lambda1;
            }
        });
        return listFiles == null ? new java.io.File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: listAnrReportFiles$lambda-1, reason: not valid java name */
    public static final boolean m5211listAnrReportFiles$lambda1(java.io.File file, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("^%s[0-9]+.json$", java.util.Arrays.copyOf(new java.lang.Object[]{ANR_REPORT_PREFIX}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new kotlin.text.Regex(format).matches(name);
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File[] listExceptionAnalysisReportFiles() {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new java.io.File[0];
        }
        java.io.File[] listFiles = instrumentReportDir.listFiles(new java.io.FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda2
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5212listExceptionAnalysisReportFiles$lambda2;
                m5212listExceptionAnalysisReportFiles$lambda2 = com.facebook.internal.instrument.InstrumentUtility.m5212listExceptionAnalysisReportFiles$lambda2(file, str);
                return m5212listExceptionAnalysisReportFiles$lambda2;
            }
        });
        return listFiles == null ? new java.io.File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: listExceptionAnalysisReportFiles$lambda-2, reason: not valid java name */
    public static final boolean m5212listExceptionAnalysisReportFiles$lambda2(java.io.File file, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("^%s[0-9]+.json$", java.util.Arrays.copyOf(new java.lang.Object[]{ANALYSIS_REPORT_PREFIX}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new kotlin.text.Regex(format).matches(name);
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File[] listExceptionReportFiles() {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new java.io.File[0];
        }
        java.io.File[] listFiles = instrumentReportDir.listFiles(new java.io.FilenameFilter() { // from class: com.facebook.internal.instrument.InstrumentUtility$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5213listExceptionReportFiles$lambda3;
                m5213listExceptionReportFiles$lambda3 = com.facebook.internal.instrument.InstrumentUtility.m5213listExceptionReportFiles$lambda3(file, str);
                return m5213listExceptionReportFiles$lambda3;
            }
        });
        return listFiles == null ? new java.io.File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: listExceptionReportFiles$lambda-3, reason: not valid java name */
    public static final boolean m5213listExceptionReportFiles$lambda3(java.io.File file, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("^(%s|%s|%s)[0-9]+.json$", java.util.Arrays.copyOf(new java.lang.Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new kotlin.text.Regex(format).matches(name);
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject readFile(java.lang.String filename, boolean deleteOnException) {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && filename != null) {
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(instrumentReportDir, filename));
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                return new org.json.JSONObject(com.facebook.internal.Utility.readStreamToString(fileInputStream));
            } catch (java.lang.Exception unused) {
                if (deleteOnException) {
                    deleteFile(filename);
                }
            }
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final void writeFile(java.lang.String filename, java.lang.String content) {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || filename == null || content == null) {
            return;
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(instrumentReportDir, filename));
            byte[] bytes = content.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (java.lang.Exception unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean deleteFile(java.lang.String filename) {
        java.io.File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || filename == null) {
            return false;
        }
        return new java.io.File(instrumentReportDir, filename).delete();
    }

    @kotlin.jvm.JvmStatic
    public static final void sendReports(java.lang.String key, org.json.JSONArray reports, com.facebook.GraphRequest.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(key, reports.toString());
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            org.json.JSONObject dataProcessingOptions = com.facebook.internal.Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                java.util.Iterator<java.lang.String> keys = dataProcessingOptions.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.String format = java.lang.String.format("%s/instruments", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getApplicationId()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            companion.newPostRequest(null, format, jSONObject, callback).executeAsync();
        } catch (org.json.JSONException unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getInstrumentReportDir() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.io.File file = new java.io.File(com.facebook.FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isFromFbOrMeta(java.lang.StackTraceElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        java.lang.String className = element.getClassName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (!kotlin.text.StringsKt.startsWith$default(className, FBSDK_PREFIX, false, 2, (java.lang.Object) null)) {
            java.lang.String className2 = element.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            if (!kotlin.text.StringsKt.startsWith$default(className2, METASDK_PREFIX, false, 2, (java.lang.Object) null)) {
                return false;
            }
        }
        return true;
    }
}
