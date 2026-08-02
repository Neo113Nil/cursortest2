package G40;

import android.os.Parcelable;
import androidx.lifecycle.w0;
import d40.InterfaceC6083a;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.exchanger.datapass.CbottomLifecycle2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;
import ru.ozon.fintech.ui.ActionResult2UI;
import y40.C10837a;

/* loaded from: classes3.dex */
public abstract class a<T extends ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a> extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f9713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f9714b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f9715c;

    public a(@NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f9713a = exchanger;
        this.f9714b = "";
    }

    public void d0(@NotNull ActionResult2UI actionResult2UI) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = ActionResult2.Companion.a(str);
        this.f9713a.c(C10837a.a(actionResult2UI), a11);
        e0(actionResult2UI);
        if (actionResult2UI.getType() == ActionResult2UI.Type.LIST_CHANGED) {
            T f02 = f0();
            if (f02 != null) {
                bool = Boolean.valueOf(f02.updateLazyColumnWidgetsOrder(K.f71697a, false, actionResult2UI.getWidgetId(), actionResult2UI.getWidgetIds()));
            } else {
                bool = null;
            }
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                handleState();
            }
        }
    }

    public void e0(@NotNull ActionResult2UI actionResult2UI) {
        Intrinsics.checkNotNullParameter(actionResult2UI, "actionResult2UI");
    }

    protected abstract T f0();

    public void g0() {
        CbottomLifecycle2.Companion companion = CbottomLifecycle2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = CbottomLifecycle2.Companion.a(str);
        CbottomLifecycle2 cbottomLifecycle2 = new CbottomLifecycle2(i0(), CbottomLifecycle2.b.ON_CREATE);
        InterfaceC6083a interfaceC6083a = this.f9713a;
        interfaceC6083a.c(cbottomLifecycle2, a11);
        ActionResult2.Companion companion2 = ActionResult2.INSTANCE;
        String str2 = this.f9714b;
        companion2.getClass();
        interfaceC6083a.c(new ActionResult2(i0(), null, "CREATE", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134201344, null), ActionResult2.Companion.a(str2));
    }

    @NotNull
    protected final String getUuid() {
        return this.f9714b;
    }

    public final void h0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Integer num = this.f9715c;
        if (num != null && num.intValue() == 2) {
            ActionResult2.Companion companion = ActionResult2.INSTANCE;
            String str = this.f9714b;
            companion.getClass();
            String a11 = ActionResult2.Companion.a(str);
            this.f9713a.c(C10837a.a(ActionResult2UI.INSTANCE.dismissed(id2)), a11);
        }
    }

    protected abstract void handleState();

    @NotNull
    public abstract String i0();

    public void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f9715c = num;
        this.f9714b = uuid;
    }

    public void onBackPressed() {
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = ActionResult2.Companion.a(str);
        this.f9713a.c(C10837a.a(new ActionResult2UI(i0(), null, ActionResult2UI.Type.BACK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null)), a11);
    }

    public void onDestroy() {
        CbottomLifecycle2.Companion companion = CbottomLifecycle2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = CbottomLifecycle2.Companion.a(str);
        CbottomLifecycle2 cbottomLifecycle2 = new CbottomLifecycle2(i0(), CbottomLifecycle2.b.ON_DESTROY);
        InterfaceC6083a interfaceC6083a = this.f9713a;
        interfaceC6083a.c(cbottomLifecycle2, a11);
        ActionResult2.Companion companion2 = ActionResult2.INSTANCE;
        String str2 = this.f9714b;
        companion2.getClass();
        interfaceC6083a.c(new ActionResult2(i0(), null, "DESTROY", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134201344, null), ActionResult2.Companion.a(str2));
    }

    public final void onStart() {
        CbottomLifecycle2.Companion companion = CbottomLifecycle2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = CbottomLifecycle2.Companion.a(str);
        CbottomLifecycle2 cbottomLifecycle2 = new CbottomLifecycle2(i0(), CbottomLifecycle2.b.ON_START);
        InterfaceC6083a interfaceC6083a = this.f9713a;
        interfaceC6083a.c(cbottomLifecycle2, a11);
        ActionResult2.Companion companion2 = ActionResult2.INSTANCE;
        String str2 = this.f9714b;
        companion2.getClass();
        interfaceC6083a.c(new ActionResult2(i0(), null, "START", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134201344, null), ActionResult2.Companion.a(str2));
    }

    public final void onStop() {
        CbottomLifecycle2.Companion companion = CbottomLifecycle2.INSTANCE;
        String str = this.f9714b;
        companion.getClass();
        String a11 = CbottomLifecycle2.Companion.a(str);
        CbottomLifecycle2 cbottomLifecycle2 = new CbottomLifecycle2(i0(), CbottomLifecycle2.b.ON_STOP);
        InterfaceC6083a interfaceC6083a = this.f9713a;
        interfaceC6083a.c(cbottomLifecycle2, a11);
        ActionResult2.Companion companion2 = ActionResult2.INSTANCE;
        String str2 = this.f9714b;
        companion2.getClass();
        interfaceC6083a.c(new ActionResult2(i0(), null, "STOP", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134201344, null), ActionResult2.Companion.a(str2));
    }
}
