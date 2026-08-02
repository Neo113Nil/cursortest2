package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaas;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new zzan();
    private final List<PhoneMultiFactorInfo> zza;
    private final zzam zzb;
    private final String zzc;
    private final com.google.firebase.auth.zze zzd;
    private final zzaf zze;
    private final List<TotpMultiFactorInfo> zzf;

    public zzal(List<PhoneMultiFactorInfo> list, zzam zzamVar, String str, @Nullable com.google.firebase.auth.zze zzeVar, @Nullable zzaf zzafVar, List<TotpMultiFactorInfo> list2) {
        C0875q.g(list);
        this.zza = list;
        C0875q.g(zzamVar);
        this.zzb = zzamVar;
        C0875q.d(str);
        this.zzc = str;
        this.zzd = zzeVar;
        this.zze = zzafVar;
        C0875q.g(list2);
        this.zzf = list2;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final FirebaseAuth getFirebaseAuth() {
        return FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzc));
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final List<MultiFactorInfo> getHints() {
        ArrayList arrayList = new ArrayList();
        Iterator<PhoneMultiFactorInfo> it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<TotpMultiFactorInfo> it2 = this.zzf.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final MultiFactorSession getSession() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final Task<AuthResult> resolveSignIn(MultiFactorAssertion multiFactorAssertion) {
        return getFirebaseAuth().zza(multiFactorAssertion, this.zzb, this.zze).continueWithTask(new zzak(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.p(parcel, 1, this.zza, false);
        c.k(parcel, 2, getSession(), i, false);
        c.l(parcel, 3, this.zzc, false);
        c.k(parcel, 4, this.zzd, i, false);
        c.k(parcel, 5, this.zze, i, false);
        c.p(parcel, 6, this.zzf, false);
        c.r(parcel, q);
    }

    public static zzal zza(zzaas zzaasVar, FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        List<MultiFactorInfo> zzc = zzaasVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : zzc) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        List<MultiFactorInfo> zzc2 = zzaasVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo2 : zzc2) {
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        return new zzal(arrayList, zzam.zza(zzaasVar.zzc(), zzaasVar.zzb()), firebaseAuth.getApp().getName(), zzaasVar.zza(), (zzaf) firebaseUser, arrayList2);
    }
}
