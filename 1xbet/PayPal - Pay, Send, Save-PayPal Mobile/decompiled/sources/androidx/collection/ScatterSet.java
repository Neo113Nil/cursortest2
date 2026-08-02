package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\t\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000b\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0014\u001a\u00020\u00132\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001b\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ9\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ7\u0010!\u001a\u00020\u001f2\u0017\u0010 \u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u001f0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u001f2\u0017\u0010 \u001a\u0013\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u001f0\u0005H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u0015J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\fJW\u0010/\u001a\u00020.2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010,\u001a\u00020'2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\fJ\u000f\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0011\u00108\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b7\u0010\u0015R$\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010\u0004R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0004R\u0011\u0010B\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bA\u0010\u0015\u0082\u0001\u0001C\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "any", "()Z", "", "asSet", "()Ljava/util/Set;", "element", "contains", "(Ljava/lang/Object;)Z", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function1;)I", "other", "equals", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndex", "hashCode", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", com.visa.cbp.getEncExpo.warmup, "_size", "getCapacity", "capacity", "", "elements", "[Ljava/lang/Object;", "getElements$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/collection/MutableScatterSet;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public java.lang.Object[] elements;
    public long[] metadata;

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    private ScatterSet() {
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.elements = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final void forEachIndex(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(java.lang.Integer.valueOf((i << 3) + i3));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int count() {
        return get_size();
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ScatterSet scatterSet, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
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
        return scatterSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> transform) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        java.lang.Object[] objArr3 = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            java.lang.Object obj = objArr3[(i3 << 3) + i5];
                            objArr2 = objArr3;
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
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
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i5++;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                objArr3 = objArr;
            }
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return obj2;
        }
        sb.append(postfix);
        java.lang.String obj22 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj22, "");
        return obj22;
    }

    public int hashCode() {
        int i = (this._capacity * 31) + this._size;
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.ScatterSet)) {
            return false;
        }
        androidx.collection.ScatterSet scatterSet = (androidx.collection.ScatterSet) other;
        if (scatterSet.get_size() != get_size()) {
            return false;
        }
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !scatterSet.contains(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new kotlin.jvm.functions.Function1<E, java.lang.CharSequence>(this) { // from class: androidx.collection.ScatterSet$toString$1
            final /* synthetic */ androidx.collection.ScatterSet<E> Camera2StreamConfigurationMap;

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

    public final java.util.Set<E> asSet() {
        return new androidx.collection.SetWrapper(this);
    }

    public final E first() {
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return (E) objArr[(i << 3) + i3];
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The ScatterSet is empty");
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E first(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ?? r10 = (java.lang.Object) objArr[(i << 3) + i3];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E firstOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ?? r10 = (java.lang.Object) objArr[(i << 3) + i3];
                        if (predicate.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return null;
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    public final boolean all(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && !predicate.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                        return false;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && predicate.invoke(objArr[(i << 3) + i3]).booleanValue()) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int count(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128 && predicate.invoke(objArr[(i << 3) + i4]).booleanValue()) {
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final boolean contains(E element) {
        int hashCode = (element != null ? element.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = this._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = ((i & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            int i7 = i;
            for (long j3 = (~j2) & (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.elements[numberOfTrailingZeros], element)) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
            i = i7;
        }
    }

    public final int findElementIndex$collection(E element) {
        int i = 0;
        int hashCode = (element != null ? element.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = this._capacity;
        int i3 = (hashCode ^ (hashCode << 16)) >>> 7;
        while (true) {
            int i4 = i3 & i2;
            long[] jArr = this.metadata;
            int i5 = i4 >> 3;
            int i6 = (i4 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.elements[numberOfTrailingZeros], element)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i3 = i4 + i;
        }
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

    public /* synthetic */ ScatterSet(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
