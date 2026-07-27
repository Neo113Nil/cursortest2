package a4;

import V2.e;
import java.util.Objects;
import java.util.function.BiConsumer;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0196b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        boolean z = false;
        if (!eVar.f3237b.isEmpty()) {
            String str = eVar.f3237b;
            if (str.length() <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i2);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        V2.d.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
