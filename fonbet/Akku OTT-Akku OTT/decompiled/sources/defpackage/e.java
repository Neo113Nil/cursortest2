package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.x;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.pathprovider.Messages;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BasicMessageChannel.MessageHandler, OnSuccessListener, ObjectConstructor, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newDefaultConstructor$8;
        lambda$newDefaultConstructor$8 = ConstructorConstructor.lambda$newDefaultConstructor$8((String) this.b);
        return lambda$newDefaultConstructor$8;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseMultiFactor.lambda$resolveSignIn$4((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List b;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                try {
                    hVar.a((c) obj2);
                    b = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    b = k.b(th);
                }
                reply.reply(b);
                break;
            case 1:
            case 2:
            case 5:
            default:
                Messages.PathProviderApi.lambda$setUp$1((Messages.PathProviderApi) this.b, obj, reply);
                break;
            case 3:
                B b2 = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                b2.f((String) obj3, new x(reply, 0));
                break;
            case 4:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$1$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            case 6:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.lambda$setUp$2((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.b).invoke(obj);
    }
}
