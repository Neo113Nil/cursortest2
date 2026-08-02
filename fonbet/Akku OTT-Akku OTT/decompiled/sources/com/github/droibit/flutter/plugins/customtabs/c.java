package com.github.droibit.flutter.plugins.customtabs;

import androidx.media3.common.G;
import androidx.media3.common.H;
import androidx.media3.common.I;
import androidx.media3.common.K;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface c {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Lazy<i> b = LazyKt.lazy(new com.github.droibit.flutter.plugins.customtabs.a());

        public static void a(a aVar, BinaryMessenger binaryMessenger, c cVar) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
            String concat = "".length() > 0 ? ".".concat("") : "";
            String a2 = defpackage.g.a("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.launch", concat);
            Lazy<i> lazy = b;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, a2, lazy.getValue());
            if (cVar != null) {
                basicMessageChannel.setMessageHandler(new G(cVar, 2));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.closeAllIfPossible", concat), lazy.getValue());
            if (cVar != null) {
                basicMessageChannel2.setMessageHandler(new H(cVar, 3));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.warmup", concat), lazy.getValue());
            if (cVar != null) {
                basicMessageChannel3.setMessageHandler(new I(cVar, 1));
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.mayLaunch", concat), lazy.getValue());
            if (cVar != null) {
                basicMessageChannel4.setMessageHandler(new b(cVar, 0));
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, defpackage.g.a("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.invalidate", concat), lazy.getValue());
            if (cVar != null) {
                basicMessageChannel5.setMessageHandler(new K(cVar, 2));
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }
    }

    void a(String str);

    void b(String str, Map map, boolean z);

    void c();

    String d(Map<String, ? extends Object> map);

    void e(String str, List list);
}
