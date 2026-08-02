package androidx.compose.runtime.snapshots;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Snapshot takeNewSnapshot$lambda$12;
        List listOf;
        Unit readLines$lambda$0;
        switch (this.a) {
            case 0:
                takeNewSnapshot$lambda$12 = SnapshotKt.takeNewSnapshot$lambda$12((Function1) this.b, (SnapshotIdSet) obj);
                return takeNewSnapshot$lambda$12;
            case 1:
                BasicMessageChannel.Reply reply = (BasicMessageChannel.Reply) this.b;
                Result result = (Result) obj;
                Throwable exception = Result.m1719exceptionOrNullimpl(result.getValue());
                if (exception != null) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof dev.fluttercommunity.workmanager.pigeon.f) {
                        dev.fluttercommunity.workmanager.pigeon.f fVar = (dev.fluttercommunity.workmanager.pigeon.f) exception;
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
                    reply.reply(CollectionsKt.listOf((Boolean) value));
                }
                return Unit.INSTANCE;
            default:
                readLines$lambda$0 = TextStreamsKt.readLines$lambda$0((ArrayList) this.b, (String) obj);
                return readLines$lambda$0;
        }
    }
}
