package io.sentry.android.replay;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ModifierExtensionsKt {

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayMask$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            h.e(semanticsPropertyReceiver, "$this$semantics");
            semanticsPropertyReceiver.set(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "mask");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayUnmask$1, reason: invalid class name and case insensitive filesystem */
    public static final class C09181 extends i implements Function1 {
        public static final C09181 INSTANCE = new C09181();

        public C09181() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            h.e(semanticsPropertyReceiver, "$this$semantics");
            semanticsPropertyReceiver.set(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
        }
    }

    public static final Modifier sentryReplayMask(Modifier modifier) {
        h.e(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, AnonymousClass1.INSTANCE, 1, (Object) null);
    }

    public static final Modifier sentryReplayUnmask(Modifier modifier) {
        h.e(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, C09181.INSTANCE, 1, (Object) null);
    }
}
