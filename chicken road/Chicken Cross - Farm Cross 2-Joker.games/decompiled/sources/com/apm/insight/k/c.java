package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CrashUploadHandler.java */
/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f4011a = new ConcurrentLinkedQueue<>();

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f4011a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f4011a.isEmpty()) {
            f4011a.poll();
        }
        f4011a = null;
    }

    /* compiled from: CrashUploadHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f4013a;
        private JSONObject b;
        private CrashType c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f4013a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f4013a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f4013a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f4013a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i = AnonymousClass1.f4012a[this.c.ordinal()];
            if (i == 1) {
                return this.f4013a.optString("data", null);
            }
            if (i == 2) {
                return this.f4013a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f4013a.optString("data", null);
        }
    }

    /* compiled from: CrashUploadHandler.java */
    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4012a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f4012a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4012a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4012a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
