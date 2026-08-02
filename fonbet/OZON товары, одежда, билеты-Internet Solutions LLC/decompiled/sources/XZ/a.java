package XZ;

import WZ.k;
import WZ.s;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f34215a;

    public a(@NotNull Sg.a analyticsScreenStorage, @NotNull Set<YZ.a> supportedTypes) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        this.f34215a = new c(analyticsScreenStorage, supportedTypes);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UZ.d a(@NotNull String eventType, @NotNull s tokenizedData, @NotNull k payloads) {
        String str;
        Map<String, String> h11;
        String i11;
        String str2;
        String f7;
        String str3;
        Long e11;
        Long l11;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tokenizedData, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        f a11 = this.f34215a.a(eventType, tokenizedData);
        if (a11 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(tokenizedData, "tokenizedData");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        String k11 = tokenizedData.k();
        if (k11 == null) {
            RZ.c d11 = payloads.d(tokenizedData.j());
            if (d11 == null) {
                str = null;
                h11 = tokenizedData.h();
                if ((h11 != null || (r0 = h11.get(tokenizedData.b())) == null) && (r0 = payloads.f(tokenizedData.j(), tokenizedData.b())) == null) {
                    String f11 = tokenizedData.b();
                }
                String str4 = f11;
                RZ.b e12 = payloads.e(tokenizedData.j());
                i11 = tokenizedData.i();
                if (i11 == null) {
                    if (e12 == null) {
                        str2 = null;
                        f7 = tokenizedData.f();
                        if (f7 == null) {
                            if (e12 == null) {
                                str3 = null;
                                e11 = tokenizedData.e();
                                if (e11 != null) {
                                    l11 = e12 != null ? Long.valueOf(e12.a()) : null;
                                } else {
                                    l11 = e11;
                                }
                                return a11.a(new d(tokenizedData.a(), tokenizedData.c(), str, str4, tokenizedData.g(), str2, str3, l11, tokenizedData.d()));
                            }
                            f7 = e12.b();
                        }
                        str3 = f7;
                        e11 = tokenizedData.e();
                        if (e11 != null) {
                        }
                        return a11.a(new d(tokenizedData.a(), tokenizedData.c(), str, str4, tokenizedData.g(), str2, str3, l11, tokenizedData.d()));
                    }
                    i11 = e12.d();
                }
                str2 = i11;
                f7 = tokenizedData.f();
                if (f7 == null) {
                }
                str3 = f7;
                e11 = tokenizedData.e();
                if (e11 != null) {
                }
                return a11.a(new d(tokenizedData.a(), tokenizedData.c(), str, str4, tokenizedData.g(), str2, str3, l11, tokenizedData.d()));
            }
            k11 = d11.a();
        }
        str = k11;
        h11 = tokenizedData.h();
        if (h11 != null) {
        }
        String f112 = tokenizedData.b();
        String str42 = f112;
        RZ.b e122 = payloads.e(tokenizedData.j());
        i11 = tokenizedData.i();
        if (i11 == null) {
        }
        str2 = i11;
        f7 = tokenizedData.f();
        if (f7 == null) {
        }
        str3 = f7;
        e11 = tokenizedData.e();
        if (e11 != null) {
        }
        return a11.a(new d(tokenizedData.a(), tokenizedData.c(), str, str42, tokenizedData.g(), str2, str3, l11, tokenizedData.d()));
    }
}
