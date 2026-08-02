package org.betup.ui.dialogs.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;", "", "titleIdP", "", "buttonLabelIdP", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getTitleIdP", "()I", "getButtonLabelIdP", "CreateNewBattle", "JoinExistingBattle", "Lorg/betup/ui/dialogs/controller/BattleBetSelectionState$CreateNewBattle;", "Lorg/betup/ui/dialogs/controller/BattleBetSelectionState$JoinExistingBattle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BattleBetSelectionState {
    public static final int $stable = 0;
    private final int buttonLabelIdP;
    private final int titleIdP;

    public /* synthetic */ BattleBetSelectionState(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private BattleBetSelectionState(int i, int i2) {
        this.titleIdP = i;
        this.buttonLabelIdP = i2;
    }

    public final int getTitleIdP() {
        return this.titleIdP;
    }

    public final int getButtonLabelIdP() {
        return this.buttonLabelIdP;
    }

    /* compiled from: BetSelectionController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/controller/BattleBetSelectionState$CreateNewBattle;", "Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;", "titleId", "", "buttonLabelId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getTitleId", "()I", "getButtonLabelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateNewBattle extends BattleBetSelectionState {
        public static final int $stable = 0;
        private final int buttonLabelId;
        private final int titleId;

        public static /* synthetic */ CreateNewBattle copy$default(CreateNewBattle createNewBattle, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = createNewBattle.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = createNewBattle.buttonLabelId;
            }
            return createNewBattle.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getButtonLabelId() {
            return this.buttonLabelId;
        }

        public final CreateNewBattle copy(int titleId, int buttonLabelId) {
            return new CreateNewBattle(titleId, buttonLabelId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateNewBattle)) {
                return false;
            }
            CreateNewBattle createNewBattle = (CreateNewBattle) other;
            return this.titleId == createNewBattle.titleId && this.buttonLabelId == createNewBattle.buttonLabelId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.buttonLabelId);
        }

        public String toString() {
            return "CreateNewBattle(titleId=" + this.titleId + ", buttonLabelId=" + this.buttonLabelId + ")";
        }

        public final int getButtonLabelId() {
            return this.buttonLabelId;
        }

        public final int getTitleId() {
            return this.titleId;
        }

        public CreateNewBattle(int i, int i2) {
            super(i, i2, null);
            this.titleId = i;
            this.buttonLabelId = i2;
        }
    }

    /* compiled from: BetSelectionController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/controller/BattleBetSelectionState$JoinExistingBattle;", "Lorg/betup/ui/dialogs/controller/BattleBetSelectionState;", "titleId", "", "buttonLabelId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getTitleId", "()I", "getButtonLabelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class JoinExistingBattle extends BattleBetSelectionState {
        public static final int $stable = 0;
        private final int buttonLabelId;
        private final int titleId;

        public static /* synthetic */ JoinExistingBattle copy$default(JoinExistingBattle joinExistingBattle, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = joinExistingBattle.titleId;
            }
            if ((i3 & 2) != 0) {
                i2 = joinExistingBattle.buttonLabelId;
            }
            return joinExistingBattle.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleId() {
            return this.titleId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getButtonLabelId() {
            return this.buttonLabelId;
        }

        public final JoinExistingBattle copy(int titleId, int buttonLabelId) {
            return new JoinExistingBattle(titleId, buttonLabelId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JoinExistingBattle)) {
                return false;
            }
            JoinExistingBattle joinExistingBattle = (JoinExistingBattle) other;
            return this.titleId == joinExistingBattle.titleId && this.buttonLabelId == joinExistingBattle.buttonLabelId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.titleId) * 31) + Integer.hashCode(this.buttonLabelId);
        }

        public String toString() {
            return "JoinExistingBattle(titleId=" + this.titleId + ", buttonLabelId=" + this.buttonLabelId + ")";
        }

        public final int getButtonLabelId() {
            return this.buttonLabelId;
        }

        public final int getTitleId() {
            return this.titleId;
        }

        public JoinExistingBattle(int i, int i2) {
            super(i, i2, null);
            this.titleId = i;
            this.buttonLabelId = i2;
        }
    }
}
