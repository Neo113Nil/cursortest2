package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lc implements sk {
    public static final a e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4861a;
    public final Partner b;
    public volatile boolean c;
    public final mc d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public lc(Context applicationContext, wg sharedPrefsHelper, dg resourcesLoader, AtomicReference sdkConfig) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f4861a = sdkConfig;
        Partner createPartner = Partner.createPartner("Chartboost", "9.13.0");
        Intrinsics.checkNotNullExpressionValue(createPartner, "createPartner(...)");
        this.b = createPartner;
        this.d = new mc(sharedPrefsHelper, resourcesLoader);
        Omid.activate(applicationContext);
    }

    @Override // com.chartboost.sdk.impl.sk
    public Partner a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.sk
    public String b() {
        return this.d.a();
    }

    @Override // com.chartboost.sdk.impl.sk
    public boolean c() {
        com.chartboost.sdk.internal.Model.a aVar;
        vd d;
        return (this.c || (aVar = (com.chartboost.sdk.internal.Model.a) this.f4861a.get()) == null || (d = aVar.d()) == null || !d.g()) ? false : true;
    }

    @Override // com.chartboost.sdk.impl.sk
    public boolean isActive() {
        return c() && Omid.isActive();
    }

    @Override // com.chartboost.sdk.impl.sk
    public String a(String adResponseHtml) {
        Intrinsics.checkNotNullParameter(adResponseHtml, "adResponseHtml");
        if (c()) {
            try {
                String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(b(), adResponseHtml);
                Intrinsics.checkNotNull(injectScriptContentIntoHtml);
                return injectScriptContentIntoHtml;
            } catch (Throwable unused) {
            }
        }
        return adResponseHtml;
    }
}
