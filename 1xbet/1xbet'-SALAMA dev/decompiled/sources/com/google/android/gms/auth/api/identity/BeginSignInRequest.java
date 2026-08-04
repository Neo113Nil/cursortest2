package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordRequestOptions f10955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f10956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PasskeysRequestOptions f10960f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f10961x;

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f10965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f10967f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f10968x;

        public GoogleIdTokenRequestOptions(boolean z4, String str, String str2, boolean z7, String str3, ArrayList arrayList, boolean z8) {
            boolean z9 = true;
            if (z7 && z8) {
                z9 = false;
            }
            D.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z9);
            this.f10962a = z4;
            if (z4) {
                D.j(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f10963b = str;
            this.f10964c = str2;
            this.f10965d = z7;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f10967f = arrayList2;
            this.f10966e = str3;
            this.f10968x = z8;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f10962a == googleIdTokenRequestOptions.f10962a && D.m(this.f10963b, googleIdTokenRequestOptions.f10963b) && D.m(this.f10964c, googleIdTokenRequestOptions.f10964c) && this.f10965d == googleIdTokenRequestOptions.f10965d && D.m(this.f10966e, googleIdTokenRequestOptions.f10966e) && D.m(this.f10967f, googleIdTokenRequestOptions.f10967f) && this.f10968x == googleIdTokenRequestOptions.f10968x;
        }

        public final int hashCode() {
            Boolean boolValueOf = Boolean.valueOf(this.f10962a);
            Boolean boolValueOf2 = Boolean.valueOf(this.f10965d);
            Boolean boolValueOf3 = Boolean.valueOf(this.f10968x);
            return Arrays.hashCode(new Object[]{boolValueOf, this.f10963b, this.f10964c, boolValueOf2, this.f10966e, this.f10967f, boolValueOf3});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int iX0 = Y4.D.x0(20293, parcel);
            Y4.D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10962a ? 1 : 0);
            Y4.D.s0(parcel, 2, this.f10963b, false);
            Y4.D.s0(parcel, 3, this.f10964c, false);
            Y4.D.B0(parcel, 4, 4);
            parcel.writeInt(this.f10965d ? 1 : 0);
            Y4.D.s0(parcel, 5, this.f10966e, false);
            Y4.D.u0(parcel, 6, this.f10967f);
            Y4.D.B0(parcel, 7, 4);
            parcel.writeInt(this.f10968x ? 1 : 0);
            Y4.D.z0(iX0, parcel);
        }
    }

    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10970b;

        public PasskeyJsonRequestOptions(boolean z4, String str) {
            if (z4) {
                D.i(str);
            }
            this.f10969a = z4;
            this.f10970b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f10969a == passkeyJsonRequestOptions.f10969a && D.m(this.f10970b, passkeyJsonRequestOptions.f10970b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10969a), this.f10970b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int iX0 = Y4.D.x0(20293, parcel);
            Y4.D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10969a ? 1 : 0);
            Y4.D.s0(parcel, 2, this.f10970b, false);
            Y4.D.z0(iX0, parcel);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f10972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10973c;

        public PasskeysRequestOptions(byte[] bArr, String str, boolean z4) {
            if (z4) {
                D.i(bArr);
                D.i(str);
            }
            this.f10971a = z4;
            this.f10972b = bArr;
            this.f10973c = str;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f10971a == passkeysRequestOptions.f10971a && Arrays.equals(this.f10972b, passkeysRequestOptions.f10972b) && ((str = this.f10973c) == (str2 = passkeysRequestOptions.f10973c) || (str != null && str.equals(str2)));
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f10972b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10971a), this.f10973c}) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int iX0 = Y4.D.x0(20293, parcel);
            Y4.D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10971a ? 1 : 0);
            Y4.D.l0(parcel, 2, this.f10972b, false);
            Y4.D.s0(parcel, 3, this.f10973c, false);
            Y4.D.z0(iX0, parcel);
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10974a;

        public PasswordRequestOptions(boolean z4) {
            this.f10974a = z4;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f10974a == ((PasswordRequestOptions) obj).f10974a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10974a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int iX0 = Y4.D.x0(20293, parcel);
            Y4.D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10974a ? 1 : 0);
            Y4.D.z0(iX0, parcel);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z4, int i7, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        D.i(passwordRequestOptions);
        this.f10955a = passwordRequestOptions;
        D.i(googleIdTokenRequestOptions);
        this.f10956b = googleIdTokenRequestOptions;
        this.f10957c = str;
        this.f10958d = z4;
        this.f10959e = i7;
        this.f10960f = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, null, false) : passkeysRequestOptions;
        this.f10961x = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return D.m(this.f10955a, beginSignInRequest.f10955a) && D.m(this.f10956b, beginSignInRequest.f10956b) && D.m(this.f10960f, beginSignInRequest.f10960f) && D.m(this.f10961x, beginSignInRequest.f10961x) && D.m(this.f10957c, beginSignInRequest.f10957c) && this.f10958d == beginSignInRequest.f10958d && this.f10959e == beginSignInRequest.f10959e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10955a, this.f10956b, this.f10960f, this.f10961x, this.f10957c, Boolean.valueOf(this.f10958d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 1, this.f10955a, i7, false);
        Y4.D.r0(parcel, 2, this.f10956b, i7, false);
        Y4.D.s0(parcel, 3, this.f10957c, false);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10958d ? 1 : 0);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10959e);
        Y4.D.r0(parcel, 6, this.f10960f, i7, false);
        Y4.D.r0(parcel, 7, this.f10961x, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
