package De;

import android.os.Parcel;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.V0;
import com.google.crypto.tink.internal.AbstractC5889h;
import g8.C6659a;
import h8.C6873a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002if.j;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* renamed from: De.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C2859b implements AbstractC5889h.a {
    public static int a(Class cls, Parcel parcel, LinkedHashMap linkedHashMap, String str, int i11, int i12) {
        linkedHashMap.put(str, parcel.readParcelable(cls.getClassLoader()));
        return i11 + i12;
    }

    public static int c(ButtonV3DTO buttonV3DTO, int i11, int i12) {
        return (buttonV3DTO.hashCode() + i11) * i12;
    }

    public static U0 d(V0.b bVar, V0.a aVar, U0 u02, ArrayList arrayList, U0 u03) {
        u02.a(V0.a(bVar, aVar));
        arrayList.add(u03);
        return new U0();
    }

    public static String e(WZ.t tVar, String str, String str2, StringBuilder sb2, AtomAction atomAction) {
        sb2.append(atomAction);
        sb2.append(str);
        sb2.append(tVar);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String f(String str, String str2, AtomActionDTO atomActionDTO) {
        return str + atomActionDTO + str2;
    }

    public static void g(j.a aVar, String str, int i11) {
        p002if.j jVar;
        aVar.getClass();
        jVar = p002if.j.f66398a;
        p002if.j.k(jVar, str, i11);
    }

    public static /* synthetic */ boolean h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC2861d abstractC2861d, Object obj, AbstractC2861d abstractC2861d2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2861d, obj, abstractC2861d2)) {
            if (atomicReferenceFieldUpdater.get(abstractC2861d) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public com.google.crypto.tink.internal.F b(He.g gVar, S7.r rVar) {
        return C6873a.d((C6659a) gVar, rVar);
    }
}
