package dev.fluttercommunity.workmanager.pigeon;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements BasicMessageChannel.Reply, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$updateEmail$10((GeneratedAndroidFirebaseAuth.Result) this.a, (FirebaseUser) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        dev.fluttercommunity.workmanager.b bVar = (dev.fluttercommunity.workmanager.b) this.a;
        String channelName = (String) this.b;
        if (!(obj instanceof List)) {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNullParameter(channelName, "channelName");
            bVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new f("channel-error", android.support.v4.media.b.b("Unable to establish connection on channel: '", channelName, "'."), "")))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Result.Companion companion2 = Result.INSTANCE;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            bVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new f((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            Result.Companion companion3 = Result.INSTANCE;
            bVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new f("null-error", "Flutter api returned null value for non-null return value.", "")))));
            return;
        }
        Object obj4 = list.get(0);
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj4;
        bool.getClass();
        bVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(bool)));
    }
}
