package B4;

import a.AbstractC0603a;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;
import w1.P2;

/* renamed from: B4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0072p {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f1186a;

    /* renamed from: b, reason: collision with root package name */
    public final H4.h f1187b;

    /* renamed from: c, reason: collision with root package name */
    public final H4.k f1188c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f1189d;

    public C0072p(FirebaseFirestore firebaseFirestore, H4.h hVar, H4.k kVar, boolean z4, boolean z7) {
        firebaseFirestore.getClass();
        this.f1186a = firebaseFirestore;
        hVar.getClass();
        this.f1187b = hVar;
        this.f1188c = kVar;
        this.f1189d = new f0(z7, z4);
    }

    public HashMap a(EnumC0071o enumC0071o) {
        AbstractC0603a.f(enumC0071o, "Provided serverTimestampBehavior value must not be null.");
        P2 p22 = new P2(3, this.f1186a, enumC0071o, false);
        H4.k kVar = this.f1188c;
        if (kVar == null) {
            return null;
        }
        return p22.e(kVar.f3327e.b().N().y());
    }

    public Map b() {
        return a(EnumC0071o.f1184d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0072p)) {
            return false;
        }
        C0072p c0072p = (C0072p) obj;
        if (this.f1186a.equals(c0072p.f1186a) && this.f1187b.equals(c0072p.f1187b) && this.f1189d.equals(c0072p.f1189d)) {
            H4.k kVar = c0072p.f1188c;
            H4.k kVar2 = this.f1188c;
            if (kVar2 == null) {
                if (kVar == null) {
                    return true;
                }
            } else if (kVar != null && kVar2.f3327e.equals(kVar.f3327e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1187b.f3318a.hashCode() + (this.f1186a.hashCode() * 31)) * 31;
        H4.k kVar = this.f1188c;
        return this.f1189d.hashCode() + ((((hashCode + (kVar != null ? kVar.f3323a.f3318a.hashCode() : 0)) * 31) + (kVar != null ? kVar.f3327e.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f1187b + ", metadata=" + this.f1189d + ", doc=" + this.f1188c + '}';
    }
}
