package com.onesignal.core.activities;

import S.b;
import androidx.activity.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class PermissionsActivity$special$$inlined$viewModels$default$3 extends j implements InterfaceC1430a {
    final /* synthetic */ InterfaceC1430a $extrasProducer;
    final /* synthetic */ l $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsActivity$special$$inlined$viewModels$default$3(InterfaceC1430a interfaceC1430a, l lVar) {
        super(0);
        this.$extrasProducer = interfaceC1430a;
        this.$this_viewModels = lVar;
    }

    @Override // t4.InterfaceC1430a
    public final b invoke() {
        b bVar;
        InterfaceC1430a interfaceC1430a = this.$extrasProducer;
        if (interfaceC1430a != null && (bVar = (b) interfaceC1430a.invoke()) != null) {
            return bVar;
        }
        b defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
        i.d(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
