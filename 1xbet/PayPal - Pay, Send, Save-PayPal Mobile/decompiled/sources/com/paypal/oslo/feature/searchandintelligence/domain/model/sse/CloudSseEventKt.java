package com.paypal.oslo.feature.searchandintelligence.domain.model.sse;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventRaw;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;", "toCloudSseEvent", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventRaw;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloudSseEventKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent toCloudSseEvent(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventRaw cloudSseEventRaw) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSseEventRaw, "");
        java.lang.String type = cloudSseEventRaw.getType();
        switch (type.hashCode()) {
            case -1150767761:
                if (type.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.TYPE_PROCESSING)) {
                    return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Processing(cloudSseEventRaw.getId(), cloudSseEventRaw.getSource());
                }
                break;
            case -345293713:
                if (type.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.TYPE_COMPLETED)) {
                    return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Completed(cloudSseEventRaw.getId(), cloudSseEventRaw.getSource());
                }
                break;
            case -342269151:
                if (type.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.TYPE_COMPONENT)) {
                    java.lang.String id = cloudSseEventRaw.getId();
                    java.lang.String source = cloudSseEventRaw.getSource();
                    java.lang.Integer sequence = cloudSseEventRaw.getSequence();
                    int intValue = sequence != null ? sequence.intValue() : 0;
                    java.lang.Boolean finalEvent = cloudSseEventRaw.getFinalEvent();
                    boolean booleanValue = finalEvent != null ? finalEvent.booleanValue() : false;
                    com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData data = cloudSseEventRaw.getData();
                    if (data == null) {
                        data = new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData((java.util.List) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }
                    return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Component(id, source, intValue, booleanValue, data);
                }
                break;
            case 861454245:
                if (type.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.TYPE_STARTED)) {
                    return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Started(cloudSseEventRaw.getId(), cloudSseEventRaw.getSource());
                }
                break;
            case 1359989292:
                if (type.equals(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.TYPE_ERROR)) {
                    return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEvent.Error(cloudSseEventRaw.getId(), cloudSseEventRaw.getSource());
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Unknown event type: ".concat(java.lang.String.valueOf(cloudSseEventRaw.getType())));
    }
}
