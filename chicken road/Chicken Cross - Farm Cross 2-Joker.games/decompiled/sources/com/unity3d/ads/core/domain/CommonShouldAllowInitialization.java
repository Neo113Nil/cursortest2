package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonShouldAllowInitialization.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonShouldAllowInitialization;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "checkForGameIdAndTestModeChanges", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "setInitializationState", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "validateGameId", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "<init>", "(Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/SetInitializationState;Lcom/unity3d/ads/core/domain/ValidateGameId;)V", "getCheckForGameIdAndTestModeChanges", "()Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "getSetInitializationState", "()Lcom/unity3d/ads/core/domain/SetInitializationState;", "getValidateGameId", "()Lcom/unity3d/ads/core/domain/ValidateGameId;", "invoke", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonShouldAllowInitialization implements ShouldAllowInitialization {
    private final CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;
    private final GetInitializationState getInitializationState;
    private final SetInitializationState setInitializationState;
    private final ValidateGameId validateGameId;

    /* compiled from: CommonShouldAllowInitialization.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonShouldAllowInitialization(CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges, GetInitializationState getInitializationState, SetInitializationState setInitializationState, ValidateGameId validateGameId) {
        Intrinsics.checkNotNullParameter(checkForGameIdAndTestModeChanges, "checkForGameIdAndTestModeChanges");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(setInitializationState, "setInitializationState");
        Intrinsics.checkNotNullParameter(validateGameId, "validateGameId");
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges;
        this.getInitializationState = getInitializationState;
        this.setInitializationState = setInitializationState;
        this.validateGameId = validateGameId;
    }

    public final CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    public final ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(String gameId) {
        if (!this.validateGameId.invoke(gameId)) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(false).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.checkForGameIdAndTestModeChanges.invoke(false);
                this.setInitializationState.invoke(InitializationState.INITIALIZING, false);
                return true;
            }
            SdkProperties.notifyInitializationComplete();
        }
        return false;
    }
}
