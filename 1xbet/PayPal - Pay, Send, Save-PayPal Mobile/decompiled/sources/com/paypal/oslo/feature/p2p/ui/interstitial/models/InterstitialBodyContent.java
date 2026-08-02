package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", "", "<init>", "()V", "Plain", "Rich", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Plain;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Rich;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialBodyContent {
    public static final int $stable = 0;

    private InterstitialBodyContent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Plain;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Plain;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Plain extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent {
        public static final int $stable = 0;
        private final java.lang.String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Plain(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Plain(text=");
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain) other).text);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain plain, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = plain.text;
            }
            return plain.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Rich;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent;", "Lcom/paypal/pds/core/RichText;", "richText", "<init>", "(Lcom/paypal/pds/core/RichText;)V", "component1", "()Lcom/paypal/pds/core/RichText;", "copy", "(Lcom/paypal/pds/core/RichText;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBodyContent$Rich;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/RichText;", "getRichText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Rich extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent {
        public static final int $stable = 0;
        private final com.paypal.pds.core.RichText richText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rich(com.paypal.pds.core.RichText richText) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            this.richText = richText;
        }

        public final com.paypal.pds.core.RichText getRichText() {
            return this.richText;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.RichText richText = this.richText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rich(richText=");
            sb.append(richText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.richText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich) && kotlin.jvm.internal.Intrinsics.areEqual(this.richText, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich) other).richText);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich copy(com.paypal.pds.core.RichText richText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich(richText);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.RichText getRichText() {
            return this.richText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich rich, com.paypal.pds.core.RichText richText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                richText = rich.richText;
            }
            return rich.copy(richText);
        }
    }

    public /* synthetic */ InterstitialBodyContent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
