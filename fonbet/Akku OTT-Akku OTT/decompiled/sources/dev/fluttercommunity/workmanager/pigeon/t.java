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
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasicMessageChannel.Reply b;

    public /* synthetic */ t(BasicMessageChannel.Reply reply, int i) {
        this.a = i;
        this.b = reply;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listOf;
        Unit up$lambda$7$0$0;
        switch (this.a) {
            case 0:
                Throwable exception = Result.m1719exceptionOrNullimpl(((Result) obj).getValue());
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
                    reply.reply(CollectionsKt.listOf((Object) null));
                }
                return Unit.INSTANCE;
            default:
                up$lambda$7$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$7$0$0(this.b, (Result) obj);
                return up$lambda$7$0$0;
        }
    }
}
