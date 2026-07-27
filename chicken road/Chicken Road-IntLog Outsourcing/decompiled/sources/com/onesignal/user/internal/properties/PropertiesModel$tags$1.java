package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.MapModel;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class PropertiesModel$tags$1 extends j implements InterfaceC1430a {
    final /* synthetic */ PropertiesModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModel$tags$1(PropertiesModel propertiesModel) {
        super(0);
        this.this$0 = propertiesModel;
    }

    @Override // t4.InterfaceC1430a
    public final MapModel<String> invoke() {
        return new MapModel<>(this.this$0, "tags");
    }
}
