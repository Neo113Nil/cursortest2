package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355a4 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f6935a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f6936b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f6937c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f6938d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f6939e;
    public final IdentifiersResult f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f6940g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f6941h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f6942i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f6943j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f6944k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6945l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6946m;

    /* renamed from: n, reason: collision with root package name */
    public final C0413ca f6947n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f6948o;

    public C0355a4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j3, long j4, C0413ca c0413ca, Bundle bundle) {
        this.f6935a = identifiersResult;
        this.f6936b = identifiersResult2;
        this.f6937c = identifiersResult3;
        this.f6938d = identifiersResult4;
        this.f6939e = identifiersResult5;
        this.f = identifiersResult6;
        this.f6940g = identifiersResult7;
        this.f6941h = identifiersResult8;
        this.f6942i = identifiersResult9;
        this.f6943j = identifiersResult10;
        this.f6944k = identifiersResult11;
        this.f6945l = j3;
        this.f6946m = j4;
        this.f6947n = c0413ca;
        this.f6948o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f6935a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f6936b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f6937c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f6938d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f6939e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f6940g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f6941h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f6942i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f6943j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f6944k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f6945l);
        bundle.putLong("NextStartupTime", this.f6946m);
        C0413ca c0413ca = this.f6947n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c0413ca);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C0878ua.f8414H.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f6935a + ", mDeviceIdData=" + this.f6936b + ", mDeviceIdHashData=" + this.f6937c + ", mReportAdUrlData=" + this.f6938d + ", mGetAdUrlData=" + this.f6939e + ", mResponseClidsData=" + this.f + ", mClientClidsForRequestData=" + this.f6940g + ", mGaidData=" + this.f6941h + ", mHoaidData=" + this.f6942i + ", yandexAdvIdData=" + this.f6943j + ", customSdkHostsData=" + this.f6944k + ", mServerTimeOffset=" + this.f6945l + ", nextStartupTime=" + this.f6946m + ", features=" + this.f6947n + ", modulesConfig=" + this.f6948o + '}';
    }

    public static C0413ca a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C0413ca.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C0413ca c0413ca = (C0413ca) parcelable;
        return c0413ca == null ? new C0413ca(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c0413ca;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static C0413ca a(Boolean bool) {
        boolean z3 = bool != null;
        return new C0413ca(bool, z3 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z3 ? null : "no identifier in startup state");
    }
}
