package X00;

import L00.l;
import We.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z f33950a;

    public e(@NotNull z headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f33950a = headers;
    }

    @Override // L00.l
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f33950a.c(name);
    }

    @Override // L00.l
    @NotNull
    public final List<String> headers(@NotNull String str) {
        Intrinsics.checkNotNullParameter("server-timing", AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.f33950a.l("server-timing");
    }

    @Override // L00.l
    @NotNull
    public final Map<String, List<String>> toMultimap() {
        return this.f33950a.i();
    }
}
