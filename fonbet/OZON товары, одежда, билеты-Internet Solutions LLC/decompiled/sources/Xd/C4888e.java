package Xd;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* renamed from: Xd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4888e extends r<Character> {
    public C4888e(char c11) {
        super(Character.valueOf(c11));
    }

    @Override // Xd.g
    public final N a(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Y t2 = module.n().t();
        Intrinsics.checkNotNullExpressionValue(t2, "getCharType(...)");
        return t2;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        String str;
        Integer valueOf = Integer.valueOf(b().charValue());
        char charValue = b().charValue();
        switch (charValue) {
            case '\b':
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(charValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    str = String.valueOf(charValue);
                    break;
                } else {
                    str = "?";
                    break;
                }
                break;
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        return V.e.b(new Object[]{valueOf, str}, 2, "\\u%04X ('%s')", "format(...)");
    }
}
