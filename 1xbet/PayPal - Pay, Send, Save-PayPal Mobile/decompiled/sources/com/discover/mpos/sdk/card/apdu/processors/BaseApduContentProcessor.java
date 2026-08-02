package com.discover.mpos.sdk.card.apdu.processors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0004J\u001e\u0010\u0006\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\u0006\u0010\t\u001a\u00020\nH\u0004J\u0017\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/BaseApduContentProcessor;", "Result", "ChildResult", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;", "childProcessor", "(Lcom/discover/mpos/sdk/card/apdu/processors/ApduContentProcessor;)V", "extractData", "", "source", "tag", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "", "processChildData", "([B)Ljava/lang/Object;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public abstract class BaseApduContentProcessor<Result, ChildResult> implements com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<Result> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<ChildResult> f2950a;

    public BaseApduContentProcessor(com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<ChildResult> apduContentProcessor) {
        this.f2950a = apduContentProcessor;
    }

    public /* synthetic */ BaseApduContentProcessor() {
        this(null);
    }

    protected final ChildResult b(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor<ChildResult> apduContentProcessor = this.f2950a;
        if (apduContentProcessor != null) {
            return apduContentProcessor.a(bArr);
        }
        return null;
    }

    protected static com.discover.mpos.sdk.core.emv.tlv.Tlv a(java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), str)) {
                break;
            }
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) obj;
        return tlv == null ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(str, null, 0, 0, 14, null) : tlv;
    }
}
