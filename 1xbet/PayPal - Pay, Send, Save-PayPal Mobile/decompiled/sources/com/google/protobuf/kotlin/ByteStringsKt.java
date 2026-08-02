package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/google/protobuf/ByteString;", "", "index", "", "get", "(Lcom/google/protobuf/ByteString;I)B", "", "isNotEmpty", "(Lcom/google/protobuf/ByteString;)Z", "other", "plus", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;", "Ljava/nio/ByteBuffer;", "toByteString", "(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ByteString;", "", "([B)Lcom/google/protobuf/ByteString;", "", "toByteStringUtf8", "(Ljava/lang/String;)Lcom/google/protobuf/ByteString;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ByteStringsKt {
    public static final com.google.protobuf.ByteString toByteStringUtf8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.protobuf.ByteString copyFromUtf8 = com.google.protobuf.ByteString.copyFromUtf8(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFromUtf8, "");
        return copyFromUtf8;
    }

    public static final com.google.protobuf.ByteString plus(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        com.google.protobuf.ByteString concat = byteString.concat(byteString2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concat, "");
        return concat;
    }

    public static final byte get(com.google.protobuf.ByteString byteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(com.google.protobuf.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return !byteString.isEmpty();
    }

    public static final com.google.protobuf.ByteString toByteString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.google.protobuf.ByteString copyFrom = com.google.protobuf.ByteString.copyFrom(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFrom, "");
        return copyFrom;
    }

    public static final com.google.protobuf.ByteString toByteString(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        com.google.protobuf.ByteString copyFrom = com.google.protobuf.ByteString.copyFrom(byteBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFrom, "");
        return copyFrom;
    }
}
