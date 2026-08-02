package ab0;

import B0.A0;
import eb0.d;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ab0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4991a {
    private static final d a(String str, String str2, String str3, boolean z11) {
        return new d(str, str2, z11, new d.a("HostConfig.".concat(str3), A0.b("HostConfig.", str3, ".Value")));
    }

    @NotNull
    public static final List<d> b(@NotNull Qa0.a hostAppInfo) {
        Intrinsics.checkNotNullParameter(hostAppInfo, "hostAppInfo");
        return C7714v.b0(a("Host App:", hostAppInfo.b(), "CurrentHostApp", false), a("Domain:", hostAppInfo.a(), "CurrentDomain", true));
    }
}
