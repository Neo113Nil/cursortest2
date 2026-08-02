package androidx.glance.appwidget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.appwidget.unit.CheckableColorProvider;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/RadioButtonColors;", "", "radio", "Landroidx/glance/appwidget/unit/CheckableColorProvider;", "(Landroidx/glance/appwidget/unit/CheckableColorProvider;)V", "getRadio$glance_appwidget_release", "()Landroidx/glance/appwidget/unit/CheckableColorProvider;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonColors {
    public static final int $stable = 8;
    private final CheckableColorProvider radio;

    public RadioButtonColors(CheckableColorProvider checkableColorProvider) {
        this.radio = checkableColorProvider;
    }

    /* renamed from: getRadio$glance_appwidget_release, reason: from getter */
    public final CheckableColorProvider getRadio() {
        return this.radio;
    }
}
