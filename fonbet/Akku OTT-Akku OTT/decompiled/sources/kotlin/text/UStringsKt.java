package kotlin.text;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0014\u001a\u001b\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0017\u001a\u001b\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0087\u0080\u0004¢\u0006\u0002\u0010\u001a\u001a\u001b\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¢\u0006\u0002\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0087\u0080\u0004\u001a\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004\u001a\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0087\u0080\u0004\u001a\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004\u001a\u0010\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0087\u0080\u0004\u001a\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0087\u0080\u0004\u001a\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
@JvmName(name = "UStringsKt")
/* loaded from: classes5.dex */
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m3045toStringJSWoG40(long j, int i) {
        return UnsignedKt.ulongToString(j, CharsKt__CharJVMKt.checkRadix(i));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m3046toStringLxnNnR4(byte b, int i) {
        String num = Integer.toString(b & UByte.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m3047toStringV7xB4Y4(int i, int i2) {
        return UnsignedKt.ulongToString(i & KeyboardMap.kValueMask, CharsKt__CharJVMKt.checkRadix(i2));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m3048toStringolVBNx4(short s, int i) {
        String num = Integer.toString(s & UShort.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m1811constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m1728boximpl(UByte.m1734constructorimpl((byte) data));
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str, int i) {
        int i2;
        UInt uInt;
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        UInt uInt2 = null;
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int m1811constructorimpl = UInt.m1811constructorimpl(i);
        int i5 = 119304647;
        while (i2 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return uInt2;
            }
            int i6 = i4 ^ Integer.MIN_VALUE;
            if (Integer.compare(i6, i5 ^ Integer.MIN_VALUE) <= 0) {
                uInt = uInt2;
                i3 = i4;
            } else {
                if (i5 != 119304647) {
                    return uInt2;
                }
                uInt = uInt2;
                i3 = i4;
                i5 = (int) (((-1) & KeyboardMap.kValueMask) / (m1811constructorimpl & KeyboardMap.kValueMask));
                if (Integer.compare(i6, i5 ^ Integer.MIN_VALUE) > 0) {
                    return uInt;
                }
            }
            int m1811constructorimpl2 = UInt.m1811constructorimpl(i3 * m1811constructorimpl);
            i4 = UInt.m1811constructorimpl(UInt.m1811constructorimpl(digitOf) + m1811constructorimpl2);
            if (Integer.compare(i4 ^ Integer.MIN_VALUE, m1811constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return uInt;
            }
            i2++;
            uInt2 = uInt;
        }
        return UInt.m1805boximpl(i4);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[SYNTHETIC] */
    @SinceKotlin(version = "1.5")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ULong toULongOrNull(String str, int i) {
        int i2;
        long j;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        ULong uLong = null;
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i3 = 1;
        if (Intrinsics.compare((int) charAt, 48) >= 0) {
            i2 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long m1890constructorimpl = ULong.m1890constructorimpl(i);
        long j2 = 0;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i2 < length) {
            if (CharsKt__CharJVMKt.digitOf(str.charAt(i2), i) < 0) {
                return uLong;
            }
            ULong uLong2 = uLong;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i4 = i3;
            long j6 = m1890constructorimpl;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                if (j4 == 512409557603043100L) {
                    if (j6 >= j2) {
                        long j7 = (Long.MAX_VALUE / j6) << i4;
                        j = j7 + ((((-1) - (j7 * j6)) ^ Long.MIN_VALUE) >= (j6 ^ Long.MIN_VALUE) ? i4 : 0);
                    } else if (Long.MAX_VALUE < (j6 ^ Long.MIN_VALUE)) {
                        j4 = j2;
                        if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                        }
                    } else {
                        j = 1;
                    }
                    j4 = j;
                    if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return uLong2;
            }
            long m1890constructorimpl2 = ULong.m1890constructorimpl(j3 * j6);
            j3 = ULong.m1890constructorimpl(ULong.m1890constructorimpl(UInt.m1811constructorimpl(r6) & KeyboardMap.kValueMask) + m1890constructorimpl2);
            if (Long.compare(j3 ^ Long.MIN_VALUE, m1890constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return uLong2;
            }
            i2++;
            uLong = uLong2;
            i3 = i4;
            m1890constructorimpl = j6;
            j2 = 0;
        }
        return ULong.m1884boximpl(j3);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m1811constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m1991boximpl(UShort.m1997constructorimpl((short) data));
    }
}
