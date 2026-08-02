package Fh0;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class f extends J4.k<Gh0.b> {
    @Override // J4.k
    protected final void bind(@NonNull O4.f fVar, @NonNull Gh0.b bVar) {
        fVar.e0(1, bVar.e());
        fVar.m0(2, Eh0.a.b(r5.j()));
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "DELETE FROM `push_status` WHERE `id` = ? AND `status` = ?";
    }
}
