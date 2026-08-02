package M1;

import java.text.BreakIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private final BreakIterator f17235a;

    public e(@NotNull CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f17235a = characterInstance;
    }

    @Override // M1.b
    public final int r(int i11) {
        return this.f17235a.following(i11);
    }

    @Override // M1.b
    public final int s(int i11) {
        return this.f17235a.preceding(i11);
    }
}
