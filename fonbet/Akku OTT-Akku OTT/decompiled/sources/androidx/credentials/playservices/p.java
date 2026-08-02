package androidx.credentials.playservices;

import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import dev.fluttercommunity.workmanager.pigeon.B;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.pathprovider.Messages;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnSuccessListener, b.a, ObjectConstructor, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newDefaultConstructor$9;
        lambda$newDefaultConstructor$9 = ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) this.b);
        return lambda$newDefaultConstructor$9;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        return ((com.google.android.datatransport.runtime.scheduling.persistence.c) this.b).q();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseMultiFactor.lambda$enrollTotp$1((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                B b = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                b.c((String) obj2, new androidx.compose.runtime.snapshots.g(reply, 1));
                break;
            case 4:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$3$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            default:
                Messages.PathProviderApi.lambda$setUp$3((Messages.PathProviderApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.b).invoke(obj);
    }
}
