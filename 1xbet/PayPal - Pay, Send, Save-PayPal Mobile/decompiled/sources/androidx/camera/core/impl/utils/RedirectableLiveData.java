package androidx.camera.core.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/camera/core/impl/utils/RedirectableLiveData;", "T", "Landroidx/camera/core/impl/utils/MappingRedirectableLiveData;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RedirectableLiveData<T> extends androidx.camera.core.impl.utils.MappingRedirectableLiveData<T, T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    /* renamed from: $r8$lambda$hUN_yGnBCuf0W2kN-hVfETioGEc, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1013$r8$lambda$hUN_yGnBCuf0W2kNhVfETioGEc(java.lang.Object obj) {
        return obj;
    }

    public RedirectableLiveData(T t) {
        super(t, new androidx.arch.core.util.Function() { // from class: androidx.camera.core.impl.utils.RedirectableLiveData$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.camera.core.impl.utils.RedirectableLiveData.m1013$r8$lambda$hUN_yGnBCuf0W2kNhVfETioGEc(obj);
            }
        });
        this.Camera2StreamConfigurationMap = t;
    }
}
