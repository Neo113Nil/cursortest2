package Z5;

import Z5.p;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class x<Data> implements p<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final p<Uri, Data> f35577a;

    /* loaded from: classes.dex */
    public static final class a implements q<String, AssetFileDescriptor> {
        @Override // Z5.q
        public final p<String, AssetFileDescriptor> build(@NonNull t tVar) {
            return new x(tVar.c(Uri.class, AssetFileDescriptor.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements q<String, ParcelFileDescriptor> {
        @Override // Z5.q
        @NonNull
        public final p<String, ParcelFileDescriptor> build(@NonNull t tVar) {
            return new x(tVar.c(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    /* loaded from: classes.dex */
    public static class c implements q<String, InputStream> {
        @Override // Z5.q
        @NonNull
        public final p<String, InputStream> build(@NonNull t tVar) {
            return new x(tVar.c(Uri.class, InputStream.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public x(p<Uri, Data> pVar) {
        this.f35577a = pVar;
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull String str, int i11, int i12, @NonNull T5.i iVar) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile != null) {
            p<Uri, Data> pVar = this.f35577a;
            if (pVar.handles(fromFile)) {
                return pVar.buildLoadData(fromFile, i11, i12, iVar);
            }
        }
        return null;
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull String str) {
        return true;
    }
}
