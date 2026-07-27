package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public IModuleReporter f5364a;

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new a(adapterIdentifiersCallback), K1.b.W(StartupParamsCallback.APPMETRICA_DEVICE_ID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new b(adapterIdentifiersCallback), K1.b.W(StartupParamsCallback.APPMETRICA_UUID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Context context, String str) {
        this.f5364a = ModulesFacade.getModuleReporter(context, str);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        IModuleReporter iModuleReporter = this.f5364a;
        if (iModuleReporter != null) {
            iModuleReporter.setSessionExtra("varioqub", bArr);
        } else {
            ModulesFacade.setSessionExtra("varioqub", bArr);
        }
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }
}
