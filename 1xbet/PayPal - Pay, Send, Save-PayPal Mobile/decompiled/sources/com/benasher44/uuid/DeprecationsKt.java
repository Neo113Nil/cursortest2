package com.benasher44.uuid;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\"\"\u0010\u0007\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004*\u000e\u0010\b\"\u0002`\u00012\u00060\u0000j\u0002`\u0001"}, d2 = {"Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "", "getUuid", "(Ljava/util/UUID;)[B", "getUuid$annotations", "(Ljava/util/UUID;)V", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeprecationsKt {
    @kotlin.Deprecated(message = "Use `Uuid` instead.", replaceWith = @kotlin.ReplaceWith(expression = "Uuid", imports = {}))
    public static /* synthetic */ void UUID$annotations() {
    }

    @kotlin.Deprecated(message = "Use uuidFrom() instead. This will be removed in the next release.", replaceWith = @kotlin.ReplaceWith(expression = "Uuid.bytes", imports = {}))
    public static /* synthetic */ void getUuid$annotations(java.util.UUID uuid) {
    }

    public static final byte[] getUuid(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        return com.benasher44.uuid.UuidKt.getBytes(uuid);
    }
}
