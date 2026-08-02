package androidx.glance.appwidget.action;

import androidx.glance.action.Action;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/action/CompoundButtonAction;", "Landroidx/glance/action/Action;", "innerAction", "checked", "", "(Landroidx/glance/action/Action;Z)V", "getChecked", "()Z", "getInnerAction", "()Landroidx/glance/action/Action;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompoundButtonAction implements Action {
    private final boolean checked;
    private final Action innerAction;

    public CompoundButtonAction(Action action, boolean z) {
        this.innerAction = action;
        this.checked = z;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final Action getInnerAction() {
        return this.innerAction;
    }
}
