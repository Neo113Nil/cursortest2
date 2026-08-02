package org.betup.games.warGame.model.interactor;

import kotlin.Metadata;
import org.betup.games.warGame.model.rest.WarGameAction;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ContinueWarGameInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/games/warGame/model/interactor/ActionModel;", "", "action", "Lorg/betup/games/warGame/model/rest/WarGameAction;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/warGame/model/rest/WarGameAction;)V", "getAction", "()Lorg/betup/games/warGame/model/rest/WarGameAction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActionModel {
    public static final int $stable = 0;
    private final WarGameAction action;

    public static /* synthetic */ ActionModel copy$default(ActionModel actionModel, WarGameAction warGameAction, int i, Object obj) {
        if ((i & 1) != 0) {
            warGameAction = actionModel.action;
        }
        return actionModel.copy(warGameAction);
    }

    /* renamed from: component1, reason: from getter */
    public final WarGameAction getAction() {
        return this.action;
    }

    public final ActionModel copy(WarGameAction action) {
        return new ActionModel(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActionModel) && this.action == ((ActionModel) other).action;
    }

    public int hashCode() {
        WarGameAction warGameAction = this.action;
        if (warGameAction == null) {
            return 0;
        }
        return warGameAction.hashCode();
    }

    public String toString() {
        return "ActionModel(action=" + this.action + ")";
    }

    public ActionModel(WarGameAction warGameAction) {
        this.action = warGameAction;
    }

    public final WarGameAction getAction() {
        return this.action;
    }
}
