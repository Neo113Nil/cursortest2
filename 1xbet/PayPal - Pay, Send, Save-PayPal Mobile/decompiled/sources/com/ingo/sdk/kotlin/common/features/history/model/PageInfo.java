package com.ingo.sdk.kotlin.common.features.history.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "pageNumber", "pageSize", "<init>", "(III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getTotalCount", "getPageNumber", "getPageSize", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class PageInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.history.model.PageInfo.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.history.model.PageInfo.Companion(null);
    private final int pageNumber;
    private final int pageSize;
    private final int totalCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/history/model/PageInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.history.model.PageInfo> serializer() {
            return com.ingo.sdk.kotlin.common.features.history.model.PageInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PageInfo(int i, int i2, int i3, int i4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.ingo.sdk.kotlin.common.features.history.model.PageInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.totalCount = i2;
        this.pageNumber = i3;
        this.pageSize = i4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.history.model.PageInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.totalCount);
        output.encodeIntElement(serialDesc, 1, self.pageNumber);
        output.encodeIntElement(serialDesc, 2, self.pageSize);
    }

    public PageInfo(int i, int i2, int i3) {
        this.totalCount = i;
        this.pageNumber = i2;
        this.pageSize = i3;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final java.lang.String toString() {
        int i = this.totalCount;
        int i2 = this.pageNumber;
        int i3 = this.pageSize;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PageInfo(totalCount=");
        sb.append(i);
        sb.append(", pageNumber=");
        sb.append(i2);
        sb.append(", pageSize=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.totalCount) * 31) + java.lang.Integer.hashCode(this.pageNumber)) * 31) + java.lang.Integer.hashCode(this.pageSize);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.history.model.PageInfo)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo = (com.ingo.sdk.kotlin.common.features.history.model.PageInfo) other;
        return this.totalCount == pageInfo.totalCount && this.pageNumber == pageInfo.pageNumber && this.pageSize == pageInfo.pageSize;
    }

    public final com.ingo.sdk.kotlin.common.features.history.model.PageInfo copy(int totalCount, int pageNumber, int pageSize) {
        return new com.ingo.sdk.kotlin.common.features.history.model.PageInfo(totalCount, pageNumber, pageSize);
    }

    /* renamed from: component3, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.history.model.PageInfo copy$default(com.ingo.sdk.kotlin.common.features.history.model.PageInfo pageInfo, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = pageInfo.totalCount;
        }
        if ((i4 & 2) != 0) {
            i2 = pageInfo.pageNumber;
        }
        if ((i4 & 4) != 0) {
            i3 = pageInfo.pageSize;
        }
        return pageInfo.copy(i, i2, i3);
    }
}
