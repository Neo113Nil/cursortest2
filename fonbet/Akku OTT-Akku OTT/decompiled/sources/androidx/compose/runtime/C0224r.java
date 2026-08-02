package androidx.compose.runtime;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.runtime.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0224r implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0224r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer extractNestedStates$lambda$1;
        Unit up$lambda$8$0$0;
        switch (this.a) {
            case 0:
                extractNestedStates$lambda$1 = MovableContentState.extractNestedStates$lambda$1((MovableContentState) this.b, (MovableContentStateReference) obj);
                return extractNestedStates$lambda$1;
            default:
                up$lambda$8$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$8$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return up$lambda$8$0$0;
        }
    }
}
