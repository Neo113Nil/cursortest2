package R9;

import S9.a;
import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S9.a f24814a;

    /* renamed from: b, reason: collision with root package name */
    private int f24815b;

    public b(S9.a caretString) {
        Intrinsics.checkNotNullParameter(caretString, "caretString");
        this.f24814a = caretString;
        this.f24815b = 0;
    }

    public final boolean a() {
        return this.f24815b < this.f24814a.b();
    }

    public boolean b() {
        S9.a aVar = this.f24814a;
        a.AbstractC0516a a11 = aVar.a();
        if (a11 instanceof a.AbstractC0516a.C0517a) {
            return this.f24815b < aVar.b();
        }
        if (a11 instanceof a.AbstractC0516a.b) {
            return this.f24815b <= aVar.b() || (this.f24815b == 0 && aVar.b() == 0);
        }
        throw new o();
    }

    public final Character c() {
        int i11 = this.f24815b;
        S9.a aVar = this.f24814a;
        if (i11 >= aVar.c().length()) {
            return null;
        }
        char[] charArray = aVar.c().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int i12 = this.f24815b;
        char c11 = charArray[i12];
        this.f24815b = i12 + 1;
        return Character.valueOf(c11);
    }
}
