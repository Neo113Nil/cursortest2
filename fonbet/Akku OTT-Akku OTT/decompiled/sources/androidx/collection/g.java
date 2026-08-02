package androidx.collection;

import androidx.credentials.Credential;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import com.facebook.internal.C0715k;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import kotlin.Lazy;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Consumer, C0715k.a, GoogleSignInPlugin.GoogleIdCredentialConverter {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static StringBuilder c(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            Lazy lazy = com.facebook.appevents.gps.topics.a.a;
            if (com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.gps.topics.a.class)) {
                return;
            }
            try {
                com.facebook.appevents.gps.topics.a.b.set(true);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.gps.topics.a.class);
            }
        }
    }

    @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.GoogleIdCredentialConverter
    public com.google.android.libraries.identity.googleid.d createFrom(Credential credential) {
        com.google.android.libraries.identity.googleid.d lambda$initInstance$2;
        lambda$initInstance$2 = GoogleSignInPlugin.lambda$initInstance$2(credential);
        return lambda$initInstance$2;
    }
}
