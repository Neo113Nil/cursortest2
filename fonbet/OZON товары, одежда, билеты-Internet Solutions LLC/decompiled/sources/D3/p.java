package D3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.AbstractC5880y;
import j3.C7251G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m3.N;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f5702a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5704c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C7251G> f5705d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5706e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5707f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f5708g;

    /* renamed from: h, reason: collision with root package name */
    public final c f5709h;

    /* renamed from: i, reason: collision with root package name */
    public final d f5710i;

    final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i11) {
            return new p[i11];
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f5711a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f5712b;

        /* renamed from: c, reason: collision with root package name */
        private String f5713c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f5714d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f5715e;

        /* renamed from: f, reason: collision with root package name */
        private String f5716f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f5717g;

        public b(Uri uri, String str) {
            this.f5711a = str;
            this.f5712b = uri;
        }

        public final p a() {
            String str = this.f5713c;
            List list = this.f5714d;
            if (list == null) {
                list = AbstractC5880y.v();
            }
            return new p(this.f5711a, this.f5712b, str, list, this.f5715e, this.f5716f, this.f5717g);
        }

        public final void b(String str) {
            this.f5716f = str;
        }

        public final void c(byte[] bArr) {
            this.f5717g = bArr;
        }

        public final void d(byte[] bArr) {
            this.f5715e = bArr;
        }

        public final void e(String str) {
            this.f5713c = j3.u.m(str);
        }

        public final void f(ArrayList arrayList) {
            this.f5714d = arrayList;
        }
    }

    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final long f5718a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5719b;

        final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        c(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            G10.a.c(readLong >= 0);
            G10.a.c(readLong2 >= 0 || readLong2 == -1);
            this.f5718a = readLong;
            this.f5719b = readLong2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5718a == cVar.f5718a && this.f5719b == cVar.f5719b;
        }

        public final int hashCode() {
            return (((int) this.f5718a) * 961) + ((int) this.f5719b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f5718a);
            parcel.writeLong(this.f5719b);
        }
    }

    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final long f5720a;

        /* renamed from: b, reason: collision with root package name */
        public final long f5721b;

        final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        d(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            G10.a.c(readLong2 >= 0 || readLong2 == -9223372036854775807L);
            this.f5720a = readLong;
            this.f5721b = readLong2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f5720a == dVar.f5720a && this.f5721b == dVar.f5721b;
        }

        public final int hashCode() {
            return (((int) this.f5720a) * 961) + ((int) this.f5721b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f5720a);
            parcel.writeLong(this.f5721b);
        }
    }

    /* synthetic */ p(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        this(str, uri, str2, list, bArr, str3, bArr2, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final p a(p pVar) {
        List list;
        G10.a.c(this.f5702a.equals(pVar.f5702a));
        List<C7251G> list2 = this.f5705d;
        if (!list2.isEmpty()) {
            List<C7251G> list3 = pVar.f5705d;
            if (!list3.isEmpty()) {
                list = new ArrayList(list2);
                for (int i11 = 0; i11 < list3.size(); i11++) {
                    C7251G c7251g = list3.get(i11);
                    if (!list.contains(c7251g)) {
                        list.add(c7251g);
                    }
                }
                return new p(this.f5702a, pVar.f5703b, pVar.f5704c, list, pVar.f5706e, pVar.f5707f, pVar.f5708g, pVar.f5709h, pVar.f5710i);
            }
        }
        list = Collections.EMPTY_LIST;
        return new p(this.f5702a, pVar.f5703b, pVar.f5704c, list, pVar.f5706e, pVar.f5707f, pVar.f5708g, pVar.f5709h, pVar.f5710i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f5702a.equals(pVar.f5702a) && this.f5703b.equals(pVar.f5703b) && Objects.equals(this.f5704c, pVar.f5704c) && this.f5705d.equals(pVar.f5705d) && Arrays.equals(this.f5706e, pVar.f5706e) && Objects.equals(this.f5707f, pVar.f5707f) && Arrays.equals(this.f5708g, pVar.f5708g) && Objects.equals(this.f5709h, pVar.f5709h) && Objects.equals(this.f5710i, pVar.f5710i);
    }

    public final int hashCode() {
        int hashCode = (this.f5703b.hashCode() + (this.f5702a.hashCode() * 961)) * 31;
        String str = this.f5704c;
        int hashCode2 = (Arrays.hashCode(this.f5706e) + ((this.f5705d.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f5707f;
        int hashCode3 = (Arrays.hashCode(this.f5708g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        c cVar = this.f5709h;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f5710i;
        return hashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return this.f5704c + ProductContainerDTO.RATIO_DELIMITER + this.f5702a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f5702a);
        parcel.writeString(this.f5703b.toString());
        parcel.writeString(this.f5704c);
        List<C7251G> list = this.f5705d;
        parcel.writeInt(list.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            parcel.writeParcelable(list.get(i12), 0);
        }
        parcel.writeByteArray(this.f5706e);
        parcel.writeString(this.f5707f);
        parcel.writeByteArray(this.f5708g);
        parcel.writeParcelable(this.f5709h, 0);
        parcel.writeParcelable(this.f5710i, 0);
    }

    private p(String str, Uri uri, String str2, List<C7251G> list, byte[] bArr, String str3, byte[] bArr2, c cVar, d dVar) {
        int J11 = N.J(uri, str2);
        if (J11 == 0 || J11 == 2 || J11 == 1) {
            G10.a.b("customCacheKey must be null for type: " + J11, str3 == null);
            this.f5709h = null;
            this.f5710i = dVar;
        } else {
            this.f5709h = cVar;
            this.f5710i = null;
        }
        this.f5702a = str;
        this.f5703b = uri;
        this.f5704c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f5705d = Collections.unmodifiableList(arrayList);
        this.f5706e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f5707f = str3;
        this.f5708g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : N.f74291c;
    }

    p(Parcel parcel) {
        String readString = parcel.readString();
        int i11 = N.f74289a;
        this.f5702a = readString;
        this.f5703b = Uri.parse(parcel.readString());
        this.f5704c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i12 = 0; i12 < readInt; i12++) {
            arrayList.add((C7251G) parcel.readParcelable(C7251G.class.getClassLoader()));
        }
        this.f5705d = Collections.unmodifiableList(arrayList);
        this.f5706e = parcel.createByteArray();
        this.f5707f = parcel.readString();
        this.f5708g = parcel.createByteArray();
        this.f5709h = (c) parcel.readParcelable(c.class.getClassLoader());
        this.f5710i = (d) parcel.readParcelable(d.class.getClassLoader());
    }
}
