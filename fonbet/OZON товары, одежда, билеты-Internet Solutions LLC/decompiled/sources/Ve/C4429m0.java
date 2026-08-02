package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;

/* renamed from: Ve.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4429m0 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f31546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31547b;

    public C4429m0(C4378k7 c4378k7, Context context) {
        this.f31546a = c4378k7;
        this.f31547b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f31546a.f31423c.setText(E.f((Sr) obj, this.f31547b));
        return Unit.f71690a;
    }
}
