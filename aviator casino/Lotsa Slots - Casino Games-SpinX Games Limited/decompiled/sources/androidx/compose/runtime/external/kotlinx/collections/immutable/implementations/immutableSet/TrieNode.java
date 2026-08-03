package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

/* compiled from: TrieNode.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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

    private final boolean hasNoCellAt(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    public final int indexOfCellAt$runtime_release(int positionMask) {
        return java.lang.Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    private final E elementAtIndex(int index) {
        return (E) this.buffer[index];
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex(int index) {
        java.lang.Object obj = this.buffer[index];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> addElementAt(int positionMask, E element) {
        java.lang.Object[] addElementAtIndex;
        addElementAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(positionMask), element);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(positionMask | this.bitmap, addElementAtIndex);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAddElementAt(int positionMask, E element, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        java.lang.Object[] addElementAtIndex;
        java.lang.Object[] addElementAtIndex2;
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(positionMask);
        if (this.ownedBy == owner) {
            addElementAtIndex2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, element);
            this.buffer = addElementAtIndex2;
            this.bitmap = positionMask | this.bitmap;
            return this;
        }
        addElementAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, element);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(positionMask | this.bitmap, addElementAtIndex, owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> updateNodeAtIndex(int nodeIndex, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> newNode) {
        ?? r0 = newNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r02;
            }
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[nodeIndex] = newNode;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableUpdateNodeAtIndex(int nodeIndex, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> newNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        ?? r0 = newNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = r02;
            }
        }
        if (this.ownedBy == owner) {
            this.buffer[nodeIndex] = newNode;
            return this;
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[nodeIndex] = newNode;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf, owner);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> makeNodeAtIndex(int elementIndex, int newElementHash, E newElement, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        E elementAtIndex = elementAtIndex(elementIndex);
        return makeNode(elementAtIndex != null ? elementAtIndex.hashCode() : 0, elementAtIndex, newElementHash, newElement, shift + 5, owner);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> moveElementToNode(int elementIndex, int newElementHash, E newElement, int shift) {
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, null);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableMoveElementToNode(int elementIndex, int newElementHash, E newElement, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        if (this.ownedBy == owner) {
            this.buffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, newElement, shift, owner);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(this.bitmap, copyOf, owner);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> makeNode(int elementHash1, E element1, int elementHash2, E element2, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        java.lang.Object[] objArr;
        if (shift > 30) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, new java.lang.Object[]{element1, element2}, owner);
        }
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash1, shift);
        int indexSegment2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash2, shift);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new java.lang.Object[]{element1, element2};
            } else {
                objArr = new java.lang.Object[]{element2, element1};
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>((1 << indexSegment) | (1 << indexSegment2), objArr, owner);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(1 << indexSegment, new java.lang.Object[]{makeNode(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> removeCellAtIndex(int cellIndex, int positionMask) {
        java.lang.Object[] removeCellAtIndex;
        removeCellAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(positionMask ^ this.bitmap, removeCellAtIndex);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableRemoveCellAtIndex(int cellIndex, int positionMask, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        java.lang.Object[] removeCellAtIndex;
        java.lang.Object[] removeCellAtIndex2;
        if (this.ownedBy == owner) {
            removeCellAtIndex2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
            this.buffer = removeCellAtIndex2;
            this.bitmap ^= positionMask;
            return this;
        }
        removeCellAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, cellIndex);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(positionMask ^ this.bitmap, removeCellAtIndex, owner);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> collisionRemoveElementAtIndex(int i) {
        java.lang.Object[] removeCellAtIndex;
        removeCellAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, removeCellAtIndex);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        java.lang.Object[] removeCellAtIndex;
        java.lang.Object[] removeCellAtIndex2;
        if (this.ownedBy == owner) {
            removeCellAtIndex2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, i);
            this.buffer = removeCellAtIndex2;
            return this;
        }
        removeCellAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, removeCellAtIndex, owner);
    }

    private final boolean collisionContainsElement(E element) {
        return kotlin.collections.ArraysKt.contains((E[]) this.buffer, element);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> collisionAdd(E element) {
        java.lang.Object[] addElementAtIndex;
        if (collisionContainsElement(element)) {
            return this;
        }
        addElementAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, addElementAtIndex);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableCollisionAdd(E element, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        java.lang.Object[] addElementAtIndex;
        java.lang.Object[] addElementAtIndex2;
        if (collisionContainsElement(element)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        if (this.ownedBy == mutator.getOwnership()) {
            addElementAtIndex2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
            this.buffer = addElementAtIndex2;
            return this;
        }
        addElementAtIndex = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.addElementAtIndex(this.buffer, 0, element);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, addElementAtIndex, mutator.getOwnership());
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> collisionRemove(E element) {
        int indexOf = kotlin.collections.ArraysKt.indexOf((E[]) this.buffer, element);
        return indexOf != -1 ? collisionRemoveElementAtIndex(indexOf) : this;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableCollisionRemove(E element, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        int indexOf = kotlin.collections.ArraysKt.indexOf((E[]) this.buffer, element);
        if (indexOf == -1) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return mutableCollisionRemoveElementAtIndex(indexOf, mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableCollisionAddAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        java.lang.Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i2 <= i);
            if (!collisionContainsElement(objArr2[i])) {
                copyOf[length + i2] = objArr2[i];
                i2++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(length + i2 <= copyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.buffer.length;
        intersectionSizeRef.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != copyOf.length) {
            copyOf = java.util.Arrays.copyOf(copyOf, length2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, owner)) {
            this.buffer = copyOf;
            return this;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(0, copyOf, owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object mutableCollisionRetainAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return this;
        }
        java.lang.Object[] objArr = kotlin.jvm.internal.Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new java.lang.Object[java.lang.Math.min(this.buffer.length, otherNode.buffer.length)];
        java.lang.Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i2 <= i);
            if (otherNode.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i2 <= objArr.length);
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
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, objArr, owner);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, copyOf, owner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.Object mutableCollisionRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership owner) {
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(this.buffer.length);
            return EMPTY;
        }
        java.lang.Object[] objArr = kotlin.jvm.internal.Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : new java.lang.Object[this.buffer.length];
        java.lang.Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i2 <= i);
            if (!otherNode.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i2 <= objArr.length);
            }
            i++;
        }
        intersectionSizeRef.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, objArr, owner);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(0, copyOf, owner);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i = 0;
        for (java.lang.Object obj : this.buffer) {
            i += obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).calculateSize() : 1;
        }
        return i;
    }

    private final boolean elementsIdentityEquals(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int elementHash, E element, int shift) {
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (shift == 30) {
                return nodeAtIndex.collisionContainsElement(element);
            }
            return nodeAtIndex.contains(elementHash, element, shift + 5);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(element, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAddAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        java.lang.Object[] objArr;
        int i;
        java.lang.Object makeNode;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode mutableAdd;
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i2 = this.bitmap;
        int i3 = otherNode.bitmap | i2;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode = (i3 == i2 && kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i3, new java.lang.Object[java.lang.Integer.bitCount(i3)], mutator.getOwnership());
        int i4 = i3;
        int i5 = 0;
        while (i4 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            java.lang.Object[] objArr2 = trieNode.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                makeNode = otherNode.buffer[indexOfCellAt$runtime_release2];
            } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                makeNode = this.buffer[indexOfCellAt$runtime_release];
            } else {
                java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
                java.lang.Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
                boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
                if (z && z2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    makeNode = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableAddAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                        int size = mutator.size();
                        mutableAdd = trieNode2.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (mutator.size() == size) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } else if (z2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
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
                        makeNode = obj;
                    } else {
                        objArr = objArr2;
                        i = lowestOneBit;
                        makeNode = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator.getOwnership());
                        objArr[i5] = makeNode;
                        i5++;
                        i4 ^= i;
                    }
                    makeNode = mutableAdd;
                }
            }
            objArr = objArr2;
            i = lowestOneBit;
            objArr[i5] = makeNode;
            i5++;
            i4 ^= i;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object mutableRetainAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode;
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i = this.bitmap & otherNode.bitmap;
        if (i == 0) {
            return EMPTY;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode2 = (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && i == this.bitmap) ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i, new java.lang.Object[java.lang.Integer.bitCount(i)], mutator.getOwnership());
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i2 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i2);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
            java.lang.Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            if (z && z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                obj = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableRetainAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
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
                i3 |= lowestOneBit;
            }
            trieNode2.buffer[i4] = obj;
            i4++;
            i2 ^= lowestOneBit;
        }
        int bitCount = java.lang.Integer.bitCount(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == i) {
            return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(otherNode) ? otherNode : trieNode2;
        }
        if (bitCount == 1 && shift != 0) {
            java.lang.Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i3)];
            if (!(obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                return obj3;
            }
            trieNode = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i3, new java.lang.Object[]{obj3}, mutator.getOwnership());
        } else {
            java.lang.Object[] objArr = new java.lang.Object[bitCount];
            java.lang.Object[] objArr2 = trieNode2.buffer;
            int i5 = 0;
            int i6 = 0;
            while (i5 < objArr2.length) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i6 <= i5);
                if (objArr2[i5] != INSTANCE.getEMPTY$runtime_release()) {
                    objArr[i6] = objArr2[i5];
                    i6++;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i6 <= bitCount);
                }
                i5++;
            }
            trieNode = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i3, objArr, mutator.getOwnership());
        }
        return trieNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionSizeRef, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode;
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return EMPTY;
        }
        if (shift > 30) {
            return mutableCollisionRemoveAll(otherNode, intersectionSizeRef, mutator.getOwnership());
        }
        int i = this.bitmap & otherNode.bitmap;
        if (i == 0) {
            return this;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.ownedBy, mutator.getOwnership())) {
            trieNode = this;
        } else {
            int i2 = this.bitmap;
            java.lang.Object[] objArr = this.buffer;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            trieNode = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<>(i2, copyOf, mutator.getOwnership());
        }
        int i3 = this.bitmap;
        while (i != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
            java.lang.Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            boolean z2 = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            if (z && z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                obj = ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj).mutableRemoveAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2, shift + 5, intersectionSizeRef, mutator);
            } else if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode trieNode2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                int size = mutator.size();
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode mutableRemove = trieNode2.mutableRemove(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                if (size != mutator.size()) {
                    intersectionSizeRef.plusAssign(1);
                    java.lang.Object[] objArr2 = mutableRemove.buffer;
                    if (objArr2.length == 1) {
                        obj = objArr2[0];
                    }
                    obj = mutableRemove;
                }
            } else if (z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = EMPTY;
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2)) {
                intersectionSizeRef.plusAssign(1);
                obj = EMPTY;
            }
            if (obj == EMPTY) {
                i3 ^= lowestOneBit;
            }
            trieNode.buffer[indexOfCellAt$runtime_release] = obj;
            i ^= lowestOneBit;
        }
        int bitCount = java.lang.Integer.bitCount(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == this.bitmap) {
            return trieNode.elementsIdentityEquals(this) ? this : trieNode;
        }
        if (bitCount == 1 && shift != 0) {
            java.lang.Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime_release(i3)];
            return obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode ? new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i3, new java.lang.Object[]{obj3}, mutator.getOwnership()) : obj3;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[bitCount];
        java.lang.Object[] objArr4 = trieNode.buffer;
        int i4 = 0;
        int i5 = 0;
        while (i4 < objArr4.length) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i5 <= i4);
            if (objArr4[i4] != INSTANCE.getEMPTY$runtime_release()) {
                objArr3[i5] = objArr4[i4];
                i5++;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(i5 <= bitCount);
            }
            i4++;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode(i3, objArr3, mutator.getOwnership());
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
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            java.lang.Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            java.lang.Object obj3 = otherNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            boolean z2 = obj3 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode;
            if (z && z2) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj2).containsAll((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj3, shift + 5)) {
                    return false;
                }
            } else if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
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
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, element);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(element, obj) ? this : moveElementToNode(indexOfCellAt$runtime_release, elementHash, element, shift);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        if (shift == 30) {
            add = nodeAtIndex.collisionAdd(element);
        } else {
            add = nodeAtIndex.add(elementHash, element, shift + 5);
        }
        return nodeAtIndex == add ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, add);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAdd(int elementHash, E element, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableAdd;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(indexSegment, element, mutator.getOwnership());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (shift == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(element, mutator);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(elementHash, element, shift + 5, mutator);
            }
            return nodeAtIndex == mutableAdd ? this : mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableAdd, mutator.getOwnership());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
            return this;
        }
        mutator.setSize(mutator.size() + 1);
        return mutableMoveElementToNode(indexOfCellAt$runtime_release, elementHash, element, shift, mutator.getOwnership());
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> remove(int elementHash, E element, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> remove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(element, obj) ? removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment) : this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        if (shift == 30) {
            remove = nodeAtIndex.collisionRemove(element);
        } else {
            remove = nodeAtIndex.remove(elementHash, element, shift + 5);
        }
        return nodeAtIndex == remove ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, remove);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableRemove(int elementHash, E element, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> mutableRemove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(elementHash, shift);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        java.lang.Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (shift == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(element, mutator);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(elementHash, element, shift + 5, mutator);
            }
            return (this.ownedBy == mutator.getOwnership() || nodeAtIndex != mutableRemove) ? mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableRemove, mutator.getOwnership()) : this;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(element, obj)) {
            return this;
        }
        mutator.setSize(mutator.size() - 1);
        return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, mutator.getOwnership());
    }

    /* compiled from: TrieNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode getEMPTY$runtime_release() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.EMPTY;
        }
    }
}
