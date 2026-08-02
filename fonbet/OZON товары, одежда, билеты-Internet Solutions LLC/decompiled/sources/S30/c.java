package S30;

import Je.d;
import Je.e;
import S30.a;
import Sc.s;
import a5.C4946d;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f25762a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f25763b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f25764c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f25765d;

    public c(@NotNull SharedPreferences sharedPreferences, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f25762a = sharedPreferences;
        this.f25763b = application;
        this.f25764c = e.a();
    }

    @Override // S30.a
    @NotNull
    public final a.C0512a a() {
        String str;
        List m11;
        String str2 = null;
        try {
            PackageInfo a11 = C4946d.a(this.f25763b);
            str = a11 != null ? a11.versionName : null;
            if (str != null) {
                try {
                    m11 = h.m(str, new String[]{"."}, 0, 6);
                } catch (Exception unused) {
                    L80.a.a("ApplicationInfoDataSourceImpl", "Cant get webview version");
                    return new a.C0512a(str2, str);
                }
            } else {
                m11 = null;
            }
            if ((m11 != null ? m11.size() : 0) > 0 && m11 != null) {
                str2 = (String) m11.get(0);
            }
        } catch (Exception unused2) {
            str = null;
        }
        return new a.C0512a(str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // S30.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        c cVar2;
        d dVar;
        String str;
        String str2 = "";
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i12 = bVar.f25761h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f25761h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f25759f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f25761h;
                    if (i11 != 0) {
                        s.b(obj);
                        String str3 = this.f25765d;
                        if (str3 != null) {
                            return str3;
                        }
                        d dVar2 = this.f25764c;
                        bVar.f25757d = this;
                        bVar.f25758e = dVar2;
                        bVar.f25761h = 1;
                        if (dVar2.a(bVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = this;
                        dVar = dVar2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = bVar.f25758e;
                        cVar2 = bVar.f25757d;
                        s.b(obj);
                    }
                    str = cVar2.f25765d;
                    if (str == null) {
                        try {
                            String id2 = AdvertisingIdClient.getAdvertisingIdInfo(cVar2.f25763b).getId();
                            if (id2 != null) {
                                str2 = id2;
                            }
                        } catch (Exception e11) {
                            L80.a.b("ApplicationInfoDataSourceImpl", "Failed to get advertising id, " + e11);
                        }
                        cVar2.f25765d = str2;
                        str = str2;
                    }
                    return str;
                }
            }
            str = cVar2.f25765d;
            if (str == null) {
            }
            return str;
        } finally {
            dVar.c(null);
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f25759f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f25761h;
        if (i11 != 0) {
        }
    }

    @Override // S30.a
    @NotNull
    public final String c() {
        String language = this.f25763b.getResources().getConfiguration().getLocales().get(0).getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    @Override // S30.a
    @NotNull
    public final String getUniqueApplicationId() {
        SharedPreferences sharedPreferences = this.f25762a;
        String string = sharedPreferences.getString("FINTECH_APPLICATION_ID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("FINTECH_APPLICATION_ID", uuid).commit();
        return uuid;
    }
}
