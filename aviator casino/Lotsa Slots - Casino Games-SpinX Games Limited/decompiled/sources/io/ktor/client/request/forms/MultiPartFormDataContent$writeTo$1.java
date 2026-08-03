package io.ktor.client.request.forms;

/* compiled from: FormDataContent.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5, 6}, l = {124, 125, 126, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 135, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 142, 146, 146, 146}, m = "writeTo", n = {"channel", "part", "channel", "part", "channel", "part", "channel", "channel", "channel", "channel"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class MultiPartFormDataContent$writeTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.request.forms.MultiPartFormDataContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiPartFormDataContent$writeTo$1(io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent, kotlin.coroutines.Continuation<? super io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1> continuation) {
        super(continuation);
        this.this$0 = multiPartFormDataContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeTo(null, this);
    }
}
