package com.inmobi.media;

/* renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2939zl {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.CoroutineScope f5596a;
    public static final kotlin.text.Regex b;
    public static final java.util.Set c;

    static {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f5596a = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        b = new kotlin.text.Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        java.lang.reflect.Method[] declaredMethods = com.inmobi.ads.controllers.PublisherCallbacks.class.getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    public static final java.lang.String a(java.lang.Thread thread, java.lang.Throwable error) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.StackTraceElement[] stackTrace = error.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
            boolean b2 = b(stackTrace);
            if (!b2) {
                str = "";
            } else if (stackTrace.length >= com.inmobi.media.W9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                str = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                java.lang.StackTraceElement[] stackTrace2 = error.getStackTrace();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace2, "<this>");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (java.lang.StackTraceElement stackTraceElement : stackTrace2) {
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                str = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            }
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put("message", error.getMessage());
            jSONObject.put("stack", str);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.inmobi.media.W9.a(jSONObject, b2, currentTimeMillis);
            com.inmobi.media.core.config.models.CrashConfig crashConfig = com.inmobi.media.AbstractC2672pf.f5392a;
            com.inmobi.media.AbstractC2672pf.a(jSONObject, error instanceof java.lang.OutOfMemoryError, b2, currentTimeMillis);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (java.lang.OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (org.json.JSONException e) {
            e.toString();
            return "";
        }
    }

    public static final boolean b(java.lang.StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], com.inmobi.ads.InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], com.inmobi.ads.InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], com.inmobi.media.Pc.class) && !a(stackTraceElementArr[i], com.inmobi.ads.InMobiBanner.a.class) && !a(stackTraceElementArr[i], com.inmobi.ads.InMobiBanner.a.class.getSuperclass()) && (!kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElementArr[i].getClassName(), com.inmobi.sdk.InMobiSdk.class.getName()) || !kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            java.lang.String className = stackTraceElementArr[i].getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            java.lang.String name = com.inmobi.media.W4.class.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, (java.lang.CharSequence) name, false, 2, (java.lang.Object) null)) {
                break;
            }
            java.lang.String className2 = stackTraceElementArr[i].getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String a(java.lang.String message, java.lang.String trace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AppExitEvent", "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trace, "trace");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", message);
            jSONObject.put("stack", trace);
        } catch (org.json.JSONException e) {
            e.toString();
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final java.lang.String a(java.lang.StackTraceElement[] stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Blocked", "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("MainThreadBlocked", "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "<this>");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append('\n');
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            jSONObject.put("stack", sb2);
        } catch (org.json.JSONException e) {
            e.toString();
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final boolean a(com.inmobi.media.X9 x9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x9, "<this>");
        if (x9 instanceof com.inmobi.media.X4) {
            java.lang.StackTraceElement[] stackTraceElementArr = ((com.inmobi.media.X4) x9).g;
            if (stackTraceElementArr == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (x9 instanceof com.inmobi.media.C2919z1) {
            com.inmobi.media.C2919z1 c2919z1 = (com.inmobi.media.C2919z1) x9;
            if (c2919z1.g != 6) {
                return false;
            }
            return b.containsMatchIn(c2919z1.h);
        }
        if (x9 instanceof com.inmobi.media.C2654oo) {
            return b(((com.inmobi.media.C2654oo) x9).g);
        }
        return false;
    }

    public static final boolean a(java.lang.StackTraceElement stackTraceElement, java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return cls != null && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(kotlin.jvm.functions.Function1 runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(f5596a, null, null, new com.inmobi.media.C2837vl(runnable, null), 3, null);
    }
}
