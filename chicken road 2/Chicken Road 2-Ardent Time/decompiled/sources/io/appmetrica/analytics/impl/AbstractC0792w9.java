package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0792w9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f7005a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.EnumSet f7006b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.EnumSet f7007c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.EnumSet f7008d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.EnumSet f7009e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.EnumSet f7010f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.EnumSet f7011g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.EnumSet f7012h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f7013i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f7014j;

    static {
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb2 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb3 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb4 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb5 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb6 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ANR;
        f7005a = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb7 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb8 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PURGE_BUFFER;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb9 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REFERRER;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb10 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb11 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb12 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ACTIVATION;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb13 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb14 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SET_SESSION_EXTRA;
        f7006b = java.util.EnumSet.of(enumC0251bb7, enumC0251bb8, enumC0251bb9, enumC0251bb10, enumC0251bb11, enumC0251bb12, enumC0251bb13, enumC0251bb5, enumC0251bb14);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb15 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb16 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f7007c = java.util.EnumSet.of(enumC0251bb15, enumC0251bb4, enumC0251bb5, enumC0251bb13, enumC0251bb16);
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb17 = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_REGULAR;
        f7008d = java.util.EnumSet.of(enumC0251bb4, enumC0251bb5, enumC0251bb3, enumC0251bb, enumC0251bb2, enumC0251bb16, enumC0251bb13, enumC0251bb17, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REVENUE_EVENT, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0251bb8, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_INIT, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_USER_PROFILE, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0251bb9, enumC0251bb10, enumC0251bb11, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_FIRST_ACTIVATION, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_START, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_OPEN, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_UPDATE, enumC0251bb6);
        f7009e = java.util.EnumSet.of(enumC0251bb17);
        f7010f = java.util.EnumSet.of(enumC0251bb17);
        f7011g = java.util.EnumSet.of(enumC0251bb13);
        f7012h = java.util.EnumSet.of(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ALIVE, enumC0251bb8, enumC0251bb14, enumC0251bb5, enumC0251bb13);
        f7013i = java.util.Arrays.asList(0, 6145, 4097, 8224);
        f7014j = java.util.Arrays.asList(12290);
    }
}
