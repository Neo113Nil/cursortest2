package kotlinx.io.bytestring;

/* compiled from: ByteStringBuilder.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\t\u001a\u00020\n\"\u00020\u000b\u001a/\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"append", "", "Lkotlinx/io/bytestring/ByteStringBuilder;", "byte", "Lkotlin/UByte;", "append-EK-6454", "(Lkotlinx/io/bytestring/ByteStringBuilder;B)V", "byteString", "Lkotlinx/io/bytestring/ByteString;", "bytes", "", "", "buildByteString", "capacity", "", "builderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-io-bytestring"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteStringBuilderKt {
    /* renamed from: append-EK-6454, reason: not valid java name */
    public static final void m12395appendEK6454(kotlinx.io.bytestring.ByteStringBuilder append, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(append, "$this$append");
        append.append(b);
    }

    public static final void append(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        kotlinx.io.bytestring.ByteStringBuilder.append$default(byteStringBuilder, byteString.getData(), 0, 0, 6, null);
    }

    public static final void append(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, byte... bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlinx.io.bytestring.ByteStringBuilder.append$default(byteStringBuilder, bytes, 0, 0, 6, null);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString buildByteString$default(int i, kotlin.jvm.functions.Function1 builderAction, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder = new kotlinx.io.bytestring.ByteStringBuilder(i);
        builderAction.invoke(byteStringBuilder);
        return byteStringBuilder.toByteString();
    }

    public static final kotlinx.io.bytestring.ByteString buildByteString(int i, kotlin.jvm.functions.Function1<? super kotlinx.io.bytestring.ByteStringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder = new kotlinx.io.bytestring.ByteStringBuilder(i);
        builderAction.invoke(byteStringBuilder);
        return byteStringBuilder.toByteString();
    }
}
