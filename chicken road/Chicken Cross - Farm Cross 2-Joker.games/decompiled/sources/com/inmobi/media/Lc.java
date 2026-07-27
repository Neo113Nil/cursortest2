package com.inmobi.media;

import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Lc {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Mc.f6715a.iterator();
            while (it.hasNext()) {
                C3685ej c3685ej = (C3685ej) ((WeakReference) it.next()).get();
                if (c3685ej != null) {
                    arrayList.add(c3685ej);
                }
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mc.f6715a;
        String str = "getRunningSessions " + arrayList;
        return arrayList;
    }

    public static void b(C3685ej logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        String str = "newLoggingSessionStarted " + logger;
        Mc.f6715a.add(new WeakReference(logger));
    }

    public static boolean a(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        String str = "isCurrentlyModifyingFile " + fileName + ServerSentEventKt.SPACE;
        try {
            Iterator it = Mc.f6715a.iterator();
            while (it.hasNext()) {
                C3685ej c3685ej = (C3685ej) ((WeakReference) it.next()).get();
                if (Intrinsics.areEqual(c3685ej != null ? c3685ej.j : null, fileName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
            return false;
        }
    }

    public static void a(C3685ej c3685ej) {
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        String str = "loggingSessionStopped " + c3685ej;
        if (c3685ej == null) {
            return;
        }
        try {
            Iterator it = Mc.f6715a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), c3685ej)) {
                    Mc.f6715a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }
}
