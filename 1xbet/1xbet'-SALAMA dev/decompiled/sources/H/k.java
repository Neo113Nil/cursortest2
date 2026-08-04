package H;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3173b;

    public k(Resources resources, Resources.Theme theme) {
        this.f3172a = resources;
        this.f3173b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3172a.equals(kVar.f3172a) && Objects.equals(this.f3173b, kVar.f3173b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3172a, this.f3173b);
    }
}
