package com.google.android.exoplayer2;

import android.widget.AutoCompleteTextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class L0 implements com.google.common.util.concurrent.h, AccessibilityManagerCompat.TouchExplorationStateChangeListener, OnCompleteListener, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply, EventListener.Factory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.util.concurrent.h
    public com.google.common.util.concurrent.u apply(Object obj) {
        com.google.common.util.concurrent.u lambda$handleReplaceMediaItems$30;
        lambda$handleReplaceMediaItems$30 = SimpleBasePlayer.lambda$handleReplaceMediaItems$30((com.google.common.util.concurrent.u) this.b, obj);
        return lambda$handleReplaceMediaItems$30;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener asFactory$lambda$9;
        asFactory$lambda$9 = _UtilJvmKt.asFactory$lambda$9((EventListener) this.b, call);
        return asFactory$lambda$9;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$11((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$13((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            default:
                PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiHttpAuthHandler) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        com.google.android.material.textfield.q qVar = (com.google.android.material.textfield.q) this.b;
        AutoCompleteTextView autoCompleteTextView = qVar.h;
        if (autoCompleteTextView == null || com.google.android.material.textfield.r.a(autoCompleteTextView)) {
            return;
        }
        ViewCompat.setImportantForAccessibility(qVar.d, z ? 2 : 1);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebSettingsCompat.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.pigeon_newInstance", obj);
    }
}
