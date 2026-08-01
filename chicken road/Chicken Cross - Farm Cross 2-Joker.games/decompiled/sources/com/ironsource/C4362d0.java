package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4362d0 implements InterfaceC4344c0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4768zc f8119a;

    public C4362d0(InterfaceC4768zc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f8119a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC4344c0
    public void a(Activity activity, J9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f8119a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4344c0
    public boolean a(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f8119a.a(adInstance);
    }
}
