package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\b\u0080\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AidKernelIdMaps;", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "kernelId", "", "(Ljava/lang/String;ILjava/lang/String;[B)V", "getAid", "()Ljava/lang/String;", "getKernelId", "()[B", "AMERICAN_EXPRESS", "DISCOVER", "JCB", "MASTER_CARD", "UNION_PAY", "VISA", "OTHER", "Companion", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public enum AidKernelIdMaps {
    AMERICAN_EXPRESS("A000000025", new byte[]{4}),
    DISCOVER("A000000152", new byte[]{6}),
    JCB("A000000065", new byte[]{5}),
    MASTER_CARD("A000000004", new byte[]{2}),
    UNION_PAY("A000000333", new byte[]{7}),
    VISA("A000000003", new byte[]{3}),
    OTHER("", new byte[0]);

    public static final com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.a j = new com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.a(0);
    final java.lang.String h;
    final byte[] i;

    AidKernelIdMaps(java.lang.String str, byte[] bArr) {
        this.h = str;
        this.i = bArr;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AidKernelIdMaps$Companion;", "", "()V", "valueForAid", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/AidKernelIdMaps;", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps a(java.lang.String str) {
            com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps aidKernelIdMaps;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps[] values = com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.values();
            int length = values.length;
            int i = 0;
            while (true) {
                aidKernelIdMaps = null;
                if (i >= length) {
                    break;
                }
                com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps aidKernelIdMaps2 = values[i];
                if (kotlin.text.StringsKt.startsWith$default(str, aidKernelIdMaps2.h, false, 2, (java.lang.Object) null)) {
                    aidKernelIdMaps = aidKernelIdMaps2;
                    break;
                }
                i++;
            }
            return aidKernelIdMaps == null ? com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.OTHER : aidKernelIdMaps;
        }
    }
}
