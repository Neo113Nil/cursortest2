package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746p7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8052b;

    /* renamed from: c, reason: collision with root package name */
    public final Y8 f8053c;

    /* renamed from: d, reason: collision with root package name */
    public final E8 f8054d;

    /* renamed from: e, reason: collision with root package name */
    public final C0558i0 f8055e;
    public final O8 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0823s7 f8056g;

    /* renamed from: h, reason: collision with root package name */
    public final W5 f8057h;

    public C0746p7(Context context, Yk yk, int i3, Y8 y8, E8 e8, C0558i0 c0558i0, O8 o8, C0823s7 c0823s7) {
        this.f8051a = context;
        this.f8052b = i3;
        this.f8053c = y8;
        this.f8054d = e8;
        this.f8055e = c0558i0;
        this.f = o8;
        this.f8056g = c0823s7;
        this.f8057h = e8.f5902a;
    }

    public static String b() {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q();
        C0788qn C2 = C0878ua.f8414H.C();
        C0720o7 c0720o7 = new C0720o7(qVar);
        synchronized (C2) {
            C2.f8177b.a(c0720o7);
        }
        return (String) qVar.f9672a;
    }

    public final C0642l7 a() {
        JSONObject optJSONObject;
        Jo jo;
        Integer valueOf = Integer.valueOf(this.f8057h.f6779e);
        String name = this.f8057h.getName();
        String value = this.f8057h.getValue();
        Y8 y8 = this.f8053c;
        int i3 = this.f8052b;
        zo zoVar = y8.f6858a.f6897a;
        synchronized (zoVar) {
            optJSONObject = zoVar.f8715a.a().optJSONObject("numbers_of_type");
        }
        long optLong = optJSONObject != null ? optJSONObject.optLong(String.valueOf(i3)) : 0L;
        y8.f6858a.a(i3, 1 + optLong);
        Long valueOf2 = Long.valueOf(optLong);
        C0823s7 c0823s7 = this.f8056g;
        c0823s7.getClass();
        Rb m3 = C0878ua.f8414H.m();
        Location userLocation = m3.getUserLocation();
        if (userLocation != null) {
            int i4 = Jo.f6169b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo = new Jo(location, provider);
        } else {
            Location systemLocation = m3.getSystemLocation();
            jo = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z3 = c0823s7.f8291a.f8071d;
        Double valueOf3 = jo != null ? Double.valueOf(jo.getLatitude()) : null;
        Double valueOf4 = jo != null ? Double.valueOf(jo.getLongitude()) : null;
        Long valueOf5 = jo != null ? Long.valueOf(jo.getTime()) : null;
        Integer valueOf6 = jo != null ? Integer.valueOf((int) jo.getAccuracy()) : null;
        Integer valueOf7 = jo != null ? Integer.valueOf((int) jo.getBearing()) : null;
        Integer valueOf8 = jo != null ? Integer.valueOf((int) jo.getSpeed()) : null;
        C0772q7 c0772q7 = new C0772q7(Boolean.valueOf(z3), valueOf4, valueOf3, jo != null ? Integer.valueOf((int) jo.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, jo != null ? jo.getProvider() : null, jo != null ? jo.f6170a : null);
        String str = this.f8057h.f6777c;
        C0558i0 c0558i0 = this.f8055e;
        String str2 = c0558i0.f7467a;
        Long valueOf9 = Long.valueOf(c0558i0.f7468b);
        Integer valueOf10 = Integer.valueOf(this.f8057h.f6780g);
        Context context = this.f8051a;
        He he = Le.f6229a;
        Integer num = (Integer) Le.f6231c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
        num.intValue();
        String b3 = b();
        N8 n8 = this.f8054d.f5903b;
        W5 w5 = this.f8057h;
        return new C0642l7(valueOf, name, value, valueOf2, c0772q7, str, str2, valueOf9, valueOf10, num, b3, n8, w5.f6781h, w5.f6784k, w5.f6785l, w5.f6787n, w5.f6788o, this.f.fromModel(w5.f6789p));
    }

    public /* synthetic */ C0746p7(Context context, Yk yk, int i3, Y8 y8, E8 e8, C0756ph c0756ph, C0558i0 c0558i0) {
        this(context, yk, i3, y8, e8, c0558i0, new O8(), new C0823s7(c0756ph));
    }
}
