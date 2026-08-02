package androidx.appcompat.widget;

import androidx.appcompat.widget.C5077w;
import m.InterfaceC7975b;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5076v extends K {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C5077w.e f37977j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C5077w f37978k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5076v(C5077w c5077w, C5077w c5077w2, C5077w.e eVar) {
        super(c5077w2);
        this.f37978k = c5077w;
        this.f37977j = eVar;
    }

    @Override // androidx.appcompat.widget.K
    public final InterfaceC7975b b() {
        return this.f37977j;
    }

    @Override // androidx.appcompat.widget.K
    public final boolean c() {
        C5077w c5077w = this.f37978k;
        if (c5077w.b().a()) {
            return true;
        }
        c5077w.c();
        return true;
    }
}
