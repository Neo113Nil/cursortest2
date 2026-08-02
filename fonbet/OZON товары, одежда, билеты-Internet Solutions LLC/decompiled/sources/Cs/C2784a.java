package Cs;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.analytics.di.AnalyticsDependencyComponent;
import ru.ozon.app.android.di.FactoryModule;

/* renamed from: Cs.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2784a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        AnalyticsDependencyComponent bindAnalyticsDependencyComponentFactory$lambda$2;
        bindAnalyticsDependencyComponentFactory$lambda$2 = FactoryModule.Companion.bindAnalyticsDependencyComponentFactory$lambda$2(c6740b);
        return bindAnalyticsDependencyComponentFactory$lambda$2;
    }
}
