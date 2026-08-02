package dev.fluttercommunity.workmanager.pigeon;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {
    public final /* synthetic */ BasicMessageChannel.Reply a;

    public /* synthetic */ v(BasicMessageChannel.Reply reply) {
        this.a = reply;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listOf;
        Throwable exception = Result.m1719exceptionOrNullimpl(((Result) obj).getValue());
        BasicMessageChannel.Reply reply = this.a;
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
    }
}
