package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class D9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5834a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f5835b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f5836c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f5837d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f5838e;
    public static final EnumSet f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f5839g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f5840h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f5841i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f5842j;

    static {
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0569ib enumC0569ib2 = EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0569ib enumC0569ib3 = EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0569ib enumC0569ib4 = EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0569ib enumC0569ib5 = EnumC0569ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0569ib enumC0569ib6 = EnumC0569ib.EVENT_TYPE_ANR;
        f5834a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0569ib enumC0569ib7 = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        EnumC0569ib enumC0569ib8 = EnumC0569ib.EVENT_TYPE_PURGE_BUFFER;
        EnumC0569ib enumC0569ib9 = EnumC0569ib.EVENT_TYPE_SEND_REFERRER;
        EnumC0569ib enumC0569ib10 = EnumC0569ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0569ib enumC0569ib11 = EnumC0569ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0569ib enumC0569ib12 = EnumC0569ib.EVENT_TYPE_ACTIVATION;
        EnumC0569ib enumC0569ib13 = EnumC0569ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0569ib enumC0569ib14 = EnumC0569ib.EVENT_TYPE_SET_SESSION_EXTRA;
        f5835b = EnumSet.of(enumC0569ib7, enumC0569ib8, enumC0569ib9, enumC0569ib10, enumC0569ib11, enumC0569ib12, enumC0569ib13, enumC0569ib5, enumC0569ib14);
        EnumC0569ib enumC0569ib15 = EnumC0569ib.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0569ib enumC0569ib16 = EnumC0569ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f5836c = EnumSet.of(enumC0569ib15, enumC0569ib4, enumC0569ib5, enumC0569ib13, enumC0569ib16);
        EnumC0569ib enumC0569ib17 = EnumC0569ib.EVENT_TYPE_REGULAR;
        f5837d = EnumSet.of(enumC0569ib4, enumC0569ib5, enumC0569ib3, enumC0569ib, enumC0569ib2, enumC0569ib16, enumC0569ib13, enumC0569ib17, EnumC0569ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0569ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0569ib.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0569ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0569ib8, EnumC0569ib.EVENT_TYPE_INIT, EnumC0569ib.EVENT_TYPE_SEND_USER_PROFILE, EnumC0569ib.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0569ib9, enumC0569ib10, enumC0569ib11, EnumC0569ib.EVENT_TYPE_FIRST_ACTIVATION, EnumC0569ib.EVENT_TYPE_START, EnumC0569ib.EVENT_TYPE_APP_OPEN, EnumC0569ib.EVENT_TYPE_APP_UPDATE, enumC0569ib6);
        f5838e = EnumSet.of(enumC0569ib17);
        f = EnumSet.of(enumC0569ib17);
        f5839g = EnumSet.of(enumC0569ib13);
        f5840h = EnumSet.of(EnumC0569ib.EVENT_TYPE_ALIVE, enumC0569ib8, enumC0569ib14, enumC0569ib5, enumC0569ib13);
        f5841i = Arrays.asList(0, 6145, 4097, 8224);
        f5842j = Arrays.asList(12290);
    }
}
