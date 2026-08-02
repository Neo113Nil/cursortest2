package androidx.credentials.playservices;

import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.v;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnSuccessListener, b.a, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        ((com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.b).i.d();
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$unlink$9((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                B b = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type dev.fluttercommunity.workmanager.pigeon.ProcessingTaskRequest");
                b.a((dev.fluttercommunity.workmanager.pigeon.l) obj2, new v(reply));
                break;
            case 3:
            default:
                Messages.ImagePickerApi.lambda$setUp$3((Messages.ImagePickerApi) this.b, obj, reply);
                break;
            case 4:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.lambda$setUp$0((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.b).invoke(obj);
    }
}
