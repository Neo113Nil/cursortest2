package com.onesignal.location.internal.controller.impl;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import D4.r0;
import L4.d;
import android.location.Location;
import com.onesignal.common.events.EventProducer;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2", f = "GmsLocationController.kt", l = {250, 62}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GmsLocationController$start$2 extends h implements InterfaceC1445p {
    final /* synthetic */ s $self;
    final /* synthetic */ q $wasSuccessful;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsLocationController$start$2(GmsLocationController gmsLocationController, q qVar, s sVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = gmsLocationController;
        this.$wasSuccessful = qVar;
        this.$self = sVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new GmsLocationController$start$2(this.this$0, this.$wasSuccessful, this.$self, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((GmsLocationController$start$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [L4.a] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v4, types: [L4.a] */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        L4.a aVar;
        GmsLocationController gmsLocationController;
        q qVar;
        s sVar;
        d dVar;
        ?? r0;
        Throwable th;
        GoogleApiClientCompatProxy googleApiClientCompatProxy;
        long api_fallback_time;
        GmsLocationController$start$2$1$2 gmsLocationController$start$2$1$2;
        d dVar2;
        Location location;
        EventProducer eventProducer;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                aVar = this.this$0.startStopMutex;
                gmsLocationController = this.this$0;
                qVar = this.$wasSuccessful;
                sVar = this.$self;
                this.L$0 = aVar;
                this.L$1 = gmsLocationController;
                this.L$2 = qVar;
                this.L$3 = sVar;
                this.label = 1;
                dVar = (d) aVar;
                if (dVar.c(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = (L4.a) this.L$0;
                    try {
                        try {
                            g.y(obj);
                            dVar2 = r0;
                        } catch (r0 unused) {
                            Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                            dVar2 = r0;
                            dVar = dVar2;
                            dVar.e(null);
                            return v.f5689a;
                        }
                        dVar = dVar2;
                        dVar.e(null);
                        return v.f5689a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((d) r0).e(null);
                        throw th;
                    }
                }
                sVar = (s) this.L$3;
                qVar = (q) this.L$2;
                gmsLocationController = (GmsLocationController) this.L$1;
                ?? r7 = (L4.a) this.L$0;
                g.y(obj);
                dVar = r7;
            }
            googleApiClientCompatProxy = gmsLocationController.googleApiClient;
            if (googleApiClientCompatProxy != null) {
                location = gmsLocationController.lastLocation;
                if (location != null) {
                    eventProducer = gmsLocationController.event;
                    eventProducer.fire(new GmsLocationController$start$2$1$1(gmsLocationController));
                } else {
                    Location lastLocation = gmsLocationController.getLastLocation();
                    if (lastLocation != null) {
                        gmsLocationController.setLocationAndFire(lastLocation);
                    }
                }
                qVar.f10739a = true;
                dVar.e(null);
                return v.f5689a;
            }
            try {
                api_fallback_time = GmsLocationController.Companion.getAPI_FALLBACK_TIME();
                gmsLocationController$start$2$1$2 = new GmsLocationController$start$2$1$2(sVar, gmsLocationController, qVar, null);
                this.L$0 = dVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
            } catch (r0 unused2) {
                r0 = dVar;
                Logging.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                dVar2 = r0;
                dVar = dVar2;
                dVar.e(null);
                return v.f5689a;
            }
            if (AbstractC0024y.x(api_fallback_time, gmsLocationController$start$2$1$2, this) == enumC1260a) {
                return enumC1260a;
            }
            dVar2 = dVar;
            dVar = dVar2;
            dVar.e(null);
            return v.f5689a;
        } catch (Throwable th3) {
            r0 = dVar;
            th = th3;
            ((d) r0).e(null);
            throw th;
        }
    }
}
