package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001a\u001a\u00020\u00192\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010 J7\u0010$\u001a\u00020\"2\"\u0010#\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b!\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J,\u0010'\u001a\u00020\"2\u0017\u0010#\u001a\u0013\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0&H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J,\u0010)\u001a\u00020\"2\u0017\u0010#\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0&H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010(J,\u0010*\u001a\u00020\"2\u0017\u0010#\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0&H\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010(J\u001a\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u0001¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u0010\u001bJ\r\u00104\u001a\u00020\u0007¢\u0006\u0004\b4\u0010\fJ\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\fJg\u0010=\u001a\u00020\r2\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u00109\u001a\u0002062\b\b\u0002\u0010:\u001a\u00020\u00192\b\b\u0002\u0010;\u001a\u0002062&\b\u0002\u0010<\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b!\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b!\u0012\u0004\u0012\u000206\u0018\u00010\u0006¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\fJ\u000f\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010\u000fR\u0016\u0010A\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0011\u0010E\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bD\u0010\u001bR$\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030F8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0005R\u001c\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010\u0005R\u0011\u0010O\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bN\u0010\u001bR$\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030F8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bP\u0010H\u0012\u0004\bQ\u0010\u0005\u0082\u0001\u0001R\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "<init>", "()V", "Lkotlin/Function2;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "", "asDebugString$collection", "()Ljava/lang/String;", "", "asMap", "()Ljava/util/Map;", "key", "contains", "(Ljava/lang/Object;)Z", "containsKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function2;)I", "other", "equals", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "Lkotlin/ParameterName;", "", "block", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "_capacity", com.visa.cbp.getEncExpo.warmup, "_size", "getCapacity", "capacity", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "[Ljava/lang/Object;", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "values", "getValues$annotations", "Landroidx/collection/MutableScatterMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public java.lang.Object[] keys;
    public long[] metadata;
    public java.lang.Object[] values;

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private ScatterMap() {
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.keys = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final V getOrElse(K key, kotlin.jvm.functions.Function0<? extends V> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        V v = get(key);
        return v == null ? defaultValue.invoke() : v;
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
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

    public final void forEach(kotlin.jvm.functions.Function2<? super K, ? super V, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
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
                        int i4 = (i << 3) + i3;
                        block.invoke(objArr[i4], objArr2[i4]);
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

    public final void forEachKey(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.keys;
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

    public final void forEachValue(kotlin.jvm.functions.Function1<? super V, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.values;
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ScatterMap scatterMap, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
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
            function2 = null;
        }
        return scatterMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function2);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends java.lang.CharSequence> transform) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        java.lang.Object[] objArr5 = this.keys;
        java.lang.Object[] objArr6 = this.values;
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
                            int i6 = (i3 << 3) + i5;
                            java.lang.Object obj = objArr5[i6];
                            objArr3 = objArr5;
                            java.lang.Object obj2 = objArr6[i6];
                            objArr4 = objArr6;
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            if (transform == null) {
                                sb.append(obj);
                                sb.append('=');
                                sb.append(obj2);
                            } else {
                                sb.append(transform.invoke(obj, obj2));
                            }
                            i2++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j >>= 8;
                        i5++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
        }
        sb.append(postfix);
        java.lang.String obj3 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        return obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.ScatterMap)) {
            return false;
        }
        androidx.collection.ScatterMap scatterMap = (androidx.collection.ScatterMap) other;
        if (scatterMap.get_size() != get_size()) {
            return false;
        }
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i4];
                            java.lang.Object obj2 = objArr2[i4];
                            if (obj2 == null) {
                                if (scatterMap.get(obj) != null || !scatterMap.containsKey(obj)) {
                                    break loop0;
                                }
                            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, scatterMap.get(obj))) {
                                return false;
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
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            java.lang.Object obj = objArr[i5];
                            java.lang.Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj3 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
        return obj3;
    }

    public final java.lang.String asDebugString$collection() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{metadata=[");
        int i = get_capacity();
        for (int i2 = 0; i2 < i; i2++) {
            long j = (this.metadata[i2 >> 3] >> ((i2 & 7) << 3)) & 255;
            if (j == 128) {
                sb.append("Empty");
            } else if (j == 254) {
                sb.append("Deleted");
            } else {
                sb.append(j);
            }
            sb.append(", ");
        }
        sb.append("], keys=[");
        int length = this.keys.length;
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(this.keys[i3]);
            sb.append(", ");
        }
        sb.append("], values=[");
        int length2 = this.values.length;
        for (int i4 = 0; i4 < length2; i4++) {
            sb.append(this.values[i4]);
            sb.append(", ");
        }
        sb.append("]}");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.util.Map<K, V> asMap() {
        return new androidx.collection.MapWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(K key) {
        int i;
        int i2 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i3 = this._capacity;
        int i4 = (hashCode ^ (hashCode << 16)) >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i4 = i5 + i2;
        }
        if (i >= 0) {
            return (V) this.values[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V getOrDefault(K key, V defaultValue) {
        int i;
        int i2 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i3 = this._capacity;
        int i4 = (hashCode ^ (hashCode << 16)) >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i4 = i5 + i2;
        }
        return i >= 0 ? (V) this.values[i] : defaultValue;
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
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
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(objArr[i4], objArr2[i4]).booleanValue()) {
                            return false;
                        }
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

    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
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
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(objArr[i4], objArr2[i4]).booleanValue()) {
                                return true;
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
        return false;
    }

    public final int count(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
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
                        int i5 = (i << 3) + i4;
                        if (predicate.invoke(objArr[i5], objArr2[i5]).booleanValue()) {
                            i2++;
                        }
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

    public final boolean contains(K key) {
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
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

    public final boolean containsKey(K key) {
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
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

    public final boolean containsValue(V value) {
        java.lang.Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && kotlin.jvm.internal.Intrinsics.areEqual(value, objArr[(i << 3) + i3])) {
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

    public int hashCode() {
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
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
                        int i5 = (i << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        i2 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final int findKeyIndex$collection(K key) {
        int i = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
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

    public /* synthetic */ ScatterMap(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
