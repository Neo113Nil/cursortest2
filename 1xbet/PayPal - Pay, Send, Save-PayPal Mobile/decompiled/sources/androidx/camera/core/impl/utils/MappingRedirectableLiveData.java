package androidx.camera.core.impl.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u000b\"\u0004\b\u0002\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/lifecycle/MediatorLiveData;", "initialValue", "Landroidx/arch/core/util/Function;", "mapFunction", "<init>", "(Ljava/lang/Object;Landroidx/arch/core/util/Function;)V", "Landroidx/lifecycle/LiveData;", "liveDataSource", "", "redirectTo", "(Landroidx/lifecycle/LiveData;)V", "S", "source", "Landroidx/lifecycle/Observer;", "onChanged", "addSource", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Observer;)V", "getValue", "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/arch/core/util/Function;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/LiveData;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class MappingRedirectableLiveData<I, O> extends androidx.view.MediatorLiveData<O> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.view.LiveData<I> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.arch.core.util.Function<I, O> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final O getHighSpeedVideoFpsRangesFor;

    public MappingRedirectableLiveData(O o2, androidx.arch.core.util.Function<I, O> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        this.getHighSpeedVideoFpsRangesFor = o2;
        this.getHighSpeedVideoSizes = function;
    }

    public final void redirectTo(final androidx.view.LiveData<I> liveDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveDataSource, "");
        final androidx.view.LiveData<I> liveData = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = liveDataSource;
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.utils.MappingRedirectableLiveData.m1010$r8$lambda$Mai21w6kwaYvKf_P7wHfqtfhBk(androidx.view.LiveData.this, this, liveDataSource);
            }
        });
    }

    @Override // androidx.view.MediatorLiveData
    public <S> void addSource(androidx.view.LiveData<S> source, androidx.view.Observer<? super S> onChanged) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onChanged, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.view.LiveData
    public O getValue() {
        androidx.view.LiveData<I> liveData = this.Camera2StreamConfigurationMap;
        if (liveData == null) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return this.getHighSpeedVideoSizes.apply(liveData.getValue());
    }

    /* renamed from: $r8$lambda$Mai21w6k-waYvKf_P7wHfqtfhBk, reason: not valid java name */
    public static /* synthetic */ void m1010$r8$lambda$Mai21w6kwaYvKf_P7wHfqtfhBk(androidx.view.LiveData liveData, final androidx.camera.core.impl.utils.MappingRedirectableLiveData mappingRedirectableLiveData, androidx.view.LiveData liveData2) {
        if (liveData != null) {
            super.removeSource(liveData);
        }
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.core.impl.utils.MappingRedirectableLiveData.m1012$r8$lambda$s04I6y043cH2vjyeFwQEiqxzSs(androidx.camera.core.impl.utils.MappingRedirectableLiveData.this, obj);
            }
        };
        super.addSource(liveData2, new androidx.view.Observer() { // from class: androidx.camera.core.impl.utils.MappingRedirectableLiveData$$ExternalSyntheticLambda1
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        });
    }

    /* renamed from: $r8$lambda$s04I6y043cH2vjyeFwQEiqx-zSs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1012$r8$lambda$s04I6y043cH2vjyeFwQEiqxzSs(androidx.camera.core.impl.utils.MappingRedirectableLiveData mappingRedirectableLiveData, java.lang.Object obj) {
        mappingRedirectableLiveData.setValue(mappingRedirectableLiveData.getHighSpeedVideoSizes.apply(obj));
        return kotlin.Unit.INSTANCE;
    }
}
