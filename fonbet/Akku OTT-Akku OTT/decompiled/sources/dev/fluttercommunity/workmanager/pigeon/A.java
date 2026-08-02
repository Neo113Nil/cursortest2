package dev.fluttercommunity.workmanager.pigeon;

import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class A implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listOf;
        Unit up$lambda$2$0$0;
        boolean retainAll$lambda$5;
        switch (this.a) {
            case 0:
                BasicMessageChannel.Reply reply = (BasicMessageChannel.Reply) this.b;
                Throwable exception = Result.m1719exceptionOrNullimpl(((Result) obj).getValue());
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
            case 1:
                up$lambda$2$0$0 = FirebaseAnalyticsHostApi.Companion.setUp$lambda$2$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return up$lambda$2$0$0;
            default:
                retainAll$lambda$5 = SnapshotStateSet.retainAll$lambda$5((Collection) this.b, (Set) obj);
                return Boolean.valueOf(retainAll$lambda$5);
        }
    }
}
