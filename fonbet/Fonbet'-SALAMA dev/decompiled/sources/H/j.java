package H;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f3170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3171c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3169a = colorStateList;
        this.f3170b = configuration;
        this.f3171c = theme == null ? 0 : theme.hashCode();
    }
}
