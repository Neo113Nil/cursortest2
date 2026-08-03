package com.ironsource;

/* loaded from: classes5.dex */
public final class Kf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Kf f5806a = new com.ironsource.Kf();

    private Kf() {
    }

    public final void a(int i) {
        a(com.ironsource.EnumC3378y5.TEST_SUITE_FAILED_TO_OPEN, java.lang.Integer.valueOf(i), null);
    }

    public final void b() {
        a(this, com.ironsource.EnumC3378y5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, com.ironsource.EnumC3378y5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, com.ironsource.EnumC3378y5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(java.lang.String errorReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        a(com.ironsource.EnumC3378y5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, java.lang.Integer.valueOf(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    static /* synthetic */ void a(com.ironsource.Kf kf, com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        kf.a(enumC3378y5, num, str);
    }

    private final void a(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Integer num, java.lang.String str) {
        com.ironsource.Tf tf = com.ironsource.Tf.f5986a;
        org.json.JSONObject a2 = tf.a(false);
        if (num != null) {
            a2.put("errorCode", num.intValue());
            org.json.JSONArray a3 = a();
            if (a3 != null) {
                a2.put(com.ironsource.mediationsdk.metadata.a.f, a3);
            }
        }
        if (str != null) {
            a2.put("reason", str);
        }
        tf.a(enumC3378y5, a2);
    }

    private final org.json.JSONArray a() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> d = com.ironsource.Tf.f5986a.d();
        if (d.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new org.json.JSONArray((java.util.Collection) d.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
