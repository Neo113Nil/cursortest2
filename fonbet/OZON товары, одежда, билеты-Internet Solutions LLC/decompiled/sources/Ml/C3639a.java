package Ml;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigServiceImpl;
import xl0.AbstractC10783a;
import yl0.C10923h;
import yl0.InterfaceC10920e;

/* renamed from: Ml.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3639a implements g, o, InterfaceC10920e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18158a;

    public /* synthetic */ C3639a(Object obj) {
        this.f18158a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f18158a).invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        List allowedLibrariesRemote$lambda$5;
        allowedLibrariesRemote$lambda$5 = ThirdPartyLibrariesConfigServiceImpl.getAllowedLibrariesRemote$lambda$5((Function1) this.f18158a, obj);
        return allowedLibrariesRemote$lambda$5;
    }

    @Override // yl0.InterfaceC10920e
    public void onSuccess(Object obj) {
        Unit it = (Unit) obj;
        C10923h.a resultProvider = (C10923h.a) this.f18158a;
        Intrinsics.checkNotNullParameter(resultProvider, "$resultProvider");
        Intrinsics.checkNotNullParameter(it, "it");
        resultProvider.b(AbstractC10783a.C2285a.f105619a);
    }
}
