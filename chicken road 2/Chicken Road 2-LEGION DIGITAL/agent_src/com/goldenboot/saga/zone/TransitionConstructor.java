package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class TransitionConstructor implements ServiceRegulator, TapPump {
    public final LongPressGateway notifyMessage;
    public final ServiceRegulator reduceScope;

    public TransitionConstructor(ServiceRegulator serviceRegulator, LongPressGateway longPressGateway) {
        this.reduceScope = serviceRegulator;
        this.notifyMessage = longPressGateway;
    }

    @Override // com.goldenboot.saga.zone.TapPump
    public TapPump getCallerFrame() {
        ServiceRegulator serviceRegulator = this.reduceScope;
        if (serviceRegulator instanceof TapPump) {
            return (TapPump) serviceRegulator;
        }
        return null;
    }

    @Override // com.goldenboot.saga.zone.ServiceRegulator
    public LongPressGateway getContext() {
        return this.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.ServiceRegulator
    public void resumeWith(Object obj) {
        this.reduceScope.resumeWith(obj);
    }
}
