package dev.fluttercommunity.workmanager.pigeon;

import androidx.media3.common.C0324i;
import androidx.media3.common.C0325j;
import androidx.media3.common.C0326k;
import dev.fluttercommunity.workmanager.WorkmanagerPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface B {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Lazy<n> b = LazyKt.lazy(new s());

        public static MessageCodec a() {
            return b.getValue();
        }

        public static void b(a aVar, BinaryMessenger binaryMessenger, WorkmanagerPlugin workmanagerPlugin) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
            String concat = "".length() > 0 ? ".".concat("") : "";
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.initialize", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel.setMessageHandler(new C0324i(workmanagerPlugin, 2));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.registerOneOffTask", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel2.setMessageHandler(new C0325j(workmanagerPlugin, 6));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.registerPeriodicTask", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel3.setMessageHandler(new C0326k(workmanagerPlugin, 2));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.registerProcessingTask", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel4.setMessageHandler(new androidx.credentials.playservices.n(workmanagerPlugin, 2));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.cancelByUniqueName", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel5.setMessageHandler(new androidx.credentials.playservices.o(workmanagerPlugin, 3));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.cancelByTag", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel6.setMessageHandler(new defpackage.e(workmanagerPlugin, 3));
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.cancelAll", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel7.setMessageHandler(new defpackage.f(workmanagerPlugin, 4));
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.isScheduledByUniqueName", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel8.setMessageHandler(new androidx.credentials.playservices.p(workmanagerPlugin, 3));
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.workmanager_platform_interface.WorkmanagerHostApi.printScheduledTasks", concat), a());
            if (workmanagerPlugin != null) {
                basicMessageChannel9.setMessageHandler(new androidx.credentials.playservices.q(workmanagerPlugin, 5));
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
        }
    }

    void a(l lVar, v vVar);

    void b(k kVar, A a2);

    void c(String str, androidx.compose.runtime.snapshots.g gVar);

    void d(i iVar, w wVar);

    void e(g gVar, u uVar);

    void f(String str, x xVar);

    void g(z zVar);

    void h(y yVar);

    void i(String str, t tVar);
}
