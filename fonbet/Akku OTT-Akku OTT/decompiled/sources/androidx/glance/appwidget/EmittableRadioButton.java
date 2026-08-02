package androidx.glance.appwidget;

import androidx.compose.runtime.C0211b;
import androidx.glance.Emittable;
import androidx.glance.GlanceModifier;
import androidx.glance.text.TextStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020\u0001H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/glance/appwidget/EmittableRadioButton;", "Landroidx/glance/Emittable;", "colors", "Landroidx/glance/appwidget/RadioButtonColors;", "(Landroidx/glance/appwidget/RadioButtonColors;)V", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "getColors", "()Landroidx/glance/appwidget/RadioButtonColors;", "setColors", "enabled", "getEnabled", "setEnabled", "maxLines", "", "getMaxLines", "()I", "setMaxLines", "(I)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "style", "Landroidx/glance/text/TextStyle;", "getStyle", "()Landroidx/glance/text/TextStyle;", "setStyle", "(Landroidx/glance/text/TextStyle;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "copy", "toString", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmittableRadioButton implements Emittable {
    private boolean checked;
    private RadioButtonColors colors;
    private TextStyle style;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private boolean enabled = true;
    private String text = "";
    private int maxLines = Integer.MAX_VALUE;

    public EmittableRadioButton(RadioButtonColors radioButtonColors) {
        this.colors = radioButtonColors;
    }

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableRadioButton emittableRadioButton = new EmittableRadioButton(this.colors);
        emittableRadioButton.setModifier(getModifier());
        emittableRadioButton.checked = this.checked;
        emittableRadioButton.enabled = this.enabled;
        emittableRadioButton.text = this.text;
        emittableRadioButton.style = this.style;
        emittableRadioButton.maxLines = this.maxLines;
        return emittableRadioButton;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final RadioButtonColors getColors() {
        return this.colors;
    }

    public final boolean getEnabled() {
        return this.enabled;
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

    public final void setColors(RadioButtonColors radioButtonColors) {
        this.colors = radioButtonColors;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
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
        StringBuilder sb = new StringBuilder("EmittableRadioButton(");
        sb.append(this.text);
        sb.append(", modifier=");
        sb.append(getModifier());
        sb.append(", checked=");
        sb.append(this.checked);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", maxLines=");
        return C0211b.a(sb, this.maxLines, ", )");
    }
}
