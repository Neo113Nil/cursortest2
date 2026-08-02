package com.amplitude.analytics.connector;

import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public static final C0033a Companion = new C0033a();
    public static final Object c = new Object();
    public static final LinkedHashMap d = new LinkedHashMap();
    public final e a = new e();
    public final c b = new c();

    /* renamed from: com.amplitude.analytics.connector.a$a, reason: collision with other inner class name */
    public static final class C0033a {
        @JvmStatic
        public static a a(String instanceName) {
            a aVar;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            synchronized (a.c) {
                try {
                    LinkedHashMap linkedHashMap = a.d;
                    Object obj = linkedHashMap.get(instanceName);
                    if (obj == null) {
                        obj = new a();
                        linkedHashMap.put(instanceName, obj);
                    }
                    aVar = (a) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
    }
}
