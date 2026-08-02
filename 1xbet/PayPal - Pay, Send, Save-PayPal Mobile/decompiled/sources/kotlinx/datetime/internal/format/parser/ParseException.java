package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lkotlinx/datetime/internal/format/parser/ParseError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParseException extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(java.util.List<kotlinx.datetime.internal.format.parser.ParseError> list) {
        super(kotlinx.datetime.internal.format.parser.ParserKt.access$formatError(list));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}
