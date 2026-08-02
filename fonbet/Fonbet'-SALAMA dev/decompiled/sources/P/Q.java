package P;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import n1.C1450e;

/* loaded from: classes.dex */
public final class Q implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0366w f5032a;

    public Q(InterfaceC0366w interfaceC0366w) {
        this.f5032a = interfaceC0366w;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0352h c0352h = new C0352h(new C1450e(contentInfo));
        C0352h a2 = ((V.p) this.f5032a).a(view, c0352h);
        if (a2 == null) {
            return null;
        }
        if (a2 == c0352h) {
            return contentInfo;
        }
        ContentInfo j = a2.f5068a.j();
        Objects.requireNonNull(j);
        return B1.k.o(j);
    }
}
