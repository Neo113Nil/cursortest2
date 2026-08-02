package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class r implements InstallReferrerStateListener {
    public final /* synthetic */ com.android.installreferrer.api.a a;
    public final /* synthetic */ com.facebook.appevents.m b;

    public r(com.android.installreferrer.api.a aVar, com.facebook.appevents.m mVar) {
        this.a = aVar;
        this.b = mVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void a(int i) {
        boolean contains$default;
        boolean contains$default2;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        com.android.installreferrer.api.a aVar = this.a;
        try {
            if (i == 0) {
                try {
                    ReferrerDetails b = aVar.b();
                    Intrinsics.checkNotNullExpressionValue(b, "{\n                      …r\n                      }");
                    String string = b.a.getString("install_referrer");
                    if (string != null) {
                        contains$default = StringsKt__StringsKt.contains$default(string, "fb", false, 2, (Object) null);
                        if (!contains$default) {
                            contains$default2 = StringsKt__StringsKt.contains$default(string, "facebook", false, 2, (Object) null);
                            if (contains$default2) {
                            }
                        }
                        this.b.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.p.class)) {
                            try {
                                com.facebook.appevents.p.Companion.getClass();
                                com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", string).apply();
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.p.class);
                            }
                        }
                    }
                    com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i == 2) {
                com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            aVar.a();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, this);
            }
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void b() {
    }
}
