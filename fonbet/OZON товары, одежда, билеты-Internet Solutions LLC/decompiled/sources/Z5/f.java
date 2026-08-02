package Z5;

import Z5.p;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import e6.C6305c;
import e6.C6309g;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f<DataT> implements p<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35506a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35507b;

    private static final class a implements q<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35508a;

        a(Context context) {
            this.f35508a = context;
        }

        @Override // Z5.f.e
        public final void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // Z5.f.e
        public final Object b(Resources resources, int i11, Resources.Theme theme) {
            return resources.openRawResourceFd(i11);
        }

        @Override // Z5.q
        @NonNull
        public final p<Integer, AssetFileDescriptor> build(@NonNull t tVar) {
            return new f(this.f35508a, this);
        }

        @Override // Z5.f.e
        public final Class<AssetFileDescriptor> getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    private static final class b implements q<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35509a;

        b(Context context) {
            this.f35509a = context;
        }

        @Override // Z5.f.e
        public final /* bridge */ /* synthetic */ void a(Drawable drawable) throws IOException {
        }

        @Override // Z5.f.e
        public final Object b(Resources resources, int i11, Resources.Theme theme) {
            return C6305c.a(this.f35509a, i11, theme);
        }

        @Override // Z5.q
        @NonNull
        public final p<Integer, Drawable> build(@NonNull t tVar) {
            return new f(this.f35509a, this);
        }

        @Override // Z5.f.e
        public final Class<Drawable> getDataClass() {
            return Drawable.class;
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    private static final class c implements q<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35510a;

        c(Context context) {
            this.f35510a = context;
        }

        @Override // Z5.f.e
        public final void a(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // Z5.f.e
        public final Object b(Resources resources, int i11, Resources.Theme theme) {
            return resources.openRawResource(i11);
        }

        @Override // Z5.q
        @NonNull
        public final p<Integer, InputStream> build(@NonNull t tVar) {
            return new f(this.f35510a, this);
        }

        @Override // Z5.f.e
        public final Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes8.dex */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f35511a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f35512b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f35513c;

        /* renamed from: d, reason: collision with root package name */
        private final int f35514d;

        /* renamed from: e, reason: collision with root package name */
        private DataT f35515e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i11) {
            this.f35511a = theme;
            this.f35512b = resources;
            this.f35513c = eVar;
            this.f35514d = i11;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Z5.f$e, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            DataT datat = this.f35515e;
            if (datat != null) {
                try {
                    this.f35513c.a(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Z5.f$e, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<DataT> getDataClass() {
            return this.f35513c.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [Z5.f$e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super DataT> aVar) {
            try {
                ?? r42 = (DataT) this.f35513c.b(this.f35512b, this.f35514d, this.f35511a);
                this.f35515e = r42;
                aVar.a(r42);
            } catch (Resources.NotFoundException e11) {
                aVar.onLoadFailed(e11);
            }
        }
    }

    private interface e<DataT> {
        void a(DataT datat) throws IOException;

        Object b(Resources resources, int i11, Resources.Theme theme);

        Class<DataT> getDataClass();
    }

    f(Context context, e<DataT> eVar) {
        this.f35506a = context.getApplicationContext();
        this.f35507b = eVar;
    }

    public static q<Integer, AssetFileDescriptor> a(Context context) {
        return new a(context);
    }

    public static q<Integer, Drawable> b(Context context) {
        return new b(context);
    }

    public static q<Integer, InputStream> c(Context context) {
        return new c(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Z5.f$e, java.lang.Object] */
    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Integer num, int i11, int i12, @NonNull T5.i iVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) iVar.a(C6309g.f62024b);
        return new p.a(new o6.d(num2), new d(theme, theme != null ? theme.getResources() : this.f35506a.getResources(), this.f35507b, num2.intValue()));
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull Integer num) {
        return true;
    }
}
