package com.discover.mpos.sdk.card.apdu.getdata;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/getdata/GetDataResponseContent;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)V", "getData", "()[B", "clear", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class GetDataResponseContent implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2944a;

    public GetDataResponseContent(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f2944a = bArr;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.f2944a);
    }
}
