package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.MutableIntState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleResultAnimationsKt$rememberBattleRevealPhase$1$1", f = "BattleResultAnimations.kt", i = {0, 0, 0}, l = {99}, m = "invokeSuspend", n = {"previousDelay", "atMs", "nextPhase"}, s = {"L$0", "J$0", "I$0"})
/* loaded from: classes2.dex */
final class BattleResultAnimationsKt$rememberBattleRevealPhase$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $fullSequence;
    final /* synthetic */ MutableIntState $phase$delegate;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleResultAnimationsKt$rememberBattleRevealPhase$1$1(boolean z, boolean z2, MutableIntState mutableIntState, Continuation<? super BattleResultAnimationsKt$rememberBattleRevealPhase$1$1> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$fullSequence = z2;
        this.$phase$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleResultAnimationsKt$rememberBattleRevealPhase$1$1(this.$enabled, this.$fullSequence, this.$phase$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleResultAnimationsKt$rememberBattleRevealPhase$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x011b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x014f -> B:5:0x0152). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listOf;
        Iterator it;
        Ref.LongRef longRef;
        MutableIntState mutableIntState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$enabled) {
                this.$phase$delegate.setIntValue(8);
                return Unit.INSTANCE;
            }
            this.$phase$delegate.setIntValue(-1);
            if (this.$fullSequence) {
                listOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Boxing.boxLong(16L), Boxing.boxInt(1)), TuplesKt.to(Boxing.boxLong(280L), Boxing.boxInt(2)), TuplesKt.to(Boxing.boxLong(480L), Boxing.boxInt(3)), TuplesKt.to(Boxing.boxLong(900L), Boxing.boxInt(4)), TuplesKt.to(Boxing.boxLong(1140L), Boxing.boxInt(5)), TuplesKt.to(Boxing.boxLong(1480L), Boxing.boxInt(6)), TuplesKt.to(Boxing.boxLong(2100L), Boxing.boxInt(7)), TuplesKt.to(Boxing.boxLong(2360L), Boxing.boxInt(8))});
            } else {
                listOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Boxing.boxLong(16L), Boxing.boxInt(1)), TuplesKt.to(Boxing.boxLong(160L), Boxing.boxInt(2)), TuplesKt.to(Boxing.boxLong(300L), Boxing.boxInt(8))});
            }
            Ref.LongRef longRef2 = new Ref.LongRef();
            MutableIntState mutableIntState2 = this.$phase$delegate;
            it = listOf.iterator();
            longRef = longRef2;
            mutableIntState = mutableIntState2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = this.I$0;
            long longValue = this.J$0;
            it = (Iterator) this.L$2;
            mutableIntState = (MutableIntState) this.L$1;
            longRef = (Ref.LongRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            longRef.element = longValue;
            mutableIntState.setIntValue(intValue);
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                longValue = ((Number) pair.component1()).longValue();
                intValue = ((Number) pair.component2()).intValue();
                long coerceAtLeast = RangesKt.coerceAtLeast(longValue - longRef.element, 0L);
                this.L$0 = longRef;
                this.L$1 = mutableIntState;
                this.L$2 = it;
                this.J$0 = longValue;
                this.I$0 = intValue;
                this.label = 1;
                if (DelayKt.delay(coerceAtLeast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longRef.element = longValue;
                mutableIntState.setIntValue(intValue);
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
