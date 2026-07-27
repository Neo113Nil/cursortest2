package com.onesignal.location.internal.controller.impl;

import B0.f;
import android.location.Location;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.onesignal.common.threading.Waiter;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.location.internal.controller.impl.HmsLocationController$getLastLocation$1", f = "HmsLocationController.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HmsLocationController$getLastLocation$1 extends h implements InterfaceC1441l {
    final /* synthetic */ FusedLocationProviderClient $locationClient;
    final /* synthetic */ s $retVal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsLocationController$getLastLocation$1(FusedLocationProviderClient fusedLocationProviderClient, s sVar, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$locationClient = fusedLocationProviderClient;
        this.$retVal = sVar;
    }

    private static final void invokeSuspend$lambda$0(s sVar, s sVar2, Location location) {
        Logging.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
        if (location == null) {
            ((Waiter) sVar.f10741a).wake();
        } else {
            sVar2.f10741a = location;
            ((Waiter) sVar.f10741a).wake();
        }
    }

    private static final void invokeSuspend$lambda$1(s sVar, Exception exc) {
        Logging.warn("Huawei LocationServices getLastLocation failed!", exc);
        ((Waiter) sVar.f10741a).wake();
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new HmsLocationController$getLastLocation$1(this.$locationClient, this.$retVal, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        f.u();
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            s sVar = new s();
            sVar.f10741a = new Waiter();
            this.$locationClient.getLastLocation().addOnSuccessListener(new a()).addOnFailureListener(new b());
            Waiter waiter = (Waiter) sVar.f10741a;
            this.label = 1;
            if (waiter.waitForWake(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((HmsLocationController$getLastLocation$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
