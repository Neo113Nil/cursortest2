package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dn0 extends gn0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public dn0(Context context, int i) {
        context.getClass();
        switch (i) {
            case 1:
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                systemService.getClass();
                super((MeasurementManager) systemService);
                break;
            default:
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                super(measurementManager);
                break;
        }
    }
}
