package Me;

import gd.InterfaceC6712a;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class j implements Iterable<f>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f17931a;

    public j(f fVar) {
        this.f17931a = fVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<f> iterator() {
        return new i(this.f17931a);
    }
}
