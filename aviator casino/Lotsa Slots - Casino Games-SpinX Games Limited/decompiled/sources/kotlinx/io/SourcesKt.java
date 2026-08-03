package kotlinx.io;

/* compiled from: Sources.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0006*\u00020\u0002\u001a&\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u0014\u0010\u0013\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0002\u001a&\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u001a\u000f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002¢\u0006\u0002\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u001c*\u00020\u0002¢\u0006\u0002\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u001f*\u00020\u0002¢\u0006\u0002\u0010 \u001a\u000f\u0010!\u001a\u00020\"*\u00020\u0002¢\u0006\u0002\u0010#\u001a\u000f\u0010$\u001a\u00020\u001c*\u00020\u0002¢\u0006\u0002\u0010\u001d\u001a\u000f\u0010%\u001a\u00020\u001f*\u00020\u0002¢\u0006\u0002\u0010 \u001a\u000f\u0010&\u001a\u00020\"*\u00020\u0002¢\u0006\u0002\u0010#\u001a\n\u0010'\u001a\u00020(*\u00020\u0002\u001a\n\u0010)\u001a\u00020**\u00020\u0002\u001a\n\u0010+\u001a\u00020(*\u00020\u0002\u001a\n\u0010,\u001a\u00020**\u00020\u0002\u001a\u0012\u0010-\u001a\u00020.*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"readShortLe", "", "Lkotlinx/io/Source;", "readIntLe", "", "readLongLe", "", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "readDecimalLong", "readHexadecimalUnsignedLong", "indexOf", "byte", "", "startIndex", "endIndex", "readByteArray", "", "byteCount", "readByteArrayImpl", "size", "readTo", "", "sink", "readUByte", "Lkotlin/UByte;", "(Lkotlinx/io/Source;)B", "readUShort", "Lkotlin/UShort;", "(Lkotlinx/io/Source;)S", "readUInt", "Lkotlin/UInt;", "(Lkotlinx/io/Source;)I", "readULong", "Lkotlin/ULong;", "(Lkotlinx/io/Source;)J", "readUShortLe", "readUIntLe", "readULongLe", "readFloat", "", "readDouble", "", "readFloatLe", "readDoubleLe", "startsWith", "", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourcesKt {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;

    public static final short readShortLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlinx.io._UtilsJvmKt.reverseBytes(source.readShort());
    }

    public static final int readIntLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlinx.io._UtilsJvmKt.reverseBytes(source.readInt());
    }

    public static final long readLongLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlinx.io._UtilsJvmKt.reverseBytes(source.readLong());
    }

    public static final long readDecimalLong(kotlinx.io.Source source) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        long j4 = 1;
        source.require(1L);
        byte b = source.getBufferField().get(0L);
        byte b2 = 58;
        byte b3 = 48;
        if (b == 45) {
            source.require(2L);
            byte b4 = source.getBufferField().get(1L);
            if (48 > b4 || b4 >= 58) {
                throw new java.lang.NumberFormatException("Expected a digit but was 0x" + kotlinx.io._UtilKt.toHexString(source.getBufferField().get(1L)));
            }
            j2 = -8;
            z = true;
            j = 0;
        } else {
            if (48 > b || b >= 58) {
                throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x" + kotlinx.io._UtilKt.toHexString(b));
            }
            j = 48 - b;
            j2 = -7;
            z = false;
        }
        long j5 = 1;
        while (source.request(j5 + j4)) {
            kotlinx.io.Buffer bufferField = source.getBufferField();
            if (bufferField.getHead() == null) {
                kotlinx.io.Segment segment = null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(null);
                segment.getSize();
                throw null;
            }
            if (bufferField.getSizeMut() - j5 < j5) {
                kotlinx.io.Segment tail = bufferField.getTail();
                long sizeMut = bufferField.getSizeMut();
                while (tail != null && sizeMut > j5) {
                    j3 = j;
                    sizeMut -= tail.getLimit() - tail.getPos();
                    if (sizeMut <= j5) {
                        break;
                    }
                    tail = tail.getPrev();
                    j = j3;
                }
                j3 = j;
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                int i = (int) (j5 - sizeMut);
                int size = tail.getSize();
                j = j3;
                while (i < size) {
                    byte unchecked$kotlinx_io_core = tail.getUnchecked$kotlinx_io_core(i);
                    if (b3 > unchecked$kotlinx_io_core || unchecked$kotlinx_io_core >= b2) {
                        z2 = true;
                        break;
                    }
                    int i2 = 48 - unchecked$kotlinx_io_core;
                    if (j >= -922337203685477580L) {
                        int i3 = size;
                        if (j != -922337203685477580L || i2 >= j2) {
                            j = (j * 10) + i2;
                            i++;
                            j5 += j4;
                            size = i3;
                            b2 = 58;
                            b3 = 48;
                        }
                    }
                    kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
                    kotlinx.io.SinksKt.writeDecimalLong(buffer, j);
                    buffer.writeByte(unchecked$kotlinx_io_core);
                    if (!z) {
                        buffer.readByte();
                    }
                    throw new java.lang.NumberFormatException("Number too large: " + kotlinx.io.Utf8Kt.readString(buffer));
                }
                z2 = false;
            } else {
                long j6 = j;
                kotlinx.io.Segment head = bufferField.getHead();
                long j7 = 0;
                while (head != null) {
                    long limit = (head.getLimit() - head.getPos()) + j7;
                    if (limit > j5) {
                        break;
                    }
                    head = head.getNext();
                    j7 = limit;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                int i4 = (int) (j5 - j7);
                int size2 = head.getSize();
                j = j6;
                while (i4 < size2) {
                    byte unchecked$kotlinx_io_core2 = head.getUnchecked$kotlinx_io_core(i4);
                    if (48 > unchecked$kotlinx_io_core2 || unchecked$kotlinx_io_core2 >= 58) {
                        z2 = true;
                        break;
                    }
                    int i5 = 48 - unchecked$kotlinx_io_core2;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i5 < j2)) {
                        kotlinx.io.Buffer buffer2 = new kotlinx.io.Buffer();
                        kotlinx.io.SinksKt.writeDecimalLong(buffer2, j);
                        buffer2.writeByte(unchecked$kotlinx_io_core2);
                        if (!z) {
                            buffer2.readByte();
                        }
                        throw new java.lang.NumberFormatException("Number too large: " + kotlinx.io.Utf8Kt.readString(buffer2));
                    }
                    j = (j * 10) + i5;
                    i4++;
                    j4 = 1;
                    j5++;
                }
                z2 = false;
            }
            if (z2) {
                break;
            }
            b2 = 58;
            b3 = 48;
        }
        source.skip(j5);
        return z ? j : -j;
    }

    public static final long readHexadecimalUnsignedLong(kotlinx.io.Source source) {
        int i;
        long j;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        long j2 = 1;
        source.require(1L);
        byte b = source.getBufferField().get(0L);
        byte b2 = 71;
        if (48 <= b && b < 58) {
            i = b - 48;
        } else if (97 <= b && b < 103) {
            i = b - 87;
        } else {
            if (65 > b || b >= 71) {
                throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + kotlinx.io._UtilKt.toHexString(b));
            }
            i = b - 55;
        }
        long j3 = i;
        long j4 = 1;
        while (source.request(j4 + j2)) {
            kotlinx.io.Buffer bufferField = source.getBufferField();
            if (bufferField.getHead() == null) {
                kotlinx.io.Segment segment = null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(null);
                segment.getSize();
                throw null;
            }
            boolean z = false;
            if (bufferField.getSizeMut() - j4 < j4) {
                kotlinx.io.Segment tail = bufferField.getTail();
                long sizeMut = bufferField.getSizeMut();
                while (tail != null && sizeMut > j4) {
                    sizeMut -= tail.getLimit() - tail.getPos();
                    if (sizeMut <= j4) {
                        break;
                    }
                    tail = tail.getPrev();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                int i4 = (int) (j4 - sizeMut);
                int size = tail.getSize();
                while (i4 < size) {
                    byte unchecked$kotlinx_io_core = tail.getUnchecked$kotlinx_io_core(i4);
                    if (48 <= unchecked$kotlinx_io_core && unchecked$kotlinx_io_core < 58) {
                        i3 = unchecked$kotlinx_io_core - 48;
                    } else if (97 <= unchecked$kotlinx_io_core && unchecked$kotlinx_io_core < 103) {
                        i3 = unchecked$kotlinx_io_core - 87;
                    } else {
                        if (65 > unchecked$kotlinx_io_core || unchecked$kotlinx_io_core >= b2) {
                            z = true;
                            break;
                        }
                        i3 = unchecked$kotlinx_io_core - 55;
                    }
                    int i5 = i3;
                    if ((j3 & (-1152921504606846976L)) != 0) {
                        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
                        kotlinx.io.SinksKt.writeHexadecimalUnsignedLong(buffer, j3);
                        buffer.writeByte(unchecked$kotlinx_io_core);
                        throw new java.lang.NumberFormatException("Number too large: " + kotlinx.io.Utf8Kt.readString(buffer));
                    }
                    j3 = (j3 << 4) + i5;
                    j4++;
                    i4++;
                    b2 = 71;
                }
            } else {
                kotlinx.io.Segment head = bufferField.getHead();
                long j5 = 0;
                while (head != null) {
                    long limit = (head.getLimit() - head.getPos()) + j5;
                    if (limit > j4) {
                        break;
                    }
                    head = head.getNext();
                    j5 = limit;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(head);
                int size2 = head.getSize();
                for (int i6 = (int) (j4 - j5); i6 < size2; i6++) {
                    byte unchecked$kotlinx_io_core2 = head.getUnchecked$kotlinx_io_core(i6);
                    if (48 <= unchecked$kotlinx_io_core2 && unchecked$kotlinx_io_core2 < 58) {
                        i2 = unchecked$kotlinx_io_core2 - 48;
                    } else if (97 <= unchecked$kotlinx_io_core2 && unchecked$kotlinx_io_core2 < 103) {
                        i2 = unchecked$kotlinx_io_core2 - 87;
                    } else {
                        if (65 > unchecked$kotlinx_io_core2 || unchecked$kotlinx_io_core2 >= 71) {
                            j = 1;
                            z = true;
                            break;
                        }
                        i2 = unchecked$kotlinx_io_core2 - 55;
                    }
                    if ((j3 & (-1152921504606846976L)) != 0) {
                        kotlinx.io.Buffer buffer2 = new kotlinx.io.Buffer();
                        kotlinx.io.SinksKt.writeHexadecimalUnsignedLong(buffer2, j3);
                        buffer2.writeByte(unchecked$kotlinx_io_core2);
                        throw new java.lang.NumberFormatException("Number too large: " + kotlinx.io.Utf8Kt.readString(buffer2));
                    }
                    j3 = (j3 << 4) + i2;
                    j4++;
                }
            }
            j = 1;
            if (z) {
                break;
            }
            j2 = j;
            b2 = 71;
        }
        source.skip(j4);
        return j3;
    }

    public static /* synthetic */ long indexOf$default(kotlinx.io.Source source, byte b, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = Long.MAX_VALUE;
        }
        return indexOf(source, b, j3, j2);
    }

    public static final long indexOf(kotlinx.io.Source source, byte b, long j, long j2) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        if (0 <= j && j <= j2) {
            if (j == j2) {
                return -1L;
            }
            long j3 = j;
            while (j3 < j2 && source.request(1 + j3)) {
                long indexOf = kotlinx.io.BuffersKt.indexOf(source.getBufferField(), b, j3, java.lang.Math.min(j2, source.getBufferField().getSizeMut()));
                if (indexOf != -1) {
                    return indexOf;
                }
                j3 = source.getBufferField().getSizeMut();
            }
            return -1L;
        }
        if (j2 < 0) {
            str = "startIndex (" + j + ") and endIndex (" + j2 + ") should be non negative";
        } else {
            str = "startIndex (" + j + ") is not within the range [0..endIndex(" + j2 + "))";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }

    public static final byte[] readByteArray(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return readByteArrayImpl(source, -1);
    }

    public static final byte[] readByteArray(kotlinx.io.Source source, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        long j = i;
        if (j >= 0) {
            return readByteArrayImpl(source, i);
        }
        throw new java.lang.IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
    }

    private static final byte[] readByteArrayImpl(kotlinx.io.Source source, int i) {
        if (i == -1) {
            for (long j = 2147483647L; source.getBufferField().getSizeMut() < 2147483647L && source.request(j); j *= 2) {
            }
            if (source.getBufferField().getSizeMut() >= 2147483647L) {
                throw new java.lang.IllegalStateException(("Can't create an array of size " + source.getBufferField().getSizeMut()).toString());
            }
            i = (int) source.getBufferField().getSizeMut();
        } else {
            source.require(i);
        }
        byte[] bArr = new byte[i];
        readTo$default(source.getBufferField(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static /* synthetic */ void readTo$default(kotlinx.io.Source source, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        readTo(source, bArr, i, i2);
    }

    public static final void readTo(kotlinx.io.Source source, byte[] sink, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        kotlinx.io._UtilKt.checkBounds(sink.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int readAtMostTo = source.readAtMostTo(sink, i3, i2);
            if (readAtMostTo == -1) {
                throw new java.io.EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + readAtMostTo + " bytes were read.");
            }
            i3 += readAtMostTo;
        }
    }

    public static final byte readUByte(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.UByte.m10816constructorimpl(source.readByte());
    }

    public static final short readUShort(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.UShort.m11082constructorimpl(source.readShort());
    }

    public static final int readUInt(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.UInt.m10896constructorimpl(source.readInt());
    }

    public static final long readULong(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.ULong.m10975constructorimpl(source.readLong());
    }

    public static final short readUShortLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.UShort.m11082constructorimpl(readShortLe(source));
    }

    public static final int readUIntLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.UInt.m10896constructorimpl(readIntLe(source));
    }

    public static final long readULongLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return kotlin.ULong.m10975constructorimpl(readLongLe(source));
    }

    public static final float readFloat(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat(source.readInt());
    }

    public static final double readDouble(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.DoubleCompanionObject doubleCompanionObject = kotlin.jvm.internal.DoubleCompanionObject.INSTANCE;
        return java.lang.Double.longBitsToDouble(source.readLong());
    }

    public static final float readFloatLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return java.lang.Float.intBitsToFloat(readIntLe(source));
    }

    public static final double readDoubleLe(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.DoubleCompanionObject doubleCompanionObject = kotlin.jvm.internal.DoubleCompanionObject.INSTANCE;
        return java.lang.Double.longBitsToDouble(readLongLe(source));
    }

    public static final boolean startsWith(kotlinx.io.Source source, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        return source.request(1L) && source.getBufferField().get(0L) == b;
    }
}
