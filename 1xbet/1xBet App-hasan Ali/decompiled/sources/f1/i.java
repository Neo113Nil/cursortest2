package f1;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f16959a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f16960b;

    public i(Resources resources, Resources.Theme theme) {
        this.f16959a = resources;
        this.f16960b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f16959a.equals(iVar.f16959a) && Objects.equals(this.f16960b, iVar.f16960b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16959a, this.f16960b);
    }
}
