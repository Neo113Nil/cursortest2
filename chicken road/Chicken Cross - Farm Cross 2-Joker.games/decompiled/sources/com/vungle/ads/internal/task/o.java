package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12138a;
    public final PathProvider b;

    public o(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f12138a = context;
        this.b = pathProvider;
    }

    public final c a(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            throw new n("Job tag is null");
        }
        if (Intrinsics.areEqual(tag, "CleanupJob")) {
            return new b(this.f12138a, this.b);
        }
        if (Intrinsics.areEqual(tag, "ResendTpatJob")) {
            return new l(this.f12138a, this.b);
        }
        throw new n(com.iab.omid.library.vungle.d.a("Unknown Job Type ", tag));
    }
}
