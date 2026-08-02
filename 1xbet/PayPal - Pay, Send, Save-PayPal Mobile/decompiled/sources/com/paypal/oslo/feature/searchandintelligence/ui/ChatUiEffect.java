package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ScrollToPin", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect$ScrollToPin;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ChatUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ChatUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect$ScrollToPin;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;", "", "targetIndex", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect$ScrollToPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTargetIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScrollToPin extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect {
        public static final int $stable = 0;
        private final int targetIndex;

        public ScrollToPin(int i) {
            super("ScrollToPin", null);
            this.targetIndex = i;
        }

        public final int getTargetIndex() {
            return this.targetIndex;
        }

        public final java.lang.String toString() {
            int i = this.targetIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollToPin(targetIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.targetIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin) && this.targetIndex == ((com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin) other).targetIndex;
        }

        public final com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin copy(int targetIndex) {
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin(targetIndex);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTargetIndex() {
            return this.targetIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin copy$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin scrollToPin, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = scrollToPin.targetIndex;
            }
            return scrollToPin.copy(i);
        }
    }

    public /* synthetic */ ChatUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
