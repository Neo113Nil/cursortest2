package io.ktor.util.collections;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lio/ktor/util/collections/SerializedMapValue;", "T", "", "", "key", "Lkotlin/Function1;", "serialize", "deserialize", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/String;", "getKey$ktor_utils", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getSerialize$ktor_utils", "()Lkotlin/jvm/functions/Function1;", "getDeserialize$ktor_utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerializedMapValue<T> {
    private final kotlin.jvm.functions.Function1<java.lang.String, T> deserialize;
    private final java.lang.String key;
    private final kotlin.jvm.functions.Function1<T, java.lang.String> serialize;

    /* JADX WARN: Multi-variable type inference failed */
    public SerializedMapValue(java.lang.String str, kotlin.jvm.functions.Function1<? super T, java.lang.String> function1, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.key = str;
        this.serialize = function1;
        this.deserialize = function12;
    }

    /* renamed from: getKey$ktor_utils, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.String> getSerialize$ktor_utils() {
        return this.serialize;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, T> getDeserialize$ktor_utils() {
        return this.deserialize;
    }
}
