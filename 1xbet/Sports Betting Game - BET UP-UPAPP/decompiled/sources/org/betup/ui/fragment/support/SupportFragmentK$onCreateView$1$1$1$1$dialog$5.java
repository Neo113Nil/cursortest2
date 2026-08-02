package org.betup.ui.fragment.support;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.support.controller.SupportController;

/* compiled from: SupportFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class SupportFragmentK$onCreateView$1$1$1$1$dialog$5 extends FunctionReferenceImpl implements Function1<String, Unit> {
    SupportFragmentK$onCreateView$1$1$1$1$dialog$5(Object obj) {
        super(1, obj, SupportController.class, "sendFeedback", "sendFeedback(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SupportController) this.receiver).sendFeedback(p0);
    }
}
