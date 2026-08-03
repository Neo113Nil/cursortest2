package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes.dex */
public enum ApplicationState {
    UNKNOWN(io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE),
    BACKGROUND(io.appmetrica.analytics.impl.C0863z2.f7175g),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3695a;

    ApplicationState(java.lang.String str) {
        this.f3695a = str;
    }

    public static io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState fromString(java.lang.String str) {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState = UNKNOWN;
        for (io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState applicationState2 : values()) {
            if (applicationState2.f3695a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public java.lang.String getStringValue() {
        return this.f3695a;
    }
}
