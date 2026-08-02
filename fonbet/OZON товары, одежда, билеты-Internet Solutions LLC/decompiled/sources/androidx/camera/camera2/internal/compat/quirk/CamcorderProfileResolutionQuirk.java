package androidx.camera.camera2.internal.compat.quirk;

import C.S;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.C10345M;
import w.C10368u;

/* loaded from: classes8.dex */
public class CamcorderProfileResolutionQuirk implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private final C10345M f38030a;

    /* renamed from: b, reason: collision with root package name */
    private List<Size> f38031b = null;

    public CamcorderProfileResolutionQuirk(@NonNull C10368u c10368u) {
        this.f38030a = c10368u.b();
    }

    @NonNull
    public final ArrayList e() {
        if (this.f38031b == null) {
            Size[] c11 = this.f38030a.c(34);
            this.f38031b = c11 != null ? Arrays.asList((Size[]) c11.clone()) : Collections.EMPTY_LIST;
            S.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f38031b);
        }
        return new ArrayList(this.f38031b);
    }
}
