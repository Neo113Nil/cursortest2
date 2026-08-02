package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.flutter.plugins.webviewflutter.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1020t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1020t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit writeValue$lambda$31;
        Unit upMessageHandlers$lambda$13$0$0;
        switch (this.a) {
            case 0:
                writeValue$lambda$31 = AndroidWebkitLibraryPigeonProxyApiBaseCodec.writeValue$lambda$31(this.b, (Result) obj);
                return writeValue$lambda$31;
            default:
                upMessageHandlers$lambda$13$0$0 = PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return upMessageHandlers$lambda$13$0$0;
        }
    }
}
