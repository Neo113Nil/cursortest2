package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes6.dex */
public final class U3 implements M3 {
    @Override // com.inmobi.media.M3
    public final void a(C4066s3 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        String str = "Processing click (" + click.b + ") completed";
        LinkedHashMap linkedHashMap = X3.j;
        C3582b0 c3582b0 = (C3582b0) linkedHashMap.get(Integer.valueOf(click.f7366a));
        if (c3582b0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            c3582b0.f7020a.a(c3582b0.b);
        }
        linkedHashMap.remove(Integer.valueOf(click.f7366a));
        BuildersKt__BuildersKt.runBlocking$default(null, new T3(click, null), 1, null);
    }

    @Override // com.inmobi.media.M3
    public final void a(C4066s3 click, B6 errorCode) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        String str = "Pinging click (" + click.b + ") failed! Updating retry counts and timestamps ...";
        if (click.f == 0) {
            X3 x32 = X3.f6941a;
            X3.a(click, errorCode.name());
        }
        X3 x33 = X3.f6941a;
        X3.b(click);
        X3.f();
    }
}
