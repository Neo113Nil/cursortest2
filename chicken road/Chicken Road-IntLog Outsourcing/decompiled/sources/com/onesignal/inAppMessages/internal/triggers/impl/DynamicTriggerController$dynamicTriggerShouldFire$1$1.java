package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class DynamicTriggerController$dynamicTriggerShouldFire$1$1 extends j implements InterfaceC1441l {
    final /* synthetic */ String $triggerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTriggerController$dynamicTriggerShouldFire$1$1(String str) {
        super(1);
        this.$triggerId = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ITriggerHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ITriggerHandler it) {
        i.e(it, "it");
        it.onTriggerCompleted(this.$triggerId);
    }
}
