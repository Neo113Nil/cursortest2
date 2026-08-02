package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0007HÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0019H\u0016J\u0006\u0010\"\u001a\u00020\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discover/mpos/sdk/data/WriteDataStorageTemplate;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "content", "", "(Ljava/lang/String;)V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "", "([B)V", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "getCardFeatureDescriptor", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardFeatureVersionNumber", "getCardFeatureVersionNumber", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "contentAsTlvs", "", "dataStoreDataObjects", "getDataStoreDataObjects", "()Ljava/util/List;", "isAvailable", "", "()Z", "oneOccurrence", "", "clear", "", "component1", "copy", "equals", "other", "", "hashCode", "isOneInstance", "toByteArray", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.g, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class WriteDataStorageTemplate implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    public final int f3217a;
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> b;
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> c;
    public final boolean d;
    private final byte[] e;

    public /* synthetic */ WriteDataStorageTemplate() {
        this(new byte[0]);
    }

    public WriteDataStorageTemplate(byte[] bArr) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.e = bArr;
        this.f3217a = 1;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.split$default(bArr, false, false, 3, null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list = (java.util.List) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? kotlin.collections.CollectionsKt.emptyList() : m23436constructorimpl);
        this.b = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag(), com.discover.mpos.sdk.core.emv.tlv.Tag.DATA_STORE.getTag())) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        this.d = (this.e.length == 0 || this.b.isEmpty()) ? false : true;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray, reason: from getter */
    public final byte[] getE() {
        return this.e;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.data.WriteDataStorageTemplate");
        }
        com.discover.mpos.sdk.data.WriteDataStorageTemplate writeDataStorageTemplate = (com.discover.mpos.sdk.data.WriteDataStorageTemplate) other;
        return java.util.Arrays.equals(this.e, writeDataStorageTemplate.e) && this.d == writeDataStorageTemplate.d;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.e) * 31) + java.lang.Boolean.hashCode(this.d);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WriteDataStorageTemplate(content=");
        sb.append(java.util.Arrays.toString(this.e));
        sb.append(")");
        return sb.toString();
    }
}
