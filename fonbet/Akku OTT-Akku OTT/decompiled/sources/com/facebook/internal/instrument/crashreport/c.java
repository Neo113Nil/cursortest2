package com.facebook.internal.instrument.crashreport;

import androidx.annotation.RestrictTo;
import com.facebook.internal.E;
import com.facebook.internal.instrument.c;
import com.facebook.internal.instrument.g;
import com.facebook.internal.instrument.j;
import com.facebook.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c implements Thread.UncaughtExceptionHandler {
    public static final a Companion = new a();
    public static c b;
    public final Thread.UncaughtExceptionHandler a;

    @SourceDebugExtension({"SMAP\nCrashHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashHandler.kt\ncom/facebook/internal/instrument/crashreport/CrashHandler$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n11335#2:89\n11670#2,3:90\n766#3:93\n857#3,2:94\n1855#3,2:96\n1855#3,2:98\n*S KotlinDebug\n*F\n+ 1 CrashHandler.kt\ncom/facebook/internal/instrument/crashreport/CrashHandler$Companion\n*L\n66#1:89\n66#1:90,3\n67#1:93\n67#1:94,2\n72#1:96,2\n79#1:98,2\n*E\n"})
    public static final class a {
        public static void a() {
            File[] listFiles;
            if (E.x()) {
                return;
            }
            File b = j.b();
            if (b == null) {
                listFiles = new File[0];
            } else {
                listFiles = b.listFiles(new g());
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(c.a.c(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((com.facebook.internal.instrument.c) next).a()) {
                    arrayList2.add(next);
                }
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList2, new com.facebook.internal.instrument.crashreport.a());
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it2 = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it2.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it2).nextInt()));
            }
            j.f("crash_reports", jSONArray, new z.b() { // from class: com.facebook.internal.instrument.crashreport.b
                @Override // com.facebook.z.b
                public final void a(com.facebook.E response) {
                    JSONObject jSONObject;
                    List validReports = sortedWith;
                    Intrinsics.checkNotNullParameter(validReports, "$validReports");
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        if (response.c == null && (jSONObject = response.d) != null && jSONObject.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                            Iterator it3 = validReports.iterator();
                            while (it3.hasNext()) {
                                j.a(((com.facebook.internal.instrument.c) it3.next()).a);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        if (e != null) {
            Throwable th = null;
            Throwable th2 = e;
            loop0: while (true) {
                if (th2 == null || th2 == th) {
                    break;
                }
                StackTraceElement[] stackTrace = th2.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
                for (StackTraceElement element : stackTrace) {
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    if (j.c(element)) {
                        com.facebook.internal.instrument.b.a(e);
                        c.a.b(e, c.EnumC0092c.d).b();
                        break loop0;
                    }
                }
                th = th2;
                th2 = th2.getCause();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
