package androidx.fragment.app;

import androidx.media3.common.audio.DefaultGainProvider;
import com.facebook.internal.C0715k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements DefaultGainProvider.FadeProvider, C0715k.a, ComponentRegistrarProcessor {
    public static String a(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        if (z) {
            com.facebook.w.o = true;
        }
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j2) {
        float lambda$static$3;
        lambda$static$3 = DefaultGainProvider.lambda$static$3(j, j2);
        return lambda$static$3;
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
