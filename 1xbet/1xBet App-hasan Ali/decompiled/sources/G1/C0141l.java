package G1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0487p;

/* renamed from: G1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141l implements Parcelable {
    public static final Parcelable.Creator<C0141l> CREATOR = new C2.a(4);

    /* renamed from: k, reason: collision with root package name */
    public final String f1910k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1911l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f1912m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f1913n;

    public C0141l(C0140k c0140k) {
        kotlin.jvm.internal.l.f("entry", c0140k);
        this.f1910k = c0140k.f1903p;
        this.f1911l = c0140k.f1899l.f1969p;
        this.f1912m = c0140k.c();
        Bundle bundle = new Bundle();
        this.f1913n = bundle;
        c0140k.f1906s.p(bundle);
    }

    public final C0140k a(Context context, y yVar, EnumC0487p enumC0487p, r rVar) {
        kotlin.jvm.internal.l.f("context", context);
        kotlin.jvm.internal.l.f("hostLifecycleState", enumC0487p);
        Bundle bundle = this.f1912m;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f1910k;
        kotlin.jvm.internal.l.f("id", str);
        return new C0140k(context, yVar, bundle2, enumC0487p, rVar, str, this.f1913n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.l.f("parcel", parcel);
        parcel.writeString(this.f1910k);
        parcel.writeInt(this.f1911l);
        parcel.writeBundle(this.f1912m);
        parcel.writeBundle(this.f1913n);
    }

    public C0141l(Parcel parcel) {
        String readString = parcel.readString();
        kotlin.jvm.internal.l.c(readString);
        this.f1910k = readString;
        this.f1911l = parcel.readInt();
        this.f1912m = parcel.readBundle(C0141l.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(C0141l.class.getClassLoader());
        kotlin.jvm.internal.l.c(readBundle);
        this.f1913n = readBundle;
    }
}
