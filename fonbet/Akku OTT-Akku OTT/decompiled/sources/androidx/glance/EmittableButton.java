package androidx.glance;

import androidx.annotation.RestrictTo;
import androidx.collection.i;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.text.TextStyle;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020\u0001H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/glance/EmittableButton;", "Landroidx/glance/Emittable;", "()V", "colors", "Landroidx/glance/ButtonColors;", "getColors", "()Landroidx/glance/ButtonColors;", "setColors", "(Landroidx/glance/ButtonColors;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "maxLines", "", "getMaxLines", "()I", "setMaxLines", "(I)V", "modifier", "Landroidx/glance/GlanceModifier;", "getModifier", "()Landroidx/glance/GlanceModifier;", "setModifier", "(Landroidx/glance/GlanceModifier;)V", "style", "Landroidx/glance/text/TextStyle;", "getStyle", "()Landroidx/glance/text/TextStyle;", "setStyle", "(Landroidx/glance/text/TextStyle;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "copy", "toString", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class EmittableButton implements Emittable {
    public static final int $stable = 8;
    private ButtonColors colors;
    private TextStyle style;
    private GlanceModifier modifier = GlanceModifier.INSTANCE;
    private String text = "";
    private boolean enabled = true;
    private int maxLines = Integer.MAX_VALUE;

    @Override // androidx.glance.Emittable
    public Emittable copy() {
        EmittableButton emittableButton = new EmittableButton();
        emittableButton.setModifier(getModifier());
        emittableButton.text = this.text;
        emittableButton.style = this.style;
        emittableButton.colors = this.colors;
        emittableButton.enabled = this.enabled;
        emittableButton.maxLines = this.maxLines;
        return emittableButton;
    }

    public final ButtonColors getColors() {
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

    public final void setColors(ButtonColors buttonColors) {
        this.colors = buttonColors;
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
        StringBuilder sb = new StringBuilder("EmittableButton('");
        sb.append(this.text);
        sb.append("', enabled=");
        sb.append(this.enabled);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(" modifier=");
        sb.append(getModifier());
        sb.append(", maxLines=");
        return i.c(sb, this.maxLines, ')');
    }
}
