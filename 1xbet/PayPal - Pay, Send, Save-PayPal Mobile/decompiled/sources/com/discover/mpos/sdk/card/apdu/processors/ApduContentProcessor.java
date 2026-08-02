package com.discover.mpos.sdk.card.apdu.processors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "T", "", "processContent", "content", "", "([B)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ApduContentProcessor<T> {
    T a(byte[] bArr);
}
