package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4143un {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f7420a;
    public static final Regex b;
    public static final Set c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f7420a = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = CollectionsKt.toSet(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x00cd, TryCatch #3 {all -> 0x00cd, blocks: (B:35:0x00a2, B:37:0x00be, B:38:0x00c5), top: B:34:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String a(Thread thread, Throwable error) {
        String str;
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("name", error.getClass().getSimpleName());
                jSONObject.put("message", error.getMessage());
                if (thread != null) {
                    jSONObject.put("thread", thread.getName());
                }
                StackTraceElement[] stackTrace = error.getStackTrace();
                Intrinsics.checkNotNull(stackTrace);
                boolean b2 = b(stackTrace);
                if (b2) {
                    int maxStackFrames = Ba.a().getCrashConfig().getMaxStackFrames();
                    if (maxStackFrames < 1 || maxStackFrames > 1024) {
                        maxStackFrames = 64;
                    }
                    str = a(stackTrace, maxStackFrames);
                } else {
                    str = "";
                }
                jSONObject.put("stack", str);
                long currentTimeMillis = System.currentTimeMillis();
                Ba.a(jSONObject, b2, currentTimeMillis);
                CrashConfig crashConfig = AbstractC3823jg.f7183a;
                AbstractC3823jg.a(jSONObject, error instanceof OutOfMemoryError, b2, currentTimeMillis);
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                return jSONObject2;
            } catch (Throwable unused) {
                return "{\"name\":\"unknown\",\"message\":\"crash report serialization failed\",\"stack\":\"[unavailable]\"}";
            }
        } catch (OutOfMemoryError unused2) {
            String jSONObject3 = jSONObject.toString();
            Intrinsics.checkNotNull(jSONObject3);
            return jSONObject3;
        } catch (JSONException e) {
            String str2 = "JSONException: " + e;
            if (jSONObject.has("name") && jSONObject.has("message")) {
                try {
                    String jSONObject4 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
                    return jSONObject4;
                } catch (Throwable unused3) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("name", error.getClass().getSimpleName());
                    jSONObject5.put("message", error.getMessage());
                    jSONObject5.put("stack", "[unavailable]");
                    if (thread != null) {
                        jSONObject5.put("thread", thread.getName());
                    }
                    String jSONObject6 = jSONObject5.toString();
                    Intrinsics.checkNotNull(jSONObject6);
                    return jSONObject6;
                }
            }
            try {
                JSONObject jSONObject52 = new JSONObject();
                jSONObject52.put("name", error.getClass().getSimpleName());
                jSONObject52.put("message", error.getMessage());
                jSONObject52.put("stack", "[unavailable]");
                if (thread != null) {
                }
                String jSONObject62 = jSONObject52.toString();
                Intrinsics.checkNotNull(jSONObject62);
                return jSONObject62;
            } catch (Throwable unused4) {
                return "{\"name\":\"unknown\",\"message\":\"crash report serialization failed\",\"stack\":\"[unavailable]\"}";
            }
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], Hd.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.areEqual(stackTraceElementArr[i].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.areEqual(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = C4096t5.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.contains$default((CharSequence) className, (CharSequence) name, false, 2, (Object) null)) {
                break;
            }
            String className2 = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (b.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String message, String trace) {
        Intrinsics.checkNotNullParameter("AppExitEvent", "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", message);
            jSONObject.put("stack", trace);
        } catch (JSONException e) {
            String str = "JSONException: " + e;
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final String a(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter("Blocked", "name");
        Intrinsics.checkNotNullParameter("MainThreadBlocked", "message");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            int maxStackFrames = Ba.a().getCrashConfig().getMaxStackFrames();
            if (maxStackFrames < 1 || maxStackFrames > 1024) {
                maxStackFrames = 64;
            }
            jSONObject.put("stack", a(stackTrace, maxStackFrames));
        } catch (JSONException e) {
            String str = "JSONException: " + e;
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr, int i) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        if (i > 0 && stackTraceElementArr.length != 0) {
            int length = stackTraceElementArr.length;
            int min = Math.min(i, length);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(stackTraceElementArr[i2].toString()).append('\n');
            }
            if (min < length) {
                sb.append("...[truncated: " + min + "/" + length + " frames shown]");
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
        return "";
    }

    public static final boolean a(Ca ca) {
        Intrinsics.checkNotNullParameter(ca, "<this>");
        if (ca instanceof C4124u5) {
            StackTraceElement[] stackTraceElementArr = ((C4124u5) ca).g;
            if (stackTraceElementArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (ca instanceof T1) {
            T1 t1 = (T1) ca;
            if (t1.g != 6) {
                return false;
            }
            return b.containsMatchIn(t1.h);
        }
        if (ca instanceof C3892lq) {
            return b(((C3892lq) ca).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return cls != null && Intrinsics.areEqual(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(f7420a, null, null, new C4030qn(runnable, null), 3, null);
    }
}
