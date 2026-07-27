package com.onesignal.common.modeling;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Model$notifyChanged$1 extends j implements InterfaceC1441l {
    final /* synthetic */ ModelChangedArgs $changeArgs;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Model$notifyChanged$1(ModelChangedArgs modelChangedArgs, String str) {
        super(1);
        this.$changeArgs = modelChangedArgs;
        this.$tag = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IModelChangedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IModelChangedHandler it) {
        i.e(it, "it");
        it.onChanged(this.$changeArgs, this.$tag);
    }
}
