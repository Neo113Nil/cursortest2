package com.google.firebase.auth.internal;

import Y3.i;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zze;
import e4.InterfaceC1042p;
import f4.C1092d;
import f4.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new C1092d(2);

    /* renamed from: A, reason: collision with root package name */
    public boolean f11904A;

    /* renamed from: B, reason: collision with root package name */
    public zze f11905B;

    /* renamed from: C, reason: collision with root package name */
    public zzbl f11906C;

    /* renamed from: D, reason: collision with root package name */
    public List f11907D;

    /* renamed from: a, reason: collision with root package name */
    public zzagl f11908a;

    /* renamed from: b, reason: collision with root package name */
    public zzz f11909b;

    /* renamed from: c, reason: collision with root package name */
    public String f11910c;

    /* renamed from: d, reason: collision with root package name */
    public String f11911d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f11912e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f11913f;

    /* renamed from: x, reason: collision with root package name */
    public String f11914x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f11915y;

    /* renamed from: z, reason: collision with root package name */
    public zzaf f11916z;

    public zzad(i iVar, ArrayList arrayList) {
        D.i(iVar);
        iVar.b();
        this.f11910c = iVar.f7664b;
        this.f11911d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f11914x = "2";
        n(arrayList);
    }

    @Override // e4.InterfaceC1042p
    public final String a() {
        return this.f11909b.f11939a;
    }

    @Override // e4.InterfaceC1042p
    public final Uri b() {
        return this.f11909b.b();
    }

    @Override // e4.InterfaceC1042p
    public final boolean c() {
        return this.f11909b.f11946y;
    }

    @Override // e4.InterfaceC1042p
    public final String d() {
        return this.f11909b.f11945x;
    }

    @Override // e4.InterfaceC1042p
    public final String e() {
        return this.f11909b.f11941c;
    }

    @Override // e4.InterfaceC1042p
    public final String g() {
        return this.f11909b.f11940b;
    }

    @Override // e4.InterfaceC1042p
    public final String i() {
        return this.f11909b.f11944f;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String j() {
        Map map;
        zzagl zzaglVar = this.f11908a;
        if (zzaglVar == null || zzaglVar.zzc() == null || (map = (Map) p.a(this.f11908a.zzc()).f12682b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean k() {
        String str;
        Boolean bool = this.f11915y;
        if (bool == null || bool.booleanValue()) {
            zzagl zzaglVar = this.f11908a;
            if (zzaglVar != null) {
                Map map = (Map) p.a(zzaglVar.zzc()).f12682b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z4 = true;
            if (this.f11912e.size() > 1 || (str != null && str.equals("custom"))) {
                z4 = false;
            }
            this.f11915y = Boolean.valueOf(z4);
        }
        return this.f11915y.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized zzad n(ArrayList arrayList) {
        try {
            D.i(arrayList);
            this.f11912e = new ArrayList(arrayList.size());
            this.f11913f = new ArrayList(arrayList.size());
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                InterfaceC1042p interfaceC1042p = (InterfaceC1042p) arrayList.get(i7);
                if (interfaceC1042p.g().equals("firebase")) {
                    this.f11909b = (zzz) interfaceC1042p;
                } else {
                    this.f11913f.add(interfaceC1042p.g());
                }
                this.f11912e.add((zzz) interfaceC1042p);
            }
            if (this.f11909b == null) {
                this.f11909b = (zzz) this.f11912e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void o(ArrayList arrayList) {
        zzbl zzblVar;
        if (arrayList.isEmpty()) {
            zzblVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList2.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList3.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzblVar = new zzbl(arrayList2, arrayList3);
        }
        this.f11906C = zzblVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f11908a, i7, false);
        Y4.D.r0(parcel, 2, this.f11909b, i7, false);
        Y4.D.s0(parcel, 3, this.f11910c, false);
        Y4.D.s0(parcel, 4, this.f11911d, false);
        Y4.D.w0(parcel, 5, this.f11912e, false);
        Y4.D.u0(parcel, 6, this.f11913f);
        Y4.D.s0(parcel, 7, this.f11914x, false);
        boolean k7 = k();
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(k7 ? 1 : 0);
        Y4.D.r0(parcel, 9, this.f11916z, i7, false);
        boolean z4 = this.f11904A;
        Y4.D.B0(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Y4.D.r0(parcel, 11, this.f11905B, i7, false);
        Y4.D.r0(parcel, 12, this.f11906C, i7, false);
        Y4.D.w0(parcel, 13, this.f11907D, false);
        Y4.D.z0(x02, parcel);
    }
}
