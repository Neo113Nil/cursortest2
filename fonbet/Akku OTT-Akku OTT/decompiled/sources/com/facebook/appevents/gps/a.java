package com.facebook.appevents.gps;

import android.content.Context;
import android.os.Bundle;
import com.facebook.S;
import com.facebook.appevents.z;
import com.facebook.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class a {
    public static final C0078a Companion = new C0078a();
    public static final boolean b;
    public final z a;

    /* renamed from: com.facebook.appevents.gps.a$a, reason: collision with other inner class name */
    public static final class C0078a {
    }

    static {
        b = Random.INSTANCE.nextDouble() <= 1.0E-4d;
    }

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new z(context);
    }

    public final void a(Bundle bundle, String str) {
        boolean contains$default;
        if (b) {
            contains$default = StringsKt__StringsKt.contains$default(str, "gps", false, 2, (Object) null);
            if (contains$default) {
                z zVar = this.a;
                zVar.getClass();
                w wVar = w.a;
                if (S.c()) {
                    zVar.a.h(bundle, str);
                }
            }
        }
    }
}
