package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lio/ktor/http/parsing/RangeGrammar;", "Lio/ktor/http/parsing/Grammar;", "", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "<init>", "(CC)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getFrom", "()C", "getTo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RangeGrammar extends io.ktor.http.parsing.Grammar {
    private final char from;
    private final char to;

    public RangeGrammar(char c, char c2) {
        super(null);
        this.from = c;
        this.to = c2;
    }

    public final char getFrom() {
        return this.from;
    }

    public final char getTo() {
        return this.to;
    }
}
