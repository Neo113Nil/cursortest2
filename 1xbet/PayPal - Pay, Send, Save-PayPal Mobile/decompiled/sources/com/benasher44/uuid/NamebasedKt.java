package com.benasher44.uuid;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "namespace", "", "name", "uuid3Of", "(Ljava/util/UUID;Ljava/lang/String;)Ljava/util/UUID;", "uuid5Of"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamebasedKt {
    public static final java.util.UUID uuid3Of(java.util.UUID uuid, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.benasher44.uuid.UuidUtil.nameBasedUuidOf(uuid, str, new com.benasher44.uuid.JvmHasher("MD5", 3));
    }

    public static final java.util.UUID uuid5Of(java.util.UUID uuid, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.benasher44.uuid.UuidUtil.nameBasedUuidOf(uuid, str, new com.benasher44.uuid.JvmHasher("SHA-1", 5));
    }
}
