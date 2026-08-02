package androidx.savedstate.serialization;

import io.flutter.plugins.webviewflutter.DownloadListenerProxyApi;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlinx.serialization.b defaultSerializersModuleOnPlatform$lambda$1$lambda$0;
        Unit lambda$onDownloadStart$0;
        switch (this.a) {
            case 0:
                defaultSerializersModuleOnPlatform$lambda$1$lambda$0 = SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
                return defaultSerializersModuleOnPlatform$lambda$1$lambda$0;
            default:
                lambda$onDownloadStart$0 = DownloadListenerProxyApi.DownloadListenerImpl.lambda$onDownloadStart$0((Result) obj);
                return lambda$onDownloadStart$0;
        }
    }
}
