package com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\f\u0010$\u001a\u00020\u001e*\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/flow/RequestedKernelIdComputationStep;", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/combinationselection/flow/candidatelist/data/BuildCandidateListData;", "()V", "domesticKernelMinimumLength", "", "kernelIdDomesticMask", "", "kernelIdIsZero", "kernelIdMask", "kernelIdMaxSize", "unsupportedKernelIdSize", "computeKernelId", "", "input", "debugTag", "", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "handleCombinationKernelId", "configurationKernelId", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "handleDefaultKernelId", "cardKernelId", "handleDomesticKernelId", "handleInternationalKernelId", "adfValue", "isKernelDomestic", "", "byte", "isKernelInternational", "shouldAidKernelIdMapBeUsed", "kernelId", "shouldConfigurationKernelIdMapBeUsed", "isSizeUnsupported", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.a.b.a.b.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class RequestedKernelIdComputationStep implements com.discover.mpos.sdk.flow.ExecutionStep<com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> {
    private final byte d;

    /* renamed from: a, reason: collision with root package name */
    private final int f2991a = 8;
    private final byte b = Byte.MIN_VALUE;
    private final byte c = Byte.MAX_VALUE;
    private final int e = 3;
    private final int f = 2;

    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData> executionFlow, com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData) {
        byte[] bArr;
        com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.data.BuildCandidateListData buildCandidateListData2 = buildCandidateListData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildCandidateListData2, "");
        byte[] content = buildCandidateListData2.d.c.getContent();
        if (content == null) {
            content = new byte[0];
        }
        java.lang.Byte firstOrNull = kotlin.collections.ArraysKt.firstOrNull(content);
        byte byteValue = firstOrNull != null ? firstOrNull.byteValue() : (byte) 0;
        if (buildCandidateListData2.d.c.getContent() == null && buildCandidateListData2.c.getKernelId().length() > 0) {
            java.lang.String kernelId = buildCandidateListData2.c.getKernelId();
            java.lang.String applicationIdentifier = buildCandidateListData2.c.getApplicationIdentifier();
            content = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(kernelId);
            new java.lang.Object[]{content, applicationIdentifier};
        } else {
            if (content.length == 0 || content.length == this.f || content.length > this.f2991a || kotlin.collections.ArraysKt.first(content) == this.d) {
                java.lang.String applicationIdentifier2 = buildCandidateListData2.c.getApplicationIdentifier();
                bArr = com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.a.a(applicationIdentifier2).i;
                new java.lang.Object[]{bArr, applicationIdentifier2, content};
            } else if (!a(byteValue)) {
                java.lang.String b = buildCandidateListData2.b();
                new java.lang.Object[]{content};
                if (((byte) (kotlin.collections.ArraysKt.first(content) & this.c)) == this.d) {
                    content = com.discover.mpos.sdk.cardreader.entrypoint.flow.combinationselection.flow.candidatelist.flow.AidKernelIdMaps.a.a(b).i;
                }
            } else {
                if (a(byteValue)) {
                    bArr = ((byte) (kotlin.collections.ArraysKt.first(content) & this.c)) == this.d ? new byte[0] : content;
                    new java.lang.Object[]{bArr};
                    if (content.length < this.e) {
                        new java.lang.Object[]{content};
                    }
                }
                content = new byte[0];
            }
            content = bArr;
        }
        new java.lang.Object[]{content};
        if (content.length == 0) {
            executionFlow.a();
            return;
        }
        java.lang.String hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexString, "");
        buildCandidateListData2.f2988a = hexString;
        executionFlow.b(buildCandidateListData2);
    }

    private final boolean a(byte b) {
        byte b2 = this.b;
        return ((byte) (b & b2)) == b2;
    }
}
