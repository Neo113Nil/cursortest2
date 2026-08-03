package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384gf implements io.appmetrica.analytics.impl.InterfaceC0840y5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0840y5, s1.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0643qf invoke(android.content.ContentValues contentValues) {
        java.lang.String asString = contentValues.getAsString("tracking_id");
        if (android.text.TextUtils.isEmpty(asString)) {
            io.appmetrica.analytics.impl.AbstractC0362fj.a("Tracking id is empty", new java.lang.Object[0]);
            return null;
        }
        if (io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(asString) == null) {
            io.appmetrica.analytics.impl.AbstractC0362fj.a("Tracking id from preload info content provider is not a number", new java.lang.Object[0]);
            return null;
        }
        try {
            java.lang.String asString2 = contentValues.getAsString("additional_params");
            if (android.text.TextUtils.isEmpty(asString2)) {
                io.appmetrica.analytics.impl.AbstractC0362fj.a("No additional params", new java.lang.Object[0]);
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(asString2);
            if (jSONObject.length() == 0) {
                io.appmetrica.analytics.impl.AbstractC0362fj.a("Additional params are empty", new java.lang.Object[0]);
                return null;
            }
            io.appmetrica.analytics.impl.AbstractC0362fj.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new io.appmetrica.analytics.impl.C0643qf(asString, jSONObject, true, false, io.appmetrica.analytics.impl.S7.f4956e);
        } catch (java.lang.Throwable th) {
            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Could not parse additional parameters\n" + io.appmetrica.analytics.coreutils.internal.StringUtils.throwableToString(th), new java.lang.Object[0]);
            return null;
        }
    }
}
