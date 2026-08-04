package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import Y4.D;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbai> CREATOR = new zzbaj();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbai(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z4, long j3, String str5, int i7) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z4;
        this.zzh = j3;
        this.zzi = str5;
        this.zzj = i7;
    }

    public static zzbai zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                String str = "Expected 2 path parts for namespace and id, found :" + pathSegments.size();
                int i7 = J.f3546b;
                j.g(str);
                return null;
            }
            String str2 = pathSegments.get(0);
            String str3 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str4 : uri.getQueryParameterNames()) {
                if (str4.startsWith("tag.")) {
                    bundle.putString(str4.substring(4), uri.getQueryParameter(str4));
                }
            }
            return new zzbai(queryParameter, j, host, str2, str3, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e7) {
            e = e7;
            int i8 = J.f3546b;
            j.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e8) {
            e = e8;
            int i9 = J.f3546b;
            j.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, str, false);
        long j = this.zzb;
        D.B0(parcel, 3, 8);
        parcel.writeLong(j);
        D.s0(parcel, 4, this.zzc, false);
        D.s0(parcel, 5, this.zzd, false);
        D.s0(parcel, 6, this.zze, false);
        D.k0(parcel, 7, this.zzf, false);
        boolean z4 = this.zzg;
        D.B0(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j3 = this.zzh;
        D.B0(parcel, 9, 8);
        parcel.writeLong(j3);
        D.s0(parcel, 10, this.zzi, false);
        int i8 = this.zzj;
        D.B0(parcel, 11, 4);
        parcel.writeInt(i8);
        D.z0(iX0, parcel);
    }
}
