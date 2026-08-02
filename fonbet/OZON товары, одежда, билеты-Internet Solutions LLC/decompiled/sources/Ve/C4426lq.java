package Ve;

import B90.C2618u;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.lq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4426lq {

    /* renamed from: a, reason: collision with root package name */
    public final Rm0.b f31542a;

    public C4426lq(Context context, M8.b settings, C2618u dependencies) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Rm0.b a11 = new Rm0.c(context, settings, dependencies).a();
        Intrinsics.checkNotNullExpressionValue(a11, "BmsSdkBuilder(context, s…itListener(this).create()");
        this.f31542a = a11;
    }
}
