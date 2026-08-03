package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ti implements io.appmetrica.analytics.impl.Ui {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5029b = "content://" + a() + "/clids";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5030c = "clid_key";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f5031d = "clid_value";

    public Ti(android.content.Context context) {
        this.f5028a = context;
    }

    public final java.lang.String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, s1.InterfaceC0991a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0656r3 invoke() {
        android.database.Cursor cursor;
        if (!io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.hasContentProvider(this.f5028a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            io.appmetrica.analytics.impl.AbstractC0362fj.a("Satellite content provider with clids was not found.", new java.lang.Object[0]);
            return null;
        }
        try {
            cursor = this.f5028a.getContentResolver().query(android.net.Uri.parse(this.f5029b), null, null, null, null);
        } catch (java.lang.Throwable th) {
            th = th;
            cursor = null;
        }
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new java.lang.Object[0]);
                return null;
            } finally {
                io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
            }
        }
        if (cursor == null) {
            io.appmetrica.analytics.impl.AbstractC0362fj.a("No Satellite content provider found", new java.lang.Object[0]);
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f5030c));
                java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f5031d));
                if (android.text.TextUtils.isEmpty(string) || android.text.TextUtils.isEmpty(string2)) {
                    io.appmetrica.analytics.impl.AbstractC0362fj.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        io.appmetrica.analytics.impl.AbstractC0362fj.a("Clids from satellite: %s", linkedHashMap);
        return new io.appmetrica.analytics.impl.C0656r3(linkedHashMap, io.appmetrica.analytics.impl.S7.f4955d);
    }
}
