package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/http/ParametersBuilderImpl;", "Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/http/ParametersBuilder;", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "Lio/ktor/http/Parameters;", "build", "()Lio/ktor/http/Parameters;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParametersBuilderImpl extends io.ktor.util.StringValuesBuilderImpl implements io.ktor.http.ParametersBuilder {
    public /* synthetic */ ParametersBuilderImpl(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    public ParametersBuilderImpl(int i) {
        super(true, i);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public final io.ktor.http.Parameters build() {
        return new io.ktor.http.ParametersImpl(getValues());
    }

    public ParametersBuilderImpl() {
        this(0, 1, null);
    }
}
