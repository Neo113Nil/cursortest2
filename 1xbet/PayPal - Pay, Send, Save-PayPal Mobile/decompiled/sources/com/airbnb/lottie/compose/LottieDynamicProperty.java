package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB8\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001d\u0010\f\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0007\u0010\rR1\u0010\f\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00028\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "T", "", "property", "Lcom/airbnb/lottie/model/KeyPath;", "keyPath", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", com.sun.jna.Callback.METHOD_NAME, "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getCallback$lottie_compose_release", "()Lkotlin/jvm/functions/Function1;", "Lcom/airbnb/lottie/model/KeyPath;", "getKeyPath$lottie_compose_release", "()Lcom/airbnb/lottie/model/KeyPath;", "Ljava/lang/Object;", "getProperty$lottie_compose_release", "()Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieDynamicProperty<T> {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<com.airbnb.lottie.value.LottieFrameInfo<T>, T> callback;
    private final com.airbnb.lottie.model.KeyPath keyPath;
    private final T property;

    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicProperty(T t, com.airbnb.lottie.model.KeyPath keyPath, kotlin.jvm.functions.Function1<? super com.airbnb.lottie.value.LottieFrameInfo<T>, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyPath, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.property = t;
        this.keyPath = keyPath;
        this.callback = function1;
    }

    public final T getProperty$lottie_compose_release() {
        return this.property;
    }

    /* renamed from: getKeyPath$lottie_compose_release, reason: from getter */
    public final com.airbnb.lottie.model.KeyPath getKeyPath() {
        return this.keyPath;
    }

    public final kotlin.jvm.functions.Function1<com.airbnb.lottie.value.LottieFrameInfo<T>, T> getCallback$lottie_compose_release() {
        return this.callback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieDynamicProperty(T t, com.airbnb.lottie.model.KeyPath keyPath, final T t2) {
        this((java.lang.Object) t, keyPath, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.airbnb.lottie.value.LottieFrameInfo<T>, T>() { // from class: com.airbnb.lottie.compose.LottieDynamicProperty.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final T invoke(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lottieFrameInfo, "");
                return t2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyPath, "");
    }
}
