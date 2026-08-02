package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000b\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0011\u001a\u00020\u00102\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u0019\u001a\u00020\u00052\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u001bJ7\u0010\u001e\u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u001c0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u001c0\u0004H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\fJ?\u0010+\u001a\u00020*2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020$¢\u0006\u0004\b+\u0010,J[\u0010+\u001a\u00020*2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020$2\u0014\b\u0004\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010.J\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\fJ\u000f\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0011\u00106\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b5\u0010\u0012R\u001c\u00108\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u0003R\u001c\u0010<\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u0003R\u0011\u0010@\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b?\u0010\u0012\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/FloatSet;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "any", "()Z", "element", "contains", "(F)Z", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function1;)I", "other", "equals", "(Ljava/lang/Object;)Z", "findElementIndex$collection", "(F)I", "first", "()F", "(Lkotlin/jvm/functions/Function1;)F", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndex", "hashCode", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", com.visa.cbp.getEncExpo.warmup, "_size", "getCapacity", "capacity", "", "elements", "[F", "getElements$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/collection/MutableFloatSet;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FloatSet {
    public int _capacity;
    public int _size;
    public float[] elements;
    public long[] metadata;

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    private FloatSet() {
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.elements = androidx.collection.FloatSetKt.getEmptyFloatArray();
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final int getSize() {
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

    public final void forEach(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        float[] fArr = this.elements;
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
                        block.invoke(java.lang.Float.valueOf(fArr[(i << 3) + i3]));
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

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatSet floatSet, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, int i2, java.lang.Object obj) {
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
        return floatSet.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i << 3) + i5];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(f);
                            i2++;
                            i3 = 8;
                        }
                        j >>= i3;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append(postfix);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatSet floatSet, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        java.lang.CharSequence charSequence5 = (i2 & 1) != 0 ? ", " : charSequence;
        java.lang.CharSequence charSequence6 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence7 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        java.lang.CharSequence charSequence8 = (i2 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence6);
        float[] fArr = floatSet.elements;
        long[] jArr = floatSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr[i4];
                int i6 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i6 << 3) + i9];
                            if (i5 == i3) {
                                sb.append(charSequence8);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence5);
                            }
                            sb.append((java.lang.CharSequence) function1.invoke(java.lang.Float.valueOf(f)));
                            i5++;
                            i7 = 8;
                        }
                        j >>= i7;
                    }
                    if (i8 != i7) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
            }
        }
        sb.append(charSequence7);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        float[] fArr = this.elements;
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
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i3 << 3) + i5];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(java.lang.Float.valueOf(f)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
            }
        }
        sb.append(postfix);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.FloatSet)) {
            return false;
        }
        androidx.collection.FloatSet floatSet = (androidx.collection.FloatSet) other;
        if (floatSet._size != this._size) {
            return false;
        }
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !floatSet.contains(fArr[(i << 3) + i3])) {
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
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final float first() {
        float[] fArr = this.elements;
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
                            return fArr[(i << 3) + i3];
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
        throw new java.util.NoSuchElementException("The FloatSet is empty");
    }

    public final float first(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i3];
                            if (predicate.invoke(java.lang.Float.valueOf(f)).booleanValue()) {
                                return f;
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
        throw new java.util.NoSuchElementException("Could not find a match");
    }

    public final boolean all(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.elements;
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
                    if ((255 & j) < 128 && !predicate.invoke(java.lang.Float.valueOf(fArr[(i << 3) + i3])).booleanValue()) {
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

    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && predicate.invoke(java.lang.Float.valueOf(fArr[(i << 3) + i3])).booleanValue()) {
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

    public final int count(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.elements;
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
                    if ((255 & j) < 128 && predicate.invoke(java.lang.Float.valueOf(fArr[(i << 3) + i4])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(float element) {
        int hashCode = java.lang.Float.hashCode(element) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = this._capacity;
        int i2 = ((hashCode ^ (hashCode << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i2) & i;
                if (this.elements[numberOfTrailingZeros] != element) {
                    j3 &= j3 - 1;
                } else if (numberOfTrailingZeros >= 0) {
                    return true;
                }
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.elements;
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
                    if ((255 & j) < 128) {
                        i2 += java.lang.Float.hashCode(fArr[(i << 3) + i4]);
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

    public final int findElementIndex$collection(float element) {
        int hashCode = java.lang.Float.hashCode(element) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = this._capacity;
        int i2 = ((hashCode ^ (hashCode << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = ((r0 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i2) & i;
                if (this.elements[numberOfTrailingZeros] == element) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i4 << 3) + i6];
                            if (i3 == i) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(java.lang.Float.valueOf(f)));
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
            }
        }
        sb.append(charSequence3);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
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
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i3 << 3) + i5];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(java.lang.Float.valueOf(f)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
            }
        }
        sb.append(charSequence3);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
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
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i3 << 3) + i5];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(java.lang.Float.valueOf(f)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i3 << 3) + i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(java.lang.Float.valueOf(f)));
                            i2++;
                            i4 = 8;
                        }
                        j >>= i4;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i3 << 3) + i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) r3);
                            }
                            sb.append(function1.invoke(java.lang.Float.valueOf(f)));
                            i2++;
                            i4 = 8;
                        }
                        j >>= i4;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
            }
            java.lang.String obj = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final java.lang.String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public /* synthetic */ FloatSet(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
