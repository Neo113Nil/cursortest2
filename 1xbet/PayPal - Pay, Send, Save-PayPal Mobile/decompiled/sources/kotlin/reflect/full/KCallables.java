package kotlin.reflect.full;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\"!\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"!\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010\"%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\f\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001c\u0010\u0016"}, d2 = {"Lkotlin/reflect/KCallable;", "", "name", "Lkotlin/reflect/KParameter;", "findParameterByName", "(Lkotlin/reflect/KCallable;Ljava/lang/String;)Lkotlin/reflect/KParameter;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "", "args", "callSuspend", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callSuspendBy", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstanceParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "getInstanceParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "instanceParameter", "", "getContextParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "getContextParameters$annotations", "contextParameters", "getExtensionReceiverParameter", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "getValueParameters", "getValueParameters$annotations", "valueParameters"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KCallables {
    public static /* synthetic */ void getContextParameters$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static /* synthetic */ void getExtensionReceiverParameter$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static /* synthetic */ void getInstanceParameter$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static /* synthetic */ void getValueParameters$annotations(kotlin.reflect.KCallable kCallable) {
    }

    public static final kotlin.reflect.KParameter getInstanceParameter(kotlin.reflect.KCallable<?> kCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        java.util.Iterator<T> it = kCallable.getParameters().iterator();
        boolean z = false;
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((kotlin.reflect.KParameter) next).getKind() == kotlin.reflect.KParameter.Kind.INSTANCE) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (kotlin.reflect.KParameter) obj;
    }

    public static final java.util.List<kotlin.reflect.KParameter> getContextParameters(kotlin.reflect.KCallable<?> kCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        java.util.List<kotlin.reflect.KParameter> parameters = kCallable.getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : parameters) {
            if (((kotlin.reflect.KParameter) obj).getKind() == kotlin.reflect.KParameter.Kind.CONTEXT) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final kotlin.reflect.KParameter getExtensionReceiverParameter(kotlin.reflect.KCallable<?> kCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        java.util.Iterator<T> it = kCallable.getParameters().iterator();
        boolean z = false;
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((kotlin.reflect.KParameter) next).getKind() == kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (kotlin.reflect.KParameter) obj;
    }

    public static final java.util.List<kotlin.reflect.KParameter> getValueParameters(kotlin.reflect.KCallable<?> kCallable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        java.util.List<kotlin.reflect.KParameter> parameters = kCallable.getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : parameters) {
            if (((kotlin.reflect.KParameter) obj).getKind() == kotlin.reflect.KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final kotlin.reflect.KParameter findParameterByName(kotlin.reflect.KCallable<?> kCallable, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kCallable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = kCallable.getParameters().iterator();
        boolean z = false;
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.KParameter) next).getName(), str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (kotlin.reflect.KParameter) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object callSuspend(kotlin.reflect.KCallable<? extends R> kCallable, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.reflect.full.KCallables$callSuspend$1 kCallables$callSuspend$1;
        int i;
        if (continuation instanceof kotlin.reflect.full.KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (kotlin.reflect.full.KCallables$callSuspend$1) continuation;
            if ((kCallables$callSuspend$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = kCallables$callSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kCallables$callSuspend$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.call(java.util.Arrays.copyOf(objArr, objArr.length));
                    }
                    if (!(kCallable instanceof kotlin.reflect.KFunction)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot callSuspend on a property ");
                        sb.append(kCallable);
                        sb.append(": suspend properties are not supported yet");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    kCallables$callSuspend$1.Camera2StreamConfigurationMap = kCallable;
                    kCallables$callSuspend$1.getHighSpeedVideoFpsRanges = objArr;
                    kCallables$callSuspend$1.getHighSpeedVideoSizes = 1;
                    kotlin.reflect.full.KCallables$callSuspend$1 kCallables$callSuspend$12 = kCallables$callSuspend$1;
                    kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
                    spreadBuilder.addSpread(objArr);
                    spreadBuilder.add(kCallables$callSuspend$12);
                    obj = kCallable.call(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
                    if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(kCallables$callSuspend$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kCallable = (kotlin.reflect.KCallable) kCallables$callSuspend$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) kCallable;
                return (kotlin.jvm.internal.Intrinsics.areEqual(kFunction.getReturnType().getClassifier(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class)) || kFunction.getReturnType().isMarkedNullable()) ? obj : kotlin.Unit.INSTANCE;
            }
        }
        kCallables$callSuspend$1 = new kotlin.reflect.full.KCallables$callSuspend$1(continuation);
        java.lang.Object obj2 = kCallables$callSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kCallables$callSuspend$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) kCallable;
        if (kotlin.jvm.internal.Intrinsics.areEqual(kFunction2.getReturnType().getClassifier(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class))) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object callSuspendBy(kotlin.reflect.KCallable<? extends R> kCallable, java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.reflect.full.KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        int i;
        if (continuation instanceof kotlin.reflect.full.KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (kotlin.reflect.full.KCallables$callSuspendBy$1) continuation;
            if ((kCallables$callSuspendBy$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = kCallables$callSuspendBy$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kCallables$callSuspendBy$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.callBy(map);
                    }
                    if (!(kCallable instanceof kotlin.reflect.KFunction)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot callSuspendBy on a property ");
                        sb.append(kCallable);
                        sb.append(": suspend properties are not supported yet");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    kotlin.reflect.jvm.internal.ReflectKCallable<?> asReflectCallable = kotlin.reflect.jvm.internal.UtilKt.asReflectCallable(kCallable);
                    if (asReflectCallable == null) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("This callable does not support a default call: ".concat(java.lang.String.valueOf(kCallable)));
                    }
                    kCallables$callSuspendBy$1.getHighSpeedVideoFpsRangesFor = kCallable;
                    kCallables$callSuspendBy$1.getHighSpeedVideoFpsRanges = map;
                    kCallables$callSuspendBy$1.getHighSpeedVideoSizes = asReflectCallable;
                    kCallables$callSuspendBy$1.Camera2StreamConfigurationMap = 1;
                    kotlin.reflect.full.KCallables$callSuspendBy$1 kCallables$callSuspendBy$12 = kCallables$callSuspendBy$1;
                    obj = asReflectCallable.callDefaultMethod(map, kCallables$callSuspendBy$12);
                    if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(kCallables$callSuspendBy$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kCallable = (kotlin.reflect.KCallable) kCallables$callSuspendBy$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) kCallable;
                return (kotlin.jvm.internal.Intrinsics.areEqual(kFunction.getReturnType().getClassifier(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class)) || kFunction.getReturnType().isMarkedNullable()) ? obj : kotlin.Unit.INSTANCE;
            }
        }
        kCallables$callSuspendBy$1 = new kotlin.reflect.full.KCallables$callSuspendBy$1(continuation);
        java.lang.Object obj2 = kCallables$callSuspendBy$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kCallables$callSuspendBy$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) kCallable;
        if (kotlin.jvm.internal.Intrinsics.areEqual(kFunction2.getReturnType().getClassifier(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class))) {
        }
    }
}
