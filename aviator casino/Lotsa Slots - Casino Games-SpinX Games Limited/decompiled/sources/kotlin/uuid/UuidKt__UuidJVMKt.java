package kotlin.uuid;

/* compiled from: UuidJVM.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a,\u0010\n\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0001\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0014H\u0001\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0001H\u0087\b\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0007\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\r\u0010\u001d\u001a\u00020\u0006*\u00020\u0006H\u0080\b¨\u0006\u001e"}, d2 = {"secureRandomUuid", "Lkotlin/uuid/Uuid;", "serializedUuid", "", "uuid", "getLongAt", "", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "formatBytesInto", "", "dst", "dstOffset", "startIndex", "endIndex", "setLongAt", "value", "uuidParseHexDash", "hexDashString", "", "uuidParseHex", "hexString", "toKotlinUuid", "Ljava/util/UUID;", "toJavaUuid", "getUuid", "Ljava/nio/ByteBuffer;", "putUuid", "reverseBytes", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
/* loaded from: classes6.dex */
class UuidKt__UuidJVMKt {
    public static final kotlin.uuid.Uuid secureRandomUuid() {
        byte[] bArr = new byte[16];
        kotlin.uuid.SecureRandomHolder.INSTANCE.getInstance().nextBytes(bArr);
        return kotlin.uuid.UuidKt.uuidFromRandomBytes(bArr);
    }

    public static final java.lang.Object serializedUuid(kotlin.uuid.Uuid uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new kotlin.uuid.UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final long getLongAt(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        return kotlin.uuid.UuidKt.getLongAtCommonImpl(bArr, i);
    }

    public static final void formatBytesInto(long j, byte[] dst, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        kotlin.uuid.UuidKt.formatBytesIntoCommonImpl(j, dst, i, i2, i3);
    }

    public static final void setLongAt(byte[] bArr, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.uuid.UuidKt.setLongAtCommonImpl(bArr, i, j);
    }

    public static final kotlin.uuid.Uuid uuidParseHexDash(java.lang.String hexDashString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return kotlin.uuid.UuidKt.uuidParseHexDashCommonImpl(hexDashString);
    }

    public static final kotlin.uuid.Uuid uuidParseHex(java.lang.String hexString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexString, "hexString");
        return kotlin.uuid.UuidKt.uuidParseHexCommonImpl(hexString);
    }

    public static final kotlin.uuid.Uuid toKotlinUuid(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "<this>");
        return kotlin.uuid.Uuid.INSTANCE.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final java.util.UUID toJavaUuid(kotlin.uuid.Uuid uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "<this>");
        return new java.util.UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static final kotlin.uuid.Uuid getUuid(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new java.nio.BufferUnderflowException();
        }
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        if (kotlin.jvm.internal.Intrinsics.areEqual(byteBuffer.order(), java.nio.ByteOrder.LITTLE_ENDIAN)) {
            j = java.lang.Long.reverseBytes(j);
            j2 = java.lang.Long.reverseBytes(j2);
        }
        return kotlin.uuid.Uuid.INSTANCE.fromLongs(j, j2);
    }

    public static final kotlin.uuid.Uuid getUuid(java.nio.ByteBuffer byteBuffer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Negative index: " + i);
        }
        if (i + 15 >= byteBuffer.limit()) {
            throw new java.lang.IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        long j = byteBuffer.getLong(i);
        long j2 = byteBuffer.getLong(i + 8);
        if (kotlin.jvm.internal.Intrinsics.areEqual(byteBuffer.order(), java.nio.ByteOrder.LITTLE_ENDIAN)) {
            j = java.lang.Long.reverseBytes(j);
            j2 = java.lang.Long.reverseBytes(j2);
        }
        return kotlin.uuid.Uuid.INSTANCE.fromLongs(j, j2);
    }

    public static final java.nio.ByteBuffer putUuid(java.nio.ByteBuffer byteBuffer, kotlin.uuid.Uuid uuid) {
        java.nio.ByteBuffer putLong;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new java.nio.BufferOverflowException();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(byteBuffer.order(), java.nio.ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            putLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(java.lang.Long.reverseBytes(mostSignificantBits));
            putLong = byteBuffer.putLong(java.lang.Long.reverseBytes(leastSignificantBits));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
        return putLong;
    }

    public static final java.nio.ByteBuffer putUuid(java.nio.ByteBuffer byteBuffer, int i, kotlin.uuid.Uuid uuid) {
        java.nio.ByteBuffer putLong;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Negative index: " + i);
        }
        if (i + 15 >= byteBuffer.limit()) {
            throw new java.lang.IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i + ", with limit: " + byteBuffer.limit() + ' ');
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(byteBuffer.order(), java.nio.ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(i, mostSignificantBits);
            putLong = byteBuffer.putLong(i + 8, leastSignificantBits);
        } else {
            byteBuffer.putLong(i, java.lang.Long.reverseBytes(mostSignificantBits));
            putLong = byteBuffer.putLong(i + 8, java.lang.Long.reverseBytes(leastSignificantBits));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
        return putLong;
    }

    public static final long reverseBytes(long j) {
        return java.lang.Long.reverseBytes(j);
    }
}
