package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class J8 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f29279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f29280b;

    public J8(C4400l0 c4400l0, Context context) {
        this.f29279a = c4400l0;
        this.f29280b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f29279a.f31488f.setText(E.f((Sr) obj, this.f29280b));
        return Unit.f71690a;
    }
}
