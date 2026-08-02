package OZ;

import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import tZ.C9788c;

/* loaded from: classes3.dex */
public final class a extends h {
    public a(ComposerTabFragmentDestination composerTabFragmentDestination) {
        super(new C9788c(composerTabFragmentDestination));
    }

    @Override // OZ.h
    @NotNull
    public final String toString() {
        return "ClearTabDestination(redirect=" + getRedirect$compass_release() + ")";
    }
}
