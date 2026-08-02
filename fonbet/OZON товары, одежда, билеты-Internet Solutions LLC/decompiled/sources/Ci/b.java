package Ci;

import B0.C2454a;
import C.o0;
import Di.C2872a;
import Kk.C3532b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f5068a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5069b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5070c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5071d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Context, RecyclerView.o> f5072e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<Context, List<RecyclerView.n>> f5073f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<Integer, C2872a> f5074g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5075h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final h f5076i;

    /* renamed from: j, reason: collision with root package name */
    private final String f5077j;

    /* renamed from: k, reason: collision with root package name */
    private final String f5078k;

    public static final class a implements Parcelable.Creator<b> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            int i11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g createFromParcel = g.CREATOR.createFromParcel(parcel);
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                i11 = 0;
                z11 = true;
            } else {
                i11 = 0;
            }
            boolean z12 = parcel.readInt() != 0 ? 1 : i11;
            boolean z13 = parcel.readInt() != 0 ? 1 : i11;
            Function1 function1 = (Function1) parcel.readSerializable();
            Function1 function12 = (Function1) parcel.readSerializable();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (true) {
                int readInt2 = parcel.readInt();
                if (i11 == readInt) {
                    return new b(createFromParcel, z11, z12, z13, function1, function12, linkedHashMap, readInt2, h.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                }
                linkedHashMap.put(Integer.valueOf(readInt2), C2872a.CREATOR.createFromParcel(parcel));
                i11++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull g itemInteractions, boolean z11, boolean z12, boolean z13, @NotNull Function1<? super Context, ? extends RecyclerView.o> layoutManagerProducer, @NotNull Function1<? super Context, ? extends List<? extends RecyclerView.n>> itemDecorationsProducer, @NotNull Map<Integer, C2872a> viewTypeAspectRatioMap, int i11, @NotNull h paginationConfig, String str, String str2) {
        Intrinsics.checkNotNullParameter(itemInteractions, "itemInteractions");
        Intrinsics.checkNotNullParameter(layoutManagerProducer, "layoutManagerProducer");
        Intrinsics.checkNotNullParameter(itemDecorationsProducer, "itemDecorationsProducer");
        Intrinsics.checkNotNullParameter(viewTypeAspectRatioMap, "viewTypeAspectRatioMap");
        Intrinsics.checkNotNullParameter(paginationConfig, "paginationConfig");
        this.f5068a = itemInteractions;
        this.f5069b = z11;
        this.f5070c = z12;
        this.f5071d = z13;
        this.f5072e = layoutManagerProducer;
        this.f5073f = itemDecorationsProducer;
        this.f5074g = viewTypeAspectRatioMap;
        this.f5075h = i11;
        this.f5076i = paginationConfig;
        this.f5077j = str;
        this.f5078k = str2;
    }

    public static b a(b bVar, g gVar, Map map, int i11, int i12) {
        g itemInteractions = (i12 & 1) != 0 ? bVar.f5068a : gVar;
        boolean z11 = (i12 & 2) != 0 ? bVar.f5069b : true;
        boolean z12 = bVar.f5070c;
        boolean z13 = (i12 & 8) != 0 ? bVar.f5071d : false;
        Function1<Context, RecyclerView.o> layoutManagerProducer = bVar.f5072e;
        Function1<Context, List<RecyclerView.n>> itemDecorationsProducer = bVar.f5073f;
        Map viewTypeAspectRatioMap = (i12 & 64) != 0 ? bVar.f5074g : map;
        int i13 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? bVar.f5075h : i11;
        h paginationConfig = bVar.f5076i;
        String str = bVar.f5077j;
        String str2 = bVar.f5078k;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(itemInteractions, "itemInteractions");
        Intrinsics.checkNotNullParameter(layoutManagerProducer, "layoutManagerProducer");
        Intrinsics.checkNotNullParameter(itemDecorationsProducer, "itemDecorationsProducer");
        Intrinsics.checkNotNullParameter(viewTypeAspectRatioMap, "viewTypeAspectRatioMap");
        Intrinsics.checkNotNullParameter(paginationConfig, "paginationConfig");
        return new b(itemInteractions, z11, z12, z13, layoutManagerProducer, itemDecorationsProducer, viewTypeAspectRatioMap, i13, paginationConfig, str, str2);
    }

    public final String b() {
        return this.f5077j;
    }

    public final boolean c() {
        return this.f5069b;
    }

    public final boolean d() {
        return this.f5070c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final Function1<Context, List<RecyclerView.n>> e() {
        return this.f5073f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f5068a, bVar.f5068a) && this.f5069b == bVar.f5069b && this.f5070c == bVar.f5070c && this.f5071d == bVar.f5071d && Intrinsics.d(this.f5072e, bVar.f5072e) && Intrinsics.d(this.f5073f, bVar.f5073f) && Intrinsics.d(this.f5074g, bVar.f5074g) && this.f5075h == bVar.f5075h && Intrinsics.d(this.f5076i, bVar.f5076i) && Intrinsics.d(this.f5077j, bVar.f5077j) && Intrinsics.d(this.f5078k, bVar.f5078k);
    }

    @NotNull
    public final g f() {
        return this.f5068a;
    }

    @NotNull
    public final Function1<Context, RecyclerView.o> g() {
        return this.f5072e;
    }

    public final String getTitle() {
        return this.f5078k;
    }

    public final int h() {
        return this.f5075h;
    }

    public final int hashCode() {
        int hashCode = (this.f5076i.hashCode() + C2454a.a(this.f5075h, D40.c.a(this.f5074g, (this.f5073f.hashCode() + ((this.f5072e.hashCode() + C3532b.a(C3532b.a(C3532b.a(this.f5068a.hashCode() * 31, 31, this.f5069b), 31, this.f5070c), 31, this.f5071d)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f5077j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5078k;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final h i() {
        return this.f5076i;
    }

    @NotNull
    public final Map<Integer, C2872a> j() {
        return this.f5074g;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryMediaListConfig(itemInteractions=");
        sb2.append(this.f5068a);
        sb2.append(", enableCameraPreview=");
        sb2.append(this.f5069b);
        sb2.append(", forceCameraPreview=");
        sb2.append(this.f5070c);
        sb2.append(", enableOptionalVideoOnlyFilter=");
        sb2.append(this.f5071d);
        sb2.append(", layoutManagerProducer=");
        sb2.append(this.f5072e);
        sb2.append(", itemDecorationsProducer=");
        sb2.append(this.f5073f);
        sb2.append(", viewTypeAspectRatioMap=");
        sb2.append(this.f5074g);
        sb2.append(", maxSelectedMediaCount=");
        sb2.append(this.f5075h);
        sb2.append(", paginationConfig=");
        sb2.append(this.f5076i);
        sb2.append(", dirName=");
        sb2.append(this.f5077j);
        sb2.append(", title=");
        return o0.c(sb2, this.f5078k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f5068a.writeToParcel(dest, i11);
        dest.writeInt(this.f5069b ? 1 : 0);
        dest.writeInt(this.f5070c ? 1 : 0);
        dest.writeInt(this.f5071d ? 1 : 0);
        dest.writeSerializable((Serializable) this.f5072e);
        dest.writeSerializable((Serializable) this.f5073f);
        Map<Integer, C2872a> map = this.f5074g;
        dest.writeInt(map.size());
        for (Map.Entry<Integer, C2872a> entry : map.entrySet()) {
            dest.writeInt(entry.getKey().intValue());
            entry.getValue().writeToParcel(dest, i11);
        }
        dest.writeInt(this.f5075h);
        this.f5076i.writeToParcel(dest, i11);
        dest.writeString(this.f5077j);
        dest.writeString(this.f5078k);
    }
}
