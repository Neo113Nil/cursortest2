package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeVideoBonusUiState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ShowCollectDialog", "ShowMessage", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent$ShowCollectDialog;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent$ShowMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HomeVideoBonusEvent {
    public static final int $stable = 0;

    public /* synthetic */ HomeVideoBonusEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: HomeVideoBonusUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent$ShowCollectDialog;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent;", "amount", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getAmount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowCollectDialog extends HomeVideoBonusEvent {
        public static final int $stable = 0;
        private final int amount;

        public static /* synthetic */ ShowCollectDialog copy$default(ShowCollectDialog showCollectDialog, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showCollectDialog.amount;
            }
            return showCollectDialog.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        public final ShowCollectDialog copy(int amount) {
            return new ShowCollectDialog(amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCollectDialog) && this.amount == ((ShowCollectDialog) other).amount;
        }

        public int hashCode() {
            return Integer.hashCode(this.amount);
        }

        public String toString() {
            return "ShowCollectDialog(amount=" + this.amount + ")";
        }

        public ShowCollectDialog(int i) {
            super(null);
            this.amount = i;
        }

        public final int getAmount() {
            return this.amount;
        }
    }

    private HomeVideoBonusEvent() {
    }

    /* compiled from: HomeVideoBonusUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent$ShowMessage;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent;", "messageResId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getMessageResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowMessage extends HomeVideoBonusEvent {
        public static final int $stable = 0;
        private final int messageResId;

        public static /* synthetic */ ShowMessage copy$default(ShowMessage showMessage, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showMessage.messageResId;
            }
            return showMessage.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        public final ShowMessage copy(int messageResId) {
            return new ShowMessage(messageResId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowMessage) && this.messageResId == ((ShowMessage) other).messageResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageResId);
        }

        public String toString() {
            return "ShowMessage(messageResId=" + this.messageResId + ")";
        }

        public ShowMessage(int i) {
            super(null);
            this.messageResId = i;
        }

        public final int getMessageResId() {
            return this.messageResId;
        }
    }
}
