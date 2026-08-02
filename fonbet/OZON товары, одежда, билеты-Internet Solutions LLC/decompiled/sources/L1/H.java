package L1;

import android.os.Build;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class H implements S {
    @Override // L1.S
    @NotNull
    public StaticLayout a(@NotNull T t2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(t2.m(), 0, t2.e(), t2.l(), t2.p());
        obtain.setTextDirection(t2.n());
        obtain.setAlignment(t2.a());
        obtain.setMaxLines(t2.k());
        obtain.setEllipsize(t2.c());
        obtain.setEllipsizedWidth(t2.d());
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(t2.g());
        obtain.setBreakStrategy(t2.b());
        obtain.setHyphenationFrequency(t2.f());
        obtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        I.a(obtain, t2.h());
        if (i11 >= 28) {
            K.a(obtain, t2.o());
        }
        if (i11 >= 33) {
            P.b(obtain, t2.i(), t2.j());
        }
        return obtain.build();
    }
}
