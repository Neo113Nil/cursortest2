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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p042f4.C0895d;
import p042f4.p;

/* JADX INFO: loaded from: classes2.dex */
public class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new C0895d(2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11904A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public zze f11905B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public zzbl f11906C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f11907D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzagl f11908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzz f11909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f11912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f11913f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f11915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public zzaf f11916z;

    public zzad(i iVar, ArrayList arrayList) {
        D.i(iVar);
        iVar.b();
        this.f11910c = iVar.f7664b;
        this.f11911d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f11914x = "2";
        n(arrayList);
    }

    @Override // p034e4.p
    public final String a() {
        return this.f11909b.f11939a;
    }

    @Override // p034e4.p
    public final Uri b() {
        return this.f11909b.b();
    }

    @Override // p034e4.p
    public final boolean c() {
        return this.f11909b.f11946y;
    }

    @Override // p034e4.p
    public final String d() {
        return this.f11909b.f11945x;
    }

    @Override // p034e4.p
    public final String e() {
        return this.f11909b.f11941c;
    }

    @Override // p034e4.p
    public final String g() {
        return this.f11909b.f11940b;
    }

    @Override // p034e4.p
    public final String i() {
        return this.f11909b.f11944f;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String j() {
        Map map;
        zzagl zzaglVar = this.f11908a;
        if (zzaglVar == null || zzaglVar.zzc() == null || (map = (Map) p.a(this.f11908a.zzc()).f12688b.get("firebase")) == null) {
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
                Map map = (Map) p.a(zzaglVar.zzc()).f12688b.get("firebase");
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
                p034e4.p pVar = (p034e4.p) arrayList.get(i7);
                if (pVar.g().equals("firebase")) {
                    this.f11909b = (zzz) pVar;
                } else {
                    this.f11913f.add(pVar.g());
                }
                this.f11912e.add((zzz) pVar);
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
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f11908a, i7, false);
        Y4.D.r0(parcel, 2, this.f11909b, i7, false);
        Y4.D.s0(parcel, 3, this.f11910c, false);
        Y4.D.s0(parcel, 4, this.f11911d, false);
        Y4.D.w0(parcel, 5, this.f11912e, false);
        Y4.D.u0(parcel, 6, this.f11913f);
        Y4.D.s0(parcel, 7, this.f11914x, false);
        boolean zK = k();
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(zK ? 1 : 0);
        Y4.D.r0(parcel, 9, this.f11916z, i7, false);
        boolean z4 = this.f11904A;
        Y4.D.B0(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Y4.D.r0(parcel, 11, this.f11905B, i7, false);
        Y4.D.r0(parcel, 12, this.f11906C, i7, false);
        Y4.D.w0(parcel, 13, this.f11907D, false);
        Y4.D.z0(iX0, parcel);
    }
}
