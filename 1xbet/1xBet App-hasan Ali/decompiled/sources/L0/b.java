package L0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f2997k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2998l;

    /* renamed from: m, reason: collision with root package name */
    public int f2999m = 0;

    public b(CharSequence charSequence, int i) {
        this.f2997k = charSequence;
        this.f2998l = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f2999m;
        if (i == this.f2998l) {
            return (char) 65535;
        }
        return this.f2997k.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f2999m = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f2998l;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f2999m;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f2998l;
        if (i == 0) {
            this.f2999m = i;
            return (char) 65535;
        }
        int i5 = i - 1;
        this.f2999m = i5;
        return this.f2997k.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f2999m + 1;
        this.f2999m = i;
        int i5 = this.f2998l;
        if (i < i5) {
            return this.f2997k.charAt(i);
        }
        this.f2999m = i5;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f2999m;
        if (i <= 0) {
            return (char) 65535;
        }
        int i5 = i - 1;
        this.f2999m = i5;
        return this.f2997k.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f2998l || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f2999m = i;
        return current();
    }
}
