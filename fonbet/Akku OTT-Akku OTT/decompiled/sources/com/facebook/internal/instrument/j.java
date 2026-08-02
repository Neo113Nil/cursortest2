package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.internal.E;
import com.facebook.w;
import com.facebook.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nInstrumentUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstrumentUtility.kt\ncom/facebook/internal/instrument/InstrumentUtility\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,341:1\n13579#2,2:342\n*S KotlinDebug\n*F\n+ 1 InstrumentUtility.kt\ncom/facebook/internal/instrument/InstrumentUtility\n*L\n134#1:342,2\n*E\n"})
/* loaded from: classes3.dex */
public final class j {
    @JvmStatic
    public static final void a(String str) {
        File b = b();
        if (b == null || str == null) {
            return;
        }
        new File(b, str).delete();
    }

    @JvmStatic
    public static final File b() {
        File file = new File(w.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @JvmStatic
    public static final boolean c(StackTraceElement element) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        String className2 = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(className2, "com.meta", false, 2, null);
        return startsWith$default2;
    }

    @JvmStatic
    public static final boolean d(Thread thread) {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean startsWith$default4;
        boolean startsWith$default5;
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (c(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook.appevents.codeless", false, 2, null);
                    if (!startsWith$default) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(className2, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!startsWith$default5) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(methodName, "onClick", false, 2, null);
                    if (startsWith$default2) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(methodName2, "onItemClick", false, 2, null);
                        if (startsWith$default3) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(methodName3, "onTouch", false, 2, null);
                            if (!startsWith$default4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final JSONObject e(String str) {
        File b = b();
        if (b != null && str != null) {
            try {
                return new JSONObject(E.H(new FileInputStream(new File(b, str))));
            } catch (Exception unused) {
                a(str);
            }
        }
        return null;
    }

    @JvmStatic
    public static final void f(String str, JSONArray reports, z.b bVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject n = E.n();
            if (n != null) {
                Iterator<String> keys = n.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, n.get(next));
                }
            }
            z.c cVar = z.Companion;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{w.b()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            cVar.getClass();
            z.c.h(null, format, jSONObject, bVar).d();
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    public static final void g(String str, String str2) {
        File b = b();
        if (b == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
