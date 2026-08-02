package io.sentry.android.replay;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import f6.C1116i;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class ModifierExtensionsKt$sentryReplayMask$1 extends i implements Function1 {
    public static final ModifierExtensionsKt$sentryReplayMask$1 INSTANCE = new ModifierExtensionsKt$sentryReplayMask$1();

    public ModifierExtensionsKt$sentryReplayMask$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C1116i.f13008a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        h.e(semanticsPropertyReceiver, "$this$semantics");
        semanticsPropertyReceiver.set(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "mask");
    }
}
