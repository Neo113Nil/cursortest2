package androidx.work.impl.model;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import java.util.HashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1;
        Unit upMessageHandlers$lambda$2$0$0;
        switch (this.a) {
            case 0:
                lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1 = ((WorkSpecDao_Impl) this.b).lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
                return lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1;
            default:
                upMessageHandlers$lambda$2$0$0 = PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$2$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return upMessageHandlers$lambda$2$0$0;
        }
    }
}
