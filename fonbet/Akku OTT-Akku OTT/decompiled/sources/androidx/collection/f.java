package androidx.collection;

import android.content.Context;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.facebook.internal.C0715k;
import com.google.android.gms.auth.api.identity.InterfaceC0807a;
import com.google.android.gms.measurement.internal.zzic;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import kotlin.ULong;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements ListenerSet.IterationFinishedEvent, C0715k.a, com.google.android.datatransport.g, GoogleSignInPlugin.AuthorizationClientFactory {
    public static long a(long j, long j2) {
        return ULong.m1890constructorimpl(ULong.m1890constructorimpl(j) * j2);
    }

    public static void c(zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    @Override // com.google.android.datatransport.g
    public Object apply(Object obj) {
        byte[] lambda$static$0;
        lambda$static$0 = DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
        return lambda$static$0;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.gps.pa.a.a();
        }
    }

    @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.AuthorizationClientFactory
    public InterfaceC0807a create(Context context) {
        InterfaceC0807a lambda$initInstance$1;
        lambda$initInstance$1 = GoogleSignInPlugin.lambda$initInstance$1(context);
        return lambda$initInstance$1;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }
}
