package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725tk {
    public static io.appmetrica.analytics.impl.P5 a(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport serviceModuleCounterReport) {
        java.lang.String value;
        io.appmetrica.analytics.impl.P5 p5 = new io.appmetrica.analytics.impl.P5("", "", 0);
        p5.f4816d = serviceModuleCounterReport.getType();
        java.lang.String name = serviceModuleCounterReport.getName();
        if (name != null) {
            p5.f4813a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            p5.f4814b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            p5.setValueBytes(valueBytes);
        }
        return p5;
    }
}
