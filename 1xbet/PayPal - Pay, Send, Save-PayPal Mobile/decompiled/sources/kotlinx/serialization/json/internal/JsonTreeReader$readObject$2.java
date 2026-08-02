package kotlinx.serialization.json.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {22}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv", "$i$f$readObjectImpl", "lastToken$iv", "$i$a$-readObjectImpl-JsonTreeReader$readObject$3"}, nl = {127}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "B$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class JsonTreeReader$readObject$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    byte getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ kotlinx.serialization.json.internal.JsonTreeReader getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return kotlinx.serialization.json.internal.JsonTreeReader.access$readObject(this.getInputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readObject$2(kotlinx.serialization.json.internal.JsonTreeReader jsonTreeReader, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.internal.JsonTreeReader$readObject$2> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = jsonTreeReader;
    }
}
