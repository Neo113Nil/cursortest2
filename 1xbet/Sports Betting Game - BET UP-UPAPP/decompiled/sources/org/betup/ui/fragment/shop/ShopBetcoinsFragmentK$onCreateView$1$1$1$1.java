package org.betup.ui.fragment.shop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ShopBetcoinsFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class ShopBetcoinsFragmentK$onCreateView$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    ShopBetcoinsFragmentK$onCreateView$1$1$1$1(Object obj) {
        super(0, obj, ShopBetcoinsFragmentK.class, "refreshShopItems", "refreshShopItems()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ShopBetcoinsFragmentK) this.receiver).refreshShopItems();
    }
}
