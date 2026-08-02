package Ve;

import Ae.InterfaceC2397i;
import android.content.Intent;
import kotlin.Unit;

/* renamed from: Ve.o2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4489o2 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N5 f31697a;

    public C4489o2(N5 n52) {
        this.f31697a = n52;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f31697a.startActivity((Intent) obj);
        return Unit.f71690a;
    }
}
