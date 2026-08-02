package org.betup.ui.tour.compose;

import android.graphics.Rect;
import android.util.Log;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.TabMenuItem;

/* compiled from: TourScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.compose.TourScreenKt$TourScreen$10$1", f = "TourScreen.kt", i = {0}, l = {105}, m = "invokeSuspend", n = {"tab"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class TourScreenKt$TourScreen$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TourStep $currentStep;
    final /* synthetic */ boolean $isOverlayVisible;
    final /* synthetic */ TourManager $tourManager;
    final /* synthetic */ TourState $tourState;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* compiled from: TourScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TourStep.values().length];
            try {
                iArr[TourStep.CLICK_BOTTOM_SPORTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MY_BETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_SHOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TourStep.CLICK_BOTTOM_MENU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourScreenKt$TourScreen$10$1(boolean z, TourStep tourStep, TourState tourState, TourManager tourManager, Continuation<? super TourScreenKt$TourScreen$10$1> continuation) {
        super(2, continuation);
        this.$isOverlayVisible = z;
        this.$currentStep = tourStep;
        this.$tourState = tourState;
        this.$tourManager = tourManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourScreenKt$TourScreen$10$1(this.$isOverlayVisible, this.$currentStep, this.$tourState, this.$tourManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourScreenKt$TourScreen$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0077 -> B:5:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TabMenuItem tabMenuItem;
        TabMenuItem tabMenuItem2;
        int i;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isOverlayVisible || !HomeTourScroll.INSTANCE.isBottomTabStep(this.$currentStep)) {
                return Unit.INSTANCE;
            }
            TourStep tourStep = this.$currentStep;
            int i4 = tourStep == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tourStep.ordinal()];
            if (i4 == 1) {
                tabMenuItem = TabMenuItem.MATCHES;
            } else if (i4 == 2) {
                tabMenuItem = TabMenuItem.BETS;
            } else if (i4 == 3) {
                tabMenuItem = TabMenuItem.SHOP;
            } else if (i4 == 4) {
                tabMenuItem = TabMenuItem.DRAWER;
            } else {
                return Unit.INSTANCE;
            }
            this.$tourState.setBottomTabBounds(null);
            tabMenuItem2 = tabMenuItem;
            i = 2;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$1;
            i = this.I$0;
            tabMenuItem2 = (TabMenuItem) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2++;
            if (i2 < i) {
                Function1 function1 = new Function1() { // from class: org.betup.ui.tour.compose.TourScreenKt$TourScreen$10$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invokeSuspend$lambda$1$lambda$0;
                        invokeSuspend$lambda$1$lambda$0 = TourScreenKt$TourScreen$10$1.invokeSuspend$lambda$1$lambda$0(((Long) obj2).longValue());
                        return invokeSuspend$lambda$1$lambda$0;
                    }
                };
                this.L$0 = tabMenuItem2;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (MonotonicFrameClockKt.withFrameNanos(function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                if (i2 < i) {
                    Function1<TabMenuItem, Rect> getTabBounds = this.$tourManager.getGetTabBounds();
                    Rect invoke = getTabBounds != null ? getTabBounds.invoke(tabMenuItem2) : null;
                    this.$tourState.setBottomTabBounds(invoke);
                    Log.d("TourFlow", "TourScreen - Bottom tab " + tabMenuItem2 + " bounds: " + invoke);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }
}
