package m2;

import g4.C0471p;
import java.util.List;
import kotlin.jvm.internal.t;

/* renamed from: m2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287j extends AbstractC1286i {

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC1286i f11182t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287j(AbstractC1286i originalAdapter) {
        super(originalAdapter.f11177a, t.a(List.class), originalAdapter.f11179c, C0471p.f5750a, 32);
        kotlin.jvm.internal.i.e(originalAdapter, "originalAdapter");
        this.f11182t = originalAdapter;
    }

    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        return K1.b.W(this.f11182t.b(jVar));
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        kotlin.jvm.internal.i.e(reader, "reader");
        return K1.b.W(this.f11182t.c(reader));
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // m2.AbstractC1286i
    public final void e(U.e writer, int i2, Object obj) {
        List list = (List) obj;
        kotlin.jvm.internal.i.e(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f11182t.e(writer, i2, list.get(i3));
        }
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        List value = (List) obj;
        kotlin.jvm.internal.i.e(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // m2.AbstractC1286i
    public final int g(int i2, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i3 += this.f11182t.g(i2, list.get(i6));
        }
        return i3;
    }
}
