package org.betup.ui.fragment.support;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.betup.ui.fragment.support.controller.SupportController;

/* compiled from: SupportFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class SupportFragmentK$onCreateView$1$1$1$1$dialog$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    SupportFragmentK$onCreateView$1$1$1$1$dialog$1(Object obj) {
        super(1, obj, SupportController.class, "setSelectedTab", "setSelectedTab(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((SupportController) this.receiver).setSelectedTab(i);
    }
}
