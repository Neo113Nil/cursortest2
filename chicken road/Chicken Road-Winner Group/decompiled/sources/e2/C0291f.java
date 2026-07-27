package e2;

import java.util.Iterator;
import java.util.List;

/* renamed from: e2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291f implements u2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4875b;

    public /* synthetic */ C0291f(int i3, Object obj) {
        this.f4874a = i3;
        this.f4875b = obj;
    }

    @Override // u2.e
    public final Iterator iterator() {
        switch (this.f4874a) {
            case 0:
                return new kotlin.jvm.internal.a((Object[]) this.f4875b);
            case 1:
                return ((List) this.f4875b).iterator();
            default:
                return (Iterator) this.f4875b;
        }
    }
}
