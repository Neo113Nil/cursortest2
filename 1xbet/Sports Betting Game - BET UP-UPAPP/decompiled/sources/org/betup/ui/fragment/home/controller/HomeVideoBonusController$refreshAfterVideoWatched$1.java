package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;

/* compiled from: HomeVideoBonusController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.controller.HomeVideoBonusController$refreshAfterVideoWatched$1", f = "HomeVideoBonusController.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeVideoBonusController$refreshAfterVideoWatched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ HomeVideoBonusController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeVideoBonusController$refreshAfterVideoWatched$1(HomeVideoBonusController homeVideoBonusController, Continuation<? super HomeVideoBonusController$refreshAfterVideoWatched$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVideoBonusController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVideoBonusController$refreshAfterVideoWatched$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeVideoBonusController$refreshAfterVideoWatched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0031 -> B:5:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long[] jArr;
        int length;
        int i;
        long[] jArr2;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            jArr = HomeVideoBonusController.POST_VIDEO_REFRESH_DELAYS_MS;
            length = jArr.length;
            i = 0;
            jArr2 = jArr;
            if (i >= length) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i = this.I$0;
            jArr2 = (long[]) this.L$0;
            ResultKt.throwOnFailure(obj);
            z = this.this$0.clientRegistered;
            if (z) {
                return Unit.INSTANCE;
            }
            this.this$0.performVideoBonusNetworkRefresh(HomeVideoBonusController.VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
            i++;
            if (i >= length) {
                long j = jArr2[i];
                if (j > 0) {
                    this.L$0 = jArr2;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 1;
                    if (DelayKt.delay(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                z = this.this$0.clientRegistered;
                if (z) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
