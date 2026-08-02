package io.flutter.plugins.firebase.analytics;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.internal.D0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit up$lambda$5$0$0;
        switch (this.a) {
            case 0:
                up$lambda$5$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$5$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return up$lambda$5$0$0;
            default:
                D0 d0 = (D0) this.b;
                int intValue = ((Integer) obj).intValue();
                return d0.e[intValue] + ": " + d0.g(intValue).h();
        }
    }
}
