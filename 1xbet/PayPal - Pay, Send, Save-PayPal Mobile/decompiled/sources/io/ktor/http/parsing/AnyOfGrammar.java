package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/http/parsing/AnyOfGrammar;", "Lio/ktor/http/parsing/Grammar;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnyOfGrammar extends io.ktor.http.parsing.Grammar {
    private final java.lang.String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyOfGrammar(java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
