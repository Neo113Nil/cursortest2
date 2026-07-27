package com.chartboost.sdk.impl;

import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chartboost.sdk.LoggingLevel;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public static final mb f4875a = new mb();
    public static LoggingLevel b = LoggingLevel.INTEGRATION;
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static Boolean d;
    public static boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("DEBUG", 0);
        public static final a c = new a("ERROR", 1);
        public static final a d = new a("WARNING", 2);
        public static final a e = new a("INFO", 3);
        public static final a f = new a("VERBOSE", 4);
        public static final a g = new a("WTF", 5);
        public static final /* synthetic */ a[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            a[] a2 = a();
            h = a2;
            i = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i2) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c, d, e, f, g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4876a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4876a = iArr;
        }
    }

    public static /* synthetic */ void a(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        a(str, th);
    }

    public static /* synthetic */ void b(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        b(str, th);
    }

    public static /* synthetic */ void c(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c(str, th);
    }

    public static /* synthetic */ void d(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        d(str, th);
    }

    public static /* synthetic */ void e(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        e(str, th);
    }

    public static final void a(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f4875a.a(a.b, msg, th);
    }

    public static final void b(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f4875a.a(a.c, msg, th);
    }

    public static final void c(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f4875a.a(a.e, msg, th);
    }

    public static final void d(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f4875a.a(a.f, msg, th);
    }

    public static final void e(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f4875a.a(a.d, msg, th);
    }

    public static /* synthetic */ String b(mb mbVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return mbVar.b(i);
    }

    public final boolean a() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e) {
            return false;
        }
        try {
            e = true;
            com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) b4.b.b().b().get();
            boolean z = aVar != null ? aVar.m : false;
            d = Boolean.valueOf(z);
            return z;
        } catch (Exception unused) {
            d = Boolean.FALSE;
            return false;
        } finally {
            e = false;
        }
    }

    public final StackTraceElement c(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i) {
            return stackTrace[i];
        }
        return null;
    }

    public final String b(int i) {
        StackTraceElement c2 = c(i);
        if (c2 != null) {
            String className = c2.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String str = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + c2.getMethodName() + "():";
            return str == null ? "" : str;
        }
        return "";
    }

    public final void a(a aVar, String str, Throwable th) {
        String b2;
        if (b == LoggingLevel.ALL || b == LoggingLevel.INTEGRATION) {
            if (a()) {
                b2 = a(this, 0, 1, (Object) null);
            } else {
                b2 = b(this, 0, 1, (Object) null);
            }
            String str2 = b2 + ServerSentEventKt.SPACE + str;
            a(aVar, b2, str, th);
            switch (b.f4876a[aVar.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", str2, th);
                    return;
                case 2:
                    Log.e("[ChartboostMonetization]", str2, th);
                    return;
                case 3:
                    Log.w("[ChartboostMonetization]", str2, th);
                    return;
                case 4:
                    Log.i("[ChartboostMonetization]", str2, th);
                    return;
                case 5:
                    Log.v("[ChartboostMonetization]", str2, th);
                    return;
                case 6:
                    Log.wtf("[ChartboostMonetization]", str2, th);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void a(a aVar, String str, String str2, Throwable th) {
        try {
            lb lbVar = lb.f4860a;
            if (lbVar.b()) {
                lbVar.a();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ String a(mb mbVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return mbVar.a(i);
    }

    public final String a(int i) {
        StackTraceElement c2 = c(i);
        if (c2 == null) {
            return "";
        }
        String str = c2.getClassName() + ServerSentEventKt.COLON + c2.getMethodName() + ServerSentEventKt.COLON + c2.getLineNumber();
        ConcurrentHashMap concurrentHashMap = c;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            if (concurrentHashMap.size() >= 1000) {
                Set keySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                Iterator it = CollectionsKt.take(keySet, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION).iterator();
                while (it.hasNext()) {
                    c.remove((String) it.next());
                }
            }
            String className = c2.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            obj = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + c2.getMethodName() + "():";
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (String) obj;
    }
}
