package com.vungle.ads.internal;

import android.content.Context;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* loaded from: classes7.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f12196a = new AtomicBoolean(false);
    public AtomicBoolean b = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final l2 d = new l2(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public final void a(final Context context, final String appId, InitializationListener initializationCallback) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        AnalyticsClient.a(AnalyticsClient.INSTANCE, new k2(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.s) null, 6);
        this.d.e();
        this.c.add(initializationCallback);
        if (!StringsKt.isBlank(appId)) {
            for (int i = 0; i < appId.length(); i++) {
                char charAt = appId.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '.') {
                }
            }
            if (com.vungle.ads.internal.util.z.a()) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.b("VungleInitializer", "Init: SDK is supported only for API versions 25 and above.");
                a(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
                return;
            }
            ConfigManager.INSTANCE.getClass();
            ConfigManager.b(appId);
            if (this.f12196a.get()) {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already complete");
                b();
                return;
            } else if (this.b.getAndSet(true)) {
                boolean z3 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("VungleInitializer", "init already in progress");
                return;
            } else {
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new q2(context));
                final Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new r2(context));
                ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) lazy.getValue())).b().a(new Runnable() { // from class: com.vungle.ads.internal.v2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v2.a(v2.this, context, appId, lazy2);
                    }
                }, new Runnable() { // from class: com.vungle.ads.internal.v2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        v2.a(v2.this);
                    }
                });
                return;
            }
        }
        a(new InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
    }

    public final void b() {
        this.b.set(false);
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.d, (com.vungle.ads.internal.util.s) null, 6);
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleInitializer", com.iab.omid.library.vungle.internal.l.a("onSuccess ").append(Thread.currentThread().getId()).toString());
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new u2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    public static final void a(v2 this$0, Context context, String appId, Lazy vungleApiClient$delegate) {
        boolean z;
        ?? emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        this$0.getClass();
        boolean z2 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean z3 = ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0;
        if (!z2 || !z3) {
            boolean z4 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "Network permissions not granted");
            Handler handler = com.vungle.ads.internal.util.y.f12193a;
            com.vungle.ads.internal.util.y.a(new s2(this$0));
            return;
        }
        PrivacyManager.INSTANCE.a(context);
        ((VungleApiClient) vungleApiClient$delegate.getValue()).c(appId);
        try {
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new m2(context));
            ConfigManager configManager = ConfigManager.INSTANCE;
            FilePreferences filePreferences = (FilePreferences) lazy.getValue();
            configManager.getClass();
            com.vungle.ads.internal.model.w2 a2 = ConfigManager.a(filePreferences, appId);
            if (a2 != null) {
                configManager.a(context, a2, q0.INIT_CACHED, null);
                ConfigManager.c();
                z = true;
            } else {
                z = false;
            }
            File[] listFiles = ((PathProvider) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new n2(context)).getValue()).getVmDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        arrayList.add(file);
                    }
                }
                emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    emptyList.add(((File) it.next()).getName());
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new o2(context));
            boolean z5 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Running cleanup jobs.");
            ((com.vungle.ads.internal.task.r) ((com.vungle.ads.internal.task.g) lazy2.getValue())).a(com.vungle.ads.internal.task.a.a(null, emptyList, 1));
            this$0.f12196a.set(true);
            this$0.b();
            a(context);
            if (z) {
                return;
            }
            ConfigManager configManager2 = ConfigManager.INSTANCE;
            p2 p2Var = new p2(this$0, context);
            configManager2.getClass();
            ConfigManager.a(context, p2Var);
        } catch (Throwable th) {
            boolean z6 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Cannot get config", th);
        }
    }

    public static final void a(v2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    public final void a(VungleError vungleError) {
        this.b.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = com.iab.omid.library.vungle.internal.l.a("Exception code is ").append(vungleError.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String()).toString();
        }
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.INSTANCE.a(this.d, (com.vungle.ads.internal.util.s) null, localizedMessage);
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new t2(this, vungleError));
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", localizedMessage);
    }

    public final void a() {
        ServiceLocator serviceLocator;
        s1 s1Var = ServiceLocator.d;
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator != null && serviceLocator.c()) {
            ((com.vungle.ads.internal.downloader.t) serviceLocator.getService(com.vungle.ads.internal.downloader.t.class)).a();
        }
        synchronized (s1Var) {
            ServiceLocator.INSTANCE = null;
        }
        Json json = VungleApiClient.n;
        com.vungle.ads.internal.network.f0.f12048a = com.vungle.ads.internal.network.f0.a();
        com.vungle.ads.internal.presenter.f0.c.set(false);
        ConfigManager.INSTANCE.a();
        this.f12196a.set(false);
        this.b.set(false);
        this.c.clear();
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.q()) {
            com.vungle.ads.internal.presenter.f0.a(context);
        }
    }

    public final void a(String integrationName, String version) {
        Intrinsics.checkNotNullParameter(integrationName, "integrationName");
        Intrinsics.checkNotNullParameter(version, "version");
        if (StringsKt.isBlank(integrationName)) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "integrationName is empty");
            return;
        }
        String d = com.vungle.ads.internal.network.f0.d();
        String a2 = com.iab.omid.library.vungle.d.a(integrationName, !StringsKt.isBlank(version) ? "/" + version : "");
        if (StringsKt.contains$default((CharSequence) d, (CharSequence) a2, false, 2, (Object) null)) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.f0.c(d + ';' + a2);
        if (this.f12196a.get()) {
            boolean z3 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
