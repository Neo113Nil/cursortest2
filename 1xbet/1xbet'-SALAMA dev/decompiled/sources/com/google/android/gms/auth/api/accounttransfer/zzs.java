package com.google.android.gms.auth.api.accounttransfer;

import V2.a;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.Map;
import p122r.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new a(19);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f10888x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f10893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f10894f;

    static {
        b bVar = new b();
        f10888x = bVar;
        bVar.put("registered", FastJsonResponse$Field.j(2, "registered"));
        bVar.put("in_progress", FastJsonResponse$Field.j(3, "in_progress"));
        bVar.put("success", FastJsonResponse$Field.j(4, "success"));
        bVar.put("failed", FastJsonResponse$Field.j(5, "failed"));
        bVar.put("escrowed", FastJsonResponse$Field.j(6, "escrowed"));
    }

    public zzs(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f10889a = i7;
        this.f10890b = arrayList;
        this.f10891c = arrayList2;
        this.f10892d = arrayList3;
        this.f10893e = arrayList4;
        this.f10894f = arrayList5;
    }

    @Override // p074k3.a
    public final Map getFieldMappings() {
        return f10888x;
    }

    @Override // p074k3.a
    public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
        switch (fastJsonResponse$Field.f11384x) {
            case 1:
                return Integer.valueOf(this.f10889a);
            case 2:
                return this.f10890b;
            case 3:
                return this.f10891c;
            case 4:
                return this.f10892d;
            case 5:
                return this.f10893e;
            case 6:
                return this.f10894f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field.f11384x);
        }
    }

    @Override // p074k3.a
    public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    @Override // p074k3.a
    public final void setStringsInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i7 = fastJsonResponse$Field.f11384x;
        if (i7 == 2) {
            this.f10890b = arrayList;
            return;
        }
        if (i7 == 3) {
            this.f10891c = arrayList;
            return;
        }
        if (i7 == 4) {
            this.f10892d = arrayList;
        } else if (i7 == 5) {
            this.f10893e = arrayList;
        } else {
            if (i7 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i7)));
            }
            this.f10894f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10889a);
        D.u0(parcel, 2, this.f10890b);
        D.u0(parcel, 3, this.f10891c);
        D.u0(parcel, 4, this.f10892d);
        D.u0(parcel, 5, this.f10893e);
        D.u0(parcel, 6, this.f10894f);
        D.z0(iX0, parcel);
    }
}
