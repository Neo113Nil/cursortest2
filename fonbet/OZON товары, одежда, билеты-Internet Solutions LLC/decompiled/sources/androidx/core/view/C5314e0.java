package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import gd.InterfaceC6712a;
import java.util.Iterator;

/* renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5314e0 implements Iterator<View>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f42291a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f42292b;

    C5314e0(ViewGroup viewGroup) {
        this.f42292b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42291a < this.f42292b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i11 = this.f42291a;
        this.f42291a = i11 + 1;
        View childAt = this.f42292b.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i11 = this.f42291a - 1;
        this.f42291a = i11;
        this.f42292b.removeViewAt(i11);
    }
}
