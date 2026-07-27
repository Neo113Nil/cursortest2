package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Uf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f6718a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f6719b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f6720c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f6721d;

    static {
        HashMap hashMap = new HashMap();
        EnumC0372al enumC0372al = EnumC0372al.FOREGROUND;
        hashMap.put(enumC0372al, 0);
        EnumC0372al enumC0372al2 = EnumC0372al.BACKGROUND;
        hashMap.put(enumC0372al2, 1);
        f6718a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC0372al);
        sparseArray.put(1, enumC0372al2);
        f6719b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_INIT;
        hashMap2.put(enumC0569ib, 1);
        EnumC0569ib enumC0569ib2 = EnumC0569ib.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0569ib2, 4);
        EnumC0569ib enumC0569ib3 = EnumC0569ib.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0569ib3, 5);
        EnumC0569ib enumC0569ib4 = EnumC0569ib.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0569ib4, 7);
        EnumC0569ib enumC0569ib5 = EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0569ib5, 26);
        EnumC0569ib enumC0569ib6 = EnumC0569ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0569ib6, 26);
        EnumC0569ib enumC0569ib7 = EnumC0569ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0569ib7, 26);
        EnumC0569ib enumC0569ib8 = EnumC0569ib.EVENT_TYPE_ANR;
        hashMap2.put(enumC0569ib8, 25);
        EnumC0569ib enumC0569ib9 = EnumC0569ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0569ib9, 26);
        EnumC0569ib enumC0569ib10 = EnumC0569ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0569ib10, 26);
        EnumC0569ib enumC0569ib11 = EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0569ib11, 27);
        EnumC0569ib enumC0569ib12 = EnumC0569ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0569ib12, 27);
        EnumC0569ib enumC0569ib13 = EnumC0569ib.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0569ib13, 13);
        EnumC0569ib enumC0569ib14 = EnumC0569ib.EVENT_TYPE_START;
        hashMap2.put(enumC0569ib14, 2);
        EnumC0569ib enumC0569ib15 = EnumC0569ib.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0569ib15, 16);
        EnumC0569ib enumC0569ib16 = EnumC0569ib.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0569ib16, 17);
        EnumC0569ib enumC0569ib17 = EnumC0569ib.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0569ib17, 18);
        EnumC0569ib enumC0569ib18 = EnumC0569ib.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0569ib18, 19);
        EnumC0569ib enumC0569ib19 = EnumC0569ib.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0569ib19, 20);
        EnumC0569ib enumC0569ib20 = EnumC0569ib.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0569ib20, 21);
        EnumC0569ib enumC0569ib21 = EnumC0569ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0569ib21, 40);
        EnumC0569ib enumC0569ib22 = EnumC0569ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0569ib22, 35);
        hashMap2.put(EnumC0569ib.EVENT_TYPE_CLEANUP, 29);
        EnumC0569ib enumC0569ib23 = EnumC0569ib.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0569ib23, 38);
        EnumC0569ib enumC0569ib24 = EnumC0569ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0569ib24, 42);
        f6720c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        B8 b8 = new B8();
        H8 h8 = new H8(new M8());
        C8 c8 = new C8();
        C0612k3 c0612k3 = new C0612k3(new M8());
        Rn rn = new Rn(new M8());
        Qf qf = new Qf();
        C0360a9 a3 = C0386b9.a();
        a3.f6955b = qf;
        a3.f6956c = qf;
        C0386b9 c0386b9 = new C0386b9(a3);
        C0360a9 a4 = C0386b9.a();
        a4.f6955b = h8;
        C0386b9 c0386b92 = new C0386b9(a4);
        C0360a9 a5 = C0386b9.a();
        a5.f6955b = c0612k3;
        C0386b9 c0386b93 = new C0386b9(a5);
        C0360a9 a6 = C0386b9.a();
        a6.f6955b = rn;
        C0386b9 c0386b94 = new C0386b9(a6);
        C0360a9 a7 = C0386b9.a();
        a7.f6954a = b8;
        C0386b9 c0386b95 = new C0386b9(a7);
        C0360a9 a8 = C0386b9.a();
        a8.f6955b = new C0944wo(new H8());
        C0386b9 c0386b96 = new C0386b9(a8);
        hashMap3.put(enumC0569ib2, c0386b92);
        C0360a9 a9 = C0386b9.a();
        a9.f6955b = new Sf();
        hashMap3.put(enumC0569ib3, new C0386b9(a9));
        C0360a9 a10 = C0386b9.a();
        a10.f6954a = b8;
        a10.f6955b = c8;
        a10.f6958e = new C0411c8();
        a10.f = new C0437d8();
        hashMap3.put(enumC0569ib4, new C0386b9(a10));
        hashMap3.put(enumC0569ib9, c0386b9);
        hashMap3.put(enumC0569ib10, c0386b9);
        hashMap3.put(enumC0569ib11, c0386b93);
        hashMap3.put(enumC0569ib12, c0386b93);
        hashMap3.put(enumC0569ib5, c0386b93);
        hashMap3.put(enumC0569ib6, c0386b93);
        hashMap3.put(enumC0569ib7, c0386b93);
        hashMap3.put(enumC0569ib8, c0386b93);
        C0360a9 a11 = C0386b9.a();
        a11.f6954a = new B8();
        a11.f6955b = c0612k3;
        hashMap3.put(enumC0569ib14, new C0386b9(a11));
        EnumC0569ib enumC0569ib25 = EnumC0569ib.EVENT_TYPE_CUSTOM_EVENT;
        C0360a9 a12 = C0386b9.a();
        a12.f6957d = new Tf();
        hashMap3.put(enumC0569ib25, new C0386b9(a12));
        hashMap3.put(enumC0569ib15, c0386b92);
        hashMap3.put(enumC0569ib17, c0386b95);
        hashMap3.put(enumC0569ib18, c0386b95);
        hashMap3.put(enumC0569ib19, c0386b93);
        hashMap3.put(enumC0569ib20, c0386b93);
        hashMap3.put(enumC0569ib21, c0386b93);
        hashMap3.put(enumC0569ib22, c0386b94);
        hashMap3.put(enumC0569ib, c0386b96);
        hashMap3.put(enumC0569ib16, c0386b96);
        hashMap3.put(enumC0569ib13, c0386b92);
        hashMap3.put(enumC0569ib23, c0386b92);
        hashMap3.put(enumC0569ib24, c0386b93);
        f6721d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0748p9 a(Long l3, Long l4, Boolean bool) {
        C0748p9 c0748p9 = new C0748p9();
        if (l3 != null) {
            c0748p9.f8061a = l3.longValue();
            c0748p9.f8062b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l3.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l4 != null) {
            c0748p9.f8063c = l4.longValue();
        }
        if (bool != null) {
            c0748p9.f8064d = bool.booleanValue();
        }
        return c0748p9;
    }

    public static void a(C0696n9 c0696n9) {
        C0644l9[] c0644l9Arr = c0696n9.f7932c;
        if (c0644l9Arr != null) {
            for (C0644l9 c0644l9 : c0644l9Arr) {
            }
        }
    }
}
