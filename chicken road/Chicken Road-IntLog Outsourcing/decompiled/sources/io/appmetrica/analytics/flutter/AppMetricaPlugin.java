package io.appmetrica.analytics.flutter;

import D2.b;
import E2.a;
import H2.f;
import M0.e;
import android.content.Context;
import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements b, a {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // E2.a
    public void onAttachedToActivity(E2.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC1515c) ((e) bVar).f1788h;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC1515c) ((e) bVar).f1788h;
        }
    }

    @Override // D2.b
    public void onAttachedToEngine(D2.a aVar) {
        this.appMetrica = new AppMetricaImpl(aVar.f433a);
        Context context = aVar.f433a;
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        f fVar = aVar.f435c;
        Pigeon.AppMetricaPigeon.setup(fVar, appMetricaImpl);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(fVar, this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(fVar, new ReporterImpl(context));
        Pigeon.AppMetricaConfigConverterPigeon.setup(fVar, new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(fVar, this.deeplinkHolder);
    }

    @Override // E2.a
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

    @Override // E2.a
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

    @Override // E2.a
    public void onReattachedToActivityForConfigChanges(E2.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC1515c) ((e) bVar).f1788h;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC1515c) ((e) bVar).f1788h;
        }
    }

    @Override // D2.b
    public void onDetachedFromEngine(D2.a aVar) {
    }
}
