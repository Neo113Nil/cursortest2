package io.appmetrica.analytics.flutter;

import A0.h;
import I1.AbstractActivityC0027d;
import P1.b;
import Q1.a;
import T1.f;
import android.content.Context;
import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements b, a {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // Q1.a
    public void onAttachedToActivity(Q1.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0027d) ((h) bVar).f54b;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0027d) ((h) bVar).f54b;
        }
    }

    @Override // P1.b
    public void onAttachedToEngine(P1.a aVar) {
        this.appMetrica = new AppMetricaImpl(aVar.f1152a);
        Context context = aVar.f1152a;
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        f fVar = aVar.f1153b;
        Pigeon.AppMetricaPigeon.setup(fVar, appMetricaImpl);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(fVar, this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(fVar, new ReporterImpl(context));
        Pigeon.AppMetricaConfigConverterPigeon.setup(fVar, new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(fVar, this.deeplinkHolder);
    }

    @Override // Q1.a
    public void onDetachedFromActivity() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // Q1.a
    public void onDetachedFromActivityForConfigChanges() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // Q1.a
    public void onReattachedToActivityForConfigChanges(Q1.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0027d) ((h) bVar).f54b;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0027d) ((h) bVar).f54b;
        }
    }

    @Override // P1.b
    public void onDetachedFromEngine(P1.a aVar) {
    }
}
