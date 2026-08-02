package Ce0;

import J4.l;
import J4.s;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.Callable;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.storage.cache.CacheDatabase_Impl;

/* loaded from: classes7.dex */
public final class d implements Ce0.a {

    /* renamed from: a, reason: collision with root package name */
    private final CacheDatabase_Impl f4815a;

    /* renamed from: b, reason: collision with root package name */
    private final l<De0.a> f4816b;

    /* loaded from: classes3.dex */
    final class a implements Callable<De0.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f4817a;

        a(w wVar) {
            this.f4817a = wVar;
        }

        @Override // java.util.concurrent.Callable
        public final De0.a call() throws Exception {
            w wVar;
            int b11;
            int b12;
            int b13;
            int b14;
            int b15;
            int b16;
            int b17;
            int b18;
            int b19;
            int b21;
            int b22;
            int b23;
            int b24;
            int b25;
            GeoProviderConfig.ProviderSuggest providerSuggest;
            GeoProviderConfig.ProviderSuggest providerSuggest2;
            s sVar = d.this.f4815a;
            w wVar2 = this.f4817a;
            Cursor b26 = L4.b.b(sVar, wVar2, false);
            try {
                b11 = L4.a.b(b26, "uniq_id");
                b12 = L4.a.b(b26, AppMeasurementSdk.ConditionalUserProperty.NAME);
                b13 = L4.a.b(b26, "logo");
                b14 = L4.a.b(b26, "logo_mobile");
                b15 = L4.a.b(b26, "max_zoom");
                b16 = L4.a.b(b26, "min_zoom");
                b17 = L4.a.b(b26, "tile_size");
                b18 = L4.a.b(b26, "tile_url");
                b19 = L4.a.b(b26, "key");
                b21 = L4.a.b(b26, "mode");
                b22 = L4.a.b(b26, "suggest_preferred_provider");
                b23 = L4.a.b(b26, "geocode_preferred_provider");
                b24 = L4.a.b(b26, "rev_geocode_preferred_provider");
                b25 = L4.a.b(b26, "allowed_locations");
                wVar = wVar2;
            } catch (Throwable th2) {
                th = th2;
                wVar = wVar2;
            }
            try {
                int b27 = L4.a.b(b26, "copyrights");
                int b28 = L4.a.b(b26, "features");
                int b29 = L4.a.b(b26, "suggest");
                int b31 = L4.a.b(b26, "suggest_provider");
                int b32 = L4.a.b(b26, "locale");
                int b33 = L4.a.b(b26, "sdkType");
                De0.a aVar = null;
                if (b26.moveToFirst()) {
                    int i11 = b26.getInt(b11);
                    String string = b26.isNull(b12) ? null : b26.getString(b12);
                    String string2 = b26.isNull(b13) ? null : b26.getString(b13);
                    String string3 = b26.isNull(b14) ? null : b26.getString(b14);
                    Double valueOf = b26.isNull(b15) ? null : Double.valueOf(b26.getDouble(b15));
                    Double valueOf2 = b26.isNull(b16) ? null : Double.valueOf(b26.getDouble(b16));
                    Integer valueOf3 = b26.isNull(b17) ? null : Integer.valueOf(b26.getInt(b17));
                    String string4 = b26.isNull(b18) ? null : b26.getString(b18);
                    String string5 = b26.isNull(b19) ? null : b26.getString(b19);
                    String string6 = b26.isNull(b21) ? null : b26.getString(b21);
                    String string7 = b26.isNull(b22) ? null : b26.getString(b22);
                    String string8 = b26.isNull(b23) ? null : b26.getString(b23);
                    String string9 = b26.isNull(b24) ? null : b26.getString(b24);
                    String string10 = b26.isNull(b25) ? null : b26.getString(b25);
                    String string11 = b26.isNull(b27) ? null : b26.getString(b27);
                    String string12 = b26.isNull(b28) ? null : b26.getString(b28);
                    String string13 = b26.isNull(b29) ? null : b26.getString(b29);
                    if (string13 == null) {
                        providerSuggest2 = null;
                    } else {
                        try {
                            providerSuggest = GeoProviderConfig.ProviderSuggest.valueOf(string13);
                        } catch (Exception unused) {
                            providerSuggest = null;
                        }
                        providerSuggest2 = providerSuggest;
                    }
                    aVar = new De0.a(i11, string, string2, string3, valueOf, valueOf2, valueOf3, string4, string5, string6, string7, string8, string9, string10, string11, string12, providerSuggest2, b26.isNull(b31) ? null : b26.getString(b31), b26.isNull(b32) ? null : b26.getString(b32), b26.getString(b33));
                }
                b26.close();
                wVar.release();
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                b26.close();
                wVar.release();
                throw th;
            }
        }
    }

    public d(@NonNull CacheDatabase_Impl cacheDatabase_Impl) {
        this.f4815a = cacheDatabase_Impl;
        this.f4816b = new b(cacheDatabase_Impl);
    }

    @Override // Ce0.a
    public final Object a(De0.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        return J4.f.c(this.f4815a, new c(this, aVar), cVar);
    }

    @Override // Ce0.a
    public final Object b(kotlin.coroutines.d<? super De0.a> dVar) {
        w j11 = w.j(0, "SELECT * FROM cached_provider WHERE uniq_id = 1");
        return J4.f.b(this.f4815a, new CancellationSignal(), new a(j11), dVar);
    }
}
