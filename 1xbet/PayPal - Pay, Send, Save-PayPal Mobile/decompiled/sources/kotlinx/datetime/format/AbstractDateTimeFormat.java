package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00028\u0002\"\f\b\u0002\u0010\u0013*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00028\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0006#$%&'("}, d2 = {"Lkotlinx/datetime/format/AbstractDateTimeFormat;", "T", "Lkotlinx/datetime/internal/format/parser/Copyable;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "Lkotlinx/datetime/format/DateTimeFormat;", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "intermediateFromValue", "(Ljava/lang/Object;)Lkotlinx/datetime/internal/format/parser/Copyable;", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/internal/format/parser/Copyable;)Ljava/lang/Object;", "valueFromIntermediateOrNull", "", "format", "(Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "A", "appendable", "formatTo", "(Ljava/lang/Appendable;Ljava/lang/Object;)Ljava/lang/Appendable;", "", "input", "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "parseOrNull", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "actualFormat", "getEmptyIntermediate", "()Lkotlinx/datetime/internal/format/parser/Copyable;", "emptyIntermediate", "Lkotlinx/datetime/format/DateTimeComponentsFormat;", "Lkotlinx/datetime/format/LocalDateFormat;", "Lkotlinx/datetime/format/LocalDateTimeFormat;", "Lkotlinx/datetime/format/LocalTimeFormat;", "Lkotlinx/datetime/format/UtcOffsetFormat;", "Lkotlinx/datetime/format/YearMonthFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AbstractDateTimeFormat<T, U extends kotlinx.datetime.internal.format.parser.Copyable<U>> implements kotlinx.datetime.format.DateTimeFormat<T> {
    public abstract kotlinx.datetime.internal.format.CachedFormatStructure<U> getActualFormat();

    public abstract U getEmptyIntermediate();

    public abstract U intermediateFromValue(T value);

    public abstract T valueFromIntermediate(U intermediate);

    private AbstractDateTimeFormat() {
    }

    public T valueFromIntermediateOrNull(U intermediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intermediate, "");
        try {
            return valueFromIntermediate(intermediate);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // kotlinx.datetime.format.DateTimeFormat
    public java.lang.String format(T value) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlinx.datetime.internal.format.formatter.FormatterStructure.format$default(getActualFormat().formatter(), intermediateFromValue(value), sb, false, 4, null);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @Override // kotlinx.datetime.format.DateTimeFormat
    public <A extends java.lang.Appendable> A formatTo(A appendable, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        kotlinx.datetime.internal.format.formatter.FormatterStructure.format$default(getActualFormat().formatter(), intermediateFromValue(value), appendable, false, 4, null);
        return appendable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.datetime.format.DateTimeFormat
    public T parse(java.lang.CharSequence input) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        try {
            try {
                return (T) valueFromIntermediate(kotlinx.datetime.internal.format.parser.Parser.m24188matchimpl$default(kotlinx.datetime.internal.format.parser.Parser.m24183constructorimpl(getActualFormat().parser()), input, getEmptyIntermediate(), 0, 4, null));
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("The value parsed from '");
                    sb.append((java.lang.Object) input);
                    sb.append("' is invalid");
                    obj = sb.toString();
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(message);
                    sb2.append(" (when parsing '");
                    sb2.append((java.lang.Object) input);
                    sb2.append("')");
                    obj = sb2.toString();
                }
                throw new kotlinx.datetime.DateTimeFormatException(obj, e);
            }
        } catch (kotlinx.datetime.internal.format.parser.ParseException e2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to parse value from '");
            sb3.append((java.lang.Object) input);
            sb3.append('\'');
            throw new kotlinx.datetime.DateTimeFormatException(sb3.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.datetime.format.DateTimeFormat
    public T parseOrNull(java.lang.CharSequence input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.datetime.internal.format.parser.Copyable m24190matchOrNullimpl$default = kotlinx.datetime.internal.format.parser.Parser.m24190matchOrNullimpl$default(kotlinx.datetime.internal.format.parser.Parser.m24183constructorimpl(getActualFormat().parser()), input, getEmptyIntermediate(), 0, 4, null);
        if (m24190matchOrNullimpl$default != null) {
            return (T) valueFromIntermediateOrNull(m24190matchOrNullimpl$default);
        }
        return null;
    }

    public /* synthetic */ AbstractDateTimeFormat(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
