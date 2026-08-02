package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004:\u0001)B=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "Lkotlinx/serialization/KSerializer;", "p1", "", "p2", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p3", "Lkotlin/Function0;", "p4", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/reflect/KProperty;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "saveState", "()Landroid/os/Bundle;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoSizes", "getOutputFormats", "Lkotlinx/serialization/KSerializer;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "getOutputMinFrameDuration", "UNINITIALIZED"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SavedStateHandleDelegate<T> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T>, androidx.savedstate.SavedStateRegistry.SavedStateProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.serialization.SavedStateConfiguration Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleDelegate(androidx.view.SavedStateHandle savedStateHandle, kotlinx.serialization.KSerializer<T> kSerializer, java.lang.String str, androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = savedStateHandle;
        this.getHighSpeedVideoFpsRanges = kSerializer;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = savedStateConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getOutputMinFrameDuration = androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate$UNINITIALIZED;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class UNINITIALIZED {
        public static final androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED INSTANCE = new androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED();

        private UNINITIALIZED() {
        }
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final T getValue(java.lang.Object p0, kotlin.reflect.KProperty<?> p1) {
        java.lang.Object decodeFromSavedStateNullable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED.INSTANCE)) {
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, p1);
            this.getHighSpeedVideoSizes.setSavedStateProvider(highSpeedVideoFpsRangesFor, this);
            android.os.Bundle bundle = (android.os.Bundle) this.getHighSpeedVideoSizes.get(highSpeedVideoFpsRangesFor);
            if (bundle == null) {
                decodeFromSavedStateNullable = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else {
                kotlinx.serialization.KSerializer<T> kSerializer = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "");
                decodeFromSavedStateNullable = androidx.view.serialization.SavedStateDecoderKt.decodeFromSavedStateNullable(kSerializer, bundle, this.Camera2StreamConfigurationMap);
            }
            this.getOutputMinFrameDuration = decodeFromSavedStateNullable;
        }
        return (T) this.getOutputMinFrameDuration;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(java.lang.Object p0, kotlin.reflect.KProperty<?> p1, T p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED.INSTANCE)) {
            this.getHighSpeedVideoSizes.setSavedStateProvider(getHighSpeedVideoFpsRangesFor(p0, p1), this);
        }
        this.getOutputMinFrameDuration = p2;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final android.os.Bundle saveState() {
        kotlin.Pair[] pairArr;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, androidx.lifecycle.serialization.SavedStateHandleDelegate.UNINITIALIZED.INSTANCE)) {
            return androidx.view.serialization.SavedStateEncoderKt.encodeToSavedStateNullable(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap);
        }
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        return bundleOf;
    }

    private final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.Object p0, kotlin.reflect.KProperty<?> p1) {
        java.lang.String str;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        if (str2 != null) {
            return str2;
        }
        if (p0 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(androidx.view.internal.CanonicalName_jvmKt.getCanonicalName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass())));
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            str = sb.toString();
        } else {
            str = "";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(p1.getGetHighSpeedVideoFpsRanges());
        return sb2.toString();
    }
}
