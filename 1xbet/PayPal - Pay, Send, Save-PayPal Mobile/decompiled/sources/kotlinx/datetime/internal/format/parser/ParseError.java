package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseError;", "", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lkotlin/Function0;", "", "message", "<init>", "(ILkotlin/jvm/functions/Function0;)V", com.visa.cbp.getEncExpo.warmup, "getPosition", "()I", "Lkotlin/jvm/functions/Function0;", "getMessage", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParseError {
    private final kotlin.jvm.functions.Function0<java.lang.String> message;
    private final int position;

    public ParseError(int i, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.position = i;
        this.message = function0;
    }

    public final kotlin.jvm.functions.Function0<java.lang.String> getMessage() {
        return this.message;
    }

    public final int getPosition() {
        return this.position;
    }
}
