package defpackage;

import dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface h {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Lazy<j> b = LazyKt.lazy(new d(0));

        public static void a(a aVar, BinaryMessenger binaryMessenger, WakelockPlusPlugin wakelockPlusPlugin) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
            String concat = "".length() > 0 ? ".".concat("") : "";
            String a2 = g.a("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", concat);
            Lazy<j> lazy = b;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, a2, lazy.getValue());
            if (wakelockPlusPlugin != null) {
                basicMessageChannel.setMessageHandler(new e(wakelockPlusPlugin, 0));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, g.a("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", concat), lazy.getValue());
            if (wakelockPlusPlugin != null) {
                basicMessageChannel2.setMessageHandler(new f(wakelockPlusPlugin, 0));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    void a(c cVar);

    b isEnabled();
}
