package f1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f16956a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f16957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16958c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f16956a = colorStateList;
        this.f16957b = configuration;
        this.f16958c = theme == null ? 0 : theme.hashCode();
    }
}
