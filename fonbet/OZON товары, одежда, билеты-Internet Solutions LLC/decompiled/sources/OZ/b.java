package OZ;

import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import tZ.C9788c;

/* loaded from: classes3.dex */
public final class b extends h {
    public b(int i11, ComposerTabFragmentDestination composerTabFragmentDestination) {
        super(new e(i11, new C9788c(composerTabFragmentDestination)));
    }

    @Override // OZ.h
    @NotNull
    public final String toString() {
        return "ClearToTabDestination(redirect=" + getRedirect$compass_release() + ")";
    }
}
