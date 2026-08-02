package androidx.collection;

import android.content.Context;
import androidx.credentials.CredentialManager;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import com.facebook.internal.C0715k;
import com.facebook.w;
import com.google.android.gms.measurement.internal.zzic;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Consumer, C0715k.a, GoogleSignInPlugin.CredentialManagerFactory {
    public static StringBuilder a(CharSequence charSequence, String str, Function2 function2, String str2, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    public static void c(zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static void d(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.appevents.gps.ara.a aVar = com.facebook.appevents.gps.ara.a.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.gps.ara.a.class)) {
                return;
            }
            try {
                com.facebook.appevents.gps.ara.a.b = true;
                com.facebook.appevents.gps.ara.a.c = new com.facebook.appevents.gps.a(w.a());
                com.facebook.appevents.gps.ara.a.d = "https://www." + w.s + "/privacy_sandbox/mobile/register/trigger";
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.gps.ara.a.class);
            }
        }
    }

    @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.CredentialManagerFactory
    public CredentialManager create(Context context) {
        CredentialManager create;
        create = CredentialManager.create(context);
        return create;
    }
}
