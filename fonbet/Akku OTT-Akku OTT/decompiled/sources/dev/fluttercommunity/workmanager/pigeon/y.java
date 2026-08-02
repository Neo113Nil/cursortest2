package dev.fluttercommunity.workmanager.pigeon;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasicMessageChannel.Reply b;

    public /* synthetic */ y(BasicMessageChannel.Reply reply, int i) {
        this.a = i;
        this.b = reply;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listOf;
        Unit up$lambda$3$0$0;
        switch (this.a) {
            case 0:
                Result result = (Result) obj;
                Throwable exception = Result.m1719exceptionOrNullimpl(result.getValue());
                BasicMessageChannel.Reply reply = this.b;
                if (exception != null) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof f) {
                        f fVar = (f) exception;
                        listOf = CollectionsKt.listOf(fVar.a, fVar.b, fVar.c);
                    } else {
                        listOf = CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception)});
                    }
                    reply.reply(listOf);
                } else {
                    Object value = result.getValue();
                    if (Result.m1722isFailureimpl(value)) {
                        value = null;
                    }
                    reply.reply(CollectionsKt.listOf((String) value));
                }
                return Unit.INSTANCE;
            default:
                up$lambda$3$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$0$0(this.b, (Result) obj);
                return up$lambda$3$0$0;
        }
    }
}
