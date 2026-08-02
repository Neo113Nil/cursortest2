package Ce0;

import J4.l;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class f extends l<De0.b> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull De0.b bVar) {
        De0.b bVar2 = bVar;
        fVar.e0(1, bVar2.e());
        fVar.q0(2, bVar2.b());
        fVar.m0(3, bVar2.d());
        fVar.m0(4, bVar2.f() ? 1L : 0L);
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `cached_style_file` (`url`,`file`,`last_use_unix_time`,`is_fallback`) VALUES (?,?,?,?)";
    }
}
