package com.paypal.oslo.core.network.rest.adapter;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/network/rest/adapter/EitherCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "p0", "<init>", "(Ljava/util/Set;)V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/CallAdapter;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EitherCallAdapterFactory extends retrofit2.CallAdapter.Factory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.rest.adapter.EitherCallAdapterFactory.Companion INSTANCE = new com.paypal.oslo.core.network.rest.adapter.EitherCallAdapterFactory.Companion(null);
    private final java.util.Set<com.paypal.oslo.core.network.http.error.NetworkErrorMapper> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    private EitherCallAdapterFactory(java.util.Set<? extends com.paypal.oslo.core.network.http.error.NetworkErrorMapper> set) {
        this.getHighSpeedVideoFpsRanges = set;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type returnType, java.lang.annotation.Annotation[] annotations, retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Class<?> rawType = retrofit2.CallAdapter.Factory.getRawType(returnType);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(rawType, retrofit2.Call.class) && !kotlin.jvm.internal.Intrinsics.areEqual(rawType, kotlinx.coroutines.Deferred.class)) {
            return null;
        }
        java.lang.reflect.ParameterizedType parameterizedType = returnType instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) returnType : null;
        if (parameterizedType == null) {
            return null;
        }
        java.lang.reflect.Type parameterUpperBound = retrofit2.CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
        if (!(parameterUpperBound instanceof java.lang.reflect.ParameterizedType) || !kotlin.jvm.internal.Intrinsics.areEqual(retrofit2.CallAdapter.Factory.getRawType(parameterUpperBound), arrow.core.Either.class)) {
            return null;
        }
        java.lang.reflect.Type parameterUpperBound2 = retrofit2.CallAdapter.Factory.getParameterUpperBound(1, (java.lang.reflect.ParameterizedType) parameterUpperBound);
        java.lang.Class<?> rawType2 = retrofit2.CallAdapter.Factory.getRawType(parameterUpperBound2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(parameterUpperBound2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(rawType2);
        return new com.paypal.oslo.core.network.rest.adapter.EitherCallAdapter(parameterUpperBound2, rawType2, this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/network/rest/adapter/EitherCallAdapterFactory$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "errorMappers", "Lcom/paypal/oslo/core/network/rest/adapter/EitherCallAdapterFactory;", "create", "(Ljava/util/Set;)Lcom/paypal/oslo/core/network/rest/adapter/EitherCallAdapterFactory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.network.rest.adapter.EitherCallAdapterFactory create(java.util.Set<? extends com.paypal.oslo.core.network.http.error.NetworkErrorMapper> errorMappers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMappers, "");
            return new com.paypal.oslo.core.network.rest.adapter.EitherCallAdapterFactory(errorMappers, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EitherCallAdapterFactory(java.util.Set set, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set);
    }
}
