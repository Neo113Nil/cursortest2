package M1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f17240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f17241b;

    public i(@NotNull CharSequence charSequence, @NotNull h hVar) {
        this.f17240a = charSequence;
        this.f17241b = hVar;
    }

    @Override // M1.f
    public final int a(int i11) {
        do {
            i11 = this.f17241b.k(i11);
            if (i11 == -1 || i11 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17240a.charAt(i11 - 1)));
        return i11;
    }

    @Override // M1.f
    public final int b(int i11) {
        CharSequence charSequence;
        do {
            i11 = this.f17241b.j(i11);
            if (i11 != -1) {
                charSequence = this.f17240a;
                if (i11 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i11)));
        return i11;
    }

    @Override // M1.f
    public final int c(int i11) {
        do {
            i11 = this.f17241b.k(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17240a.charAt(i11)));
        return i11;
    }

    @Override // M1.f
    public final int d(int i11) {
        do {
            i11 = this.f17241b.j(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17240a.charAt(i11 - 1)));
        return i11;
    }
}
