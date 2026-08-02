package androidx.compose.ui.tooling;

@kotlin.Deprecated(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "<init>", "()V", "Ljava/lang/Class;", "", "p0", "", "p1", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "Landroidx/compose/runtime/Composer;", "p2", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)Ljava/lang/Object;", "className", "methodName", "composer", "args", "", "invokeComposable", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableInvoker {
    public static final int $stable = 0;
    public static final androidx.compose.ui.tooling.ComposableInvoker INSTANCE = new androidx.compose.ui.tooling.ComposableInvoker();

    private ComposableInvoker() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.reflect.Method method, java.lang.Object obj, androidx.compose.runtime.Composer composer, java.lang.Object... objArr) {
        java.lang.Object obj2;
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        int i = -1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[length], androidx.compose.runtime.Composer.class)) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        int i3 = i + 1;
        int ceil = (i != 0 ? (int) java.lang.Math.ceil(((obj != null ? 1 : 0) + i) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) java.lang.Math.ceil(i / 31.0d) : 0) + ceil != length2) {
            throw new java.lang.IllegalStateException("params don't add up to total params".toString());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    obj2 = composer;
                } else if (i3 <= i4 && i4 < ceil) {
                    obj2 = 0;
                } else {
                    if (ceil > i4 || i4 >= length2) {
                        throw new java.lang.IllegalStateException("Unexpected index".toString());
                    }
                    obj2 = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                java.lang.String name2 = method.getParameterTypes()[i4].getName();
                if (name2 != null) {
                    switch (name2.hashCode()) {
                        case -1325958191:
                            if (name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE)) {
                                obj2 = java.lang.Double.valueOf(0.0d);
                                break;
                            }
                            break;
                        case 104431:
                            if (name2.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT)) {
                                obj2 = 0;
                                break;
                            }
                            break;
                        case 3039496:
                            if (name2.equals("byte")) {
                                obj2 = (byte) 0;
                                break;
                            }
                            break;
                        case 3052374:
                            if (name2.equals("char")) {
                                obj2 = (char) 0;
                                break;
                            }
                            break;
                        case 3327612:
                            if (name2.equals(com.adjust.sdk.Constants.LONG)) {
                                obj2 = 0L;
                                break;
                            }
                            break;
                        case 64711720:
                            if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN)) {
                                obj2 = java.lang.Boolean.FALSE;
                                break;
                            }
                            break;
                        case 97526364:
                            if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT)) {
                                obj2 = java.lang.Float.valueOf(0.0f);
                                break;
                            }
                            break;
                        case 109413500:
                            if (name2.equals("short")) {
                                obj2 = (short) 0;
                                break;
                            }
                            break;
                    }
                }
                obj2 = null;
            } else {
                obj2 = objArr[i4];
            }
            objArr2[i4] = obj2;
        }
        return method.invoke(obj, java.util.Arrays.copyOf(objArr2, length2));
    }

    public final void invokeComposable(java.lang.String className, java.lang.String methodName, androidx.compose.runtime.Composer composer, java.lang.Object... args) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(className);
            java.lang.reflect.Method highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cls, methodName, java.util.Arrays.copyOf(args, args.length));
            if (highResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Composable ");
                sb.append(className);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(methodName);
                sb.append(" not found");
                throw new java.lang.NoSuchMethodException(sb.toString());
            }
            highResolutionOutputSizeshNQ4ISI.setAccessible(true);
            if (java.lang.reflect.Modifier.isStatic(highResolutionOutputSizeshNQ4ISI.getModifiers())) {
                getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, null, composer, java.util.Arrays.copyOf(args, args.length));
            } else {
                getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), composer, java.util.Arrays.copyOf(args, args.length));
            }
        } catch (java.lang.Exception e) {
            androidx.compose.ui.tooling.PreviewLogger.Companion companion = androidx.compose.ui.tooling.PreviewLogger.INSTANCE;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke Composable Method '");
            sb2.append(className);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb2.append(methodName);
            sb2.append('\'');
            androidx.compose.ui.tooling.PreviewLogger.Companion.logWarning$ui_tooling$default(companion, sb2.toString(), null, 2, null);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls, java.lang.String str, java.lang.Object... objArr) {
        java.lang.Class<?> cls2;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = objArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.lang.Object obj = objArr[i];
            cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        java.lang.Class[] clsArr = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]);
        int i2 = 2;
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) java.lang.Math.ceil(length2 / 10.0d);
                java.lang.Class cls3 = java.lang.Integer.TYPE;
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, ceil);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
                java.util.Iterator<java.lang.Integer> it = until.iterator();
                while (it.hasNext()) {
                    ((kotlin.collections.IntIterator) it).nextInt();
                    arrayList2.add(cls3);
                }
                java.lang.Class[] clsArr2 = (java.lang.Class[]) arrayList2.toArray(new java.lang.Class[0]);
                java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
                kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
                spreadBuilder.addSpread(clsArr);
                spreadBuilder.add(androidx.compose.runtime.Composer.class);
                spreadBuilder.addSpread(clsArr2);
                java.lang.Class[] clsArr3 = (java.lang.Class[]) spreadBuilder.toArray(new java.lang.Class[spreadBuilder.size()]);
                int length3 = declaredMethods.length;
                int i3 = 0;
                loop2: while (true) {
                    if (i3 >= length3) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods[i3];
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str, method2.getName())) {
                        java.lang.String name2 = method2.getName();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append('-');
                        if (!kotlin.text.StringsKt.startsWith$default(name2, sb.toString(), z2, i2, (java.lang.Object) cls2)) {
                            continue;
                            i3++;
                            i2 = 2;
                            z2 = false;
                            cls2 = null;
                        }
                    }
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    java.lang.Class<?>[] clsArr4 = (java.lang.Class[]) java.util.Arrays.copyOf(clsArr3, clsArr3.length);
                    if (parameterTypes.length == clsArr4.length) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(parameterTypes.length);
                        int length4 = parameterTypes.length;
                        ?? r16 = z2;
                        for (?? r15 = r15; r15 < length4; r15++) {
                            java.lang.Class<?> cls4 = parameterTypes[r15];
                            java.lang.Class<?> cls5 = clsArr4[r16];
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls4), kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls5)) && !cls4.isAssignableFrom(cls5)) {
                                z = false;
                                arrayList3.add(java.lang.Boolean.valueOf(z));
                                r16++;
                            }
                            z = true;
                            arrayList3.add(java.lang.Boolean.valueOf(z));
                            r16++;
                        }
                        java.util.ArrayList arrayList4 = arrayList3;
                        if (!arrayList4.isEmpty()) {
                            java.util.Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                if (!((java.lang.Boolean) it2.next()).booleanValue()) {
                                    break;
                                }
                            }
                            break loop2;
                        }
                        break;
                    }
                    continue;
                    i3++;
                    i2 = 2;
                    z2 = false;
                    cls2 = null;
                }
                if (method2 != null) {
                    return method2;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" not found");
                throw new java.lang.NoSuchMethodException(sb2.toString());
            } catch (java.lang.ReflectiveOperationException unused) {
                method = null;
                return method;
            }
        } catch (java.lang.ReflectiveOperationException unused2) {
            for (java.lang.reflect.Method method3 : cls.getDeclaredMethods()) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), str)) {
                    java.lang.String name3 = method3.getName();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(str);
                    sb3.append('-');
                    method = null;
                    try {
                        if (!kotlin.text.StringsKt.startsWith$default(name3, sb3.toString(), false, 2, (java.lang.Object) null)) {
                        }
                    } catch (java.lang.ReflectiveOperationException unused3) {
                        return method;
                    }
                }
                return method3;
            }
            method = null;
            return method;
        }
    }
}
