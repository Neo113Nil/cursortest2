package Ci;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes6.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new d();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Function2<GalleryActivity, Hi.k, Unit> f5083g = a.f5092b;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Function2<GalleryActivity, Hi.k, Boolean> f5084h = b.f5093b;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Function1<Hi.f, Unit> f5085i = c.f5094b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<GalleryActivity, Hi.k, Unit> f5086a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<GalleryActivity, Hi.k, Boolean> f5087b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<GalleryActivity, Unit> f5088c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<GalleryActivity, Boolean> f5089d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Hi.f, Unit> f5090e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l f5091f;

    static final class a extends AbstractC7737t implements Function2<GalleryActivity, Hi.k, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5092b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(GalleryActivity galleryActivity, Hi.k kVar) {
            Intrinsics.checkNotNullParameter(galleryActivity, "<unused var>");
            Intrinsics.checkNotNullParameter(kVar, "<unused var>");
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<GalleryActivity, Hi.k, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5093b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(GalleryActivity galleryActivity, Hi.k kVar) {
            Intrinsics.checkNotNullParameter(galleryActivity, "<unused var>");
            Intrinsics.checkNotNullParameter(kVar, "<unused var>");
            return Boolean.TRUE;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Hi.f, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5094b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Hi.f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<unused var>");
            return Unit.f71690a;
        }
    }

    public static final class d implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new g((Function2) parcel.readSerializable(), (Function2) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i11) {
            return new g[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Function2<? super GalleryActivity, ? super Hi.k, Unit> onMediaClick, @NotNull Function2<? super GalleryActivity, ? super Hi.k, Boolean> onMediaLongClick, @NotNull Function1<? super GalleryActivity, Unit> onCameraPreviewClick, @NotNull Function1<? super GalleryActivity, Boolean> onCameraPreviewLongClick, @NotNull Function1<? super Hi.f, Unit> onResult, @NotNull l resultMode) {
        Intrinsics.checkNotNullParameter(onMediaClick, "onMediaClick");
        Intrinsics.checkNotNullParameter(onMediaLongClick, "onMediaLongClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewClick, "onCameraPreviewClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewLongClick, "onCameraPreviewLongClick");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(resultMode, "resultMode");
        this.f5086a = onMediaClick;
        this.f5087b = onMediaLongClick;
        this.f5088c = onCameraPreviewClick;
        this.f5089d = onCameraPreviewLongClick;
        this.f5090e = onResult;
        this.f5091f = resultMode;
    }

    public static g a(g gVar, Function1 function1, Function1 function12, l resultMode, int i11) {
        Function2<GalleryActivity, Hi.k, Unit> onMediaClick = gVar.f5086a;
        Function2<GalleryActivity, Hi.k, Boolean> onMediaLongClick = gVar.f5087b;
        if ((i11 & 4) != 0) {
            function1 = gVar.f5088c;
        }
        Function1 onCameraPreviewClick = function1;
        if ((i11 & 8) != 0) {
            function12 = gVar.f5089d;
        }
        Function1 onCameraPreviewLongClick = function12;
        Function1<Hi.f, Unit> onResult = gVar.f5090e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(onMediaClick, "onMediaClick");
        Intrinsics.checkNotNullParameter(onMediaLongClick, "onMediaLongClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewClick, "onCameraPreviewClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewLongClick, "onCameraPreviewLongClick");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Intrinsics.checkNotNullParameter(resultMode, "resultMode");
        return new g(onMediaClick, onMediaLongClick, onCameraPreviewClick, onCameraPreviewLongClick, onResult, resultMode);
    }

    @NotNull
    public final Function1<GalleryActivity, Unit> b() {
        return this.f5088c;
    }

    @NotNull
    public final Function1<GalleryActivity, Boolean> c() {
        return this.f5089d;
    }

    @NotNull
    public final Function2<GalleryActivity, Hi.k, Unit> d() {
        return this.f5086a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final Function2<GalleryActivity, Hi.k, Boolean> e() {
        return this.f5087b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f5086a, gVar.f5086a) && Intrinsics.d(this.f5087b, gVar.f5087b) && Intrinsics.d(this.f5088c, gVar.f5088c) && Intrinsics.d(this.f5089d, gVar.f5089d) && Intrinsics.d(this.f5090e, gVar.f5090e) && this.f5091f == gVar.f5091f;
    }

    @NotNull
    public final Function1<Hi.f, Unit> f() {
        return this.f5090e;
    }

    @NotNull
    public final l g() {
        return this.f5091f;
    }

    public final int hashCode() {
        return this.f5091f.hashCode() + ((this.f5090e.hashCode() + ((this.f5089d.hashCode() + ((this.f5088c.hashCode() + ((this.f5087b.hashCode() + (this.f5086a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "GalleryMediaListItemInteractionDelegate(onMediaClick=" + this.f5086a + ", onMediaLongClick=" + this.f5087b + ", onCameraPreviewClick=" + this.f5088c + ", onCameraPreviewLongClick=" + this.f5089d + ", onResult=" + this.f5090e + ", resultMode=" + this.f5091f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable((Serializable) this.f5086a);
        dest.writeSerializable((Serializable) this.f5087b);
        dest.writeSerializable((Serializable) this.f5088c);
        dest.writeSerializable((Serializable) this.f5089d);
        dest.writeSerializable((Serializable) this.f5090e);
        dest.writeString(this.f5091f.name());
    }

    public g() {
        this(f5083g, f5084h, Ci.c.f5079b, Ci.d.f5080b, f5085i, l.LEGACY_ON_CLICK_CALLBACK);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Function2 function2, Function1 function1, Function1 function12, int i11) {
        this(onMediaClick, onMediaLongClick, onCameraPreviewClick, onCameraPreviewLongClick, f5085i, l.LEGACY_ON_CLICK_CALLBACK);
        Function2 onMediaClick = (i11 & 1) != 0 ? f5083g : function2;
        Function2<GalleryActivity, Hi.k, Boolean> onMediaLongClick = f5084h;
        Function1 onCameraPreviewClick = (i11 & 4) != 0 ? e.f5081b : function1;
        Function1 onCameraPreviewLongClick = (i11 & 8) != 0 ? f.f5082b : function12;
        Intrinsics.checkNotNullParameter(onMediaClick, "onMediaClick");
        Intrinsics.checkNotNullParameter(onMediaLongClick, "onMediaLongClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewClick, "onCameraPreviewClick");
        Intrinsics.checkNotNullParameter(onCameraPreviewLongClick, "onCameraPreviewLongClick");
    }
}
