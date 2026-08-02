package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;

/* renamed from: Ve.f2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4229f2 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f30996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30997b;

    public C4229f2(C4378k7 c4378k7, Context context) {
        this.f30996a = c4378k7;
        this.f30997b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f30996a.f31424d.setText(E.f((Sr) obj, this.f30997b));
        return Unit.f71690a;
    }
}
