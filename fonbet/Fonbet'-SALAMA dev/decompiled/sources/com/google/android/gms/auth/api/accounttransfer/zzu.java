package com.google.android.gms.auth.api.accounttransfer;

import V2.a;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import io.sentry.protocol.SentryStackFrame;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import k3.AbstractC1336a;

/* loaded from: classes.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new a(20);

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f10895x;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f10896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10897b;

    /* renamed from: c, reason: collision with root package name */
    public zzw f10898c;

    /* renamed from: d, reason: collision with root package name */
    public String f10899d;

    /* renamed from: e, reason: collision with root package name */
    public String f10900e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10901f;

    static {
        HashMap hashMap = new HashMap();
        f10895x = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        hashMap.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
        hashMap.put(SentryStackFrame.JsonKeys.PACKAGE, new FastJsonResponse$Field(7, false, 7, false, SentryStackFrame.JsonKeys.PACKAGE, 4, null));
    }

    public zzu(HashSet hashSet, int i7, zzw zzwVar, String str, String str2, String str3) {
        this.f10896a = hashSet;
        this.f10897b = i7;
        this.f10898c = zzwVar;
        this.f10899d = str;
        this.f10900e = str2;
        this.f10901f = str3;
    }

    @Override // k3.AbstractC1336a
    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, AbstractC1336a abstractC1336a) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i7), abstractC1336a.getClass().getCanonicalName()));
        }
        this.f10898c = (zzw) abstractC1336a;
        this.f10896a.add(Integer.valueOf(i7));
    }

    @Override // k3.AbstractC1336a
    public final /* synthetic */ Map getFieldMappings() {
        return f10895x;
    }

    @Override // k3.AbstractC1336a
    public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 == 1) {
            return Integer.valueOf(this.f10897b);
        }
        if (i7 == 2) {
            return this.f10898c;
        }
        if (i7 == 3) {
            return this.f10899d;
        }
        if (i7 == 4) {
            return this.f10900e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f11384x);
    }

    @Override // k3.AbstractC1336a
    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f10896a.contains(Integer.valueOf(fastJsonResponse$Field.f11384x));
    }

    @Override // k3.AbstractC1336a
    public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 == 3) {
            this.f10899d = str2;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i7)));
            }
            this.f10900e = str2;
        }
        this.f10896a.add(Integer.valueOf(i7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        HashSet hashSet = this.f10896a;
        if (hashSet.contains(1)) {
            D.B0(parcel, 1, 4);
            parcel.writeInt(this.f10897b);
        }
        if (hashSet.contains(2)) {
            D.r0(parcel, 2, this.f10898c, i7, true);
        }
        if (hashSet.contains(3)) {
            D.s0(parcel, 3, this.f10899d, true);
        }
        if (hashSet.contains(4)) {
            D.s0(parcel, 4, this.f10900e, true);
        }
        if (hashSet.contains(5)) {
            D.s0(parcel, 5, this.f10901f, true);
        }
        D.z0(x02, parcel);
    }
}
