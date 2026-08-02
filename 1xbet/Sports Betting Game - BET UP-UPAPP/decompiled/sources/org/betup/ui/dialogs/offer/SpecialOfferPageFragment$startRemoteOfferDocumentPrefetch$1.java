package org.betup.ui.dialogs.offer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SpecialOfferPageFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.offer.SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1", f = "SpecialOfferPageFragment.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appCtx;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ SpecialOfferPageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1(SpecialOfferPageFragment specialOfferPageFragment, Context context, String str, Continuation<? super SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1> continuation) {
        super(2, continuation);
        this.this$0 = specialOfferPageFragment;
        this.$appCtx = context;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1(this.this$0, this.$appCtx, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = TimeoutKt.withTimeoutOrNull(2200L, new SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1(this.$appCtx, this.$url, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str2 = (String) obj;
        mutableStateFlow = this.this$0.remoteOfferPrefetchedHtmlState;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            str = str2;
        }
        mutableStateFlow.setValue(str);
        mutableStateFlow2 = this.this$0.remoteOfferHtmlReadyState;
        mutableStateFlow2.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
