package Of;

import Of.k;
import java.util.function.BiConsumer;

/* loaded from: classes10.dex */
public final /* synthetic */ class h implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        k.a aVar = (k.a) obj;
        CharSequence charSequence = (CharSequence) obj2;
        Nf.b.d(aVar.f20363a);
        if (!aVar.f20365c) {
            aVar.f20363a.append(aVar.f20364b);
        }
        aVar.f20363a.append((Object) charSequence);
        aVar.f20365c = false;
    }
}
