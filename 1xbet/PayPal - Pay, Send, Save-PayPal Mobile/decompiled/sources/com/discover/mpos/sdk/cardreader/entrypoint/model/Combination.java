package com.discover.mpos.sdk.cardreader.entrypoint.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\b\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\b\n\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "", "kernelID", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "aid$1", "getKernelID", "kernelID$1", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.model.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class Combination {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3009a;
    public final java.lang.String b;
    public static final com.discover.mpos.sdk.cardreader.entrypoint.model.Combination.a d = new com.discover.mpos.sdk.cardreader.entrypoint.model.Combination.a(0);
    private static final java.lang.String e = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER;
    private static final java.lang.String f = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_DISCOVER_A0000001523010;
    static final com.discover.mpos.sdk.cardreader.entrypoint.model.Combination c = new com.discover.mpos.sdk.cardreader.entrypoint.model.Combination(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_DISCOVER, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_DISCOVER_A0000001523010);

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination$Companion;", "", "()V", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "getDefault", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "kernelID", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.model.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public Combination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.f3009a = str;
        this.b = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Combination(kernelID=");
        sb.append(this.f3009a);
        sb.append(", aid=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.f3009a;
        int hashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.entrypoint.model.Combination)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.entrypoint.model.Combination combination = (com.discover.mpos.sdk.cardreader.entrypoint.model.Combination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3009a, combination.f3009a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, combination.b);
    }
}
