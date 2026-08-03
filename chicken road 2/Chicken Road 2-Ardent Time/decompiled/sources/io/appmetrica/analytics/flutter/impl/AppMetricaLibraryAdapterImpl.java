package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapterImpl implements io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon {
    private final android.content.Context context;

    public AppMetricaLibraryAdapterImpl(android.content.Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon
    public void activate(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon) {
        io.appmetrica.analytics.AppMetricaLibraryAdapter.activate(this.context, io.appmetrica.analytics.flutter.utils.Converter.toNative(appMetricaLibraryAdapterConfigPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon
    public void setAdvIdentifiersTracking(java.lang.Boolean bool) {
        io.appmetrica.analytics.AppMetricaLibraryAdapter.setAdvIdentifiersTracking(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon
    public void subscribeForAutoCollectedData(java.lang.String str) {
        io.appmetrica.analytics.AppMetricaLibraryAdapter.subscribeForAutoCollectedData(this.context, str);
    }
}
