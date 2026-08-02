package io.ktor.http.cio.internals;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010\u0015\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!\"\u001a\u0010#\u001a\u00020\"8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "hashCodeLowerCase", "(Ljava/lang/CharSequence;II)I", "other", "", "equalsLowerCase", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Z", "", "parseHexLong", "(Ljava/lang/CharSequence;)J", "parseDecLong", "Lio/ktor/utils/io/ByteWriteChannel;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeIntHex", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/CharSequence;I)V", "", "HTAB", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lio/ktor/http/HttpMethod;", "DefaultHttpMethods", "Lio/ktor/http/cio/internals/AsciiCharTree;", "getDefaultHttpMethods", "()Lio/ktor/http/cio/internals/AsciiCharTree;", "", "[J", "", "HexLetterTable", "[B", "getHexLetterTable", "()[B"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CharsKt {
    private static final io.ktor.http.cio.internals.AsciiCharTree<io.ktor.http.HttpMethod> DefaultHttpMethods = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE.build(io.ktor.http.HttpMethod.INSTANCE.getDefaultMethods(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Integer.valueOf(io.ktor.http.cio.internals.CharsKt.$r8$lambda$uWe_48lo1ujTXc0gfmAPq_QtOuc((io.ktor.http.HttpMethod) obj));
        }
    }, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Character.valueOf(io.ktor.http.cio.internals.CharsKt.m23365$r8$lambda$Lj36FqQzoGOjhbzUwExdEmm3D4((io.ktor.http.HttpMethod) obj, ((java.lang.Integer) obj2).intValue()));
        }
    });
    public static final char HTAB = '\t';
    private static final byte[] HexLetterTable;
    private static final long[] getHighSpeedVideoFpsRanges;

    public static /* synthetic */ int hashCodeLowerCase$default(java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return hashCodeLowerCase(charSequence, i, i2);
    }

    public static final int hashCodeLowerCase(java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
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

    public static /* synthetic */ boolean equalsLowerCase$default(java.lang.CharSequence charSequence, int i, int i2, java.lang.CharSequence charSequence2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return equalsLowerCase(charSequence, i, i2, charSequence2);
    }

    public static final boolean equalsLowerCase(java.lang.CharSequence charSequence, int i, int i2, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        if (i2 - i != charSequence2.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int charAt = charSequence.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = charSequence2.charAt(i3 - i);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public static final io.ktor.http.cio.internals.AsciiCharTree<io.ktor.http.HttpMethod> getDefaultHttpMethods() {
        return DefaultHttpMethods;
    }

    static {
        long j;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 255);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
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
            arrayList.add(java.lang.Long.valueOf(j));
        }
        getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toLongArray(arrayList);
        kotlin.ranges.IntRange intRange2 = new kotlin.ranges.IntRange(0, 15);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange2.iterator();
        while (it2.hasNext()) {
            int nextInt2 = ((kotlin.collections.IntIterator) it2).nextInt();
            arrayList2.add(java.lang.Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
        }
        HexLetterTable = kotlin.collections.CollectionsKt.toByteArray(arrayList2);
    }

    public static final byte[] getHexLetterTable() {
        return HexLetterTable;
    }

    public static final long parseHexLong(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        long[] jArr = getHighSpeedVideoFpsRanges;
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            int charAt = charSequence.charAt(i) & kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            long j2 = charAt < 255 ? jArr[charAt] : -1L;
            if (j2 == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid HEX number: ");
                sb.append((java.lang.Object) charSequence);
                sb.append(", wrong digit: ");
                sb.append(charSequence.charAt(i));
                throw new java.lang.NumberFormatException(sb.toString());
            }
            j = (j << 4) | j2;
        }
        return j;
    }

    public static final long parseDecLong(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        int length = charSequence.length();
        if (length > 19) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number ");
            sb.append((java.lang.Object) charSequence);
            sb.append(": too large for Long type");
            throw new java.lang.NumberFormatException(sb.toString());
        }
        int i = 0;
        if (length != 19) {
            long j = 0;
            while (i < length) {
                long charAt = charSequence.charAt(i) - 48;
                if (charAt >= 0 && charAt <= 9) {
                    j = (j << 3) + (j << 1) + charAt;
                    i++;
                }
                getHighSpeedVideoFpsRanges(charSequence, i);
                j = (j << 3) + (j << 1) + charAt;
                i++;
            }
            return j;
        }
        int length2 = charSequence.length();
        long j2 = 0;
        while (i < length2) {
            long charAt2 = charSequence.charAt(i) - 48;
            if (charAt2 < 0 || charAt2 > 9) {
                getHighSpeedVideoFpsRanges(charSequence, i);
            }
            j2 = (j2 << 3) + (j2 << 1) + charAt2;
            if (j2 < 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid number ");
                sb2.append((java.lang.Object) charSequence);
                sb2.append(": too large for Long type");
                throw new java.lang.NumberFormatException(sb2.toString());
            }
            i++;
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r7, r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeIntHex(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.http.cio.internals.CharsKt$writeIntHex$1 charsKt$writeIntHex$1;
        int i2;
        byte[] bArr;
        int i3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        int i4;
        int i5;
        int i6;
        if (continuation instanceof io.ktor.http.cio.internals.CharsKt$writeIntHex$1) {
            charsKt$writeIntHex$1 = (io.ktor.http.cio.internals.CharsKt$writeIntHex$1) continuation;
            if ((charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = charsKt$writeIntHex$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i <= 0) {
                        throw new java.lang.IllegalArgumentException("Does only work for positive numbers".toString());
                    }
                    bArr = HexLetterTable;
                    int i7 = 0;
                    while (true) {
                        i3 = i7 + 1;
                        if (i7 >= 8) {
                            break;
                        }
                        int i8 = i >>> 28;
                        i <<= 4;
                        if (i8 != 0) {
                            byte b = bArr[i8];
                            charsKt$writeIntHex$1.getHighSpeedVideoFpsRanges = byteWriteChannel;
                            charsKt$writeIntHex$1.getHighSpeedVideoFpsRangesFor = bArr;
                            charsKt$writeIntHex$1.Camera2StreamConfigurationMap = i;
                            charsKt$writeIntHex$1.getHighSpeedVideoSizes = i3;
                            charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        } else {
                            i7 = i3;
                        }
                    }
                    byteWriteChannel2 = byteWriteChannel;
                    i4 = i3;
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = charsKt$writeIntHex$1.getHighSpeedVideoSizes;
                    i = charsKt$writeIntHex$1.Camera2StreamConfigurationMap;
                    bArr = (byte[]) charsKt$writeIntHex$1.getHighSpeedVideoFpsRangesFor;
                    byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) charsKt$writeIntHex$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (true) {
                    i5 = i4 + 1;
                    if (i4 >= 8) {
                        i6 = i << 4;
                        byte b2 = bArr[i >>> 28];
                        charsKt$writeIntHex$1.getHighSpeedVideoFpsRanges = byteWriteChannel2;
                        charsKt$writeIntHex$1.getHighSpeedVideoFpsRangesFor = bArr;
                        charsKt$writeIntHex$1.Camera2StreamConfigurationMap = i6;
                        charsKt$writeIntHex$1.getHighSpeedVideoSizes = i5;
                        charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(byteWriteChannel2, b2, charsKt$writeIntHex$1) == coroutine_suspended) {
                            break;
                        }
                        i = i6;
                        i4 = i5;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        charsKt$writeIntHex$1 = new io.ktor.http.cio.internals.CharsKt$writeIntHex$1(continuation);
        java.lang.Object obj2 = charsKt$writeIntHex$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = charsKt$writeIntHex$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        while (true) {
            i5 = i4 + 1;
            if (i4 >= 8) {
            }
            i = i6;
            i4 = i5;
        }
    }

    private static final void getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number: ");
        sb.append((java.lang.Object) charSequence);
        sb.append(", wrong digit: ");
        sb.append(charSequence.charAt(i));
        sb.append(" at position ");
        sb.append(i);
        throw new java.lang.NumberFormatException(sb.toString());
    }

    /* renamed from: $r8$lambda$Lj36FqQzo-GOjhbzUwExdEmm3D4, reason: not valid java name */
    public static /* synthetic */ char m23365$r8$lambda$Lj36FqQzoGOjhbzUwExdEmm3D4(io.ktor.http.HttpMethod httpMethod, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        return httpMethod.getValue().charAt(i);
    }

    public static /* synthetic */ int $r8$lambda$uWe_48lo1ujTXc0gfmAPq_QtOuc(io.ktor.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        return httpMethod.getValue().length();
    }
}
