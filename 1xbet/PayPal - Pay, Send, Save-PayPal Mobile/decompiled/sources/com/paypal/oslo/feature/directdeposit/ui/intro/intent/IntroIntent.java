package com.paypal.oslo.feature.directdeposit.ui.intro.intent;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent;", "", "<init>", "()V", "NavigateNext", "BackClicked", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent$BackClicked;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent$NavigateNext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class IntroIntent {
    public static final int $stable = 0;

    private IntroIntent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent$NavigateNext;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateNext extends com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.NavigateNext INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.NavigateNext();

        public final int hashCode() {
            return -209599830;
        }

        private NavigateNext() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateNext";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.NavigateNext)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent$BackClicked;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.BackClicked INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.BackClicked();

        public final int hashCode() {
            return 444683738;
        }

        private BackClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ IntroIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
