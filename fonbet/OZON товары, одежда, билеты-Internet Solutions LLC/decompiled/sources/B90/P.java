package B90;

import android.os.Bundle;
import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements Preference.d, b.c, androidx.fragment.app.M, OnErrorPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3116a;

    public /* synthetic */ P(Object obj) {
        this.f3116a = obj;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        return I.k.a(aVar, (com.google.common.util.concurrent.m) this.f3116a);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.e0((FintechPreferencesFragment) this.f3116a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        NotificationSubscriptionBannerDelegate.observeViewEffects$lambda$0((NotificationSubscriptionBannerDelegate) this.f3116a, str, bundle);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$26((StoryMediaFragment) this.f3116a, str, exc, bool);
    }
}
