package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991yk {
    public static W5 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        W5 w5 = new W5("", "", 0);
        w5.f6778d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            w5.f6775a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            w5.f6776b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            w5.setValueBytes(valueBytes);
        }
        return w5;
    }
}
