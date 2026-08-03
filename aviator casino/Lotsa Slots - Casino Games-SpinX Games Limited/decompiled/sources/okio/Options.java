package okio;

/* compiled from: Options.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.Options.Companion INSTANCE = new okio.Options.Companion(null);
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    public /* synthetic */ Options(okio.ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Options of(okio.ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return contains((okio.ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(okio.ByteString byteString) {
        return super.contains((java.lang.Object) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return indexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(okio.ByteString byteString) {
        return super.indexOf((java.lang.Object) byteString);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof okio.ByteString) {
            return lastIndexOf((okio.ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(okio.ByteString byteString) {
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

    private Options(okio.ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public okio.ByteString get(int index) {
        return this.byteStrings[index];
    }

    /* compiled from: Options.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final okio.Options of(okio.ByteString... byteStrings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new okio.Options(new okio.ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            java.util.List mutableList = kotlin.collections.ArraysKt.toMutableList(byteStrings);
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
            if (((okio.ByteString) mutableList.get(0)).size() <= 0) {
                throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                okio.ByteString byteString = (okio.ByteString) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    okio.ByteString byteString2 = (okio.ByteString) mutableList.get(i6);
                    if (byteString2.startsWith(byteString)) {
                        if (byteString2.size() == byteString.size()) {
                            throw new java.lang.IllegalArgumentException(("duplicate option: " + byteString2).toString());
                        }
                        if (((java.lang.Number) arrayList2.get(i6)).intValue() > ((java.lang.Number) arrayList2.get(i4)).intValue()) {
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
            buildTrieRecursive$default(this, 0L, buffer, 0, mutableList, 0, 0, arrayList2, 53, null);
            int intCount = (int) getIntCount(buffer);
            int[] iArr = new int[intCount];
            for (int i7 = 0; i7 < intCount; i7++) {
                iArr[i7] = buffer.readInt();
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new okio.Options((okio.ByteString[]) copyOf, iArr, defaultConstructorMarker);
        }

        static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion companion, long j, okio.Buffer buffer, int i, java.util.List list, int i2, int i3, java.util.List list2, int i4, java.lang.Object obj) {
            companion.buildTrieRecursive((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final void buildTrieRecursive(long nodeOffset, okio.Buffer node, int byteStringOffset, java.util.List<? extends okio.ByteString> byteStrings, int fromIndex, int toIndex, java.util.List<java.lang.Integer> indexes) {
            int i;
            int i2;
            int i3;
            int i4;
            okio.Buffer buffer;
            int i5 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i6 = fromIndex; i6 < toIndex; i6++) {
                if (byteStrings.get(i6).size() < i5) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
            }
            okio.ByteString byteString = byteStrings.get(fromIndex);
            okio.ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i5 == byteString.size()) {
                int intValue = indexes.get(fromIndex).intValue();
                int i7 = fromIndex + 1;
                okio.ByteString byteString3 = byteStrings.get(i7);
                i = i7;
                i2 = intValue;
                byteString = byteString3;
            } else {
                i = fromIndex;
                i2 = -1;
            }
            if (byteString.getByte(i5) != byteString2.getByte(i5)) {
                int i8 = 1;
                for (int i9 = i + 1; i9 < toIndex; i9++) {
                    if (byteStrings.get(i9 - 1).getByte(i5) != byteStrings.get(i9).getByte(i5)) {
                        i8++;
                    }
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + (i8 * 2);
                node.writeInt(i8);
                node.writeInt(i2);
                for (int i10 = i; i10 < toIndex; i10++) {
                    byte b = byteStrings.get(i10).getByte(i5);
                    if (i10 == i || b != byteStrings.get(i10 - 1).getByte(i5)) {
                        node.writeInt(b & 255);
                    }
                }
                okio.Buffer buffer2 = new okio.Buffer();
                while (i < toIndex) {
                    byte b2 = byteStrings.get(i).getByte(i5);
                    int i11 = i + 1;
                    int i12 = i11;
                    while (true) {
                        if (i12 >= toIndex) {
                            i3 = toIndex;
                            break;
                        } else {
                            if (b2 != byteStrings.get(i12).getByte(i5)) {
                                i3 = i12;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (i11 == i3 && i5 + 1 == byteStrings.get(i).size()) {
                        node.writeInt(indexes.get(i).intValue());
                        i4 = i3;
                        buffer = buffer2;
                    } else {
                        node.writeInt(((int) (intCount + getIntCount(buffer2))) * (-1));
                        i4 = i3;
                        buffer = buffer2;
                        buildTrieRecursive(intCount, buffer2, i5 + 1, byteStrings, i, i3, indexes);
                    }
                    i = i4;
                    buffer2 = buffer;
                }
                node.writeAll(buffer2);
                return;
            }
            int min = java.lang.Math.min(byteString.size(), byteString2.size());
            int i13 = 0;
            for (int i14 = i5; i14 < min && byteString.getByte(i14) == byteString2.getByte(i14); i14++) {
                i13++;
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + i13 + 1;
            node.writeInt(-i13);
            node.writeInt(i2);
            int i15 = i13 + i5;
            while (i5 < i15) {
                node.writeInt(byteString.getByte(i5) & 255);
                i5++;
            }
            if (i + 1 == toIndex) {
                if (i15 != byteStrings.get(i).size()) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                node.writeInt(indexes.get(i).intValue());
            } else {
                okio.Buffer buffer3 = new okio.Buffer();
                node.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                buildTrieRecursive(intCount2, buffer3, i15, byteStrings, i, toIndex, indexes);
                node.writeAll(buffer3);
            }
        }

        private final long getIntCount(okio.Buffer buffer) {
            return buffer.size() / 4;
        }
    }
}
