package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.R;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4678a;
    public final wg b;
    public final dg c;
    public final AtomicReference d;
    public final CoroutineDispatcher e;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ae.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Omid.activate(ae.this.f4678a);
                mb.a("OMSDK is initialized successfully!", (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                mb.b("OMSDK initialization exception", e);
            }
            return Unit.INSTANCE;
        }
    }

    public ae(Context context, wg sharedPrefsHelper, dg resourcesLoader, AtomicReference sdkConfig, CoroutineDispatcher mainDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f4678a = context;
        this.b = sharedPrefsHelper;
        this.c = resourcesLoader;
        this.d = sdkConfig;
        this.e = mainDispatcher;
    }

    public final vd b() {
        vd d;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
        return (aVar == null || (d = aVar.d()) == null) ? new vd(false, false, 0, 0, 0L, 0, null, 127, null) : d;
    }

    public final Partner c() {
        try {
            return Partner.createPartner(i(), "9.13.0");
        } catch (Exception e) {
            mb.b("Omid Partner exception", e);
            return null;
        }
    }

    public final List d() {
        vd d;
        List e;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
        return (aVar == null || (d = aVar.d()) == null || (e = d.e()) == null) ? CollectionsKt.emptyList() : e;
    }

    public final void e() {
        if (!g()) {
            mb.a("OMSDK initialize is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return;
        }
        if (f()) {
            mb.a("OMSDK initialize is already active!", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.e), null, null, new a(null), 3, null);
        } catch (Exception e) {
            mb.b("Error launching om activate job", e);
        }
    }

    public final boolean f() {
        try {
            return Omid.isActive();
        } catch (Exception e) {
            mb.a("OMSDK error when checking isActive", e);
            return false;
        }
    }

    public final boolean g() {
        vd d;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
        if (aVar == null || (d = aVar.d()) == null) {
            return false;
        }
        return d.g();
    }

    public final boolean h() {
        vd d;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
        if (aVar == null || (d = aVar.d()) == null) {
            return false;
        }
        return d.d();
    }

    public final String i() {
        return "Chartboost";
    }

    public final String a(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        if (!g()) {
            mb.b("OMSDK injectOmidJsIntoHtml is disabled by the cb config!", (Throwable) null, 2, (Object) null);
            return html;
        }
        if (!Omid.isActive()) {
            return html;
        }
        try {
            String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(a(), html);
            Intrinsics.checkNotNull(injectScriptContentIntoHtml);
            return injectScriptContentIntoHtml;
        } catch (Exception e) {
            mb.b("OmidJS injection exception", e);
            return html;
        }
    }

    public /* synthetic */ ae(Context context, wg wgVar, dg dgVar, AtomicReference atomicReference, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, wgVar, dgVar, atomicReference, (i & 16) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    public final String a() {
        return a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
    }

    public final String a(int i, String str) {
        try {
            String a2 = this.b.a(str);
            return a2 == null ? a(str, i) : a2;
        } catch (Exception e) {
            mb.b("OmidJS exception", e);
            return null;
        }
    }

    public final String a(String str, int i) {
        try {
            String a2 = this.c.a(i);
            if (a2 == null) {
                return null;
            }
            this.b.a(str, a2);
            return a2;
        } catch (Exception e) {
            mb.b("OmidJS resource file exception", e);
            return null;
        }
    }
}
