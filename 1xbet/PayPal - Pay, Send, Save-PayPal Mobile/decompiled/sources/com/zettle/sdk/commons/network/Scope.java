package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/zettle/sdk/commons/network/Scope;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Payment", "Refund"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum Scope {
    Payment,
    Refund;

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = com.zettle.sdk.commons.network.Scope.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "Payment";
        }
        if (i == 2) {
            return "Refund";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.commons.network.Scope.values().length];
            try {
                iArr[com.zettle.sdk.commons.network.Scope.Payment.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.commons.network.Scope.Refund.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
