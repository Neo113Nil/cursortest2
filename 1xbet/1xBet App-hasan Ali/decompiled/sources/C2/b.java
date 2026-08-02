package C2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public final String f818k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f819l;

    public b(String str, Map map) {
        this.f818k = str;
        this.f819l = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f818k, bVar.f818k) && l.a(this.f819l, bVar.f819l);
    }

    public final int hashCode() {
        return this.f819l.hashCode() + (this.f818k.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f818k + ", extras=" + this.f819l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f818k);
        Map map = this.f819l;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
