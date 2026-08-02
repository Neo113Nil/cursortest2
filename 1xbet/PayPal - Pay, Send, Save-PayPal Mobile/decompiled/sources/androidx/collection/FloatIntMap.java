package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0014\u001a\u00020\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001f\u001a\u00020\u001d2\"\u0010\u001e\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001c\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u001d0\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J,\u0010\"\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u001d0!H\u0080\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#J,\u0010$\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u001d0!H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010#J,\u0010%\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u001d0!H\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b&\u0010\u001bJ\u001d\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060*H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0015J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\fJ\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\fJ?\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u000200¢\u0006\u0004\b7\u00108Jk\u00107\u001a\u0002062\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u0002002$\b\u0004\u00109\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u001c\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u0002000\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u0010:J\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\fJ\u000f\u0010<\u001a\u000206H\u0016¢\u0006\u0004\b<\u0010=R\u001c\u0010>\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0003R\u001c\u0010A\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bA\u0010?\u0012\u0004\bB\u0010\u0003R\u0011\u0010D\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bC\u0010\u0015R\u001c\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0003R\u001c\u0010J\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0003R\u0011\u0010N\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bM\u0010\u0015R\u001c\u0010P\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bP\u0010Q\u0012\u0004\bR\u0010\u0003\u0082\u0001\u0001S\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/FloatIntMap;", "", "<init>", "()V", "Lkotlin/Function2;", "", "", "", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "key", "contains", "(F)Z", "containsKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "(I)Z", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function2;)I", "other", "equals", "(Ljava/lang/Object;)Z", "findKeyIndex", "(F)I", "Lkotlin/ParameterName;", "", "block", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "defaultValue", "getOrDefault", "(FI)I", "Lkotlin/Function0;", "getOrElse", "(FLkotlin/jvm/functions/Function0;)I", "hashCode", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "none", "toString", "()Ljava/lang/String;", "_capacity", com.visa.cbp.getEncExpo.warmup, "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "[F", "getKeys$annotations", "", "metadata", "[J", "getMetadata$annotations", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "values", "[I", "getValues$annotations", "Landroidx/collection/MutableFloatIntMap;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FloatIntMap {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public int[] values;

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

    private FloatIntMap() {
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.keys = androidx.collection.FloatSetKt.getEmptyFloatArray();
        this.values = androidx.collection.IntSetKt.getEmptyIntArray();
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

    public final int get(float key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key ".concat(java.lang.String.valueOf(key)));
        }
        return this.values[findKeyIndex];
    }

    public final int getOrDefault(float key, int defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : defaultValue;
    }

    public final int getOrElse(float key, kotlin.jvm.functions.Function0<java.lang.Integer> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            return defaultValue.invoke().intValue();
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

    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        block.invoke(java.lang.Float.valueOf(fArr[i4]), java.lang.Integer.valueOf(iArr[i4]));
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

    public final void forEachKey(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        float[] fArr = this.keys;
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

    public final void forEachValue(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        int[] iArr = this.values;
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
                        block.invoke(java.lang.Integer.valueOf(iArr[(i << 3) + i3]));
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

    public final boolean contains(float key) {
        return containsKey(key);
    }

    public final boolean containsKey(float key) {
        return findKeyIndex(key) >= 0;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatIntMap floatIntMap, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, int i2, java.lang.Object obj) {
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
        return floatIntMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated) {
        float[] fArr;
        int[] iArr;
        float[] fArr2;
        int[] iArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        float[] fArr3 = this.keys;
        int[] iArr3 = this.values;
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
                            float f = fArr3[i6];
                            fArr2 = fArr3;
                            int i7 = iArr3[i6];
                            iArr2 = iArr3;
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(f);
                            sb.append('=');
                            sb.append(i7);
                            i2++;
                        } else {
                            fArr2 = fArr3;
                            iArr2 = iArr3;
                        }
                        j >>= 8;
                        i5++;
                        iArr3 = iArr2;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    iArr = iArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                    iArr = iArr3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                iArr3 = iArr;
                fArr3 = fArr;
            }
        }
        sb.append(postfix);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatIntMap floatIntMap, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
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
        float[] fArr = floatIntMap.keys;
        int[] iArr = floatIntMap.values;
        long[] jArr3 = floatIntMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr3[i4];
                int i6 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            float f = fArr[i9];
                            int i10 = iArr[i9];
                            if (i5 == i3) {
                                sb.append(charSequence10);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence7);
                            }
                            jArr2 = jArr3;
                            java.lang.Float valueOf = java.lang.Float.valueOf(f);
                            charSequence6 = charSequence7;
                            sb.append((java.lang.CharSequence) function2.invoke(valueOf, java.lang.Integer.valueOf(i10)));
                            i5++;
                        } else {
                            jArr2 = jArr3;
                            charSequence6 = charSequence7;
                        }
                        j >>= 8;
                        i8++;
                        charSequence7 = charSequence6;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    charSequence5 = charSequence7;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    charSequence5 = charSequence7;
                }
                if (i6 == length) {
                    break;
                }
                i4 = i6 + 1;
                charSequence7 = charSequence5;
                jArr3 = jArr;
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

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> transform) {
        java.lang.CharSequence charSequence = separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i6];
                            int i7 = iArr[i6];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(transform.invoke(java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i7)));
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.FloatIntMap)) {
            return false;
        }
        androidx.collection.FloatIntMap floatIntMap = (androidx.collection.FloatIntMap) other;
        if (floatIntMap.get_size() != get_size()) {
            return false;
        }
        float[] fArr = this.keys;
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        float f = fArr[i4];
                        int i5 = iArr[i4];
                        int findKeyIndex = floatIntMap.findKeyIndex(f);
                        if (findKeyIndex < 0 || i5 != floatIntMap.values[findKeyIndex]) {
                            break loop0;
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

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i5];
                            int i6 = iArr[i5];
                            sb.append(f);
                            sb.append("=");
                            sb.append(i6);
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
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        if (!predicate.invoke(java.lang.Float.valueOf(fArr[i4]), java.lang.Integer.valueOf(iArr[i4])).booleanValue()) {
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

    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            if (predicate.invoke(java.lang.Float.valueOf(fArr[i4]), java.lang.Integer.valueOf(iArr[i4])).booleanValue()) {
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

    public final int count(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        if (predicate.invoke(java.lang.Float.valueOf(fArr[i5]), java.lang.Integer.valueOf(iArr[i5])).booleanValue()) {
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

    public final boolean containsValue(int value) {
        int[] iArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && value == iArr[(i << 3) + i3]) {
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
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                        float f = fArr[i5];
                        i2 += java.lang.Integer.hashCode(iArr[i5]) ^ java.lang.Float.hashCode(f);
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

    public final int findKeyIndex(float key) {
        int hashCode = java.lang.Float.hashCode(key) * androidx.collection.ScatterMapKt.MurmurHashC1;
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

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence4 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            float f = fArr[i7];
                            int i8 = iArr[i7];
                            if (i3 == i) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(function2.invoke(java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i8)));
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

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence4 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i6];
                            int i7 = iArr[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(function2.invoke(java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i7)));
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

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence3 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i6];
                            int i7 = iArr[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence3);
                            }
                            sb.append(function2.invoke(java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i7)));
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

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> function2) {
        java.lang.CharSequence charSequence2 = charSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i6];
                            int i7 = iArr[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence2);
                            }
                            sb.append(function2.invoke(java.lang.Float.valueOf(f), java.lang.Integer.valueOf(i7)));
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

    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> function2) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                            float f = fArr[i6];
                            int i7 = iArr[i6];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) r6);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) r3);
                            }
                            java.lang.Float valueOf = java.lang.Float.valueOf(f);
                            str2 = r3;
                            sb.append(function2.invoke(valueOf, java.lang.Integer.valueOf(i7)));
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

    public /* synthetic */ FloatIntMap(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
