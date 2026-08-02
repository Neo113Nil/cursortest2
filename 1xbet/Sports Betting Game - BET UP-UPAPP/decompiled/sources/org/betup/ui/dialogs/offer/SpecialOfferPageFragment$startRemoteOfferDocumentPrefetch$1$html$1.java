package org.betup.ui.dialogs.offer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.dialogs.offer.webview.OfferDocumentPrefetch;

/* compiled from: SpecialOfferPageFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.offer.SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1", f = "SpecialOfferPageFragment.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $appCtx;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1(Context context, String str, Continuation<? super SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1> continuation) {
        super(2, continuation);
        this.$appCtx = context;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1 specialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1 = new SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1(this.$appCtx, this.$url, continuation);
        specialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1.L$0 = obj;
        return specialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((SpecialOfferPageFragment$startRemoteOfferDocumentPrefetch$1$html$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10853constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.$appCtx;
                String str = this.$url;
                Result.Companion companion = Result.INSTANCE;
                OfferDocumentPrefetch offerDocumentPrefetch = OfferDocumentPrefetch.INSTANCE;
                Intrinsics.checkNotNull(context);
                this.label = 1;
                obj = offerDocumentPrefetch.fetch(context, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m10853constructorimpl = Result.m10853constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            return null;
        }
        return m10853constructorimpl;
    }
}
