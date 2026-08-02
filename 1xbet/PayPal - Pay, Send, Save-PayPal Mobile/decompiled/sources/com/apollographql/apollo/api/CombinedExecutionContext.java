package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/api/CombinedExecutionContext;", "Lcom/apollographql/apollo/api/ExecutionContext;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "element", "<init>", "(Lcom/apollographql/apollo/api/ExecutionContext;Lcom/apollographql/apollo/api/ExecutionContext$Element;)V", "E", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "get", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "(Lcom/apollographql/apollo/api/ExecutionContext$Key;)Lcom/apollographql/apollo/api/ExecutionContext;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/api/ExecutionContext;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CombinedExecutionContext implements com.apollographql.apollo.api.ExecutionContext {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.ExecutionContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.ExecutionContext.Element getHighSpeedVideoFpsRanges;

    public CombinedExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext, com.apollographql.apollo.api.ExecutionContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        this.Camera2StreamConfigurationMap = executionContext;
        this.getHighSpeedVideoFpsRanges = element;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final <E extends com.apollographql.apollo.api.ExecutionContext.Element> E get(com.apollographql.apollo.api.ExecutionContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.apollographql.apollo.api.CombinedExecutionContext combinedExecutionContext = this;
        while (true) {
            E e = (E) combinedExecutionContext.getHighSpeedVideoFpsRanges.get(key);
            if (e != null) {
                return e;
            }
            com.apollographql.apollo.api.ExecutionContext executionContext = combinedExecutionContext.Camera2StreamConfigurationMap;
            if (executionContext instanceof com.apollographql.apollo.api.CombinedExecutionContext) {
                combinedExecutionContext = (com.apollographql.apollo.api.CombinedExecutionContext) executionContext;
            } else {
                return (E) executionContext.get(key);
            }
        }
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super com.apollographql.apollo.api.ExecutionContext.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        return operation.invoke((java.lang.Object) this.Camera2StreamConfigurationMap.fold(initial, operation), this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final com.apollographql.apollo.api.ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (this.getHighSpeedVideoFpsRanges.get(key) != null) {
            return this.Camera2StreamConfigurationMap;
        }
        com.apollographql.apollo.api.ExecutionContext minusKey = this.Camera2StreamConfigurationMap.minusKey(key);
        return minusKey == this.Camera2StreamConfigurationMap ? this : minusKey == com.apollographql.apollo.api.EmptyExecutionContext.INSTANCE ? this.getHighSpeedVideoFpsRanges : new com.apollographql.apollo.api.CombinedExecutionContext(minusKey, this.getHighSpeedVideoFpsRanges);
    }
}
