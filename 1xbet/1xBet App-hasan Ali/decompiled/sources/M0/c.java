package M0;

import java.text.BreakIterator;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class c extends AbstractC2036a {

    /* renamed from: p, reason: collision with root package name */
    public final BreakIterator f3588p;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f3588p = characterInstance;
    }

    @Override // k4.AbstractC2036a
    public final int L(int i) {
        return this.f3588p.following(i);
    }

    @Override // k4.AbstractC2036a
    public final int P(int i) {
        return this.f3588p.preceding(i);
    }
}
