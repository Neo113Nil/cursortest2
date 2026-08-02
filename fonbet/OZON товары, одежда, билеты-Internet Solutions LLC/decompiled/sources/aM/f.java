package aM;

import io.sentry.C7209u1;
import io.sentry.InterfaceC7142f0;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.android.core.ActivityLifecycleIntegration;
import java.util.List;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.ui.TabNavigationFragment;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;

/* loaded from: classes7.dex */
public final /* synthetic */ class f implements OnBottomNavigationItemSelectedListener, InterfaceC7217w1, C7209u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36500b;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f36499a = obj;
        this.f36500b = obj2;
    }

    @Override // io.sentry.C7209u1.c
    public void a(InterfaceC7142f0 interfaceC7142f0) {
        io.sentry.android.core.internal.gestures.e.b((io.sentry.android.core.internal.gestures.e) this.f36499a, (U) this.f36500b, interfaceC7142f0);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f36499a;
        activityLifecycleIntegration.getClass();
        u11.L(new Ur.a(activityLifecycleIntegration, u11, (InterfaceC7142f0) this.f36500b));
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean bindBottomNavigation$lambda$5;
        bindBottomNavigation$lambda$5 = TabNavigationFragment.bindBottomNavigation$lambda$5((List) this.f36499a, (TabNavigationFragment) this.f36500b, bottomMenuItem, bottomMenuItem2);
        return bindBottomNavigation$lambda$5;
    }
}
