package androidx.glance;

import android.graphics.drawable.Icon;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/glance/IconImageProvider;", "Landroidx/glance/ImageProvider;", "icon", "Landroid/graphics/drawable/Icon;", "(Landroid/graphics/drawable/Icon;)V", "getIcon", "()Landroid/graphics/drawable/Icon;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class IconImageProvider implements ImageProvider {
    public static final int $stable = 8;
    private final Icon icon;

    public IconImageProvider(Icon icon) {
        this.icon = icon;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public String toString() {
        return "IconImageProvider(icon=" + this.icon + ')';
    }
}
