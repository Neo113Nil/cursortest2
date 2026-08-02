package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "StringListCreator")
/* loaded from: classes.dex */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();

    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;

    @SafeParcelable.Field(getter = "getValues", id = 2)
    private List<String> zzkh;

    public zzbd() {
        this(null);
    }

    @SafeParcelable.Constructor
    zzbd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) List<String> list) {
        List<String> emptyList;
        this.versionCode = i;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, Strings.emptyToNull(list.get(i2)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.zzkh = emptyList;
    }

    private zzbd(@Nullable List<String> list) {
        this.versionCode = 1;
        this.zzkh = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.zzkh.addAll(list);
    }

    public static zzbd zza(zzbd zzbdVar) {
        return new zzbd(zzbdVar != null ? zzbdVar.zzkh : null);
    }

    public static zzbd zzbd() {
        return new zzbd(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzkh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List<String> zzbc() {
        return this.zzkh;
    }
}
