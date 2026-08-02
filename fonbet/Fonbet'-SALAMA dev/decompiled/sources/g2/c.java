package g2;

import android.net.Uri;
import b2.InterfaceC0779a;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.gms.common.internal.C0859k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements InterfaceC0779a {

    /* renamed from: a, reason: collision with root package name */
    public final long f13109a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13110b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13111c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13112d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13113e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13114f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13115g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13116h;

    /* renamed from: i, reason: collision with root package name */
    public final C0859k f13117i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f13118k;

    /* renamed from: l, reason: collision with root package name */
    public final i f13119l;

    /* renamed from: m, reason: collision with root package name */
    public final List f13120m;

    public c(long j, long j3, long j7, boolean z4, long j8, long j9, long j10, long j11, i iVar, C0859k c0859k, t tVar, Uri uri, ArrayList arrayList) {
        this.f13109a = j;
        this.f13110b = j3;
        this.f13111c = j7;
        this.f13112d = z4;
        this.f13113e = j8;
        this.f13114f = j9;
        this.f13115g = j10;
        this.f13116h = j11;
        this.f13119l = iVar;
        this.f13117i = c0859k;
        this.f13118k = uri;
        this.j = tVar;
        this.f13120m = arrayList;
    }

    @Override // b2.InterfaceC0779a
    public final Object a(List list) {
        c cVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i7 = 0;
        while (i7 < cVar.f13120m.size()) {
            if (((StreamKey) linkedList.peek()).f10674a != i7) {
                long c3 = cVar.c(i7);
                if (c3 != -9223372036854775807L) {
                    j += c3;
                }
            } else {
                h b7 = cVar.b(i7);
                List list2 = b7.f13144c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i8 = streamKey.f10674a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i9 = streamKey.f10675b;
                    a aVar = (a) list2.get(i9);
                    List list3 = aVar.f13101c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(streamKey.f10676c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f10674a != i8) {
                            break;
                        }
                    } while (streamKey.f10675b == i9);
                    List list4 = list2;
                    arrayList2.add(new a(aVar.f13099a, aVar.f13100b, arrayList3, aVar.f13102d, aVar.f13103e, aVar.f13104f));
                    if (streamKey.f10674a != i8) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new h(b7.f13142a, b7.f13143b - j, arrayList2, b7.f13145d));
            }
            i7++;
            cVar = this;
        }
        long j3 = cVar.f13110b;
        return new c(cVar.f13109a, j3 != -9223372036854775807L ? j3 - j : -9223372036854775807L, cVar.f13111c, cVar.f13112d, cVar.f13113e, cVar.f13114f, cVar.f13115g, cVar.f13116h, cVar.f13119l, cVar.f13117i, cVar.j, cVar.f13118k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f13120m.get(i7);
    }

    public final long c(int i7) {
        long j;
        long j3;
        List list = this.f13120m;
        if (i7 == list.size() - 1) {
            j = this.f13110b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((h) list.get(i7)).f13143b;
        } else {
            j = ((h) list.get(i7 + 1)).f13143b;
            j3 = ((h) list.get(i7)).f13143b;
        }
        return j - j3;
    }

    public final long d(int i7) {
        return v2.t.E(c(i7));
    }
}
