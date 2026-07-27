package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import e5.g;
import f4.v;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$onMessageActionOccurredOnPreview$1", f = "InAppMessagesManager.kt", l = {788, 789}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InAppMessagesManager$onMessageActionOccurredOnPreview$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InAppMessageClickResult $action;
    final /* synthetic */ InAppMessage $message;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$onMessageActionOccurredOnPreview$1(InAppMessageClickResult inAppMessageClickResult, InAppMessage inAppMessage, InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$action = inAppMessageClickResult;
        this.$message = inAppMessage;
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new InAppMessagesManager$onMessageActionOccurredOnPreview$1(this.$action, this.$message, this.this$0, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object firePublicClickHandler;
        Object beginProcessingPrompts;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            this.$action.setFirstClick(this.$message.takeActionAsUnique());
            InAppMessagesManager inAppMessagesManager = this.this$0;
            InAppMessage inAppMessage = this.$message;
            InAppMessageClickResult inAppMessageClickResult = this.$action;
            this.label = 1;
            firePublicClickHandler = inAppMessagesManager.firePublicClickHandler(inAppMessage, inAppMessageClickResult, this);
            if (firePublicClickHandler == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
                this.this$0.fireClickAction(this.$action);
                this.this$0.logInAppMessagePreviewActions(this.$action);
                return v.f5689a;
            }
            g.y(obj);
        }
        InAppMessagesManager inAppMessagesManager2 = this.this$0;
        InAppMessage inAppMessage2 = this.$message;
        List<InAppMessagePrompt> prompts = this.$action.getPrompts();
        this.label = 2;
        beginProcessingPrompts = inAppMessagesManager2.beginProcessingPrompts(inAppMessage2, prompts, this);
        if (beginProcessingPrompts == enumC1260a) {
            return enumC1260a;
        }
        this.this$0.fireClickAction(this.$action);
        this.this$0.logInAppMessagePreviewActions(this.$action);
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((InAppMessagesManager$onMessageActionOccurredOnPreview$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
