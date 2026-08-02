package K4;

import O4.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a {
    public final int endVersion;
    public final int startVersion;

    public a(int i11, int i12) {
        this.startVersion = i11;
        this.endVersion = i12;
    }

    public abstract void migrate(@NotNull b bVar);
}
