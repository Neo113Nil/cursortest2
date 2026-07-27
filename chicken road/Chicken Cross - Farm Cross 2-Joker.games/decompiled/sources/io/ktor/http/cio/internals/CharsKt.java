package io.ktor.http.cio.internals;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.http.HttpMethod;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: Chars.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0082\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!\" \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u001a\u0010,\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"", "", "start", "end", "hashCodeLowerCase", "(Ljava/lang/CharSequence;II)I", "other", "", "equalsLowerCase", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Z", "toLowerCase", "(I)I", "", "parseHexLong", "(Ljava/lang/CharSequence;)J", "parseDecLong", "parseDecLongWithCheck", "Lio/ktor/utils/io/ByteWriteChannel;", "value", "", "writeIntHex", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_SS, "idx", "", "hexNumberFormatException", "(Ljava/lang/CharSequence;I)Ljava/lang/Void;", "cs", "numberFormatException", "(Ljava/lang/CharSequence;I)V", "(Ljava/lang/CharSequence;)V", "", "HTAB", "C", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lio/ktor/http/HttpMethod;", "DefaultHttpMethods", "Lio/ktor/http/cio/internals/AsciiCharTree;", "getDefaultHttpMethods", "()Lio/ktor/http/cio/internals/AsciiCharTree;", "", "HexTable", "[J", "", "HexLetterTable", "[B", "getHexLetterTable", "()[B", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharsKt {
    private static final AsciiCharTree<HttpMethod> DefaultHttpMethods = AsciiCharTree.INSTANCE.build(HttpMethod.INSTANCE.getDefaultMethods(), new Function1() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int DefaultHttpMethods$lambda$0;
            DefaultHttpMethods$lambda$0 = CharsKt.DefaultHttpMethods$lambda$0((HttpMethod) obj);
            return Integer.valueOf(DefaultHttpMethods$lambda$0);
        }
    }, new Function2() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            char DefaultHttpMethods$lambda$1;
            DefaultHttpMethods$lambda$1 = CharsKt.DefaultHttpMethods$lambda$1((HttpMethod) obj, ((Integer) obj2).intValue());
            return Character.valueOf(DefaultHttpMethods$lambda$1);
        }
    });
    public static final char HTAB = '\t';
    private static final byte[] HexLetterTable;
    private static final long[] HexTable;

    private static final int toLowerCase(int i) {
        return (65 > i || i >= 91) ? i : i + 32;
    }

    public static /* synthetic */ int hashCodeLowerCase$default(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return hashCodeLowerCase(charSequence, i, i2);
    }

    public static final int hashCodeLowerCase(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static /* synthetic */ boolean equalsLowerCase$default(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return equalsLowerCase(charSequence, i, i2, charSequence2);
    }

    public static final boolean equalsLowerCase(CharSequence charSequence, int i, int i2, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 - i != other.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int charAt = charSequence.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = other.charAt(i3 - i);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public static final AsciiCharTree<HttpMethod> getDefaultHttpMethods() {
        return DefaultHttpMethods;
    }

    static {
        long j;
        IntRange intRange = new IntRange(0, 255);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (48 > nextInt || nextInt >= 58) {
                long j2 = nextInt;
                long j3 = 97;
                if (j2 < 97 || j2 > 102) {
                    j3 = 65;
                    if (j2 < 65 || j2 > 70) {
                        j = -1;
                    }
                }
                j = (j2 - j3) + 10;
            } else {
                j = nextInt - 48;
            }
            arrayList.add(Long.valueOf(j));
        }
        HexTable = CollectionsKt.toLongArray(arrayList);
        IntRange intRange2 = new IntRange(0, 15);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterator<Integer> it2 = intRange2.iterator();
        while (it2.hasNext()) {
            int nextInt2 = ((IntIterator) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
        }
        HexLetterTable = CollectionsKt.toByteArray(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DefaultHttpMethods$lambda$0(HttpMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char DefaultHttpMethods$lambda$1(HttpMethod m, int i) {
        Intrinsics.checkNotNullParameter(m, "m");
        return m.getValue().charAt(i);
    }

    public static final byte[] getHexLetterTable() {
        return HexLetterTable;
    }

    public static final long parseHexLong(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        long[] jArr = HexTable;
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            int charAt = charSequence.charAt(i) & CharCompanionObject.MAX_VALUE;
            long j2 = charAt < 255 ? jArr[charAt] : -1L;
            if (j2 == -1) {
                hexNumberFormatException(charSequence, i);
                throw new KotlinNothingValueException();
            }
            j = (j << 4) | j2;
        }
        return j;
    }

    public static final long parseDecLong(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            numberFormatException(charSequence);
        }
        if (length == 19) {
            return parseDecLongWithCheck(charSequence);
        }
        long j = 0;
        for (int i = 0; i < length; i++) {
            long charAt = charSequence.charAt(i) - 48;
            if (charAt < 0 || charAt > 9) {
                numberFormatException(charSequence, i);
            }
            j = (j << 3) + (j << 1) + charAt;
        }
        return j;
    }

    private static final long parseDecLongWithCheck(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            long charAt = charSequence.charAt(i) - 48;
            if (charAt < 0 || charAt > 9) {
                numberFormatException(charSequence, i);
            }
            j = (j << 3) + (j << 1) + charAt;
            if (j < 0) {
                numberFormatException(charSequence);
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeIntHex(ByteWriteChannel byteWriteChannel, int i, Continuation<? super Unit> continuation) {
        CharsKt$writeIntHex$1 charsKt$writeIntHex$1;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        if (continuation instanceof CharsKt$writeIntHex$1) {
            charsKt$writeIntHex$1 = (CharsKt$writeIntHex$1) continuation;
            if ((charsKt$writeIntHex$1.label & Integer.MIN_VALUE) != 0) {
                charsKt$writeIntHex$1.label -= Integer.MIN_VALUE;
                Object obj = charsKt$writeIntHex$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = charsKt$writeIntHex$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i <= 0) {
                        throw new IllegalArgumentException("Does only work for positive numbers".toString());
                    }
                    bArr = HexLetterTable;
                    int i5 = 0;
                    while (true) {
                        i3 = i5 + 1;
                        if (i5 < 8) {
                            int i6 = i >>> 28;
                            i <<= 4;
                            if (i6 != 0) {
                                byte b = bArr[i6];
                                charsKt$writeIntHex$1.L$0 = byteWriteChannel;
                                charsKt$writeIntHex$1.L$1 = bArr;
                                charsKt$writeIntHex$1.I$0 = i;
                                charsKt$writeIntHex$1.I$1 = i3;
                                charsKt$writeIntHex$1.label = 1;
                                if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, b, charsKt$writeIntHex$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                i5 = i3;
                            }
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = charsKt$writeIntHex$1.I$1;
                    i = charsKt$writeIntHex$1.I$0;
                    bArr = (byte[]) charsKt$writeIntHex$1.L$1;
                    ByteWriteChannel byteWriteChannel2 = (ByteWriteChannel) charsKt$writeIntHex$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i7;
                    byteWriteChannel = byteWriteChannel2;
                }
                while (true) {
                    i4 = i3 + 1;
                    if (i3 >= 8) {
                        int i8 = i >>> 28;
                        i <<= 4;
                        byte b2 = bArr[i8];
                        charsKt$writeIntHex$1.L$0 = byteWriteChannel;
                        charsKt$writeIntHex$1.L$1 = bArr;
                        charsKt$writeIntHex$1.I$0 = i;
                        charsKt$writeIntHex$1.I$1 = i4;
                        charsKt$writeIntHex$1.label = 2;
                        if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, b2, charsKt$writeIntHex$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3 = i4;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        charsKt$writeIntHex$1 = new CharsKt$writeIntHex$1(continuation);
        Object obj2 = charsKt$writeIntHex$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = charsKt$writeIntHex$1.label;
        if (i2 != 0) {
        }
        while (true) {
            i4 = i3 + 1;
            if (i3 >= 8) {
            }
            i3 = i4;
        }
    }

    private static final Void hexNumberFormatException(CharSequence charSequence, int i) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i));
    }

    private static final void numberFormatException(CharSequence charSequence, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i) + " at position " + i);
    }

    private static final void numberFormatException(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }
}
