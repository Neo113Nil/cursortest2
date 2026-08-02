package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class InconsistentKotlinMetadataException extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public /* synthetic */ InconsistentKotlinMetadataException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
