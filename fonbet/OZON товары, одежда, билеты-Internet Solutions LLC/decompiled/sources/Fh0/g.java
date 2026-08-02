package Fh0;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class g extends J4.k<Gh0.e> {
    @Override // J4.k
    protected final void bind(@NonNull O4.f fVar, @NonNull Gh0.e eVar) {
        Gh0.e eVar2 = eVar;
        fVar.e0(1, eVar2.a());
        fVar.m0(2, Eh0.a.b(eVar2.c()));
        if (eVar2.b() == null) {
            fVar.C0(3);
        } else {
            fVar.m0(3, eVar2.b().intValue());
        }
        fVar.e0(4, eVar2.a());
        fVar.m0(5, Eh0.a.b(eVar2.c()));
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "UPDATE OR REPLACE `push_status` SET `id` = ?,`status` = ?,`sendingAttemptNumber` = ? WHERE `id` = ? AND `status` = ?";
    }
}
