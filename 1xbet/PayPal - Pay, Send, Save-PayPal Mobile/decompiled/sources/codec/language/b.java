package codec.language;

/* loaded from: classes7.dex */
public final class b extends codec.language.a {
    public char c;

    public b(int i) {
        super(i);
        this.c = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
    }

    public final void a(char c) {
        if (c != '-' && this.c != c && (c != '0' || this.b == 0)) {
            char[] cArr = this.f2790a;
            int i = this.b;
            cArr[i] = c;
            this.b = i + 1;
        }
        this.c = c;
    }
}
