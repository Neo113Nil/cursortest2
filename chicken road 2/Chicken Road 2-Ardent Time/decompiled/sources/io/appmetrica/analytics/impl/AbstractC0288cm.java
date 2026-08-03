package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0288cm {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f5676a = Q1.l.y("appmetrica_clids", io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f5677b = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C3 f5678c = new io.appmetrica.analytics.impl.C3();

    public static final boolean a(java.lang.String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(io.appmetrica.analytics.impl.C0365fm c0365fm, java.util.Collection collection, java.util.Map map, s1.InterfaceC0991a interfaceC0991a) {
        boolean a2;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID)) {
                        if (c0365fm.f5932w) {
                            break;
                        } else {
                            if (f5677b.currentTimeSeconds() > c0365fm.f5925o + c0365fm.f5935z.f4184a) {
                                break;
                            }
                        }
                    } else {
                        a2 = a(c0365fm.f5914d);
                        if (a2) {
                            break;
                        }
                    }
                case 155670667:
                    if (str.equals("appmetrica_get_ad_url")) {
                        a2 = a(c0365fm.f5919i);
                        if (a2) {
                        }
                    } else if (c0365fm.f5932w) {
                    }
                    break;
                case 299713912:
                    if (str.equals(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        a2 = a(c0365fm.f5912b);
                        if (a2) {
                        }
                    } else if (c0365fm.f5932w) {
                    }
                    break;
                case 530949152:
                    if (str.equals("appmetrica_clids")) {
                        io.appmetrica.analytics.impl.C3 c3 = f5678c;
                        io.appmetrica.analytics.impl.C0864z3 c0864z3 = (io.appmetrica.analytics.impl.C0864z3) interfaceC0991a.invoke();
                        c3.getClass();
                        a2 = io.appmetrica.analytics.impl.C3.a(map, c0365fm, c0864z3);
                        if (a2) {
                        }
                    } else if (c0365fm.f5932w) {
                    }
                    break;
                case 703740463:
                    if (str.equals("appmetrica_report_ad_url")) {
                        a2 = a(c0365fm.f5920j);
                        if (a2) {
                        }
                    } else if (c0365fm.f5932w) {
                    }
                    break;
                case 1117383061:
                    if (str.equals(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        a2 = a(c0365fm.f5911a);
                        if (a2) {
                        }
                    } else if (c0365fm.f5932w) {
                    }
                    break;
                default:
                    if (c0365fm.f5932w) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }
}
