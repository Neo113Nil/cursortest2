package com.paypal.oslo.core.commonui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "Lcoil3/decode/DataSource;", "toCoilDataSource$common_ui_release", "()Lcoil3/decode/DataSource;", "Companion", "MEMORY_CACHE", "MEMORY", "DISK", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DataSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.commonui.components.DataSource.Companion INSTANCE;
    public static final com.paypal.oslo.core.commonui.components.DataSource DISK;
    public static final com.paypal.oslo.core.commonui.components.DataSource MEMORY;
    public static final com.paypal.oslo.core.commonui.components.DataSource MEMORY_CACHE;
    public static final com.paypal.oslo.core.commonui.components.DataSource NETWORK;
    private static final /* synthetic */ com.paypal.oslo.core.commonui.components.DataSource[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DataSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.commonui.components.DataSource dataSource = new com.paypal.oslo.core.commonui.components.DataSource("MEMORY_CACHE", 0);
        MEMORY_CACHE = dataSource;
        com.paypal.oslo.core.commonui.components.DataSource dataSource2 = new com.paypal.oslo.core.commonui.components.DataSource("MEMORY", 1);
        MEMORY = dataSource2;
        com.paypal.oslo.core.commonui.components.DataSource dataSource3 = new com.paypal.oslo.core.commonui.components.DataSource("DISK", 2);
        DISK = dataSource3;
        com.paypal.oslo.core.commonui.components.DataSource dataSource4 = new com.paypal.oslo.core.commonui.components.DataSource(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 3);
        NETWORK = dataSource4;
        com.paypal.oslo.core.commonui.components.DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        getHighResolutionOutputSizeshNQ4ISI = dataSourceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dataSourceArr);
        INSTANCE = new com.paypal.oslo.core.commonui.components.DataSource.Companion(null);
    }

    public final coil3.graphics.DataSource toCoilDataSource$common_ui_release() {
        int i = com.paypal.oslo.core.commonui.components.DataSource.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return coil3.graphics.DataSource.MEMORY_CACHE;
        }
        if (i == 2) {
            return coil3.graphics.DataSource.MEMORY;
        }
        if (i == 3) {
            return coil3.graphics.DataSource.DISK;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return coil3.graphics.DataSource.NETWORK;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/DataSource$Companion;", "", "<init>", "()V", "Lcoil3/decode/DataSource;", "coilDataSource", "Lcom/paypal/oslo/core/commonui/components/DataSource;", "fromCoil", "(Lcoil3/decode/DataSource;)Lcom/paypal/oslo/core/commonui/components/DataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.commonui.components.DataSource fromCoil(coil3.graphics.DataSource coilDataSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coilDataSource, "");
            int i = com.paypal.oslo.core.commonui.components.DataSource.Companion.WhenMappings.$EnumSwitchMapping$0[coilDataSource.ordinal()];
            if (i == 1) {
                return com.paypal.oslo.core.commonui.components.DataSource.MEMORY_CACHE;
            }
            if (i == 2) {
                return com.paypal.oslo.core.commonui.components.DataSource.MEMORY;
            }
            if (i == 3) {
                return com.paypal.oslo.core.commonui.components.DataSource.DISK;
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.commonui.components.DataSource.NETWORK;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[coil3.graphics.DataSource.values().length];
                try {
                    iArr[coil3.graphics.DataSource.MEMORY_CACHE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[coil3.graphics.DataSource.MEMORY.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[coil3.graphics.DataSource.DISK.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[coil3.graphics.DataSource.NETWORK.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.core.commonui.components.DataSource[] values() {
        return (com.paypal.oslo.core.commonui.components.DataSource[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.commonui.components.DataSource.values().length];
            try {
                iArr[com.paypal.oslo.core.commonui.components.DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.commonui.components.DataSource.MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.commonui.components.DataSource.DISK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.commonui.components.DataSource.NETWORK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.core.commonui.components.DataSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.commonui.components.DataSource) java.lang.Enum.valueOf(com.paypal.oslo.core.commonui.components.DataSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.commonui.components.DataSource> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
