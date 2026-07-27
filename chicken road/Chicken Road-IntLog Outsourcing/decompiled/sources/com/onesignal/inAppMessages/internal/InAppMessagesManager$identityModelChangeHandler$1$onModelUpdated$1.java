package com.onesignal.inAppMessages.internal;

import D4.C0013m;
import D4.InterfaceC0012l;
import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.IConsistencyManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1", f = "InAppMessagesManager.kt", l = {166, 167, 169}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1 extends h implements InterfaceC1441l {
    final /* synthetic */ String $newOneSignalId;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1(InAppMessagesManager inAppMessagesManager, String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = inAppMessagesManager;
        this.$newOneSignalId = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1(this.this$0, this.$newOneSignalId, interfaceC1218d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IConsistencyManager iConsistencyManager;
        RywData rywData;
        Object fetchMessages;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iConsistencyManager = this.this$0._consistencyManager;
            IamFetchReadyCondition iamFetchReadyCondition = new IamFetchReadyCondition(this.$newOneSignalId);
            this.label = 1;
            obj = iConsistencyManager.getRywDataFromAwaitableCondition(iamFetchReadyCondition, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                    return v.f5689a;
                }
                g.y(obj);
                rywData = (RywData) obj;
                if (rywData != null) {
                    InAppMessagesManager inAppMessagesManager = this.this$0;
                    this.label = 3;
                    fetchMessages = inAppMessagesManager.fetchMessages(rywData, this);
                    if (fetchMessages == enumC1260a) {
                        return enumC1260a;
                    }
                }
                return v.f5689a;
            }
            g.y(obj);
        }
        this.label = 2;
        obj = ((C0013m) ((InterfaceC0012l) obj)).W(this);
        if (obj == enumC1260a) {
            return enumC1260a;
        }
        rywData = (RywData) obj;
        if (rywData != null) {
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
