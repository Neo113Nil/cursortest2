package androidx.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "getHighSpeedVideoSizes", "Lkotlin/reflect/KClass;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends androidx.view.ViewModel> implements kotlin.Lazy<VM> {
    private final kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function0<androidx.view.ViewModelStore> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private VM getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<VM> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(kotlin.reflect.KClass<VM> kClass, kotlin.jvm.functions.Function0<? extends androidx.view.ViewModelStore> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        this.getHighSpeedVideoFpsRangesFor = kClass;
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighSpeedVideoSizes = function03;
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function0, function02, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.ViewModelLazy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                return empty;
            }
        } : function03);
    }

    @Override // kotlin.Lazy
    public final VM getValue() {
        VM vm = this.getHighResolutionOutputSizeshNQ4ISI;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) androidx.view.ViewModelProvider.INSTANCE.create(this.getHighSpeedVideoFpsRanges.invoke(), this.Camera2StreamConfigurationMap.invoke(), this.getHighSpeedVideoSizes.invoke()).get(this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = vm2;
        return vm2;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(kotlin.reflect.KClass<VM> kClass, kotlin.jvm.functions.Function0<? extends androidx.view.ViewModelStore> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        this(kClass, function0, function02, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
    }
}
