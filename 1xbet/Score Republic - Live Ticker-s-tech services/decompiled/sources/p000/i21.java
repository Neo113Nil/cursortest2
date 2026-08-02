package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i21 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f3398a;

    /* JADX INFO: renamed from: b */
    public final Configuration f3399b;

    /* JADX INFO: renamed from: c */
    public final int f3400c;

    public i21(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f3398a = colorStateList;
        this.f3399b = configuration;
        this.f3400c = theme == null ? 0 : theme.hashCode();
    }
}
