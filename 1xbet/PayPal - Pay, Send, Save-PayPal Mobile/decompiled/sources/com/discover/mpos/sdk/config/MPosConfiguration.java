package com.discover.mpos.sdk.config;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/discover/mpos/sdk/config/MPosConfiguration;", "", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "readerConfiguration", "<init>", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;)V", "component1", "()Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "copy", "(Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;)Lcom/discover/mpos/sdk/config/MPosConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "getReaderConfiguration"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class MPosConfiguration {
    private final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration;

    public MPosConfiguration(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        this.readerConfiguration = readerConfiguration;
    }

    public final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration getReaderConfiguration() {
        return this.readerConfiguration;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration = this.readerConfiguration;
        if (readerConfiguration != null) {
            return readerConfiguration.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.config.MPosConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.readerConfiguration, ((com.discover.mpos.sdk.config.MPosConfiguration) other).readerConfiguration);
        }
        return true;
    }

    public final com.discover.mpos.sdk.config.MPosConfiguration copy(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerConfiguration, "");
        return new com.discover.mpos.sdk.config.MPosConfiguration(readerConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration getReaderConfiguration() {
        return this.readerConfiguration;
    }

    public static /* synthetic */ com.discover.mpos.sdk.config.MPosConfiguration copy$default(com.discover.mpos.sdk.config.MPosConfiguration mPosConfiguration, com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            readerConfiguration = mPosConfiguration.readerConfiguration;
        }
        return mPosConfiguration.copy(readerConfiguration);
    }
}
