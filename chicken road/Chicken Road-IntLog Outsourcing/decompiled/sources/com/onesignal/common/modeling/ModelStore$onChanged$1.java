package com.onesignal.common.modeling;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ModelStore$onChanged$1 extends j implements InterfaceC1441l {
    final /* synthetic */ ModelChangedArgs $args;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelStore$onChanged$1(ModelChangedArgs modelChangedArgs, String str) {
        super(1);
        this.$args = modelChangedArgs;
        this.$tag = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IModelStoreChangeHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IModelStoreChangeHandler<TModel> it) {
        i.e(it, "it");
        it.onModelUpdated(this.$args, this.$tag);
    }
}
