package P;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0352h b(View view, C0352h c0352h) {
        ContentInfo contentInfoJ = c0352h.f5068a.j();
        Objects.requireNonNull(contentInfoJ);
        ContentInfo contentInfoO = B1.k.o(contentInfoJ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoO);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoO ? c0352h : new C0352h(new p096n1.e(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0366w interfaceC0366w) {
        if (interfaceC0366w == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new Q(interfaceC0366w));
        }
    }
}
