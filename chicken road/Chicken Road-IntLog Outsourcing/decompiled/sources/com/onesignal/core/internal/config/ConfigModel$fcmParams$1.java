package com.onesignal.core.internal.config;

import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class ConfigModel$fcmParams$1 extends j implements InterfaceC1430a {
    final /* synthetic */ ConfigModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigModel$fcmParams$1(ConfigModel configModel) {
        super(0);
        this.this$0 = configModel;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return new FCMConfigModel(this.this$0, "fcmParams");
    }
}
