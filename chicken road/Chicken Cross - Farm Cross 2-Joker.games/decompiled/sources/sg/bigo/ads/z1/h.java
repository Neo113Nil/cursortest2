package sg.bigo.ads.z1;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Node f13443a;

    public h(Node node) {
        this.f13443a = node;
    }

    public final ArrayList a(String str) {
        ArrayList a2;
        ArrayList arrayList = new ArrayList();
        Node a3 = sg.bigo.ads.y1.a.a(this.f13443a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v, (String) null, (ArrayList) null);
        if (a3 == null || (a2 = sg.bigo.ads.y1.a.a(a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w, NotificationCompat.CATEGORY_EVENT, Collections.singletonList(str))) == null) {
            return arrayList;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String b = sg.bigo.ads.y1.a.b((Node) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public final ArrayList b(String str) {
        ArrayList a2 = a(str);
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(new n((String) it.next()));
        }
        return arrayList;
    }
}
