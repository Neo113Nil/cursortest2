package androidx.compose.runtime.reflect;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ<\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\r\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8G¢\u0006\u0006\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\r8G¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "Ljava/lang/reflect/Method;", "method", "Landroidx/compose/runtime/reflect/ComposableInfo;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "asMethod", "()Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/Composer;", "composer", "instance", "", "args", "invoke", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Method;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getHighSpeedVideoFpsRanges", "getParameterCount", "parameterCount", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "parameters", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameterTypes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableMethod {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.reflect.ComposableInfo getHighSpeedVideoFpsRanges;
    private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

    public ComposableMethod(java.lang.reflect.Method method, androidx.compose.runtime.reflect.ComposableInfo composableInfo) {
        this.getHighSpeedVideoFpsRangesFor = method;
        this.getHighSpeedVideoFpsRanges = composableInfo;
    }

    /* renamed from: asMethod, reason: from getter */
    public final java.lang.reflect.Method getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getParameterCount() {
        return this.getHighSpeedVideoFpsRanges.getRealParamsCount();
    }

    public final java.lang.reflect.Parameter[] getParameters() {
        return (java.lang.reflect.Parameter[]) kotlin.collections.ArraysKt.copyOfRange(this.getHighSpeedVideoFpsRangesFor.getParameters(), 0, this.getHighSpeedVideoFpsRanges.getRealParamsCount());
    }

    public final java.lang.Class<?>[] getParameterTypes() {
        return (java.lang.Class[]) kotlin.collections.ArraysKt.copyOfRange(this.getHighSpeedVideoFpsRangesFor.getParameterTypes(), 0, this.getHighSpeedVideoFpsRanges.getRealParamsCount());
    }

    public final java.lang.Object invoke(androidx.compose.runtime.Composer composer, java.lang.Object instance, java.lang.Object... args) {
        java.lang.Object obj;
        androidx.compose.runtime.reflect.ComposableInfo composableInfo = this.getHighSpeedVideoFpsRanges;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        int length = this.getHighSpeedVideoFpsRangesFor.getParameterTypes().length;
        int i = realParamsCount + 1;
        int i2 = changedParams + i;
        java.lang.Object[] objArr = new java.lang.Integer[defaultParams];
        for (int i3 = 0; i3 < defaultParams; i3++) {
            int i4 = i3 * 31;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(i4, java.lang.Math.min(i4 + 31, realParamsCount));
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(java.lang.Integer.valueOf((nextInt >= args.length || args[nextInt] == null) ? 1 : 0));
            }
            int i5 = 0;
            int i6 = 0;
            for (java.lang.Object obj2 : arrayList) {
                if (i6 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                i5 |= ((java.lang.Number) obj2).intValue() << i6;
                i6++;
            }
            objArr[i3] = java.lang.Integer.valueOf(i5);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        int i7 = 0;
        while (i7 < length) {
            if (i7 >= 0 && i7 < realParamsCount) {
                obj = (i7 < 0 || i7 >= args.length) ? androidx.compose.runtime.reflect.ComposableMethodKt.access$getDefaultValue(this.getHighSpeedVideoFpsRangesFor.getParameterTypes()[i7]) : args[i7];
            } else if (i7 == realParamsCount) {
                obj = composer;
            } else if (i7 == i || (realParamsCount + 2 <= i7 && i7 < i2)) {
                obj = 0;
            } else {
                if (i2 > i7 || i7 >= length) {
                    throw new java.lang.IllegalStateException("Unexpected index".toString());
                }
                obj = objArr[i7 - i2];
            }
            objArr2[i7] = obj;
            i7++;
        }
        return this.getHighSpeedVideoFpsRangesFor.invoke(instance, java.util.Arrays.copyOf(objArr2, length));
    }

    public final boolean equals(java.lang.Object other) {
        if (other instanceof androidx.compose.runtime.reflect.ComposableMethod) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((androidx.compose.runtime.reflect.ComposableMethod) other).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
