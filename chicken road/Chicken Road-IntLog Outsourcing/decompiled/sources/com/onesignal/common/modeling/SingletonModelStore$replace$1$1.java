package com.onesignal.common.modeling;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* JADX WARN: Incorrect field signature: TTModel; */
/* loaded from: classes.dex */
public final class SingletonModelStore$replace$1$1 extends j implements InterfaceC1441l {
    final /* synthetic */ Model $existingModel;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
    public SingletonModelStore$replace$1$1(Model model, String str) {
        super(1);
        this.$existingModel = model;
        this.$tag = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISingletonModelStoreChangeHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ISingletonModelStoreChangeHandler<TModel> it) {
        i.e(it, "it");
        it.onModelReplaced(this.$existingModel, this.$tag);
    }
}
