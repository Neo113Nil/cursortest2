package androidx.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "argumentProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "getHighSpeedVideoFpsRanges", "Lkotlin/reflect/KClass;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/navigation/NavArgs;", "getHighResolutionOutputSizeshNQ4ISI", "getValue", "()Landroidx/navigation/NavArgs;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavArgsLazy<Args extends androidx.view.NavArgs> implements kotlin.Lazy<Args> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<android.os.Bundle> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<Args> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private Args getHighResolutionOutputSizeshNQ4ISI;

    public NavArgsLazy(kotlin.reflect.KClass<Args> kClass, kotlin.jvm.functions.Function0<android.os.Bundle> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = kClass;
        this.getHighSpeedVideoSizes = function0;
    }

    @Override // kotlin.Lazy
    public final Args getValue() {
        Args args = this.getHighResolutionOutputSizeshNQ4ISI;
        if (args != null) {
            return args;
        }
        android.os.Bundle invoke = this.getHighSpeedVideoSizes.invoke();
        java.lang.reflect.Method method = androidx.view.NavArgsLazy_androidKt.getMethodMap().get(this.Camera2StreamConfigurationMap);
        if (method == null) {
            java.lang.Class javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) this.Camera2StreamConfigurationMap);
            java.lang.Class<android.os.Bundle>[] methodSignature = androidx.view.NavArgsLazy_androidKt.getMethodSignature();
            method = javaClass.getMethod("fromBundle", (java.lang.Class[]) java.util.Arrays.copyOf(methodSignature, methodSignature.length));
            androidx.view.NavArgsLazy_androidKt.getMethodMap().put(this.Camera2StreamConfigurationMap, method);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(method, "");
        }
        java.lang.Object invoke2 = method.invoke(null, invoke);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke2, "");
        Args args2 = (Args) invoke2;
        this.getHighResolutionOutputSizeshNQ4ISI = args2;
        return args2;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }
}
