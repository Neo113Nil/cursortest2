package org.betup.ui.fragment.support;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.betup.ui.fragment.support.controller.SupportController;

/* compiled from: SupportFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class SupportFragmentK$onCreateView$1$1$1$1$dialog$6 extends FunctionReferenceImpl implements Function0<Unit> {
    SupportFragmentK$onCreateView$1$1$1$1$dialog$6(Object obj) {
        super(0, obj, SupportController.class, "resetFeedbackSuccess", "resetFeedbackSuccess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SupportController) this.receiver).resetFeedbackSuccess();
    }
}
