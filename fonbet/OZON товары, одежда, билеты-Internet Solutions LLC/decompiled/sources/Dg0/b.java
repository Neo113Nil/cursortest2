package Dg0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LDg0/b;", "", "LDg0/a;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "enabled", "<init>", "(LDg0/a;Z)V", "copy", "(LDg0/a;Z)LDg0/b;", "LDg0/a;", "getName", "()LDg0/a;", "Z", "getEnabled", "()Z", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    private final boolean enabled;

    @NotNull
    private final a name;

    public b(@NotNull a name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.enabled = z11;
    }

    public static /* synthetic */ b copy$default(b bVar, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = bVar.name;
        }
        if ((i11 & 2) != 0) {
            z11 = bVar.enabled;
        }
        return bVar.copy(aVar, z11);
    }

    @NotNull
    public final b copy(@NotNull a name, boolean enabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(name, enabled);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.name == bVar.name && this.enabled == bVar.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final a getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FeatureFlagModel(name=" + this.name + ", enabled=" + this.enabled + ")";
    }
}
