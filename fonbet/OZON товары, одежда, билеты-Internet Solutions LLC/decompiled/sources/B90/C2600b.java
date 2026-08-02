package B90;

import android.os.Bundle;
import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import f50.C6438a;
import io.sentry.InterfaceC7217w1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2600b implements Preference.d, OnBufferPlayerControllerListener, androidx.fragment.app.M, b.c, E6.d, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3135a;

    public /* synthetic */ C2600b(Object obj) {
        this.f3135a = obj;
    }

    @Override // E6.d
    public void b(float f7, float f11, float f12) {
        C6438a.t((C6438a) this.f3135a);
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3135a).set(aVar);
        return "mReleasedFuture";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.j0((FintechPreferencesFragment) this.f3135a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    @Override // io.sentry.InterfaceC7217w1
    public void e(io.sentry.U scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        ((kotlin.jvm.internal.M) this.f3135a).f71787a = new ArrayList(scope.q());
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        RefreshByOrderChangeConfigurator.changeDeliveryTimeResultListener$lambda$1((RefreshByOrderChangeConfigurator) this.f3135a, str, bundle);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$4((MediaCentricVideoViewHolder) this.f3135a);
    }
}
