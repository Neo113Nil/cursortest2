package N8;

import M8.i;
import java.util.regex.Matcher;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f18782a = new b(100);

    private a() {
    }

    public static a a() {
        return new a();
    }

    public final boolean b(CharSequence charSequence, i iVar) {
        String a11 = iVar.a();
        if (a11.length() != 0) {
            Matcher matcher = this.f18782a.a(a11).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }
}
