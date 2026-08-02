package P;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import n1.C1450e;

/* loaded from: classes.dex */
public abstract class P {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0352h b(View view, C0352h c0352h) {
        ContentInfo j = c0352h.f5068a.j();
        Objects.requireNonNull(j);
        ContentInfo o7 = B1.k.o(j);
        ContentInfo performReceiveContent = view.performReceiveContent(o7);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == o7 ? c0352h : new C0352h(new C1450e(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0366w interfaceC0366w) {
        if (interfaceC0366w == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new Q(interfaceC0366w));
        }
    }
}
