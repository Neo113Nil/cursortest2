package androidx.browser.browseractions;

import com.facebook.appevents.codeless.b;
import com.facebook.internal.C0715k;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements C0715k.a, ListenerSet.Event {
    public static int a(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static StringBuilder c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            b bVar = b.a;
            if (com.facebook.internal.instrument.crashshield.a.b(b.class)) {
                return;
            }
            try {
                b.f.set(true);
                return;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, b.class);
                return;
            }
        }
        b bVar2 = b.a;
        if (com.facebook.internal.instrument.crashshield.a.b(b.class)) {
            return;
        }
        try {
            b.f.set(false);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, b.class);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
