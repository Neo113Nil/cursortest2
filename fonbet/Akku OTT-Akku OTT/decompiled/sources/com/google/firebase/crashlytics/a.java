package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements AnalyticsEventLogger, OnFailureListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        ((AnalyticsDeferredProxy) this.a).lambda$getAnalyticsEventLogger$1(str, bundle);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleSignInPlugin.Delegate.lambda$authorize$3((Function1) this.a, exc);
    }
}
