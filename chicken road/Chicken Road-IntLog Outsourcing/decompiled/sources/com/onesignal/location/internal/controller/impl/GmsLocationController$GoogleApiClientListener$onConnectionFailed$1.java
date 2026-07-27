package com.onesignal.location.internal.controller.impl;

import com.onesignal.location.internal.controller.impl.GmsLocationController;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$GoogleApiClientListener$onConnectionFailed$1", f = "GmsLocationController.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GmsLocationController$GoogleApiClientListener$onConnectionFailed$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ GmsLocationController.GoogleApiClientListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsLocationController$GoogleApiClientListener$onConnectionFailed$1(GmsLocationController.GoogleApiClientListener googleApiClientListener, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = googleApiClientListener;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new GmsLocationController$GoogleApiClientListener$onConnectionFailed$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        GmsLocationController gmsLocationController;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            gmsLocationController = this.this$0._parent;
            this.label = 1;
            if (gmsLocationController.stop(this) == enumC1260a) {
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
        return ((GmsLocationController$GoogleApiClientListener$onConnectionFailed$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
