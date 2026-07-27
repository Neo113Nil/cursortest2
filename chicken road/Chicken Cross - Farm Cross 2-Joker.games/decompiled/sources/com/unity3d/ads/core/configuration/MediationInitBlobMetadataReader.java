package com.unity3d.ads.core.configuration;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediationInitBlobMetadataReader.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00072\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "Lcom/unity3d/ads/core/configuration/MetadataReader;", "", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "<init>", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediationInitBlobMetadataReader extends MetadataReader<String> {
    public static final String MEDIATION_UADS_INIT_BLOB = "mediation.uads_init_blob.value";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationInitBlobMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_UADS_INIT_BLOB);
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
    }
}
