package com.google.android.exoplayer2.analytics;

import android.os.Parcelable;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes4.dex */
public final /* synthetic */ class T implements ListenerSet.Event, OnCompleteListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ T(Object obj, Parcelable parcelable) {
        this.a = obj;
        this.b = parcelable;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.a, (Metadata) this.b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$updatePassword$12((GeneratedAndroidFirebaseAuth.Result) this.a, (FirebaseUser) this.b, task);
    }
}
