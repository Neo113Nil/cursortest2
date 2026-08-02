package androidx.compose.runtime.collection;

import androidx.media3.common.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ListenerSet.IterationFinishedEvent {
    public static int a(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String b(String str, int i, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static void c(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }
}
