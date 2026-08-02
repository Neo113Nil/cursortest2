package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0007\u0010\fJ)\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0017\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0018J7\u0010#\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b#\u0010\u0019JP\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00028\u00002\"\u0010'\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010)J[\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00028\u00002-\u0010'\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b+\u0010,JP\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00028\u00002\"\u0010'\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010)J[\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010%\u001a\u00028\u00002-\u0010'\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b.\u0010,J7\u00101\u001a\u00020/2\u0017\u00100\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020/0\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u00102JB\u00103\u001a\u00020/2\"\u00100\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020/0&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b3\u00104J7\u00105\u001a\u00020/2\u0017\u00100\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020/0\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b5\u00102JB\u00106\u001a\u00020/2\"\u00100\u001a\u001e\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020/0&H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b6\u00104J\u0018\u00107\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u0010\u0018J\u0015\u00109\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b9\u0010\u001cJ7\u0010:\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u0019J7\u0010;\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u0019J\u0010\u0010<\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b=\u0010\bJ?\u0010E\u001a\u00020D2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020>2\b\b\u0002\u0010B\u001a\u00020\u00022\b\b\u0002\u0010C\u001a\u00020>¢\u0006\u0004\bE\u0010FJ[\u0010E\u001a\u00020D2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020>2\b\b\u0002\u0010B\u001a\u00020\u00022\b\b\u0002\u0010C\u001a\u00020>2\u0014\b\u0004\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020>0\tH\u0086\bø\u0001\u0000¢\u0006\u0004\bE\u0010HJ\r\u0010I\u001a\u00020\u0002¢\u0006\u0004\bI\u0010\u0018J7\u0010I\u001a\u00020\u00022\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bI\u0010\u0019J\u0015\u0010J\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010\u001cJ\u0010\u0010K\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\bK\u0010\bJ7\u0010L\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00060\tH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bL\u0010\fJ\u000f\u0010M\u001a\u00020DH\u0016¢\u0006\u0004\bM\u0010NR\u001c\u0010O\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u0012\u0004\bQ\u0010RR\u001c\u0010T\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u0012\u0004\bV\u0010RR\u0012\u0010Z\u001a\u00020W8Ç\u0002¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0012\u0010\\\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\u0018R\u0012\u0010^\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b]\u0010\u0018\u0082\u0001\u0001_\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/IntList;", "", "", "p0", "<init>", "(I)V", "", "any", "()Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "element", "fromIndex", "toIndex", "binarySearch", "(III)I", "contains", "(I)Z", "elements", "containsAll", "(Landroidx/collection/IntList;)Z", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function1;)I", "index", "elementAt", "(I)I", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)I", "other", "equals", "(Ljava/lang/Object;)Z", "first", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "last", "lastIndexOf", "none", "reversedAny", "toString", "()Ljava/lang/String;", "_size", com.visa.cbp.getEncExpo.warmup, "get_size$annotations", "()V", "", "content", "[I", "getContent$annotations", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "lastIndex", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/collection/MutableIntList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class IntList {
    public int _size;
    public int[] content;

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    private IntList(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = androidx.collection.IntSetKt.getEmptyIntArray();
        } else {
            iArr = new int[i];
        }
        this.content = iArr;
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

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(java.lang.Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachReversed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            block.invoke(java.lang.Integer.valueOf(iArr[i]));
        }
    }

    public final void forEachReversedIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            block.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iArr[i]));
        }
    }

    public final int get(int index) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final int elementAt(int index) {
        if (index < 0 || index >= this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final int elementAtOrElse(int index, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        if (index < 0 || index >= this._size) {
            return defaultValue.invoke(java.lang.Integer.valueOf(index)).intValue();
        }
        return this.content[index];
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = toIndex - 1;
        while (fromIndex <= i) {
            int i2 = (fromIndex + i) >>> 1;
            int i3 = this.content[i2];
            if (i3 < element) {
                fromIndex = i2 + 1;
            } else {
                if (i3 <= element) {
                    return i2;
                }
                i = i2 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntList intList, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, int i2, java.lang.Object obj) {
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
        return intList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append(postfix);
                break;
            }
            int i3 = iArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                break;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(i3);
            i2++;
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntList intList, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(charSequence2);
            int[] iArr = intList.content;
            int i3 = intList._size;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    sb.append(charSequence3);
                    break;
                }
                int i5 = iArr[i4];
                if (i4 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i4 != 0) {
                    sb.append(charSequence);
                }
                sb.append((java.lang.CharSequence) function1.invoke(java.lang.Integer.valueOf(i5)));
                i4++;
            }
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return obj2;
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final java.lang.String joinToString(java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int limit, java.lang.CharSequence truncated, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(separator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postfix, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(truncated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append(postfix);
                break;
            }
            int i3 = iArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                break;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(transform.invoke(java.lang.Integer.valueOf(i3)));
            i2++;
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof androidx.collection.IntList) {
            androidx.collection.IntList intList = (androidx.collection.IntList) other;
            int i = intList._size;
            int i2 = this._size;
            if (i == i2) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i2);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
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
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(java.lang.Integer.valueOf(iArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (predicate.invoke(java.lang.Integer.valueOf(iArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(androidx.collection.IntList elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, elements._size);
        int first = until.getFirst();
        int last = until.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (predicate.invoke(java.lang.Integer.valueOf(iArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final int first() {
        if (this._size == 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final int first(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (predicate.invoke(java.lang.Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new java.util.NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super java.lang.Integer, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            initial = operation.invoke(initial, java.lang.Integer.valueOf(iArr[i2]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            R r = initial;
            initial = operation.invoke(java.lang.Integer.valueOf(i2), r, java.lang.Integer.valueOf(iArr[i2]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            initial = operation.invoke(java.lang.Integer.valueOf(iArr[i]), initial);
        }
        return initial;
    }

    public final <R> R foldRightIndexed(R initial, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            initial = operation.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iArr[i]), initial);
        }
        return initial;
    }

    public final int indexOf(int element) {
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (element == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(java.lang.Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (predicate.invoke(java.lang.Integer.valueOf(iArr[i])).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int last() {
        if (this._size == 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int last(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            int i2 = iArr[i];
            if (predicate.invoke(java.lang.Integer.valueOf(i2)).booleanValue()) {
                return i2;
            }
        }
        throw new java.util.NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final int lastIndexOf(int element) {
        int[] iArr = this.content;
        for (int i = this._size - 1; i >= 0; i--) {
            if (iArr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int binarySearch$default(androidx.collection.IntList intList, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = intList._size;
        }
        return intList.binarySearch(i, i2, i3);
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += java.lang.Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == i) {
                    sb.append((java.lang.CharSequence) r1);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(java.lang.Integer.valueOf(i4)));
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((java.lang.CharSequence) r1);
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(java.lang.Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((java.lang.CharSequence) r2);
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(java.lang.Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((java.lang.CharSequence) r1);
                break;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((java.lang.CharSequence) r3);
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(java.lang.Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((java.lang.CharSequence) r2);
                break;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int[] iArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((java.lang.CharSequence) r4);
                    break;
                }
                if (i2 != 0) {
                    sb.append((java.lang.CharSequence) r1);
                }
                sb.append(function1.invoke(java.lang.Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((java.lang.CharSequence) r3);
                break;
            }
        }
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

    public final int binarySearch(int i, int i2) {
        return binarySearch$default(this, i, i2, 0, 4, null);
    }

    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
    }

    public /* synthetic */ IntList(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
