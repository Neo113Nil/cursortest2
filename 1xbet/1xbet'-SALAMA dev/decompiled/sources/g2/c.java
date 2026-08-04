package g2;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.gms.common.internal.C0815k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p012b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0815k f13123i;
    public final t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f13124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f13125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f13126m;

    public c(long j, long j3, long j7, boolean z4, long j8, long j9, long j10, long j11, i iVar, C0815k c0815k, t tVar, Uri uri, ArrayList arrayList) {
        this.f13115a = j;
        this.f13116b = j3;
        this.f13117c = j7;
        this.f13118d = z4;
        this.f13119e = j8;
        this.f13120f = j9;
        this.f13121g = j10;
        this.f13122h = j11;
        this.f13125l = iVar;
        this.f13123i = c0815k;
        this.f13124k = uri;
        this.j = tVar;
        this.f13126m = arrayList;
    }

    @Override // p012b2.a
    public final Object a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (int i7 = 0; i7 < this.f13126m.size(); i7++) {
            if (((StreamKey) linkedList.peek()).f10674a != i7) {
                long jC = c(i7);
                if (jC != -9223372036854775807L) {
                    j += jC;
                }
            } else {
                h hVarB = b(i7);
                List list2 = hVarB.f13150c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i8 = streamKey.f10674a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i9 = streamKey.f10675b;
                    a aVar = (a) list2.get(i9);
                    List list3 = aVar.f13107c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(streamKey.f10676c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f10674a != i8) {
                            break;
                        }
                    } while (streamKey.f10675b == i9);
                    List list4 = list2;
                    arrayList2.add(new a(aVar.f13105a, aVar.f13106b, arrayList3, aVar.f13108d, aVar.f13109e, aVar.f13110f));
                    if (streamKey.f10674a != i8) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new h(hVarB.f13148a, hVarB.f13149b - j, arrayList2, hVarB.f13151d));
            }
        }
        long j3 = this.f13116b;
        return new c(this.f13115a, j3 != -9223372036854775807L ? j3 - j : -9223372036854775807L, this.f13117c, this.f13118d, this.f13119e, this.f13120f, this.f13121g, this.f13122h, this.f13125l, this.f13123i, this.j, this.f13124k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f13126m.get(i7);
    }

    public final long c(int i7) {
        long j;
        long j3;
        List list = this.f13126m;
        if (i7 == list.size() - 1) {
            j = this.f13116b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((h) list.get(i7)).f13149b;
        } else {
            j = ((h) list.get(i7 + 1)).f13149b;
            j3 = ((h) list.get(i7)).f13149b;
        }
        return j - j3;
    }

    public final long d(int i7) {
        return p151v2.t.E(c(i7));
    }
}
