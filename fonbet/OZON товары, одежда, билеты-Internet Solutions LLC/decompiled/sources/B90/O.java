package B90;

import android.os.SystemClock;
import android.view.View;
import androidx.camera.core.impl.C5117s0;
import androidx.concurrent.futures.b;
import androidx.core.view.C5353y0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.preference.Preference;
import io.sentry.InterfaceC7217w1;
import io.sentry.android.replay.ReplayIntegration;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class O implements Preference.c, androidx.core.view.D, b.c, xZ.i, InterfaceC7217w1, OnBufferPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3115a;

    public /* synthetic */ O(Object obj) {
        this.f3115a = obj;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.z((FintechPreferencesFragment) this.f3115a);
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(final b.a aVar) {
        final C5117s0 c5117s0 = (C5117s0) this.f3115a;
        c5117s0.getClass();
        H.c.e().execute(new Runnable() { // from class: androidx.camera.core.impl.q0
            @Override // java.lang.Runnable
            public final void run() {
                C5117s0.b bVar = (C5117s0.b) C5117s0.this.f38386a.getValue();
                b.a aVar2 = aVar;
                if (bVar == null) {
                    aVar2.e(new IllegalStateException("Observable has not yet been initialized with a value."));
                } else {
                    aVar2.c(bVar.b());
                }
            }
        });
        return c5117s0 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m onCreate$lambda$1;
        onCreate$lambda$1 = OzonSelectActivity.onCreate$lambda$1((String) this.f3115a);
        return onCreate$lambda$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC7217w1
    public void e(io.sentry.U it) {
        int i11 = ReplayIntegration.f67417r;
        Intrinsics.checkNotNullParameter(it, "it");
        String a11 = it.a();
        ((kotlin.jvm.internal.M) this.f3115a).f71787a = a11 != null ? kotlin.text.h.j0('.', a11, a11) : 0;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 configAppBar$lambda$8$lambda$7;
        configAppBar$lambda$8$lambda$7 = TransparentNavBarV2WidgetViewHolder.configAppBar$lambda$8$lambda$7((TransparentNavBarV2WidgetViewHolder) this.f3115a, view, c5353y0);
        return configAppBar$lambda$8$lambda$7;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$25((StoryMediaFragment) this.f3115a);
    }
}
