package com.benasher44.uuid;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u001a\u0014\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0010\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0015\u0010\t\u001a\u00020\b*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\f*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\f*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015*\n\u0010\u0019\"\u00020\u00002\u00020\u0000"}, d2 = {"Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "uuid4", "()Ljava/util/UUID;", "", "string", "uuidFrom", "(Ljava/lang/String;)Ljava/util/UUID;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "uuidOf", "([B)Ljava/util/UUID;", "", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;II)J", "getBytes", "(Ljava/util/UUID;)[B", "getVariant", "(Ljava/util/UUID;)I", "variant", "getVersion", "version", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UuidKt {
    public static /* synthetic */ void Uuid$annotations() {
    }

    public static final java.util.UUID uuidOf(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 16) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid UUID bytes. Expected 16 bytes; found ");
            sb.append(bArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        return new java.util.UUID(wrap.getLong(), wrap.getLong());
    }

    public static final java.util.UUID uuidFrom(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 36) {
            return new java.util.UUID(getHighSpeedVideoFpsRanges(str, 0, 19), getHighSpeedVideoFpsRanges(str, 19, 36));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid UUID string, expected exactly 36 characters but got ");
        sb.append(str.length());
        sb.append(": ");
        sb.append(str);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static final long getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2) {
        long j;
        long j2 = 0;
        do {
            if (str.charAt(i) != '-') {
                j2 *= 16;
                char charAt = str.charAt(i);
                if (charAt != '0') {
                    if (charAt == '1') {
                        j = 1;
                    } else if (charAt == '2') {
                        j = 2;
                    } else if (charAt == '3') {
                        j = 3;
                    } else if (charAt == '4') {
                        j = 4;
                    } else if (charAt == '5') {
                        j = 5;
                    } else if (charAt == '6') {
                        j = 6;
                    } else if (charAt == '7') {
                        j = 7;
                    } else if (charAt == '8') {
                        j = 8;
                    } else if (charAt == '9') {
                        j = 9;
                    } else if (charAt == 'a' || charAt == 'A') {
                        j = 10;
                    } else if (charAt == 'b' || charAt == 'B') {
                        j = 11;
                    } else if (charAt == 'c' || charAt == 'C') {
                        j = 12;
                    } else if (charAt == 'd' || charAt == 'D') {
                        j = 13;
                    } else if (charAt == 'e' || charAt == 'E') {
                        j = 14;
                    } else {
                        if (charAt != 'f' && charAt != 'F') {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid UUID string, encountered non-hexadecimal digit `");
                            sb.append(str.charAt(i));
                            sb.append("` at index ");
                            sb.append(i);
                            sb.append(" in: ");
                            sb.append(str);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        j = 15;
                    }
                    j2 += j;
                }
            } else if (i != 8 && i != 13 && i != 18 && i != 23) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid UUID string, encountered dash at index ");
                sb2.append(i);
                sb2.append(" but it can occur only at 8, 13, 18, or 23: ");
                sb2.append(str);
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
            i++;
        } while (i < i2);
        return j2;
    }

    public static final java.util.UUID uuid4() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        return randomUUID;
    }

    public static final byte[] getBytes(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        byte[] array = java.nio.ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }

    public static final int getVersion(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        return uuid.version();
    }

    public static final int getVariant(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        return uuid.variant();
    }
}
