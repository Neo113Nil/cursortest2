package com.paypal.oslo.core.network.rest.adapter;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u00030\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/network/rest/adapter/EitherCallAdapter;", "Lretrofit2/CallAdapter;", "Ljava/lang/reflect/Type;", "Lretrofit2/Call;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "paramType", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "errorMappers", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;)V", "responseType", "()Ljava/lang/reflect/Type;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "adapt", "(Lretrofit2/Call;)Lretrofit2/Call;", "Camera2StreamConfigurationMap", "Ljava/lang/reflect/Type;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EitherCallAdapter implements retrofit2.CallAdapter<java.lang.reflect.Type, retrofit2.Call<arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends java.lang.reflect.Type>>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.reflect.Type getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<com.paypal.oslo.core.network.http.error.NetworkErrorMapper> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public EitherCallAdapter(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.util.Set<? extends com.paypal.oslo.core.network.http.error.NetworkErrorMapper> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.getHighSpeedVideoFpsRangesFor = type2;
        this.getHighSpeedVideoSizes = set;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType, reason: from getter */
    public final java.lang.reflect.Type getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // retrofit2.CallAdapter
    public final retrofit2.Call<arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends java.lang.reflect.Type>> adapt(retrofit2.Call<java.lang.reflect.Type> call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        return new com.paypal.oslo.core.network.rest.adapter.EitherCall(call, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }
}
