package L1;

import java.text.CharacterIterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: L1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3559x implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f16194a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16195b;

    /* renamed from: c, reason: collision with root package name */
    private int f16196c = 0;

    public C3559x(int i11, @NotNull CharSequence charSequence) {
        this.f16194a = charSequence;
        this.f16195b = i11;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i11 = this.f16196c;
        if (i11 == this.f16195b) {
            return (char) 65535;
        }
        return this.f16194a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f16196c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f16195b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f16196c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i11 = this.f16195b;
        if (i11 == 0) {
            this.f16196c = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f16196c = i12;
        return this.f16194a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i11 = this.f16196c + 1;
        this.f16196c = i11;
        int i12 = this.f16195b;
        if (i11 < i12) {
            return this.f16194a.charAt(i11);
        }
        this.f16196c = i12;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i11 = this.f16196c;
        if (i11 <= 0) {
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f16196c = i12;
        return this.f16194a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i11) {
        if (i11 > this.f16195b || i11 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f16196c = i11;
        return current();
    }
}
