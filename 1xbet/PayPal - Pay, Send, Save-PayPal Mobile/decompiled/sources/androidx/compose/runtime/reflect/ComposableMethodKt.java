package androidx.compose.runtime.reflect;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\t\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/reflect/ComposableMethod;", "asComposableMethod", "(Ljava/lang/reflect/Method;)Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/Class;", "", "methodName", "", "args", "getDeclaredComposableMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableMethodKt {
    public static final androidx.compose.runtime.reflect.ComposableMethod getDeclaredComposableMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method method;
        int length = clsArr.length;
        int ceil = length == 0 ? 1 : (int) java.lang.Math.ceil(length / 10.0d);
        try {
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
            spreadBuilder.addSpread(clsArr);
            spreadBuilder.add(androidx.compose.runtime.Composer.class);
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, ceil);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(cls2);
            }
            spreadBuilder.addSpread(arrayList.toArray(new java.lang.Class[0]));
            method = cls.getDeclaredMethod(str, (java.lang.Class[]) spreadBuilder.toArray(new java.lang.Class[spreadBuilder.size()]));
        } catch (java.lang.ReflectiveOperationException unused) {
            int ceil2 = (int) java.lang.Math.ceil(clsArr.length / 31.0d);
            try {
                kotlin.jvm.internal.SpreadBuilder spreadBuilder2 = new kotlin.jvm.internal.SpreadBuilder(4);
                spreadBuilder2.addSpread(clsArr);
                spreadBuilder2.add(androidx.compose.runtime.Composer.class);
                java.lang.Class cls3 = java.lang.Integer.TYPE;
                kotlin.ranges.IntRange until2 = kotlin.ranges.RangesKt.until(0, ceil);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until2, 10));
                java.util.Iterator<java.lang.Integer> it2 = until2.iterator();
                while (it2.hasNext()) {
                    ((kotlin.collections.IntIterator) it2).nextInt();
                    arrayList2.add(cls3);
                }
                spreadBuilder2.addSpread(arrayList2.toArray(new java.lang.Class[0]));
                java.lang.Class cls4 = java.lang.Integer.TYPE;
                kotlin.ranges.IntRange until3 = kotlin.ranges.RangesKt.until(0, ceil2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until3, 10));
                java.util.Iterator<java.lang.Integer> it3 = until3.iterator();
                while (it3.hasNext()) {
                    ((kotlin.collections.IntIterator) it3).nextInt();
                    arrayList3.add(cls4);
                }
                spreadBuilder2.addSpread(arrayList3.toArray(new java.lang.Class[0]));
                method = cls.getDeclaredMethod(str, (java.lang.Class[]) spreadBuilder2.toArray(new java.lang.Class[spreadBuilder2.size()]));
            } catch (java.lang.ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cls.getName());
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(str);
            throw new java.lang.NoSuchMethodException(sb.toString());
        }
        androidx.compose.runtime.reflect.ComposableMethod asComposableMethod = asComposableMethod(method);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asComposableMethod);
        return asComposableMethod;
    }

    public static final /* synthetic */ java.lang.Object access$getDefaultValue(java.lang.Class cls) {
        java.lang.String name2 = cls.getName();
        if (name2 == null) {
            return null;
        }
        switch (name2.hashCode()) {
            case -1325958191:
                if (name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE)) {
                    return java.lang.Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT) ? 0 : null;
            case 3039496:
                return name2.equals("byte") ? (byte) 0 : null;
            case 3052374:
                return name2.equals("char") ? (char) 0 : null;
            case 3327612:
                return name2.equals(com.adjust.sdk.Constants.LONG) ? 0L : null;
            case 64711720:
                if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN)) {
                    return java.lang.Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT)) {
                    return java.lang.Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return name2.equals("short") ? (short) 0 : null;
            default:
                return null;
        }
    }

    public static final androidx.compose.runtime.reflect.ComposableMethod asComposableMethod(java.lang.reflect.Method method) {
        androidx.compose.runtime.reflect.ComposableInfo composableInfo;
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[length], androidx.compose.runtime.Composer.class)) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    break;
                }
            }
        }
        length = -1;
        if (length == -1) {
            composableInfo = new androidx.compose.runtime.reflect.ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        } else {
            int ceil = length == 0 ? 1 : (int) java.lang.Math.ceil(((!java.lang.reflect.Modifier.isStatic(method.getModifiers()) ? 1 : 0) + length) / 10.0d);
            int i2 = length + 1 + ceil;
            int length2 = method.getParameterTypes().length;
            int ceil2 = length2 != i2 ? (int) java.lang.Math.ceil(length / 31.0d) : 0;
            composableInfo = new androidx.compose.runtime.reflect.ComposableInfo(i2 + ceil2 == length2, length, ceil, ceil2);
        }
        if (composableInfo.isComposable()) {
            return new androidx.compose.runtime.reflect.ComposableMethod(method, composableInfo);
        }
        return null;
    }
}
