package com.onesignal.user.internal.migrations;

import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.user.internal.migrations.RecoverFromDroppedLoginBug$start$1", f = "RecoverFromDroppedLoginBug.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RecoverFromDroppedLoginBug$start$1 extends h implements InterfaceC1441l {
    int label;
    final /* synthetic */ RecoverFromDroppedLoginBug this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverFromDroppedLoginBug$start$1(RecoverFromDroppedLoginBug recoverFromDroppedLoginBug, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = recoverFromDroppedLoginBug;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new RecoverFromDroppedLoginBug$start$1(this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IOperationRepo iOperationRepo;
        boolean isInBadState;
        IdentityModelStore identityModelStore;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iOperationRepo = this.this$0._operationRepo;
            this.label = 1;
            if (iOperationRepo.awaitInitialized(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        isInBadState = this.this$0.isInBadState();
        if (isInBadState) {
            StringBuilder sb = new StringBuilder("User with externalId:");
            identityModelStore = this.this$0._identityModelStore;
            sb.append(identityModelStore.getModel().getExternalId());
            sb.append(" was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.");
            Logging.warn$default(sb.toString(), null, 2, null);
            this.this$0.recoverByAddingBackDroppedLoginOperation();
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((RecoverFromDroppedLoginBug$start$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
