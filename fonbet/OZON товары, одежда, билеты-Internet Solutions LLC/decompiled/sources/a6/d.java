package a6;

import T5.i;
import Z5.p;
import Z5.q;
import Z5.t;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* loaded from: classes8.dex */
public final class d<DataT> implements p<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36365a;

    /* renamed from: b, reason: collision with root package name */
    private final p<File, DataT> f36366b;

    /* renamed from: c, reason: collision with root package name */
    private final p<Uri, DataT> f36367c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f36368d;

    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements q<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36369a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f36370b;

        a(Context context, Class<DataT> cls) {
            this.f36369a = context;
            this.f36370b = cls;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, DataT> build(@NonNull t tVar) {
            Class<DataT> cls = this.f36370b;
            return new d(this.f36369a, tVar.c(File.class, cls), tVar.c(Uri.class, cls), cls);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: a6.d$d, reason: collision with other inner class name */
    private static final class C0698d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f36371k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f36372a;

        /* renamed from: b, reason: collision with root package name */
        private final p<File, DataT> f36373b;

        /* renamed from: c, reason: collision with root package name */
        private final p<Uri, DataT> f36374c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f36375d;

        /* renamed from: e, reason: collision with root package name */
        private final int f36376e;

        /* renamed from: f, reason: collision with root package name */
        private final int f36377f;

        /* renamed from: g, reason: collision with root package name */
        private final i f36378g;

        /* renamed from: h, reason: collision with root package name */
        private final Class<DataT> f36379h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f36380i;

        /* renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f36381j;

        C0698d(Context context, p<File, DataT> pVar, p<Uri, DataT> pVar2, Uri uri, int i11, int i12, i iVar, Class<DataT> cls) {
            this.f36372a = context.getApplicationContext();
            this.f36373b = pVar;
            this.f36374c = pVar2;
            this.f36375d = uri;
            this.f36376e = i11;
            this.f36377f = i12;
            this.f36378g = iVar;
            this.f36379h = cls;
        }

        private com.bumptech.glide.load.data.d<DataT> a() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            p.a<DataT> buildLoadData;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f36372a;
            i iVar = this.f36378g;
            int i11 = this.f36377f;
            int i12 = this.f36376e;
            if (isExternalStorageLegacy) {
                Uri uri = this.f36375d;
                try {
                    Cursor query = context.getContentResolver().query(uri, f36371k, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                buildLoadData = this.f36373b.buildLoadData(file, i12, i11, iVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri uri2 = this.f36375d;
                boolean h11 = F2.c.h(uri2);
                p<Uri, DataT> pVar = this.f36374c;
                if (h11 && uri2.getPathSegments().contains(FormPageDTO.Field.FIELD_TYPE_PICKER)) {
                    buildLoadData = pVar.buildLoadData(uri2, i12, i11, iVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri2 = MediaStore.setRequireOriginal(uri2);
                    }
                    buildLoadData = pVar.buildLoadData(uri2, i12, i11, iVar);
                }
            }
            if (buildLoadData != null) {
                return buildLoadData.f35544c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f36380i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f36381j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f36381j;
            if (dVar != null) {
                dVar.cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<DataT> getDataClass() {
            return this.f36379h;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final T5.a getDataSource() {
            return T5.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void loadData(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> a11 = a();
                if (a11 == null) {
                    aVar.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f36375d));
                } else {
                    this.f36381j = a11;
                    if (this.f36380i) {
                        cancel();
                    } else {
                        a11.loadData(iVar, aVar);
                    }
                }
            } catch (FileNotFoundException e11) {
                aVar.onLoadFailed(e11);
            }
        }
    }

    d(Context context, p<File, DataT> pVar, p<Uri, DataT> pVar2, Class<DataT> cls) {
        this.f36365a = context.getApplicationContext();
        this.f36366b = pVar;
        this.f36367c = pVar2;
        this.f36368d = cls;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull i iVar) {
        Uri uri2 = uri;
        return new p.a(new o6.d(uri2), new C0698d(this.f36365a, this.f36366b, this.f36367c, uri2, i11, i12, iVar, this.f36368d));
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && F2.c.h(uri);
    }
}
