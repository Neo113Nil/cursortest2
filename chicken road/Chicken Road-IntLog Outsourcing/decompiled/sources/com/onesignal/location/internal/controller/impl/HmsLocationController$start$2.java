package com.onesignal.location.internal.controller.impl;

import B0.f;
import D4.InterfaceC0022w;
import L4.d;
import android.location.Location;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationServices;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.impl.HmsLocationController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.location.internal.controller.impl.HmsLocationController$start$2", f = "HmsLocationController.kt", l = {229, 81}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HmsLocationController$start$2 extends h implements InterfaceC1445p {
    final /* synthetic */ s $self;
    final /* synthetic */ q $wasSuccessful;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsLocationController$start$2(HmsLocationController hmsLocationController, q qVar, s sVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = hmsLocationController;
        this.$wasSuccessful = qVar;
        this.$self = sVar;
    }

    private static final void invokeSuspend$lambda$2$lambda$0(s sVar, HmsLocationController hmsLocationController, Location location) {
        Logging.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
        if (location == null) {
            ((WaiterWithValue) sVar.f10741a).wake(Boolean.FALSE);
        } else {
            hmsLocationController.lastLocation = location;
            ((WaiterWithValue) sVar.f10741a).wake(Boolean.TRUE);
        }
    }

    private static final void invokeSuspend$lambda$2$lambda$1(s sVar, Exception exc) {
        Logging.warn("Huawei LocationServices getLastLocation failed!", exc);
        ((WaiterWithValue) sVar.f10741a).wake(Boolean.FALSE);
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new HmsLocationController$start$2(this.this$0, this.$wasSuccessful, this.$self, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((HmsLocationController$start$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0105 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #2 {all -> 0x002b, blocks: (B:7:0x0026, B:8:0x00f9, B:10:0x0105), top: B:6:0x0026 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [L4.a] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [L4.a] */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        L4.a aVar;
        d dVar;
        q qVar;
        HmsLocationController hmsLocationController;
        s sVar;
        ?? r42;
        Throwable th;
        FusedLocationProviderClient fusedLocationProviderClient;
        IApplicationService iApplicationService;
        Location location;
        FusedLocationProviderClient fusedLocationProviderClient2;
        s sVar2;
        q qVar2;
        q qVar3;
        HmsLocationController hmsLocationController2;
        EventProducer eventProducer;
        EventProducer eventProducer2;
        IApplicationService iApplicationService2;
        FusedLocationProviderClient fusedLocationProviderClient3;
        f.u();
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                aVar = this.this$0.startStopMutex;
                HmsLocationController hmsLocationController3 = this.this$0;
                q qVar4 = this.$wasSuccessful;
                s sVar3 = this.$self;
                this.L$0 = aVar;
                this.L$1 = hmsLocationController3;
                this.L$2 = qVar4;
                this.L$3 = sVar3;
                this.label = 1;
                dVar = (d) aVar;
                if (dVar.c(this) == enumC1260a) {
                    return enumC1260a;
                }
                qVar = qVar4;
                hmsLocationController = hmsLocationController3;
                sVar = sVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar2 = (q) this.L$4;
                    sVar2 = (s) this.L$3;
                    qVar3 = (q) this.L$2;
                    hmsLocationController2 = (HmsLocationController) this.L$1;
                    r42 = (L4.a) this.L$0;
                    try {
                        g.y(obj);
                        r42 = r42;
                        qVar2.f10739a = ((Boolean) obj).booleanValue();
                        if (qVar3.f10739a) {
                            eventProducer2 = hmsLocationController2.event;
                            eventProducer2.fire(new HmsLocationController$start$2$1$4(hmsLocationController2));
                            HmsLocationController hmsLocationController4 = (HmsLocationController) sVar2.f10741a;
                            iApplicationService2 = hmsLocationController2._applicationService;
                            fusedLocationProviderClient3 = hmsLocationController2.hmsFusedLocationClient;
                            i.b(fusedLocationProviderClient3);
                            hmsLocationController2.locationUpdateListener = new HmsLocationController.LocationUpdateListener(hmsLocationController4, iApplicationService2, fusedLocationProviderClient3);
                        }
                        dVar = r42;
                        dVar.e(null);
                        return v.f5689a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((d) r42).e(null);
                        throw th;
                    }
                }
                sVar = (s) this.L$3;
                qVar = (q) this.L$2;
                hmsLocationController = (HmsLocationController) this.L$1;
                ?? r7 = (L4.a) this.L$0;
                g.y(obj);
                dVar = r7;
            }
            fusedLocationProviderClient = hmsLocationController.hmsFusedLocationClient;
            if (fusedLocationProviderClient == null) {
                try {
                    iApplicationService = hmsLocationController._applicationService;
                    hmsLocationController.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(iApplicationService.getAppContext());
                } catch (Exception e3) {
                    Logging.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e3, null, 2, null);
                    qVar.f10739a = false;
                }
            }
            location = hmsLocationController.lastLocation;
            if (location != null) {
                eventProducer = hmsLocationController.event;
                eventProducer.fire(new HmsLocationController$start$2$1$1(hmsLocationController));
                dVar.e(null);
                return v.f5689a;
            }
            s sVar4 = new s();
            sVar4.f10741a = new WaiterWithValue();
            fusedLocationProviderClient2 = hmsLocationController.hmsFusedLocationClient;
            i.b(fusedLocationProviderClient2);
            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new a()).addOnFailureListener(new b());
            WaiterWithValue waiterWithValue = (WaiterWithValue) sVar4.f10741a;
            this.L$0 = dVar;
            this.L$1 = hmsLocationController;
            this.L$2 = qVar;
            this.L$3 = sVar;
            this.L$4 = qVar;
            this.label = 2;
            Object waitForWake = waiterWithValue.waitForWake(this);
            if (waitForWake == enumC1260a) {
                return enumC1260a;
            }
            r42 = dVar;
            obj = waitForWake;
            sVar2 = sVar;
            qVar2 = qVar;
            qVar3 = qVar2;
            hmsLocationController2 = hmsLocationController;
            qVar2.f10739a = ((Boolean) obj).booleanValue();
            if (qVar3.f10739a) {
            }
            dVar = r42;
            dVar.e(null);
            return v.f5689a;
        } catch (Throwable th3) {
            r42 = dVar;
            th = th3;
            ((d) r42).e(null);
            throw th;
        }
    }
}
