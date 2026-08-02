package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.MetadataRetriever;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.WorkDatabase;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0325j implements SimpleBasePlayer.PositionSupplier, MetadataRetriever.MetadataRetrieverInternal.OnFailureListener, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, SupportSQLiteOpenHelper.Factory, ListenerSet.Event, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0325j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        SupportSQLiteOpenHelper create$lambda$0;
        create$lambda$0 = WorkDatabase.Companion.create$lambda$0((Context) this.b, configuration);
        return create$lambda$0;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return ((Player) this.b).getContentBufferedPosition();
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((AnalyticsListener) obj).onSeekStarted((AnalyticsListener.EventTime) this.b);
                break;
            default:
                com.google.android.exoplayer2.SimpleBasePlayer.lambda$updateStateAndInformListeners$49((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$19((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnFailureListener
    public void onFailure(Exception exc) {
        ((MetadataRetriever) this.b).lambda$startPreparation$1(exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 6:
                dev.fluttercommunity.workmanager.pigeon.B b = (dev.fluttercommunity.workmanager.pigeon.B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type dev.fluttercommunity.workmanager.pigeon.OneOffTaskRequest");
                b.d((dev.fluttercommunity.workmanager.pigeon.i) obj2, new dev.fluttercommunity.workmanager.pigeon.w(reply, 0));
                break;
            case 7:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$10$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            case 8:
            default:
                Messages.ImagePickerApi.lambda$setUp$1((Messages.ImagePickerApi) this.b, obj, reply);
                break;
            case 9:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.lambda$setUp$1((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectImageTrack$5;
        lambda$selectImageTrack$5 = DefaultTrackSelector.lambda$selectImageTrack$5((DefaultTrackSelector.Parameters) this.b, i, trackGroup, iArr);
        return lambda$selectImageTrack$5;
    }
}
