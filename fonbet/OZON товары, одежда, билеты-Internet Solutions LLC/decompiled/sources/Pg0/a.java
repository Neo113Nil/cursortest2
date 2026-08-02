package Pg0;

import Sc.InterfaceC4003e;
import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ui.start.dialog.AppProtectionAppDialogConfig;

/* loaded from: classes7.dex */
final /* synthetic */ class a implements Ug0.a, InterfaceC7732n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppProtectionAppDialogConfig f22525a;

    a(AppProtectionAppDialogConfig appProtectionAppDialogConfig) {
        this.f22525a = appProtectionAppDialogConfig;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Ug0.a) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(0, this.f22525a, Lg0.a.class, "getPowerSettingsIntents", "getPowerSettingsIntents()Ljava/util/List;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // Ug0.a
    public final List<Intent> provide() {
        return this.f22525a.getPowerSettingsIntents();
    }
}
