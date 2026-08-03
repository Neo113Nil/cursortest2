package io.appmetrica.analytics.flutter;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements W0.b, X0.a {
    private io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetrica = null;
    private io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // X0.a
    public void onAttachedToActivity(X0.b bVar) {
        io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (P0.AbstractActivityC0047e) ((P1.h) bVar).f1483a;
        }
        io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (P0.AbstractActivityC0047e) ((P1.h) bVar).f1483a;
        }
    }

    @Override // W0.b
    public void onAttachedToEngine(W0.a aVar) {
        this.appMetrica = new io.appmetrica.analytics.flutter.impl.AppMetricaImpl(aVar.f1827a);
        android.content.Context context = aVar.f1827a;
        this.appMetricaLibraryAdapter = new io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl();
        io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetricaImpl = this.appMetrica;
        a1.f fVar = aVar.f1828b;
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.setup(fVar, appMetricaImpl);
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.setup(fVar, this.appMetricaLibraryAdapter);
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.setup(fVar, new io.appmetrica.analytics.flutter.impl.ReporterImpl(context));
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon.setup(fVar, new io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl());
        io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon.setup(fVar, this.deeplinkHolder);
    }

    @Override // X0.a
    public void onDetachedFromActivity() {
        io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // X0.a
    public void onDetachedFromActivityForConfigChanges() {
        io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // X0.a
    public void onReattachedToActivityForConfigChanges(X0.b bVar) {
        io.appmetrica.analytics.flutter.impl.AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (P0.AbstractActivityC0047e) ((P1.h) bVar).f1483a;
        }
        io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (P0.AbstractActivityC0047e) ((P1.h) bVar).f1483a;
        }
    }

    @Override // W0.b
    public void onDetachedFromEngine(W0.a aVar) {
    }
}
