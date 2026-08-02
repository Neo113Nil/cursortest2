package Z5;

import Z5.p;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class v<DataT> implements p<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35572a;

    /* renamed from: b, reason: collision with root package name */
    private final p<Integer, DataT> f35573b;

    private static final class a implements q<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35574a;

        a(Context context) {
            this.f35574a = context;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, AssetFileDescriptor> build(@NonNull t tVar) {
            return new v(this.f35574a, tVar.c(Integer.class, AssetFileDescriptor.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    private static final class b implements q<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35575a;

        b(Context context) {
            this.f35575a = context;
        }

        @Override // Z5.q
        @NonNull
        public final p<Uri, InputStream> build(@NonNull t tVar) {
            return new v(this.f35575a, tVar.c(Integer.class, InputStream.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    v(Context context, p<Integer, DataT> pVar) {
        this.f35572a = context.getApplicationContext();
        this.f35573b = pVar;
    }

    public static q<Uri, AssetFileDescriptor> a(Context context) {
        return new a(context);
    }

    public static q<Uri, InputStream> b(Context context) {
        return new b(context);
    }

    @Override // Z5.p
    public final p.a buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull T5.i iVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        p<Integer, DataT> pVar = this.f35573b;
        if (size == 1) {
            try {
                int parseInt = Integer.parseInt(uri2.getPathSegments().get(0));
                if (parseInt != 0) {
                    return pVar.buildLoadData(Integer.valueOf(parseInt), i11, i12, iVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e11) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e11);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f35572a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return pVar.buildLoadData(Integer.valueOf(identifier), i11, i12, iVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }

    @Override // Z5.p
    public final boolean handles(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f35572a.getPackageName().equals(uri2.getAuthority());
    }
}
