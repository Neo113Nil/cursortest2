package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u0000 E*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001EB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u001dJ\u001d\u0010\u0014\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u001fJ%\u0010#\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J=\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u0004\u0018\u00010\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b,\u0010-J9\u0010.\u001a\u0004\u0018\u00010\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b.\u0010-J#\u0010/\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J+\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b1\u00102J7\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b3\u00104J+\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0003¢\u0006\u0004\b5\u00102J7\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00032\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(¢\u0006\u0004\b6\u00104R\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010:R*\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "", "bitmap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "positionMask", "indexOfCellAt$runtime", "(I)I", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "p2", "getHighSpeedVideoFpsRanges", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "p3", "p4", "getHighSpeedVideoFpsRangesFor", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "p5", "Camera2StreamConfigurationMap", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "()I", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "elementHash", "element", "shift", "contains", "(ILjava/lang/Object;I)Z", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutator", "mutableAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "remove", "mutableRemove", com.visa.cbp.getEncExpo.warmup, "getBitmap", "setBitmap", "(I)V", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNode<E> {
    private int bitmap;
    private java.lang.Object[] buffer;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownedBy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode EMPTY = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, new java.lang.Object[0]);

    public TrieNode(int i, java.lang.Object[] objArr, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final java.lang.Object[] getBuffer() {
        return this.buffer;
    }

    public final void setBuffer(java.lang.Object[] objArr) {
        this.buffer = objArr;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final void setOwnedBy(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i, java.lang.Object[] objArr) {
        this(i, objArr, null);
    }

    public final int indexOfCellAt$runtime(int positionMask) {
        return java.lang.Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> getHighResolutionOutputSizeshNQ4ISI(int p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> p1) {
        ?? r0 = p1.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (this.buffer.length == 1) {
                    p1.bitmap = this.bitmap;
                    return p1;
                }
                p1 = r02;
            }
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[p0] = p1;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> getHighSpeedVideoFpsRanges(int p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> p1, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p2) {
        ?? r0 = p1.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (this.buffer.length == 1) {
                    p1.bitmap = this.bitmap;
                    return p1;
                }
                p1 = r02;
            }
        }
        if (this.ownedBy == p2) {
            this.buffer[p0] = p1;
            return this;
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[p0] = p1;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf, p2);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> Camera2StreamConfigurationMap(int p0, E p1, int p2, E p3, int p4, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p5) {
        java.lang.Object[] objArr;
        if (p4 > 30) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, new java.lang.Object[]{p1, p3}, p5);
        }
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(p0, p4);
        int indexSegment2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(p2, p4);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new java.lang.Object[]{p1, p3};
            } else {
                objArr = new java.lang.Object[]{p3, p1};
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>((1 << indexSegment) | (1 << indexSegment2), objArr, p5);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(1 << indexSegment, new java.lang.Object[]{Camera2StreamConfigurationMap(p0, p1, p2, p3, p4 + 5, p5)}, p5);
    }

    private final int getHighSpeedVideoFpsRanges() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i = 0;
        for (java.lang.Object obj : this.buffer) {
            i += obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).getHighSpeedVideoFpsRanges() : 1;
        }
        return i;
    }

    private final boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> p0) {
        if (this == p0) {
            return true;
        }
        if (this.bitmap != p0.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != p0.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int elementHash, E element, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = this;
        while (true) {
            int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
            if ((trieNode.bitmap & indexSegment) == 0) {
                return false;
            }
            java.lang.Object obj = trieNode.buffer[trieNode.indexOfCellAt$runtime(indexSegment)];
            if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(element, obj);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            trieNode = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
            if (shift == 30) {
                return kotlin.collections.ArraysKt.contains((E[]) trieNode.buffer, element);
            }
            shift += 5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAddAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        java.lang.Object[] objArr;
        int i;
        java.lang.Object Camera2StreamConfigurationMap;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode mutableAdd;
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + getHighSpeedVideoFpsRanges());
            return this;
        }
        if (shift > 30) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
            if (this == otherNode) {
                intersectionSizeRef.plusAssign(this.buffer.length);
                return this;
            }
            java.lang.Object[] objArr2 = this.buffer;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + otherNode.buffer.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            java.lang.Object[] objArr3 = otherNode.buffer;
            int length = this.buffer.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < objArr3.length) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i3 <= i2);
                if (!kotlin.collections.ArraysKt.contains(this.buffer, objArr3[i2])) {
                    copyOf[length + i3] = objArr3[i2];
                    i3++;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(length + i3 <= copyOf.length);
                }
                i2++;
            }
            int length2 = i3 + this.buffer.length;
            intersectionSizeRef.plusAssign(copyOf.length - length2);
            if (length2 == this.buffer.length) {
                return this;
            }
            if (length2 == otherNode.buffer.length) {
                return otherNode;
            }
            if (length2 != copyOf.length) {
                copyOf = java.util.Arrays.copyOf(copyOf, length2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, ownership)) {
                this.buffer = copyOf;
                return this;
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, copyOf, ownership);
        }
        int i4 = this.bitmap;
        int i5 = otherNode.bitmap | i4;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (i5 == i4 && kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i5, new java.lang.Object[java.lang.Integer.bitCount(i5)], mutator.getOwnership());
        int i6 = i5;
        int i7 = 0;
        while (i6 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i6);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            java.lang.Object[] objArr4 = trieNode.buffer;
            if ((this.bitmap & lowestOneBit) == 0) {
                Camera2StreamConfigurationMap = otherNode.buffer[indexOfCellAt$runtime2];
            } else if ((otherNode.bitmap & lowestOneBit) == 0) {
                Camera2StreamConfigurationMap = this.buffer[indexOfCellAt$runtime];
            } else {
                java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
                java.lang.Object obj2 = otherNode.buffer[indexOfCellAt$runtime2];
                boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                if (z && z2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                    Camera2StreamConfigurationMap = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableAddAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                        int size = mutator.size();
                        mutableAdd = trieNode2.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (mutator.size() == size) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } else if (z2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode3 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2;
                        int size2 = mutator.size();
                        mutableAdd = trieNode3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                        if (mutator.size() == size2) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        }
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        Camera2StreamConfigurationMap = obj;
                    } else {
                        objArr = objArr4;
                        i = lowestOneBit;
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator.getOwnership());
                        objArr[i7] = Camera2StreamConfigurationMap;
                        i7++;
                        i6 ^= i;
                    }
                    Camera2StreamConfigurationMap = mutableAdd;
                }
            }
            objArr = objArr4;
            i = lowestOneBit;
            objArr[i7] = Camera2StreamConfigurationMap;
            i7++;
            i6 ^= i;
        }
        return getHighSpeedVideoFpsRanges(trieNode) ? this : otherNode.getHighSpeedVideoFpsRanges(trieNode) ? otherNode : trieNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object mutableRetainAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(getHighSpeedVideoFpsRanges());
            return this;
        }
        if (shift > 30) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
            if (this == otherNode) {
                intersectionSizeRef.plusAssign(this.buffer.length);
                return this;
            }
            java.lang.Object[] objArr = kotlin.jvm.internal.Intrinsics.areEqual(ownership, this.ownedBy) ? this.buffer : new java.lang.Object[java.lang.Math.min(this.buffer.length, otherNode.buffer.length)];
            java.lang.Object[] objArr2 = this.buffer;
            int i = 0;
            int i2 = 0;
            while (i < objArr2.length) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i2 <= i);
                if (kotlin.collections.ArraysKt.contains(otherNode.buffer, objArr2[i])) {
                    objArr[i2] = objArr2[i];
                    i2++;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i2 <= objArr.length);
                }
                i++;
            }
            intersectionSizeRef.plusAssign(i2);
            if (i2 == 0) {
                return EMPTY;
            }
            if (i2 == 1) {
                return objArr[0];
            }
            if (i2 == this.buffer.length) {
                return this;
            }
            if (i2 == otherNode.buffer.length) {
                return otherNode;
            }
            if (i2 == objArr.length) {
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, objArr, ownership);
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, copyOf, ownership);
        }
        int i3 = this.bitmap & otherNode.bitmap;
        if (i3 == 0) {
            return EMPTY;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i3 == this.bitmap) ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i3, new java.lang.Object[java.lang.Integer.bitCount(i3)], mutator.getOwnership());
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        while (i4 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
            java.lang.Object obj2 = otherNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            if (z && z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                obj = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableRetainAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                intersectionSizeRef.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i5 |= lowestOneBit;
            }
            trieNode.buffer[i6] = obj;
            i6++;
            i4 ^= lowestOneBit;
        }
        int bitCount = java.lang.Integer.bitCount(i5);
        if (i5 == 0) {
            return EMPTY;
        }
        if (i5 == i3) {
            return trieNode.getHighSpeedVideoFpsRanges(this) ? this : trieNode.getHighSpeedVideoFpsRanges(otherNode) ? otherNode : trieNode;
        }
        if (bitCount == 1 && shift != 0) {
            java.lang.Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime(i5)];
            return obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode ? new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i5, new java.lang.Object[]{obj3}, mutator.getOwnership()) : obj3;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[bitCount];
        java.lang.Object[] objArr4 = trieNode.buffer;
        int i7 = 0;
        int i8 = 0;
        while (i7 < objArr4.length) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i8 <= i7);
            if (objArr4[i7] != INSTANCE.getEMPTY$runtime()) {
                objArr3[i8] = objArr4[i7];
                i8++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i8 <= bitCount);
            }
            i7++;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i5, objArr3, mutator.getOwnership());
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0124, code lost:
    
        if ((r14 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode;
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode2 = otherNode;
        if (this == trieNode2) {
            intersectionSizeRef.plusAssign(getHighSpeedVideoFpsRanges());
            return EMPTY;
        }
        int i2 = 0;
        if (shift > 30) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
            if (this == trieNode2) {
                intersectionSizeRef.plusAssign(this.buffer.length);
                return EMPTY;
            }
            java.lang.Object[] objArr = kotlin.jvm.internal.Intrinsics.areEqual(ownership, this.ownedBy) ? this.buffer : new java.lang.Object[this.buffer.length];
            java.lang.Object[] objArr2 = this.buffer;
            int i3 = 0;
            int i4 = 0;
            while (i3 < objArr2.length) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i4 <= i3);
                if (!kotlin.collections.ArraysKt.contains(trieNode2.buffer, objArr2[i3])) {
                    objArr[i4] = objArr2[i3];
                    i4++;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i4 <= objArr.length);
                }
                i3++;
            }
            intersectionSizeRef.plusAssign(this.buffer.length - i4);
            if (i4 == 0) {
                return EMPTY;
            }
            if (i4 == 1) {
                return objArr[0];
            }
            if (i4 == this.buffer.length) {
                return this;
            }
            if (i4 == objArr.length) {
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, objArr, ownership);
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, copyOf, ownership);
        }
        int i5 = this.bitmap & trieNode2.bitmap;
        if (i5 != 0) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) {
                trieNode = this;
            } else {
                int i6 = this.bitmap;
                java.lang.Object[] objArr3 = this.buffer;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                trieNode = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i6, copyOf2, mutator.getOwnership());
            }
            int i7 = this.bitmap;
            while (i5 != 0) {
                int lowestOneBit = java.lang.Integer.lowestOneBit(i5);
                int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
                int indexOfCellAt$runtime2 = trieNode2.indexOfCellAt$runtime(lowestOneBit);
                java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
                java.lang.Object obj2 = trieNode2.buffer[indexOfCellAt$runtime2];
                boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                if (z && z2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                    obj = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableRemoveAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode3 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                        int size = mutator.size();
                        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode mutableRemove = trieNode3.mutableRemove(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (size != mutator.size()) {
                            intersectionSizeRef.plusAssign(1);
                            java.lang.Object[] objArr4 = mutableRemove.buffer;
                            if (objArr4.length == 1) {
                                i = 0;
                                obj = objArr4[0];
                            } else {
                                i = 0;
                            }
                            obj = mutableRemove;
                        }
                    } else {
                        i = 0;
                        if (z2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                            if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                                intersectionSizeRef.plusAssign(1);
                                obj = EMPTY;
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                            intersectionSizeRef.plusAssign(1);
                            obj = EMPTY;
                        }
                    }
                    if (obj != EMPTY) {
                        i7 ^= lowestOneBit;
                    }
                    trieNode.buffer[indexOfCellAt$runtime] = obj;
                    i5 ^= lowestOneBit;
                    trieNode2 = otherNode;
                    i2 = i;
                }
                i = 0;
                if (obj != EMPTY) {
                }
                trieNode.buffer[indexOfCellAt$runtime] = obj;
                i5 ^= lowestOneBit;
                trieNode2 = otherNode;
                i2 = i;
            }
            int i8 = i2;
            int bitCount = java.lang.Integer.bitCount(i7);
            if (i7 == 0) {
                return EMPTY;
            }
            if (i7 != this.bitmap) {
                if (bitCount == 1 && shift != 0) {
                    java.lang.Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime(i7)];
                    return obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode ? new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i7, new java.lang.Object[]{obj3}, mutator.getOwnership()) : obj3;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[bitCount];
                java.lang.Object[] objArr6 = trieNode.buffer;
                int i9 = i8;
                int i10 = i9;
                while (i9 < objArr6.length) {
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i10 <= i9 ? 1 : i8);
                    if (objArr6[i9] != INSTANCE.getEMPTY$runtime()) {
                        objArr5[i10] = objArr6[i9];
                        i10++;
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(i10 <= bitCount ? 1 : i8);
                    }
                    i9++;
                }
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i7, objArr5, mutator.getOwnership());
            }
            if (!trieNode.getHighSpeedVideoFpsRanges(this)) {
                return trieNode;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift) {
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (java.lang.Object obj : otherNode.buffer) {
                if (!kotlin.collections.ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i = this.bitmap;
        int i2 = otherNode.bitmap;
        int i3 = i & i2;
        if (i3 != i2) {
            return false;
        }
        while (i3 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i3);
            int indexOfCellAt$runtime = indexOfCellAt$runtime(lowestOneBit);
            int indexOfCellAt$runtime2 = otherNode.indexOfCellAt$runtime(lowestOneBit);
            java.lang.Object obj2 = this.buffer[indexOfCellAt$runtime];
            java.lang.Object obj3 = otherNode.buffer[indexOfCellAt$runtime2];
            boolean z = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            boolean z2 = obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            if (z && z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                if (!((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).containsAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                if (!((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z2 || !kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i3 ^= lowestOneBit;
        }
        return true;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> add(int elementHash, E element, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> add;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if ((this.bitmap & indexSegment) != 0) {
            int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
            if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
                    java.lang.Object[] objArr = this.buffer;
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                    copyOf[indexOfCellAt$runtime] = getHighSpeedVideoFpsRangesFor(indexOfCellAt$runtime, elementHash, element, shift, null);
                    return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                if (shift != 30) {
                    add = trieNode.add(elementHash, element, shift + 5);
                } else {
                    add = kotlin.collections.ArraysKt.contains((E[]) trieNode.buffer, element) ? trieNode : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(trieNode.buffer, 0, element));
                }
                if (trieNode != add) {
                    return getHighResolutionOutputSizeshNQ4ISI(indexOfCellAt$runtime, add);
                }
            }
            return this;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap | indexSegment, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime(indexSegment), element));
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAdd(int elementHash, E element, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAdd;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if ((this.bitmap & indexSegment) == 0) {
            mutator.setSize(mutator.size() + 1);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
            int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
            if (this.ownedBy == ownership) {
                this.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime, element);
                this.bitmap |= indexSegment;
                return this;
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap | indexSegment, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime, element), ownership);
        }
        int indexOfCellAt$runtime2 = indexOfCellAt$runtime(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime2];
        if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
                mutator.setSize(mutator.size() + 1);
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership2 = mutator.getOwnership();
                if (this.ownedBy == ownership2) {
                    this.buffer[indexOfCellAt$runtime2] = getHighSpeedVideoFpsRangesFor(indexOfCellAt$runtime2, elementHash, element, shift, ownership2);
                    return this;
                }
                java.lang.Object[] objArr = this.buffer;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[indexOfCellAt$runtime2] = getHighSpeedVideoFpsRangesFor(indexOfCellAt$runtime2, elementHash, element, shift, ownership2);
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf, ownership2);
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
            if (shift != 30) {
                mutableAdd = trieNode.mutableAdd(elementHash, element, shift + 5, mutator);
            } else {
                if (!kotlin.collections.ArraysKt.contains((E[]) trieNode.buffer, element)) {
                    mutator.setSize(mutator.size() + 1);
                    if (trieNode.ownedBy == mutator.getOwnership()) {
                        trieNode.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(trieNode.buffer, 0, element);
                    } else {
                        mutableAdd = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$addElementAtIndex(trieNode.buffer, 0, element), mutator.getOwnership());
                    }
                }
                mutableAdd = trieNode;
            }
            if (trieNode != mutableAdd) {
                return getHighSpeedVideoFpsRanges(indexOfCellAt$runtime2, mutableAdd, mutator.getOwnership());
            }
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> remove(int elementHash, E element, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> remove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if ((this.bitmap & indexSegment) != 0) {
            int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
            if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
                    return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap ^ indexSegment, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(this.buffer, indexOfCellAt$runtime));
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                if (shift != 30) {
                    remove = trieNode.remove(elementHash, element, shift + 5);
                } else {
                    int indexOf = kotlin.collections.ArraysKt.indexOf((E[]) trieNode.buffer, element);
                    remove = indexOf != -1 ? new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(trieNode.buffer, indexOf)) : trieNode;
                }
                if (trieNode != remove) {
                    return getHighResolutionOutputSizeshNQ4ISI(indexOfCellAt$runtime, remove);
                }
            }
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableRemove(int elementHash, E element, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableRemove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if ((this.bitmap & indexSegment) != 0) {
            int indexOfCellAt$runtime = indexOfCellAt$runtime(indexSegment);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime];
            if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
                    mutator.setSize(mutator.size() - 1);
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
                    if (this.ownedBy == ownership) {
                        this.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(this.buffer, indexOfCellAt$runtime);
                        this.bitmap ^= indexSegment;
                        return this;
                    }
                    return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap ^ indexSegment, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(this.buffer, indexOfCellAt$runtime), ownership);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                if (shift != 30) {
                    mutableRemove = trieNode.mutableRemove(elementHash, element, shift + 5, mutator);
                } else {
                    int indexOf = kotlin.collections.ArraysKt.indexOf((E[]) trieNode.buffer, element);
                    if (indexOf != -1) {
                        mutator.setSize(mutator.size() - 1);
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership2 = mutator.getOwnership();
                        if (trieNode.ownedBy == ownership2) {
                            trieNode.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(trieNode.buffer, indexOf);
                        } else {
                            mutableRemove = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.access$removeCellAtIndex(trieNode.buffer, indexOf), ownership2);
                        }
                    }
                    mutableRemove = trieNode;
                }
                if (this.ownedBy == mutator.getOwnership() || trieNode != mutableRemove) {
                    return getHighSpeedVideoFpsRanges(indexOfCellAt$runtime, mutableRemove, mutator.getOwnership());
                }
            }
        }
        return this;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode getEMPTY$runtime() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> getHighSpeedVideoFpsRangesFor(int p0, int p1, E p2, int p3, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p4) {
        java.lang.Object obj = this.buffer[p0];
        return Camera2StreamConfigurationMap(obj != null ? obj.hashCode() : 0, obj, p1, p2, p3 + 5, p4);
    }
}
