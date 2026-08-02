package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0012J\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0013J\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0019\u0010\u001bJ\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0012J\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u0012J \u0010'\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u0016J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0016J\u0017\u0010,\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(F)Z", "index", "", "(IF)V", "elements", "addAll", "(Landroidx/collection/FloatList;)Z", "", "([F)Z", "(ILandroidx/collection/FloatList;)Z", "(I[F)Z", "clear", "()V", "capacity", "ensureCapacity", "minusAssign", "(Landroidx/collection/FloatList;)V", "(F)V", "([F)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)F", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "(II)V", "retainAll", "set", "(IF)F", "sort", "sortDescending", "minCapacity", "trim", "getCapacity", "()I"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableFloatList extends androidx.collection.FloatList {
    public MutableFloatList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableFloatList(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(float element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, float element) {
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(fArr, fArr, index + 1, index, this._size);
        }
        fArr[index] = element;
        this._size++;
    }

    public final boolean addAll(int index, float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(fArr, fArr, elements.length + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto$default(elements, fArr, index, 0, 0, 12, (java.lang.Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int index, androidx.collection.FloatList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements._size == 0) {
            return false;
        }
        ensureCapacity(this._size + elements._size);
        float[] fArr = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(fArr, fArr, elements._size + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto(elements.content, fArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(androidx.collection.FloatList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return addAll(this._size, elements);
    }

    public final void plusAssign(androidx.collection.FloatList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        addAll(this._size, elements);
    }

    public final void plusAssign(float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableFloatList mutableFloatList, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void trim(int minCapacity) {
        int max = java.lang.Math.max(minCapacity, this._size);
        if (this.content.length > max) {
            float[] copyOf = java.util.Arrays.copyOf(this.content, max);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        float[] fArr = this.content;
        if (fArr.length < capacity) {
            float[] copyOf = java.util.Arrays.copyOf(fArr, java.lang.Math.max(capacity, (fArr.length * 3) / 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.content = copyOf;
        }
    }

    public final void plusAssign(float element) {
        add(element);
    }

    public final void minusAssign(float element) {
        remove(element);
    }

    public final boolean remove(float element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final boolean removeAll(androidx.collection.FloatList elements) {
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

    public final float removeAt(int index) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[index];
        if (index != this._size - 1) {
            kotlin.collections.ArraysKt.copyInto(fArr, fArr, index, index + 1, this._size);
        }
        this._size--;
        return f;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        float[] fArr = this.content;
        int i2 = this._size - 1;
        while (true) {
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            float f = fArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] != f) {
                    i3++;
                } else if (i3 >= 0) {
                }
            }
            i2--;
        }
        return i != this._size;
    }

    public final boolean retainAll(androidx.collection.FloatList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!elements.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final float set(int index, float element) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[index];
        fArr[index] = element;
        return f;
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

    public final void minusAssign(float[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void minusAssign(androidx.collection.FloatList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public MutableFloatList() {
        this(0, 1, null);
    }
}
