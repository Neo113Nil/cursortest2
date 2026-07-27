package com.onesignal.common.modeling;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* JADX WARN: Incorrect field signature: TTModel; */
/* loaded from: classes.dex */
public final class ModelStore$clear$2 extends j implements InterfaceC1441l {
    final /* synthetic */ Model $item;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
    public ModelStore$clear$2(Model model, String str) {
        super(1);
        this.$item = model;
        this.$tag = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IModelStoreChangeHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IModelStoreChangeHandler<TModel> it) {
        i.e(it, "it");
        it.onModelRemoved(this.$item, this.$tag);
    }
}
