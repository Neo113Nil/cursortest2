package org.betup.ui.dialogs.offer.webview;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: OfferDocumentPrefetch.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.offer.webview.OfferDocumentPrefetch$fetch$2", f = "OfferDocumentPrefetch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class OfferDocumentPrefetch$fetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferDocumentPrefetch$fetch$2(String str, Context context, Continuation<? super OfferDocumentPrefetch$fetch$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$appContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfferDocumentPrefetch$fetch$2(this.$url, this.$appContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OfferDocumentPrefetch$fetch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OkHttpClient httpClient;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Request build = new Request.Builder().url(this.$url).header(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,*/*;q=0.8").build();
        httpClient = OfferDocumentPrefetch.INSTANCE.httpClient(this.$appContext);
        Response execute = httpClient.newCall(build).execute();
        try {
            Response response = execute;
            if (!response.isSuccessful()) {
                throw new IllegalStateException(("offer document HTTP " + response.code()).toString());
            }
            ResponseBody body = response.body();
            String string = body != null ? body.string() : null;
            if (string == null) {
                string = "";
            }
            CloseableKt.closeFinally(execute, null);
            return string;
        } finally {
        }
    }
}
