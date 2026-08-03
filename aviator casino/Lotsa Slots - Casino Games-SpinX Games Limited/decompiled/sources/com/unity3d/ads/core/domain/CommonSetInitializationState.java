package com.unity3d.ads.core.domain;

/* compiled from: CommonSetInitializationState.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonSetInitializationState;", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;)V", "invoke", "", "state", "Lcom/unity3d/ads/core/data/model/InitializationState;", "legacy", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonSetInitializationState implements com.unity3d.ads.core.domain.SetInitializationState {
    private final com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public CommonSetInitializationState(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(com.unity3d.ads.core.data.model.InitializationState state, boolean legacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        if (legacy) {
            this.sdkPropertiesManager.setInitializeState(com.unity3d.ads.core.data.model.InitializationStateKt.toLegacy(state));
        } else {
            this.sessionRepository.setInitializationState(state);
        }
    }
}
