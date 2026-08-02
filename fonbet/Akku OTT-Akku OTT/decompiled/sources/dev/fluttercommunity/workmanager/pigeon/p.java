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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements BasicMessageChannel.Reply, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$updateProfile$16((GeneratedAndroidFirebaseAuth.Result) this.a, (FirebaseUser) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        dev.fluttercommunity.workmanager.a aVar = (dev.fluttercommunity.workmanager.a) this.a;
        String channelName = (String) this.b;
        if (!(obj instanceof List)) {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNullParameter(channelName, "channelName");
            aVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new f("channel-error", android.support.v4.media.b.b("Unable to establish connection on channel: '", channelName, "'."), "")))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            Result.Companion companion2 = Result.INSTANCE;
            aVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        aVar.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new f((String) obj2, (String) obj3, (String) list.get(2))))));
    }
}
