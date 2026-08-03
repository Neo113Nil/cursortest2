package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545ml implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0571nl f6444a;

    public C0545ml(io.appmetrica.analytics.impl.C0571nl c0571nl) {
        this.f6444a = c0571nl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) obj;
        io.appmetrica.analytics.impl.C0571nl c0571nl = this.f6444a;
        if (c0571nl.f6542b.hasPermission(c0571nl.f6541a, "android.permission.READ_PHONE_STATE")) {
            return java.lang.Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
