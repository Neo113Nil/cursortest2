package Ci;

import B0.C2454a;
import Sc.InterfaceC3999a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import fd.InterfaceC6512o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import xi.C10779a;

/* loaded from: classes6.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f5101a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5102b;

    /* renamed from: c, reason: collision with root package name */
    private final Hi.h f5103c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f5104d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Integer> f5105e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<GalleryActivity, Unit> f5106f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> f5107g;

    /* renamed from: h, reason: collision with root package name */
    private final Hi.i f5108h;

    /* renamed from: i, reason: collision with root package name */
    private final C10779a f5109i;

    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Hi.h hVar = (Hi.h) parcel.readParcelable(k.class.getClassLoader());
            b createFromParcel = b.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i11 = 0;
            while (i11 != readInt3) {
                i11 = Sh.a.a(parcel, arrayList, i11, 1);
            }
            return new k(readInt, readInt2, hVar, createFromParcel, arrayList, (Function1) parcel.readSerializable(), (InterfaceC6512o) parcel.readSerializable(), parcel.readInt() == 0 ? null : Hi.i.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? C10779a.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i11) {
            return new k[i11];
        }
    }

    @InterfaceC3999a
    public k() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(int i11, int i12, Hi.h hVar, @NotNull b mediaListConfig, @NotNull List<Integer> selectedIds, @NotNull Function1<? super GalleryActivity, Unit> onBackNavigationClick, @NotNull InterfaceC6512o<? super GalleryActivity, ? super Integer, ? super Integer, ? super Intent, Unit> onActivityResult, Hi.i iVar, C10779a c10779a) {
        Intrinsics.checkNotNullParameter(mediaListConfig, "mediaListConfig");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(onBackNavigationClick, "onBackNavigationClick");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        this.f5101a = i11;
        this.f5102b = i12;
        this.f5103c = hVar;
        this.f5104d = mediaListConfig;
        this.f5105e = selectedIds;
        this.f5106f = onBackNavigationClick;
        this.f5107g = onActivityResult;
        this.f5108h = iVar;
        this.f5109i = c10779a;
    }

    public static k a(k kVar, int i11, Hi.h hVar, b bVar, List list, InterfaceC6512o interfaceC6512o, int i12) {
        if ((i12 & 1) != 0) {
            i11 = kVar.f5101a;
        }
        int i13 = i11;
        int i14 = (i12 & 2) != 0 ? kVar.f5102b : -1;
        if ((i12 & 4) != 0) {
            hVar = kVar.f5103c;
        }
        Hi.h hVar2 = hVar;
        if ((i12 & 8) != 0) {
            bVar = kVar.f5104d;
        }
        b mediaListConfig = bVar;
        if ((i12 & 16) != 0) {
            list = kVar.f5105e;
        }
        List selectedIds = list;
        Function1<GalleryActivity, Unit> onBackNavigationClick = kVar.f5106f;
        InterfaceC6512o onActivityResult = (i12 & 64) != 0 ? kVar.f5107g : interfaceC6512o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(mediaListConfig, "mediaListConfig");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(onBackNavigationClick, "onBackNavigationClick");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        return new k(i13, i14, hVar2, mediaListConfig, selectedIds, onBackNavigationClick, onActivityResult, kVar.f5108h, kVar.f5109i);
    }

    public static k b(k kVar, int i11, Hi.h hVar, b bVar, C10779a c10779a, int i12) {
        if ((i12 & 1) != 0) {
            i11 = kVar.f5101a;
        }
        int i13 = i11;
        int i14 = kVar.f5102b;
        if ((i12 & 8) != 0) {
            bVar = kVar.f5104d;
        }
        b mediaListConfig = bVar;
        List<Integer> selectedIds = kVar.f5105e;
        Function1<GalleryActivity, Unit> onBackNavigationClick = kVar.f5106f;
        InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> onActivityResult = kVar.f5107g;
        Hi.i iVar = kVar.f5108h;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(mediaListConfig, "mediaListConfig");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(onBackNavigationClick, "onBackNavigationClick");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        return new k(i13, i14, hVar, mediaListConfig, selectedIds, onBackNavigationClick, onActivityResult, iVar, c10779a);
    }

    public final Hi.h c() {
        return this.f5103c;
    }

    @NotNull
    public final b d() {
        return this.f5104d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> e() {
        return this.f5107g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5101a == kVar.f5101a && this.f5102b == kVar.f5102b && Intrinsics.d(this.f5103c, kVar.f5103c) && Intrinsics.d(this.f5104d, kVar.f5104d) && Intrinsics.d(this.f5105e, kVar.f5105e) && Intrinsics.d(this.f5106f, kVar.f5106f) && Intrinsics.d(this.f5107g, kVar.f5107g) && Intrinsics.d(this.f5108h, kVar.f5108h) && Intrinsics.d(this.f5109i, kVar.f5109i);
    }

    @NotNull
    public final Function1<GalleryActivity, Unit> f() {
        return this.f5106f;
    }

    public final C10779a g() {
        return this.f5109i;
    }

    public final Hi.i h() {
        return this.f5108h;
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f5102b, Integer.hashCode(this.f5101a) * 31, 31);
        Hi.h hVar = this.f5103c;
        int hashCode = (this.f5107g.hashCode() + ((this.f5106f.hashCode() + G.g.b((this.f5104d.hashCode() + ((a11 + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31, 31, this.f5105e)) * 31)) * 31;
        Hi.i iVar = this.f5108h;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C10779a c10779a = this.f5109i;
        return hashCode2 + (c10779a != null ? c10779a.hashCode() : 0);
    }

    public final int i() {
        return this.f5102b;
    }

    public final int j() {
        return this.f5101a;
    }

    public final boolean k() {
        return this.f5104d.h() == 1;
    }

    @NotNull
    public final String toString() {
        return "GalleryPageConfig(themeId=" + this.f5101a + ", resultCode=" + this.f5102b + ", globalMediaFilter=" + this.f5103c + ", mediaListConfig=" + this.f5104d + ", selectedIds=" + this.f5105e + ", onBackNavigationClick=" + this.f5106f + ", onActivityResult=" + this.f5107g + ", restorableState=" + this.f5108h + ", ozonCameraConfig=" + this.f5109i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f5101a);
        dest.writeInt(this.f5102b);
        dest.writeParcelable(this.f5103c, i11);
        this.f5104d.writeToParcel(dest, i11);
        Iterator c11 = Bi.a.c(this.f5105e, dest);
        while (c11.hasNext()) {
            dest.writeInt(((Number) c11.next()).intValue());
        }
        dest.writeSerializable((Serializable) this.f5106f);
        dest.writeSerializable((Serializable) this.f5107g);
        Hi.i iVar = this.f5108h;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iVar.writeToParcel(dest, i11);
        }
        C10779a c10779a = this.f5109i;
        if (c10779a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c10779a.writeToParcel(dest, i11);
        }
    }
}
