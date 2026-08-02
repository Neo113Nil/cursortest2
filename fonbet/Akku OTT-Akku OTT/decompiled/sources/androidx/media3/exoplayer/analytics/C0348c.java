package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import com.google.android.gms.tasks.OnFailureListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.exoplayer.analytics.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0348c implements ListenerSet.Event, TrackSelectionUtil.AdaptiveTrackSelectionFactory, OnFailureListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0348c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        ExoTrackSelection lambda$createTrackSelections$0;
        lambda$createTrackSelections$0 = ((RandomTrackSelection.Factory) this.b).lambda$createTrackSelections$0(definition);
        return lambda$createTrackSelections$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlayerReleased((AnalyticsListener.EventTime) this.b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        androidx.compose.runtime.I i = (androidx.compose.runtime.I) this.b;
        Intrinsics.checkNotNullParameter(exception, "exception");
        String a = defpackage.g.a("Failed to get phone number hint intent: ", exception.getMessage());
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new Exception(a)))));
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$8((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            default:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$8$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
        }
    }
}
