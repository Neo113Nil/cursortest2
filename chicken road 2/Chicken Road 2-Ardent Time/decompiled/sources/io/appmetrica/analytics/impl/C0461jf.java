package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461jf implements io.appmetrica.analytics.impl.Ui {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6191a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6192b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6193c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f6194d = "additional_parameters";

    public C0461jf(android.content.Context context) {
        this.f6191a = context;
    }

    public final java.lang.String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, s1.InterfaceC0991a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0643qf invoke() {
        android.database.Cursor cursor;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        if (!io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(this.f6191a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            io.appmetrica.analytics.impl.AbstractC0362fj.a("Satellite content provider with preload info was not found.", new java.lang.Object[0]);
            return null;
        }
        try {
            cursor = this.f6191a.getContentResolver().query(android.net.Uri.parse(this.f6192b), null, null, null, null);
            try {
                if (cursor == null) {
                    io.appmetrica.analytics.impl.AbstractC0362fj.a("No Satellite content provider found", new java.lang.Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6193c));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6194d));
                        if (string2 != null) {
                            try {
                            } catch (java.lang.Throwable unused) {
                                jSONObject = new org.json.JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject2 = new org.json.JSONObject(string2);
                                if (!android.text.TextUtils.isEmpty(string) && io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(string) == null) {
                                    io.appmetrica.analytics.impl.AbstractC0362fj.a("Tracking id from Satellite is not a number.", new java.lang.Object[0]);
                                }
                                io.appmetrica.analytics.impl.AbstractC0362fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                io.appmetrica.analytics.impl.C0643qf c0643qf = new io.appmetrica.analytics.impl.C0643qf(string, jSONObject2, !android.text.TextUtils.isEmpty(string), false, io.appmetrica.analytics.impl.S7.f4955d);
                                io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                                return c0643qf;
                            }
                        }
                        jSONObject = new org.json.JSONObject();
                        jSONObject2 = jSONObject;
                        if (!android.text.TextUtils.isEmpty(string)) {
                            io.appmetrica.analytics.impl.AbstractC0362fj.a("Tracking id from Satellite is not a number.", new java.lang.Object[0]);
                        }
                        io.appmetrica.analytics.impl.AbstractC0362fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        io.appmetrica.analytics.impl.C0643qf c0643qf2 = new io.appmetrica.analytics.impl.C0643qf(string, jSONObject2, !android.text.TextUtils.isEmpty(string), false, io.appmetrica.analytics.impl.S7.f4955d);
                        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
                        return c0643qf2;
                    }
                    io.appmetrica.analytics.impl.AbstractC0362fj.a("No Preload Info data in Satellite content provider", new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable unused2) {
            }
        } catch (java.lang.Throwable unused3) {
            cursor = null;
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
        return null;
    }
}
