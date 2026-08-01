package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;

/* compiled from: MediationProviderParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/MediationProviderParser;", "", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MediationProviderParser {
    ClientInfoOuterClass.MediationProvider invoke(String mediationProvider);
}
