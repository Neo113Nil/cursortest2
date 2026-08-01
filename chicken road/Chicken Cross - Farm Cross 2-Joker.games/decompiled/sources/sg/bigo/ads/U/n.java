package sg.bigo.ads.U;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class n {
    public static boolean a(Parcel parcel, boolean z) {
        return parcel.dataAvail() > 0 ? parcel.readInt() != 0 : z;
    }

    public static ArrayList b(Parcel parcel, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (parcel.dataAvail() <= 0) {
            return arrayList;
        }
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            g a2 = a(parcel, fVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static g a(Parcel parcel, f fVar) {
        int readInt;
        if (parcel.dataAvail() <= 0 || (readInt = parcel.readInt()) == 0 || readInt > parcel.dataAvail()) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        g a2 = fVar.a();
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, readInt);
        obtain.setDataPosition(0);
        a2.a(obtain);
        return a2;
    }

    public static void b(Parcel parcel, g gVar) {
        if (gVar == null) {
            parcel.writeInt(0);
            return;
        }
        Parcel obtain = Parcel.obtain();
        gVar.b(obtain);
        byte[] marshall = obtain.marshall();
        parcel.writeInt(marshall.length);
        parcel.writeByteArray(marshall);
    }

    public static boolean a(Parcel parcel, g gVar) {
        int readInt;
        if (parcel.dataAvail() <= 0 || (readInt = parcel.readInt()) == 0 || readInt > parcel.dataAvail()) {
            return false;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, readInt);
        obtain.setDataPosition(0);
        if (gVar == null) {
            return true;
        }
        gVar.a(obtain);
        return true;
    }

    public static void a(Parcel parcel, Collection collection) {
        int size = collection == null ? 0 : collection.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(parcel, (g) it.next());
        }
    }
}
