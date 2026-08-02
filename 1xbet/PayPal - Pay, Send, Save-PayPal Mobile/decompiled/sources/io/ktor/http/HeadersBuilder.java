package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\r"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/util/StringValuesBuilderImpl;", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "Lio/ktor/http/Headers;", "build", "()Lio/ktor/http/Headers;", "", "name", "", "validateName", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "validateValue"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HeadersBuilder extends io.ktor.util.StringValuesBuilderImpl {
    public HeadersBuilder(int i) {
        super(true, i);
    }

    public /* synthetic */ HeadersBuilder(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public final io.ktor.http.Headers build() {
        return new io.ktor.http.HeadersImpl(getValues());
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void validateName(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        super.validateName(name2);
        io.ktor.http.HttpHeaders.INSTANCE.checkHeaderName(name2);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void validateValue(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        super.validateValue(value);
        io.ktor.http.HttpHeaders.INSTANCE.checkHeaderValue(value);
    }

    public HeadersBuilder() {
        this(0, 1, null);
    }
}
