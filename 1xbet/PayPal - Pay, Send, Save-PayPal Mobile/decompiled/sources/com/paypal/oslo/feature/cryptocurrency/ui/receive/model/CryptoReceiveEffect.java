package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "", "<init>", "()V", "NavigateBack", "CopyToClipboard", "CopyMemoToClipboard", "ShareAddress", "ShowHowReceivingWorksInfo", "ShowNetworkSelectionSheet", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyMemoToClipboard;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShareAddress;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShowHowReceivingWorksInfo;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShowNetworkSelectionSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoReceiveEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.NavigateBack();

        public final int hashCode() {
            return 1645022834;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private CryptoReceiveEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyToClipboard;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyToClipboard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyToClipboard extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyToClipboard(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyToClipboard(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard) other).text);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard copyToClipboard, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyToClipboard.text;
            }
            return copyToClipboard.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyMemoToClipboard;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$CopyMemoToClipboard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyMemoToClipboard extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyMemoToClipboard(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CopyMemoToClipboard(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard) other).text);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard copyMemoToClipboard, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = copyMemoToClipboard.text;
            }
            return copyMemoToClipboard.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShareAddress;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "", "address", "assetName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShareAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddress", "getAssetName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShareAddress extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        private final java.lang.String address;
        private final java.lang.String assetName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareAddress(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.address = str;
            this.assetName = str2;
        }

        public final java.lang.String getAddress() {
            return this.address;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.address;
            java.lang.String str2 = this.assetName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShareAddress(address=");
            sb.append(str);
            sb.append(", assetName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.address.hashCode() * 31) + this.assetName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress shareAddress = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.address, shareAddress.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, shareAddress.assetName);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress copy(java.lang.String address, java.lang.String assetName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress(address, assetName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress shareAddress, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shareAddress.address;
            }
            if ((i & 2) != 0) {
                str2 = shareAddress.assetName;
            }
            return shareAddress.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShowHowReceivingWorksInfo;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowHowReceivingWorksInfo extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowHowReceivingWorksInfo INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowHowReceivingWorksInfo();

        public final int hashCode() {
            return 1681015689;
        }

        private ShowHowReceivingWorksInfo() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowHowReceivingWorksInfo";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowHowReceivingWorksInfo)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect$ShowNetworkSelectionSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowNetworkSelectionSheet extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowNetworkSelectionSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowNetworkSelectionSheet();

        public final int hashCode() {
            return -1473127478;
        }

        private ShowNetworkSelectionSheet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowNetworkSelectionSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowNetworkSelectionSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CryptoReceiveEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
