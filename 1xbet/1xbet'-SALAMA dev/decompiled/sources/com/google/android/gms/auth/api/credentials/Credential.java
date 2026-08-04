package com.google.android.gms.auth.api.credentials;

import V2.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f10912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10915f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10917y;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        Boolean boolValueOf;
        D.j(str, "credential identifier cannot be null");
        String strTrim = str.trim();
        D.f(strTrim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            if (TextUtils.isEmpty(str4)) {
                boolValueOf = Boolean.FALSE;
            } else {
                Uri uri2 = Uri.parse(str4);
                if (!uri2.isAbsolute() || !uri2.isHierarchical() || TextUtils.isEmpty(uri2.getScheme()) || TextUtils.isEmpty(uri2.getAuthority())) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    boolean z4 = true;
                    if (!"http".equalsIgnoreCase(uri2.getScheme()) && !"https".equalsIgnoreCase(uri2.getScheme())) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            if (!boolValueOf.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f10911b = str2;
        this.f10912c = uri;
        this.f10913d = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f10910a = strTrim;
        this.f10914e = str3;
        this.f10915f = str4;
        this.f10916x = str5;
        this.f10917y = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f10910a, credential.f10910a) && TextUtils.equals(this.f10911b, credential.f10911b) && D.m(this.f10912c, credential.f10912c) && TextUtils.equals(this.f10914e, credential.f10914e) && TextUtils.equals(this.f10915f, credential.f10915f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10910a, this.f10911b, this.f10912c, this.f10914e, this.f10915f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f10910a, false);
        Y4.D.s0(parcel, 2, this.f10911b, false);
        Y4.D.r0(parcel, 3, this.f10912c, i7, false);
        Y4.D.w0(parcel, 4, this.f10913d, false);
        Y4.D.s0(parcel, 5, this.f10914e, false);
        Y4.D.s0(parcel, 6, this.f10915f, false);
        Y4.D.s0(parcel, 9, this.f10916x, false);
        Y4.D.s0(parcel, 10, this.f10917y, false);
        Y4.D.z0(iX0, parcel);
    }
}
