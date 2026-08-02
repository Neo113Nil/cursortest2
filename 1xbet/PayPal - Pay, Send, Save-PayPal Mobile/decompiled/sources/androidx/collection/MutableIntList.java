package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0010J\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001b\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u000fJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\fJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b#\u0010\u000fJ\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J \u0010$\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\u0015J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "initialCapacity", "<init>", "(I)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(I)Z", "index", "", "(II)V", "elements", "addAll", "(Landroidx/collection/IntList;)Z", "(ILandroidx/collection/IntList;)Z", "", "(I[I)Z", "([I)Z", "clear", "()V", "capacity", "ensureCapacity", "minusAssign", "(Landroidx/collection/IntList;)V", "([I)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "retainAll", "set", "(II)I", "sort", "sortDescending", "minCapacity", "trim", "getCapacity", "()I"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableIntList extends androidx.collection.IntList {
    public MutableIntList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableIntList(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(int element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, int element) {
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, index + 1, index, this._size);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean addAll(int index, int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, elements.length + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto$default(elements, iArr, index, 0, 0, 12, (java.lang.Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int index, androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements._size == 0) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        int[] iArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, elements._size + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto(elements.content, iArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return addAll(this._size, elements);
    }

    public final void plusAssign(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        addAll(this._size, elements);
    }

    public final void plusAssign(int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableIntList mutableIntList, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final void trim(int minCapacity) {
        int max = java.lang.Math.max(minCapacity, this._size);
        if (this.content.length > max) {
            int[] copyOf = java.util.Arrays.copyOf(this.content, max);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, java.lang.Math.max(capacity, (iArr.length * 3) / 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.content = copyOf;
        }
    }

    public final void plusAssign(int element) {
        add(element);
    }

    public final void minusAssign(int element) {
        remove(element);
    }

    public final boolean remove(int element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        for (int i2 : elements) {
            remove(i2);
        }
        return i != this._size;
    }

    public final boolean removeAll(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        int i2 = elements._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(elements.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final int removeAt(int index) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        if (index != this._size - 1) {
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, index, index + 1, this._size);
        }
        this._size--;
        return i;
    }

    public final void removeRange(int start, int end) {
        if (start < 0 || start > this._size || end < 0 || end > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            if (end < this._size) {
                kotlin.collections.ArraysKt.copyInto(this.content, this.content, start, end, this._size);
            }
            this._size -= end - start;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        int[] iArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            int i4 = iArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] != i4) {
                    i3++;
                } else if (i3 >= 0) {
                }
            }
            i2--;
        }
        return i != this._size;
    }

    public final boolean retainAll(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!elements.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final int set(int index, int element) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    public final void sort() {
        if (this._size == 0) {
            return;
        }
        kotlin.collections.ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        if (this._size == 0) {
            return;
        }
        kotlin.collections.ArraysKt.sortDescending(this.content, 0, this._size);
    }

    public final void minusAssign(int[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (int i : elements) {
            remove(i);
        }
    }

    public final void minusAssign(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public MutableIntList() {
        this(0, 1, null);
    }
}
