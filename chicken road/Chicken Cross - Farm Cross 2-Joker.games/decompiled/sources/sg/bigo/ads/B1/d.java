package sg.bigo.ads.B1;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.K0.A;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Node f12217a;
    public final int b;
    public final int c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final ArrayList g;

    public d(Node node) {
        this.f12217a = node;
        sg.bigo.ads.y1.a.a(node, "id");
        this.b = sg.bigo.ads.y1.a.b(node, "width").intValue();
        this.c = sg.bigo.ads.y1.a.b(node, "height").intValue();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.g = new ArrayList();
        ArrayList a2 = sg.bigo.ads.y1.a.a(node, k.D, (String) null, (List) null);
        if (!A.a(a2)) {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                this.d.add(new g(sg.bigo.ads.y1.a.a(node2, "creativeType"), sg.bigo.ads.y1.a.b(node2)));
            }
        }
        ArrayList a3 = sg.bigo.ads.y1.a.a(this.f12217a, k.E, (String) null, (List) null);
        if (!A.a(a3)) {
            Iterator it2 = a3.iterator();
            while (it2.hasNext()) {
                Node node3 = (Node) it2.next();
                ArrayList arrayList = this.d;
                sg.bigo.ads.y1.a.a(node3);
                arrayList.add(new f());
            }
        }
        ArrayList a4 = sg.bigo.ads.y1.a.a(this.f12217a, k.F, (String) null, (List) null);
        if (!A.a(a4)) {
            Iterator it3 = a4.iterator();
            while (it3.hasNext()) {
                this.d.add(new e(sg.bigo.ads.y1.a.a((Node) it3.next())));
            }
        }
        Node a5 = sg.bigo.ads.y1.a.a(this.f12217a, k.K, (String) null, (ArrayList) null);
        if (a5 != null) {
            sg.bigo.ads.y1.a.a(a5);
        }
        Node a6 = sg.bigo.ads.y1.a.a(this.f12217a, k.r, (String) null, (ArrayList) null);
        if (a6 != null) {
            TextUtils.equals(sg.bigo.ads.y1.a.a(a6, "xmlEncoded"), "true");
            sg.bigo.ads.y1.a.a(a6);
        }
        Node a7 = sg.bigo.ads.y1.a.a(this.f12217a, k.N, (String) null, (ArrayList) null);
        if (a7 != null) {
            this.f = sg.bigo.ads.y1.a.b(a7);
        }
        ArrayList a8 = sg.bigo.ads.y1.a.a(this.f12217a, k.O, (String) null, (List) null);
        if (!A.a(a8)) {
            Iterator it4 = a8.iterator();
            while (it4.hasNext()) {
                Node node4 = (Node) it4.next();
                ArrayList arrayList2 = this.g;
                sg.bigo.ads.y1.a.a(node4, "id");
                arrayList2.add(new c(sg.bigo.ads.y1.a.b(node4)));
            }
        }
        Node a9 = sg.bigo.ads.y1.a.a(this.f12217a, k.v, (String) null, (ArrayList) null);
        if (a9 != null) {
            ArrayList a10 = sg.bigo.ads.y1.a.a(a9, k.w, NotificationCompat.CATEGORY_EVENT, Arrays.asList("creativeView"));
            if (A.a(a10)) {
                return;
            }
            Iterator it5 = a10.iterator();
            while (it5.hasNext()) {
                String b = sg.bigo.ads.y1.a.b((Node) it5.next());
                if (!TextUtils.isEmpty(b)) {
                    this.e.add(b);
                }
            }
        }
    }
}
