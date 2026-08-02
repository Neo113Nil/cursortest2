package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent;", "", "<init>", "()V", com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, "Forward", com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu, "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Back;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Forward;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Menu;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class NavigationBarEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Back;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Back extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Back INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Back();

        public final int hashCode() {
            return -1622839920;
        }

        private Back() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.knotapi.knot.utilities.Constants.META_BACK_BUTTON;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Back)) {
                return false;
            }
            return true;
        }
    }

    private NavigationBarEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Forward;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Forward extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Forward INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Forward();

        public final int hashCode() {
            return 2092957052;
        }

        private Forward() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Forward";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Forward)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent$Menu;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/NavigationBarEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Menu extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Menu INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Menu();

        public final int hashCode() {
            return -1622508024;
        }

        private Menu() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.NavigationBarEvent.Menu)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ NavigationBarEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
