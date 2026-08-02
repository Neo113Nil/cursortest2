package Ce0;

import J4.k;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class h extends k<De0.b> {
    @Override // J4.k
    protected final void bind(@NonNull O4.f fVar, @NonNull De0.b bVar) {
        De0.b bVar2 = bVar;
        fVar.e0(1, bVar2.e());
        fVar.q0(2, bVar2.b());
        fVar.m0(3, bVar2.d());
        fVar.m0(4, bVar2.f() ? 1L : 0L);
        fVar.e0(5, bVar2.e());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "UPDATE OR ABORT `cached_style_file` SET `url` = ?,`file` = ?,`last_use_unix_time` = ?,`is_fallback` = ? WHERE `url` = ?";
    }
}
