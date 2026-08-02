package B0;

import java.text.BreakIterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2459b1 {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.f() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(int i11, @NotNull String str) {
        androidx.emoji2.text.j jVar;
        Integer num = null;
        if (androidx.emoji2.text.j.j()) {
            jVar = androidx.emoji2.text.j.c();
        }
        jVar = null;
        if (jVar != null) {
            int d11 = jVar.d(i11, str);
            Integer valueOf = Integer.valueOf(d11);
            if (d11 != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.f() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(int i11, @NotNull String str) {
        androidx.emoji2.text.j jVar;
        Integer num = null;
        if (androidx.emoji2.text.j.j()) {
            jVar = androidx.emoji2.text.j.c();
        }
        jVar = null;
        if (jVar != null) {
            int e11 = jVar.e(Math.max(0, i11 - 1), str);
            Integer valueOf = Integer.valueOf(e11);
            if (e11 != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }
}
