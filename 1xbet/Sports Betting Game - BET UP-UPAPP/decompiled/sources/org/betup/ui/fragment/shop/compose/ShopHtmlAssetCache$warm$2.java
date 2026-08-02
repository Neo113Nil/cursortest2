package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.util.Log;
import com.tiktok.util.UrlConst;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShopHtmlAssetCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.shop.compose.ShopHtmlAssetCache$warm$2", f = "ShopHtmlAssetCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ShopHtmlAssetCache$warm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Collection<String> $urls;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopHtmlAssetCache$warm$2(Collection<String> collection, Context context, Continuation<? super ShopHtmlAssetCache$warm$2> continuation) {
        super(2, continuation);
        this.$urls = collection;
        this.$appContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShopHtmlAssetCache$warm$2 shopHtmlAssetCache$warm$2 = new ShopHtmlAssetCache$warm$2(this.$urls, this.$appContext, continuation);
        shopHtmlAssetCache$warm$2.L$0 = obj;
        return shopHtmlAssetCache$warm$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopHtmlAssetCache$warm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m10853constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Sequence<String> distinct = SequencesKt.distinct(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(this.$urls), new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlAssetCache$warm$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = ShopHtmlAssetCache$warm$2.invokeSuspend$lambda$0((String) obj2);
                return invokeSuspend$lambda$0;
            }
        }), new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlAssetCache$warm$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = ShopHtmlAssetCache$warm$2.invokeSuspend$lambda$1((String) obj2);
                return Boolean.valueOf(invokeSuspend$lambda$1);
            }
        }));
        Context context = this.$appContext;
        for (String str : distinct) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ShopHtmlAssetCache.INSTANCE.prefetch(context, str);
                m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
            if (m10856exceptionOrNullimpl != null) {
                Log.w("ShopHtmlAssetCache", "Prefetch failed for " + str, m10856exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0(String str) {
        return StringsKt.trim((CharSequence) str).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(String str) {
        return StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, UrlConst.HTTPS, false, 2, (Object) null);
    }
}
