package androidx.credentials.playservices;

import android.view.Display;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.offline.ProgressiveDownloader;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseTotpMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.pathprovider.Messages;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnFailureListener, ListenerSet.Event, ListenerSet.Event, CacheWriter.ProgressListener, VideoFrameReleaseHelper.DisplayHelper.Listener, ObjectConstructor, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$get$4;
        lambda$get$4 = ConstructorConstructor.lambda$get$4((String) this.b);
        return lambda$get$4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$50((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                com.google.android.exoplayer2.SimpleBasePlayer.lambda$updateStateAndInformListeners$56((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseTotpMultiFactor.lambda$generateSecret$0((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
    public void onDefaultDisplayChanged(Display display) {
        ((VideoFrameReleaseHelper) this.b).updateDefaultDisplayRefreshRateParams(display);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleBeginSignIn$lambda$10$lambda$9((HiddenActivity) this.b, exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 6:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$6$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            default:
                Messages.PathProviderApi.lambda$setUp$6((Messages.PathProviderApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.b).onProgress(j, j2, j3);
    }
}
