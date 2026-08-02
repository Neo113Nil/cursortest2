package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018JA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0014\u0092\u0001\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseResult;", "", "T", "Lkotlin/Function1;", "", "onSuccess", "Lkotlinx/datetime/internal/format/parser/ParseError;", "onFailure", "match-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "match", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes17.dex */
public final class ParseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.internal.format.parser.ParseResult.Companion INSTANCE = new kotlinx.datetime.internal.format.parser.ParseResult.Companion(null);
    private final java.lang.Object value;

    /* renamed from: access$constructor-impl, reason: not valid java name */
    public static final /* synthetic */ java.lang.Object m24172access$constructorimpl(java.lang.Object obj) {
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ParseResult$Companion;", "", "<init>", "()V", "", "indexOfNextUnparsed", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "Ok-Qi1bsqg", "(I)Ljava/lang/Object;", "Ok", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lkotlin/Function0;", "", "message", "Error-Rg3Co2E", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Error"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: Ok-Qi1bsqg, reason: not valid java name */
        public final java.lang.Object m24181OkQi1bsqg(int indexOfNextUnparsed) {
            return kotlinx.datetime.internal.format.parser.ParseResult.m24172access$constructorimpl(java.lang.Integer.valueOf(indexOfNextUnparsed));
        }

        /* renamed from: Error-Rg3Co2E, reason: not valid java name */
        public final java.lang.Object m24180ErrorRg3Co2E(int position, kotlin.jvm.functions.Function0<java.lang.String> message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return kotlinx.datetime.internal.format.parser.ParseResult.m24172access$constructorimpl(new kotlinx.datetime.internal.format.parser.ParseError(position, message));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ParseResult(java.lang.Object obj) {
        this.value = obj;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    /* renamed from: match-impl, reason: not valid java name */
    public static final <T> T m24177matchimpl(java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1, kotlin.jvm.functions.Function1<? super kotlinx.datetime.internal.format.parser.ParseError, ? extends T> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        if (obj instanceof java.lang.Integer) {
            return function1.invoke(obj);
        }
        if (obj instanceof kotlinx.datetime.internal.format.parser.ParseError) {
            return function12.invoke(obj);
        }
        throw new java.lang.IllegalStateException("Unexpected parse result: ".concat(java.lang.String.valueOf(obj)).toString());
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.Object m24179unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m24178toStringimpl(this.value);
    }

    public final int hashCode() {
        return m24176hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m24174equalsimpl(this.value, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m24178toStringimpl(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParseResult(value=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24176hashCodeimpl(java.lang.Object obj) {
        return obj.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24175equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24174equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.datetime.internal.format.parser.ParseResult) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.datetime.internal.format.parser.ParseResult) obj2).m24179unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.datetime.internal.format.parser.ParseResult m24173boximpl(java.lang.Object obj) {
        return new kotlinx.datetime.internal.format.parser.ParseResult(obj);
    }
}
