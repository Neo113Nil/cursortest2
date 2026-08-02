package dev.fluttercommunity.workmanager.pigeon;

import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {
    public static final a Companion = new a();
    public static final Lazy<n> b = LazyKt.lazy(new androidx.activity.result.e(1));
    public final BinaryMessenger a;

    public static final class a {
    }

    public r(BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        this.a = binaryMessenger;
    }
}
