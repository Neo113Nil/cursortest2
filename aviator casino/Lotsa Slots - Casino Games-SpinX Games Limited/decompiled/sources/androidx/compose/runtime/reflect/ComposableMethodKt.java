package androidx.compose.runtime.reflect;

/* compiled from: ComposableMethod.jvm.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    private static final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) java.lang.Math.ceil((i + i2) / 10.0d);
    }

    private static final int defaultParamCount(int i) {
        return (int) java.lang.Math.ceil(i / 31.0d);
    }

    private static final androidx.compose.runtime.reflect.ComposableInfo getComposableInfo(java.lang.reflect.Method method) {
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[length], androidx.compose.runtime.Composer.class)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        length = -1;
        if (length == -1) {
            return new androidx.compose.runtime.reflect.ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, !java.lang.reflect.Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i2 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        int defaultParamCount = length2 != i2 ? defaultParamCount(length) : 0;
        return new androidx.compose.runtime.reflect.ComposableInfo(i2 + defaultParamCount == length2, length, changedParamCount, defaultParamCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Object getDefaultValue(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return java.lang.Double.valueOf(0.0d);
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return 0;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return (byte) 0;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return (char) 0;
                    }
                    break;
                case 3327612:
                    if (name.equals(com.adjust.sdk.Constants.LONG)) {
                        return 0L;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return false;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return java.lang.Float.valueOf(0.0f);
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return (short) 0;
                    }
                    break;
            }
        }
        return null;
    }

    public static final androidx.compose.runtime.reflect.ComposableMethod asComposableMethod(java.lang.reflect.Method method) {
        androidx.compose.runtime.reflect.ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new androidx.compose.runtime.reflect.ComposableMethod(method, composableInfo);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t, int i) {
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            ((kotlin.collections.IntIterator) it).nextInt();
            arrayList.add(t);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new java.lang.Object[0]);
    }

    public static final androidx.compose.runtime.reflect.ComposableMethod getDeclaredComposableMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method method;
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
            spreadBuilder.addSpread(clsArr);
            spreadBuilder.add(androidx.compose.runtime.Composer.class);
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, changedParamCount);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(cls2);
            }
            spreadBuilder.addSpread(arrayList.toArray(new java.lang.Class[0]));
            method = cls.getDeclaredMethod(str, (java.lang.Class[]) spreadBuilder.toArray(new java.lang.Class[spreadBuilder.size()]));
        } catch (java.lang.ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                kotlin.jvm.internal.SpreadBuilder spreadBuilder2 = new kotlin.jvm.internal.SpreadBuilder(4);
                spreadBuilder2.addSpread(clsArr);
                spreadBuilder2.add(androidx.compose.runtime.Composer.class);
                java.lang.Class cls3 = java.lang.Integer.TYPE;
                kotlin.ranges.IntRange until2 = kotlin.ranges.RangesKt.until(0, changedParamCount);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until2, 10));
                java.util.Iterator<java.lang.Integer> it2 = until2.iterator();
                while (it2.hasNext()) {
                    ((kotlin.collections.IntIterator) it2).nextInt();
                    arrayList2.add(cls3);
                }
                spreadBuilder2.addSpread(arrayList2.toArray(new java.lang.Class[0]));
                java.lang.Class cls4 = java.lang.Integer.TYPE;
                kotlin.ranges.IntRange until3 = kotlin.ranges.RangesKt.until(0, defaultParamCount);
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
            throw new java.lang.NoSuchMethodException(cls.getName() + '.' + str);
        }
        androidx.compose.runtime.reflect.ComposableMethod asComposableMethod = asComposableMethod(method);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asComposableMethod);
        return asComposableMethod;
    }
}
