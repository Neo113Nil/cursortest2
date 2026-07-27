package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.flutter.utils.Converter;

/* loaded from: classes.dex */
public class AppMetricaConfigConverterImpl implements Pigeon.AppMetricaConfigConverterPigeon {
    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon
    public String toJson(Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        return Converter.toNative(appMetricaConfigPigeon).toJson();
    }
}
