package io.ktor.util.converters;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/converters/DataConversionException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "message", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class DataConversionException extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataConversionException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public /* synthetic */ DataConversionException(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Invalid data format" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataConversionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
