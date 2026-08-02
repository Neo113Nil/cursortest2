package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\n\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\u00020\u001c2\"\u0010\u001d\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010!\u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0 H\u0080\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J,\u0010#\u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\"J,\u0010$\u001a\u00020\u001c2\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050*H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u0014J\r\u0010.\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u000bJ\r\u0010/\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\u000bJ?\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u000200¢\u0006\u0004\b7\u00108Jk\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u0002002$\b\u0004\u00109\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u0002000\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u0010:J\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010\u000bJ\u000f\u0010<\u001a\u000206H\u0016¢\u0006\u0004\b<\u0010=R\u001c\u0010>\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0003R\u001c\u0010A\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bA\u0010?\u0012\u0004\bB\u0010\u0003R\u0011\u0010D\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bC\u0010\u0014R\u001c\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0003R\u001c\u0010I\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bI\u0010G\u0012\u0004\bJ\u0010\u0003R\u0011\u0010L\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bK\u0010\u0014R\u001c\u0010M\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bM\u0010G\u0012\u0004\bN\u0010\u0003\u0082\u0001\u0001O\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/LongLongMap;", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "key", "contains", "(J)Z", "containsKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function2;)I", "other", "equals", "(Ljava/lang/Object;)Z", "findKeyIndex", "(J)I", "Lkotlin/ParameterName;", "", "block", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(J)J", "defaultValue", "getOrDefault", "(JJ)J", "Lkotlin/Function0;", "getOrElse", "(JLkotlin/jvm/functions/Function0;)J", "hashCode", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", com.visa.cbp.getEncExpo.warmup, "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "[J", "getKeys$annotations", "metadata", "getMetadata$annotations", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "values", "getValues$annotations", "Landroidx/collection/MutableLongLongMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LongLongMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public long[] values;

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    private LongLongMap() {
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.keys = androidx.collection.LongSetKt.getEmptyLongArray();
        this.values = androidx.collection.LongSetKt.getEmptyLongArray();
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

    public final long get(long key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key ".concat(java.lang.String.valueOf(key)));
        }
        return this.values[findKeyIndex];
    }

    public final long getOrDefault(long key, long defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : defaultValue;
    }

    public final long getOrElse(long key, kotlin.jvm.functions.Function0<java.lang.Long> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            return defaultValue.invoke().longValue();
        }
        return this.values[findKeyIndex];
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

    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        block.invoke(java.lang.Long.valueOf(jArr[i4]), java.lang.Long.valueOf(jArr2[i4]));
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

    public final void forEachKey(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(java.lang.Long.valueOf(jArr[(i << 3) + i3]));
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

    public final void forEachValue(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(java.lang.Long.valueOf(jArr[(i << 3) + i3]));
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

    public final boolean contains(long key) {
        return containsKey(key);
    }

    public final boolean containsKey(long key) {
        return findKeyIndex(key) >= 0;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongLongMap longLongMap, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, int i2, java.lang.Object obj) {
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
        return longLongMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated) {
        long[] jArr;
        long[] jArr2;
        int i;
        long[] jArr3;
        long[] jArr4;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        long[] jArr5 = this.keys;
        long[] jArr6 = this.values;
        long[] jArr7 = this.metadata;
        int length = jArr7.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr7[i3];
                int i5 = i3;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            jArr4 = jArr7;
                            i2 = length;
                            long j2 = jArr5[i8];
                            jArr3 = jArr5;
                            long j3 = jArr6[i8];
                            if (i4 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(separator);
                            }
                            sb.append(j2);
                            sb.append('=');
                            sb.append(j3);
                            i4++;
                        } else {
                            jArr3 = jArr5;
                            jArr4 = jArr7;
                            i2 = length;
                        }
                        j >>= 8;
                        i7++;
                        jArr7 = jArr4;
                        length = i2;
                        jArr5 = jArr3;
                    }
                    jArr = jArr5;
                    jArr2 = jArr7;
                    int i9 = length;
                    if (i6 != 8) {
                        break;
                    }
                    i = i5;
                    length = i9;
                } else {
                    jArr = jArr5;
                    jArr2 = jArr7;
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
                jArr7 = jArr2;
                jArr5 = jArr;
            }
        }
        sb.append(postfix);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongLongMap longLongMap, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        long[] jArr;
        java.lang.CharSequence charSequence5;
        long[] jArr2;
        java.lang.CharSequence charSequence6;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        java.lang.CharSequence charSequence7 = (i2 & 1) != 0 ? ", " : charSequence;
        java.lang.CharSequence charSequence8 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence9 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        java.lang.CharSequence charSequence10 = (i2 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence8);
        long[] jArr3 = longLongMap.keys;
        long[] jArr4 = longLongMap.values;
        long[] jArr5 = longLongMap.metadata;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr5[i4];
                int i6 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            long j2 = jArr3[i9];
                            long j3 = jArr4[i9];
                            if (i5 == i3) {
                                sb.append(charSequence10);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence7);
                            }
                            jArr2 = jArr5;
                            java.lang.Long valueOf = java.lang.Long.valueOf(j2);
                            charSequence6 = charSequence7;
                            sb.append((java.lang.CharSequence) function2.invoke(valueOf, java.lang.Long.valueOf(j3)));
                            i5++;
                        } else {
                            jArr2 = jArr5;
                            charSequence6 = charSequence7;
                        }
                        j >>= 8;
                        i8++;
                        jArr5 = jArr2;
                        charSequence7 = charSequence6;
                    }
                    jArr = jArr5;
                    charSequence5 = charSequence7;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr5;
                    charSequence5 = charSequence7;
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
                jArr5 = jArr;
                charSequence7 = charSequence5;
            }
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return obj2;
        }
        sb.append(charSequence9);
        java.lang.String obj22 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj22, "");
        return obj22;
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> transform) {
        java.lang.CharSequence charSequence = separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(transform.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i2++;
                        }
                        j >>= 8;
                        i5++;
                        charSequence = separator;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                charSequence = separator;
            }
        }
        sb.append(postfix);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public boolean equals(java.lang.Object other) {
        int i;
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.LongLongMap)) {
            return false;
        }
        androidx.collection.LongLongMap longLongMap = (androidx.collection.LongLongMap) other;
        if (longLongMap.get_size() != get_size()) {
            return false;
        }
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i = i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            int findKeyIndex = longLongMap.findKeyIndex(j2);
                            if (findKeyIndex < 0 || j3 != longLongMap.values[findKeyIndex]) {
                                break loop0;
                            }
                            i3 = 8;
                        } else {
                            i = i5;
                        }
                        j >>= i3;
                        i5 = i + 1;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i2 = i5;
                            long j2 = jArr[i10];
                            i3 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this._size) {
                                sb.append(", ");
                            }
                            i4 = 8;
                        } else {
                            i2 = i5;
                            i3 = i9;
                            i4 = i7;
                        }
                        j >>= i4;
                        i9 = i3 + 1;
                        i7 = i4;
                        i5 = i2;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(java.lang.Long.valueOf(jArr[i4]), java.lang.Long.valueOf(jArr2[i4])).booleanValue()) {
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

    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(java.lang.Long.valueOf(jArr[i4]), java.lang.Long.valueOf(jArr2[i4])).booleanValue()) {
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

    public final int count(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (predicate.invoke(java.lang.Long.valueOf(jArr[i5]), java.lang.Long.valueOf(jArr2[i5])).booleanValue()) {
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

    public final boolean containsValue(long value) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && value == jArr[(i << 3) + i3]) {
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        i2 += java.lang.Long.hashCode(jArr[i5]) ^ java.lang.Long.hashCode(jArr2[i5]);
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

    public final int findKeyIndex(long key) {
        int hashCode = java.lang.Long.hashCode(key) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = this._capacity;
        int i2 = ((hashCode ^ (hashCode << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i2) & i;
                if (this.keys[numberOfTrailingZeros] == key) {
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

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence4 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr3[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            long j2 = jArr[i7];
                            long j3 = jArr2[i7];
                            if (i3 == i) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(function2.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i3++;
                        }
                        j >>= 8;
                        i6++;
                        charSequence4 = charSequence;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                charSequence4 = charSequence;
            }
        }
        sb.append(charSequence3);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence4 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(function2.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i2++;
                        }
                        j >>= 8;
                        i5++;
                        charSequence4 = charSequence;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                charSequence4 = charSequence;
            }
        }
        sb.append(charSequence3);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence3 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence3);
                            }
                            sb.append(function2.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i2++;
                        }
                        j >>= 8;
                        i5++;
                        charSequence3 = charSequence;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                charSequence3 = charSequence;
            }
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence2 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence2);
                            }
                            sb.append(function2.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i2++;
                        }
                        j >>= 8;
                        i5++;
                        charSequence2 = charSequence;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                charSequence2 = charSequence;
            }
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> function2) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr3[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            long j3 = jArr2[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) r3);
                            }
                            str2 = r3;
                            sb.append(function2.invoke(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
                            i2++;
                        } else {
                            str2 = r3;
                        }
                        j >>= 8;
                        i5++;
                        r3 = str2;
                    }
                    str = r3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    str = r3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                r3 = str;
            }
        }
        sb.append((java.lang.CharSequence) r5);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
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

    public /* synthetic */ LongLongMap(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
