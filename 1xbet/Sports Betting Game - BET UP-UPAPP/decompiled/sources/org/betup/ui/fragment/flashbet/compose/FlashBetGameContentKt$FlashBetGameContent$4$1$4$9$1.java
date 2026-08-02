package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1", f = "FlashBetGameContent.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<FlashBetEventFlash> $activeEventFlash$delegate;
    final /* synthetic */ MutableIntState $playingElapsedMs$delegate;
    final /* synthetic */ boolean $showQuestion;
    final /* synthetic */ MutableState<Boolean> $showReveal$delegate;
    final /* synthetic */ int $totalMatchRealSec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1(boolean z, int i, MutableState<Boolean> mutableState, MutableState<FlashBetEventFlash> mutableState2, MutableIntState mutableIntState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1> continuation) {
        super(2, continuation);
        this.$showQuestion = z;
        this.$totalMatchRealSec = i;
        this.$showReveal$delegate = mutableState;
        this.$activeEventFlash$delegate = mutableState2;
        this.$playingElapsedMs$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1(this.$showQuestion, this.$totalMatchRealSec, this.$showReveal$delegate, this.$activeEventFlash$delegate, this.$playingElapsedMs$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L35
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r5.$showReveal$delegate
            boolean r6 = org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt.access$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(r6)
            if (r6 != 0) goto L51
            boolean r6 = r5.$showQuestion
            if (r6 == 0) goto L27
            goto L51
        L27:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.label = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L35
            return r0
        L35:
            androidx.compose.runtime.MutableState<org.betup.ui.fragment.flashbet.compose.FlashBetEventFlash> r6 = r5.$activeEventFlash$delegate
            org.betup.ui.fragment.flashbet.compose.FlashBetEventFlash r6 = org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt.access$FlashBetGameContent$lambda$7(r6)
            if (r6 != 0) goto L27
            androidx.compose.runtime.MutableIntState r6 = r5.$playingElapsedMs$delegate
            int r1 = org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt.access$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$56(r6)
            int r1 = r1 + 200
            int r3 = r5.$totalMatchRealSec
            int r3 = r3 * 1000
            int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r3)
            org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt.access$FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$57(r6, r1)
            goto L27
        L51:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$9$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
