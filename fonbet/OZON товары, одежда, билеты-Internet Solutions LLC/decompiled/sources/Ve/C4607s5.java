package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;

/* renamed from: Ve.s5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4607s5 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f32011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32012b;

    public C4607s5(S0 s02, Context context) {
        this.f32011a = s02;
        this.f32012b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.f32011a.f29931g.setText(E.f((Sr) obj, this.f32012b));
        return Unit.f71690a;
    }
}
