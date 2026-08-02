package p000;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e82 {

    /* JADX INFO: renamed from: a */
    public w82 f2013a;

    /* JADX INFO: renamed from: b */
    public qc0 f2014b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2015c;

    /* JADX INFO: renamed from: d */
    public Uri f2016d;

    /* JADX INFO: renamed from: a */
    public ArrayList m1386a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f2015c;
        if (!arrayList2.isEmpty()) {
            int i = d82.f1587k;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
            d82 d82Var = !arrayList3.isEmpty() ? new d82(outputStream, arrayList3) : null;
            if (d82Var != null) {
                arrayList.add(d82Var);
            }
        }
        Iterator it2 = this.f2014b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            dd0.m1158c();
            return null;
        }
        throw null;
    }
}
