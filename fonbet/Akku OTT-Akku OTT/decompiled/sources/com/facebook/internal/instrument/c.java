package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import com.facebook.internal.E;
import com.facebook.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c {
    public static final b Companion = new b();
    public String a;
    public EnumC0092c b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public static final class a {
        @JvmStatic
        public static final c a(String str, String str2) {
            c cVar = new c();
            cVar.b = EnumC0092c.c;
            E e = E.a;
            Context a = w.a();
            String str3 = null;
            if (a != null) {
                try {
                    PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                    if (packageInfo != null) {
                        str3 = packageInfo.versionName;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            cVar.d = str3;
            cVar.e = str;
            cVar.f = str2;
            Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            cVar.g = valueOf;
            StringBuffer stringBuffer = new StringBuffer("anr_log_");
            stringBuffer.append(String.valueOf(valueOf));
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
            cVar.a = stringBuffer2;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final c b(Throwable th, EnumC0092c t) {
            PackageInfo packageInfo;
            String str;
            Intrinsics.checkNotNullParameter(t, "t");
            c cVar = new c();
            cVar.b = t;
            E e = E.a;
            Context a = w.a();
            String str2 = null;
            Throwable th2 = null;
            if (a != null) {
                try {
                    packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                    cVar.d = str;
                    cVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
                    if (th != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (th != null && th != th2) {
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                jSONArray.put(stackTraceElement.toString());
                            }
                            th2 = th;
                            th = th.getCause();
                        }
                        str2 = jSONArray.toString();
                    }
                    cVar.f = str2;
                    Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                    cVar.g = valueOf;
                    StringBuffer stringBuffer = new StringBuffer();
                    int i = EnumC0092c.a.$EnumSwitchMapping$0[t.ordinal()];
                    stringBuffer.append(i == 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
                    stringBuffer.append(String.valueOf(valueOf));
                    stringBuffer.append(".json");
                    String stringBuffer2 = stringBuffer.toString();
                    Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
                    cVar.a = stringBuffer2;
                    return cVar;
                }
            }
            str = null;
            cVar.d = str;
            cVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
            if (th != null) {
            }
            cVar.f = str2;
            Long valueOf2 = Long.valueOf(System.currentTimeMillis() / 1000);
            cVar.g = valueOf2;
            StringBuffer stringBuffer3 = new StringBuffer();
            int i2 = EnumC0092c.a.$EnumSwitchMapping$0[t.ordinal()];
            stringBuffer3.append(i2 == 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
            stringBuffer3.append(String.valueOf(valueOf2));
            stringBuffer3.append(".json");
            String stringBuffer22 = stringBuffer3.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer22, "StringBuffer().append(t.…ppend(\".json\").toString()");
            cVar.a = stringBuffer22;
            return cVar;
        }

        @JvmStatic
        public static final c c(File file) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean startsWith$default3;
            boolean startsWith$default4;
            boolean startsWith$default5;
            EnumC0092c enumC0092c;
            Intrinsics.checkNotNullParameter(file, "file");
            c cVar = new c();
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            cVar.a = name;
            c.Companion.getClass();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "crash_log_", false, 2, null);
            if (startsWith$default) {
                enumC0092c = EnumC0092c.d;
            } else {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, "shield_log_", false, 2, null);
                if (startsWith$default2) {
                    enumC0092c = EnumC0092c.e;
                } else {
                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(name, "thread_check_log_", false, 2, null);
                    if (startsWith$default3) {
                        enumC0092c = EnumC0092c.f;
                    } else {
                        startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(name, "analysis_log_", false, 2, null);
                        if (startsWith$default4) {
                            enumC0092c = EnumC0092c.b;
                        } else {
                            startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(name, "anr_log_", false, 2, null);
                            enumC0092c = startsWith$default5 ? EnumC0092c.c : EnumC0092c.a;
                        }
                    }
                }
            }
            cVar.b = enumC0092c;
            JSONObject e = j.e(name);
            if (e != null) {
                cVar.g = Long.valueOf(e.optLong(Constants.TIMESTAMP, 0L));
                cVar.d = e.optString("app_version", null);
                cVar.e = e.optString(Constants.REASON, null);
                cVar.f = e.optString("callstack", null);
                cVar.c = e.optJSONArray("feature_names");
            }
            return cVar;
        }
    }

    public static final class b {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.facebook.internal.instrument.c$c, reason: collision with other inner class name */
    public static final class EnumC0092c {
        public static final EnumC0092c a;
        public static final EnumC0092c b;
        public static final EnumC0092c c;
        public static final EnumC0092c d;
        public static final EnumC0092c e;
        public static final EnumC0092c f;
        public static final /* synthetic */ EnumC0092c[] i;

        /* renamed from: com.facebook.internal.instrument.c$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0092c.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[4] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[5] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            EnumC0092c enumC0092c = new EnumC0092c("Unknown", 0);
            a = enumC0092c;
            EnumC0092c enumC0092c2 = new EnumC0092c("Analysis", 1);
            b = enumC0092c2;
            EnumC0092c enumC0092c3 = new EnumC0092c("AnrReport", 2);
            c = enumC0092c3;
            EnumC0092c enumC0092c4 = new EnumC0092c("CrashReport", 3);
            d = enumC0092c4;
            EnumC0092c enumC0092c5 = new EnumC0092c("CrashShield", 4);
            e = enumC0092c5;
            EnumC0092c enumC0092c6 = new EnumC0092c("ThreadCheck", 5);
            f = enumC0092c6;
            i = new EnumC0092c[]{enumC0092c, enumC0092c2, enumC0092c3, enumC0092c4, enumC0092c5, enumC0092c6};
        }

        public EnumC0092c() {
            throw null;
        }

        public static EnumC0092c valueOf(String str) {
            return (EnumC0092c) Enum.valueOf(EnumC0092c.class, str);
        }

        public static EnumC0092c[] values() {
            return (EnumC0092c[]) i.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            int i2 = a.$EnumSwitchMapping$0[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0092c.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean a() {
        String str = this.f;
        Long l = this.g;
        EnumC0092c enumC0092c = this.b;
        int i = enumC0092c == null ? -1 : d.$EnumSwitchMapping$0[enumC0092c.ordinal()];
        return i != 1 ? i != 2 ? ((i != 3 && i != 4 && i != 5) || str == null || l == null) ? false : true : (str == null || this.e == null || l == null) ? false : true : (this.c == null || l == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            j.g(this.a, toString());
        }
    }

    public final String toString() {
        Long l = this.g;
        EnumC0092c enumC0092c = this.b;
        int i = enumC0092c == null ? -1 : d.$EnumSwitchMapping$0[enumC0092c.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put(Constants.TIMESTAMP, l);
                }
                jSONObject = jSONObject2;
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put(Constants.TIMESTAMP, l);
                }
                String str2 = this.e;
                if (str2 != null) {
                    jSONObject3.put(Constants.REASON, str2);
                }
                String str3 = this.f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (enumC0092c != null) {
                    jSONObject3.put("type", enumC0092c);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String jSONObject4 = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "JSONObject().toString()");
            return jSONObject4;
        }
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "params.toString()");
        return jSONObject5;
    }
}
