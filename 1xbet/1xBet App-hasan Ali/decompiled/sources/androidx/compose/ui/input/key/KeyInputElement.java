package androidx.compose.ui.input.key;

import b0.o;
import i4.c;
import kotlin.jvm.internal.m;
import r0.e;
import z0.Z;

/* loaded from: classes.dex */
final class KeyInputElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6927k;

    /* renamed from: l, reason: collision with root package name */
    public final m f6928l;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(c cVar, c cVar2) {
        this.f6927k = cVar;
        this.f6928l = (m) cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f6927k == keyInputElement.f6927k && this.f6928l == keyInputElement.f6928l;
    }

    public final int hashCode() {
        c cVar = this.f6927k;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        m mVar = this.f6928l;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override // z0.Z
    public final o i() {
        e eVar = new e();
        eVar.f19091y = this.f6927k;
        eVar.f19092z = this.f6928l;
        return eVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        e eVar = (e) oVar;
        eVar.f19091y = this.f6927k;
        eVar.f19092z = this.f6928l;
    }
}
