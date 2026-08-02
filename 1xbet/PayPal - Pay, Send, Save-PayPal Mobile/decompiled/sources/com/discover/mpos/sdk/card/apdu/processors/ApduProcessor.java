package com.discover.mpos.sdk.card.apdu.processors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "T", "E", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduErrorProcessor;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ApduProcessor<T, E extends com.discover.mpos.sdk.card.apdu.error.ApduError> extends com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<T>, com.discover.mpos.sdk.card.apdu.processors.ApduErrorProcessor<E> {
}
