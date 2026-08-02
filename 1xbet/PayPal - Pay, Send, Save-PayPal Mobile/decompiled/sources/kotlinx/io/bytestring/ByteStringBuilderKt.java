package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0006\u0010\t\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\n\u0010\f\u001a\u00020\n\"\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r\u001a6\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/io/bytestring/ByteStringBuilder;", "Lkotlin/UByte;", "byte", "", "append-EK-6454", "(Lkotlinx/io/bytestring/ByteStringBuilder;B)V", "append", "Lkotlinx/io/bytestring/ByteString;", "byteString", "(Lkotlinx/io/bytestring/ByteStringBuilder;Lkotlinx/io/bytestring/ByteString;)V", "", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "(Lkotlinx/io/bytestring/ByteStringBuilder;[B)V", "", "capacity", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildByteString", "(ILkotlin/jvm/functions/Function1;)Lkotlinx/io/bytestring/ByteString;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteStringBuilderKt {
    /* renamed from: append-EK-6454, reason: not valid java name */
    public static final void m24209appendEK6454(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringBuilder, "");
        byteStringBuilder.append(b);
    }

    public static final void append(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlinx.io.bytestring.ByteStringBuilder.append$default(byteStringBuilder, byteString.getGetHighSpeedVideoFpsRanges(), 0, 0, 6, null);
    }

    public static final void append(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStringBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlinx.io.bytestring.ByteStringBuilder.append$default(byteStringBuilder, bArr, 0, 0, 6, null);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString buildByteString$default(int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder = new kotlinx.io.bytestring.ByteStringBuilder(i);
        function1.invoke(byteStringBuilder);
        return byteStringBuilder.toByteString();
    }

    public static final kotlinx.io.bytestring.ByteString buildByteString(int i, kotlin.jvm.functions.Function1<? super kotlinx.io.bytestring.ByteStringBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder = new kotlinx.io.bytestring.ByteStringBuilder(i);
        function1.invoke(byteStringBuilder);
        return byteStringBuilder.toByteString();
    }
}
