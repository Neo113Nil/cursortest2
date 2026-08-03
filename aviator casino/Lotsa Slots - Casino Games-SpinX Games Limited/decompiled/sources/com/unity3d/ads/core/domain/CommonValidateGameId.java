package com.unity3d.ads.core.domain;

/* compiled from: CommonValidateGameId.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonValidateGameId;", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "setGameId", "Lcom/unity3d/ads/core/domain/SetGameId;", "(Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/domain/SetGameId;)V", "invoke", "", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonValidateGameId implements com.unity3d.ads.core.domain.ValidateGameId {
    private final com.unity3d.ads.core.domain.GetGameId getGameId;
    private final com.unity3d.ads.core.domain.SetGameId setGameId;

    public CommonValidateGameId(com.unity3d.ads.core.domain.GetGameId getGameId, com.unity3d.ads.core.domain.SetGameId setGameId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(java.lang.String gameId) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (gameId == null) {
            return false;
        }
        this.setGameId.invoke(gameId);
        return true;
    }
}
