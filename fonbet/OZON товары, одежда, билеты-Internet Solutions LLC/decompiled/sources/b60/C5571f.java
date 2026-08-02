package b60;

import U50.j;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts.ReadContactsPermissionRequestData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import s90.InterfaceC9636e;
import t90.AbstractC9782b;

/* renamed from: b60.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5571f extends V50.c implements U50.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f55573b;

    /* renamed from: c, reason: collision with root package name */
    private final r90.f f55574c;

    /* renamed from: d, reason: collision with root package name */
    private j f55575d;

    public C5571f(@NotNull Moshi moshi, r90.f fVar) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f55573b = moshi;
        this.f55574c = fVar;
    }

    @Override // V50.c
    public final boolean b(AbstractC9782b abstractC9782b) {
        List<InterfaceC9636e> a11;
        if (this.f55575d == null || abstractC9782b == null || (a11 = abstractC9782b.a()) == null) {
            return false;
        }
        List<InterfaceC9636e> list = a11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9636e) it.next()) instanceof s90.f) {
                return true;
            }
        }
        return false;
    }

    @Override // V50.c
    public final void d(boolean z11) {
        String str;
        j jVar = this.f55575d;
        if (jVar != null) {
            Moshi moshi = this.f55573b;
            try {
                str = moshi.c(ReadContactsPermissionRequestData.class).toJson(new ReadContactsPermissionRequestData(z11));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            jVar.invoke(new NativeResult.Success(str));
        }
        this.f55575d = null;
    }

    public final Function1<NativeResult, Unit> e() {
        return this.f55575d;
    }

    public final void f() {
        this.f55575d = null;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "request_contacts_permission";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (parentFragmentActivity != null) {
            this.f55575d = (j) callback;
            r90.f fVar = this.f55574c;
            if (fVar != null) {
                fVar.b(parentFragmentActivity);
                return;
            }
            return;
        }
        try {
            str = this.f55573b.c(ReadContactsPermissionRequestData.class).toJson(new ReadContactsPermissionRequestData(false));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        ((j) callback).invoke(new NativeResult.Success(str));
        L80.a.a("RequestContactsPermission", "weakWebViewRef.get()?.getParentFragmentActivity() = null");
    }
}
