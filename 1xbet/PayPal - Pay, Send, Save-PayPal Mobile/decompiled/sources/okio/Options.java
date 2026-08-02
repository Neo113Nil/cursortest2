package okio;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "p0", "", "p1", "<init>", "([Lokio/ByteString;[I)V", "", "index", "get", "(I)Lokio/ByteString;", "byteStrings", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "trie", "[I", "getTrie$okio", "()[I", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Options.Companion INSTANCE = new okio.Options.Companion(null);
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    private Options(okio.ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return contains((okio.ByteString) obj);
        }
        return false;
    }

    public final /* bridge */ boolean contains(okio.ByteString byteString) {
        return super.contains((java.lang.Object) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return indexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int indexOf(okio.ByteString byteString) {
        return super.indexOf((java.lang.Object) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return lastIndexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(okio.ByteString byteString) {
        return super.lastIndexOf((java.lang.Object) byteString);
    }

    /* renamed from: getByteStrings$okio, reason: from getter */
    public final okio.ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final okio.ByteString get(int index) {
        return this.byteStrings[index];
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJS\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u00020\n*\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018"}, d2 = {"Lokio/Options$Companion;", "", "<init>", "()V", "", "Lokio/ByteString;", "byteStrings", "Lokio/Options;", "of", "([Lokio/ByteString;)Lokio/Options;", "", "p0", "Lokio/Buffer;", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "", "getHighResolutionOutputSizeshNQ4ISI", "(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V", "(Lokio/Buffer;)J", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okio.Options of(okio.ByteString... byteStrings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStrings, "");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new okio.Options(new okio.ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            java.util.List<? extends okio.ByteString> mutableList = kotlin.collections.ArraysKt.toMutableList(byteStrings);
            kotlin.collections.CollectionsKt.sort(mutableList);
            int size = mutableList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(-1);
            }
            java.util.ArrayList arrayList2 = arrayList;
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                arrayList2.set(kotlin.collections.CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (java.lang.Object) null), java.lang.Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (mutableList.get(0).size() <= 0) {
                throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                okio.ByteString byteString = mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    okio.ByteString byteString2 = mutableList.get(i6);
                    if (byteString2.startsWith(byteString)) {
                        if (byteString2.size() == byteString.size()) {
                            throw new java.lang.IllegalArgumentException("duplicate option: ".concat(java.lang.String.valueOf(byteString2)).toString());
                        }
                        if (arrayList2.get(i6).intValue() > arrayList2.get(i4).intValue()) {
                            mutableList.remove(i6);
                            arrayList2.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                }
                i4 = i5;
            }
            okio.Buffer buffer = new okio.Buffer();
            getHighResolutionOutputSizeshNQ4ISI(0L, buffer, 0, mutableList, 0, mutableList.size(), arrayList2);
            int highResolutionOutputSizeshNQ4ISI = (int) getHighResolutionOutputSizeshNQ4ISI(buffer);
            int[] iArr = new int[highResolutionOutputSizeshNQ4ISI];
            for (int i7 = 0; i7 < highResolutionOutputSizeshNQ4ISI; i7++) {
                iArr[i7] = buffer.readInt();
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            return new okio.Options((okio.ByteString[]) copyOf, iArr, defaultConstructorMarker);
        }

        private final void getHighResolutionOutputSizeshNQ4ISI(long p0, okio.Buffer p1, int p2, java.util.List<? extends okio.ByteString> p3, int p4, int p5, java.util.List<java.lang.Integer> p6) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = p2;
            if (p4 >= p5) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i6 = p4; i6 < p5; i6++) {
                if (p3.get(i6).size() < i5) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
            }
            okio.ByteString byteString = p3.get(p4);
            okio.ByteString byteString2 = p3.get(p5 - 1);
            if (i5 == byteString.size()) {
                int intValue = p6.get(p4).intValue();
                int i7 = p4 + 1;
                okio.ByteString byteString3 = p3.get(i7);
                i = i7;
                i2 = intValue;
                byteString = byteString3;
            } else {
                i = p4;
                i2 = -1;
            }
            if (byteString.getByte(i5) != byteString2.getByte(i5)) {
                int i8 = 1;
                for (int i9 = i + 1; i9 < p5; i9++) {
                    if (p3.get(i9 - 1).getByte(i5) != p3.get(i9).getByte(i5)) {
                        i8++;
                    }
                }
                long highResolutionOutputSizeshNQ4ISI = p0 + getHighResolutionOutputSizeshNQ4ISI(p1) + 2 + (i8 * 2);
                p1.writeInt(i8);
                p1.writeInt(i2);
                for (int i10 = i; i10 < p5; i10++) {
                    byte b = p3.get(i10).getByte(i5);
                    if (i10 == i || b != p3.get(i10 - 1).getByte(i5)) {
                        p1.writeInt(b & 255);
                    }
                }
                okio.Buffer buffer = new okio.Buffer();
                int i11 = i;
                while (i11 < p5) {
                    byte b2 = p3.get(i11).getByte(i5);
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        if (i13 >= p5) {
                            i3 = p5;
                            break;
                        } else {
                            if (b2 != p3.get(i13).getByte(i5)) {
                                i3 = i13;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i12 == i3 && i5 + 1 == p3.get(i11).size()) {
                        p1.writeInt(p6.get(i11).intValue());
                        i4 = i3;
                    } else {
                        p1.writeInt(((int) (getHighResolutionOutputSizeshNQ4ISI(buffer) + highResolutionOutputSizeshNQ4ISI)) * (-1));
                        i4 = i3;
                        getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, buffer, i5 + 1, p3, i11, i3, p6);
                    }
                    i11 = i4;
                }
                p1.writeAll(buffer);
                return;
            }
            int min = java.lang.Math.min(byteString.size(), byteString2.size());
            int i14 = 0;
            for (int i15 = i5; i15 < min && byteString.getByte(i15) == byteString2.getByte(i15); i15++) {
                i14++;
            }
            long highResolutionOutputSizeshNQ4ISI2 = p0 + getHighResolutionOutputSizeshNQ4ISI(p1) + 2 + i14 + 1;
            p1.writeInt(-i14);
            p1.writeInt(i2);
            int i16 = i14 + i5;
            while (i5 < i16) {
                p1.writeInt(byteString.getByte(i5) & 255);
                i5++;
            }
            if (i + 1 == p5) {
                if (i16 != p3.get(i).size()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                p1.writeInt(p6.get(i).intValue());
            } else {
                okio.Buffer buffer2 = new okio.Buffer();
                p1.writeInt(((int) (getHighResolutionOutputSizeshNQ4ISI(buffer2) + highResolutionOutputSizeshNQ4ISI2)) * (-1));
                getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, buffer2, i16, p3, i, p5, p6);
                p1.writeAll(buffer2);
            }
        }

        private static long getHighResolutionOutputSizeshNQ4ISI(okio.Buffer buffer) {
            return buffer.size() / 4;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Options of(okio.ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    public /* synthetic */ Options(okio.ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }
}
