package P;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0366w f5032a;

    public Q(InterfaceC0366w interfaceC0366w) {
        this.f5032a = interfaceC0366w;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0352h c0352h = new C0352h(new p096n1.e(contentInfo));
        C0352h c0352hA = ((V.p) this.f5032a).a(view, c0352h);
        if (c0352hA == null) {
            return null;
        }
        if (c0352hA == c0352h) {
            return contentInfo;
        }
        ContentInfo contentInfoJ = c0352hA.f5068a.j();
        Objects.requireNonNull(contentInfoJ);
        return B1.k.o(contentInfoJ);
    }
}
