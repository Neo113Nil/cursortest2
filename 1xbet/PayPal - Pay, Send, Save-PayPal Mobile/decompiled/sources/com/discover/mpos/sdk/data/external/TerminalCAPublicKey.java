package com.discover.mpos.sdk.data.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001b\u0010 \u001a\u00020\u001b8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\"\u0010\n"}, d2 = {"Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "", "", "publicKeyIndex", "publicKeyModulus", "exponent", "checksum", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discover/mpos/sdk/data/external/TerminalCAPublicKey;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChecksum", "getExponent", "", "exponentInHex$delegate", "Lkotlin/Lazy;", "getExponentInHex$mpos_sdk_card_reader_offlineRegularRelease", "()[B", "exponentInHex", "getPublicKeyIndex", "getPublicKeyModulus"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TerminalCAPublicKey {
    private final java.lang.String checksum;
    private final java.lang.String exponent;

    /* renamed from: exponentInHex$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy exponentInHex;
    private final java.lang.String publicKeyIndex;
    private final java.lang.String publicKeyModulus;

    public TerminalCAPublicKey(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.publicKeyIndex = str;
        this.publicKeyModulus = str2;
        this.exponent = str3;
        this.checksum = str4;
        this.exponentInHex = kotlin.LazyKt.lazy(new com.discover.mpos.sdk.data.external.TerminalCAPublicKey.a());
    }

    public final java.lang.String getPublicKeyIndex() {
        return this.publicKeyIndex;
    }

    public final java.lang.String getPublicKeyModulus() {
        return this.publicKeyModulus;
    }

    public final java.lang.String getExponent() {
        return this.exponent;
    }

    public /* synthetic */ TerminalCAPublicKey(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            if (com.discover.mpos.sdk.data.external.TerminalCAPublicKey.this.getExponent().length() % 2 == 0) {
                return com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(com.discover.mpos.sdk.data.external.TerminalCAPublicKey.this.getExponent());
            }
            return com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(kotlin.text.StringsKt.padStart(com.discover.mpos.sdk.data.external.TerminalCAPublicKey.this.getExponent(), com.discover.mpos.sdk.data.external.TerminalCAPublicKey.this.getExponent().length() + 1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        }

        a() {
            super(0);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TerminalCAPublicKey(publicKeyIndex=");
        sb.append(this.publicKeyIndex);
        sb.append(", publicKeyModulus=");
        sb.append(this.publicKeyModulus);
        sb.append(", exponent=");
        sb.append(this.exponent);
        sb.append(", checksum=");
        sb.append(this.checksum);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.publicKeyIndex;
        int hashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.publicKeyModulus;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.exponent;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.checksum;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final byte[] getExponentInHex$mpos_sdk_card_reader_offlineRegularRelease() {
        return (byte[]) this.exponentInHex.getValue();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.data.external.TerminalCAPublicKey)) {
            return false;
        }
        com.discover.mpos.sdk.data.external.TerminalCAPublicKey terminalCAPublicKey = (com.discover.mpos.sdk.data.external.TerminalCAPublicKey) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicKeyIndex, terminalCAPublicKey.publicKeyIndex) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicKeyModulus, terminalCAPublicKey.publicKeyModulus) && kotlin.jvm.internal.Intrinsics.areEqual(this.exponent, terminalCAPublicKey.exponent) && kotlin.jvm.internal.Intrinsics.areEqual(this.checksum, terminalCAPublicKey.checksum);
    }

    public final com.discover.mpos.sdk.data.external.TerminalCAPublicKey copy(java.lang.String publicKeyIndex, java.lang.String publicKeyModulus, java.lang.String exponent, java.lang.String checksum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKeyIndex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKeyModulus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exponent, "");
        return new com.discover.mpos.sdk.data.external.TerminalCAPublicKey(publicKeyIndex, publicKeyModulus, exponent, checksum);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExponent() {
        return this.exponent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPublicKeyModulus() {
        return this.publicKeyModulus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPublicKeyIndex() {
        return this.publicKeyIndex;
    }

    public static /* synthetic */ com.discover.mpos.sdk.data.external.TerminalCAPublicKey copy$default(com.discover.mpos.sdk.data.external.TerminalCAPublicKey terminalCAPublicKey, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = terminalCAPublicKey.publicKeyIndex;
        }
        if ((i & 2) != 0) {
            str2 = terminalCAPublicKey.publicKeyModulus;
        }
        if ((i & 4) != 0) {
            str3 = terminalCAPublicKey.exponent;
        }
        if ((i & 8) != 0) {
            str4 = terminalCAPublicKey.checksum;
        }
        return terminalCAPublicKey.copy(str, str2, str3, str4);
    }

    public TerminalCAPublicKey() {
        this(null, null, null, null, 15, null);
    }
}
