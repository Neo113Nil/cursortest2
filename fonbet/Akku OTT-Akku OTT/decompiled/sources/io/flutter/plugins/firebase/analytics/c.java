package io.flutter.plugins.firebase.analytics;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.AbstractC1198m;
import okio.C;

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
        Unit up$lambda$10$0$0;
        C listRecursively$lambda$2;
        switch (this.a) {
            case 0:
                up$lambda$10$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$10$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return up$lambda$10$0$0;
            default:
                listRecursively$lambda$2 = AbstractC1198m.listRecursively$lambda$2((AbstractC1198m) this.b, (C) obj);
                return listRecursively$lambda$2;
        }
    }
}
