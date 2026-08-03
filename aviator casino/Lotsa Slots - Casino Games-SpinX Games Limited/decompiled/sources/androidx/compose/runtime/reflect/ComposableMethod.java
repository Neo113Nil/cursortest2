package androidx.compose.runtime.reflect;

/* compiled from: ComposableMethod.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J:\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "method", "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "parameterCount", "", "getParameterCount", "()I", "parameterTypes", "", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameters", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "asMethod", "equals", "", "other", "hashCode", "invoke", "composer", "Landroidx/compose/runtime/Composer;", com.ironsource.C3232q2.p, "args", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final androidx.compose.runtime.reflect.ComposableInfo composableInfo;
    private final java.lang.reflect.Method method;

    public ComposableMethod(java.lang.reflect.Method method, androidx.compose.runtime.reflect.ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    /* renamed from: asMethod, reason: from getter */
    public final java.lang.reflect.Method getMethod() {
        return this.method;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final java.lang.reflect.Parameter[] getParameters() {
        return (java.lang.reflect.Parameter[]) kotlin.collections.ArraysKt.copyOfRange(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public final java.lang.Class<?>[] getParameterTypes() {
        return (java.lang.Class[]) kotlin.collections.ArraysKt.copyOfRange(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final java.lang.Object invoke(androidx.compose.runtime.Composer composer, java.lang.Object instance, java.lang.Object... args) {
        java.lang.Object obj;
        androidx.compose.runtime.reflect.ComposableInfo composableInfo = this.composableInfo;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        int length = this.method.getParameterTypes().length;
        int i = realParamsCount + 1;
        int i2 = changedParams + i;
        java.lang.Object[] objArr = new java.lang.Integer[defaultParams];
        int i3 = 0;
        for (int i4 = 0; i4 < defaultParams; i4++) {
            int i5 = i4 * 31;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(i5, java.lang.Math.min(i5 + 31, realParamsCount));
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(java.lang.Integer.valueOf((nextInt >= args.length || args[nextInt] == null) ? 1 : 0));
            }
            int i6 = 0;
            int i7 = 0;
            for (java.lang.Object obj2 : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                i6 |= ((java.lang.Number) obj2).intValue() << i7;
                i7 = i8;
            }
            objArr[i4] = java.lang.Integer.valueOf(i6);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        while (i3 < length) {
            if (i3 >= 0 && i3 < realParamsCount) {
                obj = (i3 < 0 || i3 > kotlin.collections.ArraysKt.getLastIndex(args)) ? androidx.compose.runtime.reflect.ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i3]) : args[i3];
            } else if (i3 == realParamsCount) {
                obj = composer;
            } else if (i3 == i || (realParamsCount + 2 <= i3 && i3 < i2)) {
                obj = 0;
            } else {
                if (i2 > i3 || i3 >= length) {
                    throw new java.lang.IllegalStateException("Unexpected index".toString());
                }
                obj = objArr[i3 - i2];
            }
            objArr2[i3] = obj;
            i3++;
        }
        return this.method.invoke(instance, java.util.Arrays.copyOf(objArr2, length));
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof androidx.compose.runtime.reflect.ComposableMethod) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.method, ((androidx.compose.runtime.reflect.ComposableMethod) other).method);
        }
        return false;
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
