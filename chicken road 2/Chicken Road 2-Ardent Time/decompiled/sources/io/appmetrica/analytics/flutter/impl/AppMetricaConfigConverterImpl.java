package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public class AppMetricaConfigConverterImpl implements io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon {
    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon
    public java.lang.String toJson(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        return io.appmetrica.analytics.flutter.utils.Converter.toNative(appMetricaConfigPigeon).toJson();
    }
}
