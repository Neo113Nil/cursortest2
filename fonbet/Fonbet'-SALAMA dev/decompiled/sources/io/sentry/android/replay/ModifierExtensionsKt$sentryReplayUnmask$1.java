package io.sentry.android.replay;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import f6.C1116i;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class ModifierExtensionsKt$sentryReplayUnmask$1 extends i implements Function1 {
    public static final ModifierExtensionsKt$sentryReplayUnmask$1 INSTANCE = new ModifierExtensionsKt$sentryReplayUnmask$1();

    public ModifierExtensionsKt$sentryReplayUnmask$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C1116i.f13008a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        h.e(semanticsPropertyReceiver, "$this$semantics");
        semanticsPropertyReceiver.set(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
    }
}
