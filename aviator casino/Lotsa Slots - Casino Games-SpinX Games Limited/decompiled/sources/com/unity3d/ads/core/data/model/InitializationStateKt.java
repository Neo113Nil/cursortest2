package com.unity3d.ads.core.data.model;

/* compiled from: InitializationState.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toBold", "Lcom/unity3d/ads/core/data/model/InitializationState;", "Lcom/unity3d/services/core/properties/SdkProperties$InitializationState;", "toLegacy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitializationStateKt {

    /* compiled from: InitializationState.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.unity3d.ads.core.data.model.InitializationState.values().length];
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.unity3d.services.core.properties.SdkProperties.InitializationState.values().length];
            try {
                iArr2[com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final com.unity3d.services.core.properties.SdkProperties.InitializationState toLegacy(com.unity3d.ads.core.data.model.InitializationState initializationState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i = com.unity3d.ads.core.data.model.InitializationStateKt.WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i == 1) {
            return com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i == 2) {
            return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZING;
        }
        if (i == 3) {
            return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i == 4) {
            return com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.unity3d.ads.core.data.model.InitializationState toBold(com.unity3d.services.core.properties.SdkProperties.InitializationState initializationState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i = com.unity3d.ads.core.data.model.InitializationStateKt.WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i == 1) {
            return com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED;
        }
        if (i == 2) {
            return com.unity3d.ads.core.data.model.InitializationState.INITIALIZING;
        }
        if (i == 3) {
            return com.unity3d.ads.core.data.model.InitializationState.INITIALIZED;
        }
        if (i == 4) {
            return com.unity3d.ads.core.data.model.InitializationState.FAILED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
