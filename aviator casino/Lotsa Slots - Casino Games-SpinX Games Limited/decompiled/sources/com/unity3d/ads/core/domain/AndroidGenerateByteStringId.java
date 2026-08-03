package com.unity3d.ads.core.domain;

/* compiled from: AndroidGenerateByteStringId.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGenerateByteStringId;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "()V", "invoke", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidGenerateByteStringId implements com.unity3d.ads.core.domain.GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    public com.google.protobuf.ByteString invoke() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        return com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(randomUUID);
    }
}
