package sg.bigo.ads.R0;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4955l;

/* loaded from: classes3.dex */
public class h implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f12520a;
    public HashMap c;
    public HashMap d;
    public HashMap g;
    public g h;
    public g i;
    public int j;
    public final String b = "";
    public int e = 3;
    public HashMap f = a();

    public h(String str) {
        this.f12520a = str;
    }

    public static ArrayList b(e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = TextUtils.isEmpty(eVar.c) ? "all" : eVar.c;
        e eVar2 = new e("all", 0, "all");
        if (!eVar2.equals(eVar)) {
            arrayList.add(0, eVar2);
            e eVar3 = new e("all", 0, str);
            if (!eVar3.equals(eVar)) {
                arrayList.add(0, eVar3);
                e eVar4 = new e("all", eVar.b, "all");
                if (!eVar4.equals(eVar)) {
                    arrayList.add(0, eVar4);
                    e eVar5 = new e("all", eVar.b, str);
                    if (!eVar5.equals(eVar)) {
                        arrayList.add(0, eVar5);
                        e eVar6 = new e(eVar.f12518a, 0, "all");
                        if (!eVar6.equals(eVar)) {
                            arrayList.add(0, eVar6);
                            e eVar7 = new e(eVar.f12518a, 0, str);
                            if (!eVar7.equals(eVar)) {
                                arrayList.add(0, eVar7);
                                e eVar8 = new e(eVar.f12518a, eVar.b, "all");
                                if (!eVar8.equals(eVar)) {
                                    arrayList.add(0, eVar8);
                                }
                            }
                        }
                    }
                }
            }
        }
        arrayList.add(0, eVar);
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            if (!AbstractC4955l.a(str2)) {
                return false;
            }
            e eVar = new e(str, 0, "all");
            if (this.g == null) {
                this.g = new HashMap();
            }
            List list = (List) this.g.get(eVar);
            if (list == null) {
                list = new ArrayList();
                this.g.put(eVar, list);
            }
            g gVar = new g(str2, 3, "");
            if (list.contains(gVar)) {
                return false;
            }
            list.add(gVar);
            return true;
        }
    }

    public final String toString() {
        return super.toString();
    }

    public final void b() {
        HashMap hashMap = this.c;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                g gVar = (g) ((Map.Entry) it.next()).getValue();
                if (gVar != null) {
                    gVar.d = true;
                }
            }
        }
        HashMap hashMap2 = this.d;
        if (hashMap2 != null) {
            Iterator it2 = hashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                List list = (List) ((Map.Entry) it2.next()).getValue();
                if (!A.a(list)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).d = true;
                    }
                }
            }
        }
        HashMap hashMap3 = this.g;
        if (hashMap3 != null) {
            Iterator it4 = hashMap3.entrySet().iterator();
            while (it4.hasNext()) {
                List list2 = (List) ((Map.Entry) it4.next()).getValue();
                if (!A.a(list2)) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        ((g) it5.next()).d = true;
                    }
                }
            }
        }
        HashMap hashMap4 = this.f;
        if (hashMap4 != null) {
            Iterator it6 = hashMap4.entrySet().iterator();
            while (it6.hasNext()) {
                g gVar2 = (g) ((Map.Entry) it6.next()).getValue();
                if (gVar2 != null) {
                    gVar2.d = true;
                }
            }
        }
        this.h = this.i;
        this.i = null;
        this.j = 0;
    }

    public final g a(e eVar) {
        g a2 = a(this.c, eVar);
        if (!a(a2)) {
            HashMap hashMap = this.d;
            if (!A.a(hashMap)) {
                Iterator it = b(eVar).iterator();
                while (it.hasNext()) {
                    ArrayList a3 = A.a((List) hashMap.get((e) it.next()), new c());
                    g gVar = (g) (A.a(a3) ? null : a3.get(new Random().nextInt(a3.size())));
                    if (a(gVar)) {
                        a2 = gVar;
                        break;
                    }
                }
            }
            a2 = null;
            if (!a(a2)) {
                a2 = a(this.f, eVar);
                if (!a(a2)) {
                    HashMap hashMap2 = this.g;
                    if (!A.a(hashMap2)) {
                        Iterator it2 = b(eVar).iterator();
                        while (it2.hasNext()) {
                            ArrayList a4 = A.a((List) hashMap2.get((e) it2.next()), new c());
                            g gVar2 = (g) (A.a(a4) ? null : a4.get(new Random().nextInt(a4.size())));
                            if (a(gVar2)) {
                                a2 = gVar2;
                                break;
                            }
                        }
                    }
                    a2 = null;
                    a(a2);
                }
            }
        }
        if (a(a2)) {
            return a2;
        }
        return null;
    }

    public final void b(g gVar) {
        HashMap hashMap;
        if (gVar == null) {
            return;
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            int i = gVar.c;
            if (i == 0) {
                HashMap hashMap2 = this.f;
                if (hashMap2 != null) {
                    for (g gVar2 : hashMap2.values()) {
                        if (gVar2 != null && TextUtils.equals(gVar2.f12519a, gVar.f12519a)) {
                            arrayList.add(gVar2);
                        }
                    }
                }
            } else if (i == 1) {
                HashMap hashMap3 = this.c;
                if (hashMap3 != null) {
                    for (g gVar3 : hashMap3.values()) {
                        if (gVar3 != null && TextUtils.equals(gVar3.f12519a, gVar.f12519a)) {
                            arrayList.add(gVar3);
                        }
                    }
                }
            } else if (i == 2) {
                HashMap hashMap4 = this.d;
                if (hashMap4 != null) {
                    Iterator it = hashMap4.values().iterator();
                    while (it.hasNext()) {
                        for (g gVar4 : (List) it.next()) {
                            if (gVar4 != null && TextUtils.equals(gVar4.f12519a, gVar.f12519a)) {
                                arrayList.add(gVar4);
                            }
                        }
                    }
                }
            } else if (i == 3 && (hashMap = this.g) != null) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (g gVar5 : (List) it2.next()) {
                        if (gVar5 != null && TextUtils.equals(gVar5.f12519a, gVar.f12519a)) {
                            arrayList.add(gVar5);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((g) it3.next()).d = true;
                }
            }
        }
    }

    public static g a(Map map, e eVar) {
        if (!A.a(map)) {
            Iterator it = b(eVar).iterator();
            while (it.hasNext()) {
                g gVar = (g) map.get((e) it.next());
                if (a(gVar)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public final sg.bigo.ads.Q0.o a(String str, int i, String str2) {
        boolean z;
        synchronized (this) {
            g gVar = this.i;
            if (gVar != null && this.j < this.e) {
                return new sg.bigo.ads.Q0.o(gVar, false, false);
            }
            if (TextUtils.isEmpty(str)) {
                str = "all";
            }
            e eVar = new e(str2, i, str);
            g a2 = a(eVar);
            if (a(a2)) {
                z = false;
            } else {
                b();
                a2 = a(eVar);
                z = true;
            }
            if (a(a2)) {
                a2.d = false;
                this.h = this.i;
                this.i = new g(a2.f12519a, a2.c, a2.b);
                this.j = 0;
            }
            if (this.i == null) {
                this.i = new g(this.f12520a, 0, "");
            }
            return new sg.bigo.ads.Q0.o(this.i, z, true);
        }
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f12520a)) {
            hashMap.put(new e("all", 0, "all"), new g(this.f12520a, 0, ""));
        }
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put(new e("ru", 0, "all"), new g(this.b, 0, ""));
        }
        return hashMap;
    }

    @Override // sg.bigo.ads.U.g
    public void b(Parcel parcel) {
        synchronized (this) {
            HashMap hashMap = this.c;
            int i = 0;
            int size = hashMap == null ? 0 : hashMap.size();
            parcel.writeInt(size);
            if (size != 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sg.bigo.ads.U.g gVar = (sg.bigo.ads.U.g) entry.getKey();
                    sg.bigo.ads.U.g gVar2 = (sg.bigo.ads.U.g) entry.getValue();
                    sg.bigo.ads.U.n.b(parcel, gVar);
                    sg.bigo.ads.U.n.b(parcel, gVar2);
                }
            }
            HashMap hashMap2 = this.d;
            int size2 = hashMap2 == null ? 0 : hashMap2.size();
            parcel.writeInt(size2);
            if (size2 != 0) {
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    sg.bigo.ads.U.n.b(parcel, (sg.bigo.ads.U.g) entry2.getKey());
                    sg.bigo.ads.U.n.a(parcel, (Collection) entry2.getValue());
                }
            }
            parcel.writeInt(this.e);
            HashMap hashMap3 = this.f;
            int size3 = hashMap3 == null ? 0 : hashMap3.size();
            parcel.writeInt(size3);
            if (size3 != 0) {
                for (Map.Entry entry3 : hashMap3.entrySet()) {
                    sg.bigo.ads.U.g gVar3 = (sg.bigo.ads.U.g) entry3.getKey();
                    sg.bigo.ads.U.g gVar4 = (sg.bigo.ads.U.g) entry3.getValue();
                    sg.bigo.ads.U.n.b(parcel, gVar3);
                    sg.bigo.ads.U.n.b(parcel, gVar4);
                }
            }
            HashMap hashMap4 = this.g;
            if (hashMap4 != null) {
                i = hashMap4.size();
            }
            parcel.writeInt(i);
            if (i != 0) {
                for (Map.Entry entry4 : hashMap4.entrySet()) {
                    sg.bigo.ads.U.n.b(parcel, (sg.bigo.ads.U.g) entry4.getKey());
                    sg.bigo.ads.U.n.a(parcel, (Collection) entry4.getValue());
                }
            }
            sg.bigo.ads.U.n.b(parcel, this.h);
            sg.bigo.ads.U.n.b(parcel, this.i);
            parcel.writeInt(this.j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(sg.bigo.ads.T0.g gVar) {
        synchronized (this) {
            if (A.a(this.c)) {
                return null;
            }
            if (gVar == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) ((Map.Entry) it.next()).getValue();
                if (!gVar2.d) {
                    if (gVar2.e % gVar.R == 0) {
                        gVar2.g = 0;
                        if (gVar2.f != 0) {
                            if (Math.round(Math.abs(currentTimeMillis - r5) / 8.64E7f) > gVar.T) {
                            }
                            gVar2 = null;
                        }
                        if (gVar2 != null) {
                            gVar2.f = currentTimeMillis;
                            gVar2.e++;
                            return new Pair(gVar2.f12519a, Integer.valueOf(gVar2.e));
                        }
                    } else {
                        if (Math.round(Math.abs(currentTimeMillis - gVar2.f) / 60000.0f) > gVar.S) {
                            if (gVar2 != null) {
                            }
                        }
                        gVar2 = null;
                        if (gVar2 != null) {
                        }
                    }
                }
            }
            return null;
        }
    }

    public static boolean a(g gVar) {
        return gVar != null && gVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0081 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // sg.bigo.ads.U.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Parcel parcel) {
        int readInt;
        e eVar;
        int readInt2;
        g gVar;
        int readInt3;
        e eVar2;
        ArrayList b;
        int readInt4;
        e eVar3;
        int readInt5;
        g gVar2;
        int readInt6;
        e eVar4;
        ArrayList b2;
        synchronized (this) {
            f fVar = g.h;
            HashMap hashMap = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt7 = parcel.readInt(); readInt7 > 0; readInt7--) {
                    if (parcel.dataAvail() > 0 && (readInt = parcel.readInt()) != 0 && readInt <= parcel.dataAvail()) {
                        byte[] bArr = new byte[readInt];
                        parcel.readByteArray(bArr);
                        eVar = new e("", 0, "all");
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        eVar.a(obtain);
                        if (parcel.dataAvail() > 0 && (readInt2 = parcel.readInt()) != 0 && readInt2 <= parcel.dataAvail()) {
                            byte[] bArr2 = new byte[readInt2];
                            parcel.readByteArray(bArr2);
                            gVar = new g("", 0, "");
                            Parcel obtain2 = Parcel.obtain();
                            obtain2.unmarshall(bArr2, 0, readInt2);
                            obtain2.setDataPosition(0);
                            gVar.a(obtain2);
                            if (eVar != null && gVar != null) {
                                hashMap.put(eVar, gVar);
                            }
                        }
                        gVar = null;
                        if (eVar != null) {
                            hashMap.put(eVar, gVar);
                        }
                    }
                    eVar = null;
                    if (parcel.dataAvail() > 0) {
                        byte[] bArr22 = new byte[readInt2];
                        parcel.readByteArray(bArr22);
                        gVar = new g("", 0, "");
                        Parcel obtain22 = Parcel.obtain();
                        obtain22.unmarshall(bArr22, 0, readInt2);
                        obtain22.setDataPosition(0);
                        gVar.a(obtain22);
                        if (eVar != null) {
                        }
                    }
                    gVar = null;
                    if (eVar != null) {
                    }
                }
            }
            this.c = hashMap;
            f fVar2 = g.h;
            HashMap hashMap2 = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt8 = parcel.readInt(); readInt8 > 0; readInt8--) {
                    if (parcel.dataAvail() > 0 && (readInt3 = parcel.readInt()) != 0 && readInt3 <= parcel.dataAvail()) {
                        byte[] bArr3 = new byte[readInt3];
                        parcel.readByteArray(bArr3);
                        eVar2 = new e("", 0, "all");
                        Parcel obtain3 = Parcel.obtain();
                        obtain3.unmarshall(bArr3, 0, readInt3);
                        obtain3.setDataPosition(0);
                        eVar2.a(obtain3);
                        b = sg.bigo.ads.U.n.b(parcel, fVar2);
                        if (eVar2 != null && !A.a(b)) {
                            hashMap2.put(eVar2, b);
                        }
                    }
                    eVar2 = null;
                    b = sg.bigo.ads.U.n.b(parcel, fVar2);
                    if (eVar2 != null) {
                        hashMap2.put(eVar2, b);
                    }
                }
            }
            this.d = hashMap2;
            this.e = parcel.dataAvail() > 0 ? parcel.readInt() : 3;
            HashMap hashMap3 = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt9 = parcel.readInt(); readInt9 > 0; readInt9--) {
                    if (parcel.dataAvail() > 0 && (readInt4 = parcel.readInt()) != 0 && readInt4 <= parcel.dataAvail()) {
                        byte[] bArr4 = new byte[readInt4];
                        parcel.readByteArray(bArr4);
                        eVar3 = new e("", 0, "all");
                        Parcel obtain4 = Parcel.obtain();
                        obtain4.unmarshall(bArr4, 0, readInt4);
                        obtain4.setDataPosition(0);
                        eVar3.a(obtain4);
                        if (parcel.dataAvail() > 0 && (readInt5 = parcel.readInt()) != 0 && readInt5 <= parcel.dataAvail()) {
                            byte[] bArr5 = new byte[readInt5];
                            parcel.readByteArray(bArr5);
                            gVar2 = new g("", 0, "");
                            Parcel obtain5 = Parcel.obtain();
                            obtain5.unmarshall(bArr5, 0, readInt5);
                            obtain5.setDataPosition(0);
                            gVar2.a(obtain5);
                            if (eVar3 != null && gVar2 != null) {
                                hashMap3.put(eVar3, gVar2);
                            }
                        }
                        gVar2 = null;
                        if (eVar3 != null) {
                            hashMap3.put(eVar3, gVar2);
                        }
                    }
                    eVar3 = null;
                    if (parcel.dataAvail() > 0) {
                        byte[] bArr52 = new byte[readInt5];
                        parcel.readByteArray(bArr52);
                        gVar2 = new g("", 0, "");
                        Parcel obtain52 = Parcel.obtain();
                        obtain52.unmarshall(bArr52, 0, readInt5);
                        obtain52.setDataPosition(0);
                        gVar2.a(obtain52);
                        if (eVar3 != null) {
                        }
                    }
                    gVar2 = null;
                    if (eVar3 != null) {
                    }
                }
            }
            f fVar3 = g.h;
            HashMap hashMap4 = new HashMap();
            if (parcel.dataAvail() > 0) {
                for (int readInt10 = parcel.readInt(); readInt10 > 0; readInt10--) {
                    if (parcel.dataAvail() > 0 && (readInt6 = parcel.readInt()) != 0 && readInt6 <= parcel.dataAvail()) {
                        byte[] bArr6 = new byte[readInt6];
                        parcel.readByteArray(bArr6);
                        eVar4 = new e("", 0, "all");
                        Parcel obtain6 = Parcel.obtain();
                        obtain6.unmarshall(bArr6, 0, readInt6);
                        obtain6.setDataPosition(0);
                        eVar4.a(obtain6);
                        b2 = sg.bigo.ads.U.n.b(parcel, fVar3);
                        if (eVar4 != null && !A.a(b2)) {
                            hashMap4.put(eVar4, b2);
                        }
                    }
                    eVar4 = null;
                    b2 = sg.bigo.ads.U.n.b(parcel, fVar3);
                    if (eVar4 != null) {
                        hashMap4.put(eVar4, b2);
                    }
                }
            }
            this.g = hashMap4;
            this.h = (g) sg.bigo.ads.U.n.a(parcel, fVar);
            this.i = (g) sg.bigo.ads.U.n.a(parcel, fVar);
            this.j = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
            this.f = a();
            HashSet hashSet = new HashSet();
            for (g gVar3 : this.f.values()) {
                hashSet.add(gVar3.f12519a);
                if (!A.a(hashMap3)) {
                    for (g gVar4 : hashMap3.values()) {
                        if (TextUtils.equals(gVar3.f12519a, gVar4.f12519a)) {
                            gVar3.d = gVar4.d;
                        }
                    }
                }
            }
            g gVar5 = this.i;
            if (gVar5 != null && gVar5.c == 0 && !hashSet.contains(gVar5.f12519a)) {
                this.h = this.i;
                this.i = null;
                this.j = 0;
            }
        }
    }

    public final void a(HashMap hashMap, HashMap hashMap2, String str, int i) {
        g gVar;
        String str2;
        g gVar2;
        g gVar3;
        synchronized (this) {
            if (!A.a(this.c) && !A.a(hashMap)) {
                for (Map.Entry entry : this.c.entrySet()) {
                    e eVar = (e) entry.getKey();
                    if (eVar != null && (gVar2 = (g) entry.getValue()) != null && (gVar3 = (g) hashMap.get(eVar)) != null && gVar2.equals(gVar3)) {
                        gVar2.b = gVar3.b;
                    }
                }
            }
            if (!A.a(this.d) && !A.a(hashMap2)) {
                for (Map.Entry entry2 : this.d.entrySet()) {
                    e eVar2 = (e) entry2.getKey();
                    if (eVar2 != null) {
                        List<g> list = (List) entry2.getValue();
                        if (!A.a(list)) {
                            List list2 = (List) hashMap2.get(eVar2);
                            if (!A.a(list2)) {
                                for (g gVar4 : list) {
                                    if (gVar4 != null) {
                                        Iterator it = list2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                g gVar5 = (g) it.next();
                                                if (gVar4.equals(gVar5)) {
                                                    gVar4.b = gVar5.b;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            g gVar6 = this.i;
            if (gVar6 != null) {
                int i2 = gVar6.c;
                if (i2 == 1) {
                    g gVar7 = (g) this.c.get(new e(str, i, "all"));
                    if (this.i.equals(gVar7)) {
                        gVar = this.i;
                        str2 = gVar7.b;
                        gVar.b = str2;
                        break;
                    }
                } else if (i2 == 2) {
                    List<g> list3 = (List) this.d.get(new e(str, i, "all"));
                    if (!A.a(list3)) {
                        for (g gVar8 : list3) {
                            if (this.i.equals(gVar8)) {
                                g gVar9 = this.i;
                                String str3 = gVar8.b;
                                gVar = gVar9;
                                str2 = str3;
                                gVar.b = str2;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(JSONObject jSONObject, boolean z, String str, int i) {
        synchronized (this) {
            HashMap hashMap = new HashMap();
            JSONArray optJSONArray = jSONObject.optJSONArray("country_hosts");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("host", "");
                        if (AbstractC4955l.a(optString)) {
                            hashMap.put(new e(optJSONObject.optString("country", "all"), optJSONObject.optInt("app_flag", 0), optJSONObject.optString("asn", "all")), new g(optString, 1, optJSONObject.optString("domain_front", "")));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("backup_hosts");
            if (optJSONArray2 != null) {
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        e eVar = new e(optJSONObject2.optString("country", "all"), optJSONObject2.optInt("app_flag", 0), optJSONObject2.optString("asn", "all"));
                        List list = (List) hashMap2.get(eVar);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(eVar, list);
                        }
                        String optString2 = optJSONObject2.optString("domain_front", "");
                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("hosts");
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                String optString3 = optJSONArray3.optString(i4, "");
                                if (AbstractC4955l.a(optString3)) {
                                    g gVar = new g(optString3, 2, optString2);
                                    if (!list.contains(gVar)) {
                                        list.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                a(hashMap, hashMap2, str, i);
            } else {
                int optInt = jSONObject.optInt("threshold", 3);
                this.c = hashMap;
                this.d = hashMap2;
                this.e = optInt;
                this.g = new HashMap();
                this.f = a();
                this.h = this.i;
                this.i = null;
                this.j = 0;
            }
        }
    }
}
