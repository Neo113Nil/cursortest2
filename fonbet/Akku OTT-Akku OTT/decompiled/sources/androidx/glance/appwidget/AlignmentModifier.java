package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/AlignmentModifier;", "Landroidx/glance/GlanceModifier$Element;", "alignment", "Landroidx/glance/layout/Alignment;", "(Landroidx/glance/layout/Alignment;)V", "getAlignment", "()Landroidx/glance/layout/Alignment;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentModifier implements GlanceModifier.Element {
    private final Alignment alignment;

    public AlignmentModifier(Alignment alignment) {
        this.alignment = alignment;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }
}
