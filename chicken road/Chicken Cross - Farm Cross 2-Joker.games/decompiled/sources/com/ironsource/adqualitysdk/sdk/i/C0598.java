package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ذ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0598 extends AbstractC0404 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f1565;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1566;

    public C0598(C1226 c1226, ArrayList arrayList) {
        this.f1565 = c1226;
        this.f1566 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("WEjQ8ZhLABxDX9LgiUMCEFM=\n", "NyaRkuwidnU=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("X9O+cPFVpuRExLt29kii4knYmw==\n", "ML3/E4U80I0=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("F6websqva1kMuw9sy7V4VA==\n", "eMJfDb7GHTA=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("NIc2Ap+OT/8vkCUEmJJU8z8=\n", "W+l3YevnOZY=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("jz+uNWSjE92UKLw3Zq8s2pMljjhzrzbAgSWK\n", "4FHvVhDKZbQ=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("GtezzJD95CYBwKHbhebmKhE=\n", "dbnyr+SUkk8=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C1226.m5927(this.f1565, activity, this.f1566)) {
            m5552(StringFog.decrypt("XCipiC0+F/BHP7ufNicR/Fc=\n", "M0bo61lXYZk=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, com.ironsource.adqualitysdk.sdk.i.InterfaceC0951
    /* renamed from: ﾇ */
    public final void mo5413(Activity activity) {
        m5552(StringFog.decrypt("KxY/eJH4SJoxChBthf5CqCsKG2+TxViAIA==\n", "RHh+COGqLe4=\n"), Collections.singletonList(activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0404, com.ironsource.adqualitysdk.sdk.i.InterfaceC0951
    /* renamed from: ﾒ */
    public final void mo5414(Activity activity) {
        m5552(StringFog.decrypt("LT5fhZDsK942BHG3gdwl1zA/a5uE\n", "QlAe9eC/TrA=\n"), Collections.singletonList(activity));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5552(String str, List list) {
        C1226.m5926(this.f1565, AbstractC0548.m5514("mQ/2vpIYeleUBeSyhwhtQr1C\n", "2GyC1+RxDi4=\n", new StringBuilder(), str), true, false, list);
        AbstractC1145.m5892(new C0617(this, str, list));
    }
}
