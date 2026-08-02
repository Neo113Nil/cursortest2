package androidx.glance.appwidget;

import androidx.collection.i;
import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import androidx.glance.text.TextStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\u0001H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/glance/appwidget/EmittableSwitch;", "Landroidx/glance/Emittable;", "colors", "Landroidx/glance/appwidget/SwitchColors;", "(Landroidx/glance/appwidget/SwitchColors;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "getColors", "()Landroidx/glance/appwidget/SwitchColors;", "setColors", "maxLines", "", "getMaxLines", "()I", "setMaxLines", "(I)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "style", "Landroidx/glance/text/TextStyle;", "getStyle", "()Landroidx/glance/text/TextStyle;", "setStyle", "(Landroidx/glance/text/TextStyle;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "copy", "toString", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmittableSwitch implements Emittable {
    private boolean checked;
    private SwitchColors colors;
    private TextStyle style;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private String text = "";
    private int maxLines = Integer.MAX_VALUE;

    public EmittableSwitch(SwitchColors switchColors) {
        this.colors = switchColors;
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableSwitch emittableSwitch = new EmittableSwitch(this.colors);
        emittableSwitch.setModifier(getModifier());
        emittableSwitch.checked = this.checked;
        emittableSwitch.text = this.text;
        emittableSwitch.style = this.style;
        emittableSwitch.maxLines = this.maxLines;
        return emittableSwitch;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final SwitchColors getColors() {
        return this.colors;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.glance.Emittable
    public GlanceModifier getModifier() {
        return this.modifier;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setColors(SwitchColors switchColors) {
        this.colors = switchColors;
    }

    public final void setMaxLines(int i) {
        this.maxLines = i;
    }

    @Override // androidx.glance.Emittable
    public void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final void setStyle(TextStyle textStyle) {
        this.style = textStyle;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmittableSwitch(");
        sb.append(this.text);
        sb.append(", modifier=");
        sb.append(getModifier());
        sb.append(", checked=");
        sb.append(this.checked);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", maxLines=");
        return i.c(sb, this.maxLines, ')');
    }
}
