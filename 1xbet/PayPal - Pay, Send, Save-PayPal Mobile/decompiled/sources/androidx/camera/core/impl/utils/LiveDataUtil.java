package androidx.camera.core.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/core/impl/utils/LiveDataUtil;", "", "<init>", "()V", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/lifecycle/LiveData;", "source", "Landroidx/arch/core/util/Function;", "mapFunction", "map", "(Landroidx/lifecycle/LiveData;Landroidx/arch/core/util/Function;)Landroidx/lifecycle/LiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveDataUtil {
    public static final androidx.camera.core.impl.utils.LiveDataUtil INSTANCE = new androidx.camera.core.impl.utils.LiveDataUtil();

    private LiveDataUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final <I, O> androidx.view.LiveData<O> map(androidx.view.LiveData<I> source, androidx.arch.core.util.Function<I, O> mapFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapFunction, "");
        androidx.camera.core.impl.utils.MappingRedirectableLiveData mappingRedirectableLiveData = new androidx.camera.core.impl.utils.MappingRedirectableLiveData(mapFunction.apply(source.getValue()), mapFunction);
        mappingRedirectableLiveData.redirectTo(source);
        return mappingRedirectableLiveData;
    }
}
