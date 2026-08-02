package Fi0;

import Sc.InterfaceC4008j;
import fj0.d;
import fj0.f;
import fj0.g;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nj0.InterfaceC8600a;
import org.jetbrains.annotations.NotNull;
import qj0.C9073c;
import qj0.C9074d;
import qj0.InterfaceC9075e;
import ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.label.ConfigurationLabel;
import ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.locator.TestControlLocators;
import vi0.AbstractC10323a;

/* loaded from: classes3.dex */
public final class a implements InterfaceC8600a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ki0.a f9497a;

    public a(@NotNull Ki0.a prefixProvider) {
        Intrinsics.checkNotNullParameter(prefixProvider, "prefixProvider");
        this.f9497a = prefixProvider;
    }

    @Override // nj0.InterfaceC8600a
    public final d<?> a(@NotNull InterfaceC9075e<?> item) {
        InterfaceC4008j interfaceC4008j;
        Object obj;
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = AbstractC10323a.f102982b;
        String key = item.getKey();
        Intrinsics.checkNotNullParameter(key, "key");
        interfaceC4008j = AbstractC10323a.f102981a;
        Iterator it = ((Set) interfaceC4008j.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (h.D(((d) obj).getKey(), key, true)) {
                break;
            }
        }
        return (d) obj;
    }

    @Override // nj0.InterfaceC8600a
    public final g<?> b(@NotNull InterfaceC9075e<?> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof C9074d) {
            C9074d c9074d = (C9074d) item;
            return new f(c9074d.getKey(), c9074d.c().booleanValue(), c9074d.a());
        }
        if (!(item instanceof C9073c)) {
            return null;
        }
        C9073c c9073c = (C9073c) item;
        Integer w02 = h.w0(c9073c.c());
        if (w02 != null) {
            return new fj0.h(c9073c.getKey(), w02.intValue(), c9073c.a());
        }
        return null;
    }

    @Override // nj0.InterfaceC8600a
    public final InterfaceC9075e<?> c(@NotNull g<?> item) {
        String str;
        String str2;
        String str3;
        String resetLocator;
        String controlLocator;
        Intrinsics.checkNotNullParameter(item, "item");
        String key = item.getKey();
        TestControlLocators.INSTANCE.getClass();
        TestControlLocators a11 = TestControlLocators.Companion.a(key);
        Ki0.a aVar = this.f9497a;
        String c11 = (a11 == null || (controlLocator = a11.getControlLocator()) == null) ? null : G.g.c(aVar.provide(), ".", controlLocator);
        String c12 = (a11 == null || (resetLocator = a11.getResetLocator()) == null) ? null : G.g.c(aVar.provide(), ".", resetLocator);
        if (item instanceof fj0.h) {
            ConfigurationLabel.INSTANCE.getClass();
            String a12 = ConfigurationLabel.Companion.a(key);
            if (a12 == null) {
                a12 = "";
            }
            fj0.h hVar = (fj0.h) item;
            String valueOf = String.valueOf(hVar.a().intValue());
            boolean b11 = hVar.b();
            if (c11 == null) {
                c11 = "";
            }
            return new C9073c(key, a12, valueOf, b11, c11, c12 == null ? "" : c12);
        }
        if (!(item instanceof f)) {
            return null;
        }
        ConfigurationLabel.INSTANCE.getClass();
        String a13 = ConfigurationLabel.Companion.a(key);
        if (a13 == null) {
            a13 = "";
        }
        f fVar = (f) item;
        boolean booleanValue = fVar.a().booleanValue();
        boolean b12 = fVar.b();
        if (c11 == null) {
            c11 = "";
        }
        if (c12 == null) {
            String str4 = c11;
            str3 = "";
            str = a13;
            str2 = str4;
        } else {
            str = a13;
            str2 = c11;
            str3 = c12;
        }
        return new C9074d(key, str, str2, str3, booleanValue, b12);
    }
}
