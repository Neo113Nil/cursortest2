package dev.fluttercommunity.workmanager;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i {
    public static final b Companion = new b();
    public static final a a = new a();

    public static final class a extends i {
    }

    public static final class b {
        public static void a(Context context, IllegalStateException exception) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(exception, "exception");
            i.a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(exception, "exception");
        }
    }
}
