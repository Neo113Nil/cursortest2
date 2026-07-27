package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import e5.g;
import f4.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$start$1", f = "InAppMessagesManager.kt", l = {221, 224}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$start$1 extends h implements InterfaceC1441l {
    Object L$0;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$start$1(InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$start$1(this.this$0, interfaceC1218d);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[LOOP:0: B:7:0x005a->B:9:0x0060, LOOP_END] */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IInAppRepository iInAppRepository;
        List list;
        IInAppRepository iInAppRepository2;
        List list2;
        List list3;
        Iterator it;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            iInAppRepository = this.this$0._repository;
            this.label = 1;
            if (iInAppRepository.cleanCachedInAppMessages(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                g.y(obj);
                list2.addAll((Collection) obj);
                list3 = this.this$0.redisplayedInAppMessages;
                it = list3.iterator();
                while (it.hasNext()) {
                    ((InAppMessage) it.next()).setDisplayedInSession(false);
                }
                return v.f5689a;
            }
            g.y(obj);
        }
        list = this.this$0.redisplayedInAppMessages;
        iInAppRepository2 = this.this$0._repository;
        this.L$0 = list;
        this.label = 2;
        Object listInAppMessages = iInAppRepository2.listInAppMessages(this);
        if (listInAppMessages == enumC1260a) {
            return enumC1260a;
        }
        list2 = list;
        obj = listInAppMessages;
        list2.addAll((Collection) obj);
        list3 = this.this$0.redisplayedInAppMessages;
        it = list3.iterator();
        while (it.hasNext()) {
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$start$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
