package androidx.glance.appwidget.action;

import androidx.glance.action.ActionParameters;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ToggleableStateKey", "Landroidx/glance/action/ActionParameters$Key;", "", "getToggleableStateKey", "()Landroidx/glance/action/ActionParameters$Key;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleableKt {
    private static final ActionParameters.Key<Boolean> ToggleableStateKey = new ActionParameters.Key<>("android.widget.extra.CHECKED");

    public static final ActionParameters.Key<Boolean> getToggleableStateKey() {
        return ToggleableStateKey;
    }
}
