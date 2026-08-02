package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lokio/BufferedSource;", "Lokio/TypedOptions;", "options", "commonSelect", "(Lokio/BufferedSource;Lokio/TypedOptions;)Ljava/lang/Object;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-BufferedSource, reason: invalid class name */
/* loaded from: classes17.dex */
public final class BufferedSource {
    public static final <T> T commonSelect(okio.BufferedSource bufferedSource, okio.TypedOptions<T> typedOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedOptions, "");
        int select = bufferedSource.select(typedOptions.getOptions());
        if (select == -1) {
            return null;
        }
        return typedOptions.get(select);
    }
}
