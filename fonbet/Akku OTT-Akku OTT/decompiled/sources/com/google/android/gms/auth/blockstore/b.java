package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new g();
    public final ArrayList a;
    public final boolean b;

    public b(ArrayList arrayList, boolean z) {
        if (z) {
            boolean z2 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            }
            C0875q.i(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.b = z;
        this.a = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C0875q.e(str, "Element in keys cannot be null or empty");
                this.a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 1, Collections.unmodifiableList(this.a));
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
