package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/zettle/sdk/core/requirements/RequirementDep;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Authentication", "AuthenticationElevation", "FineLocationPermission", "LocationEnabled", "BluetoothEnabled"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum RequirementDep {
    Authentication,
    AuthenticationElevation,
    FineLocationPermission,
    LocationEnabled,
    BluetoothEnabled;

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = com.zettle.sdk.core.requirements.RequirementDep.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "Authentication";
        }
        if (i == 2) {
            return "AuthenticationElevation";
        }
        if (i == 3) {
            return "FineLocationPermission";
        }
        if (i == 4) {
            return "LocationEnabled";
        }
        if (i == 5) {
            return "BluetoothEnabled";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.core.requirements.RequirementDep.values().length];
            try {
                iArr[com.zettle.sdk.core.requirements.RequirementDep.Authentication.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.core.requirements.RequirementDep.AuthenticationElevation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.sdk.core.requirements.RequirementDep.FineLocationPermission.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zettle.sdk.core.requirements.RequirementDep.LocationEnabled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.zettle.sdk.core.requirements.RequirementDep.BluetoothEnabled.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
