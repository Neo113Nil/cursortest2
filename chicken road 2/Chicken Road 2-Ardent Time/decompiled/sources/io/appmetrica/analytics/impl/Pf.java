package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Pf {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f4838a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f4839b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f4840c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f4841d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        io.appmetrica.analytics.impl.Vk vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
        hashMap.put(vk, 0);
        io.appmetrica.analytics.impl.Vk vk2 = io.appmetrica.analytics.impl.Vk.BACKGROUND;
        hashMap.put(vk2, 1);
        f4838a = java.util.Collections.unmodifiableMap(hashMap);
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        sparseArray.put(0, vk);
        sparseArray.put(1, vk2);
        f4839b = sparseArray;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_INIT;
        hashMap2.put(enumC0251bb, 1);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb2 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0251bb2, 4);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb3 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0251bb3, 5);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb4 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0251bb4, 7);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb5 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0251bb5, 26);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb6 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0251bb6, 26);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb7 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0251bb7, 26);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb8 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ANR;
        hashMap2.put(enumC0251bb8, 25);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb9 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0251bb9, 26);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb10 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0251bb10, 26);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb11 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0251bb11, 27);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb12 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0251bb12, 27);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb13 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0251bb13, 13);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb14 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_START;
        hashMap2.put(enumC0251bb14, 2);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb15 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0251bb15, 16);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb16 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0251bb16, 17);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb17 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0251bb17, 18);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb18 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0251bb18, 19);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb19 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0251bb19, 20);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb20 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0251bb20, 21);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb21 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0251bb21, 40);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb22 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0251bb22, 35);
        hashMap2.put(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CLEANUP, 29);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb23 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0251bb23, 38);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb24 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0251bb24, 42);
        f4840c = java.util.Collections.unmodifiableMap(hashMap2);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        io.appmetrica.analytics.impl.C0791w8 c0791w8 = new io.appmetrica.analytics.impl.C0791w8();
        io.appmetrica.analytics.impl.C8 c8 = new io.appmetrica.analytics.impl.C8(new io.appmetrica.analytics.impl.H8());
        io.appmetrica.analytics.impl.C0817x8 c0817x8 = new io.appmetrica.analytics.impl.C0817x8();
        io.appmetrica.analytics.impl.C0269c3 c0269c3 = new io.appmetrica.analytics.impl.C0269c3(new io.appmetrica.analytics.impl.H8());
        io.appmetrica.analytics.impl.Pn pn = new io.appmetrica.analytics.impl.Pn(new io.appmetrica.analytics.impl.H8());
        io.appmetrica.analytics.impl.Lf lf = new io.appmetrica.analytics.impl.Lf();
        io.appmetrica.analytics.impl.T8 a2 = io.appmetrica.analytics.impl.U8.a();
        a2.f5004b = lf;
        a2.f5005c = lf;
        io.appmetrica.analytics.impl.U8 u8 = new io.appmetrica.analytics.impl.U8(a2);
        io.appmetrica.analytics.impl.T8 a3 = io.appmetrica.analytics.impl.U8.a();
        a3.f5004b = c8;
        io.appmetrica.analytics.impl.U8 u82 = new io.appmetrica.analytics.impl.U8(a3);
        io.appmetrica.analytics.impl.T8 a4 = io.appmetrica.analytics.impl.U8.a();
        a4.f5004b = c0269c3;
        io.appmetrica.analytics.impl.U8 u83 = new io.appmetrica.analytics.impl.U8(a4);
        io.appmetrica.analytics.impl.T8 a5 = io.appmetrica.analytics.impl.U8.a();
        a5.f5004b = pn;
        io.appmetrica.analytics.impl.U8 u84 = new io.appmetrica.analytics.impl.U8(a5);
        io.appmetrica.analytics.impl.T8 a6 = io.appmetrica.analytics.impl.U8.a();
        a6.f5003a = c0791w8;
        io.appmetrica.analytics.impl.U8 u85 = new io.appmetrica.analytics.impl.U8(a6);
        io.appmetrica.analytics.impl.T8 a7 = io.appmetrica.analytics.impl.U8.a();
        a7.f5004b = new io.appmetrica.analytics.impl.C0755uo(new io.appmetrica.analytics.impl.C8());
        io.appmetrica.analytics.impl.U8 u86 = new io.appmetrica.analytics.impl.U8(a7);
        hashMap3.put(enumC0251bb2, u82);
        io.appmetrica.analytics.impl.T8 a8 = io.appmetrica.analytics.impl.U8.a();
        a8.f5004b = new io.appmetrica.analytics.impl.Nf();
        hashMap3.put(enumC0251bb3, new io.appmetrica.analytics.impl.U8(a8));
        io.appmetrica.analytics.impl.T8 a9 = io.appmetrica.analytics.impl.U8.a();
        a9.f5003a = c0791w8;
        a9.f5004b = c0817x8;
        a9.f5007e = new io.appmetrica.analytics.impl.W7();
        a9.f5008f = new io.appmetrica.analytics.impl.X7();
        hashMap3.put(enumC0251bb4, new io.appmetrica.analytics.impl.U8(a9));
        hashMap3.put(enumC0251bb9, u8);
        hashMap3.put(enumC0251bb10, u8);
        hashMap3.put(enumC0251bb11, u83);
        hashMap3.put(enumC0251bb12, u83);
        hashMap3.put(enumC0251bb5, u83);
        hashMap3.put(enumC0251bb6, u83);
        hashMap3.put(enumC0251bb7, u83);
        hashMap3.put(enumC0251bb8, u83);
        io.appmetrica.analytics.impl.T8 a10 = io.appmetrica.analytics.impl.U8.a();
        a10.f5003a = new io.appmetrica.analytics.impl.C0791w8();
        a10.f5004b = c0269c3;
        hashMap3.put(enumC0251bb14, new io.appmetrica.analytics.impl.U8(a10));
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb25 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CUSTOM_EVENT;
        io.appmetrica.analytics.impl.T8 a11 = io.appmetrica.analytics.impl.U8.a();
        a11.f5006d = new io.appmetrica.analytics.impl.Of();
        hashMap3.put(enumC0251bb25, new io.appmetrica.analytics.impl.U8(a11));
        hashMap3.put(enumC0251bb15, u82);
        hashMap3.put(enumC0251bb17, u85);
        hashMap3.put(enumC0251bb18, u85);
        hashMap3.put(enumC0251bb19, u83);
        hashMap3.put(enumC0251bb20, u83);
        hashMap3.put(enumC0251bb21, u83);
        hashMap3.put(enumC0251bb22, u84);
        hashMap3.put(enumC0251bb, u86);
        hashMap3.put(enumC0251bb16, u86);
        hashMap3.put(enumC0251bb13, u82);
        hashMap3.put(enumC0251bb23, u82);
        hashMap3.put(enumC0251bb24, u83);
        f4841d = java.util.Collections.unmodifiableMap(hashMap3);
    }

    public static io.appmetrica.analytics.impl.C0430i9 a(java.lang.Long l2, java.lang.Long l3, java.lang.Boolean bool) {
        io.appmetrica.analytics.impl.C0430i9 c0430i9 = new io.appmetrica.analytics.impl.C0430i9();
        if (l2 != null) {
            c0430i9.f6089a = l2.longValue();
            c0430i9.f6090b = ((java.util.GregorianCalendar) java.util.Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l3 != null) {
            c0430i9.f6091c = l3.longValue();
        }
        if (bool != null) {
            c0430i9.f6092d = bool.booleanValue();
        }
        return c0430i9;
    }

    public static void a(io.appmetrica.analytics.impl.C0378g9 c0378g9) {
        io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr = c0378g9.f5983c;
        if (c0326e9Arr != null) {
            for (io.appmetrica.analytics.impl.C0326e9 c0326e9 : c0326e9Arr) {
            }
        }
    }
}
