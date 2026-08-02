package V4;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: V4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4077f extends m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f28029a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f28030b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f28031c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f28032d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4076e f28033e;

    C4077f(C4076e c4076e, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f28033e = c4076e;
        this.f28029a = obj;
        this.f28030b = arrayList;
        this.f28031c = obj2;
        this.f28032d = arrayList2;
    }

    @Override // V4.l.f
    public final void onTransitionEnd(@NonNull l lVar) {
        lVar.removeListener(this);
    }

    @Override // V4.m, V4.l.f
    public final void onTransitionStart(@NonNull l lVar) {
        C4076e c4076e = this.f28033e;
        Object obj = this.f28029a;
        if (obj != null) {
            c4076e.u(obj, this.f28030b, null);
        }
        Object obj2 = this.f28031c;
        if (obj2 != null) {
            c4076e.u(obj2, this.f28032d, null);
        }
    }
}
