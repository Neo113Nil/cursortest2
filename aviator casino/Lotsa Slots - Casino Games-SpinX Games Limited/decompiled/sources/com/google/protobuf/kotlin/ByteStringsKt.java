package com.google.protobuf.kotlin;

/* compiled from: ByteStrings.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\n\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\r¨\u0006\u000e"}, d2 = {"get", "", "Lcom/google/protobuf/ByteString;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "isNotEmpty", "", "plus", "other", "toByteString", "Ljava/nio/ByteBuffer;", "", "toByteStringUtf8", "", "java_kotlin-bytestring_lib"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteStringsKt {
    public static final com.google.protobuf.ByteString toByteStringUtf8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.google.protobuf.ByteString copyFromUtf8 = com.google.protobuf.ByteString.copyFromUtf8(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    public static final com.google.protobuf.ByteString plus(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        com.google.protobuf.ByteString concat = byteString.concat(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concat, "concat(other)");
        return concat;
    }

    public static final byte get(com.google.protobuf.ByteString byteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(com.google.protobuf.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final com.google.protobuf.ByteString toByteString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        com.google.protobuf.ByteString copyFrom = com.google.protobuf.ByteString.copyFrom(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    public static final com.google.protobuf.ByteString toByteString(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        com.google.protobuf.ByteString copyFrom = com.google.protobuf.ByteString.copyFrom(byteBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}
