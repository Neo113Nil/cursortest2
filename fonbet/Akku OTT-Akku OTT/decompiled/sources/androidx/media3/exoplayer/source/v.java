package androidx.media3.exoplayer.source;

import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;
import androidx.compose.ui.graphics.C0232h;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.ExtractorsFactory;
import com.akku.ottapp.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ProgressiveMediaExtractor.Factory, MethodChannel.MethodCallHandler, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ v(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$new$0;
        lambda$new$0 = ProgressiveMediaSource.Factory.lambda$new$0((ExtractorsFactory) this.a, playerId);
        return lambda$new$0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$fetchSignInMethodsForEmail$10((GeneratedAndroidFirebaseAuth.Result) this.a, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        PictureInPictureParams build;
        boolean enterPictureInPictureMode;
        MainActivity mainActivity = (MainActivity) this.a;
        int i = MainActivity.e;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "showNativeView")) {
            result.notImplemented();
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                result.success(Boolean.FALSE);
                return;
            }
            Rational rational = new Rational(16, 9);
            C0232h.d();
            PictureInPictureParams.Builder b = androidx.browser.trusted.f.b();
            b.setAspectRatio(rational);
            build = b.build();
            enterPictureInPictureMode = mainActivity.enterPictureInPictureMode(build);
            result.success(Boolean.valueOf(enterPictureInPictureMode));
        } catch (Exception e) {
            result.error("PIP_ERROR", "Failed to enter PiP mode", e.getMessage());
        }
    }
}
