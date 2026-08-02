package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u001b\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ\u001b\u0010\u0015\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0015\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001c\u001a\u00020\u00032\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J4\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00032\u0017\u0010\"\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010\u0013J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J7\u0010'\u001a\u00028\u00002\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b'\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b*\u0010(J9\u0010*\u001a\u0004\u0018\u00018\u00002\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010)JP\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012\"\u0010.\u001a\u001e\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u00100J[\u00102\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012-\u0010.\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u000101H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b2\u00103JP\u00104\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012\"\u0010.\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00010-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b4\u00100J[\u00105\u001a\u00028\u0001\"\u0004\b\u0001\u0010+2\u0006\u0010,\u001a\u00028\u00012-\u0010.\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u000101H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b5\u00103J7\u00108\u001a\u0002062\u0017\u00107\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u0002060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u00109JB\u0010:\u001a\u0002062\"\u00107\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u0002060-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010;J7\u0010<\u001a\u0002062\u0017\u00107\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u0002060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b<\u00109JB\u0010=\u001a\u0002062\"\u00107\u001a\u001e\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u0002060-H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b=\u0010;J\u0018\u0010>\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b>\u0010!J\u000f\u0010?\u001a\u00020\u0003H\u0016¢\u0006\u0004\b?\u0010\u001dJ\u0015\u0010@\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b@\u0010AJ7\u0010B\u001a\u00020\u00032\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010\u001eJ7\u0010C\u001a\u00020\u00032\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bC\u0010\u001eJ\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\tJW\u0010N\u001a\u00020M2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020F2\b\b\u0002\u0010J\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020F2\u0016\b\u0002\u0010L\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020F\u0018\u00010\n¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00028\u0000¢\u0006\u0004\bP\u0010(J7\u0010P\u001a\u00028\u00002\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bP\u0010)J\u0015\u0010Q\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\bQ\u0010AJ\u0012\u0010R\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bR\u0010(J9\u0010R\u001a\u0004\u0018\u00018\u00002\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bR\u0010)J\r\u0010S\u001a\u00020\u0007¢\u0006\u0004\bS\u0010\tJ7\u0010T\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bT\u0010\rJ\u0017\u0010U\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020MH\u0016¢\u0006\u0004\bV\u0010WR\u001c\u0010X\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bX\u0010Y\u0012\u0004\bZ\u0010[R$\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b\\\u0010]\u0012\u0004\b^\u0010[R\u0012\u0010b\u001a\u00020_8Ç\u0002¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0012\u0010d\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bc\u0010\u001dR\u0011\u0010f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\be\u0010\u001d\u0082\u0001\u0001g\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "", "p0", "<init>", "(I)V", "", "any", "()Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "", "asList", "()Ljava/util/List;", "element", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Landroidx/collection/ObjectList;)Z", "", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "(Ljava/util/List;)Z", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function1;)I", "index", "elementAt", "(I)Ljava/lang/Object;", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "other", "equals", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "throwIndexOutOfBoundsExclusiveException$collection", "toString", "()Ljava/lang/String;", "_size", com.visa.cbp.getEncExpo.warmup, "get_size$annotations", "()V", "content", "[Ljava/lang/Object;", "getContent$annotations", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "lastIndex", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/collection/MutableObjectList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public java.lang.Object[] content;

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public abstract java.util.List<E> asList();

    private ObjectList(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = androidx.collection.ObjectListKt.getHighSpeedVideoFpsRanges;
        } else {
            objArr = new java.lang.Object[i];
        }
        this.content = objArr;
    }

    public final int getSize() {
        return this._size;
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final kotlin.ranges.IntRange getIndices() {
        return kotlin.ranges.RangesKt.until(0, this._size);
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(java.util.List<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final E first() {
        if (isEmpty()) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(java.lang.Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            block.invoke(objArr[i]);
        }
    }

    public final void forEachReversedIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            block.invoke(java.lang.Integer.valueOf(i), objArr[i]);
        }
    }

    public final E get(int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
    }

    public final E elementAt(int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        return (E) this.content[index];
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
        sb.append(index);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
    }

    public final E elementAtOrElse(int index, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends E> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        if (index < 0 || index >= this._size) {
            return defaultValue.invoke(java.lang.Integer.valueOf(index));
        }
        return (E) this.content[index];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final E last() {
        if (isEmpty()) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ObjectList objectList, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        java.lang.CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        java.lang.CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return objectList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append(postfix);
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                break;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            if (transform == null) {
                sb.append(obj);
            } else {
                sb.append(transform.invoke(obj));
            }
            i2++;
        }
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof androidx.collection.ObjectList) {
            androidx.collection.ObjectList objectList = (androidx.collection.ObjectList) other;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                java.lang.Object[] objArr = this.content;
                java.lang.Object[] objArr2 = objectList.content;
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i2);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (kotlin.jvm.internal.Intrinsics.areEqual(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new kotlin.jvm.functions.Function1<E, java.lang.CharSequence>(this) { // from class: androidx.collection.ObjectList$toString$1
            final /* synthetic */ androidx.collection.ObjectList<E> Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence invoke(E e) {
                if (e == this.Camera2StreamConfigurationMap) {
                    return "(this)";
                }
                return java.lang.String.valueOf(e);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.Camera2StreamConfigurationMap = this;
            }
        }, 25, null);
    }

    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (predicate.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final int count(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (predicate.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (java.lang.Object) objArr[i2];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new java.util.NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E firstOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (java.lang.Object) objArr[i2];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            initial = operation.invoke(initial, objArr[i2]);
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            initial = operation.invoke(java.lang.Integer.valueOf(i2), initial, objArr[i2]);
        }
        return initial;
    }

    public final <R> R foldRight(R initial, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            initial = operation.invoke(objArr[i], initial);
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            initial = operation.invoke(java.lang.Integer.valueOf(i), objArr[i], initial);
        }
        return initial;
    }

    public final int indexOf(E element) {
        int i = 0;
        if (element == null) {
            java.lang.Object[] objArr = this.content;
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        java.lang.Object[] objArr2 = this.content;
        int i3 = this._size;
        while (i < i3) {
            if (element.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (predicate.invoke(objArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E last(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            ?? r2 = (java.lang.Object) objArr[i];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throw new java.util.NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E lastOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            ?? r2 = (java.lang.Object) objArr[i];
            if (predicate.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final int lastIndexOf(E element) {
        if (element == null) {
            java.lang.Object[] objArr = this.content;
            for (int i = this._size - 1; i >= 0; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        java.lang.Object[] objArr2 = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (element.equals(objArr2[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        java.lang.Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final java.lang.String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public /* synthetic */ ObjectList(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
