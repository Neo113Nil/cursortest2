package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895p7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8987b;

    /* renamed from: c, reason: collision with root package name */
    public final Y8 f8988c;

    /* renamed from: d, reason: collision with root package name */
    public final E8 f8989d;

    /* renamed from: e, reason: collision with root package name */
    public final C0707i0 f8990e;

    /* renamed from: f, reason: collision with root package name */
    public final O8 f8991f;

    /* renamed from: g, reason: collision with root package name */
    public final C0972s7 f8992g;

    /* renamed from: h, reason: collision with root package name */
    public final W5 f8993h;

    public C0895p7(Context context, Yk yk, int i2, Y8 y8, E8 e8, C0707i0 c0707i0, O8 o8, C0972s7 c0972s7) {
        this.f8986a = context;
        this.f8987b = i2;
        this.f8988c = y8;
        this.f8989d = e8;
        this.f8990e = c0707i0;
        this.f8991f = o8;
        this.f8992g = c0972s7;
        this.f8993h = e8.f6743a;
    }

    public static String b() {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        C0937qn C2 = C1027ua.f9366H.C();
        C0869o7 c0869o7 = new C0869o7(sVar);
        synchronized (C2) {
            C2.f9120b.a(c0869o7);
        }
        return (String) sVar.f10741a;
    }

    public final C0791l7 a() {
        JSONObject optJSONObject;
        Jo jo;
        Integer valueOf = Integer.valueOf(this.f8993h.f7652e);
        String name = this.f8993h.getName();
        String value = this.f8993h.getValue();
        Y8 y8 = this.f8988c;
        int i2 = this.f8987b;
        zo zoVar = y8.f7735a.f7775a;
        synchronized (zoVar) {
            optJSONObject = zoVar.f9678a.a().optJSONObject("numbers_of_type");
        }
        long optLong = optJSONObject != null ? optJSONObject.optLong(String.valueOf(i2)) : 0L;
        y8.f7735a.a(i2, 1 + optLong);
        Long valueOf2 = Long.valueOf(optLong);
        C0972s7 c0972s7 = this.f8992g;
        c0972s7.getClass();
        Rb m6 = C1027ua.f9366H.m();
        Location userLocation = m6.getUserLocation();
        if (userLocation != null) {
            int i3 = Jo.f7022b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            jo = new Jo(location, provider);
        } else {
            Location systemLocation = m6.getSystemLocation();
            jo = systemLocation != null ? new Jo(new Location(systemLocation), "") : null;
        }
        boolean z = c0972s7.f9238a.f9007d;
        Double valueOf3 = jo != null ? Double.valueOf(jo.getLatitude()) : null;
        Double valueOf4 = jo != null ? Double.valueOf(jo.getLongitude()) : null;
        Long valueOf5 = jo != null ? Long.valueOf(jo.getTime()) : null;
        Integer valueOf6 = jo != null ? Integer.valueOf((int) jo.getAccuracy()) : null;
        Integer valueOf7 = jo != null ? Integer.valueOf((int) jo.getBearing()) : null;
        Integer valueOf8 = jo != null ? Integer.valueOf((int) jo.getSpeed()) : null;
        C0921q7 c0921q7 = new C0921q7(Boolean.valueOf(z), valueOf4, valueOf3, jo != null ? Integer.valueOf((int) jo.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, jo != null ? jo.getProvider() : null, jo != null ? jo.f7023a : null);
        String str = this.f8993h.f7650c;
        C0707i0 c0707i0 = this.f8990e;
        String str2 = c0707i0.f8373a;
        Long valueOf9 = Long.valueOf(c0707i0.f8374b);
        Integer valueOf10 = Integer.valueOf(this.f8993h.f7654g);
        Context context = this.f8986a;
        He he = Le.f7085a;
        Integer num = (Integer) Le.f7087c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Ke()));
        num.intValue();
        String b6 = b();
        N8 n8 = this.f8989d.f6744b;
        W5 w5 = this.f8993h;
        return new C0791l7(valueOf, name, value, valueOf2, c0921q7, str, str2, valueOf9, valueOf10, num, b6, n8, w5.f7655h, w5.f7658k, w5.f7659l, w5.f7661n, w5.f7662o, this.f8991f.fromModel(w5.f7663p));
    }

    public /* synthetic */ C0895p7(Context context, Yk yk, int i2, Y8 y8, E8 e8, C0905ph c0905ph, C0707i0 c0707i0) {
        this(context, yk, i2, y8, e8, c0707i0, new O8(), new C0972s7(c0905ph));
    }
}
