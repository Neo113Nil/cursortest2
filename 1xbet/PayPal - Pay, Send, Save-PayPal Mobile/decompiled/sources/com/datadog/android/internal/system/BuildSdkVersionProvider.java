package com.datadog.android.internal.system;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0014\u0010\u0003\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "", "", "isAtLeastN", "()Z", "isAtLeastO", "isAtLeastP", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastTiramisu", "isAtLeastVanillaIceCream", "", "getVersion", "()I", "version", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BuildSdkVersionProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.internal.system.BuildSdkVersionProvider.Companion INSTANCE = com.datadog.android.internal.system.BuildSdkVersionProvider.Companion.getHighSpeedVideoFpsRanges;

    int getVersion();

    /* renamed from: isAtLeastN */
    boolean getIsAtLeastN();

    /* renamed from: isAtLeastO */
    boolean getIsAtLeastO();

    /* renamed from: isAtLeastP */
    boolean getIsAtLeastP();

    /* renamed from: isAtLeastQ */
    boolean getIsAtLeastQ();

    /* renamed from: isAtLeastR */
    boolean getIsAtLeastR();

    /* renamed from: isAtLeastS */
    boolean getIsAtLeastS();

    /* renamed from: isAtLeastTiramisu */
    boolean getIsAtLeastTiramisu();

    /* renamed from: isAtLeastVanillaIceCream */
    boolean getIsAtLeastVanillaIceCream();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/system/BuildSdkVersionProvider$Companion;", "", "<init>", "()V", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "DEFAULT", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getDEFAULT", "()Lcom/datadog/android/internal/system/BuildSdkVersionProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.internal.system.BuildSdkVersionProvider.Companion getHighSpeedVideoFpsRanges = new com.datadog.android.internal.system.BuildSdkVersionProvider.Companion();
        private static final com.datadog.android.internal.system.BuildSdkVersionProvider DEFAULT = new com.datadog.android.internal.system.BuildSdkVersionProvider() { // from class: com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1
            private final boolean isAtLeastP;
            private final boolean isAtLeastQ;
            private final boolean isAtLeastR;
            private final boolean isAtLeastS;
            private final boolean isAtLeastTiramisu;
            private final boolean isAtLeastVanillaIceCream;
            private final int version = android.os.Build.VERSION.SDK_INT;
            private final boolean isAtLeastN = true;
            private final boolean isAtLeastO = true;

            {
                this.isAtLeastP = android.os.Build.VERSION.SDK_INT >= 28;
                this.isAtLeastQ = android.os.Build.VERSION.SDK_INT >= 29;
                this.isAtLeastR = android.os.Build.VERSION.SDK_INT >= 30;
                this.isAtLeastS = android.os.Build.VERSION.SDK_INT >= 31;
                this.isAtLeastTiramisu = android.os.Build.VERSION.SDK_INT >= 33;
                this.isAtLeastVanillaIceCream = android.os.Build.VERSION.SDK_INT >= 35;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            public final int getVersion() {
                return this.version;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastN, reason: from getter */
            public final boolean getIsAtLeastN() {
                return this.isAtLeastN;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastO, reason: from getter */
            public final boolean getIsAtLeastO() {
                return this.isAtLeastO;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastP, reason: from getter */
            public final boolean getIsAtLeastP() {
                return this.isAtLeastP;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastQ, reason: from getter */
            public final boolean getIsAtLeastQ() {
                return this.isAtLeastQ;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastR, reason: from getter */
            public final boolean getIsAtLeastR() {
                return this.isAtLeastR;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastS, reason: from getter */
            public final boolean getIsAtLeastS() {
                return this.isAtLeastS;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastTiramisu, reason: from getter */
            public final boolean getIsAtLeastTiramisu() {
                return this.isAtLeastTiramisu;
            }

            @Override // com.datadog.android.internal.system.BuildSdkVersionProvider
            /* renamed from: isAtLeastVanillaIceCream, reason: from getter */
            public final boolean getIsAtLeastVanillaIceCream() {
                return this.isAtLeastVanillaIceCream;
            }
        };

        private Companion() {
        }

        public final com.datadog.android.internal.system.BuildSdkVersionProvider getDEFAULT() {
            return DEFAULT;
        }
    }
}
