package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes5.dex */
public final class JvmExceptionUtilsKt {
    public static final java.lang.String[] requireNotEmpty(kotlin.Metadata metadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        java.lang.String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 != null) {
            return d1;
        }
        throw new kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }
}
