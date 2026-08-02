package Ce0;

import J4.k;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class g extends k<De0.b> {
    @Override // J4.k
    protected final void bind(@NonNull O4.f fVar, @NonNull De0.b bVar) {
        fVar.e0(1, bVar.e());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "DELETE FROM `cached_style_file` WHERE `url` = ?";
    }
}
